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
 * Class WQId, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 18:58:01 CEST 2016
 */
@SuppressWarnings("unused")
public class WQId extends WIDL {
    private final List<String> _name;

    /**
     * Constructs a WQId.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public WQId(SpanInfo in_info, List<String> in_name) {
        super(in_info);
        if (in_name == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'name' to the WQId constructor was null");
        }
        _name = in_name;
    }

    final public List<String> getName() { return _name; }

    public <RetType> RetType accept(WIDLVisitor<RetType> visitor) {
        return visitor.forWQId(this);
    }

    public <RetType> RetType accept(WNodeVisitor<RetType> visitor) {
        return visitor.forWQId(this);
    }

    public void accept(WIDLVisitor_void visitor) {
        visitor.forWQId(this);
    }

    public void accept(WNodeVisitor_void visitor) {
        visitor.forWQId(this);
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
            WQId casted = (WQId) obj;
            SpanInfo temp_info = getInfo();
            SpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            List<String> temp_name = getName();
            List<String> casted_name = casted.getName();
            if (!(temp_name == casted_name || temp_name.equals(casted_name))) return false;
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
        List<String> temp_name = getName();
        code ^= temp_name.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected WQId() {
        _name = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "WQId", 2)) {
            SpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                w.visitUnknownObject(temp_info);
                w.endNodeField("info", temp_info);
            }
            List<String> temp_name = getName();
            if (w.visitNodeField("name", temp_name)) {
                if (w.visitIterated(temp_name)) {
                    int i_temp_name = 0;
                    for (String elt_temp_name : temp_name) {
                        if (w.visitIteratedElement(i_temp_name, elt_temp_name)) {
                            if (elt_temp_name == null) w.visitNull();
                            else {
                                w.visitString(elt_temp_name);
                            }
                        }
                        i_temp_name++;
                    }
                    w.endIterated(temp_name, i_temp_name);
                }
                w.endNodeField("name", temp_name);
            }
            w.endNode(this, "WQId", 2);
        }
    }

}
