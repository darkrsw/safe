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
 * Class IROp, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Oct 24 17:42:24 CEST 2016
 */
@SuppressWarnings("unused")
public class IROp extends UIDObject implements IRNode {
    private final String _text;
    private final int _kind;

    /**
     * Constructs a IROp.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IROp(String in_text, int in_kind) {
        super();
        if (in_text == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'text' to the IROp constructor was null");
        }
        _text = in_text.intern();
        _kind = in_kind;
    }

    final public String getText() { return _text; }
    final public int getKind() { return _kind; }

    public <RetType> RetType accept(IRNodeVisitor<RetType> visitor) {
        return visitor.forIROp(this);
    }

    public void accept(IRNodeVisitor_void visitor) {
        visitor.forIROp(this);
    }

    private int _hashCode;
    private boolean _hasHashCode = false;

    public final int hashCode() {
        if (! _hasHashCode) { _hashCode = generateHashCode(); _hasHashCode = true; }
        return _hashCode;
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
            IROp casted = (IROp) obj;
            String temp_text = getText();
            String casted_text = casted.getText();
            if (!(temp_text == casted_text)) return false;
            int temp_kind = getKind();
            int casted_kind = casted.getKind();
            if (!(temp_kind == casted_kind)) return false;
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
        String temp_text = getText();
        code ^= temp_text.hashCode();
        int temp_kind = getKind();
        code ^= temp_kind;
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IROp() {
        _text = null;
        _kind = 0;
    }

    /** Generate a human-readable representation that can be deserialized. */
    public java.lang.String serialize() {
        java.io.StringWriter w = new java.io.StringWriter();
        walk(new LosslessStringWalker(w, 2));
        return w.toString();
    }
    /** Generate a human-readable representation that can be deserialized. */
    public void serialize(java.io.Writer writer) {
        walk(new LosslessStringWalker(writer, 2));
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "IROp", 2)) {
            String temp_text = getText();
            if (w.visitNodeField("text", temp_text)) {
                w.visitString(temp_text);
                w.endNodeField("text", temp_text);
            }
            int temp_kind = getKind();
            if (w.visitNodeField("kind", temp_kind)) {
                w.visitInt(temp_kind);
                w.endNodeField("kind", temp_kind);
            }
            w.endNode(this, "IROp", 2);
        }
    }

}
