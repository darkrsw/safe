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
 * Class WDictionary, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Oct 24 17:42:25 CEST 2016
 */
@SuppressWarnings("unused")
public class WDictionary extends WDefinition {
    private final String _name;
    private final Option<WId> _parent;
    private final List<WDictionaryMember> _members;

    /**
     * Constructs a WDictionary.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public WDictionary(SpanInfo in_info, List<WEAttribute> in_attrs, String in_name, Option<WId> in_parent, List<WDictionaryMember> in_members) {
        super(in_info, in_attrs);
        if (in_name == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'name' to the WDictionary constructor was null");
        }
        _name = in_name.intern();
        if (in_parent == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'parent' to the WDictionary constructor was null");
        }
        _parent = in_parent;
        if (in_members == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'members' to the WDictionary constructor was null");
        }
        _members = in_members;
    }

    /**
     * A constructor with some fields provided by default values.
     */
    public WDictionary(SpanInfo in_info, String in_name, Option<WId> in_parent, List<WDictionaryMember> in_members) {
        this(in_info, Collections.<WEAttribute>emptyList(), in_name, in_parent, in_members);
    }

    final public String getName() { return _name; }
    final public Option<WId> getParent() { return _parent; }
    final public List<WDictionaryMember> getMembers() { return _members; }

    public <RetType> RetType accept(WIDLVisitor<RetType> visitor) {
        return visitor.forWDictionary(this);
    }

    public <RetType> RetType accept(WNodeVisitor<RetType> visitor) {
        return visitor.forWDictionary(this);
    }

    public void accept(WIDLVisitor_void visitor) {
        visitor.forWDictionary(this);
    }

    public void accept(WNodeVisitor_void visitor) {
        visitor.forWDictionary(this);
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
            WDictionary casted = (WDictionary) obj;
            SpanInfo temp_info = getInfo();
            SpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            List<WEAttribute> temp_attrs = getAttrs();
            List<WEAttribute> casted_attrs = casted.getAttrs();
            if (!(temp_attrs == casted_attrs || temp_attrs.equals(casted_attrs))) return false;
            String temp_name = getName();
            String casted_name = casted.getName();
            if (!(temp_name == casted_name)) return false;
            Option<WId> temp_parent = getParent();
            Option<WId> casted_parent = casted.getParent();
            if (!(temp_parent == casted_parent || temp_parent.equals(casted_parent))) return false;
            List<WDictionaryMember> temp_members = getMembers();
            List<WDictionaryMember> casted_members = casted.getMembers();
            if (!(temp_members == casted_members || temp_members.equals(casted_members))) return false;
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
        String temp_name = getName();
        code ^= temp_name.hashCode();
        Option<WId> temp_parent = getParent();
        code ^= temp_parent.hashCode();
        List<WDictionaryMember> temp_members = getMembers();
        code ^= temp_members.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected WDictionary() {
        _name = null;
        _parent = null;
        _members = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "WDictionary", 5)) {
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
            String temp_name = getName();
            if (w.visitNodeField("name", temp_name)) {
                w.visitString(temp_name);
                w.endNodeField("name", temp_name);
            }
            Option<WId> temp_parent = getParent();
            if (w.visitNodeField("parent", temp_parent)) {
                if (temp_parent.isNone()) {
                    w.visitEmptyOption(temp_parent);
                }
                else if (w.visitNonEmptyOption(temp_parent)) {
                    WId elt_temp_parent = temp_parent.unwrap();
                    if (elt_temp_parent == null) w.visitNull();
                    else {
                        elt_temp_parent.walk(w);
                    }
                    w.endNonEmptyOption(temp_parent);
                }
                w.endNodeField("parent", temp_parent);
            }
            List<WDictionaryMember> temp_members = getMembers();
            if (w.visitNodeField("members", temp_members)) {
                if (w.visitIterated(temp_members)) {
                    int i_temp_members = 0;
                    for (WDictionaryMember elt_temp_members : temp_members) {
                        if (w.visitIteratedElement(i_temp_members, elt_temp_members)) {
                            if (elt_temp_members == null) w.visitNull();
                            else {
                                elt_temp_members.walk(w);
                            }
                        }
                        i_temp_members++;
                    }
                    w.endIterated(temp_members, i_temp_members);
                }
                w.endNodeField("members", temp_members);
            }
            w.endNode(this, "WDictionary", 5);
        }
    }

}
