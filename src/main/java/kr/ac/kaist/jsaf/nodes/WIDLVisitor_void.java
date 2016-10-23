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

/** An interface for visitors over WIDL that do not return a value. */
@SuppressWarnings("unused")
public interface WIDLVisitor_void {

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
}
