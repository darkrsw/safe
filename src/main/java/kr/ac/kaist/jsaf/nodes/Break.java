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
 * Class Break, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Oct 24 17:42:23 CEST 2016
 */
@SuppressWarnings("unused")
public class Break extends Stmt {
    private final Option<Label> _target;

    /**
     * Constructs a Break.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public Break(ASTSpanInfo in_info, Option<Label> in_target) {
        super(in_info);
        if (in_target == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'target' to the Break constructor was null");
        }
        _target = in_target;
    }

    final public Option<Label> getTarget() { return _target; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forBreak(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forBreak(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forBreak(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forBreak(this);
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
            Break casted = (Break) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Option<Label> temp_target = getTarget();
            Option<Label> casted_target = casted.getTarget();
            if (!(temp_target == casted_target || temp_target.equals(casted_target))) return false;
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
        Option<Label> temp_target = getTarget();
        code ^= temp_target.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected Break() {
        _target = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "Break", 2)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            Option<Label> temp_target = getTarget();
            if (w.visitNodeField("target", temp_target)) {
                if (temp_target.isNone()) {
                    w.visitEmptyOption(temp_target);
                }
                else if (w.visitNonEmptyOption(temp_target)) {
                    Label elt_temp_target = temp_target.unwrap();
                    if (elt_temp_target == null) w.visitNull();
                    else {
                        elt_temp_target.walk(w);
                    }
                    w.endNonEmptyOption(temp_target);
                }
                w.endNodeField("target", temp_target);
            }
            w.endNode(this, "Break", 2);
        }
    }

}
