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
 * Class FunApp, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Nov 21 18:10:55 CET 2016
 */
@SuppressWarnings("unused")
public class FunApp extends LHS {
    private final LHS _fun;
    private final List<Expr> _args;

    /**
     * Constructs a FunApp.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public FunApp(ASTSpanInfo in_info, LHS in_fun, List<Expr> in_args) {
        super(in_info);
        if (in_fun == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'fun' to the FunApp constructor was null");
        }
        _fun = in_fun;
        if (in_args == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'args' to the FunApp constructor was null");
        }
        _args = in_args;
    }

    final public LHS getFun() { return _fun; }
    final public List<Expr> getArgs() { return _args; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forFunApp(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forFunApp(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forFunApp(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forFunApp(this);
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
            FunApp casted = (FunApp) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            LHS temp_fun = getFun();
            LHS casted_fun = casted.getFun();
            if (!(temp_fun == casted_fun || temp_fun.equals(casted_fun))) return false;
            List<Expr> temp_args = getArgs();
            List<Expr> casted_args = casted.getArgs();
            if (!(temp_args == casted_args || temp_args.equals(casted_args))) return false;
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
        LHS temp_fun = getFun();
        code ^= temp_fun.hashCode();
        List<Expr> temp_args = getArgs();
        code ^= temp_args.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected FunApp() {
        _fun = null;
        _args = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "FunApp", 3)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            LHS temp_fun = getFun();
            if (w.visitNodeField("fun", temp_fun)) {
                temp_fun.walk(w);
                w.endNodeField("fun", temp_fun);
            }
            List<Expr> temp_args = getArgs();
            if (w.visitNodeField("args", temp_args)) {
                if (w.visitIterated(temp_args)) {
                    int i_temp_args = 0;
                    for (Expr elt_temp_args : temp_args) {
                        if (w.visitIteratedElement(i_temp_args, elt_temp_args)) {
                            if (elt_temp_args == null) w.visitNull();
                            else {
                                elt_temp_args.walk(w);
                            }
                        }
                        i_temp_args++;
                    }
                    w.endIterated(temp_args, i_temp_args);
                }
                w.endNodeField("args", temp_args);
            }
            w.endNode(this, "FunApp", 3);
        }
    }

}
