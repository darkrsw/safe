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
 * Class ModDecl, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 13:58:51 CEST 2016
 */
@SuppressWarnings("unused")
public class ModDecl extends Module {
    private final Id _name;
    private final TopLevel _body;

    /**
     * Constructs a ModDecl.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public ModDecl(ASTSpanInfo in_info, Id in_name, TopLevel in_body) {
        super(in_info);
        if (in_name == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'name' to the ModDecl constructor was null");
        }
        _name = in_name;
        if (in_body == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'body' to the ModDecl constructor was null");
        }
        _body = in_body;
    }

    final public Id getName() { return _name; }
    final public TopLevel getBody() { return _body; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forModDecl(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forModDecl(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forModDecl(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forModDecl(this);
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
            ModDecl casted = (ModDecl) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Id temp_name = getName();
            Id casted_name = casted.getName();
            if (!(temp_name == casted_name || temp_name.equals(casted_name))) return false;
            TopLevel temp_body = getBody();
            TopLevel casted_body = casted.getBody();
            if (!(temp_body == casted_body || temp_body.equals(casted_body))) return false;
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
        Id temp_name = getName();
        code ^= temp_name.hashCode();
        TopLevel temp_body = getBody();
        code ^= temp_body.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected ModDecl() {
        _name = null;
        _body = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "ModDecl", 3)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            Id temp_name = getName();
            if (w.visitNodeField("name", temp_name)) {
                temp_name.walk(w);
                w.endNodeField("name", temp_name);
            }
            TopLevel temp_body = getBody();
            if (w.visitNodeField("body", temp_body)) {
                temp_body.walk(w);
                w.endNodeField("body", temp_body);
            }
            w.endNode(this, "ModDecl", 3);
        }
    }

}
