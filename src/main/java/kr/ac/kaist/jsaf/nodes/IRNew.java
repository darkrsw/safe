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
 * Class IRNew, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Wed Nov 09 11:44:32 CET 2016
 */
@SuppressWarnings("unused")
public class IRNew extends IRAssign {
    private final IRId _fun;
    private final List<IRId> _args;

    /**
     * Constructs a IRNew.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IRNew(IRSpanInfo in_info, IRId in_lhs, IRId in_fun, List<IRId> in_args) {
        super(in_info, in_lhs);
        if (in_fun == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'fun' to the IRNew constructor was null");
        }
        _fun = in_fun;
        if (in_args == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'args' to the IRNew constructor was null");
        }
        _args = in_args;
    }

    final public IRId getFun() { return _fun; }
    final public List<IRId> getArgs() { return _args; }

    public <RetType> RetType accept(IRAbstractNodeVisitor<RetType> visitor) {
        return visitor.forIRNew(this);
    }

    public <RetType> RetType accept(IRNodeVisitor<RetType> visitor) {
        return visitor.forIRNew(this);
    }

    public void accept(IRAbstractNodeVisitor_void visitor) {
        visitor.forIRNew(this);
    }

    public void accept(IRNodeVisitor_void visitor) {
        visitor.forIRNew(this);
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
            IRNew casted = (IRNew) obj;
            IRSpanInfo temp_info = getInfo();
            IRSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            IRId temp_lhs = getLhs();
            IRId casted_lhs = casted.getLhs();
            if (!(temp_lhs == casted_lhs || temp_lhs.equals(casted_lhs))) return false;
            IRId temp_fun = getFun();
            IRId casted_fun = casted.getFun();
            if (!(temp_fun == casted_fun || temp_fun.equals(casted_fun))) return false;
            List<IRId> temp_args = getArgs();
            List<IRId> casted_args = casted.getArgs();
            if (!(temp_args == casted_args || temp_args.equals(casted_args))) return false;
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
        List<IRId> temp_args = getArgs();
        code ^= temp_args.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IRNew() {
        _fun = null;
        _args = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "IRNew", 4)) {
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
            List<IRId> temp_args = getArgs();
            if (w.visitNodeField("args", temp_args)) {
                if (w.visitIterated(temp_args)) {
                    int i_temp_args = 0;
                    for (IRId elt_temp_args : temp_args) {
                        if (w.visitIteratedElement(i_temp_args, elt_temp_args)) {
                            if (elt_temp_args == null) w.visitNull();
                            else {
                                elt_temp_args.walk(w);
                            }
                        }
                        i_temp_args++;
                    }
                    w.endIterated(temp_args, i_temp_args);
                }
                w.endNodeField("args", temp_args);
            }
            w.endNode(this, "IRNew", 4);
        }
    }

}
