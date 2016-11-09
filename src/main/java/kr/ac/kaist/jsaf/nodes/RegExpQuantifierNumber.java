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
 * Class RegExpQuantifierNumber, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Oct 24 17:42:24 CEST 2016
 */
@SuppressWarnings("unused")
public class RegExpQuantifierNumber extends RegExpQuantifierPrefix {
    private final Integer _first;
    private final Option<Integer> _second;

    /**
     * Constructs a RegExpQuantifierNumber.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public RegExpQuantifierNumber(RegExpNodeInfo in_info, Integer in_first, Option<Integer> in_second) {
        super(in_info);
        if (in_first == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'first' to the RegExpQuantifierNumber constructor was null");
        }
        _first = in_first;
        if (in_second == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'second' to the RegExpQuantifierNumber constructor was null");
        }
        _second = in_second;
    }

    final public Integer getFirst() { return _first; }
    final public Option<Integer> getSecond() { return _second; }

    public <RetType> RetType accept(RegExpAbstractNodeVisitor<RetType> visitor) {
        return visitor.forRegExpQuantifierNumber(this);
    }

    public <RetType> RetType accept(RegExpNodeVisitor<RetType> visitor) {
        return visitor.forRegExpQuantifierNumber(this);
    }

    public void accept(RegExpAbstractNodeVisitor_void visitor) {
        visitor.forRegExpQuantifierNumber(this);
    }

    public void accept(RegExpNodeVisitor_void visitor) {
        visitor.forRegExpQuantifierNumber(this);
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
            RegExpQuantifierNumber casted = (RegExpQuantifierNumber) obj;
            RegExpNodeInfo temp_info = getInfo();
            RegExpNodeInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Integer temp_first = getFirst();
            Integer casted_first = casted.getFirst();
            if (!(temp_first == casted_first || temp_first.equals(casted_first))) return false;
            Option<Integer> temp_second = getSecond();
            Option<Integer> casted_second = casted.getSecond();
            if (!(temp_second == casted_second || temp_second.equals(casted_second))) return false;
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
        Integer temp_first = getFirst();
        code ^= temp_first.hashCode();
        Option<Integer> temp_second = getSecond();
        code ^= temp_second.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected RegExpQuantifierNumber() {
        _first = null;
        _second = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "RegExpQuantifierNumber", 3)) {
            RegExpNodeInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            Integer temp_first = getFirst();
            if (w.visitNodeField("first", temp_first)) {
                w.visitUnknownObject(temp_first);
                w.endNodeField("first", temp_first);
            }
            Option<Integer> temp_second = getSecond();
            if (w.visitNodeField("second", temp_second)) {
                if (temp_second.isNone()) {
                    w.visitEmptyOption(temp_second);
                }
                else if (w.visitNonEmptyOption(temp_second)) {
                    Integer elt_temp_second = temp_second.unwrap();
                    if (elt_temp_second == null) w.visitNull();
                    else {
                        w.visitUnknownObject(elt_temp_second);
                    }
                    w.endNonEmptyOption(temp_second);
                }
                w.endNodeField("second", temp_second);
            }
            w.endNode(this, "RegExpQuantifierNumber", 3);
        }
    }

}
