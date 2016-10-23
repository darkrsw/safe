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
 * Class FunDecl, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 18:58:00 CEST 2016
 */
@SuppressWarnings("unused")
public class FunDecl extends Stmt {
    private final Functional _ftn;
    private final boolean _strict;

    /**
     * Constructs a FunDecl.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public FunDecl(ASTSpanInfo in_info, Functional in_ftn, boolean in_strict) {
        super(in_info);
        if (in_ftn == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'ftn' to the FunDecl constructor was null");
        }
        _ftn = in_ftn;
        _strict = in_strict;
    }

    /**
     * A constructor with some fields provided by default values.
     */
    public FunDecl(ASTSpanInfo in_info, Functional in_ftn) {
        this(in_info, in_ftn, false);
    }

    final public Functional getFtn() { return _ftn; }
    final public boolean isStrict() { return _strict; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forFunDecl(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forFunDecl(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forFunDecl(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forFunDecl(this);
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
            FunDecl casted = (FunDecl) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Functional temp_ftn = getFtn();
            Functional casted_ftn = casted.getFtn();
            if (!(temp_ftn == casted_ftn || temp_ftn.equals(casted_ftn))) return false;
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
        Functional temp_ftn = getFtn();
        code ^= temp_ftn.hashCode();
        boolean temp_strict = isStrict();
        code ^= temp_strict ? 1231 : 1237;
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected FunDecl() {
        _ftn = null;
        _strict = false;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "FunDecl", 3)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            Functional temp_ftn = getFtn();
            if (w.visitNodeField("ftn", temp_ftn)) {
                temp_ftn.walk(w);
                w.endNodeField("ftn", temp_ftn);
            }
            boolean temp_strict = isStrict();
            if (w.visitNodeField("strict", temp_strict)) {
                w.visitBoolean(temp_strict);
                w.endNodeField("strict", temp_strict);
            }
            w.endNode(this, "FunDecl", 3);
        }
    }

}
