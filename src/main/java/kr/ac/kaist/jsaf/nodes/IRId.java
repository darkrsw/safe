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
 * Class IRId, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Mon Oct 24 17:42:24 CEST 2016
 */
@SuppressWarnings("unused")
public abstract class IRId extends IRExpr {
    private final String _originalName;
    private final String _uniqueName;
    private final boolean _global;

    /**
     * Constructs a IRId.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IRId(IRSpanInfo in_info, String in_originalName, String in_uniqueName, boolean in_global) {
        super(in_info);
        if (in_originalName == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'originalName' to the IRId constructor was null");
        }
        _originalName = in_originalName.intern();
        if (in_uniqueName == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'uniqueName' to the IRId constructor was null");
        }
        _uniqueName = in_uniqueName.intern();
        _global = in_global;
    }

    public String getOriginalName() { return _originalName; }
    public String getUniqueName() { return _uniqueName; }
    public boolean isGlobal() { return _global; }

    public abstract int generateHashCode();
    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IRId() {
        _originalName = null;
        _uniqueName = null;
        _global = false;
    }

}
