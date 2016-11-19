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
 * Class PropStr, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Fri Nov 18 18:56:39 CET 2016
 */
@SuppressWarnings("unused")
public class PropStr extends Property {
    private final String _str;

    /**
     * Constructs a PropStr.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public PropStr(ASTSpanInfo in_info, String in_str) {
        super(in_info);
        if (in_str == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'str' to the PropStr constructor was null");
        }
        _str = in_str.intern();
    }

    final public String getStr() { return _str; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forPropStr(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forPropStr(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forPropStr(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forPropStr(this);
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
            PropStr casted = (PropStr) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            String temp_str = getStr();
            String casted_str = casted.getStr();
            if (!(temp_str == casted_str)) return false;
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
        String temp_str = getStr();
        code ^= temp_str.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected PropStr() {
        _str = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "PropStr", 2)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            String temp_str = getStr();
            if (w.visitNodeField("str", temp_str)) {
                w.visitString(temp_str);
                w.endNodeField("str", temp_str);
            }
            w.endNode(this, "PropStr", 2);
        }
    }

}
