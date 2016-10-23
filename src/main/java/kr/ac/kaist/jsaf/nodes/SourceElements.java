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
 * Class SourceElements, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 18:58:00 CEST 2016
 */
@SuppressWarnings("unused")
public class SourceElements extends AbstractNode {
    private final List<SourceElement> _body;
    private final boolean _strict;

    /**
     * Constructs a SourceElements.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public SourceElements(ASTSpanInfo in_info, List<SourceElement> in_body, boolean in_strict) {
        super(in_info);
        if (in_body == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'body' to the SourceElements constructor was null");
        }
        _body = in_body;
        _strict = in_strict;
    }

    final public List<SourceElement> getBody() { return _body; }
    final public boolean isStrict() { return _strict; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forSourceElements(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forSourceElements(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forSourceElements(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forSourceElements(this);
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
            SourceElements casted = (SourceElements) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            List<SourceElement> temp_body = getBody();
            List<SourceElement> casted_body = casted.getBody();
            if (!(temp_body == casted_body || temp_body.equals(casted_body))) return false;
            boolean temp_strict = isStrict();
            boolean casted_strict = casted.isStrict();
            if (!(temp_strict == casted_strict)) return false;
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
        List<SourceElement> temp_body = getBody();
        code ^= temp_body.hashCode();
        boolean temp_strict = isStrict();
        code ^= temp_strict ? 1231 : 1237;
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected SourceElements() {
        _body = null;
        _strict = false;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "SourceElements", 3)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            List<SourceElement> temp_body = getBody();
            if (w.visitNodeField("body", temp_body)) {
                if (w.visitIterated(temp_body)) {
                    int i_temp_body = 0;
                    for (SourceElement elt_temp_body : temp_body) {
                        if (w.visitIteratedElement(i_temp_body, elt_temp_body)) {
                            if (elt_temp_body == null) w.visitNull();
                            else {
                                elt_temp_body.walk(w);
                            }
                        }
                        i_temp_body++;
                    }
                    w.endIterated(temp_body, i_temp_body);
                }
                w.endNodeField("body", temp_body);
            }
            boolean temp_strict = isStrict();
            if (w.visitNodeField("strict", temp_strict)) {
                w.visitBoolean(temp_strict);
                w.endNodeField("strict", temp_strict);
            }
            w.endNode(this, "SourceElements", 3);
        }
    }

}
