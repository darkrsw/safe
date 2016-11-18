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
 * Class IRInternalCall, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Wed Nov 09 11:44:32 CET 2016
 */
@SuppressWarnings("unused")
public class IRInternalCall extends IRAssign {
    private final IRId _fun;
    private final IRExpr _first;
    private final Option<IRId> _second;

    /**
     * Constructs a IRInternalCall.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IRInternalCall(IRSpanInfo in_info, IRId in_lhs, IRId in_fun, IRExpr in_first, Option<IRId> in_second) {
        super(in_info, in_lhs);
        if (in_fun == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'fun' to the IRInternalCall constructor was null");
        }
        _fun = in_fun;
        if (in_first == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'first' to the IRInternalCall constructor was null");
        }
        _first = in_first;
        if (in_second == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'second' to the IRInternalCall constructor was null");
        }
        _second = in_second;
    }

    final public IRId getFun() { return _fun; }
    final public IRExpr getFirst() { return _first; }
    final public Option<IRId> getSecond() { return _second; }

    public <RetType> RetType accept(IRAbstractNodeVisitor<RetType> visitor) {
        return visitor.forIRInternalCall(this);
    }

    public <RetType> RetType accept(IRNodeVisitor<RetType> visitor) {
        return visitor.forIRInternalCall(this);
    }

    public void accept(IRAbstractNodeVisitor_void visitor) {
        visitor.forIRInternalCall(this);
    }

    public void accept(IRNodeVisitor_void visitor) {
        visitor.forIRInternalCall(this);
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
            IRInternalCall casted = (IRInternalCall) obj;
            IRSpanInfo temp_info = getInfo();
            IRSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            IRId temp_lhs = getLhs();
            IRId casted_lhs = casted.getLhs();
            if (!(temp_lhs == casted_lhs || temp_lhs.equals(casted_lhs))) return false;
            IRId temp_fun = getFun();
            IRId casted_fun = casted.getFun();
            if (!(temp_fun == casted_fun || temp_fun.equals(casted_fun))) return false;
            IRExpr temp_first = getFirst();
            IRExpr casted_first = casted.getFirst();
            if (!(temp_first == casted_first || temp_first.equals(casted_first))) return false;
            Option<IRId> temp_second = getSecond();
            Option<IRId> casted_second = casted.getSecond();
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
        IRId temp_lhs = getLhs();
        code ^= temp_lhs.hashCode();
        IRId temp_fun = getFun();
        code ^= temp_fun.hashCode();
        IRExpr temp_first = getFirst();
        code ^= temp_first.hashCode();
        Option<IRId> temp_second = getSecond();
        code ^= temp_second.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IRInternalCall() {
        _fun = null;
        _first = null;
        _second = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "IRInternalCall", 5)) {
            IRSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            IRId temp_lhs = getLhs();
            if (w.visitNodeField("lhs", temp_lhs)) {
                temp_lhs.walk(w);
                w.endNodeField("lhs", temp_lhs);
            }
            IRId temp_fun = getFun();
            if (w.visitNodeField("fun", temp_fun)) {
                temp_fun.walk(w);
                w.endNodeField("fun", temp_fun);
            }
            IRExpr temp_first = getFirst();
            if (w.visitNodeField("first", temp_first)) {
                temp_first.walk(w);
                w.endNodeField("first", temp_first);
            }
            Option<IRId> temp_second = getSecond();
            if (w.visitNodeField("second", temp_second)) {
                if (temp_second.isNone()) {
                    w.visitEmptyOption(temp_second);
                }
                else if (w.visitNonEmptyOption(temp_second)) {
                    IRId elt_temp_second = temp_second.unwrap();
                    if (elt_temp_second == null) w.visitNull();
                    else {
                        elt_temp_second.walk(w);
                    }
                    w.endNonEmptyOption(temp_second);
                }
                w.endNodeField("second", temp_second);
            }
            w.endNode(this, "IRInternalCall", 5);
        }
    }

}
