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
 * Class DoWhile, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Oct 24 17:42:23 CEST 2016
 */
@SuppressWarnings("unused")
public class DoWhile extends Stmt {
    private final Stmt _body;
    private final Expr _cond;

    /**
     * Constructs a DoWhile.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public DoWhile(ASTSpanInfo in_info, Stmt in_body, Expr in_cond) {
        super(in_info);
        if (in_body == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'body' to the DoWhile constructor was null");
        }
        _body = in_body;
        if (in_cond == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'cond' to the DoWhile constructor was null");
        }
        _cond = in_cond;
    }

    final public Stmt getBody() { return _body; }
    final public Expr getCond() { return _cond; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forDoWhile(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forDoWhile(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forDoWhile(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forDoWhile(this);
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
            DoWhile casted = (DoWhile) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Stmt temp_body = getBody();
            Stmt casted_body = casted.getBody();
            if (!(temp_body == casted_body || temp_body.equals(casted_body))) return false;
            Expr temp_cond = getCond();
            Expr casted_cond = casted.getCond();
            if (!(temp_cond == casted_cond || temp_cond.equals(casted_cond))) return false;
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
        Stmt temp_body = getBody();
        code ^= temp_body.hashCode();
        Expr temp_cond = getCond();
        code ^= temp_cond.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected DoWhile() {
        _body = null;
        _cond = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "DoWhile", 3)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            Stmt temp_body = getBody();
            if (w.visitNodeField("body", temp_body)) {
                temp_body.walk(w);
                w.endNodeField("body", temp_body);
            }
            Expr temp_cond = getCond();
            if (w.visitNodeField("cond", temp_cond)) {
                temp_cond.walk(w);
                w.endNodeField("cond", temp_cond);
            }
            w.endNode(this, "DoWhile", 3);
        }
    }

}
