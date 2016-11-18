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
 * Class StringLiteral, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Wed Nov 09 11:44:31 CET 2016
 */
@SuppressWarnings("unused")
public class StringLiteral extends Literal {
    private final String _quote;
    private final String _escaped;

    /**
     * Constructs a StringLiteral.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public StringLiteral(ASTSpanInfo in_info, String in_quote, String in_escaped) {
        super(in_info);
        if (in_quote == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'quote' to the StringLiteral constructor was null");
        }
        _quote = in_quote.intern();
        if (in_escaped == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'escaped' to the StringLiteral constructor was null");
        }
        _escaped = in_escaped.intern();
    }

    final public String getQuote() { return _quote; }
    final public String getEscaped() { return _escaped; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forStringLiteral(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forStringLiteral(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forStringLiteral(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forStringLiteral(this);
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
            StringLiteral casted = (StringLiteral) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            String temp_quote = getQuote();
            String casted_quote = casted.getQuote();
            if (!(temp_quote == casted_quote)) return false;
            String temp_escaped = getEscaped();
            String casted_escaped = casted.getEscaped();
            if (!(temp_escaped == casted_escaped)) return false;
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
        ASTSpanInfo temp_info = getInfo();
        code ^= temp_info.hashCode();
        String temp_quote = getQuote();
        code ^= temp_quote.hashCode();
        String temp_escaped = getEscaped();
        code ^= temp_escaped.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected StringLiteral() {
        _quote = null;
        _escaped = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "StringLiteral", 3)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            String temp_quote = getQuote();
            if (w.visitNodeField("quote", temp_quote)) {
                w.visitString(temp_quote);
                w.endNodeField("quote", temp_quote);
            }
            String temp_escaped = getEscaped();
            if (w.visitNodeField("escaped", temp_escaped)) {
                w.visitString(temp_escaped);
                w.endNodeField("escaped", temp_escaped);
            }
            w.endNode(this, "StringLiteral", 3);
        }
    }

}
