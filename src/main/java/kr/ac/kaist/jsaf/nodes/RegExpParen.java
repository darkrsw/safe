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
 * Class RegExpParen, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Wed Nov 09 11:44:32 CET 2016
 */
@SuppressWarnings("unused")
public class RegExpParen extends RegExpAtom {
    private final RegExpDisjunction _disjunction;

    /**
     * Constructs a RegExpParen.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public RegExpParen(RegExpNodeInfo in_info, RegExpDisjunction in_disjunction) {
        super(in_info);
        if (in_disjunction == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'disjunction' to the RegExpParen constructor was null");
        }
        _disjunction = in_disjunction;
    }

    final public RegExpDisjunction getDisjunction() { return _disjunction; }

    public <RetType> RetType accept(RegExpAbstractNodeVisitor<RetType> visitor) {
        return visitor.forRegExpParen(this);
    }

    public <RetType> RetType accept(RegExpNodeVisitor<RetType> visitor) {
        return visitor.forRegExpParen(this);
    }

    public void accept(RegExpAbstractNodeVisitor_void visitor) {
        visitor.forRegExpParen(this);
    }

    public void accept(RegExpNodeVisitor_void visitor) {
        visitor.forRegExpParen(this);
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
            RegExpParen casted = (RegExpParen) obj;
            RegExpNodeInfo temp_info = getInfo();
            RegExpNodeInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            RegExpDisjunction temp_disjunction = getDisjunction();
            RegExpDisjunction casted_disjunction = casted.getDisjunction();
            if (!(temp_disjunction == casted_disjunction || temp_disjunction.equals(casted_disjunction))) return false;
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
        RegExpDisjunction temp_disjunction = getDisjunction();
        code ^= temp_disjunction.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected RegExpParen() {
        _disjunction = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "RegExpParen", 2)) {
            RegExpNodeInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            RegExpDisjunction temp_disjunction = getDisjunction();
            if (w.visitNodeField("disjunction", temp_disjunction)) {
                temp_disjunction.walk(w);
                w.endNodeField("disjunction", temp_disjunction);
            }
            w.endNode(this, "RegExpParen", 2);
        }
    }

}
