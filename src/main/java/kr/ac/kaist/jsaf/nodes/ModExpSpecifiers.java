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
 * Class ModExpSpecifiers, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Fri Nov 18 18:56:39 CET 2016
 */
@SuppressWarnings("unused")
public class ModExpSpecifiers extends ModExport {
    private final List<ModExpSpecifier> _names;

    /**
     * Constructs a ModExpSpecifiers.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public ModExpSpecifiers(ASTSpanInfo in_info, List<ModExpSpecifier> in_names) {
        super(in_info);
        if (in_names == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'names' to the ModExpSpecifiers constructor was null");
        }
        _names = in_names;
    }

    final public List<ModExpSpecifier> getNames() { return _names; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forModExpSpecifiers(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forModExpSpecifiers(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forModExpSpecifiers(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forModExpSpecifiers(this);
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
            ModExpSpecifiers casted = (ModExpSpecifiers) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            List<ModExpSpecifier> temp_names = getNames();
            List<ModExpSpecifier> casted_names = casted.getNames();
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
        List<ModExpSpecifier> temp_names = getNames();
        code ^= temp_names.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected ModExpSpecifiers() {
        _names = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "ModExpSpecifiers", 2)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            List<ModExpSpecifier> temp_names = getNames();
            if (w.visitNodeField("names", temp_names)) {
                if (w.visitIterated(temp_names)) {
                    int i_temp_names = 0;
                    for (ModExpSpecifier elt_temp_names : temp_names) {
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
            w.endNode(this, "ModExpSpecifiers", 2);
        }
    }

}
