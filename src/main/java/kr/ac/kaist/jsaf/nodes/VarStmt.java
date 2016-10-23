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
 * Class VarStmt, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 18:58:00 CEST 2016
 */
@SuppressWarnings("unused")
public class VarStmt extends Stmt {
    private final List<VarDecl> _vds;

    /**
     * Constructs a VarStmt.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public VarStmt(ASTSpanInfo in_info, List<VarDecl> in_vds) {
        super(in_info);
        if (in_vds == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'vds' to the VarStmt constructor was null");
        }
        _vds = in_vds;
    }

    final public List<VarDecl> getVds() { return _vds; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forVarStmt(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forVarStmt(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forVarStmt(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forVarStmt(this);
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
            VarStmt casted = (VarStmt) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            List<VarDecl> temp_vds = getVds();
            List<VarDecl> casted_vds = casted.getVds();
            if (!(temp_vds == casted_vds || temp_vds.equals(casted_vds))) return false;
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
        List<VarDecl> temp_vds = getVds();
        code ^= temp_vds.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected VarStmt() {
        _vds = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "VarStmt", 2)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
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
            w.endNode(this, "VarStmt", 2);
        }
    }

}
