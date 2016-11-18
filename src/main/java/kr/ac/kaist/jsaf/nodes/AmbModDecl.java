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
 * Class AmbModDecl, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Wed Nov 09 11:44:31 CET 2016
 */
@SuppressWarnings("unused")
public class AmbModDecl extends AmbDecl {
    private final Path _path;
    private final List<AmbModElt> _mem;

    /**
     * Constructs a AmbModDecl.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public AmbModDecl(ASTSpanInfo in_info, Path in_path, List<AmbModElt> in_mem) {
        super(in_info);
        if (in_path == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'path' to the AmbModDecl constructor was null");
        }
        _path = in_path;
        if (in_mem == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'mem' to the AmbModDecl constructor was null");
        }
        _mem = in_mem;
    }

    final public Path getPath() { return _path; }
    final public List<AmbModElt> getMem() { return _mem; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forAmbModDecl(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forAmbModDecl(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forAmbModDecl(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forAmbModDecl(this);
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
            AmbModDecl casted = (AmbModDecl) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Path temp_path = getPath();
            Path casted_path = casted.getPath();
            if (!(temp_path == casted_path || temp_path.equals(casted_path))) return false;
            List<AmbModElt> temp_mem = getMem();
            List<AmbModElt> casted_mem = casted.getMem();
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
        Path temp_path = getPath();
        code ^= temp_path.hashCode();
        List<AmbModElt> temp_mem = getMem();
        code ^= temp_mem.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected AmbModDecl() {
        _path = null;
        _mem = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "AmbModDecl", 3)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            Path temp_path = getPath();
            if (w.visitNodeField("path", temp_path)) {
                temp_path.walk(w);
                w.endNodeField("path", temp_path);
            }
            List<AmbModElt> temp_mem = getMem();
            if (w.visitNodeField("mem", temp_mem)) {
                if (w.visitIterated(temp_mem)) {
                    int i_temp_mem = 0;
                    for (AmbModElt elt_temp_mem : temp_mem) {
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
            w.endNode(this, "AmbModDecl", 3);
        }
    }

}
