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
 * Class RegExpQuantifier, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Fri Nov 18 18:56:40 CET 2016
 */
@SuppressWarnings("unused")
public class RegExpQuantifier extends RegExpTerm {
    private final RegExpQuantifierPrefix _prefix;
    private final boolean _greedy;

    /**
     * Constructs a RegExpQuantifier.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public RegExpQuantifier(RegExpNodeInfo in_info, RegExpQuantifierPrefix in_prefix, boolean in_greedy) {
        super(in_info);
        if (in_prefix == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'prefix' to the RegExpQuantifier constructor was null");
        }
        _prefix = in_prefix;
        _greedy = in_greedy;
    }

    final public RegExpQuantifierPrefix getPrefix() { return _prefix; }
    final public boolean isGreedy() { return _greedy; }

    public <RetType> RetType accept(RegExpAbstractNodeVisitor<RetType> visitor) {
        return visitor.forRegExpQuantifier(this);
    }

    public <RetType> RetType accept(RegExpNodeVisitor<RetType> visitor) {
        return visitor.forRegExpQuantifier(this);
    }

    public void accept(RegExpAbstractNodeVisitor_void visitor) {
        visitor.forRegExpQuantifier(this);
    }

    public void accept(RegExpNodeVisitor_void visitor) {
        visitor.forRegExpQuantifier(this);
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
            RegExpQuantifier casted = (RegExpQuantifier) obj;
            RegExpNodeInfo temp_info = getInfo();
            RegExpNodeInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            RegExpQuantifierPrefix temp_prefix = getPrefix();
            RegExpQuantifierPrefix casted_prefix = casted.getPrefix();
            if (!(temp_prefix == casted_prefix || temp_prefix.equals(casted_prefix))) return false;
            boolean temp_greedy = isGreedy();
            boolean casted_greedy = casted.isGreedy();
            if (!(temp_greedy == casted_greedy)) return false;
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
        RegExpNodeInfo temp_info = getInfo();
        code ^= temp_info.hashCode();
        RegExpQuantifierPrefix temp_prefix = getPrefix();
        code ^= temp_prefix.hashCode();
        boolean temp_greedy = isGreedy();
        code ^= temp_greedy ? 1231 : 1237;
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected RegExpQuantifier() {
        _prefix = null;
        _greedy = false;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "RegExpQuantifier", 3)) {
            RegExpNodeInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            RegExpQuantifierPrefix temp_prefix = getPrefix();
            if (w.visitNodeField("prefix", temp_prefix)) {
                temp_prefix.walk(w);
                w.endNodeField("prefix", temp_prefix);
            }
            boolean temp_greedy = isGreedy();
            if (w.visitNodeField("greedy", temp_greedy)) {
                w.visitBoolean(temp_greedy);
                w.endNodeField("greedy", temp_greedy);
            }
            w.endNode(this, "RegExpQuantifier", 3);
        }
    }

}
