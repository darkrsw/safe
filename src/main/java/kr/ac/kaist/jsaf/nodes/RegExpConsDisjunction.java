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
 * Class RegExpConsDisjunction, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 13:58:53 CEST 2016
 */
@SuppressWarnings("unused")
public class RegExpConsDisjunction extends RegExpDisjunction {
    private final RegExpAlternative _a;
    private final RegExpDisjunction _d;

    /**
     * Constructs a RegExpConsDisjunction.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public RegExpConsDisjunction(RegExpNodeInfo in_info, RegExpAlternative in_a, RegExpDisjunction in_d) {
        super(in_info);
        if (in_a == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'a' to the RegExpConsDisjunction constructor was null");
        }
        _a = in_a;
        if (in_d == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'd' to the RegExpConsDisjunction constructor was null");
        }
        _d = in_d;
    }

    final public RegExpAlternative getA() { return _a; }
    final public RegExpDisjunction getD() { return _d; }

    public <RetType> RetType accept(RegExpAbstractNodeVisitor<RetType> visitor) {
        return visitor.forRegExpConsDisjunction(this);
    }

    public <RetType> RetType accept(RegExpNodeVisitor<RetType> visitor) {
        return visitor.forRegExpConsDisjunction(this);
    }

    public void accept(RegExpAbstractNodeVisitor_void visitor) {
        visitor.forRegExpConsDisjunction(this);
    }

    public void accept(RegExpNodeVisitor_void visitor) {
        visitor.forRegExpConsDisjunction(this);
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
            RegExpConsDisjunction casted = (RegExpConsDisjunction) obj;
            RegExpNodeInfo temp_info = getInfo();
            RegExpNodeInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            RegExpAlternative temp_a = getA();
            RegExpAlternative casted_a = casted.getA();
            if (!(temp_a == casted_a || temp_a.equals(casted_a))) return false;
            RegExpDisjunction temp_d = getD();
            RegExpDisjunction casted_d = casted.getD();
            if (!(temp_d == casted_d || temp_d.equals(casted_d))) return false;
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
        RegExpAlternative temp_a = getA();
        code ^= temp_a.hashCode();
        RegExpDisjunction temp_d = getD();
        code ^= temp_d.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected RegExpConsDisjunction() {
        _a = null;
        _d = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "RegExpConsDisjunction", 3)) {
            RegExpNodeInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            RegExpAlternative temp_a = getA();
            if (w.visitNodeField("a", temp_a)) {
                temp_a.walk(w);
                w.endNodeField("a", temp_a);
            }
            RegExpDisjunction temp_d = getD();
            if (w.visitNodeField("d", temp_d)) {
                temp_d.walk(w);
                w.endNodeField("d", temp_d);
            }
            w.endNode(this, "RegExpConsDisjunction", 3);
        }
    }

}
