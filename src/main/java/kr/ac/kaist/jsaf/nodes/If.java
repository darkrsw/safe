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
 * Class If, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 18:58:00 CEST 2016
 */
@SuppressWarnings("unused")
public class If extends Stmt {
    private final Expr _cond;
    private final Stmt _trueBranch;
    private final Option<Stmt> _falseBranch;

    /**
     * Constructs a If.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public If(ASTSpanInfo in_info, Expr in_cond, Stmt in_trueBranch, Option<Stmt> in_falseBranch) {
        super(in_info);
        if (in_cond == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'cond' to the If constructor was null");
        }
        _cond = in_cond;
        if (in_trueBranch == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'trueBranch' to the If constructor was null");
        }
        _trueBranch = in_trueBranch;
        if (in_falseBranch == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'falseBranch' to the If constructor was null");
        }
        _falseBranch = in_falseBranch;
    }

    final public Expr getCond() { return _cond; }
    final public Stmt getTrueBranch() { return _trueBranch; }
    final public Option<Stmt> getFalseBranch() { return _falseBranch; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forIf(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forIf(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forIf(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forIf(this);
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
            If casted = (If) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Expr temp_cond = getCond();
            Expr casted_cond = casted.getCond();
            if (!(temp_cond == casted_cond || temp_cond.equals(casted_cond))) return false;
            Stmt temp_trueBranch = getTrueBranch();
            Stmt casted_trueBranch = casted.getTrueBranch();
            if (!(temp_trueBranch == casted_trueBranch || temp_trueBranch.equals(casted_trueBranch))) return false;
            Option<Stmt> temp_falseBranch = getFalseBranch();
            Option<Stmt> casted_falseBranch = casted.getFalseBranch();
            if (!(temp_falseBranch == casted_falseBranch || temp_falseBranch.equals(casted_falseBranch))) return false;
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
        Expr temp_cond = getCond();
        code ^= temp_cond.hashCode();
        Stmt temp_trueBranch = getTrueBranch();
        code ^= temp_trueBranch.hashCode();
        Option<Stmt> temp_falseBranch = getFalseBranch();
        code ^= temp_falseBranch.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected If() {
        _cond = null;
        _trueBranch = null;
        _falseBranch = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "If", 4)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            Expr temp_cond = getCond();
            if (w.visitNodeField("cond", temp_cond)) {
                temp_cond.walk(w);
                w.endNodeField("cond", temp_cond);
            }
            Stmt temp_trueBranch = getTrueBranch();
            if (w.visitNodeField("trueBranch", temp_trueBranch)) {
                temp_trueBranch.walk(w);
                w.endNodeField("trueBranch", temp_trueBranch);
            }
            Option<Stmt> temp_falseBranch = getFalseBranch();
            if (w.visitNodeField("falseBranch", temp_falseBranch)) {
                if (temp_falseBranch.isNone()) {
                    w.visitEmptyOption(temp_falseBranch);
                }
                else if (w.visitNonEmptyOption(temp_falseBranch)) {
                    Stmt elt_temp_falseBranch = temp_falseBranch.unwrap();
                    if (elt_temp_falseBranch == null) w.visitNull();
                    else {
                        elt_temp_falseBranch.walk(w);
                    }
                    w.endNonEmptyOption(temp_falseBranch);
                }
                w.endNodeField("falseBranch", temp_falseBranch);
            }
            w.endNode(this, "If", 4);
        }
    }

}
