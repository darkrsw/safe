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
 * Class VarDecl, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 13:58:51 CEST 2016
 */
@SuppressWarnings("unused")
public class VarDecl extends AbstractNode {
    private final Id _name;
    private final Option<Expr> _expr;
    private final boolean _strict;

    /**
     * Constructs a VarDecl.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public VarDecl(ASTSpanInfo in_info, Id in_name, Option<Expr> in_expr, boolean in_strict) {
        super(in_info);
        if (in_name == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'name' to the VarDecl constructor was null");
        }
        _name = in_name;
        if (in_expr == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'expr' to the VarDecl constructor was null");
        }
        _expr = in_expr;
        _strict = in_strict;
    }

    /**
     * A constructor with some fields provided by default values.
     */
    public VarDecl(ASTSpanInfo in_info, Id in_name, Option<Expr> in_expr) {
        this(in_info, in_name, in_expr, false);
    }

    final public Id getName() { return _name; }
    final public Option<Expr> getExpr() { return _expr; }
    final public boolean isStrict() { return _strict; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forVarDecl(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forVarDecl(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forVarDecl(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forVarDecl(this);
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
            VarDecl casted = (VarDecl) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Id temp_name = getName();
            Id casted_name = casted.getName();
            if (!(temp_name == casted_name || temp_name.equals(casted_name))) return false;
            Option<Expr> temp_expr = getExpr();
            Option<Expr> casted_expr = casted.getExpr();
            if (!(temp_expr == casted_expr || temp_expr.equals(casted_expr))) return false;
            boolean temp_strict = isStrict();
            boolean casted_strict = casted.isStrict();
            if (!(temp_strict == casted_strict)) return false;
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
        Id temp_name = getName();
        code ^= temp_name.hashCode();
        Option<Expr> temp_expr = getExpr();
        code ^= temp_expr.hashCode();
        boolean temp_strict = isStrict();
        code ^= temp_strict ? 1231 : 1237;
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected VarDecl() {
        _name = null;
        _expr = null;
        _strict = false;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "VarDecl", 4)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            Id temp_name = getName();
            if (w.visitNodeField("name", temp_name)) {
                temp_name.walk(w);
                w.endNodeField("name", temp_name);
            }
            Option<Expr> temp_expr = getExpr();
            if (w.visitNodeField("expr", temp_expr)) {
                if (temp_expr.isNone()) {
                    w.visitEmptyOption(temp_expr);
                }
                else if (w.visitNonEmptyOption(temp_expr)) {
                    Expr elt_temp_expr = temp_expr.unwrap();
                    if (elt_temp_expr == null) w.visitNull();
                    else {
                        elt_temp_expr.walk(w);
                    }
                    w.endNonEmptyOption(temp_expr);
                }
                w.endNodeField("expr", temp_expr);
            }
            boolean temp_strict = isStrict();
            if (w.visitNodeField("strict", temp_strict)) {
                w.visitBoolean(temp_strict);
                w.endNodeField("strict", temp_strict);
            }
            w.endNode(this, "VarDecl", 4);
        }
    }

}
