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
 * Class AmbEnumMem, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Nov 21 18:10:55 CET 2016
 */
@SuppressWarnings("unused")
public class AmbEnumMem extends AbstractNode {
    private final Property _prop;
    private final Option<NumberLiteral> _num;

    /**
     * Constructs a AmbEnumMem.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public AmbEnumMem(ASTSpanInfo in_info, Property in_prop, Option<NumberLiteral> in_num) {
        super(in_info);
        if (in_prop == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'prop' to the AmbEnumMem constructor was null");
        }
        _prop = in_prop;
        if (in_num == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'num' to the AmbEnumMem constructor was null");
        }
        _num = in_num;
    }

    final public Property getProp() { return _prop; }
    final public Option<NumberLiteral> getNum() { return _num; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forAmbEnumMem(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forAmbEnumMem(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forAmbEnumMem(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forAmbEnumMem(this);
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
            AmbEnumMem casted = (AmbEnumMem) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Property temp_prop = getProp();
            Property casted_prop = casted.getProp();
            if (!(temp_prop == casted_prop || temp_prop.equals(casted_prop))) return false;
            Option<NumberLiteral> temp_num = getNum();
            Option<NumberLiteral> casted_num = casted.getNum();
            if (!(temp_num == casted_num || temp_num.equals(casted_num))) return false;
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
        Property temp_prop = getProp();
        code ^= temp_prop.hashCode();
        Option<NumberLiteral> temp_num = getNum();
        code ^= temp_num.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected AmbEnumMem() {
        _prop = null;
        _num = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "AmbEnumMem", 3)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            Property temp_prop = getProp();
            if (w.visitNodeField("prop", temp_prop)) {
                temp_prop.walk(w);
                w.endNodeField("prop", temp_prop);
            }
            Option<NumberLiteral> temp_num = getNum();
            if (w.visitNodeField("num", temp_num)) {
                if (temp_num.isNone()) {
                    w.visitEmptyOption(temp_num);
                }
                else if (w.visitNonEmptyOption(temp_num)) {
                    NumberLiteral elt_temp_num = temp_num.unwrap();
                    if (elt_temp_num == null) w.visitNull();
                    else {
                        elt_temp_num.walk(w);
                    }
                    w.endNonEmptyOption(temp_num);
                }
                w.endNodeField("num", temp_num);
            }
            w.endNode(this, "AmbEnumMem", 3);
        }
    }

}
