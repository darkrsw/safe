package kr.ac.kaist.jsaf.nodes;

import java.lang.Double;
import java.lang.String;
import java.math.BigInteger;
import java.io.Writer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import kr.ac.kaist.jsaf.nodes_util.*;
import kr.ac.kaist.jsaf.useful.*;
import edu.rice.cs.plt.tuple.Option;

/**
 * Class IRLabelStmt, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Oct 24 17:42:24 CEST 2016
 */
@SuppressWarnings("unused")
public class IRLabelStmt extends IRStmt {
    private final IRId _label;
    private final IRStmt _stmt;

    /**
     * Constructs a IRLabelStmt.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IRLabelStmt(IRSpanInfo in_info, IRId in_label, IRStmt in_stmt) {
        super(in_info);
        if (in_label == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'label' to the IRLabelStmt constructor was null");
        }
        _label = in_label;
        if (in_stmt == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'stmt' to the IRLabelStmt constructor was null");
        }
        _stmt = in_stmt;
    }

    final public IRId getLabel() { return _label; }
    final public IRStmt getStmt() { return _stmt; }

    public <RetType> RetType accept(IRAbstractNodeVisitor<RetType> visitor) {
        return visitor.forIRLabelStmt(this);
    }

    public <RetType> RetType accept(IRNodeVisitor<RetType> visitor) {
        return visitor.forIRLabelStmt(this);
    }

    public void accept(IRAbstractNodeVisitor_void visitor) {
        visitor.forIRLabelStmt(this);
    }

    public void accept(IRNodeVisitor_void visitor) {
        visitor.forIRLabelStmt(this);
    }

    /**
     * Implementation of equals that is based on the values of the fields of the
     * object. Thus, two objects created with identical parameters will be equal.
     */
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if ((obj.getClass() != this.getClass()) || (obj.hashCode() != this.hashCode())) {
            return false;
        }
        else {
            IRLabelStmt casted = (IRLabelStmt) obj;
            IRSpanInfo temp_info = getInfo();
            IRSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            IRId temp_label = getLabel();
            IRId casted_label = casted.getLabel();
            if (!(temp_label == casted_label || temp_label.equals(casted_label))) return false;
            IRStmt temp_stmt = getStmt();
            IRStmt casted_stmt = casted.getStmt();
            if (!(temp_stmt == casted_stmt || temp_stmt.equals(casted_stmt))) return false;
            return true;
        }
    }


    /**
     * Implementation of hashCode that is consistent with equals.  The value of
     * the hashCode is formed by XORing the hashcode of the class object with
     * the hashcodes of all the fields of the object.
     */
    public int generateHashCode() {
        int code = getClass().hashCode();
        IRSpanInfo temp_info = getInfo();
        code ^= temp_info.hashCode();
        IRId temp_label = getLabel();
        code ^= temp_label.hashCode();
        IRStmt temp_stmt = getStmt();
        code ^= temp_stmt.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IRLabelStmt() {
        _label = null;
        _stmt = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "IRLabelStmt", 3)) {
            IRSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            IRId temp_label = getLabel();
            if (w.visitNodeField("label", temp_label)) {
                temp_label.walk(w);
                w.endNodeField("label", temp_label);
            }
            IRStmt temp_stmt = getStmt();
            if (w.visitNodeField("stmt", temp_stmt)) {
                temp_stmt.walk(w);
                w.endNodeField("stmt", temp_stmt);
            }
            w.endNode(this, "IRLabelStmt", 3);
        }
    }

}
