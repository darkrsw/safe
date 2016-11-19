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
 * Class Functional, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Fri Nov 18 18:56:39 CET 2016
 */
@SuppressWarnings("unused")
public class Functional extends ScopeBody {
    private final SourceElements _stmts;
    private final Id _name;
    private final List<Id> _params;

    /**
     * Constructs a Functional.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public Functional(List<FunDecl> in_fds, List<VarDecl> in_vds, SourceElements in_stmts, Id in_name, List<Id> in_params) {
        super(in_fds, in_vds);
        if (in_stmts == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'stmts' to the Functional constructor was null");
        }
        _stmts = in_stmts;
        if (in_name == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'name' to the Functional constructor was null");
        }
        _name = in_name;
        if (in_params == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'params' to the Functional constructor was null");
        }
        _params = in_params;
    }

    final public SourceElements getStmts() { return _stmts; }
    final public Id getName() { return _name; }
    final public List<Id> getParams() { return _params; }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forFunctional(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forFunctional(this);
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
            Functional casted = (Functional) obj;
            List<FunDecl> temp_fds = getFds();
            List<FunDecl> casted_fds = casted.getFds();
            if (!(temp_fds == casted_fds || temp_fds.equals(casted_fds))) return false;
            List<VarDecl> temp_vds = getVds();
            List<VarDecl> casted_vds = casted.getVds();
            if (!(temp_vds == casted_vds || temp_vds.equals(casted_vds))) return false;
            SourceElements temp_stmts = getStmts();
            SourceElements casted_stmts = casted.getStmts();
            if (!(temp_stmts == casted_stmts || temp_stmts.equals(casted_stmts))) return false;
            Id temp_name = getName();
            Id casted_name = casted.getName();
            if (!(temp_name == casted_name || temp_name.equals(casted_name))) return false;
            List<Id> temp_params = getParams();
            List<Id> casted_params = casted.getParams();
            if (!(temp_params == casted_params || temp_params.equals(casted_params))) return false;
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
        List<FunDecl> temp_fds = getFds();
        code ^= temp_fds.hashCode();
        List<VarDecl> temp_vds = getVds();
        code ^= temp_vds.hashCode();
        SourceElements temp_stmts = getStmts();
        code ^= temp_stmts.hashCode();
        Id temp_name = getName();
        code ^= temp_name.hashCode();
        List<Id> temp_params = getParams();
        code ^= temp_params.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected Functional() {
        _stmts = null;
        _name = null;
        _params = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "Functional", 5)) {
            List<FunDecl> temp_fds = getFds();
            if (w.visitNodeField("fds", temp_fds)) {
                if (w.visitIterated(temp_fds)) {
                    int i_temp_fds = 0;
                    for (FunDecl elt_temp_fds : temp_fds) {
                        if (w.visitIteratedElement(i_temp_fds, elt_temp_fds)) {
                            if (elt_temp_fds == null) w.visitNull();
                            else {
                                elt_temp_fds.walk(w);
                            }
                        }
                        i_temp_fds++;
                    }
                    w.endIterated(temp_fds, i_temp_fds);
                }
                w.endNodeField("fds", temp_fds);
            }
            List<VarDecl> temp_vds = getVds();
            if (w.visitNodeField("vds", temp_vds)) {
                if (w.visitIterated(temp_vds)) {
                    int i_temp_vds = 0;
                    for (VarDecl elt_temp_vds : temp_vds) {
                        if (w.visitIteratedElement(i_temp_vds, elt_temp_vds)) {
                            if (elt_temp_vds == null) w.visitNull();
                            else {
                                elt_temp_vds.walk(w);
                            }
                        }
                        i_temp_vds++;
                    }
                    w.endIterated(temp_vds, i_temp_vds);
                }
                w.endNodeField("vds", temp_vds);
            }
            SourceElements temp_stmts = getStmts();
            if (w.visitNodeField("stmts", temp_stmts)) {
                temp_stmts.walk(w);
                w.endNodeField("stmts", temp_stmts);
            }
            Id temp_name = getName();
            if (w.visitNodeField("name", temp_name)) {
                temp_name.walk(w);
                w.endNodeField("name", temp_name);
            }
            List<Id> temp_params = getParams();
            if (w.visitNodeField("params", temp_params)) {
                if (w.visitIterated(temp_params)) {
                    int i_temp_params = 0;
                    for (Id elt_temp_params : temp_params) {
                        if (w.visitIteratedElement(i_temp_params, elt_temp_params)) {
                            if (elt_temp_params == null) w.visitNull();
                            else {
                                elt_temp_params.walk(w);
                            }
                        }
                        i_temp_params++;
                    }
                    w.endIterated(temp_params, i_temp_params);
                }
                w.endNodeField("params", temp_params);
            }
            w.endNode(this, "Functional", 5);
        }
    }

}
