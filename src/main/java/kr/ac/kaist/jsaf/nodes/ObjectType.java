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
 * Class ObjectType, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Oct 24 17:42:23 CEST 2016
 */
@SuppressWarnings("unused")
public class ObjectType extends TypeLiteral {
    private final List<TypeMember> _members;

    /**
     * Constructs a ObjectType.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public ObjectType(ASTSpanInfo in_info, List<TypeMember> in_members) {
        super(in_info);
        if (in_members == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'members' to the ObjectType constructor was null");
        }
        _members = in_members;
    }

    final public List<TypeMember> getMembers() { return _members; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forObjectType(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forObjectType(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forObjectType(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forObjectType(this);
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
            ObjectType casted = (ObjectType) obj;
            ASTSpanInfo temp_info = getInfo();
            ASTSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            List<TypeMember> temp_members = getMembers();
            List<TypeMember> casted_members = casted.getMembers();
            if (!(temp_members == casted_members || temp_members.equals(casted_members))) return false;
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
        List<TypeMember> temp_members = getMembers();
        code ^= temp_members.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected ObjectType() {
        _members = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "ObjectType", 2)) {
            ASTSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            List<TypeMember> temp_members = getMembers();
            if (w.visitNodeField("members", temp_members)) {
                if (w.visitIterated(temp_members)) {
                    int i_temp_members = 0;
                    for (TypeMember elt_temp_members : temp_members) {
                        if (w.visitIteratedElement(i_temp_members, elt_temp_members)) {
                            if (elt_temp_members == null) w.visitNull();
                            else {
                                elt_temp_members.walk(w);
                            }
                        }
                        i_temp_members++;
                    }
                    w.endIterated(temp_members, i_temp_members);
                }
                w.endNodeField("members", temp_members);
            }
            w.endNode(this, "ObjectType", 2);
        }
    }

}
