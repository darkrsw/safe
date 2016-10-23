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
 * Class Switch, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 13:58:51 CEST 2016
 */
@SuppressWarnings("unused")
public class Switch extends Stmt {
    private final Expr _cond;
    private final List<Case> _frontCases;
    private final Option<List<Stmt>> _def;
    private final List<Case> _backCases;

    /**
     * Constructs a Switch.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public Switch(ASTSpanInfo in_info, Expr in_cond, List<Case> in_frontCases, Option<List<Stmt>> in_def, List<Case> in_backCases) {
        super(in_info);
        if (in_cond == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'cond' to the Switch constructor was null");
        }
        _cond = in_cond;
        if (in_frontCases == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'frontCases' to the Switch constructor was null");
        }
        _frontCases = in_frontCases;
        if (in_def == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'def' to the Switch constructor was null");
        }
        _def = in_def;
        if (in_backCases == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'backCases' to the Switch constructor was null");
        }
        _backCases = in_backCases;
    }

    final public Expr getCond() { return _cond; }
    final public List<Case> getFrontCases() { return _frontCases; }
    final public Option<List<Stmt>> getDef() { return _def; }
    final public List<Case> getBackCases() { return _backCases; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forSwitch(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forSwitch(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forSwitch(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forSwitch(this);
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
            Switch casted = (Switch) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Expr temp_cond = getCond();
            Expr casted_cond = casted.getCond();
            if (!(temp_cond == casted_cond || temp_cond.equals(casted_cond))) return false;
            List<Case> temp_frontCases = getFrontCases();
            List<Case> casted_frontCases = casted.getFrontCases();
            if (!(temp_frontCases == casted_frontCases || temp_frontCases.equals(casted_frontCases))) return false;
            Option<List<Stmt>> temp_def = getDef();
            Option<List<Stmt>> casted_def = casted.getDef();
            if (!(temp_def == casted_def || temp_def.equals(casted_def))) return false;
            List<Case> temp_backCases = getBackCases();
            List<Case> casted_backCases = casted.getBackCases();
            if (!(temp_backCases == casted_backCases || temp_backCases.equals(casted_backCases))) return false;
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
        Expr temp_cond = getCond();
        code ^= temp_cond.hashCode();
        List<Case> temp_frontCases = getFrontCases();
        code ^= temp_frontCases.hashCode();
        Option<List<Stmt>> temp_def = getDef();
        code ^= temp_def.hashCode();
        List<Case> temp_backCases = getBackCases();
        code ^= temp_backCases.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected Switch() {
        _cond = null;
        _frontCases = null;
        _def = null;
        _backCases = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "Switch", 5)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            Expr temp_cond = getCond();
            if (w.visitNodeField("cond", temp_cond)) {
                temp_cond.walk(w);
                w.endNodeField("cond", temp_cond);
            }
            List<Case> temp_frontCases = getFrontCases();
            if (w.visitNodeField("frontCases", temp_frontCases)) {
                if (w.visitIterated(temp_frontCases)) {
                    int i_temp_frontCases = 0;
                    for (Case elt_temp_frontCases : temp_frontCases) {
                        if (w.visitIteratedElement(i_temp_frontCases, elt_temp_frontCases)) {
                            if (elt_temp_frontCases == null) w.visitNull();
                            else {
                                elt_temp_frontCases.walk(w);
                            }
                        }
                        i_temp_frontCases++;
                    }
                    w.endIterated(temp_frontCases, i_temp_frontCases);
                }
                w.endNodeField("frontCases", temp_frontCases);
            }
            Option<List<Stmt>> temp_def = getDef();
            if (w.visitNodeField("def", temp_def)) {
                if (temp_def.isNone()) {
                    w.visitEmptyOption(temp_def);
                }
                else if (w.visitNonEmptyOption(temp_def)) {
                    List<Stmt> elt_temp_def = temp_def.unwrap();
                    if (elt_temp_def == null) w.visitNull();
                    else {
                        if (w.visitIterated(elt_temp_def)) {
                            int i_elt_temp_def = 0;
                            for (Stmt elt_elt_temp_def : elt_temp_def) {
                                if (w.visitIteratedElement(i_elt_temp_def, elt_elt_temp_def)) {
                                    if (elt_elt_temp_def == null) w.visitNull();
                                    else {
                                        elt_elt_temp_def.walk(w);
                                    }
                                }
                                i_elt_temp_def++;
                            }
                            w.endIterated(elt_temp_def, i_elt_temp_def);
                        }
                    }
                    w.endNonEmptyOption(temp_def);
                }
                w.endNodeField("def", temp_def);
            }
            List<Case> temp_backCases = getBackCases();
            if (w.visitNodeField("backCases", temp_backCases)) {
                if (w.visitIterated(temp_backCases)) {
                    int i_temp_backCases = 0;
                    for (Case elt_temp_backCases : temp_backCases) {
                        if (w.visitIteratedElement(i_temp_backCases, elt_temp_backCases)) {
                            if (elt_temp_backCases == null) w.visitNull();
                            else {
                                elt_temp_backCases.walk(w);
                            }
                        }
                        i_temp_backCases++;
                    }
                    w.endIterated(temp_backCases, i_temp_backCases);
                }
                w.endNodeField("backCases", temp_backCases);
            }
            w.endNode(this, "Switch", 5);
        }
    }

}
