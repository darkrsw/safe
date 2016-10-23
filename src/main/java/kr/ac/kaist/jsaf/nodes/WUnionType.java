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
 * Class WUnionType, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 13:58:53 CEST 2016
 */
@SuppressWarnings("unused")
public class WUnionType extends WType {
    private final List<WType> _types;

    /**
     * Constructs a WUnionType.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public WUnionType(SpanInfo in_info, List<WTypeSuffix> in_suffix, List<WType> in_types) {
        super(in_info, in_suffix);
        if (in_types == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'types' to the WUnionType constructor was null");
        }
        _types = in_types;
    }

    /**
     * A constructor with some fields provided by default values.
     */
    public WUnionType(SpanInfo in_info, List<WType> in_types) {
        this(in_info, Collections.<WTypeSuffix>emptyList(), in_types);
    }

    final public List<WType> getTypes() { return _types; }

    public <RetType> RetType accept(WIDLVisitor<RetType> visitor) {
        return visitor.forWUnionType(this);
    }

    public <RetType> RetType accept(WNodeVisitor<RetType> visitor) {
        return visitor.forWUnionType(this);
    }

    public void accept(WIDLVisitor_void visitor) {
        visitor.forWUnionType(this);
    }

    public void accept(WNodeVisitor_void visitor) {
        visitor.forWUnionType(this);
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
            WUnionType casted = (WUnionType) obj;
            SpanInfo temp_info = getInfo();
            SpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            List<WTypeSuffix> temp_suffix = getSuffix();
            List<WTypeSuffix> casted_suffix = casted.getSuffix();
            if (!(temp_suffix == casted_suffix || temp_suffix.equals(casted_suffix))) return false;
            List<WType> temp_types = getTypes();
            List<WType> casted_types = casted.getTypes();
            if (!(temp_types == casted_types || temp_types.equals(casted_types))) return false;
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
        List<WTypeSuffix> temp_suffix = getSuffix();
        code ^= temp_suffix.hashCode();
        List<WType> temp_types = getTypes();
        code ^= temp_types.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected WUnionType() {
        _types = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "WUnionType", 3)) {
            SpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                w.visitUnknownObject(temp_info);
                w.endNodeField("info", temp_info);
            }
            List<WTypeSuffix> temp_suffix = getSuffix();
            if (w.visitNodeField("suffix", temp_suffix)) {
                if (w.visitIterated(temp_suffix)) {
                    int i_temp_suffix = 0;
                    for (WTypeSuffix elt_temp_suffix : temp_suffix) {
                        if (w.visitIteratedElement(i_temp_suffix, elt_temp_suffix)) {
                            if (elt_temp_suffix == null) w.visitNull();
                            else {
                                elt_temp_suffix.walk(w);
                            }
                        }
                        i_temp_suffix++;
                    }
                    w.endIterated(temp_suffix, i_temp_suffix);
                }
                w.endNodeField("suffix", temp_suffix);
            }
            List<WType> temp_types = getTypes();
            if (w.visitNodeField("types", temp_types)) {
                if (w.visitIterated(temp_types)) {
                    int i_temp_types = 0;
                    for (WType elt_temp_types : temp_types) {
                        if (w.visitIteratedElement(i_temp_types, elt_temp_types)) {
                            if (elt_temp_types == null) w.visitNull();
                            else {
                                elt_temp_types.walk(w);
                            }
                        }
                        i_temp_types++;
                    }
                    w.endIterated(temp_types, i_temp_types);
                }
                w.endNodeField("types", temp_types);
            }
            w.endNode(this, "WUnionType", 3);
        }
    }

}
