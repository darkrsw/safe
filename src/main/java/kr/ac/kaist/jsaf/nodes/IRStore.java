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
 * Class IRStore, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Wed Nov 09 11:44:32 CET 2016
 */
@SuppressWarnings("unused")
public class IRStore extends IRStmt {
    private final IRId _obj;
    private final IRExpr _index;
    private final IRExpr _rhs;

    /**
     * Constructs a IRStore.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IRStore(IRSpanInfo in_info, IRId in_obj, IRExpr in_index, IRExpr in_rhs) {
        super(in_info);
        if (in_obj == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'obj' to the IRStore constructor was null");
        }
        _obj = in_obj;
        if (in_index == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'index' to the IRStore constructor was null");
        }
        _index = in_index;
        if (in_rhs == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'rhs' to the IRStore constructor was null");
        }
        _rhs = in_rhs;
    }

    final public IRId getObj() { return _obj; }
    final public IRExpr getIndex() { return _index; }
    final public IRExpr getRhs() { return _rhs; }

    public <RetType> RetType accept(IRAbstractNodeVisitor<RetType> visitor) {
        return visitor.forIRStore(this);
    }

    public <RetType> RetType accept(IRNodeVisitor<RetType> visitor) {
        return visitor.forIRStore(this);
    }

    public void accept(IRAbstractNodeVisitor_void visitor) {
        visitor.forIRStore(this);
    }

    public void accept(IRNodeVisitor_void visitor) {
        visitor.forIRStore(this);
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
            IRStore casted = (IRStore) obj;
            IRSpanInfo temp_info = getInfo();
            IRSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            IRId temp_obj = getObj();
            IRId casted_obj = casted.getObj();
            if (!(temp_obj == casted_obj || temp_obj.equals(casted_obj))) return false;
            IRExpr temp_index = getIndex();
            IRExpr casted_index = casted.getIndex();
            if (!(temp_index == casted_index || temp_index.equals(casted_index))) return false;
            IRExpr temp_rhs = getRhs();
            IRExpr casted_rhs = casted.getRhs();
            if (!(temp_rhs == casted_rhs || temp_rhs.equals(casted_rhs))) return false;
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
        IRId temp_obj = getObj();
        code ^= temp_obj.hashCode();
        IRExpr temp_index = getIndex();
        code ^= temp_index.hashCode();
        IRExpr temp_rhs = getRhs();
        code ^= temp_rhs.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IRStore() {
        _obj = null;
        _index = null;
        _rhs = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "IRStore", 4)) {
            IRSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            IRId temp_obj = getObj();
            if (w.visitNodeField("obj", temp_obj)) {
                temp_obj.walk(w);
                w.endNodeField("obj", temp_obj);
            }
            IRExpr temp_index = getIndex();
            if (w.visitNodeField("index", temp_index)) {
                temp_index.walk(w);
                w.endNodeField("index", temp_index);
            }
            IRExpr temp_rhs = getRhs();
            if (w.visitNodeField("rhs", temp_rhs)) {
                temp_rhs.walk(w);
                w.endNodeField("rhs", temp_rhs);
            }
            w.endNode(this, "IRStore", 4);
        }
    }

}
