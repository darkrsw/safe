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
 * Class ExprType, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Oct 24 17:42:23 CEST 2016
 */
@SuppressWarnings("unused")
public class ExprType extends Type {
    private final String _name;

    /**
     * Constructs a ExprType.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public ExprType(ASTSpanInfo in_info, String in_name) {
        super(in_info);
        if (in_name == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'name' to the ExprType constructor was null");
        }
        _name = in_name.intern();
    }

    final public String getName() { return _name; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forExprType(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forExprType(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forExprType(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forExprType(this);
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
            ExprType casted = (ExprType) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            String temp_name = getName();
            String casted_name = casted.getName();
            if (!(temp_name == casted_name)) return false;
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
        String temp_name = getName();
        code ^= temp_name.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected ExprType() {
        _name = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "ExprType", 2)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            String temp_name = getName();
            if (w.visitNodeField("name", temp_name)) {
                w.visitString(temp_name);
                w.endNodeField("name", temp_name);
            }
            w.endNode(this, "ExprType", 2);
        }
    }

}
