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
 * Class RegExpCapturingParensInfo, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 18:58:01 CEST 2016
 */
@SuppressWarnings("unused")
public class RegExpCapturingParensInfo extends RegExpNodeInfo {
    private final int _parenCount;

    /**
     * Constructs a RegExpCapturingParensInfo.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public RegExpCapturingParensInfo(int in_parenCount) {
        super();
        _parenCount = in_parenCount;
    }

    final public int getParenCount() { return _parenCount; }

    public <RetType> RetType accept(RegExpNodeVisitor<RetType> visitor) {
        return visitor.forRegExpCapturingParensInfo(this);
    }

    public void accept(RegExpNodeVisitor_void visitor) {
        visitor.forRegExpCapturingParensInfo(this);
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
            RegExpCapturingParensInfo casted = (RegExpCapturingParensInfo) obj;
            int temp_parenCount = getParenCount();
            int casted_parenCount = casted.getParenCount();
            if (!(temp_parenCount == casted_parenCount)) return false;
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
        int temp_parenCount = getParenCount();
        code ^= temp_parenCount;
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected RegExpCapturingParensInfo() {
        _parenCount = 0;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "RegExpCapturingParensInfo", 1)) {
            int temp_parenCount = getParenCount();
            if (w.visitNodeField("parenCount", temp_parenCount)) {
                w.visitInt(temp_parenCount);
                w.endNodeField("parenCount", temp_parenCount);
            }
            w.endNode(this, "RegExpCapturingParensInfo", 1);
        }
    }

}
