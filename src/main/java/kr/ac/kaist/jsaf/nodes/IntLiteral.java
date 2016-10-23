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
 * Class IntLiteral, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 13:58:52 CEST 2016
 */
@SuppressWarnings("unused")
public class IntLiteral extends NumberLiteral {
    private final BigInteger _intVal;
    private final int _radix;

    /**
     * Constructs a IntLiteral.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IntLiteral(ASTSpanInfo in_info, BigInteger in_intVal, int in_radix) {
        super(in_info);
        if (in_intVal == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'intVal' to the IntLiteral constructor was null");
        }
        _intVal = in_intVal;
        _radix = in_radix;
    }

    final public BigInteger getIntVal() { return _intVal; }
    final public int getRadix() { return _radix; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forIntLiteral(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forIntLiteral(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forIntLiteral(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forIntLiteral(this);
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
            IntLiteral casted = (IntLiteral) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            BigInteger temp_intVal = getIntVal();
            BigInteger casted_intVal = casted.getIntVal();
            if (!(temp_intVal == casted_intVal || temp_intVal.equals(casted_intVal))) return false;
            int temp_radix = getRadix();
            int casted_radix = casted.getRadix();
            if (!(temp_radix == casted_radix)) return false;
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
        BigInteger temp_intVal = getIntVal();
        code ^= temp_intVal.hashCode();
        int temp_radix = getRadix();
        code ^= temp_radix;
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IntLiteral() {
        _intVal = null;
        _radix = 0;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "IntLiteral", 3)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            BigInteger temp_intVal = getIntVal();
            if (w.visitNodeField("intVal", temp_intVal)) {
                w.visitUnknownObject(temp_intVal);
                w.endNodeField("intVal", temp_intVal);
            }
            int temp_radix = getRadix();
            if (w.visitNodeField("radix", temp_radix)) {
                w.visitInt(temp_radix);
                w.endNodeField("radix", temp_radix);
            }
            w.endNode(this, "IntLiteral", 3);
        }
    }

}