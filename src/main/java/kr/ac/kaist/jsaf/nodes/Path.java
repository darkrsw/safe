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
 * Class Path, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Nov 21 18:10:55 CET 2016
 */
@SuppressWarnings("unused")
public class Path extends Name {
    private final List<Id> _names;

    /**
     * Constructs a Path.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public Path(ASTSpanInfo in_info, List<Id> in_names) {
        super(in_info);
        if (in_names == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'names' to the Path constructor was null");
        }
        _names = in_names;
    }

    final public List<Id> getNames() { return _names; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forPath(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forPath(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forPath(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forPath(this);
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
            Path casted = (Path) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
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
        List<Id> temp_names = getNames();
        code ^= temp_names.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected Path() {
        _names = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "Path", 2)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
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
            w.endNode(this, "Path", 2);
        }
    }

}
