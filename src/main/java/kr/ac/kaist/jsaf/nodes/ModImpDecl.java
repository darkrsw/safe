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
 * Class ModImpDecl, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 18:57:59 CEST 2016
 */
@SuppressWarnings("unused")
public class ModImpDecl extends SourceElement {
    private final List<ModImport> _imports;

    /**
     * Constructs a ModImpDecl.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public ModImpDecl(ASTSpanInfo in_info, List<ModImport> in_imports) {
        super(in_info);
        if (in_imports == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'imports' to the ModImpDecl constructor was null");
        }
        _imports = in_imports;
    }

    final public List<ModImport> getImports() { return _imports; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forModImpDecl(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forModImpDecl(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forModImpDecl(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forModImpDecl(this);
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
            ModImpDecl casted = (ModImpDecl) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            List<ModImport> temp_imports = getImports();
            List<ModImport> casted_imports = casted.getImports();
            if (!(temp_imports == casted_imports || temp_imports.equals(casted_imports))) return false;
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
        List<ModImport> temp_imports = getImports();
        code ^= temp_imports.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected ModImpDecl() {
        _imports = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "ModImpDecl", 2)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            List<ModImport> temp_imports = getImports();
            if (w.visitNodeField("imports", temp_imports)) {
                if (w.visitIterated(temp_imports)) {
                    int i_temp_imports = 0;
                    for (ModImport elt_temp_imports : temp_imports) {
                        if (w.visitIteratedElement(i_temp_imports, elt_temp_imports)) {
                            if (elt_temp_imports == null) w.visitNull();
                            else {
                                elt_temp_imports.walk(w);
                            }
                        }
                        i_temp_imports++;
                    }
                    w.endIterated(temp_imports, i_temp_imports);
                }
                w.endNodeField("imports", temp_imports);
            }
            w.endNode(this, "ModImpDecl", 2);
        }
    }

}
