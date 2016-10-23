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

/** An abstract implementation of a visitor over WNode that does not return a value.
 ** This visitor implements the visitor interface with methods that each 
 ** delegate to a case representing their superclass.  At the top of this
 ** delegation tree is the method defaultCase(), which (unless overridden)
 ** is a no-op.
 **/
@SuppressWarnings("unused")
public class WNodeAbstractVisitor_void extends WNodeVisitorRunnable1 {
    /**
     * This method is run for all cases that are not handled elsewhere.
     * By default, it is a no-op; subclasses may override this behavior.
    **/
    public void defaultCase(WNode that) {}

    /* Methods to visit an item. */
    public void forWNode(WNode that) {
        defaultCase(that);
    }

    public void forWIDLNode(WIDLNode that) {
        forWNode(that);
    }

    public void forWIDL(WIDL that) {
        forWIDLNode(that);
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

    public void forWInterfaceMember(WInterfaceMember that) {
        forWIDLNode(that);
    }

    public void forWExceptionMember(WExceptionMember that) {
        forWIDLNode(that);
    }

    public void forWIDLNodeInfo(WIDLNodeInfo that) {
        forWNode(that);
    }

    public void forWTypeSuffix(WTypeSuffix that) {
        forWIDLNodeInfo(that);
    }

    public void forWTSArray(WTSArray that) {
        forWTypeSuffix(that);
    }

    public void forWTSQuestion(WTSQuestion that) {
        forWTypeSuffix(that);
    }

    public void forWEAttribute(WEAttribute that) {
        forWIDLNodeInfo(that);
    }

    public void forWEAConstructor(WEAConstructor that) {
        forWEAttribute(that);
    }

    public void forWEAArray(WEAArray that) {
        forWEAttribute(that);
    }

    public void forWEANoInterfaceObject(WEANoInterfaceObject that) {
        forWEAttribute(that);
    }

    public void forWEACallbackFunctionOnly(WEACallbackFunctionOnly that) {
        forWEAttribute(that);
    }

    public void forWEAString(WEAString that) {
        forWEAttribute(that);
    }

    public void forWEAQuestion(WEAQuestion that) {
        forWEAttribute(that);
    }

    public void forWEAEllipsis(WEAEllipsis that) {
        forWEAttribute(that);
    }

    public void forWEAOptional(WEAOptional that) {
        forWEAttribute(that);
    }

    public void forWEAAttribute(WEAAttribute that) {
        forWEAttribute(that);
    }

    public void forWEACallback(WEACallback that) {
        forWEAttribute(that);
    }

    public void forWEAConst(WEAConst that) {
        forWEAttribute(that);
    }

    public void forWEACreator(WEACreator that) {
        forWEAttribute(that);
    }

    public void forWEADeleter(WEADeleter that) {
        forWEAttribute(that);
    }

    public void forWEADictionary(WEADictionary that) {
        forWEAttribute(that);
    }

    public void forWEAEnum(WEAEnum that) {
        forWEAttribute(that);
    }

    public void forWEAException(WEAException that) {
        forWEAttribute(that);
    }

    public void forWEAGetter(WEAGetter that) {
        forWEAttribute(that);
    }

    public void forWEAImplements(WEAImplements that) {
        forWEAttribute(that);
    }

    public void forWEAInherit(WEAInherit that) {
        forWEAttribute(that);
    }

    public void forWEAInterface(WEAInterface that) {
        forWEAttribute(that);
    }

    public void forWEAReadonly(WEAReadonly that) {
        forWEAttribute(that);
    }

    public void forWEALegacycaller(WEALegacycaller that) {
        forWEAttribute(that);
    }

    public void forWEAPartial(WEAPartial that) {
        forWEAttribute(that);
    }

    public void forWEASetter(WEASetter that) {
        forWEAttribute(that);
    }

    public void forWEAStatic(WEAStatic that) {
        forWEAttribute(that);
    }

    public void forWEAStringifier(WEAStringifier that) {
        forWEAttribute(that);
    }

    public void forWEATypedef(WEATypedef that) {
        forWEAttribute(that);
    }

    public void forWEAUnrestricted(WEAUnrestricted that) {
        forWEAttribute(that);
    }

    public void forWQualifier(WQualifier that) {
        forWIDLNodeInfo(that);
    }

    public void forWQStatic(WQStatic that) {
        forWQualifier(that);
    }

    public void forWQGetter(WQGetter that) {
        forWQualifier(that);
    }

    public void forWQSetter(WQSetter that) {
        forWQualifier(that);
    }

    public void forWQCreator(WQCreator that) {
        forWQualifier(that);
    }

    public void forWQDeleter(WQDeleter that) {
        forWQualifier(that);
    }

    public void forWQLegacycaller(WQLegacycaller that) {
        forWQualifier(that);
    }

}
