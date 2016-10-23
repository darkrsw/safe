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
 * Class Param, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 18:58:00 CEST 2016
 */
@SuppressWarnings("unused")
public class Param extends AbstractNode {
    private final Id _name;
    private final Option<Modifier> _mod;
    private final Option<Type> _typ;
    private final Option<Expr> _defaultExpr;
    private final boolean _optional;
    private final boolean _rest;

    /**
     * Constructs a Param.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public Param(ASTSpanInfo in_info, Id in_name, Option<Modifier> in_mod, Option<Type> in_typ, Option<Expr> in_defaultExpr, boolean in_optional, boolean in_rest) {
        super(in_info);
        if (in_name == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'name' to the Param constructor was null");
        }
        _name = in_name;
        if (in_mod == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'mod' to the Param constructor was null");
        }
        _mod = in_mod;
        if (in_typ == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'typ' to the Param constructor was null");
        }
        _typ = in_typ;
        if (in_defaultExpr == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'defaultExpr' to the Param constructor was null");
        }
        _defaultExpr = in_defaultExpr;
        _optional = in_optional;
        _rest = in_rest;
    }

    final public Id getName() { return _name; }
    final public Option<Modifier> getMod() { return _mod; }
    final public Option<Type> getTyp() { return _typ; }
    final public Option<Expr> getDefaultExpr() { return _defaultExpr; }
    final public boolean isOptional() { return _optional; }
    final public boolean isRest() { return _rest; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forParam(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forParam(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forParam(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forParam(this);
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
            Param casted = (Param) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Id temp_name = getName();
            Id casted_name = casted.getName();
            if (!(temp_name == casted_name || temp_name.equals(casted_name))) return false;
            Option<Modifier> temp_mod = getMod();
            Option<Modifier> casted_mod = casted.getMod();
            if (!(temp_mod == casted_mod || temp_mod.equals(casted_mod))) return false;
            Option<Type> temp_typ = getTyp();
            Option<Type> casted_typ = casted.getTyp();
            if (!(temp_typ == casted_typ || temp_typ.equals(casted_typ))) return false;
            Option<Expr> temp_defaultExpr = getDefaultExpr();
            Option<Expr> casted_defaultExpr = casted.getDefaultExpr();
            if (!(temp_defaultExpr == casted_defaultExpr || temp_defaultExpr.equals(casted_defaultExpr))) return false;
            boolean temp_optional = isOptional();
            boolean casted_optional = casted.isOptional();
            if (!(temp_optional == casted_optional)) return false;
            boolean temp_rest = isRest();
            boolean casted_rest = casted.isRest();
            if (!(temp_rest == casted_rest)) return false;
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
        Id temp_name = getName();
        code ^= temp_name.hashCode();
        Option<Modifier> temp_mod = getMod();
        code ^= temp_mod.hashCode();
        Option<Type> temp_typ = getTyp();
        code ^= temp_typ.hashCode();
        Option<Expr> temp_defaultExpr = getDefaultExpr();
        code ^= temp_defaultExpr.hashCode();
        boolean temp_optional = isOptional();
        code ^= temp_optional ? 1231 : 1237;
        boolean temp_rest = isRest();
        code ^= temp_rest ? 1231 : 1237;
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected Param() {
        _name = null;
        _mod = null;
        _typ = null;
        _defaultExpr = null;
        _optional = false;
        _rest = false;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "Param", 7)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            Id temp_name = getName();
            if (w.visitNodeField("name", temp_name)) {
                temp_name.walk(w);
                w.endNodeField("name", temp_name);
            }
            Option<Modifier> temp_mod = getMod();
            if (w.visitNodeField("mod", temp_mod)) {
                if (temp_mod.isNone()) {
                    w.visitEmptyOption(temp_mod);
                }
                else if (w.visitNonEmptyOption(temp_mod)) {
                    Modifier elt_temp_mod = temp_mod.unwrap();
                    if (elt_temp_mod == null) w.visitNull();
                    else {
                        elt_temp_mod.walk(w);
                    }
                    w.endNonEmptyOption(temp_mod);
                }
                w.endNodeField("mod", temp_mod);
            }
            Option<Type> temp_typ = getTyp();
            if (w.visitNodeField("typ", temp_typ)) {
                if (temp_typ.isNone()) {
                    w.visitEmptyOption(temp_typ);
                }
                else if (w.visitNonEmptyOption(temp_typ)) {
                    Type elt_temp_typ = temp_typ.unwrap();
                    if (elt_temp_typ == null) w.visitNull();
                    else {
                        elt_temp_typ.walk(w);
                    }
                    w.endNonEmptyOption(temp_typ);
                }
                w.endNodeField("typ", temp_typ);
            }
            Option<Expr> temp_defaultExpr = getDefaultExpr();
            if (w.visitNodeField("defaultExpr", temp_defaultExpr)) {
                if (temp_defaultExpr.isNone()) {
                    w.visitEmptyOption(temp_defaultExpr);
                }
                else if (w.visitNonEmptyOption(temp_defaultExpr)) {
                    Expr elt_temp_defaultExpr = temp_defaultExpr.unwrap();
                    if (elt_temp_defaultExpr == null) w.visitNull();
                    else {
                        elt_temp_defaultExpr.walk(w);
                    }
                    w.endNonEmptyOption(temp_defaultExpr);
                }
                w.endNodeField("defaultExpr", temp_defaultExpr);
            }
            boolean temp_optional = isOptional();
            if (w.visitNodeField("optional", temp_optional)) {
                w.visitBoolean(temp_optional);
                w.endNodeField("optional", temp_optional);
            }
            boolean temp_rest = isRest();
            if (w.visitNodeField("rest", temp_rest)) {
                w.visitBoolean(temp_rest);
                w.endNodeField("rest", temp_rest);
            }
            w.endNode(this, "Param", 7);
        }
    }

}
