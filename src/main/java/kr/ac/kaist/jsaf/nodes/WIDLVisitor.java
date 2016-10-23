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

/** A parametric interface for visitors over WIDL that return a value. */
@SuppressWarnings("unused")
public interface WIDLVisitor<RetType> {

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
}
