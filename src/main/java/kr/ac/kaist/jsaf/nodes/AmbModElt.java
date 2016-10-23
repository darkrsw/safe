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
 * Class AmbModElt, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 13:58:51 CEST 2016
 */
@SuppressWarnings("unused")
public class AmbModElt extends AbstractNode {
    private final SourceElement _decl;

    /**
     * Constructs a AmbModElt.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public AmbModElt(ASTSpanInfo in_info, SourceElement in_decl) {
        super(in_info);
        if (in_decl == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'decl' to the AmbModElt constructor was null");
        }
        _decl = in_decl;
    }

    final public SourceElement getDecl() { return _decl; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forAmbModElt(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forAmbModElt(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forAmbModElt(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forAmbModElt(this);
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
            AmbModElt casted = (AmbModElt) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            SourceElement temp_decl = getDecl();
            SourceElement casted_decl = casted.getDecl();
            if (!(temp_decl == casted_decl || temp_decl.equals(casted_decl))) return false;
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
        SourceElement temp_decl = getDecl();
        code ^= temp_decl.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected AmbModElt() {
        _decl = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "AmbModElt", 2)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            SourceElement temp_decl = getDecl();
            if (w.visitNodeField("decl", temp_decl)) {
                temp_decl.walk(w);
                w.endNodeField("decl", temp_decl);
            }
            w.endNode(this, "AmbModElt", 2);
        }
    }

}
