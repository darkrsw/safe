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
 * Class WCallback, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 13:58:53 CEST 2016
 */
@SuppressWarnings("unused")
public class WCallback extends WDefinition {
    private final String _name;
    private final WType _returnType;
    private final List<WArgument> _args;

    /**
     * Constructs a WCallback.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public WCallback(SpanInfo in_info, List<WEAttribute> in_attrs, String in_name, WType in_returnType, List<WArgument> in_args) {
        super(in_info, in_attrs);
        if (in_name == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'name' to the WCallback constructor was null");
        }
        _name = in_name.intern();
        if (in_returnType == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'returnType' to the WCallback constructor was null");
        }
        _returnType = in_returnType;
        if (in_args == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'args' to the WCallback constructor was null");
        }
        _args = in_args;
    }

    /**
     * A constructor with some fields provided by default values.
     */
    public WCallback(SpanInfo in_info, String in_name, WType in_returnType, List<WArgument> in_args) {
        this(in_info, Collections.<WEAttribute>emptyList(), in_name, in_returnType, in_args);
    }

    final public String getName() { return _name; }
    final public WType getReturnType() { return _returnType; }
    final public List<WArgument> getArgs() { return _args; }

    public <RetType> RetType accept(WIDLVisitor<RetType> visitor) {
        return visitor.forWCallback(this);
    }

    public <RetType> RetType accept(WNodeVisitor<RetType> visitor) {
        return visitor.forWCallback(this);
    }

    public void accept(WIDLVisitor_void visitor) {
        visitor.forWCallback(this);
    }

    public void accept(WNodeVisitor_void visitor) {
        visitor.forWCallback(this);
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
            WCallback casted = (WCallback) obj;
            SpanInfo temp_info = getInfo();
            SpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            List<WEAttribute> temp_attrs = getAttrs();
            List<WEAttribute> casted_attrs = casted.getAttrs();
            if (!(temp_attrs == casted_attrs || temp_attrs.equals(casted_attrs))) return false;
            String temp_name = getName();
            String casted_name = casted.getName();
            if (!(temp_name == casted_name)) return false;
            WType temp_returnType = getReturnType();
            WType casted_returnType = casted.getReturnType();
            if (!(temp_returnType == casted_returnType || temp_returnType.equals(casted_returnType))) return false;
            List<WArgument> temp_args = getArgs();
            List<WArgument> casted_args = casted.getArgs();
            if (!(temp_args == casted_args || temp_args.equals(casted_args))) return false;
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
        WType temp_returnType = getReturnType();
        code ^= temp_returnType.hashCode();
        List<WArgument> temp_args = getArgs();
        code ^= temp_args.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected WCallback() {
        _name = null;
        _returnType = null;
        _args = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "WCallback", 5)) {
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
            WType temp_returnType = getReturnType();
            if (w.visitNodeField("returnType", temp_returnType)) {
                temp_returnType.walk(w);
                w.endNodeField("returnType", temp_returnType);
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
            w.endNode(this, "WCallback", 5);
        }
    }

}
