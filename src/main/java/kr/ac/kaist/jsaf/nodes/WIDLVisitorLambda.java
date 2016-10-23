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

/** An abstract visitor over WIDL that provides a lambda value method;
  * all visit methods are left unimplemented. */
@SuppressWarnings("unused")
public abstract class WIDLVisitorLambda<RetType> implements edu.rice.cs.plt.lambda.Lambda<WIDL, RetType>, WIDLVisitor<RetType> {

    public RetType value(WIDL that) {
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
}
