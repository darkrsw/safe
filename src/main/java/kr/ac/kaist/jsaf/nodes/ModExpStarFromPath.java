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
 * Class ModExpStarFromPath, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 13:58:52 CEST 2016
 */
@SuppressWarnings("unused")
public class ModExpStarFromPath extends ModExpSpecifier {
    private final Path _module;

    /**
     * Constructs a ModExpStarFromPath.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public ModExpStarFromPath(ASTSpanInfo in_info, Path in_module) {
        super(in_info);
        if (in_module == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'module' to the ModExpStarFromPath constructor was null");
        }
        _module = in_module;
    }

    final public Path getModule() { return _module; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forModExpStarFromPath(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forModExpStarFromPath(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forModExpStarFromPath(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forModExpStarFromPath(this);
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
            ModExpStarFromPath casted = (ModExpStarFromPath) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Path temp_module = getModule();
            Path casted_module = casted.getModule();
            if (!(temp_module == casted_module || temp_module.equals(casted_module))) return false;
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
        Path temp_module = getModule();
        code ^= temp_module.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected ModExpStarFromPath() {
        _module = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "ModExpStarFromPath", 2)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            Path temp_module = getModule();
            if (w.visitNodeField("module", temp_module)) {
                temp_module.walk(w);
                w.endNodeField("module", temp_module);
            }
            w.endNode(this, "ModExpStarFromPath", 2);
        }
    }

}
