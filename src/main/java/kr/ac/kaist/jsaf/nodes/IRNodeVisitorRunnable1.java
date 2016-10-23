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

/** An abstract void visitor over IRNode that provides a Runnable1 run method;
  * all visit methods are left unimplemented. */
@SuppressWarnings("unused")
public abstract class IRNodeVisitorRunnable1 implements edu.rice.cs.plt.lambda.Runnable1<IRNode>, IRNodeVisitor_void {

    public void run(IRNode that) {
        that.accept(this);
    }


    /** Process an instance of IRRoot. */
    public abstract void forIRRoot(IRRoot that);

    /** Process an instance of IRExprStmt. */
    public abstract void forIRExprStmt(IRExprStmt that);

    /** Process an instance of IRDelete. */
    public abstract void forIRDelete(IRDelete that);

    /** Process an instance of IRDeleteProp. */
    public abstract void forIRDeleteProp(IRDeleteProp that);

    /** Process an instance of IRObject. */
    public abstract void forIRObject(IRObject that);

    /** Process an instance of IRArray. */
    public abstract void forIRArray(IRArray that);

    /** Process an instance of IRArrayNumber. */
    public abstract void forIRArrayNumber(IRArrayNumber that);

    /** Process an instance of IRArgs. */
    public abstract void forIRArgs(IRArgs that);

    /** Process an instance of IRCall. */
    public abstract void forIRCall(IRCall that);

    /** Process an instance of IRInternalCall. */
    public abstract void forIRInternalCall(IRInternalCall that);

    /** Process an instance of IRNew. */
    public abstract void forIRNew(IRNew that);

    /** Process an instance of IRFunExpr. */
    public abstract void forIRFunExpr(IRFunExpr that);

    /** Process an instance of IREval. */
    public abstract void forIREval(IREval that);

    /** Process an instance of IRStmtUnit. */
    public abstract void forIRStmtUnit(IRStmtUnit that);

    /** Process an instance of IRStore. */
    public abstract void forIRStore(IRStore that);

    /** Process an instance of IRFunDecl. */
    public abstract void forIRFunDecl(IRFunDecl that);

    /** Process an instance of IRBreak. */
    public abstract void forIRBreak(IRBreak that);

    /** Process an instance of IRReturn. */
    public abstract void forIRReturn(IRReturn that);

    /** Process an instance of IRWith. */
    public abstract void forIRWith(IRWith that);

    /** Process an instance of IRLabelStmt. */
    public abstract void forIRLabelStmt(IRLabelStmt that);

    /** Process an instance of IRVarStmt. */
    public abstract void forIRVarStmt(IRVarStmt that);

    /** Process an instance of IRThrow. */
    public abstract void forIRThrow(IRThrow that);

    /** Process an instance of IRSeq. */
    public abstract void forIRSeq(IRSeq that);

    /** Process an instance of IRIf. */
    public abstract void forIRIf(IRIf that);

    /** Process an instance of IRWhile. */
    public abstract void forIRWhile(IRWhile that);

    /** Process an instance of IRTry. */
    public abstract void forIRTry(IRTry that);

    /** Process an instance of IRNoOp. */
    public abstract void forIRNoOp(IRNoOp that);

    /** Process an instance of IRField. */
    public abstract void forIRField(IRField that);

    /** Process an instance of IRGetProp. */
    public abstract void forIRGetProp(IRGetProp that);

    /** Process an instance of IRSetProp. */
    public abstract void forIRSetProp(IRSetProp that);

    /** Process an instance of IRBin. */
    public abstract void forIRBin(IRBin that);

    /** Process an instance of IRUn. */
    public abstract void forIRUn(IRUn that);

    /** Process an instance of IRLoad. */
    public abstract void forIRLoad(IRLoad that);

    /** Process an instance of IRUserId. */
    public abstract void forIRUserId(IRUserId that);

    /** Process an instance of IRTmpId. */
    public abstract void forIRTmpId(IRTmpId that);

    /** Process an instance of IRThis. */
    public abstract void forIRThis(IRThis that);

    /** Process an instance of IRNumber. */
    public abstract void forIRNumber(IRNumber that);

    /** Process an instance of IRString. */
    public abstract void forIRString(IRString that);

    /** Process an instance of IRBool. */
    public abstract void forIRBool(IRBool that);

    /** Process an instance of IRUndef. */
    public abstract void forIRUndef(IRUndef that);

    /** Process an instance of IRNull. */
    public abstract void forIRNull(IRNull that);

    /** Process an instance of IROp. */
    public abstract void forIROp(IROp that);

    /** Process an instance of IRFunctional. */
    public abstract void forIRFunctional(IRFunctional that);

    /** Process an instance of IRSpanInfo. */
    public abstract void forIRSpanInfo(IRSpanInfo that);
}
