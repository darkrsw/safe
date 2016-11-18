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
 * Class IRBreak, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Wed Nov 09 11:44:32 CET 2016
 */
@SuppressWarnings("unused")
public class IRBreak extends IRStmt {
    private final IRId _label;

    /**
     * Constructs a IRBreak.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IRBreak(IRSpanInfo in_info, IRId in_label) {
        super(in_info);
        if (in_label == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'label' to the IRBreak constructor was null");
        }
        _label = in_label;
    }

    final public IRId getLabel() { return _label; }

    public <RetType> RetType accept(IRAbstractNodeVisitor<RetType> visitor) {
        return visitor.forIRBreak(this);
    }

    public <RetType> RetType accept(IRNodeVisitor<RetType> visitor) {
        return visitor.forIRBreak(this);
    }

    public void accept(IRAbstractNodeVisitor_void visitor) {
        visitor.forIRBreak(this);
    }

    public void accept(IRNodeVisitor_void visitor) {
        visitor.forIRBreak(this);
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
            IRBreak casted = (IRBreak) obj;
            IRSpanInfo temp_info = getInfo();
            IRSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            IRId temp_label = getLabel();
            IRId casted_label = casted.getLabel();
            if (!(temp_label == casted_label || temp_label.equals(casted_label))) return false;
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
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IRBreak() {
        _label = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "IRBreak", 2)) {
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
            w.endNode(this, "IRBreak", 2);
        }
    }

}
