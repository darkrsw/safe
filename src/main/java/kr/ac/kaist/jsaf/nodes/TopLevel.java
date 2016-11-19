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
 * Class TopLevel, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Fri Nov 18 18:56:39 CET 2016
 */
@SuppressWarnings("unused")
public class TopLevel extends ScopeBody {
    private final List<SourceElements> _stmts;

    /**
     * Constructs a TopLevel.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public TopLevel(List<FunDecl> in_fds, List<VarDecl> in_vds, List<SourceElements> in_stmts) {
        super(in_fds, in_vds);
        if (in_stmts == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'stmts' to the TopLevel constructor was null");
        }
        _stmts = in_stmts;
    }

    final public List<SourceElements> getStmts() { return _stmts; }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forTopLevel(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forTopLevel(this);
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
            TopLevel casted = (TopLevel) obj;
            List<FunDecl> temp_fds = getFds();
            List<FunDecl> casted_fds = casted.getFds();
            if (!(temp_fds == casted_fds || temp_fds.equals(casted_fds))) return false;
            List<VarDecl> temp_vds = getVds();
            List<VarDecl> casted_vds = casted.getVds();
            if (!(temp_vds == casted_vds || temp_vds.equals(casted_vds))) return false;
            List<SourceElements> temp_stmts = getStmts();
            List<SourceElements> casted_stmts = casted.getStmts();
            if (!(temp_stmts == casted_stmts || temp_stmts.equals(casted_stmts))) return false;
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
        List<SourceElements> temp_stmts = getStmts();
        code ^= temp_stmts.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected TopLevel() {
        _stmts = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "TopLevel", 3)) {
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
            List<SourceElements> temp_stmts = getStmts();
            if (w.visitNodeField("stmts", temp_stmts)) {
                if (w.visitIterated(temp_stmts)) {
                    int i_temp_stmts = 0;
                    for (SourceElements elt_temp_stmts : temp_stmts) {
                        if (w.visitIteratedElement(i_temp_stmts, elt_temp_stmts)) {
                            if (elt_temp_stmts == null) w.visitNull();
                            else {
                                elt_temp_stmts.walk(w);
                            }
                        }
                        i_temp_stmts++;
                    }
                    w.endIterated(temp_stmts, i_temp_stmts);
                }
                w.endNodeField("stmts", temp_stmts);
            }
            w.endNode(this, "TopLevel", 3);
        }
    }

}
