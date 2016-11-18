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
 * Class IntfDecl, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Wed Nov 09 11:44:31 CET 2016
 */
@SuppressWarnings("unused")
public class IntfDecl extends SourceElement {
    private final Id _id;
    private final List<TypeParam> _tps;
    private final List<TypeRef> _ext;
    private final ObjectType _typ;

    /**
     * Constructs a IntfDecl.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IntfDecl(ASTSpanInfo in_info, Id in_id, List<TypeParam> in_tps, List<TypeRef> in_ext, ObjectType in_typ) {
        super(in_info);
        if (in_id == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'id' to the IntfDecl constructor was null");
        }
        _id = in_id;
        if (in_tps == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'tps' to the IntfDecl constructor was null");
        }
        _tps = in_tps;
        if (in_ext == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'ext' to the IntfDecl constructor was null");
        }
        _ext = in_ext;
        if (in_typ == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'typ' to the IntfDecl constructor was null");
        }
        _typ = in_typ;
    }

    final public Id getId() { return _id; }
    final public List<TypeParam> getTps() { return _tps; }
    final public List<TypeRef> getExt() { return _ext; }
    final public ObjectType getTyp() { return _typ; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forIntfDecl(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forIntfDecl(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forIntfDecl(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forIntfDecl(this);
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
            IntfDecl casted = (IntfDecl) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Id temp_id = getId();
            Id casted_id = casted.getId();
            if (!(temp_id == casted_id || temp_id.equals(casted_id))) return false;
            List<TypeParam> temp_tps = getTps();
            List<TypeParam> casted_tps = casted.getTps();
            if (!(temp_tps == casted_tps || temp_tps.equals(casted_tps))) return false;
            List<TypeRef> temp_ext = getExt();
            List<TypeRef> casted_ext = casted.getExt();
            if (!(temp_ext == casted_ext || temp_ext.equals(casted_ext))) return false;
            ObjectType temp_typ = getTyp();
            ObjectType casted_typ = casted.getTyp();
            if (!(temp_typ == casted_typ || temp_typ.equals(casted_typ))) return false;
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
        List<TypeParam> temp_tps = getTps();
        code ^= temp_tps.hashCode();
        List<TypeRef> temp_ext = getExt();
        code ^= temp_ext.hashCode();
        ObjectType temp_typ = getTyp();
        code ^= temp_typ.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IntfDecl() {
        _id = null;
        _tps = null;
        _ext = null;
        _typ = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "IntfDecl", 5)) {
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
            List<TypeParam> temp_tps = getTps();
            if (w.visitNodeField("tps", temp_tps)) {
                if (w.visitIterated(temp_tps)) {
                    int i_temp_tps = 0;
                    for (TypeParam elt_temp_tps : temp_tps) {
                        if (w.visitIteratedElement(i_temp_tps, elt_temp_tps)) {
                            if (elt_temp_tps == null) w.visitNull();
                            else {
                                elt_temp_tps.walk(w);
                            }
                        }
                        i_temp_tps++;
                    }
                    w.endIterated(temp_tps, i_temp_tps);
                }
                w.endNodeField("tps", temp_tps);
            }
            List<TypeRef> temp_ext = getExt();
            if (w.visitNodeField("ext", temp_ext)) {
                if (w.visitIterated(temp_ext)) {
                    int i_temp_ext = 0;
                    for (TypeRef elt_temp_ext : temp_ext) {
                        if (w.visitIteratedElement(i_temp_ext, elt_temp_ext)) {
                            if (elt_temp_ext == null) w.visitNull();
                            else {
                                elt_temp_ext.walk(w);
                            }
                        }
                        i_temp_ext++;
                    }
                    w.endIterated(temp_ext, i_temp_ext);
                }
                w.endNodeField("ext", temp_ext);
            }
            ObjectType temp_typ = getTyp();
            if (w.visitNodeField("typ", temp_typ)) {
                temp_typ.walk(w);
                w.endNodeField("typ", temp_typ);
            }
            w.endNode(this, "IntfDecl", 5);
        }
    }

}
