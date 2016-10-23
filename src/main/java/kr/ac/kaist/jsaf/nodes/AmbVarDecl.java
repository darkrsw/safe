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
 * Class AmbVarDecl, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 18:57:59 CEST 2016
 */
@SuppressWarnings("unused")
public class AmbVarDecl extends AmbDecl {
    private final Id _id;
    private final Option<Type> _ty;

    /**
     * Constructs a AmbVarDecl.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public AmbVarDecl(ASTSpanInfo in_info, Id in_id, Option<Type> in_ty) {
        super(in_info);
        if (in_id == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'id' to the AmbVarDecl constructor was null");
        }
        _id = in_id;
        if (in_ty == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'ty' to the AmbVarDecl constructor was null");
        }
        _ty = in_ty;
    }

    final public Id getId() { return _id; }
    final public Option<Type> getTy() { return _ty; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forAmbVarDecl(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forAmbVarDecl(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forAmbVarDecl(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forAmbVarDecl(this);
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
            AmbVarDecl casted = (AmbVarDecl) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Id temp_id = getId();
            Id casted_id = casted.getId();
            if (!(temp_id == casted_id || temp_id.equals(casted_id))) return false;
            Option<Type> temp_ty = getTy();
            Option<Type> casted_ty = casted.getTy();
            if (!(temp_ty == casted_ty || temp_ty.equals(casted_ty))) return false;
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
        Option<Type> temp_ty = getTy();
        code ^= temp_ty.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected AmbVarDecl() {
        _id = null;
        _ty = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "AmbVarDecl", 3)) {
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
            Option<Type> temp_ty = getTy();
            if (w.visitNodeField("ty", temp_ty)) {
                if (temp_ty.isNone()) {
                    w.visitEmptyOption(temp_ty);
                }
                else if (w.visitNonEmptyOption(temp_ty)) {
                    Type elt_temp_ty = temp_ty.unwrap();
                    if (elt_temp_ty == null) w.visitNull();
                    else {
                        elt_temp_ty.walk(w);
                    }
                    w.endNonEmptyOption(temp_ty);
                }
                w.endNodeField("ty", temp_ty);
            }
            w.endNode(this, "AmbVarDecl", 3);
        }
    }

}
