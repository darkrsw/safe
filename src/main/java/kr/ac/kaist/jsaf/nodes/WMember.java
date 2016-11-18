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
 * Class WMember, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Wed Nov 09 11:44:32 CET 2016
 */
@SuppressWarnings("unused")
public abstract class WMember extends WIDL {
    private final List<WEAttribute> _attrs;

    /**
     * Constructs a WMember.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public WMember(SpanInfo in_info, List<WEAttribute> in_attrs) {
        super(in_info);
        if (in_attrs == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'attrs' to the WMember constructor was null");
        }
        _attrs = in_attrs;
    }

    /**
     * A constructor with some fields provided by default values.
     */
    public WMember(SpanInfo in_info) {
        this(in_info, Collections.<WEAttribute>emptyList());
    }

    public List<WEAttribute> getAttrs() { return _attrs; }

    public abstract int generateHashCode();
    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected WMember() {
        _attrs = null;
    }

}
