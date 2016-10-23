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
 * Class WArgument, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 13:58:53 CEST 2016
 */
@SuppressWarnings("unused")
public class WArgument extends WIDL {
    private final List<WEAttribute> _attributes;
    private final WType _typ;
    private final String _name;
    private final Option<WLiteral> _default;

    /**
     * Constructs a WArgument.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public WArgument(SpanInfo in_info, List<WEAttribute> in_attributes, WType in_typ, String in_name, Option<WLiteral> in_default) {
        super(in_info);
        if (in_attributes == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'attributes' to the WArgument constructor was null");
        }
        _attributes = in_attributes;
        if (in_typ == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'typ' to the WArgument constructor was null");
        }
        _typ = in_typ;
        if (in_name == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'name' to the WArgument constructor was null");
        }
        _name = in_name.intern();
        if (in_default == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'default' to the WArgument constructor was null");
        }
        _default = in_default;
    }

    /**
     * A constructor with some fields provided by default values.
     */
    public WArgument(SpanInfo in_info, WType in_typ, String in_name, Option<WLiteral> in_default) {
        this(in_info, Collections.<WEAttribute>emptyList(), in_typ, in_name, in_default);
    }

    final public List<WEAttribute> getAttributes() { return _attributes; }
    final public WType getTyp() { return _typ; }
    final public String getName() { return _name; }
    final public Option<WLiteral> getDefault() { return _default; }

    public <RetType> RetType accept(WIDLVisitor<RetType> visitor) {
        return visitor.forWArgument(this);
    }

    public <RetType> RetType accept(WNodeVisitor<RetType> visitor) {
        return visitor.forWArgument(this);
    }

    public void accept(WIDLVisitor_void visitor) {
        visitor.forWArgument(this);
    }

    public void accept(WNodeVisitor_void visitor) {
        visitor.forWArgument(this);
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
            WArgument casted = (WArgument) obj;
            SpanInfo temp_info = getInfo();
            SpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            List<WEAttribute> temp_attributes = getAttributes();
            List<WEAttribute> casted_attributes = casted.getAttributes();
            if (!(temp_attributes == casted_attributes || temp_attributes.equals(casted_attributes))) return false;
            WType temp_typ = getTyp();
            WType casted_typ = casted.getTyp();
            if (!(temp_typ == casted_typ || temp_typ.equals(casted_typ))) return false;
            String temp_name = getName();
            String casted_name = casted.getName();
            if (!(temp_name == casted_name)) return false;
            Option<WLiteral> temp_default = getDefault();
            Option<WLiteral> casted_default = casted.getDefault();
            if (!(temp_default == casted_default || temp_default.equals(casted_default))) return false;
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
        SpanInfo temp_info = getInfo();
        code ^= temp_info.hashCode();
        List<WEAttribute> temp_attributes = getAttributes();
        code ^= temp_attributes.hashCode();
        WType temp_typ = getTyp();
        code ^= temp_typ.hashCode();
        String temp_name = getName();
        code ^= temp_name.hashCode();
        Option<WLiteral> temp_default = getDefault();
        code ^= temp_default.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected WArgument() {
        _attributes = null;
        _typ = null;
        _name = null;
        _default = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "WArgument", 5)) {
            SpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                w.visitUnknownObject(temp_info);
                w.endNodeField("info", temp_info);
            }
            List<WEAttribute> temp_attributes = getAttributes();
            if (w.visitNodeField("attributes", temp_attributes)) {
                if (w.visitIterated(temp_attributes)) {
                    int i_temp_attributes = 0;
                    for (WEAttribute elt_temp_attributes : temp_attributes) {
                        if (w.visitIteratedElement(i_temp_attributes, elt_temp_attributes)) {
                            if (elt_temp_attributes == null) w.visitNull();
                            else {
                                elt_temp_attributes.walk(w);
                            }
                        }
                        i_temp_attributes++;
                    }
                    w.endIterated(temp_attributes, i_temp_attributes);
                }
                w.endNodeField("attributes", temp_attributes);
            }
            WType temp_typ = getTyp();
            if (w.visitNodeField("typ", temp_typ)) {
                temp_typ.walk(w);
                w.endNodeField("typ", temp_typ);
            }
            String temp_name = getName();
            if (w.visitNodeField("name", temp_name)) {
                w.visitString(temp_name);
                w.endNodeField("name", temp_name);
            }
            Option<WLiteral> temp_default = getDefault();
            if (w.visitNodeField("default", temp_default)) {
                if (temp_default.isNone()) {
                    w.visitEmptyOption(temp_default);
                }
                else if (w.visitNonEmptyOption(temp_default)) {
                    WLiteral elt_temp_default = temp_default.unwrap();
                    if (elt_temp_default == null) w.visitNull();
                    else {
                        elt_temp_default.walk(w);
                    }
                    w.endNonEmptyOption(temp_default);
                }
                w.endNodeField("default", temp_default);
            }
            w.endNode(this, "WArgument", 5);
        }
    }

}
