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
 * Class IRUserId, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Oct 24 17:42:24 CEST 2016
 */
@SuppressWarnings("unused")
public class IRUserId extends IRId {
    private final boolean _with;

    /**
     * Constructs a IRUserId.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IRUserId(IRSpanInfo in_info, String in_originalName, String in_uniqueName, boolean in_global, boolean in_with) {
        super(in_info, in_originalName, in_uniqueName, in_global);
        _with = in_with;
    }

    final public boolean isWith() { return _with; }

    public <RetType> RetType accept(IRNodeVisitor<RetType> visitor) {
        return visitor.forIRUserId(this);
    }

    public void accept(IRNodeVisitor_void visitor) {
        visitor.forIRUserId(this);
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
            IRUserId casted = (IRUserId) obj;
            IRSpanInfo temp_info = getInfo();
            IRSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            String temp_originalName = getOriginalName();
            String casted_originalName = casted.getOriginalName();
            if (!(temp_originalName == casted_originalName)) return false;
            String temp_uniqueName = getUniqueName();
            String casted_uniqueName = casted.getUniqueName();
            if (!(temp_uniqueName == casted_uniqueName)) return false;
            boolean temp_global = isGlobal();
            boolean casted_global = casted.isGlobal();
            if (!(temp_global == casted_global)) return false;
            boolean temp_with = isWith();
            boolean casted_with = casted.isWith();
            if (!(temp_with == casted_with)) return false;
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
        String temp_originalName = getOriginalName();
        code ^= temp_originalName.hashCode();
        String temp_uniqueName = getUniqueName();
        code ^= temp_uniqueName.hashCode();
        boolean temp_global = isGlobal();
        code ^= temp_global ? 1231 : 1237;
        boolean temp_with = isWith();
        code ^= temp_with ? 1231 : 1237;
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IRUserId() {
        _with = false;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "IRUserId", 5)) {
            IRSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            String temp_originalName = getOriginalName();
            if (w.visitNodeField("originalName", temp_originalName)) {
                w.visitString(temp_originalName);
                w.endNodeField("originalName", temp_originalName);
            }
            String temp_uniqueName = getUniqueName();
            if (w.visitNodeField("uniqueName", temp_uniqueName)) {
                w.visitString(temp_uniqueName);
                w.endNodeField("uniqueName", temp_uniqueName);
            }
            boolean temp_global = isGlobal();
            if (w.visitNodeField("global", temp_global)) {
                w.visitBoolean(temp_global);
                w.endNodeField("global", temp_global);
            }
            boolean temp_with = isWith();
            if (w.visitNodeField("with", temp_with)) {
                w.visitBoolean(temp_with);
                w.endNodeField("with", temp_with);
            }
            w.endNode(this, "IRUserId", 5);
        }
    }

}
