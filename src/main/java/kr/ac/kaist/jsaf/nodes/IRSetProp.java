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
 * Class IRSetProp, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Oct 24 17:42:24 CEST 2016
 */
@SuppressWarnings("unused")
public class IRSetProp extends IRMember {
    private final IRFunctional _ftn;

    /**
     * Constructs a IRSetProp.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IRSetProp(IRSpanInfo in_info, IRFunctional in_ftn) {
        super(in_info);
        if (in_ftn == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'ftn' to the IRSetProp constructor was null");
        }
        _ftn = in_ftn;
    }

    final public IRFunctional getFtn() { return _ftn; }

    public <RetType> RetType accept(IRAbstractNodeVisitor<RetType> visitor) {
        return visitor.forIRSetProp(this);
    }

    public <RetType> RetType accept(IRNodeVisitor<RetType> visitor) {
        return visitor.forIRSetProp(this);
    }

    public void accept(IRAbstractNodeVisitor_void visitor) {
        visitor.forIRSetProp(this);
    }

    public void accept(IRNodeVisitor_void visitor) {
        visitor.forIRSetProp(this);
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
            IRSetProp casted = (IRSetProp) obj;
            IRSpanInfo temp_info = getInfo();
            IRSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            IRFunctional temp_ftn = getFtn();
            IRFunctional casted_ftn = casted.getFtn();
            if (!(temp_ftn == casted_ftn || temp_ftn.equals(casted_ftn))) return false;
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
        IRFunctional temp_ftn = getFtn();
        code ^= temp_ftn.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IRSetProp() {
        _ftn = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "IRSetProp", 2)) {
            IRSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            IRFunctional temp_ftn = getFtn();
            if (w.visitNodeField("ftn", temp_ftn)) {
                temp_ftn.walk(w);
                w.endNodeField("ftn", temp_ftn);
            }
            w.endNode(this, "IRSetProp", 2);
        }
    }

}
