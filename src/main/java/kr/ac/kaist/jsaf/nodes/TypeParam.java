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
 * Class TypeParam, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 18:58:00 CEST 2016
 */
@SuppressWarnings("unused")
public class TypeParam extends AbstractNode {
    private final Id _name;
    private final Option<Type> _ext;

    /**
     * Constructs a TypeParam.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public TypeParam(ASTSpanInfo in_info, Id in_name, Option<Type> in_ext) {
        super(in_info);
        if (in_name == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'name' to the TypeParam constructor was null");
        }
        _name = in_name;
        if (in_ext == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'ext' to the TypeParam constructor was null");
        }
        _ext = in_ext;
    }

    final public Id getName() { return _name; }
    final public Option<Type> getExt() { return _ext; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forTypeParam(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forTypeParam(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forTypeParam(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forTypeParam(this);
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
            TypeParam casted = (TypeParam) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            Id temp_name = getName();
            Id casted_name = casted.getName();
            if (!(temp_name == casted_name || temp_name.equals(casted_name))) return false;
            Option<Type> temp_ext = getExt();
            Option<Type> casted_ext = casted.getExt();
            if (!(temp_ext == casted_ext || temp_ext.equals(casted_ext))) return false;
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
        Option<Type> temp_ext = getExt();
        code ^= temp_ext.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected TypeParam() {
        _name = null;
        _ext = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "TypeParam", 3)) {
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
            Option<Type> temp_ext = getExt();
            if (w.visitNodeField("ext", temp_ext)) {
                if (temp_ext.isNone()) {
                    w.visitEmptyOption(temp_ext);
                }
                else if (w.visitNonEmptyOption(temp_ext)) {
                    Type elt_temp_ext = temp_ext.unwrap();
                    if (elt_temp_ext == null) w.visitNull();
                    else {
                        elt_temp_ext.walk(w);
                    }
                    w.endNonEmptyOption(temp_ext);
                }
                w.endNodeField("ext", temp_ext);
            }
            w.endNode(this, "TypeParam", 3);
        }
    }

}
