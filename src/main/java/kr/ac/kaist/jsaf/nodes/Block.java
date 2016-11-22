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
 * Class Block, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Nov 21 18:10:55 CET 2016
 */
@SuppressWarnings("unused")
public class Block extends Stmt {
    private final List<Stmt> _stmts;
    private final boolean _internal;

    /**
     * Constructs a Block.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public Block(ASTSpanInfo in_info, List<Stmt> in_stmts, boolean in_internal) {
        super(in_info);
        if (in_stmts == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'stmts' to the Block constructor was null");
        }
        _stmts = in_stmts;
        _internal = in_internal;
    }

    /**
     * A constructor with some fields provided by default values.
     */
    public Block(ASTSpanInfo in_info, List<Stmt> in_stmts) {
        this(in_info, in_stmts, false);
    }

    final public List<Stmt> getStmts() { return _stmts; }
    final public boolean isInternal() { return _internal; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forBlock(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forBlock(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forBlock(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forBlock(this);
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
            Block casted = (Block) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            List<Stmt> temp_stmts = getStmts();
            List<Stmt> casted_stmts = casted.getStmts();
            if (!(temp_stmts == casted_stmts || temp_stmts.equals(casted_stmts))) return false;
            boolean temp_internal = isInternal();
            boolean casted_internal = casted.isInternal();
            if (!(temp_internal == casted_internal)) return false;
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
        boolean temp_internal = isInternal();
        code ^= temp_internal ? 1231 : 1237;
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected Block() {
        _stmts = null;
        _internal = false;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "Block", 3)) {
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
            boolean temp_internal = isInternal();
            if (w.visitNodeField("internal", temp_internal)) {
                w.visitBoolean(temp_internal);
                w.endNodeField("internal", temp_internal);
            }
            w.endNode(this, "Block", 3);
        }
    }

}
