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
 * Class Field, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 13:58:52 CEST 2016
 */
@SuppressWarnings("unused")
public class Field extends Member {
    private final Expr _expr;

    /**
     * Constructs a Field.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public Field(ASTSpanInfo in_info, Property in_prop, Expr in_expr) {
        super(in_info, in_prop);
        if (in_expr == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'expr' to the Field constructor was null");
        }
        _expr = in_expr;
    }

    final public Expr getExpr() { return _expr; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forField(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forField(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forField(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forField(this);
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
            Field casted = (Field) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Property temp_prop = getProp();
            Property casted_prop = casted.getProp();
            if (!(temp_prop == casted_prop || temp_prop.equals(casted_prop))) return false;
            Expr temp_expr = getExpr();
            Expr casted_expr = casted.getExpr();
            if (!(temp_expr == casted_expr || temp_expr.equals(casted_expr))) return false;
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
        Property temp_prop = getProp();
        code ^= temp_prop.hashCode();
        Expr temp_expr = getExpr();
        code ^= temp_expr.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected Field() {
        _expr = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "Field", 3)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            Property temp_prop = getProp();
            if (w.visitNodeField("prop", temp_prop)) {
                temp_prop.walk(w);
                w.endNodeField("prop", temp_prop);
            }
            Expr temp_expr = getExpr();
            if (w.visitNodeField("expr", temp_expr)) {
                temp_expr.walk(w);
                w.endNodeField("expr", temp_expr);
            }
            w.endNode(this, "Field", 3);
        }
    }

}
