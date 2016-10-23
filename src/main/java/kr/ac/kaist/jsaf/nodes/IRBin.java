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
 * Class IRBin, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 18:58:00 CEST 2016
 */
@SuppressWarnings("unused")
public class IRBin extends IROpApp {
    private final IRExpr _first;
    private final IROp _op;
    private final IRExpr _second;

    /**
     * Constructs a IRBin.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IRBin(IRSpanInfo in_info, IRExpr in_first, IROp in_op, IRExpr in_second) {
        super(in_info);
        if (in_first == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'first' to the IRBin constructor was null");
        }
        _first = in_first;
        if (in_op == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'op' to the IRBin constructor was null");
        }
        _op = in_op;
        if (in_second == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'second' to the IRBin constructor was null");
        }
        _second = in_second;
    }

    final public IRExpr getFirst() { return _first; }
    final public IROp getOp() { return _op; }
    final public IRExpr getSecond() { return _second; }

    public <RetType> RetType accept(IRNodeVisitor<RetType> visitor) {
        return visitor.forIRBin(this);
    }

    public void accept(IRNodeVisitor_void visitor) {
        visitor.forIRBin(this);
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
            IRBin casted = (IRBin) obj;
            IRSpanInfo temp_info = getInfo();
            IRSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            IRExpr temp_first = getFirst();
            IRExpr casted_first = casted.getFirst();
            if (!(temp_first == casted_first || temp_first.equals(casted_first))) return false;
            IROp temp_op = getOp();
            IROp casted_op = casted.getOp();
            if (!(temp_op == casted_op || temp_op.equals(casted_op))) return false;
            IRExpr temp_second = getSecond();
            IRExpr casted_second = casted.getSecond();
            if (!(temp_second == casted_second || temp_second.equals(casted_second))) return false;
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
        IRExpr temp_first = getFirst();
        code ^= temp_first.hashCode();
        IROp temp_op = getOp();
        code ^= temp_op.hashCode();
        IRExpr temp_second = getSecond();
        code ^= temp_second.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IRBin() {
        _first = null;
        _op = null;
        _second = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "IRBin", 4)) {
            IRSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            IRExpr temp_first = getFirst();
            if (w.visitNodeField("first", temp_first)) {
                temp_first.walk(w);
                w.endNodeField("first", temp_first);
            }
            IROp temp_op = getOp();
            if (w.visitNodeField("op", temp_op)) {
                temp_op.walk(w);
                w.endNodeField("op", temp_op);
            }
            IRExpr temp_second = getSecond();
            if (w.visitNodeField("second", temp_second)) {
                temp_second.walk(w);
                w.endNodeField("second", temp_second);
            }
            w.endNode(this, "IRBin", 4);
        }
    }

}
