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
 * Class RegExpClassDecimalEscape, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Fri Nov 18 18:56:40 CET 2016
 */
@SuppressWarnings("unused")
public class RegExpClassDecimalEscape extends RegExpClassEscape {
    private final RegExpDecimalEscape _esc;

    /**
     * Constructs a RegExpClassDecimalEscape.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public RegExpClassDecimalEscape(RegExpNodeInfo in_info, RegExpDecimalEscape in_esc) {
        super(in_info);
        if (in_esc == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'esc' to the RegExpClassDecimalEscape constructor was null");
        }
        _esc = in_esc;
    }

    final public RegExpDecimalEscape getEsc() { return _esc; }

    public <RetType> RetType accept(RegExpAbstractNodeVisitor<RetType> visitor) {
        return visitor.forRegExpClassDecimalEscape(this);
    }

    public <RetType> RetType accept(RegExpNodeVisitor<RetType> visitor) {
        return visitor.forRegExpClassDecimalEscape(this);
    }

    public void accept(RegExpAbstractNodeVisitor_void visitor) {
        visitor.forRegExpClassDecimalEscape(this);
    }

    public void accept(RegExpNodeVisitor_void visitor) {
        visitor.forRegExpClassDecimalEscape(this);
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
            RegExpClassDecimalEscape casted = (RegExpClassDecimalEscape) obj;
            RegExpNodeInfo temp_info = getInfo();
            RegExpNodeInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            RegExpDecimalEscape temp_esc = getEsc();
            RegExpDecimalEscape casted_esc = casted.getEsc();
            if (!(temp_esc == casted_esc || temp_esc.equals(casted_esc))) return false;
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
        RegExpDecimalEscape temp_esc = getEsc();
        code ^= temp_esc.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected RegExpClassDecimalEscape() {
        _esc = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "RegExpClassDecimalEscape", 2)) {
            RegExpNodeInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            RegExpDecimalEscape temp_esc = getEsc();
            if (w.visitNodeField("esc", temp_esc)) {
                temp_esc.walk(w);
                w.endNodeField("esc", temp_esc);
            }
            w.endNode(this, "RegExpClassDecimalEscape", 2);
        }
    }

}
