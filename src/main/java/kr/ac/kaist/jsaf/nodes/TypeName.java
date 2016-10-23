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
 * Class TypeName, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 13:58:52 CEST 2016
 */
@SuppressWarnings("unused")
public class TypeName extends IdOrOp {
    private final List<Id> _names;

    /**
     * Constructs a TypeName.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public TypeName(ASTSpanInfo in_info, String in_text, List<Id> in_names) {
        super(in_info, in_text);
        if (in_names == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'names' to the TypeName constructor was null");
        }
        _names = in_names;
    }

    final public List<Id> getNames() { return _names; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forTypeName(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forTypeName(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forTypeName(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forTypeName(this);
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
            TypeName casted = (TypeName) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            String temp_text = getText();
            String casted_text = casted.getText();
            if (!(temp_text == casted_text)) return false;
            List<Id> temp_names = getNames();
            List<Id> casted_names = casted.getNames();
            if (!(temp_names == casted_names || temp_names.equals(casted_names))) return false;
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
        List<Id> temp_names = getNames();
        code ^= temp_names.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected TypeName() {
        _names = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "TypeName", 3)) {
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
            List<Id> temp_names = getNames();
            if (w.visitNodeField("names", temp_names)) {
                if (w.visitIterated(temp_names)) {
                    int i_temp_names = 0;
                    for (Id elt_temp_names : temp_names) {
                        if (w.visitIteratedElement(i_temp_names, elt_temp_names)) {
                            if (elt_temp_names == null) w.visitNull();
                            else {
                                elt_temp_names.walk(w);
                            }
                        }
                        i_temp_names++;
                    }
                    w.endIterated(temp_names, i_temp_names);
                }
                w.endNodeField("names", temp_names);
            }
            w.endNode(this, "TypeName", 3);
        }
    }

}