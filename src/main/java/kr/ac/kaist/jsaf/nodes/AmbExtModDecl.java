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
 * Class AmbExtModDecl, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 18:58:00 CEST 2016
 */
@SuppressWarnings("unused")
public class AmbExtModDecl extends AmbDecl {
    private final String _name;
    private final List<AmbExtModElt> _mem;

    /**
     * Constructs a AmbExtModDecl.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public AmbExtModDecl(ASTSpanInfo in_info, String in_name, List<AmbExtModElt> in_mem) {
        super(in_info);
        if (in_name == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'name' to the AmbExtModDecl constructor was null");
        }
        _name = in_name.intern();
        if (in_mem == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'mem' to the AmbExtModDecl constructor was null");
        }
        _mem = in_mem;
    }

    final public String getName() { return _name; }
    final public List<AmbExtModElt> getMem() { return _mem; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forAmbExtModDecl(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forAmbExtModDecl(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forAmbExtModDecl(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forAmbExtModDecl(this);
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
            AmbExtModDecl casted = (AmbExtModDecl) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            String temp_name = getName();
            String casted_name = casted.getName();
            if (!(temp_name == casted_name)) return false;
            List<AmbExtModElt> temp_mem = getMem();
            List<AmbExtModElt> casted_mem = casted.getMem();
            if (!(temp_mem == casted_mem || temp_mem.equals(casted_mem))) return false;
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
        List<AmbExtModElt> temp_mem = getMem();
        code ^= temp_mem.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected AmbExtModDecl() {
        _name = null;
        _mem = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "AmbExtModDecl", 3)) {
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
            List<AmbExtModElt> temp_mem = getMem();
            if (w.visitNodeField("mem", temp_mem)) {
                if (w.visitIterated(temp_mem)) {
                    int i_temp_mem = 0;
                    for (AmbExtModElt elt_temp_mem : temp_mem) {
                        if (w.visitIteratedElement(i_temp_mem, elt_temp_mem)) {
                            if (elt_temp_mem == null) w.visitNull();
                            else {
                                elt_temp_mem.walk(w);
                            }
                        }
                        i_temp_mem++;
                    }
                    w.endIterated(temp_mem, i_temp_mem);
                }
                w.endNodeField("mem", temp_mem);
            }
            w.endNode(this, "AmbExtModDecl", 3);
        }
    }

}
