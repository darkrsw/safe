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
 * Class ASTSpanInfo, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Wed Nov 09 11:44:31 CET 2016
 */
@SuppressWarnings("unused")
public class ASTSpanInfo extends UIDObject implements Node {
    private final Span _span;
    private final Option<Comment> _comment;

    /**
     * Constructs a ASTSpanInfo.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public ASTSpanInfo(Span in_span, Option<Comment> in_comment) {
        super();
        if (in_span == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'span' to the ASTSpanInfo constructor was null");
        }
        _span = in_span;
        if (in_comment == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'comment' to the ASTSpanInfo constructor was null");
        }
        _comment = in_comment;
    }

    /**
     * A constructor with some fields provided by default values.
     */
    public ASTSpanInfo(Span in_span) {
        this(in_span, Option.<Comment>none());
    }

    final public Span getSpan() { return _span; }
    final public Option<Comment> getComment() { return _comment; }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forASTSpanInfo(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forASTSpanInfo(this);
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
            ASTSpanInfo casted = (ASTSpanInfo) obj;
            Option<Comment> temp_comment = getComment();
            Option<Comment> casted_comment = casted.getComment();
            if (!(temp_comment == casted_comment || temp_comment.equals(casted_comment))) return false;
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
        Option<Comment> temp_comment = getComment();
        code ^= temp_comment.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected ASTSpanInfo() {
        _span = null;
        _comment = null;
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
        if (w.visitNode(this, "ASTSpanInfo", 2)) {
            Span temp_span = getSpan();
            if (w.visitNodeField("span", temp_span)) {
                w.visitUnknownObject(temp_span);
                w.endNodeField("span", temp_span);
            }
            Option<Comment> temp_comment = getComment();
            if (w.visitNodeField("comment", temp_comment)) {
                if (temp_comment.isNone()) {
                    w.visitEmptyOption(temp_comment);
                }
                else if (w.visitNonEmptyOption(temp_comment)) {
                    Comment elt_temp_comment = temp_comment.unwrap();
                    if (elt_temp_comment == null) w.visitNull();
                    else {
                        elt_temp_comment.walk(w);
                    }
                    w.endNonEmptyOption(temp_comment);
                }
                w.endNodeField("comment", temp_comment);
            }
            w.endNode(this, "ASTSpanInfo", 2);
        }
    }

}
