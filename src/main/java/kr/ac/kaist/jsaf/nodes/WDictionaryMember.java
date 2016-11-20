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
 * Class WDictionaryMember, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Fri Nov 18 18:56:40 CET 2016
 */
@SuppressWarnings("unused")
public class WDictionaryMember extends WMember {
    private final WType _typ;
    private final String _name;
    private final Option<WLiteral> _default;

    /**
     * Constructs a WDictionaryMember.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public WDictionaryMember(SpanInfo in_info, List<WEAttribute> in_attrs, WType in_typ, String in_name, Option<WLiteral> in_default) {
        super(in_info, in_attrs);
        if (in_typ == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'typ' to the WDictionaryMember constructor was null");
        }
        _typ = in_typ;
        if (in_name == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'name' to the WDictionaryMember constructor was null");
        }
        _name = in_name.intern();
        if (in_default == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'default' to the WDictionaryMember constructor was null");
        }
        _default = in_default;
    }

    /**
     * A constructor with some fields provided by default values.
     */
    public WDictionaryMember(SpanInfo in_info, WType in_typ, String in_name, Option<WLiteral> in_default) {
        this(in_info, Collections.<WEAttribute>emptyList(), in_typ, in_name, in_default);
    }

    final public WType getTyp() { return _typ; }
    final public String getName() { return _name; }
    final public Option<WLiteral> getDefault() { return _default; }

    public <RetType> RetType accept(WIDLVisitor<RetType> visitor) {
        return visitor.forWDictionaryMember(this);
    }

    public <RetType> RetType accept(WNodeVisitor<RetType> visitor) {
        return visitor.forWDictionaryMember(this);
    }

    public void accept(WIDLVisitor_void visitor) {
        visitor.forWDictionaryMember(this);
    }

    public void accept(WNodeVisitor_void visitor) {
        visitor.forWDictionaryMember(this);
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
            WDictionaryMember casted = (WDictionaryMember) obj;
            SpanInfo temp_info = getInfo();
            SpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            List<WEAttribute> temp_attrs = getAttrs();
            List<WEAttribute> casted_attrs = casted.getAttrs();
            if (!(temp_attrs == casted_attrs || temp_attrs.equals(casted_attrs))) return false;
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
        List<WEAttribute> temp_attrs = getAttrs();
        code ^= temp_attrs.hashCode();
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
    protected WDictionaryMember() {
        _typ = null;
        _name = null;
        _default = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "WDictionaryMember", 5)) {
            SpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                w.visitUnknownObject(temp_info);
                w.endNodeField("info", temp_info);
            }
            List<WEAttribute> temp_attrs = getAttrs();
            if (w.visitNodeField("attrs", temp_attrs)) {
                if (w.visitIterated(temp_attrs)) {
                    int i_temp_attrs = 0;
                    for (WEAttribute elt_temp_attrs : temp_attrs) {
                        if (w.visitIteratedElement(i_temp_attrs, elt_temp_attrs)) {
                            if (elt_temp_attrs == null) w.visitNull();
                            else {
                                elt_temp_attrs.walk(w);
                            }
                        }
                        i_temp_attrs++;
                    }
                    w.endIterated(temp_attrs, i_temp_attrs);
                }
                w.endNodeField("attrs", temp_attrs);
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
            w.endNode(this, "WDictionaryMember", 5);
        }
    }

}
