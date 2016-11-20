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
 * Class IRStmtUnit, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Fri Nov 18 18:56:40 CET 2016
 */
@SuppressWarnings("unused")
public class IRStmtUnit extends IRStmt {
    private final List<IRStmt> _stmts;

    /**
     * Constructs a IRStmtUnit.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IRStmtUnit(IRSpanInfo in_info, List<IRStmt> in_stmts) {
        super(in_info);
        if (in_stmts == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'stmts' to the IRStmtUnit constructor was null");
        }
        _stmts = in_stmts;
    }

    final public List<IRStmt> getStmts() { return _stmts; }

    public <RetType> RetType accept(IRAbstractNodeVisitor<RetType> visitor) {
        return visitor.forIRStmtUnit(this);
    }

    public <RetType> RetType accept(IRNodeVisitor<RetType> visitor) {
        return visitor.forIRStmtUnit(this);
    }

    public void accept(IRAbstractNodeVisitor_void visitor) {
        visitor.forIRStmtUnit(this);
    }

    public void accept(IRNodeVisitor_void visitor) {
        visitor.forIRStmtUnit(this);
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
            IRStmtUnit casted = (IRStmtUnit) obj;
            IRSpanInfo temp_info = getInfo();
            IRSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            List<IRStmt> temp_stmts = getStmts();
            List<IRStmt> casted_stmts = casted.getStmts();
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
        IRSpanInfo temp_info = getInfo();
        code ^= temp_info.hashCode();
        List<IRStmt> temp_stmts = getStmts();
        code ^= temp_stmts.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IRStmtUnit() {
        _stmts = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "IRStmtUnit", 2)) {
            IRSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            List<IRStmt> temp_stmts = getStmts();
            if (w.visitNodeField("stmts", temp_stmts)) {
                if (w.visitIterated(temp_stmts)) {
                    int i_temp_stmts = 0;
                    for (IRStmt elt_temp_stmts : temp_stmts) {
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
            w.endNode(this, "IRStmtUnit", 2);
        }
    }

}
