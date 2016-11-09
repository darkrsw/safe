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
 * Class StmtUnit, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Oct 24 17:42:23 CEST 2016
 */
@SuppressWarnings("unused")
public class StmtUnit extends Stmt {
    private final List<Stmt> _stmts;

    /**
     * Constructs a StmtUnit.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public StmtUnit(ASTSpanInfo in_info, List<Stmt> in_stmts) {
        super(in_info);
        if (in_stmts == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'stmts' to the StmtUnit constructor was null");
        }
        _stmts = in_stmts;
    }

    final public List<Stmt> getStmts() { return _stmts; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forStmtUnit(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forStmtUnit(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forStmtUnit(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forStmtUnit(this);
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
            StmtUnit casted = (StmtUnit) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            List<Stmt> temp_stmts = getStmts();
            List<Stmt> casted_stmts = casted.getStmts();
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
        ASTSpanInfo temp_info = getInfo();
        code ^= temp_info.hashCode();
        List<Stmt> temp_stmts = getStmts();
        code ^= temp_stmts.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected StmtUnit() {
        _stmts = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "StmtUnit", 2)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            List<Stmt> temp_stmts = getStmts();
            if (w.visitNodeField("stmts", temp_stmts)) {
                if (w.visitIterated(temp_stmts)) {
                    int i_temp_stmts = 0;
                    for (Stmt elt_temp_stmts : temp_stmts) {
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
            w.endNode(this, "StmtUnit", 2);
        }
    }

}
