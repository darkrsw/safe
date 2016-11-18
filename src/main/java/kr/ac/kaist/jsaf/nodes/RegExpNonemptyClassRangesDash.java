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
 * Class RegExpNonemptyClassRangesDash, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Wed Nov 09 11:44:32 CET 2016
 */
@SuppressWarnings("unused")
public class RegExpNonemptyClassRangesDash extends RegExpNonemptyClassRanges {
    private final RegExpClassAtom _a1;
    private final RegExpClassAtom _a2;
    private final RegExpClassRanges _r;

    /**
     * Constructs a RegExpNonemptyClassRangesDash.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public RegExpNonemptyClassRangesDash(RegExpNodeInfo in_info, RegExpClassAtom in_a1, RegExpClassAtom in_a2, RegExpClassRanges in_r) {
        super(in_info);
        if (in_a1 == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'a1' to the RegExpNonemptyClassRangesDash constructor was null");
        }
        _a1 = in_a1;
        if (in_a2 == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'a2' to the RegExpNonemptyClassRangesDash constructor was null");
        }
        _a2 = in_a2;
        if (in_r == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'r' to the RegExpNonemptyClassRangesDash constructor was null");
        }
        _r = in_r;
    }

    final public RegExpClassAtom getA1() { return _a1; }
    final public RegExpClassAtom getA2() { return _a2; }
    final public RegExpClassRanges getR() { return _r; }

    public <RetType> RetType accept(RegExpAbstractNodeVisitor<RetType> visitor) {
        return visitor.forRegExpNonemptyClassRangesDash(this);
    }

    public <RetType> RetType accept(RegExpNodeVisitor<RetType> visitor) {
        return visitor.forRegExpNonemptyClassRangesDash(this);
    }

    public void accept(RegExpAbstractNodeVisitor_void visitor) {
        visitor.forRegExpNonemptyClassRangesDash(this);
    }

    public void accept(RegExpNodeVisitor_void visitor) {
        visitor.forRegExpNonemptyClassRangesDash(this);
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
            RegExpNonemptyClassRangesDash casted = (RegExpNonemptyClassRangesDash) obj;
            RegExpNodeInfo temp_info = getInfo();
            RegExpNodeInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            RegExpClassAtom temp_a1 = getA1();
            RegExpClassAtom casted_a1 = casted.getA1();
            if (!(temp_a1 == casted_a1 || temp_a1.equals(casted_a1))) return false;
            RegExpClassAtom temp_a2 = getA2();
            RegExpClassAtom casted_a2 = casted.getA2();
            if (!(temp_a2 == casted_a2 || temp_a2.equals(casted_a2))) return false;
            RegExpClassRanges temp_r = getR();
            RegExpClassRanges casted_r = casted.getR();
            if (!(temp_r == casted_r || temp_r.equals(casted_r))) return false;
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
        RegExpClassAtom temp_a1 = getA1();
        code ^= temp_a1.hashCode();
        RegExpClassAtom temp_a2 = getA2();
        code ^= temp_a2.hashCode();
        RegExpClassRanges temp_r = getR();
        code ^= temp_r.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected RegExpNonemptyClassRangesDash() {
        _a1 = null;
        _a2 = null;
        _r = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "RegExpNonemptyClassRangesDash", 4)) {
            RegExpNodeInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            RegExpClassAtom temp_a1 = getA1();
            if (w.visitNodeField("a1", temp_a1)) {
                temp_a1.walk(w);
                w.endNodeField("a1", temp_a1);
            }
            RegExpClassAtom temp_a2 = getA2();
            if (w.visitNodeField("a2", temp_a2)) {
                temp_a2.walk(w);
                w.endNodeField("a2", temp_a2);
            }
            RegExpClassRanges temp_r = getR();
            if (w.visitNodeField("r", temp_r)) {
                temp_r.walk(w);
                w.endNodeField("r", temp_r);
            }
            w.endNode(this, "RegExpNonemptyClassRangesDash", 4);
        }
    }

}
