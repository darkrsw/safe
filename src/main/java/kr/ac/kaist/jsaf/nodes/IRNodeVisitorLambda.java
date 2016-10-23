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

/** An abstract visitor over IRNode that provides a lambda value method;
  * all visit methods are left unimplemented. */
@SuppressWarnings("unused")
public abstract class IRNodeVisitorLambda<RetType> implements edu.rice.cs.plt.lambda.Lambda<IRNode, RetType>, IRNodeVisitor<RetType> {

    public RetType value(IRNode that) {
        return that.accept(this);
    }


    /** Process an instance of IRRoot. */
    public abstract RetType forIRRoot(IRRoot that);

    /** Process an instance of IRExprStmt. */
    public abstract RetType forIRExprStmt(IRExprStmt that);

    /** Process an instance of IRDelete. */
    public abstract RetType forIRDelete(IRDelete that);

    /** Process an instance of IRDeleteProp. */
    public abstract RetType forIRDeleteProp(IRDeleteProp that);

    /** Process an instance of IRObject. */
    public abstract RetType forIRObject(IRObject that);

    /** Process an instance of IRArray. */
    public abstract RetType forIRArray(IRArray that);

    /** Process an instance of IRArrayNumber. */
    public abstract RetType forIRArrayNumber(IRArrayNumber that);

    /** Process an instance of IRArgs. */
    public abstract RetType forIRArgs(IRArgs that);

    /** Process an instance of IRCall. */
    public abstract RetType forIRCall(IRCall that);

    /** Process an instance of IRInternalCall. */
    public abstract RetType forIRInternalCall(IRInternalCall that);

    /** Process an instance of IRNew. */
    public abstract RetType forIRNew(IRNew that);

    /** Process an instance of IRFunExpr. */
    public abstract RetType forIRFunExpr(IRFunExpr that);

    /** Process an instance of IREval. */
    public abstract RetType forIREval(IREval that);

    /** Process an instance of IRStmtUnit. */
    public abstract RetType forIRStmtUnit(IRStmtUnit that);

    /** Process an instance of IRStore. */
    public abstract RetType forIRStore(IRStore that);

    /** Process an instance of IRFunDecl. */
    public abstract RetType forIRFunDecl(IRFunDecl that);

    /** Process an instance of IRBreak. */
    public abstract RetType forIRBreak(IRBreak that);

    /** Process an instance of IRReturn. */
    public abstract RetType forIRReturn(IRReturn that);

    /** Process an instance of IRWith. */
    public abstract RetType forIRWith(IRWith that);

    /** Process an instance of IRLabelStmt. */
    public abstract RetType forIRLabelStmt(IRLabelStmt that);

    /** Process an instance of IRVarStmt. */
    public abstract RetType forIRVarStmt(IRVarStmt that);

    /** Process an instance of IRThrow. */
    public abstract RetType forIRThrow(IRThrow that);

    /** Process an instance of IRSeq. */
    public abstract RetType forIRSeq(IRSeq that);

    /** Process an instance of IRIf. */
    public abstract RetType forIRIf(IRIf that);

    /** Process an instance of IRWhile. */
    public abstract RetType forIRWhile(IRWhile that);

    /** Process an instance of IRTry. */
    public abstract RetType forIRTry(IRTry that);

    /** Process an instance of IRNoOp. */
    public abstract RetType forIRNoOp(IRNoOp that);

    /** Process an instance of IRField. */
    public abstract RetType forIRField(IRField that);

    /** Process an instance of IRGetProp. */
    public abstract RetType forIRGetProp(IRGetProp that);

    /** Process an instance of IRSetProp. */
    public abstract RetType forIRSetProp(IRSetProp that);

    /** Process an instance of IRBin. */
    public abstract RetType forIRBin(IRBin that);

    /** Process an instance of IRUn. */
    public abstract RetType forIRUn(IRUn that);

    /** Process an instance of IRLoad. */
    public abstract RetType forIRLoad(IRLoad that);

    /** Process an instance of IRUserId. */
    public abstract RetType forIRUserId(IRUserId that);

    /** Process an instance of IRTmpId. */
    public abstract RetType forIRTmpId(IRTmpId that);

    /** Process an instance of IRThis. */
    public abstract RetType forIRThis(IRThis that);

    /** Process an instance of IRNumber. */
    public abstract RetType forIRNumber(IRNumber that);

    /** Process an instance of IRString. */
    public abstract RetType forIRString(IRString that);

    /** Process an instance of IRBool. */
    public abstract RetType forIRBool(IRBool that);

    /** Process an instance of IRUndef. */
    public abstract RetType forIRUndef(IRUndef that);

    /** Process an instance of IRNull. */
    public abstract RetType forIRNull(IRNull that);

    /** Process an instance of IROp. */
    public abstract RetType forIROp(IROp that);

    /** Process an instance of IRFunctional. */
    public abstract RetType forIRFunctional(IRFunctional that);

    /** Process an instance of IRSpanInfo. */
    public abstract RetType forIRSpanInfo(IRSpanInfo that);
}
