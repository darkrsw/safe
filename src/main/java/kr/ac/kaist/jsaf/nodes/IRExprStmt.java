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
 * Class IRExprStmt, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 13:58:52 CEST 2016
 */
@SuppressWarnings("unused")
public class IRExprStmt extends IRAssign {
    private final IRExpr _right;
    private final boolean _ref;

    /**
     * Constructs a IRExprStmt.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IRExprStmt(IRSpanInfo in_info, IRId in_lhs, IRExpr in_right, boolean in_ref) {
        super(in_info, in_lhs);
        if (in_right == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'right' to the IRExprStmt constructor was null");
        }
        _right = in_right;
        _ref = in_ref;
    }

    /**
     * A constructor with some fields provided by default values.
     */
    public IRExprStmt(IRSpanInfo in_info, IRId in_lhs, IRExpr in_right) {
        this(in_info, in_lhs, in_right, false);
    }

    final public IRExpr getRight() { return _right; }
    final public boolean isRef() { return _ref; }

    public <RetType> RetType accept(IRAbstractNodeVisitor<RetType> visitor) {
        return visitor.forIRExprStmt(this);
    }

    public <RetType> RetType accept(IRNodeVisitor<RetType> visitor) {
        return visitor.forIRExprStmt(this);
    }

    public void accept(IRAbstractNodeVisitor_void visitor) {
        visitor.forIRExprStmt(this);
    }

    public void accept(IRNodeVisitor_void visitor) {
        visitor.forIRExprStmt(this);
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
            IRExprStmt casted = (IRExprStmt) obj;
            IRSpanInfo temp_info = getInfo();
            IRSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            IRId temp_lhs = getLhs();
            IRId casted_lhs = casted.getLhs();
            if (!(temp_lhs == casted_lhs || temp_lhs.equals(casted_lhs))) return false;
            IRExpr temp_right = getRight();
            IRExpr casted_right = casted.getRight();
            if (!(temp_right == casted_right || temp_right.equals(casted_right))) return false;
            boolean temp_ref = isRef();
            boolean casted_ref = casted.isRef();
            if (!(temp_ref == casted_ref)) return false;
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
        IRId temp_lhs = getLhs();
        code ^= temp_lhs.hashCode();
        IRExpr temp_right = getRight();
        code ^= temp_right.hashCode();
        boolean temp_ref = isRef();
        code ^= temp_ref ? 1231 : 1237;
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IRExprStmt() {
        _right = null;
        _ref = false;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "IRExprStmt", 4)) {
            IRSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            IRId temp_lhs = getLhs();
            if (w.visitNodeField("lhs", temp_lhs)) {
                temp_lhs.walk(w);
                w.endNodeField("lhs", temp_lhs);
            }
            IRExpr temp_right = getRight();
            if (w.visitNodeField("right", temp_right)) {
                temp_right.walk(w);
                w.endNodeField("right", temp_right);
            }
            boolean temp_ref = isRef();
            if (w.visitNodeField("ref", temp_ref)) {
                w.visitBoolean(temp_ref);
                w.endNodeField("ref", temp_ref);
            }
            w.endNode(this, "IRExprStmt", 4);
        }
    }

}
