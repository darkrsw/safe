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
 * Class IndexSig, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Oct 24 17:42:23 CEST 2016
 */
@SuppressWarnings("unused")
public class IndexSig extends TypeMember {
    private final Id _id;
    private final Type _annot;
    private final boolean _num;

    /**
     * Constructs a IndexSig.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IndexSig(ASTSpanInfo in_info, Id in_id, Type in_annot, boolean in_num) {
        super(in_info);
        if (in_id == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'id' to the IndexSig constructor was null");
        }
        _id = in_id;
        if (in_annot == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'annot' to the IndexSig constructor was null");
        }
        _annot = in_annot;
        _num = in_num;
    }

    final public Id getId() { return _id; }
    final public Type getAnnot() { return _annot; }
    final public boolean isNum() { return _num; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forIndexSig(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forIndexSig(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forIndexSig(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forIndexSig(this);
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
            IndexSig casted = (IndexSig) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Id temp_id = getId();
            Id casted_id = casted.getId();
            if (!(temp_id == casted_id || temp_id.equals(casted_id))) return false;
            Type temp_annot = getAnnot();
            Type casted_annot = casted.getAnnot();
            if (!(temp_annot == casted_annot || temp_annot.equals(casted_annot))) return false;
            boolean temp_num = isNum();
            boolean casted_num = casted.isNum();
            if (!(temp_num == casted_num)) return false;
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
        Type temp_annot = getAnnot();
        code ^= temp_annot.hashCode();
        boolean temp_num = isNum();
        code ^= temp_num ? 1231 : 1237;
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IndexSig() {
        _id = null;
        _annot = null;
        _num = false;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "IndexSig", 4)) {
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
            Type temp_annot = getAnnot();
            if (w.visitNodeField("annot", temp_annot)) {
                temp_annot.walk(w);
                w.endNodeField("annot", temp_annot);
            }
            boolean temp_num = isNum();
            if (w.visitNodeField("num", temp_num)) {
                w.visitBoolean(temp_num);
                w.endNodeField("num", temp_num);
            }
            w.endNode(this, "IndexSig", 4);
        }
    }

}
