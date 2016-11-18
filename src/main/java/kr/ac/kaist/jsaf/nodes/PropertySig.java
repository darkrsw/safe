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
 * Class PropertySig, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Wed Nov 09 11:44:31 CET 2016
 */
@SuppressWarnings("unused")
public class PropertySig extends TypeMember {
    private final Property _prop;
    private final boolean _optional;
    private final Option<Type> _typ;

    /**
     * Constructs a PropertySig.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public PropertySig(ASTSpanInfo in_info, Property in_prop, boolean in_optional, Option<Type> in_typ) {
        super(in_info);
        if (in_prop == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'prop' to the PropertySig constructor was null");
        }
        _prop = in_prop;
        _optional = in_optional;
        if (in_typ == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'typ' to the PropertySig constructor was null");
        }
        _typ = in_typ;
    }

    final public Property getProp() { return _prop; }
    final public boolean isOptional() { return _optional; }
    final public Option<Type> getTyp() { return _typ; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forPropertySig(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forPropertySig(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forPropertySig(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forPropertySig(this);
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
            PropertySig casted = (PropertySig) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Property temp_prop = getProp();
            Property casted_prop = casted.getProp();
            if (!(temp_prop == casted_prop || temp_prop.equals(casted_prop))) return false;
            boolean temp_optional = isOptional();
            boolean casted_optional = casted.isOptional();
            if (!(temp_optional == casted_optional)) return false;
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
        Property temp_prop = getProp();
        code ^= temp_prop.hashCode();
        boolean temp_optional = isOptional();
        code ^= temp_optional ? 1231 : 1237;
        Option<Type> temp_typ = getTyp();
        code ^= temp_typ.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected PropertySig() {
        _prop = null;
        _optional = false;
        _typ = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "PropertySig", 4)) {
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
            w.endNode(this, "PropertySig", 4);
        }
    }

}
