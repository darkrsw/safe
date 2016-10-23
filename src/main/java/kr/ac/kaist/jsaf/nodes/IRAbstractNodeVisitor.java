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

/** A parametric interface for visitors over IRAbstractNode that return a value. */
@SuppressWarnings("unused")
public interface IRAbstractNodeVisitor<RetType> {

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
}
