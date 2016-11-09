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
 * Class AmbMemDecl, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Oct 24 17:42:23 CEST 2016
 */
@SuppressWarnings("unused")
public class AmbMemDecl extends AmbClsElt {
    private final List<Modifier> _mods;
    private final Property _prop;
    private final Option<Type> _typ;

    /**
     * Constructs a AmbMemDecl.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public AmbMemDecl(ASTSpanInfo in_info, List<Modifier> in_mods, Property in_prop, Option<Type> in_typ) {
        super(in_info);
        if (in_mods == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'mods' to the AmbMemDecl constructor was null");
        }
        _mods = in_mods;
        if (in_prop == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'prop' to the AmbMemDecl constructor was null");
        }
        _prop = in_prop;
        if (in_typ == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'typ' to the AmbMemDecl constructor was null");
        }
        _typ = in_typ;
    }

    final public List<Modifier> getMods() { return _mods; }
    final public Property getProp() { return _prop; }
    final public Option<Type> getTyp() { return _typ; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forAmbMemDecl(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forAmbMemDecl(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forAmbMemDecl(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forAmbMemDecl(this);
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
            AmbMemDecl casted = (AmbMemDecl) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            List<Modifier> temp_mods = getMods();
            List<Modifier> casted_mods = casted.getMods();
            if (!(temp_mods == casted_mods || temp_mods.equals(casted_mods))) return false;
            Property temp_prop = getProp();
            Property casted_prop = casted.getProp();
            if (!(temp_prop == casted_prop || temp_prop.equals(casted_prop))) return false;
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
        List<Modifier> temp_mods = getMods();
        code ^= temp_mods.hashCode();
        Property temp_prop = getProp();
        code ^= temp_prop.hashCode();
        Option<Type> temp_typ = getTyp();
        code ^= temp_typ.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected AmbMemDecl() {
        _mods = null;
        _prop = null;
        _typ = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "AmbMemDecl", 4)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            List<Modifier> temp_mods = getMods();
            if (w.visitNodeField("mods", temp_mods)) {
                if (w.visitIterated(temp_mods)) {
                    int i_temp_mods = 0;
                    for (Modifier elt_temp_mods : temp_mods) {
                        if (w.visitIteratedElement(i_temp_mods, elt_temp_mods)) {
                            if (elt_temp_mods == null) w.visitNull();
                            else {
                                elt_temp_mods.walk(w);
                            }
                        }
                        i_temp_mods++;
                    }
                    w.endIterated(temp_mods, i_temp_mods);
                }
                w.endNodeField("mods", temp_mods);
            }
            Property temp_prop = getProp();
            if (w.visitNodeField("prop", temp_prop)) {
                temp_prop.walk(w);
                w.endNodeField("prop", temp_prop);
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
            w.endNode(this, "AmbMemDecl", 4);
        }
    }

}
