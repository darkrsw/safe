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
 * Class ForVar, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Oct 24 17:42:23 CEST 2016
 */
@SuppressWarnings("unused")
public class ForVar extends Stmt {
    private final List<VarDecl> _vars;
    private final Option<Expr> _cond;
    private final Option<Expr> _action;
    private final Stmt _body;

    /**
     * Constructs a ForVar.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public ForVar(ASTSpanInfo in_info, List<VarDecl> in_vars, Option<Expr> in_cond, Option<Expr> in_action, Stmt in_body) {
        super(in_info);
        if (in_vars == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'vars' to the ForVar constructor was null");
        }
        _vars = in_vars;
        if (in_cond == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'cond' to the ForVar constructor was null");
        }
        _cond = in_cond;
        if (in_action == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'action' to the ForVar constructor was null");
        }
        _action = in_action;
        if (in_body == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'body' to the ForVar constructor was null");
        }
        _body = in_body;
    }

    final public List<VarDecl> getVars() { return _vars; }
    final public Option<Expr> getCond() { return _cond; }
    final public Option<Expr> getAction() { return _action; }
    final public Stmt getBody() { return _body; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forForVar(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forForVar(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forForVar(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forForVar(this);
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
            ForVar casted = (ForVar) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            List<VarDecl> temp_vars = getVars();
            List<VarDecl> casted_vars = casted.getVars();
            if (!(temp_vars == casted_vars || temp_vars.equals(casted_vars))) return false;
            Option<Expr> temp_cond = getCond();
            Option<Expr> casted_cond = casted.getCond();
            if (!(temp_cond == casted_cond || temp_cond.equals(casted_cond))) return false;
            Option<Expr> temp_action = getAction();
            Option<Expr> casted_action = casted.getAction();
            if (!(temp_action == casted_action || temp_action.equals(casted_action))) return false;
            Stmt temp_body = getBody();
            Stmt casted_body = casted.getBody();
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
        List<VarDecl> temp_vars = getVars();
        code ^= temp_vars.hashCode();
        Option<Expr> temp_cond = getCond();
        code ^= temp_cond.hashCode();
        Option<Expr> temp_action = getAction();
        code ^= temp_action.hashCode();
        Stmt temp_body = getBody();
        code ^= temp_body.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected ForVar() {
        _vars = null;
        _cond = null;
        _action = null;
        _body = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "ForVar", 5)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            List<VarDecl> temp_vars = getVars();
            if (w.visitNodeField("vars", temp_vars)) {
                if (w.visitIterated(temp_vars)) {
                    int i_temp_vars = 0;
                    for (VarDecl elt_temp_vars : temp_vars) {
                        if (w.visitIteratedElement(i_temp_vars, elt_temp_vars)) {
                            if (elt_temp_vars == null) w.visitNull();
                            else {
                                elt_temp_vars.walk(w);
                            }
                        }
                        i_temp_vars++;
                    }
                    w.endIterated(temp_vars, i_temp_vars);
                }
                w.endNodeField("vars", temp_vars);
            }
            Option<Expr> temp_cond = getCond();
            if (w.visitNodeField("cond", temp_cond)) {
                if (temp_cond.isNone()) {
                    w.visitEmptyOption(temp_cond);
                }
                else if (w.visitNonEmptyOption(temp_cond)) {
                    Expr elt_temp_cond = temp_cond.unwrap();
                    if (elt_temp_cond == null) w.visitNull();
                    else {
                        elt_temp_cond.walk(w);
                    }
                    w.endNonEmptyOption(temp_cond);
                }
                w.endNodeField("cond", temp_cond);
            }
            Option<Expr> temp_action = getAction();
            if (w.visitNodeField("action", temp_action)) {
                if (temp_action.isNone()) {
                    w.visitEmptyOption(temp_action);
                }
                else if (w.visitNonEmptyOption(temp_action)) {
                    Expr elt_temp_action = temp_action.unwrap();
                    if (elt_temp_action == null) w.visitNull();
                    else {
                        elt_temp_action.walk(w);
                    }
                    w.endNonEmptyOption(temp_action);
                }
                w.endNodeField("action", temp_action);
            }
            Stmt temp_body = getBody();
            if (w.visitNodeField("body", temp_body)) {
                temp_body.walk(w);
                w.endNodeField("body", temp_body);
            }
            w.endNode(this, "ForVar", 5);
        }
    }

}
