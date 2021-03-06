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
 * Class WDefinition, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Nov 21 18:10:57 CET 2016
 */
@SuppressWarnings("unused")
public abstract class WDefinition extends WIDL {
    private final List<WEAttribute> _attrs;

    /**
     * Constructs a WDefinition.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public WDefinition(SpanInfo in_info, List<WEAttribute> in_attrs) {
        super(in_info);
        if (in_attrs == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'attrs' to the WDefinition constructor was null");
        }
        _attrs = in_attrs;
    }

    /**
     * A constructor with some fields provided by default values.
     */
    public WDefinition(SpanInfo in_info) {
        this(in_info, Collections.<WEAttribute>emptyList());
    }

    public List<WEAttribute> getAttrs() { return _attrs; }

    public abstract int generateHashCode();
    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected WDefinition() {
        _attrs = null;
    }

}
