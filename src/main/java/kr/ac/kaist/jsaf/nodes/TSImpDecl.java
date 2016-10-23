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
 * Class TSImpDecl, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 18:57:59 CEST 2016
 */
@SuppressWarnings("unused")
public class TSImpDecl extends SourceElement {
    private final Id _id;
    private final Path _path;

    /**
     * Constructs a TSImpDecl.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public TSImpDecl(ASTSpanInfo in_info, Id in_id, Path in_path) {
        super(in_info);
        if (in_id == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'id' to the TSImpDecl constructor was null");
        }
        _id = in_id;
        if (in_path == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'path' to the TSImpDecl constructor was null");
        }
        _path = in_path;
    }

    final public Id getId() { return _id; }
    final public Path getPath() { return _path; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forTSImpDecl(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forTSImpDecl(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forTSImpDecl(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forTSImpDecl(this);
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
            TSImpDecl casted = (TSImpDecl) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Id temp_id = getId();
            Id casted_id = casted.getId();
            if (!(temp_id == casted_id || temp_id.equals(casted_id))) return false;
            Path temp_path = getPath();
            Path casted_path = casted.getPath();
            if (!(temp_path == casted_path || temp_path.equals(casted_path))) return false;
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
        Path temp_path = getPath();
        code ^= temp_path.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected TSImpDecl() {
        _id = null;
        _path = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "TSImpDecl", 3)) {
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
            Path temp_path = getPath();
            if (w.visitNodeField("path", temp_path)) {
                temp_path.walk(w);
                w.endNodeField("path", temp_path);
            }
            w.endNode(this, "TSImpDecl", 3);
        }
    }

}
