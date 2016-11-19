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
 * Class ArrayNumberExpr, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Fri Nov 18 18:56:39 CET 2016
 */
@SuppressWarnings("unused")
public class ArrayNumberExpr extends LHS {
    private final List<Double> _elements;

    /**
     * Constructs a ArrayNumberExpr.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public ArrayNumberExpr(ASTSpanInfo in_info, List<Double> in_elements) {
        super(in_info);
        if (in_elements == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'elements' to the ArrayNumberExpr constructor was null");
        }
        _elements = in_elements;
    }

    final public List<Double> getElements() { return _elements; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forArrayNumberExpr(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forArrayNumberExpr(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forArrayNumberExpr(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forArrayNumberExpr(this);
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
            ArrayNumberExpr casted = (ArrayNumberExpr) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            List<Double> temp_elements = getElements();
            List<Double> casted_elements = casted.getElements();
            if (!(temp_elements == casted_elements || temp_elements.equals(casted_elements))) return false;
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
        List<Double> temp_elements = getElements();
        code ^= temp_elements.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected ArrayNumberExpr() {
        _elements = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "ArrayNumberExpr", 2)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            List<Double> temp_elements = getElements();
            if (w.visitNodeField("elements", temp_elements)) {
                if (w.visitIterated(temp_elements)) {
                    int i_temp_elements = 0;
                    for (Double elt_temp_elements : temp_elements) {
                        if (w.visitIteratedElement(i_temp_elements, elt_temp_elements)) {
                            if (elt_temp_elements == null) w.visitNull();
                            else {
                                w.visitUnknownObject(elt_temp_elements);
                            }
                        }
                        i_temp_elements++;
                    }
                    w.endIterated(temp_elements, i_temp_elements);
                }
                w.endNodeField("elements", temp_elements);
            }
            w.endNode(this, "ArrayNumberExpr", 2);
        }
    }

}
