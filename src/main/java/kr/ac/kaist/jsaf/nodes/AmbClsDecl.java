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
 * Class AmbClsDecl, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Wed Nov 09 11:44:31 CET 2016
 */
@SuppressWarnings("unused")
public class AmbClsDecl extends AmbDecl {
    private final Id _id;
    private final List<TypeParam> _tps;
    private final Option<TypeRef> _ext;
    private final List<TypeRef> _imp;
    private final List<AmbClsElt> _elts;

    /**
     * Constructs a AmbClsDecl.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public AmbClsDecl(ASTSpanInfo in_info, Id in_id, List<TypeParam> in_tps, Option<TypeRef> in_ext, List<TypeRef> in_imp, List<AmbClsElt> in_elts) {
        super(in_info);
        if (in_id == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'id' to the AmbClsDecl constructor was null");
        }
        _id = in_id;
        if (in_tps == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'tps' to the AmbClsDecl constructor was null");
        }
        _tps = in_tps;
        if (in_ext == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'ext' to the AmbClsDecl constructor was null");
        }
        _ext = in_ext;
        if (in_imp == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'imp' to the AmbClsDecl constructor was null");
        }
        _imp = in_imp;
        if (in_elts == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'elts' to the AmbClsDecl constructor was null");
        }
        _elts = in_elts;
    }

    final public Id getId() { return _id; }
    final public List<TypeParam> getTps() { return _tps; }
    final public Option<TypeRef> getExt() { return _ext; }
    final public List<TypeRef> getImp() { return _imp; }
    final public List<AmbClsElt> getElts() { return _elts; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forAmbClsDecl(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forAmbClsDecl(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forAmbClsDecl(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forAmbClsDecl(this);
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
            AmbClsDecl casted = (AmbClsDecl) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Id temp_id = getId();
            Id casted_id = casted.getId();
            if (!(temp_id == casted_id || temp_id.equals(casted_id))) return false;
            List<TypeParam> temp_tps = getTps();
            List<TypeParam> casted_tps = casted.getTps();
            if (!(temp_tps == casted_tps || temp_tps.equals(casted_tps))) return false;
            Option<TypeRef> temp_ext = getExt();
            Option<TypeRef> casted_ext = casted.getExt();
            if (!(temp_ext == casted_ext || temp_ext.equals(casted_ext))) return false;
            List<TypeRef> temp_imp = getImp();
            List<TypeRef> casted_imp = casted.getImp();
            if (!(temp_imp == casted_imp || temp_imp.equals(casted_imp))) return false;
            List<AmbClsElt> temp_elts = getElts();
            List<AmbClsElt> casted_elts = casted.getElts();
            if (!(temp_elts == casted_elts || temp_elts.equals(casted_elts))) return false;
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
        Option<TypeRef> temp_ext = getExt();
        code ^= temp_ext.hashCode();
        List<TypeRef> temp_imp = getImp();
        code ^= temp_imp.hashCode();
        List<AmbClsElt> temp_elts = getElts();
        code ^= temp_elts.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected AmbClsDecl() {
        _id = null;
        _tps = null;
        _ext = null;
        _imp = null;
        _elts = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "AmbClsDecl", 6)) {
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
            Option<TypeRef> temp_ext = getExt();
            if (w.visitNodeField("ext", temp_ext)) {
                if (temp_ext.isNone()) {
                    w.visitEmptyOption(temp_ext);
                }
                else if (w.visitNonEmptyOption(temp_ext)) {
                    TypeRef elt_temp_ext = temp_ext.unwrap();
                    if (elt_temp_ext == null) w.visitNull();
                    else {
                        elt_temp_ext.walk(w);
                    }
                    w.endNonEmptyOption(temp_ext);
                }
                w.endNodeField("ext", temp_ext);
            }
            List<TypeRef> temp_imp = getImp();
            if (w.visitNodeField("imp", temp_imp)) {
                if (w.visitIterated(temp_imp)) {
                    int i_temp_imp = 0;
                    for (TypeRef elt_temp_imp : temp_imp) {
                        if (w.visitIteratedElement(i_temp_imp, elt_temp_imp)) {
                            if (elt_temp_imp == null) w.visitNull();
                            else {
                                elt_temp_imp.walk(w);
                            }
                        }
                        i_temp_imp++;
                    }
                    w.endIterated(temp_imp, i_temp_imp);
                }
                w.endNodeField("imp", temp_imp);
            }
            List<AmbClsElt> temp_elts = getElts();
            if (w.visitNodeField("elts", temp_elts)) {
                if (w.visitIterated(temp_elts)) {
                    int i_temp_elts = 0;
                    for (AmbClsElt elt_temp_elts : temp_elts) {
                        if (w.visitIteratedElement(i_temp_elts, elt_temp_elts)) {
                            if (elt_temp_elts == null) w.visitNull();
                            else {
                                elt_temp_elts.walk(w);
                            }
                        }
                        i_temp_elts++;
                    }
                    w.endIterated(temp_elts, i_temp_elts);
                }
                w.endNodeField("elts", temp_elts);
            }
            w.endNode(this, "AmbClsDecl", 6);
        }
    }

}
