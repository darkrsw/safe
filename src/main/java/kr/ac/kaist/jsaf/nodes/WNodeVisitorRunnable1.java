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

/** An abstract void visitor over WNode that provides a Runnable1 run method;
  * all visit methods are left unimplemented. */
@SuppressWarnings("unused")
public abstract class WNodeVisitorRunnable1 implements edu.rice.cs.plt.lambda.Runnable1<WNode>, WNodeVisitor_void {

    public void run(WNode that) {
        that.accept(this);
    }


    /** Process an instance of WModule. */
    public abstract void forWModule(WModule that);

    /** Process an instance of WInterface. */
    public abstract void forWInterface(WInterface that);

    /** Process an instance of WCallback. */
    public abstract void forWCallback(WCallback that);

    /** Process an instance of WDictionary. */
    public abstract void forWDictionary(WDictionary that);

    /** Process an instance of WException. */
    public abstract void forWException(WException that);

    /** Process an instance of WEnum. */
    public abstract void forWEnum(WEnum that);

    /** Process an instance of WTypedef. */
    public abstract void forWTypedef(WTypedef that);

    /** Process an instance of WImplementsStatement. */
    public abstract void forWImplementsStatement(WImplementsStatement that);

    /** Process an instance of WConst. */
    public abstract void forWConst(WConst that);

    /** Process an instance of WAttribute. */
    public abstract void forWAttribute(WAttribute that);

    /** Process an instance of WOperation. */
    public abstract void forWOperation(WOperation that);

    /** Process an instance of WDictionaryMember. */
    public abstract void forWDictionaryMember(WDictionaryMember that);

    /** Process an instance of WExceptionField. */
    public abstract void forWExceptionField(WExceptionField that);

    /** Process an instance of WBoolean. */
    public abstract void forWBoolean(WBoolean that);

    /** Process an instance of WFloat. */
    public abstract void forWFloat(WFloat that);

    /** Process an instance of WInteger. */
    public abstract void forWInteger(WInteger that);

    /** Process an instance of WString. */
    public abstract void forWString(WString that);

    /** Process an instance of WNull. */
    public abstract void forWNull(WNull that);

    /** Process an instance of WAnyType. */
    public abstract void forWAnyType(WAnyType that);

    /** Process an instance of WNamedType. */
    public abstract void forWNamedType(WNamedType that);

    /** Process an instance of WArrayType. */
    public abstract void forWArrayType(WArrayType that);

    /** Process an instance of WSequenceType. */
    public abstract void forWSequenceType(WSequenceType that);

    /** Process an instance of WUnionType. */
    public abstract void forWUnionType(WUnionType that);

    /** Process an instance of WArgument. */
    public abstract void forWArgument(WArgument that);

    /** Process an instance of WId. */
    public abstract void forWId(WId that);

    /** Process an instance of WQId. */
    public abstract void forWQId(WQId that);

    /** Process an instance of WTSArray. */
    public abstract void forWTSArray(WTSArray that);

    /** Process an instance of WTSQuestion. */
    public abstract void forWTSQuestion(WTSQuestion that);

    /** Process an instance of WEAConstructor. */
    public abstract void forWEAConstructor(WEAConstructor that);

    /** Process an instance of WEAArray. */
    public abstract void forWEAArray(WEAArray that);

    /** Process an instance of WEANoInterfaceObject. */
    public abstract void forWEANoInterfaceObject(WEANoInterfaceObject that);

    /** Process an instance of WEACallbackFunctionOnly. */
    public abstract void forWEACallbackFunctionOnly(WEACallbackFunctionOnly that);

    /** Process an instance of WEAString. */
    public abstract void forWEAString(WEAString that);

    /** Process an instance of WEAQuestion. */
    public abstract void forWEAQuestion(WEAQuestion that);

    /** Process an instance of WEAEllipsis. */
    public abstract void forWEAEllipsis(WEAEllipsis that);

    /** Process an instance of WEAOptional. */
    public abstract void forWEAOptional(WEAOptional that);

    /** Process an instance of WEAAttribute. */
    public abstract void forWEAAttribute(WEAAttribute that);

    /** Process an instance of WEACallback. */
    public abstract void forWEACallback(WEACallback that);

    /** Process an instance of WEAConst. */
    public abstract void forWEAConst(WEAConst that);

    /** Process an instance of WEACreator. */
    public abstract void forWEACreator(WEACreator that);

    /** Process an instance of WEADeleter. */
    public abstract void forWEADeleter(WEADeleter that);

    /** Process an instance of WEADictionary. */
    public abstract void forWEADictionary(WEADictionary that);

    /** Process an instance of WEAEnum. */
    public abstract void forWEAEnum(WEAEnum that);

    /** Process an instance of WEAException. */
    public abstract void forWEAException(WEAException that);

    /** Process an instance of WEAGetter. */
    public abstract void forWEAGetter(WEAGetter that);

    /** Process an instance of WEAImplements. */
    public abstract void forWEAImplements(WEAImplements that);

    /** Process an instance of WEAInherit. */
    public abstract void forWEAInherit(WEAInherit that);

    /** Process an instance of WEAInterface. */
    public abstract void forWEAInterface(WEAInterface that);

    /** Process an instance of WEAReadonly. */
    public abstract void forWEAReadonly(WEAReadonly that);

    /** Process an instance of WEALegacycaller. */
    public abstract void forWEALegacycaller(WEALegacycaller that);

    /** Process an instance of WEAPartial. */
    public abstract void forWEAPartial(WEAPartial that);

    /** Process an instance of WEASetter. */
    public abstract void forWEASetter(WEASetter that);

    /** Process an instance of WEAStatic. */
    public abstract void forWEAStatic(WEAStatic that);

    /** Process an instance of WEAStringifier. */
    public abstract void forWEAStringifier(WEAStringifier that);

    /** Process an instance of WEATypedef. */
    public abstract void forWEATypedef(WEATypedef that);

    /** Process an instance of WEAUnrestricted. */
    public abstract void forWEAUnrestricted(WEAUnrestricted that);

    /** Process an instance of WQStatic. */
    public abstract void forWQStatic(WQStatic that);

    /** Process an instance of WQGetter. */
    public abstract void forWQGetter(WQGetter that);

    /** Process an instance of WQSetter. */
    public abstract void forWQSetter(WQSetter that);

    /** Process an instance of WQCreator. */
    public abstract void forWQCreator(WQCreator that);

    /** Process an instance of WQDeleter. */
    public abstract void forWQDeleter(WQDeleter that);

    /** Process an instance of WQLegacycaller. */
    public abstract void forWQLegacycaller(WQLegacycaller that);
}
