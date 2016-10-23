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
 * Class IREval, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 13:58:52 CEST 2016
 */
@SuppressWarnings("unused")
public class IREval extends IRAssign {
    private final IRExpr _arg;

    /**
     * Constructs a IREval.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IREval(IRSpanInfo in_info, IRId in_lhs, IRExpr in_arg) {
        super(in_info, in_lhs);
        if (in_arg == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'arg' to the IREval constructor was null");
        }
        _arg = in_arg;
    }

    final public IRExpr getArg() { return _arg; }

    public <RetType> RetType accept(IRAbstractNodeVisitor<RetType> visitor) {
        return visitor.forIREval(this);
    }

    public <RetType> RetType accept(IRNodeVisitor<RetType> visitor) {
        return visitor.forIREval(this);
    }

    public void accept(IRAbstractNodeVisitor_void visitor) {
        visitor.forIREval(this);
    }

    public void accept(IRNodeVisitor_void visitor) {
        visitor.forIREval(this);
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
            IREval casted = (IREval) obj;
            IRSpanInfo temp_info = getInfo();
            IRSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            IRId temp_lhs = getLhs();
            IRId casted_lhs = casted.getLhs();
            if (!(temp_lhs == casted_lhs || temp_lhs.equals(casted_lhs))) return false;
            IRExpr temp_arg = getArg();
            IRExpr casted_arg = casted.getArg();
            if (!(temp_arg == casted_arg || temp_arg.equals(casted_arg))) return false;
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
        IRExpr temp_arg = getArg();
        code ^= temp_arg.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IREval() {
        _arg = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "IREval", 3)) {
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
            IRExpr temp_arg = getArg();
            if (w.visitNodeField("arg", temp_arg)) {
                temp_arg.walk(w);
                w.endNodeField("arg", temp_arg);
            }
            w.endNode(this, "IREval", 3);
        }
    }

}
