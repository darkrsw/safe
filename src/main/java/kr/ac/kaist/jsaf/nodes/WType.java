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
 * Class WType, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 13:58:53 CEST 2016
 */
@SuppressWarnings("unused")
public abstract class WType extends WIDL {
    private final List<WTypeSuffix> _suffix;

    /**
     * Constructs a WType.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public WType(SpanInfo in_info, List<WTypeSuffix> in_suffix) {
        super(in_info);
        if (in_suffix == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'suffix' to the WType constructor was null");
        }
        _suffix = in_suffix;
    }

    /**
     * A constructor with some fields provided by default values.
     */
    public WType(SpanInfo in_info) {
        this(in_info, Collections.<WTypeSuffix>emptyList());
    }

    public List<WTypeSuffix> getSuffix() { return _suffix; }

    public abstract int generateHashCode();
    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected WType() {
        _suffix = null;
    }

}
