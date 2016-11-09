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
 * Class ForIn, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Oct 24 17:42:23 CEST 2016
 */
@SuppressWarnings("unused")
public class ForIn extends Stmt {
    private final LHS _lhs;
    private final Expr _expr;
    private final Stmt _body;

    /**
     * Constructs a ForIn.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public ForIn(ASTSpanInfo in_info, LHS in_lhs, Expr in_expr, Stmt in_body) {
        super(in_info);
        if (in_lhs == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'lhs' to the ForIn constructor was null");
        }
        _lhs = in_lhs;
        if (in_expr == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'expr' to the ForIn constructor was null");
        }
        _expr = in_expr;
        if (in_body == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'body' to the ForIn constructor was null");
        }
        _body = in_body;
    }

    final public LHS getLhs() { return _lhs; }
    final public Expr getExpr() { return _expr; }
    final public Stmt getBody() { return _body; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forForIn(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forForIn(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forForIn(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forForIn(this);
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
            ForIn casted = (ForIn) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            LHS temp_lhs = getLhs();
            LHS casted_lhs = casted.getLhs();
            if (!(temp_lhs == casted_lhs || temp_lhs.equals(casted_lhs))) return false;
            Expr temp_expr = getExpr();
            Expr casted_expr = casted.getExpr();
            if (!(temp_expr == casted_expr || temp_expr.equals(casted_expr))) return false;
            Stmt temp_body = getBody();
            Stmt casted_body = casted.getBody();
            if (!(temp_body == casted_body || temp_body.equals(casted_body))) return false;
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
        Expr temp_expr = getExpr();
        code ^= temp_expr.hashCode();
        Stmt temp_body = getBody();
        code ^= temp_body.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected ForIn() {
        _lhs = null;
        _expr = null;
        _body = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "ForIn", 4)) {
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
            Expr temp_expr = getExpr();
            if (w.visitNodeField("expr", temp_expr)) {
                temp_expr.walk(w);
                w.endNodeField("expr", temp_expr);
            }
            Stmt temp_body = getBody();
            if (w.visitNodeField("body", temp_body)) {
                temp_body.walk(w);
                w.endNodeField("body", temp_body);
            }
            w.endNode(this, "ForIn", 4);
        }
    }

}
