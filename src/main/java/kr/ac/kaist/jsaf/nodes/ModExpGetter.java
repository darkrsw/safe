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
 * Class ModExpGetter, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Nov 21 18:10:55 CET 2016
 */
@SuppressWarnings("unused")
public class ModExpGetter extends ModExport {
    private final GetProp _fd;

    /**
     * Constructs a ModExpGetter.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public ModExpGetter(ASTSpanInfo in_info, GetProp in_fd) {
        super(in_info);
        if (in_fd == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'fd' to the ModExpGetter constructor was null");
        }
        _fd = in_fd;
    }

    final public GetProp getFd() { return _fd; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forModExpGetter(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forModExpGetter(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forModExpGetter(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forModExpGetter(this);
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
            ModExpGetter casted = (ModExpGetter) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            GetProp temp_fd = getFd();
            GetProp casted_fd = casted.getFd();
            if (!(temp_fd == casted_fd || temp_fd.equals(casted_fd))) return false;
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
        GetProp temp_fd = getFd();
        code ^= temp_fd.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected ModExpGetter() {
        _fd = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "ModExpGetter", 2)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            GetProp temp_fd = getFd();
            if (w.visitNodeField("fd", temp_fd)) {
                temp_fd.walk(w);
                w.endNodeField("fd", temp_fd);
            }
            w.endNode(this, "ModExpGetter", 2);
        }
    }

}
