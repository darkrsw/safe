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
 * Class WEANoInterfaceObject, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Nov 21 18:10:57 CET 2016
 */
@SuppressWarnings("unused")
public class WEANoInterfaceObject extends WEAttribute {

    /**
     * Constructs a WEANoInterfaceObject.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public WEANoInterfaceObject() {
        super();
    }


    public <RetType> RetType accept(WNodeVisitor<RetType> visitor) {
        return visitor.forWEANoInterfaceObject(this);
    }

    public void accept(WNodeVisitor_void visitor) {
        visitor.forWEANoInterfaceObject(this);
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
            WEANoInterfaceObject casted = (WEANoInterfaceObject) obj;
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
        return code;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "WEANoInterfaceObject", 0)) {
            w.endNode(this, "WEANoInterfaceObject", 0);
        }
    }

}
