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

/** An abstract void visitor over WIDL that provides a Runnable1 run method;
  * all visit methods are left unimplemented. */
@SuppressWarnings("unused")
public abstract class WIDLVisitorRunnable1 implements edu.rice.cs.plt.lambda.Runnable1<WIDL>, WIDLVisitor_void {

    public void run(WIDL that) {
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
}
