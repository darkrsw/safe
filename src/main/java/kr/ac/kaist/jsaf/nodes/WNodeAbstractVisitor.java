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

/** A parametric abstract implementation of a visitor over WNode that return a value.
 ** This visitor implements the visitor interface with methods that each 
 ** delegate to a case representing their superclass.  At the top of this
 ** delegation tree is the method defaultCase(), which (unless overridden)
 ** throws an exception.
 **/
@SuppressWarnings("unused")
public abstract class WNodeAbstractVisitor<RetType>  extends WNodeVisitorLambda<RetType> {
    /**
     * This method is run for all cases that are not handled elsewhere.
     * By default, an exception is thrown; subclasses may override this behavior.
     * @throws IllegalArgumentException
    **/
    public RetType defaultCase(WNode that) {
        throw new IllegalArgumentException("Visitor " + getClass().getName() + " does not support visiting values of type " + that.getClass().getName());
    }

    /* Methods to visit an item. */
    public RetType forWNode(WNode that) {
        return defaultCase(that);
    }

    public RetType forWIDLNode(WIDLNode that) {
        return forWNode(that);
    }

    public RetType forWIDL(WIDL that) {
        return forWIDLNode(that);
    }

    public RetType forWDefinition(WDefinition that) {
        return forWIDL(that);
    }

    public RetType forWModule(WModule that) {
        return forWDefinition(that);
    }

    public RetType forWInterface(WInterface that) {
        return forWDefinition(that);
    }

    public RetType forWCallback(WCallback that) {
        return forWDefinition(that);
    }

    public RetType forWDictionary(WDictionary that) {
        return forWDefinition(that);
    }

    public RetType forWException(WException that) {
        return forWDefinition(that);
    }

    public RetType forWEnum(WEnum that) {
        return forWDefinition(that);
    }

    public RetType forWTypedef(WTypedef that) {
        return forWDefinition(that);
    }

    public RetType forWImplementsStatement(WImplementsStatement that) {
        return forWDefinition(that);
    }

    public RetType forWMember(WMember that) {
        return forWIDL(that);
    }

    public RetType forWConst(WConst that) {
        return forWMember(that);
    }

    public RetType forWAttribute(WAttribute that) {
        return forWMember(that);
    }

    public RetType forWOperation(WOperation that) {
        return forWMember(that);
    }

    public RetType forWDictionaryMember(WDictionaryMember that) {
        return forWMember(that);
    }

    public RetType forWExceptionField(WExceptionField that) {
        return forWMember(that);
    }

    public RetType forWLiteral(WLiteral that) {
        return forWIDL(that);
    }

    public RetType forWBoolean(WBoolean that) {
        return forWLiteral(that);
    }

    public RetType forWFloat(WFloat that) {
        return forWLiteral(that);
    }

    public RetType forWInteger(WInteger that) {
        return forWLiteral(that);
    }

    public RetType forWString(WString that) {
        return forWLiteral(that);
    }

    public RetType forWNull(WNull that) {
        return forWLiteral(that);
    }

    public RetType forWType(WType that) {
        return forWIDL(that);
    }

    public RetType forWAnyType(WAnyType that) {
        return forWType(that);
    }

    public RetType forWNamedType(WNamedType that) {
        return forWType(that);
    }

    public RetType forWArrayType(WArrayType that) {
        return forWType(that);
    }

    public RetType forWSequenceType(WSequenceType that) {
        return forWType(that);
    }

    public RetType forWUnionType(WUnionType that) {
        return forWType(that);
    }

    public RetType forWArgument(WArgument that) {
        return forWIDL(that);
    }

    public RetType forWId(WId that) {
        return forWIDL(that);
    }

    public RetType forWQId(WQId that) {
        return forWIDL(that);
    }

    public RetType forWInterfaceMember(WInterfaceMember that) {
        return forWIDLNode(that);
    }

    public RetType forWExceptionMember(WExceptionMember that) {
        return forWIDLNode(that);
    }

    public RetType forWIDLNodeInfo(WIDLNodeInfo that) {
        return forWNode(that);
    }

    public RetType forWTypeSuffix(WTypeSuffix that) {
        return forWIDLNodeInfo(that);
    }

    public RetType forWTSArray(WTSArray that) {
        return forWTypeSuffix(that);
    }

    public RetType forWTSQuestion(WTSQuestion that) {
        return forWTypeSuffix(that);
    }

    public RetType forWEAttribute(WEAttribute that) {
        return forWIDLNodeInfo(that);
    }

    public RetType forWEAConstructor(WEAConstructor that) {
        return forWEAttribute(that);
    }

    public RetType forWEAArray(WEAArray that) {
        return forWEAttribute(that);
    }

    public RetType forWEANoInterfaceObject(WEANoInterfaceObject that) {
        return forWEAttribute(that);
    }

    public RetType forWEACallbackFunctionOnly(WEACallbackFunctionOnly that) {
        return forWEAttribute(that);
    }

    public RetType forWEAString(WEAString that) {
        return forWEAttribute(that);
    }

    public RetType forWEAQuestion(WEAQuestion that) {
        return forWEAttribute(that);
    }

    public RetType forWEAEllipsis(WEAEllipsis that) {
        return forWEAttribute(that);
    }

    public RetType forWEAOptional(WEAOptional that) {
        return forWEAttribute(that);
    }

    public RetType forWEAAttribute(WEAAttribute that) {
        return forWEAttribute(that);
    }

    public RetType forWEACallback(WEACallback that) {
        return forWEAttribute(that);
    }

    public RetType forWEAConst(WEAConst that) {
        return forWEAttribute(that);
    }

    public RetType forWEACreator(WEACreator that) {
        return forWEAttribute(that);
    }

    public RetType forWEADeleter(WEADeleter that) {
        return forWEAttribute(that);
    }

    public RetType forWEADictionary(WEADictionary that) {
        return forWEAttribute(that);
    }

    public RetType forWEAEnum(WEAEnum that) {
        return forWEAttribute(that);
    }

    public RetType forWEAException(WEAException that) {
        return forWEAttribute(that);
    }

    public RetType forWEAGetter(WEAGetter that) {
        return forWEAttribute(that);
    }

    public RetType forWEAImplements(WEAImplements that) {
        return forWEAttribute(that);
    }

    public RetType forWEAInherit(WEAInherit that) {
        return forWEAttribute(that);
    }

    public RetType forWEAInterface(WEAInterface that) {
        return forWEAttribute(that);
    }

    public RetType forWEAReadonly(WEAReadonly that) {
        return forWEAttribute(that);
    }

    public RetType forWEALegacycaller(WEALegacycaller that) {
        return forWEAttribute(that);
    }

    public RetType forWEAPartial(WEAPartial that) {
        return forWEAttribute(that);
    }

    public RetType forWEASetter(WEASetter that) {
        return forWEAttribute(that);
    }

    public RetType forWEAStatic(WEAStatic that) {
        return forWEAttribute(that);
    }

    public RetType forWEAStringifier(WEAStringifier that) {
        return forWEAttribute(that);
    }

    public RetType forWEATypedef(WEATypedef that) {
        return forWEAttribute(that);
    }

    public RetType forWEAUnrestricted(WEAUnrestricted that) {
        return forWEAttribute(that);
    }

    public RetType forWQualifier(WQualifier that) {
        return forWIDLNodeInfo(that);
    }

    public RetType forWQStatic(WQStatic that) {
        return forWQualifier(that);
    }

    public RetType forWQGetter(WQGetter that) {
        return forWQualifier(that);
    }

    public RetType forWQSetter(WQSetter that) {
        return forWQualifier(that);
    }

    public RetType forWQCreator(WQCreator that) {
        return forWQualifier(that);
    }

    public RetType forWQDeleter(WQDeleter that) {
        return forWQualifier(that);
    }

    public RetType forWQLegacycaller(WQLegacycaller that) {
        return forWQualifier(that);
    }


}
