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
 * Class Bracket, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Oct 24 17:42:23 CEST 2016
 */
@SuppressWarnings("unused")
public class Bracket extends LHS {
    private final LHS _obj;
    private final Expr _index;

    /**
     * Constructs a Bracket.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public Bracket(ASTSpanInfo in_info, LHS in_obj, Expr in_index) {
        super(in_info);
        if (in_obj == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'obj' to the Bracket constructor was null");
        }
        _obj = in_obj;
        if (in_index == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'index' to the Bracket constructor was null");
        }
        _index = in_index;
    }

    final public LHS getObj() { return _obj; }
    final public Expr getIndex() { return _index; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forBracket(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forBracket(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forBracket(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forBracket(this);
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
            Bracket casted = (Bracket) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            LHS temp_obj = getObj();
            LHS casted_obj = casted.getObj();
            if (!(temp_obj == casted_obj || temp_obj.equals(casted_obj))) return false;
            Expr temp_index = getIndex();
            Expr casted_index = casted.getIndex();
            if (!(temp_index == casted_index || temp_index.equals(casted_index))) return false;
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
        LHS temp_obj = getObj();
        code ^= temp_obj.hashCode();
        Expr temp_index = getIndex();
        code ^= temp_index.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected Bracket() {
        _obj = null;
        _index = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "Bracket", 3)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            LHS temp_obj = getObj();
            if (w.visitNodeField("obj", temp_obj)) {
                temp_obj.walk(w);
                w.endNodeField("obj", temp_obj);
            }
            Expr temp_index = getIndex();
            if (w.visitNodeField("index", temp_index)) {
                temp_index.walk(w);
                w.endNodeField("index", temp_index);
            }
            w.endNode(this, "Bracket", 3);
        }
    }

}
