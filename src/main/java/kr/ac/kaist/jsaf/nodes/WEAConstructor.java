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
 * Class WEAConstructor, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Nov 21 18:10:57 CET 2016
 */
@SuppressWarnings("unused")
public class WEAConstructor extends WEAttribute {
    private final List<WArgument> _args;

    /**
     * Constructs a WEAConstructor.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public WEAConstructor(List<WArgument> in_args) {
        super();
        if (in_args == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'args' to the WEAConstructor constructor was null");
        }
        _args = in_args;
    }

    final public List<WArgument> getArgs() { return _args; }

    public <RetType> RetType accept(WNodeVisitor<RetType> visitor) {
        return visitor.forWEAConstructor(this);
    }

    public void accept(WNodeVisitor_void visitor) {
        visitor.forWEAConstructor(this);
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
            WEAConstructor casted = (WEAConstructor) obj;
            List<WArgument> temp_args = getArgs();
            List<WArgument> casted_args = casted.getArgs();
            if (!(temp_args == casted_args || temp_args.equals(casted_args))) return false;
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
        List<WArgument> temp_args = getArgs();
        code ^= temp_args.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected WEAConstructor() {
        _args = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "WEAConstructor", 1)) {
            List<WArgument> temp_args = getArgs();
            if (w.visitNodeField("args", temp_args)) {
                if (w.visitIterated(temp_args)) {
                    int i_temp_args = 0;
                    for (WArgument elt_temp_args : temp_args) {
                        if (w.visitIteratedElement(i_temp_args, elt_temp_args)) {
                            if (elt_temp_args == null) w.visitNull();
                            else {
                                elt_temp_args.walk(w);
                            }
                        }
                        i_temp_args++;
                    }
                    w.endIterated(temp_args, i_temp_args);
                }
                w.endNodeField("args", temp_args);
            }
            w.endNode(this, "WEAConstructor", 1);
        }
    }

}
