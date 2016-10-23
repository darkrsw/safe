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
 * Class GetProp, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 13:58:52 CEST 2016
 */
@SuppressWarnings("unused")
public class GetProp extends Member {
    private final Functional _ftn;

    /**
     * Constructs a GetProp.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public GetProp(ASTSpanInfo in_info, Property in_prop, Functional in_ftn) {
        super(in_info, in_prop);
        if (in_ftn == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'ftn' to the GetProp constructor was null");
        }
        _ftn = in_ftn;
    }

    final public Functional getFtn() { return _ftn; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forGetProp(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forGetProp(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forGetProp(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forGetProp(this);
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
            GetProp casted = (GetProp) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Property temp_prop = getProp();
            Property casted_prop = casted.getProp();
            if (!(temp_prop == casted_prop || temp_prop.equals(casted_prop))) return false;
            Functional temp_ftn = getFtn();
            Functional casted_ftn = casted.getFtn();
            if (!(temp_ftn == casted_ftn || temp_ftn.equals(casted_ftn))) return false;
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
        Functional temp_ftn = getFtn();
        code ^= temp_ftn.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected GetProp() {
        _ftn = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "GetProp", 3)) {
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
            Functional temp_ftn = getFtn();
            if (w.visitNodeField("ftn", temp_ftn)) {
                temp_ftn.walk(w);
                w.endNodeField("ftn", temp_ftn);
            }
            w.endNode(this, "GetProp", 3);
        }
    }

}