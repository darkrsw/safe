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

/** An abstract implementation of a visitor over WIDL that does not return a value.
 ** This visitor implements the visitor interface with methods that each 
 ** delegate to a case representing their superclass.  At the top of this
 ** delegation tree is the method defaultCase(), which (unless overridden)
 ** is a no-op.
 **/
@SuppressWarnings("unused")
public class WIDLAbstractVisitor_void extends WIDLVisitorRunnable1 {
    /**
     * This method is run for all cases that are not handled elsewhere.
     * By default, it is a no-op; subclasses may override this behavior.
    **/
    public void defaultCase(WIDL that) {}

    /* Methods to visit an item. */
    public void forWIDL(WIDL that) {
        defaultCase(that);
    }

    public void forWDefinition(WDefinition that) {
        forWIDL(that);
    }

    public void forWModule(WModule that) {
        forWDefinition(that);
    }

    public void forWInterface(WInterface that) {
        forWDefinition(that);
    }

    public void forWCallback(WCallback that) {
        forWDefinition(that);
    }

    public void forWDictionary(WDictionary that) {
        forWDefinition(that);
    }

    public void forWException(WException that) {
        forWDefinition(that);
    }

    public void forWEnum(WEnum that) {
        forWDefinition(that);
    }

    public void forWTypedef(WTypedef that) {
        forWDefinition(that);
    }

    public void forWImplementsStatement(WImplementsStatement that) {
        forWDefinition(that);
    }

    public void forWMember(WMember that) {
        forWIDL(that);
    }

    public void forWConst(WConst that) {
        forWMember(that);
    }

    public void forWAttribute(WAttribute that) {
        forWMember(that);
    }

    public void forWOperation(WOperation that) {
        forWMember(that);
    }

    public void forWDictionaryMember(WDictionaryMember that) {
        forWMember(that);
    }

    public void forWExceptionField(WExceptionField that) {
        forWMember(that);
    }

    public void forWLiteral(WLiteral that) {
        forWIDL(that);
    }

    public void forWBoolean(WBoolean that) {
        forWLiteral(that);
    }

    public void forWFloat(WFloat that) {
        forWLiteral(that);
    }

    public void forWInteger(WInteger that) {
        forWLiteral(that);
    }

    public void forWString(WString that) {
        forWLiteral(that);
    }

    public void forWNull(WNull that) {
        forWLiteral(that);
    }

    public void forWType(WType that) {
        forWIDL(that);
    }

    public void forWAnyType(WAnyType that) {
        forWType(that);
    }

    public void forWNamedType(WNamedType that) {
        forWType(that);
    }

    public void forWArrayType(WArrayType that) {
        forWType(that);
    }

    public void forWSequenceType(WSequenceType that) {
        forWType(that);
    }

    public void forWUnionType(WUnionType that) {
        forWType(that);
    }

    public void forWArgument(WArgument that) {
        forWIDL(that);
    }

    public void forWId(WId that) {
        forWIDL(that);
    }

    public void forWQId(WQId that) {
        forWIDL(that);
    }

}
