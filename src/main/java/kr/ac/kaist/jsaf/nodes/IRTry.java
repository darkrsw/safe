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
 * Class IRTry, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Nov 21 18:10:56 CET 2016
 */
@SuppressWarnings("unused")
public class IRTry extends IRStmt {
    private final IRStmt _body;
    private final Option<IRId> _name;
    private final Option<IRStmt> _catchB;
    private final Option<IRStmt> _finallyB;

    /**
     * Constructs a IRTry.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IRTry(IRSpanInfo in_info, IRStmt in_body, Option<IRId> in_name, Option<IRStmt> in_catchB, Option<IRStmt> in_finallyB) {
        super(in_info);
        if (in_body == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'body' to the IRTry constructor was null");
        }
        _body = in_body;
        if (in_name == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'name' to the IRTry constructor was null");
        }
        _name = in_name;
        if (in_catchB == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'catchB' to the IRTry constructor was null");
        }
        _catchB = in_catchB;
        if (in_finallyB == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'finallyB' to the IRTry constructor was null");
        }
        _finallyB = in_finallyB;
    }

    final public IRStmt getBody() { return _body; }
    final public Option<IRId> getName() { return _name; }
    final public Option<IRStmt> getCatchB() { return _catchB; }
    final public Option<IRStmt> getFinallyB() { return _finallyB; }

    public <RetType> RetType accept(IRAbstractNodeVisitor<RetType> visitor) {
        return visitor.forIRTry(this);
    }

    public <RetType> RetType accept(IRNodeVisitor<RetType> visitor) {
        return visitor.forIRTry(this);
    }

    public void accept(IRAbstractNodeVisitor_void visitor) {
        visitor.forIRTry(this);
    }

    public void accept(IRNodeVisitor_void visitor) {
        visitor.forIRTry(this);
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
            IRTry casted = (IRTry) obj;
            IRSpanInfo temp_info = getInfo();
            IRSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            IRStmt temp_body = getBody();
            IRStmt casted_body = casted.getBody();
            if (!(temp_body == casted_body || temp_body.equals(casted_body))) return false;
            Option<IRId> temp_name = getName();
            Option<IRId> casted_name = casted.getName();
            if (!(temp_name == casted_name || temp_name.equals(casted_name))) return false;
            Option<IRStmt> temp_catchB = getCatchB();
            Option<IRStmt> casted_catchB = casted.getCatchB();
            if (!(temp_catchB == casted_catchB || temp_catchB.equals(casted_catchB))) return false;
            Option<IRStmt> temp_finallyB = getFinallyB();
            Option<IRStmt> casted_finallyB = casted.getFinallyB();
            if (!(temp_finallyB == casted_finallyB || temp_finallyB.equals(casted_finallyB))) return false;
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
        IRStmt temp_body = getBody();
        code ^= temp_body.hashCode();
        Option<IRId> temp_name = getName();
        code ^= temp_name.hashCode();
        Option<IRStmt> temp_catchB = getCatchB();
        code ^= temp_catchB.hashCode();
        Option<IRStmt> temp_finallyB = getFinallyB();
        code ^= temp_finallyB.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IRTry() {
        _body = null;
        _name = null;
        _catchB = null;
        _finallyB = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "IRTry", 5)) {
            IRSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            IRStmt temp_body = getBody();
            if (w.visitNodeField("body", temp_body)) {
                temp_body.walk(w);
                w.endNodeField("body", temp_body);
            }
            Option<IRId> temp_name = getName();
            if (w.visitNodeField("name", temp_name)) {
                if (temp_name.isNone()) {
                    w.visitEmptyOption(temp_name);
                }
                else if (w.visitNonEmptyOption(temp_name)) {
                    IRId elt_temp_name = temp_name.unwrap();
                    if (elt_temp_name == null) w.visitNull();
                    else {
                        elt_temp_name.walk(w);
                    }
                    w.endNonEmptyOption(temp_name);
                }
                w.endNodeField("name", temp_name);
            }
            Option<IRStmt> temp_catchB = getCatchB();
            if (w.visitNodeField("catchB", temp_catchB)) {
                if (temp_catchB.isNone()) {
                    w.visitEmptyOption(temp_catchB);
                }
                else if (w.visitNonEmptyOption(temp_catchB)) {
                    IRStmt elt_temp_catchB = temp_catchB.unwrap();
                    if (elt_temp_catchB == null) w.visitNull();
                    else {
                        elt_temp_catchB.walk(w);
                    }
                    w.endNonEmptyOption(temp_catchB);
                }
                w.endNodeField("catchB", temp_catchB);
            }
            Option<IRStmt> temp_finallyB = getFinallyB();
            if (w.visitNodeField("finallyB", temp_finallyB)) {
                if (temp_finallyB.isNone()) {
                    w.visitEmptyOption(temp_finallyB);
                }
                else if (w.visitNonEmptyOption(temp_finallyB)) {
                    IRStmt elt_temp_finallyB = temp_finallyB.unwrap();
                    if (elt_temp_finallyB == null) w.visitNull();
                    else {
                        elt_temp_finallyB.walk(w);
                    }
                    w.endNonEmptyOption(temp_finallyB);
                }
                w.endNodeField("finallyB", temp_finallyB);
            }
            w.endNode(this, "IRTry", 5);
        }
    }

}
