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
 * Class RegExpNonemptyClassRangesAtoms, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 18:58:01 CEST 2016
 */
@SuppressWarnings("unused")
public class RegExpNonemptyClassRangesAtoms extends RegExpNonemptyClassRanges {
    private final RegExpClassAtom _a;
    private final RegExpNonemptyClassRanges _r;

    /**
     * Constructs a RegExpNonemptyClassRangesAtoms.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public RegExpNonemptyClassRangesAtoms(RegExpNodeInfo in_info, RegExpClassAtom in_a, RegExpNonemptyClassRanges in_r) {
        super(in_info);
        if (in_a == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'a' to the RegExpNonemptyClassRangesAtoms constructor was null");
        }
        _a = in_a;
        if (in_r == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'r' to the RegExpNonemptyClassRangesAtoms constructor was null");
        }
        _r = in_r;
    }

    final public RegExpClassAtom getA() { return _a; }
    final public RegExpNonemptyClassRanges getR() { return _r; }

    public <RetType> RetType accept(RegExpAbstractNodeVisitor<RetType> visitor) {
        return visitor.forRegExpNonemptyClassRangesAtoms(this);
    }

    public <RetType> RetType accept(RegExpNodeVisitor<RetType> visitor) {
        return visitor.forRegExpNonemptyClassRangesAtoms(this);
    }

    public void accept(RegExpAbstractNodeVisitor_void visitor) {
        visitor.forRegExpNonemptyClassRangesAtoms(this);
    }

    public void accept(RegExpNodeVisitor_void visitor) {
        visitor.forRegExpNonemptyClassRangesAtoms(this);
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
            RegExpNonemptyClassRangesAtoms casted = (RegExpNonemptyClassRangesAtoms) obj;
            RegExpNodeInfo temp_info = getInfo();
            RegExpNodeInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            RegExpClassAtom temp_a = getA();
            RegExpClassAtom casted_a = casted.getA();
            if (!(temp_a == casted_a || temp_a.equals(casted_a))) return false;
            RegExpNonemptyClassRanges temp_r = getR();
            RegExpNonemptyClassRanges casted_r = casted.getR();
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
        RegExpClassAtom temp_a = getA();
        code ^= temp_a.hashCode();
        RegExpNonemptyClassRanges temp_r = getR();
        code ^= temp_r.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected RegExpNonemptyClassRangesAtoms() {
        _a = null;
        _r = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "RegExpNonemptyClassRangesAtoms", 3)) {
            RegExpNodeInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            RegExpClassAtom temp_a = getA();
            if (w.visitNodeField("a", temp_a)) {
                temp_a.walk(w);
                w.endNodeField("a", temp_a);
            }
            RegExpNonemptyClassRanges temp_r = getR();
            if (w.visitNodeField("r", temp_r)) {
                temp_r.walk(w);
                w.endNodeField("r", temp_r);
            }
            w.endNode(this, "RegExpNonemptyClassRangesAtoms", 3);
        }
    }

}
