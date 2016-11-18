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
 * Class Catch, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Wed Nov 09 11:44:31 CET 2016
 */
@SuppressWarnings("unused")
public class Catch extends AbstractNode {
    private final Id _id;
    private final List<Stmt> _body;

    /**
     * Constructs a Catch.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public Catch(ASTSpanInfo in_info, Id in_id, List<Stmt> in_body) {
        super(in_info);
        if (in_id == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'id' to the Catch constructor was null");
        }
        _id = in_id;
        if (in_body == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'body' to the Catch constructor was null");
        }
        _body = in_body;
    }

    final public Id getId() { return _id; }
    final public List<Stmt> getBody() { return _body; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forCatch(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forCatch(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forCatch(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forCatch(this);
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
            Catch casted = (Catch) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Id temp_id = getId();
            Id casted_id = casted.getId();
            if (!(temp_id == casted_id || temp_id.equals(casted_id))) return false;
            List<Stmt> temp_body = getBody();
            List<Stmt> casted_body = casted.getBody();
            if (!(temp_body == casted_body || temp_body.equals(casted_body))) return false;
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
        Id temp_id = getId();
        code ^= temp_id.hashCode();
        List<Stmt> temp_body = getBody();
        code ^= temp_body.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected Catch() {
        _id = null;
        _body = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "Catch", 3)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            Id temp_id = getId();
            if (w.visitNodeField("id", temp_id)) {
                temp_id.walk(w);
                w.endNodeField("id", temp_id);
            }
            List<Stmt> temp_body = getBody();
            if (w.visitNodeField("body", temp_body)) {
                if (w.visitIterated(temp_body)) {
                    int i_temp_body = 0;
                    for (Stmt elt_temp_body : temp_body) {
                        if (w.visitIteratedElement(i_temp_body, elt_temp_body)) {
                            if (elt_temp_body == null) w.visitNull();
                            else {
                                elt_temp_body.walk(w);
                            }
                        }
                        i_temp_body++;
                    }
                    w.endIterated(temp_body, i_temp_body);
                }
                w.endNodeField("body", temp_body);
            }
            w.endNode(this, "Catch", 3);
        }
    }

}
