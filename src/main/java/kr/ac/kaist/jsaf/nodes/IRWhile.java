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
 * Class IRWhile, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Nov 21 18:10:56 CET 2016
 */
@SuppressWarnings("unused")
public class IRWhile extends IRStmt {
    private final IRExpr _cond;
    private final IRStmt _body;

    /**
     * Constructs a IRWhile.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IRWhile(IRSpanInfo in_info, IRExpr in_cond, IRStmt in_body) {
        super(in_info);
        if (in_cond == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'cond' to the IRWhile constructor was null");
        }
        _cond = in_cond;
        if (in_body == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'body' to the IRWhile constructor was null");
        }
        _body = in_body;
    }

    final public IRExpr getCond() { return _cond; }
    final public IRStmt getBody() { return _body; }

    public <RetType> RetType accept(IRAbstractNodeVisitor<RetType> visitor) {
        return visitor.forIRWhile(this);
    }

    public <RetType> RetType accept(IRNodeVisitor<RetType> visitor) {
        return visitor.forIRWhile(this);
    }

    public void accept(IRAbstractNodeVisitor_void visitor) {
        visitor.forIRWhile(this);
    }

    public void accept(IRNodeVisitor_void visitor) {
        visitor.forIRWhile(this);
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
            IRWhile casted = (IRWhile) obj;
            IRSpanInfo temp_info = getInfo();
            IRSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            IRExpr temp_cond = getCond();
            IRExpr casted_cond = casted.getCond();
            if (!(temp_cond == casted_cond || temp_cond.equals(casted_cond))) return false;
            IRStmt temp_body = getBody();
            IRStmt casted_body = casted.getBody();
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
        IRSpanInfo temp_info = getInfo();
        code ^= temp_info.hashCode();
        IRExpr temp_cond = getCond();
        code ^= temp_cond.hashCode();
        IRStmt temp_body = getBody();
        code ^= temp_body.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IRWhile() {
        _cond = null;
        _body = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "IRWhile", 3)) {
            IRSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            IRExpr temp_cond = getCond();
            if (w.visitNodeField("cond", temp_cond)) {
                temp_cond.walk(w);
                w.endNodeField("cond", temp_cond);
            }
            IRStmt temp_body = getBody();
            if (w.visitNodeField("body", temp_body)) {
                temp_body.walk(w);
                w.endNodeField("body", temp_body);
            }
            w.endNode(this, "IRWhile", 3);
        }
    }

}
