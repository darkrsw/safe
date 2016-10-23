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
 * Class IdOrOp, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Sun Oct 23 18:58:00 CEST 2016
 */
@SuppressWarnings("unused")
public abstract class IdOrOp extends IdOrOpOrAnonymousName {
    private final String _text;

    /**
     * Constructs a IdOrOp.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public IdOrOp(ASTSpanInfo in_info, String in_text) {
        super(in_info);
        if (in_text == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'text' to the IdOrOp constructor was null");
        }
        _text = in_text.intern();
    }

    public String getText() { return _text; }

    public abstract int generateHashCode();
    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected IdOrOp() {
        _text = null;
    }

}
