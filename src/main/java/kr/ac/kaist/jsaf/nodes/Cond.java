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
 * Class Cond, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Oct 24 17:42:23 CEST 2016
 */
@SuppressWarnings("unused")
public class Cond extends Expr {
    private final Expr _cond;
    private final Expr _trueBranch;
    private final Expr _falseBranch;

    /**
     * Constructs a Cond.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public Cond(ASTSpanInfo in_info, Expr in_cond, Expr in_trueBranch, Expr in_falseBranch) {
        super(in_info);
        if (in_cond == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'cond' to the Cond constructor was null");
        }
        _cond = in_cond;
        if (in_trueBranch == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'trueBranch' to the Cond constructor was null");
        }
        _trueBranch = in_trueBranch;
        if (in_falseBranch == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'falseBranch' to the Cond constructor was null");
        }
        _falseBranch = in_falseBranch;
    }

    final public Expr getCond() { return _cond; }
    final public Expr getTrueBranch() { return _trueBranch; }
    final public Expr getFalseBranch() { return _falseBranch; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forCond(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forCond(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forCond(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forCond(this);
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
            Cond casted = (Cond) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Expr temp_cond = getCond();
            Expr casted_cond = casted.getCond();
            if (!(temp_cond == casted_cond || temp_cond.equals(casted_cond))) return false;
            Expr temp_trueBranch = getTrueBranch();
            Expr casted_trueBranch = casted.getTrueBranch();
            if (!(temp_trueBranch == casted_trueBranch || temp_trueBranch.equals(casted_trueBranch))) return false;
            Expr temp_falseBranch = getFalseBranch();
            Expr casted_falseBranch = casted.getFalseBranch();
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
        Expr temp_trueBranch = getTrueBranch();
        code ^= temp_trueBranch.hashCode();
        Expr temp_falseBranch = getFalseBranch();
        code ^= temp_falseBranch.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected Cond() {
        _cond = null;
        _trueBranch = null;
        _falseBranch = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "Cond", 4)) {
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
            Expr temp_trueBranch = getTrueBranch();
            if (w.visitNodeField("trueBranch", temp_trueBranch)) {
                temp_trueBranch.walk(w);
                w.endNodeField("trueBranch", temp_trueBranch);
            }
            Expr temp_falseBranch = getFalseBranch();
            if (w.visitNodeField("falseBranch", temp_falseBranch)) {
                temp_falseBranch.walk(w);
                w.endNodeField("falseBranch", temp_falseBranch);
            }
            w.endNode(this, "Cond", 4);
        }
    }

}
