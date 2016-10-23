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
 * Class IRAssign, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 18:58:00 CEST 2016
 */
@SuppressWarnings("unused")
public abstract class IRAssign extends IRStmt {
    private final IRId _lhs;

    /**
     * Constructs a IRAssign.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IRAssign(IRSpanInfo in_info, IRId in_lhs) {
        super(in_info);
        if (in_lhs == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'lhs' to the IRAssign constructor was null");
        }
        _lhs = in_lhs;
    }

    public IRId getLhs() { return _lhs; }

    public abstract int generateHashCode();
    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IRAssign() {
        _lhs = null;
    }

}
