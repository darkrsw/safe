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
 * Class IRFunctional, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Fri Nov 18 18:56:40 CET 2016
 */
@SuppressWarnings("unused")
public class IRFunctional extends IRInfoNode {
    private final IRId _name;
    private final List<IRId> _params;
    private final List<IRStmt> _args;
    private final List<IRFunDecl> _fds;
    private final List<IRVarStmt> _vds;
    private final List<IRStmt> _body;

    /**
     * Constructs a IRFunctional.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IRFunctional(boolean in_fromSource, IRId in_name, List<IRId> in_params, List<IRStmt> in_args, List<IRFunDecl> in_fds, List<IRVarStmt> in_vds, List<IRStmt> in_body) {
        super(in_fromSource);
        if (in_name == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'name' to the IRFunctional constructor was null");
        }
        _name = in_name;
        if (in_params == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'params' to the IRFunctional constructor was null");
        }
        _params = in_params;
        if (in_args == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'args' to the IRFunctional constructor was null");
        }
        _args = in_args;
        if (in_fds == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'fds' to the IRFunctional constructor was null");
        }
        _fds = in_fds;
        if (in_vds == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'vds' to the IRFunctional constructor was null");
        }
        _vds = in_vds;
        if (in_body == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'body' to the IRFunctional constructor was null");
        }
        _body = in_body;
    }

    final public IRId getName() { return _name; }
    final public List<IRId> getParams() { return _params; }
    final public List<IRStmt> getArgs() { return _args; }
    final public List<IRFunDecl> getFds() { return _fds; }
    final public List<IRVarStmt> getVds() { return _vds; }
    final public List<IRStmt> getBody() { return _body; }

    public <RetType> RetType accept(IRNodeVisitor<RetType> visitor) {
        return visitor.forIRFunctional(this);
    }

    public void accept(IRNodeVisitor_void visitor) {
        visitor.forIRFunctional(this);
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
            IRFunctional casted = (IRFunctional) obj;
            boolean temp_fromSource = isFromSource();
            boolean casted_fromSource = casted.isFromSource();
            if (!(temp_fromSource == casted_fromSource)) return false;
            IRId temp_name = getName();
            IRId casted_name = casted.getName();
            if (!(temp_name == casted_name || temp_name.equals(casted_name))) return false;
            List<IRId> temp_params = getParams();
            List<IRId> casted_params = casted.getParams();
            if (!(temp_params == casted_params || temp_params.equals(casted_params))) return false;
            List<IRStmt> temp_args = getArgs();
            List<IRStmt> casted_args = casted.getArgs();
            if (!(temp_args == casted_args || temp_args.equals(casted_args))) return false;
            List<IRFunDecl> temp_fds = getFds();
            List<IRFunDecl> casted_fds = casted.getFds();
            if (!(temp_fds == casted_fds || temp_fds.equals(casted_fds))) return false;
            List<IRVarStmt> temp_vds = getVds();
            List<IRVarStmt> casted_vds = casted.getVds();
            if (!(temp_vds == casted_vds || temp_vds.equals(casted_vds))) return false;
            List<IRStmt> temp_body = getBody();
            List<IRStmt> casted_body = casted.getBody();
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
        boolean temp_fromSource = isFromSource();
        code ^= temp_fromSource ? 1231 : 1237;
        IRId temp_name = getName();
        code ^= temp_name.hashCode();
        List<IRId> temp_params = getParams();
        code ^= temp_params.hashCode();
        List<IRStmt> temp_args = getArgs();
        code ^= temp_args.hashCode();
        List<IRFunDecl> temp_fds = getFds();
        code ^= temp_fds.hashCode();
        List<IRVarStmt> temp_vds = getVds();
        code ^= temp_vds.hashCode();
        List<IRStmt> temp_body = getBody();
        code ^= temp_body.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IRFunctional() {
        _name = null;
        _params = null;
        _args = null;
        _fds = null;
        _vds = null;
        _body = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "IRFunctional", 7)) {
            boolean temp_fromSource = isFromSource();
            if (w.visitNodeField("fromSource", temp_fromSource)) {
                w.visitBoolean(temp_fromSource);
                w.endNodeField("fromSource", temp_fromSource);
            }
            IRId temp_name = getName();
            if (w.visitNodeField("name", temp_name)) {
                temp_name.walk(w);
                w.endNodeField("name", temp_name);
            }
            List<IRId> temp_params = getParams();
            if (w.visitNodeField("params", temp_params)) {
                if (w.visitIterated(temp_params)) {
                    int i_temp_params = 0;
                    for (IRId elt_temp_params : temp_params) {
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
            List<IRStmt> temp_args = getArgs();
            if (w.visitNodeField("args", temp_args)) {
                if (w.visitIterated(temp_args)) {
                    int i_temp_args = 0;
                    for (IRStmt elt_temp_args : temp_args) {
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
            List<IRFunDecl> temp_fds = getFds();
            if (w.visitNodeField("fds", temp_fds)) {
                if (w.visitIterated(temp_fds)) {
                    int i_temp_fds = 0;
                    for (IRFunDecl elt_temp_fds : temp_fds) {
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
            List<IRVarStmt> temp_vds = getVds();
            if (w.visitNodeField("vds", temp_vds)) {
                if (w.visitIterated(temp_vds)) {
                    int i_temp_vds = 0;
                    for (IRVarStmt elt_temp_vds : temp_vds) {
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
            List<IRStmt> temp_body = getBody();
            if (w.visitNodeField("body", temp_body)) {
                if (w.visitIterated(temp_body)) {
                    int i_temp_body = 0;
                    for (IRStmt elt_temp_body : temp_body) {
                        if (w.visitIteratedElement(i_temp_body, elt_temp_body)) {
                            if (elt_temp_body == null) w.visitNull();
                            else {
                                elt_temp_body.walk(w);
                            }
                        }
                        i_temp_body++;
                    }
                    w.endIterated(temp_body, i_temp_body);
                }
                w.endNodeField("body", temp_body);
            }
            w.endNode(this, "IRFunctional", 7);
        }
    }

}
