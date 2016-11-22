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
 * Class AmbCnstDecl, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Nov 21 18:10:55 CET 2016
 */
@SuppressWarnings("unused")
public class AmbCnstDecl extends AmbClsElt {
    private final List<Param> _ps;

    /**
     * Constructs a AmbCnstDecl.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public AmbCnstDecl(ASTSpanInfo in_info, List<Param> in_ps) {
        super(in_info);
        if (in_ps == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'ps' to the AmbCnstDecl constructor was null");
        }
        _ps = in_ps;
    }

    final public List<Param> getPs() { return _ps; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forAmbCnstDecl(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forAmbCnstDecl(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forAmbCnstDecl(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forAmbCnstDecl(this);
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
            AmbCnstDecl casted = (AmbCnstDecl) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            List<Param> temp_ps = getPs();
            List<Param> casted_ps = casted.getPs();
            if (!(temp_ps == casted_ps || temp_ps.equals(casted_ps))) return false;
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
        List<Param> temp_ps = getPs();
        code ^= temp_ps.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected AmbCnstDecl() {
        _ps = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "AmbCnstDecl", 2)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            List<Param> temp_ps = getPs();
            if (w.visitNodeField("ps", temp_ps)) {
                if (w.visitIterated(temp_ps)) {
                    int i_temp_ps = 0;
                    for (Param elt_temp_ps : temp_ps) {
                        if (w.visitIteratedElement(i_temp_ps, elt_temp_ps)) {
                            if (elt_temp_ps == null) w.visitNull();
                            else {
                                elt_temp_ps.walk(w);
                            }
                        }
                        i_temp_ps++;
                    }
                    w.endIterated(temp_ps, i_temp_ps);
                }
                w.endNodeField("ps", temp_ps);
            }
            w.endNode(this, "AmbCnstDecl", 2);
        }
    }

}
