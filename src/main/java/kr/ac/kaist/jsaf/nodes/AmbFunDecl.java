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
 * Class AmbFunDecl, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Wed Nov 09 11:44:31 CET 2016
 */
@SuppressWarnings("unused")
public class AmbFunDecl extends AmbDecl {
    private final Id _id;
    private final CallSig _sig;

    /**
     * Constructs a AmbFunDecl.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public AmbFunDecl(ASTSpanInfo in_info, Id in_id, CallSig in_sig) {
        super(in_info);
        if (in_id == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'id' to the AmbFunDecl constructor was null");
        }
        _id = in_id;
        if (in_sig == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'sig' to the AmbFunDecl constructor was null");
        }
        _sig = in_sig;
    }

    final public Id getId() { return _id; }
    final public CallSig getSig() { return _sig; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forAmbFunDecl(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forAmbFunDecl(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forAmbFunDecl(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forAmbFunDecl(this);
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
            AmbFunDecl casted = (AmbFunDecl) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Id temp_id = getId();
            Id casted_id = casted.getId();
            if (!(temp_id == casted_id || temp_id.equals(casted_id))) return false;
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
        Id temp_id = getId();
        code ^= temp_id.hashCode();
        CallSig temp_sig = getSig();
        code ^= temp_sig.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected AmbFunDecl() {
        _id = null;
        _sig = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "AmbFunDecl", 3)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            Id temp_id = getId();
            if (w.visitNodeField("id", temp_id)) {
                temp_id.walk(w);
                w.endNodeField("id", temp_id);
            }
            CallSig temp_sig = getSig();
            if (w.visitNodeField("sig", temp_sig)) {
                temp_sig.walk(w);
                w.endNodeField("sig", temp_sig);
            }
            w.endNode(this, "AmbFunDecl", 3);
        }
    }

}
