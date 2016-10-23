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

/** A parametric interface for visitors over IRNode that return a value. */
@SuppressWarnings("unused")
public interface IRNodeVisitor<RetType> extends IRAbstractNodeVisitor<RetType> {

    /** Process an instance of IRRoot. */
    public RetType forIRRoot(IRRoot that);

    /** Process an instance of IRExprStmt. */
    public RetType forIRExprStmt(IRExprStmt that);

    /** Process an instance of IRDelete. */
    public RetType forIRDelete(IRDelete that);

    /** Process an instance of IRDeleteProp. */
    public RetType forIRDeleteProp(IRDeleteProp that);

    /** Process an instance of IRObject. */
    public RetType forIRObject(IRObject that);

    /** Process an instance of IRArray. */
    public RetType forIRArray(IRArray that);

    /** Process an instance of IRArrayNumber. */
    public RetType forIRArrayNumber(IRArrayNumber that);

    /** Process an instance of IRArgs. */
    public RetType forIRArgs(IRArgs that);

    /** Process an instance of IRCall. */
    public RetType forIRCall(IRCall that);

    /** Process an instance of IRInternalCall. */
    public RetType forIRInternalCall(IRInternalCall that);

    /** Process an instance of IRNew. */
    public RetType forIRNew(IRNew that);

    /** Process an instance of IRFunExpr. */
    public RetType forIRFunExpr(IRFunExpr that);

    /** Process an instance of IREval. */
    public RetType forIREval(IREval that);

    /** Process an instance of IRStmtUnit. */
    public RetType forIRStmtUnit(IRStmtUnit that);

    /** Process an instance of IRStore. */
    public RetType forIRStore(IRStore that);

    /** Process an instance of IRFunDecl. */
    public RetType forIRFunDecl(IRFunDecl that);

    /** Process an instance of IRBreak. */
    public RetType forIRBreak(IRBreak that);

    /** Process an instance of IRReturn. */
    public RetType forIRReturn(IRReturn that);

    /** Process an instance of IRWith. */
    public RetType forIRWith(IRWith that);

    /** Process an instance of IRLabelStmt. */
    public RetType forIRLabelStmt(IRLabelStmt that);

    /** Process an instance of IRVarStmt. */
    public RetType forIRVarStmt(IRVarStmt that);

    /** Process an instance of IRThrow. */
    public RetType forIRThrow(IRThrow that);

    /** Process an instance of IRSeq. */
    public RetType forIRSeq(IRSeq that);

    /** Process an instance of IRIf. */
    public RetType forIRIf(IRIf that);

    /** Process an instance of IRWhile. */
    public RetType forIRWhile(IRWhile that);

    /** Process an instance of IRTry. */
    public RetType forIRTry(IRTry that);

    /** Process an instance of IRNoOp. */
    public RetType forIRNoOp(IRNoOp that);

    /** Process an instance of IRField. */
    public RetType forIRField(IRField that);

    /** Process an instance of IRGetProp. */
    public RetType forIRGetProp(IRGetProp that);

    /** Process an instance of IRSetProp. */
    public RetType forIRSetProp(IRSetProp that);

    /** Process an instance of IRBin. */
    public RetType forIRBin(IRBin that);

    /** Process an instance of IRUn. */
    public RetType forIRUn(IRUn that);

    /** Process an instance of IRLoad. */
    public RetType forIRLoad(IRLoad that);

    /** Process an instance of IRUserId. */
    public RetType forIRUserId(IRUserId that);

    /** Process an instance of IRTmpId. */
    public RetType forIRTmpId(IRTmpId that);

    /** Process an instance of IRThis. */
    public RetType forIRThis(IRThis that);

    /** Process an instance of IRNumber. */
    public RetType forIRNumber(IRNumber that);

    /** Process an instance of IRString. */
    public RetType forIRString(IRString that);

    /** Process an instance of IRBool. */
    public RetType forIRBool(IRBool that);

    /** Process an instance of IRUndef. */
    public RetType forIRUndef(IRUndef that);

    /** Process an instance of IRNull. */
    public RetType forIRNull(IRNull that);

    /** Process an instance of IROp. */
    public RetType forIROp(IROp that);

    /** Process an instance of IRFunctional. */
    public RetType forIRFunctional(IRFunctional that);

    /** Process an instance of IRSpanInfo. */
    public RetType forIRSpanInfo(IRSpanInfo that);
}
