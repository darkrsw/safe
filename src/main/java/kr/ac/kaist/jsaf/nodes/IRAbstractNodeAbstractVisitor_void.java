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

/** An abstract implementation of a visitor over IRAbstractNode that does not return a value.
 ** This visitor implements the visitor interface with methods that each 
 ** delegate to a case representing their superclass.  At the top of this
 ** delegation tree is the method defaultCase(), which (unless overridden)
 ** is a no-op.
 **/
@SuppressWarnings("unused")
public class IRAbstractNodeAbstractVisitor_void extends IRAbstractNodeVisitorRunnable1 {
    /**
     * This method is run for all cases that are not handled elsewhere.
     * By default, it is a no-op; subclasses may override this behavior.
    **/
    public void defaultCase(IRAbstractNode that) {}

    /* Methods to visit an item. */
    public void forIRAbstractNode(IRAbstractNode that) {
        defaultCase(that);
    }

    public void forIRRoot(IRRoot that) {
        forIRAbstractNode(that);
    }

    public void forIRStmt(IRStmt that) {
        forIRAbstractNode(that);
    }

    public void forIRAssign(IRAssign that) {
        forIRStmt(that);
    }

    public void forIRExprStmt(IRExprStmt that) {
        forIRAssign(that);
    }

    public void forIRDelete(IRDelete that) {
        forIRAssign(that);
    }

    public void forIRDeleteProp(IRDeleteProp that) {
        forIRAssign(that);
    }

    public void forIRObject(IRObject that) {
        forIRAssign(that);
    }

    public void forIRArray(IRArray that) {
        forIRAssign(that);
    }

    public void forIRArrayNumber(IRArrayNumber that) {
        forIRAssign(that);
    }

    public void forIRArgs(IRArgs that) {
        forIRAssign(that);
    }

    public void forIRCall(IRCall that) {
        forIRAssign(that);
    }

    public void forIRInternalCall(IRInternalCall that) {
        forIRAssign(that);
    }

    public void forIRNew(IRNew that) {
        forIRAssign(that);
    }

    public void forIRFunExpr(IRFunExpr that) {
        forIRAssign(that);
    }

    public void forIREval(IREval that) {
        forIRAssign(that);
    }

    public void forIRStmtUnit(IRStmtUnit that) {
        forIRStmt(that);
    }

    public void forIRStore(IRStore that) {
        forIRStmt(that);
    }

    public void forIRFunDecl(IRFunDecl that) {
        forIRStmt(that);
    }

    public void forIRBreak(IRBreak that) {
        forIRStmt(that);
    }

    public void forIRReturn(IRReturn that) {
        forIRStmt(that);
    }

    public void forIRWith(IRWith that) {
        forIRStmt(that);
    }

    public void forIRLabelStmt(IRLabelStmt that) {
        forIRStmt(that);
    }

    public void forIRVarStmt(IRVarStmt that) {
        forIRStmt(that);
    }

    public void forIRThrow(IRThrow that) {
        forIRStmt(that);
    }

    public void forIRSeq(IRSeq that) {
        forIRStmt(that);
    }

    public void forIRIf(IRIf that) {
        forIRStmt(that);
    }

    public void forIRWhile(IRWhile that) {
        forIRStmt(that);
    }

    public void forIRTry(IRTry that) {
        forIRStmt(that);
    }

    public void forIRNoOp(IRNoOp that) {
        forIRStmt(that);
    }

    public void forIRMember(IRMember that) {
        forIRAbstractNode(that);
    }

    public void forIRField(IRField that) {
        forIRMember(that);
    }

    public void forIRGetProp(IRGetProp that) {
        forIRMember(that);
    }

    public void forIRSetProp(IRSetProp that) {
        forIRMember(that);
    }

}
