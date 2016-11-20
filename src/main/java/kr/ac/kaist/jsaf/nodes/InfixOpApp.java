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
 * Class InfixOpApp, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Fri Nov 18 18:56:39 CET 2016
 */
@SuppressWarnings("unused")
public class InfixOpApp extends Expr {
    private final Expr _left;
    private final Op _op;
    private final Expr _right;

    /**
     * Constructs a InfixOpApp.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public InfixOpApp(ASTSpanInfo in_info, Expr in_left, Op in_op, Expr in_right) {
        super(in_info);
        if (in_left == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'left' to the InfixOpApp constructor was null");
        }
        _left = in_left;
        if (in_op == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'op' to the InfixOpApp constructor was null");
        }
        _op = in_op;
        if (in_right == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'right' to the InfixOpApp constructor was null");
        }
        _right = in_right;
    }

    final public Expr getLeft() { return _left; }
    final public Op getOp() { return _op; }
    final public Expr getRight() { return _right; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forInfixOpApp(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forInfixOpApp(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forInfixOpApp(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forInfixOpApp(this);
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
            InfixOpApp casted = (InfixOpApp) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Expr temp_left = getLeft();
            Expr casted_left = casted.getLeft();
            if (!(temp_left == casted_left || temp_left.equals(casted_left))) return false;
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
        Expr temp_left = getLeft();
        code ^= temp_left.hashCode();
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
    protected InfixOpApp() {
        _left = null;
        _op = null;
        _right = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "InfixOpApp", 4)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            Expr temp_left = getLeft();
            if (w.visitNodeField("left", temp_left)) {
                temp_left.walk(w);
                w.endNodeField("left", temp_left);
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
            w.endNode(this, "InfixOpApp", 4);
        }
    }

}
