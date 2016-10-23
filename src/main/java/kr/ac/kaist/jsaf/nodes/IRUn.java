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
 * Class IRUn, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 18:58:00 CEST 2016
 */
@SuppressWarnings("unused")
public class IRUn extends IROpApp {
    private final IROp _op;
    private final IRExpr _expr;

    /**
     * Constructs a IRUn.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IRUn(IRSpanInfo in_info, IROp in_op, IRExpr in_expr) {
        super(in_info);
        if (in_op == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'op' to the IRUn constructor was null");
        }
        _op = in_op;
        if (in_expr == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'expr' to the IRUn constructor was null");
        }
        _expr = in_expr;
    }

    final public IROp getOp() { return _op; }
    final public IRExpr getExpr() { return _expr; }

    public <RetType> RetType accept(IRNodeVisitor<RetType> visitor) {
        return visitor.forIRUn(this);
    }

    public void accept(IRNodeVisitor_void visitor) {
        visitor.forIRUn(this);
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
            IRUn casted = (IRUn) obj;
            IRSpanInfo temp_info = getInfo();
            IRSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            IROp temp_op = getOp();
            IROp casted_op = casted.getOp();
            if (!(temp_op == casted_op || temp_op.equals(casted_op))) return false;
            IRExpr temp_expr = getExpr();
            IRExpr casted_expr = casted.getExpr();
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
        IROp temp_op = getOp();
        code ^= temp_op.hashCode();
        IRExpr temp_expr = getExpr();
        code ^= temp_expr.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IRUn() {
        _op = null;
        _expr = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "IRUn", 3)) {
            IRSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            IROp temp_op = getOp();
            if (w.visitNodeField("op", temp_op)) {
                temp_op.walk(w);
                w.endNodeField("op", temp_op);
            }
            IRExpr temp_expr = getExpr();
            if (w.visitNodeField("expr", temp_expr)) {
                temp_expr.walk(w);
                w.endNodeField("expr", temp_expr);
            }
            w.endNode(this, "IRUn", 3);
        }
    }

}
