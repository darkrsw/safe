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
 * Class ModImpAliasClause, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Wed Nov 09 11:44:31 CET 2016
 */
@SuppressWarnings("unused")
public class ModImpAliasClause extends ModImport {
    private final Path _name;
    private final Id _alias;

    /**
     * Constructs a ModImpAliasClause.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public ModImpAliasClause(ASTSpanInfo in_info, Path in_name, Id in_alias) {
        super(in_info);
        if (in_name == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'name' to the ModImpAliasClause constructor was null");
        }
        _name = in_name;
        if (in_alias == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'alias' to the ModImpAliasClause constructor was null");
        }
        _alias = in_alias;
    }

    final public Path getName() { return _name; }
    final public Id getAlias() { return _alias; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forModImpAliasClause(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forModImpAliasClause(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forModImpAliasClause(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forModImpAliasClause(this);
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
            ModImpAliasClause casted = (ModImpAliasClause) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Path temp_name = getName();
            Path casted_name = casted.getName();
            if (!(temp_name == casted_name || temp_name.equals(casted_name))) return false;
            Id temp_alias = getAlias();
            Id casted_alias = casted.getAlias();
            if (!(temp_alias == casted_alias || temp_alias.equals(casted_alias))) return false;
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
        Path temp_name = getName();
        code ^= temp_name.hashCode();
        Id temp_alias = getAlias();
        code ^= temp_alias.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected ModImpAliasClause() {
        _name = null;
        _alias = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "ModImpAliasClause", 3)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            Path temp_name = getName();
            if (w.visitNodeField("name", temp_name)) {
                temp_name.walk(w);
                w.endNodeField("name", temp_name);
            }
            Id temp_alias = getAlias();
            if (w.visitNodeField("alias", temp_alias)) {
                temp_alias.walk(w);
                w.endNodeField("alias", temp_alias);
            }
            w.endNode(this, "ModImpAliasClause", 3);
        }
    }

}
