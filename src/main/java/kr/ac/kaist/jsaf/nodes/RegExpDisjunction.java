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
 * Class RegExpDisjunction, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Nov 21 18:10:57 CET 2016
 */
@SuppressWarnings("unused")
public abstract class RegExpDisjunction extends RegExpAbstractNode {

    /**
     * Constructs a RegExpDisjunction.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public RegExpDisjunction(RegExpNodeInfo in_info) {
        super(in_info);
    }


    public abstract int generateHashCode();
    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected RegExpDisjunction() {
    }

}
