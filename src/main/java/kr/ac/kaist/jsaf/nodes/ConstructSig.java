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
 * Class ConstructSig, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Fri Nov 18 18:56:39 CET 2016
 */
@SuppressWarnings("unused")
public class ConstructSig extends TypeMember {
    private final List<TypeParam> _tparams;
    private final List<Param> _params;
    private final Option<Type> _typ;

    /**
     * Constructs a ConstructSig.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public ConstructSig(ASTSpanInfo in_info, List<TypeParam> in_tparams, List<Param> in_params, Option<Type> in_typ) {
        super(in_info);
        if (in_tparams == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'tparams' to the ConstructSig constructor was null");
        }
        _tparams = in_tparams;
        if (in_params == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'params' to the ConstructSig constructor was null");
        }
        _params = in_params;
        if (in_typ == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'typ' to the ConstructSig constructor was null");
        }
        _typ = in_typ;
    }

    final public List<TypeParam> getTparams() { return _tparams; }
    final public List<Param> getParams() { return _params; }
    final public Option<Type> getTyp() { return _typ; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forConstructSig(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forConstructSig(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forConstructSig(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forConstructSig(this);
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
            ConstructSig casted = (ConstructSig) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            List<TypeParam> temp_tparams = getTparams();
            List<TypeParam> casted_tparams = casted.getTparams();
            if (!(temp_tparams == casted_tparams || temp_tparams.equals(casted_tparams))) return false;
            List<Param> temp_params = getParams();
            List<Param> casted_params = casted.getParams();
            if (!(temp_params == casted_params || temp_params.equals(casted_params))) return false;
            Option<Type> temp_typ = getTyp();
            Option<Type> casted_typ = casted.getTyp();
            if (!(temp_typ == casted_typ || temp_typ.equals(casted_typ))) return false;
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
        List<TypeParam> temp_tparams = getTparams();
        code ^= temp_tparams.hashCode();
        List<Param> temp_params = getParams();
        code ^= temp_params.hashCode();
        Option<Type> temp_typ = getTyp();
        code ^= temp_typ.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected ConstructSig() {
        _tparams = null;
        _params = null;
        _typ = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "ConstructSig", 4)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            List<TypeParam> temp_tparams = getTparams();
            if (w.visitNodeField("tparams", temp_tparams)) {
                if (w.visitIterated(temp_tparams)) {
                    int i_temp_tparams = 0;
                    for (TypeParam elt_temp_tparams : temp_tparams) {
                        if (w.visitIteratedElement(i_temp_tparams, elt_temp_tparams)) {
                            if (elt_temp_tparams == null) w.visitNull();
                            else {
                                elt_temp_tparams.walk(w);
                            }
                        }
                        i_temp_tparams++;
                    }
                    w.endIterated(temp_tparams, i_temp_tparams);
                }
                w.endNodeField("tparams", temp_tparams);
            }
            List<Param> temp_params = getParams();
            if (w.visitNodeField("params", temp_params)) {
                if (w.visitIterated(temp_params)) {
                    int i_temp_params = 0;
                    for (Param elt_temp_params : temp_params) {
                        if (w.visitIteratedElement(i_temp_params, elt_temp_params)) {
                            if (elt_temp_params == null) w.visitNull();
                            else {
                                elt_temp_params.walk(w);
                            }
                        }
                        i_temp_params++;
                    }
                    w.endIterated(temp_params, i_temp_params);
                }
                w.endNodeField("params", temp_params);
            }
            Option<Type> temp_typ = getTyp();
            if (w.visitNodeField("typ", temp_typ)) {
                if (temp_typ.isNone()) {
                    w.visitEmptyOption(temp_typ);
                }
                else if (w.visitNonEmptyOption(temp_typ)) {
                    Type elt_temp_typ = temp_typ.unwrap();
                    if (elt_temp_typ == null) w.visitNull();
                    else {
                        elt_temp_typ.walk(w);
                    }
                    w.endNonEmptyOption(temp_typ);
                }
                w.endNodeField("typ", temp_typ);
            }
            w.endNode(this, "ConstructSig", 4);
        }
    }

}
