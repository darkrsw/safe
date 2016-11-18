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
 * Class Id, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Wed Nov 09 11:44:31 CET 2016
 */
@SuppressWarnings("unused")
public class Id extends IdOrOp {
    private final Option<String> _uniqueName;
    private final boolean _with;

    /**
     * Constructs a Id.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public Id(ASTSpanInfo in_info, String in_text, Option<String> in_uniqueName, boolean in_with) {
        super(in_info, in_text);
        if (in_uniqueName == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'uniqueName' to the Id constructor was null");
        }
        _uniqueName = in_uniqueName;
        _with = in_with;
    }

    /**
     * A constructor with some fields provided by default values.
     */
    public Id(ASTSpanInfo in_info, String in_text, boolean in_with) {
        this(in_info, in_text, Option.<String>none(), in_with);
    }

    final public Option<String> getUniqueName() { return _uniqueName; }
    final public boolean isWith() { return _with; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forId(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forId(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forId(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forId(this);
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
            Id casted = (Id) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            String temp_text = getText();
            String casted_text = casted.getText();
            if (!(temp_text == casted_text)) return false;
            Option<String> temp_uniqueName = getUniqueName();
            Option<String> casted_uniqueName = casted.getUniqueName();
            if (!(temp_uniqueName == casted_uniqueName || temp_uniqueName.equals(casted_uniqueName))) return false;
            boolean temp_with = isWith();
            boolean casted_with = casted.isWith();
            if (!(temp_with == casted_with)) return false;
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
        String temp_text = getText();
        code ^= temp_text.hashCode();
        Option<String> temp_uniqueName = getUniqueName();
        code ^= temp_uniqueName.hashCode();
        boolean temp_with = isWith();
        code ^= temp_with ? 1231 : 1237;
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected Id() {
        _uniqueName = null;
        _with = false;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "Id", 4)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            String temp_text = getText();
            if (w.visitNodeField("text", temp_text)) {
                w.visitString(temp_text);
                w.endNodeField("text", temp_text);
            }
            Option<String> temp_uniqueName = getUniqueName();
            if (w.visitNodeField("uniqueName", temp_uniqueName)) {
                if (temp_uniqueName.isNone()) {
                    w.visitEmptyOption(temp_uniqueName);
                }
                else if (w.visitNonEmptyOption(temp_uniqueName)) {
                    String elt_temp_uniqueName = temp_uniqueName.unwrap();
                    if (elt_temp_uniqueName == null) w.visitNull();
                    else {
                        w.visitString(elt_temp_uniqueName);
                    }
                    w.endNonEmptyOption(temp_uniqueName);
                }
                w.endNodeField("uniqueName", temp_uniqueName);
            }
            boolean temp_with = isWith();
            if (w.visitNodeField("with", temp_with)) {
                w.visitBoolean(temp_with);
                w.endNodeField("with", temp_with);
            }
            w.endNode(this, "Id", 4);
        }
    }

}
