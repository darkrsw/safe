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
 * Class RegExpAtomQuantifier, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Nov 21 18:10:57 CET 2016
 */
@SuppressWarnings("unused")
public class RegExpAtomQuantifier extends RegExpTerm {
    private final RegExpAtom _atom;
    private final RegExpQuantifier _quant;

    /**
     * Constructs a RegExpAtomQuantifier.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public RegExpAtomQuantifier(RegExpNodeInfo in_info, RegExpAtom in_atom, RegExpQuantifier in_quant) {
        super(in_info);
        if (in_atom == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'atom' to the RegExpAtomQuantifier constructor was null");
        }
        _atom = in_atom;
        if (in_quant == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'quant' to the RegExpAtomQuantifier constructor was null");
        }
        _quant = in_quant;
    }

    final public RegExpAtom getAtom() { return _atom; }
    final public RegExpQuantifier getQuant() { return _quant; }

    public <RetType> RetType accept(RegExpAbstractNodeVisitor<RetType> visitor) {
        return visitor.forRegExpAtomQuantifier(this);
    }

    public <RetType> RetType accept(RegExpNodeVisitor<RetType> visitor) {
        return visitor.forRegExpAtomQuantifier(this);
    }

    public void accept(RegExpAbstractNodeVisitor_void visitor) {
        visitor.forRegExpAtomQuantifier(this);
    }

    public void accept(RegExpNodeVisitor_void visitor) {
        visitor.forRegExpAtomQuantifier(this);
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
            RegExpAtomQuantifier casted = (RegExpAtomQuantifier) obj;
            RegExpNodeInfo temp_info = getInfo();
            RegExpNodeInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            RegExpAtom temp_atom = getAtom();
            RegExpAtom casted_atom = casted.getAtom();
            if (!(temp_atom == casted_atom || temp_atom.equals(casted_atom))) return false;
            RegExpQuantifier temp_quant = getQuant();
            RegExpQuantifier casted_quant = casted.getQuant();
            if (!(temp_quant == casted_quant || temp_quant.equals(casted_quant))) return false;
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
        RegExpAtom temp_atom = getAtom();
        code ^= temp_atom.hashCode();
        RegExpQuantifier temp_quant = getQuant();
        code ^= temp_quant.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected RegExpAtomQuantifier() {
        _atom = null;
        _quant = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "RegExpAtomQuantifier", 3)) {
            RegExpNodeInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            RegExpAtom temp_atom = getAtom();
            if (w.visitNodeField("atom", temp_atom)) {
                temp_atom.walk(w);
                w.endNodeField("atom", temp_atom);
            }
            RegExpQuantifier temp_quant = getQuant();
            if (w.visitNodeField("quant", temp_quant)) {
                temp_quant.walk(w);
                w.endNodeField("quant", temp_quant);
            }
            w.endNode(this, "RegExpAtomQuantifier", 3);
        }
    }

}
