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
 * Class ExprStmt, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Nov 21 18:10:55 CET 2016
 */
@SuppressWarnings("unused")
public class ExprStmt extends Stmt {
    private final Expr _expr;
    private final boolean _internal;

    /**
     * Constructs a ExprStmt.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public ExprStmt(ASTSpanInfo in_info, Expr in_expr, boolean in_internal) {
        super(in_info);
        if (in_expr == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'expr' to the ExprStmt constructor was null");
        }
        _expr = in_expr;
        _internal = in_internal;
    }

    /**
     * A constructor with some fields provided by default values.
     */
    public ExprStmt(ASTSpanInfo in_info, Expr in_expr) {
        this(in_info, in_expr, false);
    }

    final public Expr getExpr() { return _expr; }
    final public boolean isInternal() { return _internal; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forExprStmt(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forExprStmt(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forExprStmt(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forExprStmt(this);
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
            ExprStmt casted = (ExprStmt) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Expr temp_expr = getExpr();
            Expr casted_expr = casted.getExpr();
            if (!(temp_expr == casted_expr || temp_expr.equals(casted_expr))) return false;
            boolean temp_internal = isInternal();
            boolean casted_internal = casted.isInternal();
            if (!(temp_internal == casted_internal)) return false;
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
        Expr temp_expr = getExpr();
        code ^= temp_expr.hashCode();
        boolean temp_internal = isInternal();
        code ^= temp_internal ? 1231 : 1237;
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected ExprStmt() {
        _expr = null;
        _internal = false;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "ExprStmt", 3)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            Expr temp_expr = getExpr();
            if (w.visitNodeField("expr", temp_expr)) {
                temp_expr.walk(w);
                w.endNodeField("expr", temp_expr);
            }
            boolean temp_internal = isInternal();
            if (w.visitNodeField("internal", temp_internal)) {
                w.visitBoolean(temp_internal);
                w.endNodeField("internal", temp_internal);
            }
            w.endNode(this, "ExprStmt", 3);
        }
    }

}
