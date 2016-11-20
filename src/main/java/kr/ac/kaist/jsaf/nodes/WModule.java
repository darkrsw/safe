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
 * Class WModule, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Fri Nov 18 18:56:40 CET 2016
 */
@SuppressWarnings("unused")
public class WModule extends WDefinition {
    private final String _name;
    private final List<WDefinition> _defs;

    /**
     * Constructs a WModule.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public WModule(SpanInfo in_info, List<WEAttribute> in_attrs, String in_name, List<WDefinition> in_defs) {
        super(in_info, in_attrs);
        if (in_name == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'name' to the WModule constructor was null");
        }
        _name = in_name.intern();
        if (in_defs == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'defs' to the WModule constructor was null");
        }
        _defs = in_defs;
    }

    /**
     * A constructor with some fields provided by default values.
     */
    public WModule(SpanInfo in_info, String in_name, List<WDefinition> in_defs) {
        this(in_info, Collections.<WEAttribute>emptyList(), in_name, in_defs);
    }

    final public String getName() { return _name; }
    final public List<WDefinition> getDefs() { return _defs; }

    public <RetType> RetType accept(WIDLVisitor<RetType> visitor) {
        return visitor.forWModule(this);
    }

    public <RetType> RetType accept(WNodeVisitor<RetType> visitor) {
        return visitor.forWModule(this);
    }

    public void accept(WIDLVisitor_void visitor) {
        visitor.forWModule(this);
    }

    public void accept(WNodeVisitor_void visitor) {
        visitor.forWModule(this);
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
            WModule casted = (WModule) obj;
            SpanInfo temp_info = getInfo();
            SpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            List<WEAttribute> temp_attrs = getAttrs();
            List<WEAttribute> casted_attrs = casted.getAttrs();
            if (!(temp_attrs == casted_attrs || temp_attrs.equals(casted_attrs))) return false;
            String temp_name = getName();
            String casted_name = casted.getName();
            if (!(temp_name == casted_name)) return false;
            List<WDefinition> temp_defs = getDefs();
            List<WDefinition> casted_defs = casted.getDefs();
            if (!(temp_defs == casted_defs || temp_defs.equals(casted_defs))) return false;
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
        List<WDefinition> temp_defs = getDefs();
        code ^= temp_defs.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected WModule() {
        _name = null;
        _defs = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "WModule", 4)) {
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
            List<WDefinition> temp_defs = getDefs();
            if (w.visitNodeField("defs", temp_defs)) {
                if (w.visitIterated(temp_defs)) {
                    int i_temp_defs = 0;
                    for (WDefinition elt_temp_defs : temp_defs) {
                        if (w.visitIteratedElement(i_temp_defs, elt_temp_defs)) {
                            if (elt_temp_defs == null) w.visitNull();
                            else {
                                elt_temp_defs.walk(w);
                            }
                        }
                        i_temp_defs++;
                    }
                    w.endIterated(temp_defs, i_temp_defs);
                }
                w.endNodeField("defs", temp_defs);
            }
            w.endNode(this, "WModule", 4);
        }
    }

}
