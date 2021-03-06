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
 * Class DoubleLiteral, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Nov 21 18:10:55 CET 2016
 */
@SuppressWarnings("unused")
public class DoubleLiteral extends NumberLiteral {
    private final String _text;
    private final Double _num;

    /**
     * Constructs a DoubleLiteral.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public DoubleLiteral(ASTSpanInfo in_info, String in_text, Double in_num) {
        super(in_info);
        if (in_text == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'text' to the DoubleLiteral constructor was null");
        }
        _text = in_text.intern();
        if (in_num == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'num' to the DoubleLiteral constructor was null");
        }
        _num = in_num;
    }

    final public String getText() { return _text; }
    final public Double getNum() { return _num; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forDoubleLiteral(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forDoubleLiteral(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forDoubleLiteral(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forDoubleLiteral(this);
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
            DoubleLiteral casted = (DoubleLiteral) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Double temp_num = getNum();
            Double casted_num = casted.getNum();
            if (!(temp_num == casted_num || temp_num.equals(casted_num))) return false;
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
        Double temp_num = getNum();
        code ^= temp_num.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected DoubleLiteral() {
        _text = null;
        _num = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "DoubleLiteral", 3)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            String temp_text = getText();
            if (w.visitNodeField("text", temp_text)) {
                w.visitString(temp_text);
                w.endNodeField("text", temp_text);
            }
            Double temp_num = getNum();
            if (w.visitNodeField("num", temp_num)) {
                w.visitUnknownObject(temp_num);
                w.endNodeField("num", temp_num);
            }
            w.endNode(this, "DoubleLiteral", 3);
        }
    }

}
