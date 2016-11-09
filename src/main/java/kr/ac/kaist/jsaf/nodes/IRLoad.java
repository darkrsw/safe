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
 * Class IRLoad, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Oct 24 17:42:24 CEST 2016
 */
@SuppressWarnings("unused")
public class IRLoad extends IROpApp {
    private final IRId _obj;
    private final IRExpr _index;

    /**
     * Constructs a IRLoad.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IRLoad(IRSpanInfo in_info, IRId in_obj, IRExpr in_index) {
        super(in_info);
        if (in_obj == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'obj' to the IRLoad constructor was null");
        }
        _obj = in_obj;
        if (in_index == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'index' to the IRLoad constructor was null");
        }
        _index = in_index;
    }

    final public IRId getObj() { return _obj; }
    final public IRExpr getIndex() { return _index; }

    public <RetType> RetType accept(IRNodeVisitor<RetType> visitor) {
        return visitor.forIRLoad(this);
    }

    public void accept(IRNodeVisitor_void visitor) {
        visitor.forIRLoad(this);
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
            IRLoad casted = (IRLoad) obj;
            IRSpanInfo temp_info = getInfo();
            IRSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            IRId temp_obj = getObj();
            IRId casted_obj = casted.getObj();
            if (!(temp_obj == casted_obj || temp_obj.equals(casted_obj))) return false;
            IRExpr temp_index = getIndex();
            IRExpr casted_index = casted.getIndex();
            if (!(temp_index == casted_index || temp_index.equals(casted_index))) return false;
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
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IRLoad() {
        _obj = null;
        _index = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "IRLoad", 3)) {
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
            w.endNode(this, "IRLoad", 3);
        }
    }

}
