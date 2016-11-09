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
 * Class AmbEnumDecl, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Oct 24 17:42:23 CEST 2016
 */
@SuppressWarnings("unused")
public class AmbEnumDecl extends AmbDecl {
    private final Id _id;
    private final List<AmbEnumMem> _mem;

    /**
     * Constructs a AmbEnumDecl.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public AmbEnumDecl(ASTSpanInfo in_info, Id in_id, List<AmbEnumMem> in_mem) {
        super(in_info);
        if (in_id == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'id' to the AmbEnumDecl constructor was null");
        }
        _id = in_id;
        if (in_mem == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'mem' to the AmbEnumDecl constructor was null");
        }
        _mem = in_mem;
    }

    final public Id getId() { return _id; }
    final public List<AmbEnumMem> getMem() { return _mem; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forAmbEnumDecl(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forAmbEnumDecl(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forAmbEnumDecl(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forAmbEnumDecl(this);
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
            AmbEnumDecl casted = (AmbEnumDecl) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Id temp_id = getId();
            Id casted_id = casted.getId();
            if (!(temp_id == casted_id || temp_id.equals(casted_id))) return false;
            List<AmbEnumMem> temp_mem = getMem();
            List<AmbEnumMem> casted_mem = casted.getMem();
            if (!(temp_mem == casted_mem || temp_mem.equals(casted_mem))) return false;
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
        Id temp_id = getId();
        code ^= temp_id.hashCode();
        List<AmbEnumMem> temp_mem = getMem();
        code ^= temp_mem.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected AmbEnumDecl() {
        _id = null;
        _mem = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "AmbEnumDecl", 3)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            Id temp_id = getId();
            if (w.visitNodeField("id", temp_id)) {
                temp_id.walk(w);
                w.endNodeField("id", temp_id);
            }
            List<AmbEnumMem> temp_mem = getMem();
            if (w.visitNodeField("mem", temp_mem)) {
                if (w.visitIterated(temp_mem)) {
                    int i_temp_mem = 0;
                    for (AmbEnumMem elt_temp_mem : temp_mem) {
                        if (w.visitIteratedElement(i_temp_mem, elt_temp_mem)) {
                            if (elt_temp_mem == null) w.visitNull();
                            else {
                                elt_temp_mem.walk(w);
                            }
                        }
                        i_temp_mem++;
                    }
                    w.endIterated(temp_mem, i_temp_mem);
                }
                w.endNodeField("mem", temp_mem);
            }
            w.endNode(this, "AmbEnumDecl", 3);
        }
    }

}
