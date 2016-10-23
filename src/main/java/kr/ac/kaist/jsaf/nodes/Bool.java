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
 * Class Bool, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 13:58:52 CEST 2016
 */
@SuppressWarnings("unused")
public class Bool extends Literal {
    private final boolean _bool;

    /**
     * Constructs a Bool.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public Bool(ASTSpanInfo in_info, boolean in_bool) {
        super(in_info);
        _bool = in_bool;
    }

    final public boolean isBool() { return _bool; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forBool(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forBool(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forBool(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forBool(this);
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
            Bool casted = (Bool) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            boolean temp_bool = isBool();
            boolean casted_bool = casted.isBool();
            if (!(temp_bool == casted_bool)) return false;
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
        boolean temp_bool = isBool();
        code ^= temp_bool ? 1231 : 1237;
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected Bool() {
        _bool = false;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "Bool", 2)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            boolean temp_bool = isBool();
            if (w.visitNodeField("bool", temp_bool)) {
                w.visitBoolean(temp_bool);
                w.endNodeField("bool", temp_bool);
            }
            w.endNode(this, "Bool", 2);
        }
    }

}
