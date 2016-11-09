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
 * Class WEAString, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Oct 24 17:42:25 CEST 2016
 */
@SuppressWarnings("unused")
public class WEAString extends WEAttribute {
    private final String _str;

    /**
     * Constructs a WEAString.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public WEAString(String in_str) {
        super();
        if (in_str == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'str' to the WEAString constructor was null");
        }
        _str = in_str.intern();
    }

    final public String getStr() { return _str; }

    public <RetType> RetType accept(WNodeVisitor<RetType> visitor) {
        return visitor.forWEAString(this);
    }

    public void accept(WNodeVisitor_void visitor) {
        visitor.forWEAString(this);
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
            WEAString casted = (WEAString) obj;
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
        String temp_str = getStr();
        code ^= temp_str.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected WEAString() {
        _str = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "WEAString", 1)) {
            String temp_str = getStr();
            if (w.visitNodeField("str", temp_str)) {
                w.visitString(temp_str);
                w.endNodeField("str", temp_str);
            }
            w.endNode(this, "WEAString", 1);
        }
    }

}
