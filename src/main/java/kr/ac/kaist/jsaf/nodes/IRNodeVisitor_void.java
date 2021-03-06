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

/** An interface for visitors over IRNode that do not return a value. */
@SuppressWarnings("unused")
public interface IRNodeVisitor_void extends IRAbstractNodeVisitor_void {

    /** Process an instance of IRRoot. */
    public void forIRRoot(IRRoot that);

    /** Process an instance of IRExprStmt. */
    public void forIRExprStmt(IRExprStmt that);

    /** Process an instance of IRDelete. */
    public void forIRDelete(IRDelete that);

    /** Process an instance of IRDeleteProp. */
    public void forIRDeleteProp(IRDeleteProp that);

    /** Process an instance of IRObject. */
    public void forIRObject(IRObject that);

    /** Process an instance of IRArray. */
    public void forIRArray(IRArray that);

    /** Process an instance of IRArrayNumber. */
    public void forIRArrayNumber(IRArrayNumber that);

    /** Process an instance of IRArgs. */
    public void forIRArgs(IRArgs that);

    /** Process an instance of IRCall. */
    public void forIRCall(IRCall that);

    /** Process an instance of IRInternalCall. */
    public void forIRInternalCall(IRInternalCall that);

    /** Process an instance of IRNew. */
    public void forIRNew(IRNew that);

    /** Process an instance of IRFunExpr. */
    public void forIRFunExpr(IRFunExpr that);

    /** Process an instance of IREval. */
    public void forIREval(IREval that);

    /** Process an instance of IRStmtUnit. */
    public void forIRStmtUnit(IRStmtUnit that);

    /** Process an instance of IRStore. */
    public void forIRStore(IRStore that);

    /** Process an instance of IRFunDecl. */
    public void forIRFunDecl(IRFunDecl that);

    /** Process an instance of IRBreak. */
    public void forIRBreak(IRBreak that);

    /** Process an instance of IRReturn. */
    public void forIRReturn(IRReturn that);

    /** Process an instance of IRWith. */
    public void forIRWith(IRWith that);

    /** Process an instance of IRLabelStmt. */
    public void forIRLabelStmt(IRLabelStmt that);

    /** Process an instance of IRVarStmt. */
    public void forIRVarStmt(IRVarStmt that);

    /** Process an instance of IRThrow. */
    public void forIRThrow(IRThrow that);

    /** Process an instance of IRSeq. */
    public void forIRSeq(IRSeq that);

    /** Process an instance of IRIf. */
    public void forIRIf(IRIf that);

    /** Process an instance of IRWhile. */
    public void forIRWhile(IRWhile that);

    /** Process an instance of IRTry. */
    public void forIRTry(IRTry that);

    /** Process an instance of IRNoOp. */
    public void forIRNoOp(IRNoOp that);

    /** Process an instance of IRField. */
    public void forIRField(IRField that);

    /** Process an instance of IRGetProp. */
    public void forIRGetProp(IRGetProp that);

    /** Process an instance of IRSetProp. */
    public void forIRSetProp(IRSetProp that);

    /** Process an instance of IRBin. */
    public void forIRBin(IRBin that);

    /** Process an instance of IRUn. */
    public void forIRUn(IRUn that);

    /** Process an instance of IRLoad. */
    public void forIRLoad(IRLoad that);

    /** Process an instance of IRUserId. */
    public void forIRUserId(IRUserId that);

    /** Process an instance of IRTmpId. */
    public void forIRTmpId(IRTmpId that);

    /** Process an instance of IRThis. */
    public void forIRThis(IRThis that);

    /** Process an instance of IRNumber. */
    public void forIRNumber(IRNumber that);

    /** Process an instance of IRString. */
    public void forIRString(IRString that);

    /** Process an instance of IRBool. */
    public void forIRBool(IRBool that);

    /** Process an instance of IRUndef. */
    public void forIRUndef(IRUndef that);

    /** Process an instance of IRNull. */
    public void forIRNull(IRNull that);

    /** Process an instance of IROp. */
    public void forIROp(IROp that);

    /** Process an instance of IRFunctional. */
    public void forIRFunctional(IRFunctional that);

    /** Process an instance of IRSpanInfo. */
    public void forIRSpanInfo(IRSpanInfo that);
}
