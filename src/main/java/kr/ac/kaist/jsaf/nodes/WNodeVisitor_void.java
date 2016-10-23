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

/** An interface for visitors over WNode that do not return a value. */
@SuppressWarnings("unused")
public interface WNodeVisitor_void extends WIDLVisitor_void {

    /** Process an instance of WModule. */
    public void forWModule(WModule that);

    /** Process an instance of WInterface. */
    public void forWInterface(WInterface that);

    /** Process an instance of WCallback. */
    public void forWCallback(WCallback that);

    /** Process an instance of WDictionary. */
    public void forWDictionary(WDictionary that);

    /** Process an instance of WException. */
    public void forWException(WException that);

    /** Process an instance of WEnum. */
    public void forWEnum(WEnum that);

    /** Process an instance of WTypedef. */
    public void forWTypedef(WTypedef that);

    /** Process an instance of WImplementsStatement. */
    public void forWImplementsStatement(WImplementsStatement that);

    /** Process an instance of WConst. */
    public void forWConst(WConst that);

    /** Process an instance of WAttribute. */
    public void forWAttribute(WAttribute that);

    /** Process an instance of WOperation. */
    public void forWOperation(WOperation that);

    /** Process an instance of WDictionaryMember. */
    public void forWDictionaryMember(WDictionaryMember that);

    /** Process an instance of WExceptionField. */
    public void forWExceptionField(WExceptionField that);

    /** Process an instance of WBoolean. */
    public void forWBoolean(WBoolean that);

    /** Process an instance of WFloat. */
    public void forWFloat(WFloat that);

    /** Process an instance of WInteger. */
    public void forWInteger(WInteger that);

    /** Process an instance of WString. */
    public void forWString(WString that);

    /** Process an instance of WNull. */
    public void forWNull(WNull that);

    /** Process an instance of WAnyType. */
    public void forWAnyType(WAnyType that);

    /** Process an instance of WNamedType. */
    public void forWNamedType(WNamedType that);

    /** Process an instance of WArrayType. */
    public void forWArrayType(WArrayType that);

    /** Process an instance of WSequenceType. */
    public void forWSequenceType(WSequenceType that);

    /** Process an instance of WUnionType. */
    public void forWUnionType(WUnionType that);

    /** Process an instance of WArgument. */
    public void forWArgument(WArgument that);

    /** Process an instance of WId. */
    public void forWId(WId that);

    /** Process an instance of WQId. */
    public void forWQId(WQId that);

    /** Process an instance of WTSArray. */
    public void forWTSArray(WTSArray that);

    /** Process an instance of WTSQuestion. */
    public void forWTSQuestion(WTSQuestion that);

    /** Process an instance of WEAConstructor. */
    public void forWEAConstructor(WEAConstructor that);

    /** Process an instance of WEAArray. */
    public void forWEAArray(WEAArray that);

    /** Process an instance of WEANoInterfaceObject. */
    public void forWEANoInterfaceObject(WEANoInterfaceObject that);

    /** Process an instance of WEACallbackFunctionOnly. */
    public void forWEACallbackFunctionOnly(WEACallbackFunctionOnly that);

    /** Process an instance of WEAString. */
    public void forWEAString(WEAString that);

    /** Process an instance of WEAQuestion. */
    public void forWEAQuestion(WEAQuestion that);

    /** Process an instance of WEAEllipsis. */
    public void forWEAEllipsis(WEAEllipsis that);

    /** Process an instance of WEAOptional. */
    public void forWEAOptional(WEAOptional that);

    /** Process an instance of WEAAttribute. */
    public void forWEAAttribute(WEAAttribute that);

    /** Process an instance of WEACallback. */
    public void forWEACallback(WEACallback that);

    /** Process an instance of WEAConst. */
    public void forWEAConst(WEAConst that);

    /** Process an instance of WEACreator. */
    public void forWEACreator(WEACreator that);

    /** Process an instance of WEADeleter. */
    public void forWEADeleter(WEADeleter that);

    /** Process an instance of WEADictionary. */
    public void forWEADictionary(WEADictionary that);

    /** Process an instance of WEAEnum. */
    public void forWEAEnum(WEAEnum that);

    /** Process an instance of WEAException. */
    public void forWEAException(WEAException that);

    /** Process an instance of WEAGetter. */
    public void forWEAGetter(WEAGetter that);

    /** Process an instance of WEAImplements. */
    public void forWEAImplements(WEAImplements that);

    /** Process an instance of WEAInherit. */
    public void forWEAInherit(WEAInherit that);

    /** Process an instance of WEAInterface. */
    public void forWEAInterface(WEAInterface that);

    /** Process an instance of WEAReadonly. */
    public void forWEAReadonly(WEAReadonly that);

    /** Process an instance of WEALegacycaller. */
    public void forWEALegacycaller(WEALegacycaller that);

    /** Process an instance of WEAPartial. */
    public void forWEAPartial(WEAPartial that);

    /** Process an instance of WEASetter. */
    public void forWEASetter(WEASetter that);

    /** Process an instance of WEAStatic. */
    public void forWEAStatic(WEAStatic that);

    /** Process an instance of WEAStringifier. */
    public void forWEAStringifier(WEAStringifier that);

    /** Process an instance of WEATypedef. */
    public void forWEATypedef(WEATypedef that);

    /** Process an instance of WEAUnrestricted. */
    public void forWEAUnrestricted(WEAUnrestricted that);

    /** Process an instance of WQStatic. */
    public void forWQStatic(WQStatic that);

    /** Process an instance of WQGetter. */
    public void forWQGetter(WQGetter that);

    /** Process an instance of WQSetter. */
    public void forWQSetter(WQSetter that);

    /** Process an instance of WQCreator. */
    public void forWQCreator(WQCreator that);

    /** Process an instance of WQDeleter. */
    public void forWQDeleter(WQDeleter that);

    /** Process an instance of WQLegacycaller. */
    public void forWQLegacycaller(WQLegacycaller that);
}
