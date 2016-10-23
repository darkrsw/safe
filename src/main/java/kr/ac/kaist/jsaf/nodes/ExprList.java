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
 * Class ExprList, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 13:58:51 CEST 2016
 */
@SuppressWarnings("unused")
public class ExprList extends Expr {
    private final List<Expr> _exprs;

    /**
     * Constructs a ExprList.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public ExprList(ASTSpanInfo in_info, List<Expr> in_exprs) {
        super(in_info);
        if (in_exprs == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'exprs' to the ExprList constructor was null");
        }
        _exprs = in_exprs;
    }

    final public List<Expr> getExprs() { return _exprs; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forExprList(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forExprList(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forExprList(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forExprList(this);
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
            ExprList casted = (ExprList) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            List<Expr> temp_exprs = getExprs();
            List<Expr> casted_exprs = casted.getExprs();
            if (!(temp_exprs == casted_exprs || temp_exprs.equals(casted_exprs))) return false;
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
        List<Expr> temp_exprs = getExprs();
        code ^= temp_exprs.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected ExprList() {
        _exprs = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "ExprList", 2)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            List<Expr> temp_exprs = getExprs();
            if (w.visitNodeField("exprs", temp_exprs)) {
                if (w.visitIterated(temp_exprs)) {
                    int i_temp_exprs = 0;
                    for (Expr elt_temp_exprs : temp_exprs) {
                        if (w.visitIteratedElement(i_temp_exprs, elt_temp_exprs)) {
                            if (elt_temp_exprs == null) w.visitNull();
                            else {
                                elt_temp_exprs.walk(w);
                            }
                        }
                        i_temp_exprs++;
                    }
                    w.endIterated(temp_exprs, i_temp_exprs);
                }
                w.endNodeField("exprs", temp_exprs);
            }
            w.endNode(this, "ExprList", 2);
        }
    }

}
