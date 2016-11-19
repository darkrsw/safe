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
 * Class IRRoot, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Fri Nov 18 18:56:40 CET 2016
 */
@SuppressWarnings("unused")
public class IRRoot extends IRAbstractNode {
    private final List<IRFunDecl> _fds;
    private final List<IRVarStmt> _vds;
    private final List<IRStmt> _irs;

    /**
     * Constructs a IRRoot.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IRRoot(IRSpanInfo in_info, List<IRFunDecl> in_fds, List<IRVarStmt> in_vds, List<IRStmt> in_irs) {
        super(in_info);
        if (in_fds == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'fds' to the IRRoot constructor was null");
        }
        _fds = in_fds;
        if (in_vds == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'vds' to the IRRoot constructor was null");
        }
        _vds = in_vds;
        if (in_irs == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'irs' to the IRRoot constructor was null");
        }
        _irs = in_irs;
    }

    final public List<IRFunDecl> getFds() { return _fds; }
    final public List<IRVarStmt> getVds() { return _vds; }
    final public List<IRStmt> getIrs() { return _irs; }

    public <RetType> RetType accept(IRAbstractNodeVisitor<RetType> visitor) {
        return visitor.forIRRoot(this);
    }

    public <RetType> RetType accept(IRNodeVisitor<RetType> visitor) {
        return visitor.forIRRoot(this);
    }

    public void accept(IRAbstractNodeVisitor_void visitor) {
        visitor.forIRRoot(this);
    }

    public void accept(IRNodeVisitor_void visitor) {
        visitor.forIRRoot(this);
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
            IRRoot casted = (IRRoot) obj;
            IRSpanInfo temp_info = getInfo();
            IRSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            List<IRFunDecl> temp_fds = getFds();
            List<IRFunDecl> casted_fds = casted.getFds();
            if (!(temp_fds == casted_fds || temp_fds.equals(casted_fds))) return false;
            List<IRVarStmt> temp_vds = getVds();
            List<IRVarStmt> casted_vds = casted.getVds();
            if (!(temp_vds == casted_vds || temp_vds.equals(casted_vds))) return false;
            List<IRStmt> temp_irs = getIrs();
            List<IRStmt> casted_irs = casted.getIrs();
            if (!(temp_irs == casted_irs || temp_irs.equals(casted_irs))) return false;
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
        List<IRFunDecl> temp_fds = getFds();
        code ^= temp_fds.hashCode();
        List<IRVarStmt> temp_vds = getVds();
        code ^= temp_vds.hashCode();
        List<IRStmt> temp_irs = getIrs();
        code ^= temp_irs.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IRRoot() {
        _fds = null;
        _vds = null;
        _irs = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "IRRoot", 4)) {
            IRSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
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
            List<IRStmt> temp_irs = getIrs();
            if (w.visitNodeField("irs", temp_irs)) {
                if (w.visitIterated(temp_irs)) {
                    int i_temp_irs = 0;
                    for (IRStmt elt_temp_irs : temp_irs) {
                        if (w.visitIteratedElement(i_temp_irs, elt_temp_irs)) {
                            if (elt_temp_irs == null) w.visitNull();
                            else {
                                elt_temp_irs.walk(w);
                            }
                        }
                        i_temp_irs++;
                    }
                    w.endIterated(temp_irs, i_temp_irs);
                }
                w.endNodeField("irs", temp_irs);
            }
            w.endNode(this, "IRRoot", 4);
        }
    }

}
