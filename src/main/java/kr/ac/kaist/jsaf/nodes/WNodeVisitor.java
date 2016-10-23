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

/** A parametric interface for visitors over WNode that return a value. */
@SuppressWarnings("unused")
public interface WNodeVisitor<RetType> extends WIDLVisitor<RetType> {

    /** Process an instance of WModule. */
    public RetType forWModule(WModule that);

    /** Process an instance of WInterface. */
    public RetType forWInterface(WInterface that);

    /** Process an instance of WCallback. */
    public RetType forWCallback(WCallback that);

    /** Process an instance of WDictionary. */
    public RetType forWDictionary(WDictionary that);

    /** Process an instance of WException. */
    public RetType forWException(WException that);

    /** Process an instance of WEnum. */
    public RetType forWEnum(WEnum that);

    /** Process an instance of WTypedef. */
    public RetType forWTypedef(WTypedef that);

    /** Process an instance of WImplementsStatement. */
    public RetType forWImplementsStatement(WImplementsStatement that);

    /** Process an instance of WConst. */
    public RetType forWConst(WConst that);

    /** Process an instance of WAttribute. */
    public RetType forWAttribute(WAttribute that);

    /** Process an instance of WOperation. */
    public RetType forWOperation(WOperation that);

    /** Process an instance of WDictionaryMember. */
    public RetType forWDictionaryMember(WDictionaryMember that);

    /** Process an instance of WExceptionField. */
    public RetType forWExceptionField(WExceptionField that);

    /** Process an instance of WBoolean. */
    public RetType forWBoolean(WBoolean that);

    /** Process an instance of WFloat. */
    public RetType forWFloat(WFloat that);

    /** Process an instance of WInteger. */
    public RetType forWInteger(WInteger that);

    /** Process an instance of WString. */
    public RetType forWString(WString that);

    /** Process an instance of WNull. */
    public RetType forWNull(WNull that);

    /** Process an instance of WAnyType. */
    public RetType forWAnyType(WAnyType that);

    /** Process an instance of WNamedType. */
    public RetType forWNamedType(WNamedType that);

    /** Process an instance of WArrayType. */
    public RetType forWArrayType(WArrayType that);

    /** Process an instance of WSequenceType. */
    public RetType forWSequenceType(WSequenceType that);

    /** Process an instance of WUnionType. */
    public RetType forWUnionType(WUnionType that);

    /** Process an instance of WArgument. */
    public RetType forWArgument(WArgument that);

    /** Process an instance of WId. */
    public RetType forWId(WId that);

    /** Process an instance of WQId. */
    public RetType forWQId(WQId that);

    /** Process an instance of WTSArray. */
    public RetType forWTSArray(WTSArray that);

    /** Process an instance of WTSQuestion. */
    public RetType forWTSQuestion(WTSQuestion that);

    /** Process an instance of WEAConstructor. */
    public RetType forWEAConstructor(WEAConstructor that);

    /** Process an instance of WEAArray. */
    public RetType forWEAArray(WEAArray that);

    /** Process an instance of WEANoInterfaceObject. */
    public RetType forWEANoInterfaceObject(WEANoInterfaceObject that);

    /** Process an instance of WEACallbackFunctionOnly. */
    public RetType forWEACallbackFunctionOnly(WEACallbackFunctionOnly that);

    /** Process an instance of WEAString. */
    public RetType forWEAString(WEAString that);

    /** Process an instance of WEAQuestion. */
    public RetType forWEAQuestion(WEAQuestion that);

    /** Process an instance of WEAEllipsis. */
    public RetType forWEAEllipsis(WEAEllipsis that);

    /** Process an instance of WEAOptional. */
    public RetType forWEAOptional(WEAOptional that);

    /** Process an instance of WEAAttribute. */
    public RetType forWEAAttribute(WEAAttribute that);

    /** Process an instance of WEACallback. */
    public RetType forWEACallback(WEACallback that);

    /** Process an instance of WEAConst. */
    public RetType forWEAConst(WEAConst that);

    /** Process an instance of WEACreator. */
    public RetType forWEACreator(WEACreator that);

    /** Process an instance of WEADeleter. */
    public RetType forWEADeleter(WEADeleter that);

    /** Process an instance of WEADictionary. */
    public RetType forWEADictionary(WEADictionary that);

    /** Process an instance of WEAEnum. */
    public RetType forWEAEnum(WEAEnum that);

    /** Process an instance of WEAException. */
    public RetType forWEAException(WEAException that);

    /** Process an instance of WEAGetter. */
    public RetType forWEAGetter(WEAGetter that);

    /** Process an instance of WEAImplements. */
    public RetType forWEAImplements(WEAImplements that);

    /** Process an instance of WEAInherit. */
    public RetType forWEAInherit(WEAInherit that);

    /** Process an instance of WEAInterface. */
    public RetType forWEAInterface(WEAInterface that);

    /** Process an instance of WEAReadonly. */
    public RetType forWEAReadonly(WEAReadonly that);

    /** Process an instance of WEALegacycaller. */
    public RetType forWEALegacycaller(WEALegacycaller that);

    /** Process an instance of WEAPartial. */
    public RetType forWEAPartial(WEAPartial that);

    /** Process an instance of WEASetter. */
    public RetType forWEASetter(WEASetter that);

    /** Process an instance of WEAStatic. */
    public RetType forWEAStatic(WEAStatic that);

    /** Process an instance of WEAStringifier. */
    public RetType forWEAStringifier(WEAStringifier that);

    /** Process an instance of WEATypedef. */
    public RetType forWEATypedef(WEATypedef that);

    /** Process an instance of WEAUnrestricted. */
    public RetType forWEAUnrestricted(WEAUnrestricted that);

    /** Process an instance of WQStatic. */
    public RetType forWQStatic(WQStatic that);

    /** Process an instance of WQGetter. */
    public RetType forWQGetter(WQGetter that);

    /** Process an instance of WQSetter. */
    public RetType forWQSetter(WQSetter that);

    /** Process an instance of WQCreator. */
    public RetType forWQCreator(WQCreator that);

    /** Process an instance of WQDeleter. */
    public RetType forWQDeleter(WQDeleter that);

    /** Process an instance of WQLegacycaller. */
    public RetType forWQLegacycaller(WQLegacycaller that);
}
