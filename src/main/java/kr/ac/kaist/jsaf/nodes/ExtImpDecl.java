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
 * Class ExtImpDecl, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Oct 24 17:42:23 CEST 2016
 */
@SuppressWarnings("unused")
public class ExtImpDecl extends SourceElement {
    private final Id _id;
    private final String _module;

    /**
     * Constructs a ExtImpDecl.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public ExtImpDecl(ASTSpanInfo in_info, Id in_id, String in_module) {
        super(in_info);
        if (in_id == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'id' to the ExtImpDecl constructor was null");
        }
        _id = in_id;
        if (in_module == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'module' to the ExtImpDecl constructor was null");
        }
        _module = in_module.intern();
    }

    final public Id getId() { return _id; }
    final public String getModule() { return _module; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forExtImpDecl(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forExtImpDecl(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forExtImpDecl(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forExtImpDecl(this);
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
            ExtImpDecl casted = (ExtImpDecl) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Id temp_id = getId();
            Id casted_id = casted.getId();
            if (!(temp_id == casted_id || temp_id.equals(casted_id))) return false;
            String temp_module = getModule();
            String casted_module = casted.getModule();
            if (!(temp_module == casted_module)) return false;
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
        String temp_module = getModule();
        code ^= temp_module.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected ExtImpDecl() {
        _id = null;
        _module = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "ExtImpDecl", 3)) {
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
            String temp_module = getModule();
            if (w.visitNodeField("module", temp_module)) {
                w.visitString(temp_module);
                w.endNodeField("module", temp_module);
            }
            w.endNode(this, "ExtImpDecl", 3);
        }
    }

}
