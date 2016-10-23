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
 * Class IRIf, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 18:58:00 CEST 2016
 */
@SuppressWarnings("unused")
public class IRIf extends IRStmt {
    private final IRExpr _expr;
    private final IRStmt _trueB;
    private final Option<IRStmt> _falseB;

    /**
     * Constructs a IRIf.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IRIf(IRSpanInfo in_info, IRExpr in_expr, IRStmt in_trueB, Option<IRStmt> in_falseB) {
        super(in_info);
        if (in_expr == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'expr' to the IRIf constructor was null");
        }
        _expr = in_expr;
        if (in_trueB == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'trueB' to the IRIf constructor was null");
        }
        _trueB = in_trueB;
        if (in_falseB == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'falseB' to the IRIf constructor was null");
        }
        _falseB = in_falseB;
    }

    final public IRExpr getExpr() { return _expr; }
    final public IRStmt getTrueB() { return _trueB; }
    final public Option<IRStmt> getFalseB() { return _falseB; }

    public <RetType> RetType accept(IRAbstractNodeVisitor<RetType> visitor) {
        return visitor.forIRIf(this);
    }

    public <RetType> RetType accept(IRNodeVisitor<RetType> visitor) {
        return visitor.forIRIf(this);
    }

    public void accept(IRAbstractNodeVisitor_void visitor) {
        visitor.forIRIf(this);
    }

    public void accept(IRNodeVisitor_void visitor) {
        visitor.forIRIf(this);
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
            IRIf casted = (IRIf) obj;
            IRSpanInfo temp_info = getInfo();
            IRSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            IRExpr temp_expr = getExpr();
            IRExpr casted_expr = casted.getExpr();
            if (!(temp_expr == casted_expr || temp_expr.equals(casted_expr))) return false;
            IRStmt temp_trueB = getTrueB();
            IRStmt casted_trueB = casted.getTrueB();
            if (!(temp_trueB == casted_trueB || temp_trueB.equals(casted_trueB))) return false;
            Option<IRStmt> temp_falseB = getFalseB();
            Option<IRStmt> casted_falseB = casted.getFalseB();
            if (!(temp_falseB == casted_falseB || temp_falseB.equals(casted_falseB))) return false;
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
        IRExpr temp_expr = getExpr();
        code ^= temp_expr.hashCode();
        IRStmt temp_trueB = getTrueB();
        code ^= temp_trueB.hashCode();
        Option<IRStmt> temp_falseB = getFalseB();
        code ^= temp_falseB.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IRIf() {
        _expr = null;
        _trueB = null;
        _falseB = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "IRIf", 4)) {
            IRSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            IRExpr temp_expr = getExpr();
            if (w.visitNodeField("expr", temp_expr)) {
                temp_expr.walk(w);
                w.endNodeField("expr", temp_expr);
            }
            IRStmt temp_trueB = getTrueB();
            if (w.visitNodeField("trueB", temp_trueB)) {
                temp_trueB.walk(w);
                w.endNodeField("trueB", temp_trueB);
            }
            Option<IRStmt> temp_falseB = getFalseB();
            if (w.visitNodeField("falseB", temp_falseB)) {
                if (temp_falseB.isNone()) {
                    w.visitEmptyOption(temp_falseB);
                }
                else if (w.visitNonEmptyOption(temp_falseB)) {
                    IRStmt elt_temp_falseB = temp_falseB.unwrap();
                    if (elt_temp_falseB == null) w.visitNull();
                    else {
                        elt_temp_falseB.walk(w);
                    }
                    w.endNonEmptyOption(temp_falseB);
                }
                w.endNodeField("falseB", temp_falseB);
            }
            w.endNode(this, "IRIf", 4);
        }
    }

}
