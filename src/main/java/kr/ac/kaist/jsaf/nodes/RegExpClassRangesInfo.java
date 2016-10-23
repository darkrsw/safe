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
 * Class RegExpClassRangesInfo, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 13:58:53 CEST 2016
 */
@SuppressWarnings("unused")
public class RegExpClassRangesInfo extends RegExpNodeInfo {
    private final boolean _noCaret;

    /**
     * Constructs a RegExpClassRangesInfo.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public RegExpClassRangesInfo(boolean in_noCaret) {
        super();
        _noCaret = in_noCaret;
    }

    final public boolean isNoCaret() { return _noCaret; }

    public <RetType> RetType accept(RegExpNodeVisitor<RetType> visitor) {
        return visitor.forRegExpClassRangesInfo(this);
    }

    public void accept(RegExpNodeVisitor_void visitor) {
        visitor.forRegExpClassRangesInfo(this);
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
            RegExpClassRangesInfo casted = (RegExpClassRangesInfo) obj;
            boolean temp_noCaret = isNoCaret();
            boolean casted_noCaret = casted.isNoCaret();
            if (!(temp_noCaret == casted_noCaret)) return false;
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
        boolean temp_noCaret = isNoCaret();
        code ^= temp_noCaret ? 1231 : 1237;
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected RegExpClassRangesInfo() {
        _noCaret = false;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "RegExpClassRangesInfo", 1)) {
            boolean temp_noCaret = isNoCaret();
            if (w.visitNodeField("noCaret", temp_noCaret)) {
                w.visitBoolean(temp_noCaret);
                w.endNodeField("noCaret", temp_noCaret);
            }
            w.endNode(this, "RegExpClassRangesInfo", 1);
        }
    }

}
