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
 * Class WNull, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 13:58:53 CEST 2016
 */
@SuppressWarnings("unused")
public class WNull extends WLiteral {

    /**
     * Constructs a WNull.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public WNull(SpanInfo in_info) {
        super(in_info);
    }


    public <RetType> RetType accept(WIDLVisitor<RetType> visitor) {
        return visitor.forWNull(this);
    }

    public <RetType> RetType accept(WNodeVisitor<RetType> visitor) {
        return visitor.forWNull(this);
    }

    public void accept(WIDLVisitor_void visitor) {
        visitor.forWNull(this);
    }

    public void accept(WNodeVisitor_void visitor) {
        visitor.forWNull(this);
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
            WNull casted = (WNull) obj;
            SpanInfo temp_info = getInfo();
            SpanInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
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
        SpanInfo temp_info = getInfo();
        code ^= temp_info.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected WNull() {
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "WNull", 1)) {
            SpanInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                w.visitUnknownObject(temp_info);
                w.endNodeField("info", temp_info);
            }
            w.endNode(this, "WNull", 1);
        }
    }

}
