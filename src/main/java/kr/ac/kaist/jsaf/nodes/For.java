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
 * Class For, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 13:58:51 CEST 2016
 */
@SuppressWarnings("unused")
public class For extends Stmt {
    private final Option<Expr> _init;
    private final Option<Expr> _cond;
    private final Option<Expr> _action;
    private final Stmt _body;

    /**
     * Constructs a For.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public For(ASTSpanInfo in_info, Option<Expr> in_init, Option<Expr> in_cond, Option<Expr> in_action, Stmt in_body) {
        super(in_info);
        if (in_init == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'init' to the For constructor was null");
        }
        _init = in_init;
        if (in_cond == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'cond' to the For constructor was null");
        }
        _cond = in_cond;
        if (in_action == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'action' to the For constructor was null");
        }
        _action = in_action;
        if (in_body == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'body' to the For constructor was null");
        }
        _body = in_body;
    }

    final public Option<Expr> getInit() { return _init; }
    final public Option<Expr> getCond() { return _cond; }
    final public Option<Expr> getAction() { return _action; }
    final public Stmt getBody() { return _body; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forFor(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forFor(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forFor(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forFor(this);
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
            For casted = (For) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Option<Expr> temp_init = getInit();
            Option<Expr> casted_init = casted.getInit();
            if (!(temp_init == casted_init || temp_init.equals(casted_init))) return false;
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
        Option<Expr> temp_init = getInit();
        code ^= temp_init.hashCode();
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
    protected For() {
        _init = null;
        _cond = null;
        _action = null;
        _body = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "For", 5)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            Option<Expr> temp_init = getInit();
            if (w.visitNodeField("init", temp_init)) {
                if (temp_init.isNone()) {
                    w.visitEmptyOption(temp_init);
                }
                else if (w.visitNonEmptyOption(temp_init)) {
                    Expr elt_temp_init = temp_init.unwrap();
                    if (elt_temp_init == null) w.visitNull();
                    else {
                        elt_temp_init.walk(w);
                    }
                    w.endNonEmptyOption(temp_init);
                }
                w.endNodeField("init", temp_init);
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
            w.endNode(this, "For", 5);
        }
    }

}
