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
 * Class AmbIndDecl, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Wed Nov 09 11:44:31 CET 2016
 */
@SuppressWarnings("unused")
public class AmbIndDecl extends AmbClsElt {
    private final IndexSig _ind;

    /**
     * Constructs a AmbIndDecl.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public AmbIndDecl(ASTSpanInfo in_info, IndexSig in_ind) {
        super(in_info);
        if (in_ind == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'ind' to the AmbIndDecl constructor was null");
        }
        _ind = in_ind;
    }

    final public IndexSig getInd() { return _ind; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forAmbIndDecl(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forAmbIndDecl(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forAmbIndDecl(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forAmbIndDecl(this);
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
            AmbIndDecl casted = (AmbIndDecl) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            IndexSig temp_ind = getInd();
            IndexSig casted_ind = casted.getInd();
            if (!(temp_ind == casted_ind || temp_ind.equals(casted_ind))) return false;
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
        IndexSig temp_ind = getInd();
        code ^= temp_ind.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected AmbIndDecl() {
        _ind = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "AmbIndDecl", 2)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            IndexSig temp_ind = getInd();
            if (w.visitNodeField("ind", temp_ind)) {
                temp_ind.walk(w);
                w.endNodeField("ind", temp_ind);
            }
            w.endNode(this, "AmbIndDecl", 2);
        }
    }

}
