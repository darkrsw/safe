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
 * Class Try, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 18:58:00 CEST 2016
 */
@SuppressWarnings("unused")
public class Try extends Stmt {
    private final List<Stmt> _body;
    private final Option<Catch> _catchBlock;
    private final Option<List<Stmt>> _fin;

    /**
     * Constructs a Try.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public Try(ASTSpanInfo in_info, List<Stmt> in_body, Option<Catch> in_catchBlock, Option<List<Stmt>> in_fin) {
        super(in_info);
        if (in_body == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'body' to the Try constructor was null");
        }
        _body = in_body;
        if (in_catchBlock == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'catchBlock' to the Try constructor was null");
        }
        _catchBlock = in_catchBlock;
        if (in_fin == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'fin' to the Try constructor was null");
        }
        _fin = in_fin;
    }

    final public List<Stmt> getBody() { return _body; }
    final public Option<Catch> getCatchBlock() { return _catchBlock; }
    final public Option<List<Stmt>> getFin() { return _fin; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forTry(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forTry(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forTry(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forTry(this);
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
            Try casted = (Try) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            List<Stmt> temp_body = getBody();
            List<Stmt> casted_body = casted.getBody();
            if (!(temp_body == casted_body || temp_body.equals(casted_body))) return false;
            Option<Catch> temp_catchBlock = getCatchBlock();
            Option<Catch> casted_catchBlock = casted.getCatchBlock();
            if (!(temp_catchBlock == casted_catchBlock || temp_catchBlock.equals(casted_catchBlock))) return false;
            Option<List<Stmt>> temp_fin = getFin();
            Option<List<Stmt>> casted_fin = casted.getFin();
            if (!(temp_fin == casted_fin || temp_fin.equals(casted_fin))) return false;
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
        List<Stmt> temp_body = getBody();
        code ^= temp_body.hashCode();
        Option<Catch> temp_catchBlock = getCatchBlock();
        code ^= temp_catchBlock.hashCode();
        Option<List<Stmt>> temp_fin = getFin();
        code ^= temp_fin.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected Try() {
        _body = null;
        _catchBlock = null;
        _fin = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "Try", 4)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            List<Stmt> temp_body = getBody();
            if (w.visitNodeField("body", temp_body)) {
                if (w.visitIterated(temp_body)) {
                    int i_temp_body = 0;
                    for (Stmt elt_temp_body : temp_body) {
                        if (w.visitIteratedElement(i_temp_body, elt_temp_body)) {
                            if (elt_temp_body == null) w.visitNull();
                            else {
                                elt_temp_body.walk(w);
                            }
                        }
                        i_temp_body++;
                    }
                    w.endIterated(temp_body, i_temp_body);
                }
                w.endNodeField("body", temp_body);
            }
            Option<Catch> temp_catchBlock = getCatchBlock();
            if (w.visitNodeField("catchBlock", temp_catchBlock)) {
                if (temp_catchBlock.isNone()) {
                    w.visitEmptyOption(temp_catchBlock);
                }
                else if (w.visitNonEmptyOption(temp_catchBlock)) {
                    Catch elt_temp_catchBlock = temp_catchBlock.unwrap();
                    if (elt_temp_catchBlock == null) w.visitNull();
                    else {
                        elt_temp_catchBlock.walk(w);
                    }
                    w.endNonEmptyOption(temp_catchBlock);
                }
                w.endNodeField("catchBlock", temp_catchBlock);
            }
            Option<List<Stmt>> temp_fin = getFin();
            if (w.visitNodeField("fin", temp_fin)) {
                if (temp_fin.isNone()) {
                    w.visitEmptyOption(temp_fin);
                }
                else if (w.visitNonEmptyOption(temp_fin)) {
                    List<Stmt> elt_temp_fin = temp_fin.unwrap();
                    if (elt_temp_fin == null) w.visitNull();
                    else {
                        if (w.visitIterated(elt_temp_fin)) {
                            int i_elt_temp_fin = 0;
                            for (Stmt elt_elt_temp_fin : elt_temp_fin) {
                                if (w.visitIteratedElement(i_elt_temp_fin, elt_elt_temp_fin)) {
                                    if (elt_elt_temp_fin == null) w.visitNull();
                                    else {
                                        elt_elt_temp_fin.walk(w);
                                    }
                                }
                                i_elt_temp_fin++;
                            }
                            w.endIterated(elt_temp_fin, i_elt_temp_fin);
                        }
                    }
                    w.endNonEmptyOption(temp_fin);
                }
                w.endNodeField("fin", temp_fin);
            }
            w.endNode(this, "Try", 4);
        }
    }

}
