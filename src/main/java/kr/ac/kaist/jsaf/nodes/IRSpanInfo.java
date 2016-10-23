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
 * Class IRSpanInfo, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 18:58:01 CEST 2016
 */
@SuppressWarnings("unused")
public class IRSpanInfo extends IRInfoNode {
    private final Span _span;

    /**
     * Constructs a IRSpanInfo.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IRSpanInfo(boolean in_fromSource, Span in_span) {
        super(in_fromSource);
        if (in_span == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'span' to the IRSpanInfo constructor was null");
        }
        _span = in_span;
    }

    final public Span getSpan() { return _span; }

    public <RetType> RetType accept(IRNodeVisitor<RetType> visitor) {
        return visitor.forIRSpanInfo(this);
    }

    public void accept(IRNodeVisitor_void visitor) {
        visitor.forIRSpanInfo(this);
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
            IRSpanInfo casted = (IRSpanInfo) obj;
            boolean temp_fromSource = isFromSource();
            boolean casted_fromSource = casted.isFromSource();
            if (!(temp_fromSource == casted_fromSource)) return false;
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
        boolean temp_fromSource = isFromSource();
        code ^= temp_fromSource ? 1231 : 1237;
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IRSpanInfo() {
        _span = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "IRSpanInfo", 2)) {
            boolean temp_fromSource = isFromSource();
            if (w.visitNodeField("fromSource", temp_fromSource)) {
                w.visitBoolean(temp_fromSource);
                w.endNodeField("fromSource", temp_fromSource);
            }
            Span temp_span = getSpan();
            if (w.visitNodeField("span", temp_span)) {
                w.visitUnknownObject(temp_span);
                w.endNodeField("span", temp_span);
            }
            w.endNode(this, "IRSpanInfo", 2);
        }
    }

}
