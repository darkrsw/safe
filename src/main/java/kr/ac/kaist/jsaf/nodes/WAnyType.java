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
 * Class WAnyType, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Nov 21 18:10:57 CET 2016
 */
@SuppressWarnings("unused")
public class WAnyType extends WType {

    /**
     * Constructs a WAnyType.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public WAnyType(SpanInfo in_info, List<WTypeSuffix> in_suffix) {
        super(in_info, in_suffix);
    }

    /**
     * A constructor with some fields provided by default values.
     */
    public WAnyType(SpanInfo in_info) {
        this(in_info, Collections.<WTypeSuffix>emptyList());
    }


    public <RetType> RetType accept(WIDLVisitor<RetType> visitor) {
        return visitor.forWAnyType(this);
    }

    public <RetType> RetType accept(WNodeVisitor<RetType> visitor) {
        return visitor.forWAnyType(this);
    }

    public void accept(WIDLVisitor_void visitor) {
        visitor.forWAnyType(this);
    }

    public void accept(WNodeVisitor_void visitor) {
        visitor.forWAnyType(this);
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
            WAnyType casted = (WAnyType) obj;
            SpanInfo temp_info = getInfo();
            SpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            List<WTypeSuffix> temp_suffix = getSuffix();
            List<WTypeSuffix> casted_suffix = casted.getSuffix();
            if (!(temp_suffix == casted_suffix || temp_suffix.equals(casted_suffix))) return false;
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
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected WAnyType() {
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "WAnyType", 2)) {
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
            w.endNode(this, "WAnyType", 2);
        }
    }

}
