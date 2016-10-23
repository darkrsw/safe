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
 * Class Dot, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 18:58:00 CEST 2016
 */
@SuppressWarnings("unused")
public class Dot extends LHS {
    private final LHS _obj;
    private final Id _member;

    /**
     * Constructs a Dot.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public Dot(ASTSpanInfo in_info, LHS in_obj, Id in_member) {
        super(in_info);
        if (in_obj == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'obj' to the Dot constructor was null");
        }
        _obj = in_obj;
        if (in_member == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'member' to the Dot constructor was null");
        }
        _member = in_member;
    }

    final public LHS getObj() { return _obj; }
    final public Id getMember() { return _member; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forDot(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forDot(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forDot(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forDot(this);
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
            Dot casted = (Dot) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            LHS temp_obj = getObj();
            LHS casted_obj = casted.getObj();
            if (!(temp_obj == casted_obj || temp_obj.equals(casted_obj))) return false;
            Id temp_member = getMember();
            Id casted_member = casted.getMember();
            if (!(temp_member == casted_member || temp_member.equals(casted_member))) return false;
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
        Id temp_member = getMember();
        code ^= temp_member.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected Dot() {
        _obj = null;
        _member = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "Dot", 3)) {
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
            Id temp_member = getMember();
            if (w.visitNodeField("member", temp_member)) {
                temp_member.walk(w);
                w.endNodeField("member", temp_member);
            }
            w.endNode(this, "Dot", 3);
        }
    }

}
