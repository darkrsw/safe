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
 * Class Comment, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Oct 24 17:42:23 CEST 2016
 */
@SuppressWarnings("unused")
public class Comment extends AbstractNode {
    private final String _comment;

    /**
     * Constructs a Comment.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public Comment(ASTSpanInfo in_info, String in_comment) {
        super(in_info);
        if (in_comment == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'comment' to the Comment constructor was null");
        }
        _comment = in_comment;
    }

    final public String getComment() { return _comment; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forComment(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forComment(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forComment(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forComment(this);
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
            Comment casted = (Comment) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
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
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected Comment() {
        _comment = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "Comment", 2)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            String temp_comment = getComment();
            if (w.visitNodeField("comment", temp_comment)) {
                w.visitString(temp_comment);
                w.endNodeField("comment", temp_comment);
            }
            w.endNode(this, "Comment", 2);
        }
    }

}
