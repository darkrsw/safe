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
 * Class IRTmpId, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Wed Nov 09 11:44:32 CET 2016
 */
@SuppressWarnings("unused")
public class IRTmpId extends IRId {

    /**
     * Constructs a IRTmpId.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IRTmpId(IRSpanInfo in_info, String in_originalName, String in_uniqueName, boolean in_global) {
        super(in_info, in_originalName, in_uniqueName, in_global);
    }


    public <RetType> RetType accept(IRNodeVisitor<RetType> visitor) {
        return visitor.forIRTmpId(this);
    }

    public void accept(IRNodeVisitor_void visitor) {
        visitor.forIRTmpId(this);
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
            IRTmpId casted = (IRTmpId) obj;
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
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IRTmpId() {
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "IRTmpId", 4)) {
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
            w.endNode(this, "IRTmpId", 4);
        }
    }

}
