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
 * Class AssignOpApp, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 13:58:52 CEST 2016
 */
@SuppressWarnings("unused")
public class AssignOpApp extends Expr {
    private final LHS _lhs;
    private final Op _op;
    private final Expr _right;

    /**
     * Constructs a AssignOpApp.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public AssignOpApp(ASTSpanInfo in_info, LHS in_lhs, Op in_op, Expr in_right) {
        super(in_info);
        if (in_lhs == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'lhs' to the AssignOpApp constructor was null");
        }
        _lhs = in_lhs;
        if (in_op == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'op' to the AssignOpApp constructor was null");
        }
        _op = in_op;
        if (in_right == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'right' to the AssignOpApp constructor was null");
        }
        _right = in_right;
    }

    final public LHS getLhs() { return _lhs; }
    final public Op getOp() { return _op; }
    final public Expr getRight() { return _right; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forAssignOpApp(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forAssignOpApp(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forAssignOpApp(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forAssignOpApp(this);
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
            AssignOpApp casted = (AssignOpApp) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            LHS temp_lhs = getLhs();
            LHS casted_lhs = casted.getLhs();
            if (!(temp_lhs == casted_lhs || temp_lhs.equals(casted_lhs))) return false;
            Op temp_op = getOp();
            Op casted_op = casted.getOp();
            if (!(temp_op == casted_op || temp_op.equals(casted_op))) return false;
            Expr temp_right = getRight();
            Expr casted_right = casted.getRight();
            if (!(temp_right == casted_right || temp_right.equals(casted_right))) return false;
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
        ASTSpanInfo temp_info = getInfo();
        code ^= temp_info.hashCode();
        LHS temp_lhs = getLhs();
        code ^= temp_lhs.hashCode();
        Op temp_op = getOp();
        code ^= temp_op.hashCode();
        Expr temp_right = getRight();
        code ^= temp_right.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected AssignOpApp() {
        _lhs = null;
        _op = null;
        _right = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "AssignOpApp", 4)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            LHS temp_lhs = getLhs();
            if (w.visitNodeField("lhs", temp_lhs)) {
                temp_lhs.walk(w);
                w.endNodeField("lhs", temp_lhs);
            }
            Op temp_op = getOp();
            if (w.visitNodeField("op", temp_op)) {
                temp_op.walk(w);
                w.endNodeField("op", temp_op);
            }
            Expr temp_right = getRight();
            if (w.visitNodeField("right", temp_right)) {
                temp_right.walk(w);
                w.endNodeField("right", temp_right);
            }
            w.endNode(this, "AssignOpApp", 4);
        }
    }

}
