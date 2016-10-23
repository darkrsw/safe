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

/** A parametric abstract implementation of a visitor over IRNode that return a value.
 ** This visitor implements the visitor interface with methods that each 
 ** delegate to a case representing their superclass.  At the top of this
 ** delegation tree is the method defaultCase(), which (unless overridden)
 ** throws an exception.
 **/
@SuppressWarnings("unused")
public abstract class IRNodeAbstractVisitor<RetType>  extends IRNodeVisitorLambda<RetType> {
    /**
     * This method is run for all cases that are not handled elsewhere.
     * By default, an exception is thrown; subclasses may override this behavior.
     * @throws IllegalArgumentException
    **/
    public RetType defaultCase(IRNode that) {
        throw new IllegalArgumentException("Visitor " + getClass().getName() + " does not support visiting values of type " + that.getClass().getName());
    }

    /* Methods to visit an item. */
    public RetType forIRNode(IRNode that) {
        return defaultCase(that);
    }

    public RetType forIRAbstractNode(IRAbstractNode that) {
        return forIRNode(that);
    }

    public RetType forIRRoot(IRRoot that) {
        return forIRAbstractNode(that);
    }

    public RetType forIRStmt(IRStmt that) {
        return forIRAbstractNode(that);
    }

    public RetType forIRAssign(IRAssign that) {
        return forIRStmt(that);
    }

    public RetType forIRExprStmt(IRExprStmt that) {
        return forIRAssign(that);
    }

    public RetType forIRDelete(IRDelete that) {
        return forIRAssign(that);
    }

    public RetType forIRDeleteProp(IRDeleteProp that) {
        return forIRAssign(that);
    }

    public RetType forIRObject(IRObject that) {
        return forIRAssign(that);
    }

    public RetType forIRArray(IRArray that) {
        return forIRAssign(that);
    }

    public RetType forIRArrayNumber(IRArrayNumber that) {
        return forIRAssign(that);
    }

    public RetType forIRArgs(IRArgs that) {
        return forIRAssign(that);
    }

    public RetType forIRCall(IRCall that) {
        return forIRAssign(that);
    }

    public RetType forIRInternalCall(IRInternalCall that) {
        return forIRAssign(that);
    }

    public RetType forIRNew(IRNew that) {
        return forIRAssign(that);
    }

    public RetType forIRFunExpr(IRFunExpr that) {
        return forIRAssign(that);
    }

    public RetType forIREval(IREval that) {
        return forIRAssign(that);
    }

    public RetType forIRStmtUnit(IRStmtUnit that) {
        return forIRStmt(that);
    }

    public RetType forIRStore(IRStore that) {
        return forIRStmt(that);
    }

    public RetType forIRFunDecl(IRFunDecl that) {
        return forIRStmt(that);
    }

    public RetType forIRBreak(IRBreak that) {
        return forIRStmt(that);
    }

    public RetType forIRReturn(IRReturn that) {
        return forIRStmt(that);
    }

    public RetType forIRWith(IRWith that) {
        return forIRStmt(that);
    }

    public RetType forIRLabelStmt(IRLabelStmt that) {
        return forIRStmt(that);
    }

    public RetType forIRVarStmt(IRVarStmt that) {
        return forIRStmt(that);
    }

    public RetType forIRThrow(IRThrow that) {
        return forIRStmt(that);
    }

    public RetType forIRSeq(IRSeq that) {
        return forIRStmt(that);
    }

    public RetType forIRIf(IRIf that) {
        return forIRStmt(that);
    }

    public RetType forIRWhile(IRWhile that) {
        return forIRStmt(that);
    }

    public RetType forIRTry(IRTry that) {
        return forIRStmt(that);
    }

    public RetType forIRNoOp(IRNoOp that) {
        return forIRStmt(that);
    }

    public RetType forIRMember(IRMember that) {
        return forIRAbstractNode(that);
    }

    public RetType forIRField(IRField that) {
        return forIRMember(that);
    }

    public RetType forIRGetProp(IRGetProp that) {
        return forIRMember(that);
    }

    public RetType forIRSetProp(IRSetProp that) {
        return forIRMember(that);
    }

    public RetType forIRExpr(IRExpr that) {
        return forIRNode(that);
    }

    public RetType forIROpApp(IROpApp that) {
        return forIRExpr(that);
    }

    public RetType forIRBin(IRBin that) {
        return forIROpApp(that);
    }

    public RetType forIRUn(IRUn that) {
        return forIROpApp(that);
    }

    public RetType forIRLoad(IRLoad that) {
        return forIROpApp(that);
    }

    public RetType forIRId(IRId that) {
        return forIRExpr(that);
    }

    public RetType forIRUserId(IRUserId that) {
        return forIRId(that);
    }

    public RetType forIRTmpId(IRTmpId that) {
        return forIRId(that);
    }

    public RetType forIRThis(IRThis that) {
        return forIRExpr(that);
    }

    public RetType forIRVal(IRVal that) {
        return forIRExpr(that);
    }

    public RetType forIRPVal(IRPVal that) {
        return forIRVal(that);
    }

    public RetType forIRNumber(IRNumber that) {
        return forIRPVal(that);
    }

    public RetType forIRString(IRString that) {
        return forIRPVal(that);
    }

    public RetType forIRBool(IRBool that) {
        return forIRPVal(that);
    }

    public RetType forIRUndef(IRUndef that) {
        return forIRPVal(that);
    }

    public RetType forIRNull(IRNull that) {
        return forIRPVal(that);
    }

    public RetType forIROp(IROp that) {
        return forIRNode(that);
    }

    public RetType forIRInfoNode(IRInfoNode that) {
        return forIRNode(that);
    }

    public RetType forIRFunctional(IRFunctional that) {
        return forIRInfoNode(that);
    }

    public RetType forIRSpanInfo(IRSpanInfo that) {
        return forIRInfoNode(that);
    }


}
