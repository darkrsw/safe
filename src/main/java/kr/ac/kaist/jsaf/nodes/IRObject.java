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
 * Class IRObject, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 13:58:52 CEST 2016
 */
@SuppressWarnings("unused")
public class IRObject extends IRAssign {
    private final List<IRMember> _members;
    private final Option<IRId> _proto;

    /**
     * Constructs a IRObject.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IRObject(IRSpanInfo in_info, IRId in_lhs, List<IRMember> in_members, Option<IRId> in_proto) {
        super(in_info, in_lhs);
        if (in_members == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'members' to the IRObject constructor was null");
        }
        _members = in_members;
        if (in_proto == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'proto' to the IRObject constructor was null");
        }
        _proto = in_proto;
    }

    final public List<IRMember> getMembers() { return _members; }
    final public Option<IRId> getProto() { return _proto; }

    public <RetType> RetType accept(IRAbstractNodeVisitor<RetType> visitor) {
        return visitor.forIRObject(this);
    }

    public <RetType> RetType accept(IRNodeVisitor<RetType> visitor) {
        return visitor.forIRObject(this);
    }

    public void accept(IRAbstractNodeVisitor_void visitor) {
        visitor.forIRObject(this);
    }

    public void accept(IRNodeVisitor_void visitor) {
        visitor.forIRObject(this);
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
            IRObject casted = (IRObject) obj;
            IRSpanInfo temp_info = getInfo();
            IRSpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            IRId temp_lhs = getLhs();
            IRId casted_lhs = casted.getLhs();
            if (!(temp_lhs == casted_lhs || temp_lhs.equals(casted_lhs))) return false;
            List<IRMember> temp_members = getMembers();
            List<IRMember> casted_members = casted.getMembers();
            if (!(temp_members == casted_members || temp_members.equals(casted_members))) return false;
            Option<IRId> temp_proto = getProto();
            Option<IRId> casted_proto = casted.getProto();
            if (!(temp_proto == casted_proto || temp_proto.equals(casted_proto))) return false;
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
        IRSpanInfo temp_info = getInfo();
        code ^= temp_info.hashCode();
        IRId temp_lhs = getLhs();
        code ^= temp_lhs.hashCode();
        List<IRMember> temp_members = getMembers();
        code ^= temp_members.hashCode();
        Option<IRId> temp_proto = getProto();
        code ^= temp_proto.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IRObject() {
        _members = null;
        _proto = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "IRObject", 4)) {
            IRSpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            IRId temp_lhs = getLhs();
            if (w.visitNodeField("lhs", temp_lhs)) {
                temp_lhs.walk(w);
                w.endNodeField("lhs", temp_lhs);
            }
            List<IRMember> temp_members = getMembers();
            if (w.visitNodeField("members", temp_members)) {
                if (w.visitIterated(temp_members)) {
                    int i_temp_members = 0;
                    for (IRMember elt_temp_members : temp_members) {
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
            Option<IRId> temp_proto = getProto();
            if (w.visitNodeField("proto", temp_proto)) {
                if (temp_proto.isNone()) {
                    w.visitEmptyOption(temp_proto);
                }
                else if (w.visitNonEmptyOption(temp_proto)) {
                    IRId elt_temp_proto = temp_proto.unwrap();
                    if (elt_temp_proto == null) w.visitNull();
                    else {
                        elt_temp_proto.walk(w);
                    }
                    w.endNonEmptyOption(temp_proto);
                }
                w.endNodeField("proto", temp_proto);
            }
            w.endNode(this, "IRObject", 4);
        }
    }

}
