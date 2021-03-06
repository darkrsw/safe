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
 * Class IRExpr, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Nov 21 18:10:56 CET 2016
 */
@SuppressWarnings("unused")
public abstract class IRExpr extends UIDObject implements IRNode {
    private final IRSpanInfo _info;

    /**
     * Constructs a IRExpr.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IRExpr(IRSpanInfo in_info) {
        super();
        if (in_info == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'info' to the IRExpr constructor was null");
        }
        _info = in_info;
    }

    public IRSpanInfo getInfo() { return _info; }

    public abstract <RetType> RetType accept(IRNodeVisitor<RetType> visitor);

    public abstract void accept(IRNodeVisitor_void visitor);

    private int _hashCode;
    private boolean _hasHashCode = false;

    public final int hashCode() {
        if (! _hasHashCode) { _hashCode = generateHashCode(); _hasHashCode = true; }
        return _hashCode;
    }

    public abstract int generateHashCode();
    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IRExpr() {
        _info = null;
    }

    /** Generate a human-readable representation that can be deserialized. */
    public java.lang.String serialize() {
        java.io.StringWriter w = new java.io.StringWriter();
        walk(new LosslessStringWalker(w, 2));
        return w.toString();
    }
    /** Generate a human-readable representation that can be deserialized. */
    public void serialize(java.io.Writer writer) {
        walk(new LosslessStringWalker(writer, 2));
    }

    public abstract void walk(TreeWalker w);
}
