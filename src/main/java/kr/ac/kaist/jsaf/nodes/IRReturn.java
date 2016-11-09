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
 * Class IRReturn, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Oct 24 17:42:24 CEST 2016
 */
@SuppressWarnings("unused")
public class IRReturn extends IRStmt {
    private final Option<IRExpr> _expr;

    /**
     * Constructs a IRReturn.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IRReturn(IRSpanInfo in_info, Option<IRExpr> in_expr) {
        super(in_info);
        if (in_expr == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'expr' to the IRReturn constructor was null");
        }
        _expr = in_expr;
    }

    final public Option<IRExpr> getExpr() { return _expr; }

    public <RetType> RetType accept(IRAbstractNodeVisitor<RetType> visitor) {
        return visitor.forIRReturn(this);
    }

    public <RetType> RetType accept(IRNodeVisitor<RetType> visitor) {
        return visitor.forIRReturn(this);
    }

    public void accept(IRAbstractNodeVisitor_void visitor) {
        visitor.forIRReturn(this);
    }

    public void accept(IRNodeVisitor_void visitor) {
        visitor.forIRReturn(this);
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
            IRReturn casted = (IRReturn) obj;
            IRSpanInfo temp_info = getInfo();
            IRSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Option<IRExpr> temp_expr = getExpr();
            Option<IRExpr> casted_expr = casted.getExpr();
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
        IRSpanInfo temp_info = getInfo();
        code ^= temp_info.hashCode();
        Option<IRExpr> temp_expr = getExpr();
        code ^= temp_expr.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IRReturn() {
        _expr = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "IRReturn", 2)) {
            IRSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            Option<IRExpr> temp_expr = getExpr();
            if (w.visitNodeField("expr", temp_expr)) {
                if (temp_expr.isNone()) {
                    w.visitEmptyOption(temp_expr);
                }
                else if (w.visitNonEmptyOption(temp_expr)) {
                    IRExpr elt_temp_expr = temp_expr.unwrap();
                    if (elt_temp_expr == null) w.visitNull();
                    else {
                        elt_temp_expr.walk(w);
                    }
                    w.endNonEmptyOption(temp_expr);
                }
                w.endNodeField("expr", temp_expr);
            }
            w.endNode(this, "IRReturn", 2);
        }
    }

}
