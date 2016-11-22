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
 * Class TypeQuery, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Nov 21 18:10:56 CET 2016
 */
@SuppressWarnings("unused")
public class TypeQuery extends Type {
    private final Path _path;

    /**
     * Constructs a TypeQuery.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public TypeQuery(ASTSpanInfo in_info, Path in_path) {
        super(in_info);
        if (in_path == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'path' to the TypeQuery constructor was null");
        }
        _path = in_path;
    }

    final public Path getPath() { return _path; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forTypeQuery(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forTypeQuery(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forTypeQuery(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forTypeQuery(this);
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
            TypeQuery casted = (TypeQuery) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
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
        Path temp_path = getPath();
        code ^= temp_path.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected TypeQuery() {
        _path = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "TypeQuery", 2)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            Path temp_path = getPath();
            if (w.visitNodeField("path", temp_path)) {
                temp_path.walk(w);
                w.endNodeField("path", temp_path);
            }
            w.endNode(this, "TypeQuery", 2);
        }
    }

}
