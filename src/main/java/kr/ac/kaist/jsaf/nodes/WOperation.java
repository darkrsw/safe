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
 * Class WOperation, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Fri Nov 18 18:56:40 CET 2016
 */
@SuppressWarnings("unused")
public class WOperation extends WMember implements WInterfaceMember {
    private final List<WQualifier> _qualifiers;
    private final WType _typ;
    private final Option<String> _name;
    private final List<WArgument> _args;
    private final List<WQId> _exns;

    /**
     * Constructs a WOperation.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public WOperation(SpanInfo in_info, List<WEAttribute> in_attrs, List<WQualifier> in_qualifiers, WType in_typ, Option<String> in_name, List<WArgument> in_args, List<WQId> in_exns) {
        super(in_info, in_attrs);
        if (in_qualifiers == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'qualifiers' to the WOperation constructor was null");
        }
        _qualifiers = in_qualifiers;
        if (in_typ == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'typ' to the WOperation constructor was null");
        }
        _typ = in_typ;
        if (in_name == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'name' to the WOperation constructor was null");
        }
        _name = in_name;
        if (in_args == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'args' to the WOperation constructor was null");
        }
        _args = in_args;
        if (in_exns == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'exns' to the WOperation constructor was null");
        }
        _exns = in_exns;
    }

    /**
     * A constructor with some fields provided by default values.
     */
    public WOperation(SpanInfo in_info, List<WEAttribute> in_attrs, List<WQualifier> in_qualifiers, WType in_typ, Option<String> in_name, List<WArgument> in_args) {
        this(in_info, in_attrs, in_qualifiers, in_typ, in_name, in_args, Collections.<WQId>emptyList());
    }

    /**
     * A constructor with some fields provided by default values.
     */
    public WOperation(SpanInfo in_info, List<WQualifier> in_qualifiers, WType in_typ, Option<String> in_name, List<WArgument> in_args, List<WQId> in_exns) {
        this(in_info, Collections.<WEAttribute>emptyList(), in_qualifiers, in_typ, in_name, in_args, in_exns);
    }

    /**
     * A constructor with some fields provided by default values.
     */
    public WOperation(SpanInfo in_info, List<WQualifier> in_qualifiers, WType in_typ, Option<String> in_name, List<WArgument> in_args) {
        this(in_info, Collections.<WEAttribute>emptyList(), in_qualifiers, in_typ, in_name, in_args, Collections.<WQId>emptyList());
    }

    final public List<WQualifier> getQualifiers() { return _qualifiers; }
    final public WType getTyp() { return _typ; }
    final public Option<String> getName() { return _name; }
    final public List<WArgument> getArgs() { return _args; }
    final public List<WQId> getExns() { return _exns; }

    public <RetType> RetType accept(WIDLVisitor<RetType> visitor) {
        return visitor.forWOperation(this);
    }

    public <RetType> RetType accept(WNodeVisitor<RetType> visitor) {
        return visitor.forWOperation(this);
    }

    public void accept(WIDLVisitor_void visitor) {
        visitor.forWOperation(this);
    }

    public void accept(WNodeVisitor_void visitor) {
        visitor.forWOperation(this);
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
            WOperation casted = (WOperation) obj;
            SpanInfo temp_info = getInfo();
            SpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            List<WEAttribute> temp_attrs = getAttrs();
            List<WEAttribute> casted_attrs = casted.getAttrs();
            if (!(temp_attrs == casted_attrs || temp_attrs.equals(casted_attrs))) return false;
            List<WQualifier> temp_qualifiers = getQualifiers();
            List<WQualifier> casted_qualifiers = casted.getQualifiers();
            if (!(temp_qualifiers == casted_qualifiers || temp_qualifiers.equals(casted_qualifiers))) return false;
            WType temp_typ = getTyp();
            WType casted_typ = casted.getTyp();
            if (!(temp_typ == casted_typ || temp_typ.equals(casted_typ))) return false;
            Option<String> temp_name = getName();
            Option<String> casted_name = casted.getName();
            if (!(temp_name == casted_name || temp_name.equals(casted_name))) return false;
            List<WArgument> temp_args = getArgs();
            List<WArgument> casted_args = casted.getArgs();
            if (!(temp_args == casted_args || temp_args.equals(casted_args))) return false;
            List<WQId> temp_exns = getExns();
            List<WQId> casted_exns = casted.getExns();
            if (!(temp_exns == casted_exns || temp_exns.equals(casted_exns))) return false;
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
        List<WQualifier> temp_qualifiers = getQualifiers();
        code ^= temp_qualifiers.hashCode();
        WType temp_typ = getTyp();
        code ^= temp_typ.hashCode();
        Option<String> temp_name = getName();
        code ^= temp_name.hashCode();
        List<WArgument> temp_args = getArgs();
        code ^= temp_args.hashCode();
        List<WQId> temp_exns = getExns();
        code ^= temp_exns.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected WOperation() {
        _qualifiers = null;
        _typ = null;
        _name = null;
        _args = null;
        _exns = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "WOperation", 7)) {
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
            List<WQualifier> temp_qualifiers = getQualifiers();
            if (w.visitNodeField("qualifiers", temp_qualifiers)) {
                if (w.visitIterated(temp_qualifiers)) {
                    int i_temp_qualifiers = 0;
                    for (WQualifier elt_temp_qualifiers : temp_qualifiers) {
                        if (w.visitIteratedElement(i_temp_qualifiers, elt_temp_qualifiers)) {
                            if (elt_temp_qualifiers == null) w.visitNull();
                            else {
                                elt_temp_qualifiers.walk(w);
                            }
                        }
                        i_temp_qualifiers++;
                    }
                    w.endIterated(temp_qualifiers, i_temp_qualifiers);
                }
                w.endNodeField("qualifiers", temp_qualifiers);
            }
            WType temp_typ = getTyp();
            if (w.visitNodeField("typ", temp_typ)) {
                temp_typ.walk(w);
                w.endNodeField("typ", temp_typ);
            }
            Option<String> temp_name = getName();
            if (w.visitNodeField("name", temp_name)) {
                if (temp_name.isNone()) {
                    w.visitEmptyOption(temp_name);
                }
                else if (w.visitNonEmptyOption(temp_name)) {
                    String elt_temp_name = temp_name.unwrap();
                    if (elt_temp_name == null) w.visitNull();
                    else {
                        w.visitString(elt_temp_name);
                    }
                    w.endNonEmptyOption(temp_name);
                }
                w.endNodeField("name", temp_name);
            }
            List<WArgument> temp_args = getArgs();
            if (w.visitNodeField("args", temp_args)) {
                if (w.visitIterated(temp_args)) {
                    int i_temp_args = 0;
                    for (WArgument elt_temp_args : temp_args) {
                        if (w.visitIteratedElement(i_temp_args, elt_temp_args)) {
                            if (elt_temp_args == null) w.visitNull();
                            else {
                                elt_temp_args.walk(w);
                            }
                        }
                        i_temp_args++;
                    }
                    w.endIterated(temp_args, i_temp_args);
                }
                w.endNodeField("args", temp_args);
            }
            List<WQId> temp_exns = getExns();
            if (w.visitNodeField("exns", temp_exns)) {
                if (w.visitIterated(temp_exns)) {
                    int i_temp_exns = 0;
                    for (WQId elt_temp_exns : temp_exns) {
                        if (w.visitIteratedElement(i_temp_exns, elt_temp_exns)) {
                            if (elt_temp_exns == null) w.visitNull();
                            else {
                                elt_temp_exns.walk(w);
                            }
                        }
                        i_temp_exns++;
                    }
                    w.endIterated(temp_exns, i_temp_exns);
                }
                w.endNodeField("exns", temp_exns);
            }
            w.endNode(this, "WOperation", 7);
        }
    }

}
