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
 * Class MethodSig, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Wed Nov 09 11:44:31 CET 2016
 */
@SuppressWarnings("unused")
public class MethodSig extends TypeMember {
    private final Property _prop;
    private final boolean _optional;
    private final CallSig _sig;

    /**
     * Constructs a MethodSig.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public MethodSig(ASTSpanInfo in_info, Property in_prop, boolean in_optional, CallSig in_sig) {
        super(in_info);
        if (in_prop == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'prop' to the MethodSig constructor was null");
        }
        _prop = in_prop;
        _optional = in_optional;
        if (in_sig == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'sig' to the MethodSig constructor was null");
        }
        _sig = in_sig;
    }

    final public Property getProp() { return _prop; }
    final public boolean isOptional() { return _optional; }
    final public CallSig getSig() { return _sig; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forMethodSig(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forMethodSig(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forMethodSig(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forMethodSig(this);
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
            MethodSig casted = (MethodSig) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Property temp_prop = getProp();
            Property casted_prop = casted.getProp();
            if (!(temp_prop == casted_prop || temp_prop.equals(casted_prop))) return false;
            boolean temp_optional = isOptional();
            boolean casted_optional = casted.isOptional();
            if (!(temp_optional == casted_optional)) return false;
            CallSig temp_sig = getSig();
            CallSig casted_sig = casted.getSig();
            if (!(temp_sig == casted_sig || temp_sig.equals(casted_sig))) return false;
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
        boolean temp_optional = isOptional();
        code ^= temp_optional ? 1231 : 1237;
        CallSig temp_sig = getSig();
        code ^= temp_sig.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected MethodSig() {
        _prop = null;
        _optional = false;
        _sig = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "MethodSig", 4)) {
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
            boolean temp_optional = isOptional();
            if (w.visitNodeField("optional", temp_optional)) {
                w.visitBoolean(temp_optional);
                w.endNodeField("optional", temp_optional);
            }
            CallSig temp_sig = getSig();
            if (w.visitNodeField("sig", temp_sig)) {
                temp_sig.walk(w);
                w.endNodeField("sig", temp_sig);
            }
            w.endNode(this, "MethodSig", 4);
        }
    }

}
