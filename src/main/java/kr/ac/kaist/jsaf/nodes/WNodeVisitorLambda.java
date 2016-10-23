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

/** An abstract visitor over WNode that provides a lambda value method;
  * all visit methods are left unimplemented. */
@SuppressWarnings("unused")
public abstract class WNodeVisitorLambda<RetType> implements edu.rice.cs.plt.lambda.Lambda<WNode, RetType>, WNodeVisitor<RetType> {

    public RetType value(WNode that) {
        return that.accept(this);
    }


    /** Process an instance of WModule. */
    public abstract RetType forWModule(WModule that);

    /** Process an instance of WInterface. */
    public abstract RetType forWInterface(WInterface that);

    /** Process an instance of WCallback. */
    public abstract RetType forWCallback(WCallback that);

    /** Process an instance of WDictionary. */
    public abstract RetType forWDictionary(WDictionary that);

    /** Process an instance of WException. */
    public abstract RetType forWException(WException that);

    /** Process an instance of WEnum. */
    public abstract RetType forWEnum(WEnum that);

    /** Process an instance of WTypedef. */
    public abstract RetType forWTypedef(WTypedef that);

    /** Process an instance of WImplementsStatement. */
    public abstract RetType forWImplementsStatement(WImplementsStatement that);

    /** Process an instance of WConst. */
    public abstract RetType forWConst(WConst that);

    /** Process an instance of WAttribute. */
    public abstract RetType forWAttribute(WAttribute that);

    /** Process an instance of WOperation. */
    public abstract RetType forWOperation(WOperation that);

    /** Process an instance of WDictionaryMember. */
    public abstract RetType forWDictionaryMember(WDictionaryMember that);

    /** Process an instance of WExceptionField. */
    public abstract RetType forWExceptionField(WExceptionField that);

    /** Process an instance of WBoolean. */
    public abstract RetType forWBoolean(WBoolean that);

    /** Process an instance of WFloat. */
    public abstract RetType forWFloat(WFloat that);

    /** Process an instance of WInteger. */
    public abstract RetType forWInteger(WInteger that);

    /** Process an instance of WString. */
    public abstract RetType forWString(WString that);

    /** Process an instance of WNull. */
    public abstract RetType forWNull(WNull that);

    /** Process an instance of WAnyType. */
    public abstract RetType forWAnyType(WAnyType that);

    /** Process an instance of WNamedType. */
    public abstract RetType forWNamedType(WNamedType that);

    /** Process an instance of WArrayType. */
    public abstract RetType forWArrayType(WArrayType that);

    /** Process an instance of WSequenceType. */
    public abstract RetType forWSequenceType(WSequenceType that);

    /** Process an instance of WUnionType. */
    public abstract RetType forWUnionType(WUnionType that);

    /** Process an instance of WArgument. */
    public abstract RetType forWArgument(WArgument that);

    /** Process an instance of WId. */
    public abstract RetType forWId(WId that);

    /** Process an instance of WQId. */
    public abstract RetType forWQId(WQId that);

    /** Process an instance of WTSArray. */
    public abstract RetType forWTSArray(WTSArray that);

    /** Process an instance of WTSQuestion. */
    public abstract RetType forWTSQuestion(WTSQuestion that);

    /** Process an instance of WEAConstructor. */
    public abstract RetType forWEAConstructor(WEAConstructor that);

    /** Process an instance of WEAArray. */
    public abstract RetType forWEAArray(WEAArray that);

    /** Process an instance of WEANoInterfaceObject. */
    public abstract RetType forWEANoInterfaceObject(WEANoInterfaceObject that);

    /** Process an instance of WEACallbackFunctionOnly. */
    public abstract RetType forWEACallbackFunctionOnly(WEACallbackFunctionOnly that);

    /** Process an instance of WEAString. */
    public abstract RetType forWEAString(WEAString that);

    /** Process an instance of WEAQuestion. */
    public abstract RetType forWEAQuestion(WEAQuestion that);

    /** Process an instance of WEAEllipsis. */
    public abstract RetType forWEAEllipsis(WEAEllipsis that);

    /** Process an instance of WEAOptional. */
    public abstract RetType forWEAOptional(WEAOptional that);

    /** Process an instance of WEAAttribute. */
    public abstract RetType forWEAAttribute(WEAAttribute that);

    /** Process an instance of WEACallback. */
    public abstract RetType forWEACallback(WEACallback that);

    /** Process an instance of WEAConst. */
    public abstract RetType forWEAConst(WEAConst that);

    /** Process an instance of WEACreator. */
    public abstract RetType forWEACreator(WEACreator that);

    /** Process an instance of WEADeleter. */
    public abstract RetType forWEADeleter(WEADeleter that);

    /** Process an instance of WEADictionary. */
    public abstract RetType forWEADictionary(WEADictionary that);

    /** Process an instance of WEAEnum. */
    public abstract RetType forWEAEnum(WEAEnum that);

    /** Process an instance of WEAException. */
    public abstract RetType forWEAException(WEAException that);

    /** Process an instance of WEAGetter. */
    public abstract RetType forWEAGetter(WEAGetter that);

    /** Process an instance of WEAImplements. */
    public abstract RetType forWEAImplements(WEAImplements that);

    /** Process an instance of WEAInherit. */
    public abstract RetType forWEAInherit(WEAInherit that);

    /** Process an instance of WEAInterface. */
    public abstract RetType forWEAInterface(WEAInterface that);

    /** Process an instance of WEAReadonly. */
    public abstract RetType forWEAReadonly(WEAReadonly that);

    /** Process an instance of WEALegacycaller. */
    public abstract RetType forWEALegacycaller(WEALegacycaller that);

    /** Process an instance of WEAPartial. */
    public abstract RetType forWEAPartial(WEAPartial that);

    /** Process an instance of WEASetter. */
    public abstract RetType forWEASetter(WEASetter that);

    /** Process an instance of WEAStatic. */
    public abstract RetType forWEAStatic(WEAStatic that);

    /** Process an instance of WEAStringifier. */
    public abstract RetType forWEAStringifier(WEAStringifier that);

    /** Process an instance of WEATypedef. */
    public abstract RetType forWEATypedef(WEATypedef that);

    /** Process an instance of WEAUnrestricted. */
    public abstract RetType forWEAUnrestricted(WEAUnrestricted that);

    /** Process an instance of WQStatic. */
    public abstract RetType forWQStatic(WQStatic that);

    /** Process an instance of WQGetter. */
    public abstract RetType forWQGetter(WQGetter that);

    /** Process an instance of WQSetter. */
    public abstract RetType forWQSetter(WQSetter that);

    /** Process an instance of WQCreator. */
    public abstract RetType forWQCreator(WQCreator that);

    /** Process an instance of WQDeleter. */
    public abstract RetType forWQDeleter(WQDeleter that);

    /** Process an instance of WQLegacycaller. */
    public abstract RetType forWQLegacycaller(WQLegacycaller that);
}
