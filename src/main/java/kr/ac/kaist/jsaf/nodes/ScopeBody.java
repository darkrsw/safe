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
 * Class ScopeBody, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 13:58:52 CEST 2016
 */
@SuppressWarnings("unused")
public abstract class ScopeBody extends UIDObject implements Node {
    private final List<FunDecl> _fds;
    private final List<VarDecl> _vds;

    /**
     * Constructs a ScopeBody.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public ScopeBody(List<FunDecl> in_fds, List<VarDecl> in_vds) {
        super();
        if (in_fds == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'fds' to the ScopeBody constructor was null");
        }
        _fds = in_fds;
        if (in_vds == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'vds' to the ScopeBody constructor was null");
        }
        _vds = in_vds;
    }

    public List<FunDecl> getFds() { return _fds; }
    public List<VarDecl> getVds() { return _vds; }

    public abstract <RetType> RetType accept(NodeVisitor<RetType> visitor);

    public abstract void accept(NodeVisitor_void visitor);

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
    protected ScopeBody() {
        _fds = null;
        _vds = null;
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
