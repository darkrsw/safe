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
 * Class IRNoOp, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Oct 24 17:42:24 CEST 2016
 */
@SuppressWarnings("unused")
public class IRNoOp extends IRStmt {
    private final String _desc;

    /**
     * Constructs a IRNoOp.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IRNoOp(IRSpanInfo in_info, String in_desc) {
        super(in_info);
        if (in_desc == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'desc' to the IRNoOp constructor was null");
        }
        _desc = in_desc.intern();
    }

    final public String getDesc() { return _desc; }

    public <RetType> RetType accept(IRAbstractNodeVisitor<RetType> visitor) {
        return visitor.forIRNoOp(this);
    }

    public <RetType> RetType accept(IRNodeVisitor<RetType> visitor) {
        return visitor.forIRNoOp(this);
    }

    public void accept(IRAbstractNodeVisitor_void visitor) {
        visitor.forIRNoOp(this);
    }

    public void accept(IRNodeVisitor_void visitor) {
        visitor.forIRNoOp(this);
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
            IRNoOp casted = (IRNoOp) obj;
            IRSpanInfo temp_info = getInfo();
            IRSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            String temp_desc = getDesc();
            String casted_desc = casted.getDesc();
            if (!(temp_desc == casted_desc)) return false;
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
        String temp_desc = getDesc();
        code ^= temp_desc.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IRNoOp() {
        _desc = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "IRNoOp", 2)) {
            IRSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            String temp_desc = getDesc();
            if (w.visitNodeField("desc", temp_desc)) {
                w.visitString(temp_desc);
                w.endNodeField("desc", temp_desc);
            }
            w.endNode(this, "IRNoOp", 2);
        }
    }

}
