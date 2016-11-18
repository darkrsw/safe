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
 * Class IRWith, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Wed Nov 09 11:44:32 CET 2016
 */
@SuppressWarnings("unused")
public class IRWith extends IRStmt {
    private final IRId _id;
    private final IRStmt _stmt;

    /**
     * Constructs a IRWith.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IRWith(IRSpanInfo in_info, IRId in_id, IRStmt in_stmt) {
        super(in_info);
        if (in_id == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'id' to the IRWith constructor was null");
        }
        _id = in_id;
        if (in_stmt == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'stmt' to the IRWith constructor was null");
        }
        _stmt = in_stmt;
    }

    final public IRId getId() { return _id; }
    final public IRStmt getStmt() { return _stmt; }

    public <RetType> RetType accept(IRAbstractNodeVisitor<RetType> visitor) {
        return visitor.forIRWith(this);
    }

    public <RetType> RetType accept(IRNodeVisitor<RetType> visitor) {
        return visitor.forIRWith(this);
    }

    public void accept(IRAbstractNodeVisitor_void visitor) {
        visitor.forIRWith(this);
    }

    public void accept(IRNodeVisitor_void visitor) {
        visitor.forIRWith(this);
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
            IRWith casted = (IRWith) obj;
            IRSpanInfo temp_info = getInfo();
            IRSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            IRId temp_id = getId();
            IRId casted_id = casted.getId();
            if (!(temp_id == casted_id || temp_id.equals(casted_id))) return false;
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
        IRId temp_id = getId();
        code ^= temp_id.hashCode();
        IRStmt temp_stmt = getStmt();
        code ^= temp_stmt.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IRWith() {
        _id = null;
        _stmt = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "IRWith", 3)) {
            IRSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            IRId temp_id = getId();
            if (w.visitNodeField("id", temp_id)) {
                temp_id.walk(w);
                w.endNodeField("id", temp_id);
            }
            IRStmt temp_stmt = getStmt();
            if (w.visitNodeField("stmt", temp_stmt)) {
                temp_stmt.walk(w);
                w.endNodeField("stmt", temp_stmt);
            }
            w.endNode(this, "IRWith", 3);
        }
    }

}
