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

/** An abstract void visitor over Node that provides a Runnable1 run method;
  * all visit methods are left unimplemented. */
@SuppressWarnings("unused")
public abstract class NodeVisitorRunnable1 implements edu.rice.cs.plt.lambda.Runnable1<Node>, NodeVisitor_void {

    public void run(Node that) {
        that.accept(this);
    }


    /** Process an instance of Program. */
    public abstract void forProgram(Program that);

    /** Process an instance of ModDecl. */
    public abstract void forModDecl(ModDecl that);

    /** Process an instance of ModExpVarStmt. */
    public abstract void forModExpVarStmt(ModExpVarStmt that);

    /** Process an instance of ModExpFunDecl. */
    public abstract void forModExpFunDecl(ModExpFunDecl that);

    /** Process an instance of ModExpGetter. */
    public abstract void forModExpGetter(ModExpGetter that);

    /** Process an instance of ModExpSetter. */
    public abstract void forModExpSetter(ModExpSetter that);

    /** Process an instance of ModExpSpecifiers. */
    public abstract void forModExpSpecifiers(ModExpSpecifiers that);

    /** Process an instance of ModExpAssignment. */
    public abstract void forModExpAssignment(ModExpAssignment that);

    /** Process an instance of ModImpDecl. */
    public abstract void forModImpDecl(ModImpDecl that);

    /** Process an instance of ExtImpDecl. */
    public abstract void forExtImpDecl(ExtImpDecl that);

    /** Process an instance of TSImpDecl. */
    public abstract void forTSImpDecl(TSImpDecl that);

    /** Process an instance of IntfDecl. */
    public abstract void forIntfDecl(IntfDecl that);

    /** Process an instance of AmbVarDecl. */
    public abstract void forAmbVarDecl(AmbVarDecl that);

    /** Process an instance of AmbFunDecl. */
    public abstract void forAmbFunDecl(AmbFunDecl that);

    /** Process an instance of AmbClsDecl. */
    public abstract void forAmbClsDecl(AmbClsDecl that);

    /** Process an instance of AmbEnumDecl. */
    public abstract void forAmbEnumDecl(AmbEnumDecl that);

    /** Process an instance of AmbModDecl. */
    public abstract void forAmbModDecl(AmbModDecl that);

    /** Process an instance of AmbExtModDecl. */
    public abstract void forAmbExtModDecl(AmbExtModDecl that);

    /** Process an instance of NoOp. */
    public abstract void forNoOp(NoOp that);

    /** Process an instance of StmtUnit. */
    public abstract void forStmtUnit(StmtUnit that);

    /** Process an instance of FunDecl. */
    public abstract void forFunDecl(FunDecl that);

    /** Process an instance of Block. */
    public abstract void forBlock(Block that);

    /** Process an instance of VarStmt. */
    public abstract void forVarStmt(VarStmt that);

    /** Process an instance of EmptyStmt. */
    public abstract void forEmptyStmt(EmptyStmt that);

    /** Process an instance of ExprStmt. */
    public abstract void forExprStmt(ExprStmt that);

    /** Process an instance of If. */
    public abstract void forIf(If that);

    /** Process an instance of DoWhile. */
    public abstract void forDoWhile(DoWhile that);

    /** Process an instance of While. */
    public abstract void forWhile(While that);

    /** Process an instance of For. */
    public abstract void forFor(For that);

    /** Process an instance of ForIn. */
    public abstract void forForIn(ForIn that);

    /** Process an instance of ForVar. */
    public abstract void forForVar(ForVar that);

    /** Process an instance of ForVarIn. */
    public abstract void forForVarIn(ForVarIn that);

    /** Process an instance of Continue. */
    public abstract void forContinue(Continue that);

    /** Process an instance of Break. */
    public abstract void forBreak(Break that);

    /** Process an instance of Return. */
    public abstract void forReturn(Return that);

    /** Process an instance of With. */
    public abstract void forWith(With that);

    /** Process an instance of Switch. */
    public abstract void forSwitch(Switch that);

    /** Process an instance of LabelStmt. */
    public abstract void forLabelStmt(LabelStmt that);

    /** Process an instance of Throw. */
    public abstract void forThrow(Throw that);

    /** Process an instance of Try. */
    public abstract void forTry(Try that);

    /** Process an instance of Debugger. */
    public abstract void forDebugger(Debugger that);

    /** Process an instance of SourceElements. */
    public abstract void forSourceElements(SourceElements that);

    /** Process an instance of VarDecl. */
    public abstract void forVarDecl(VarDecl that);

    /** Process an instance of Case. */
    public abstract void forCase(Case that);

    /** Process an instance of Catch. */
    public abstract void forCatch(Catch that);

    /** Process an instance of ModImpSpecifierSet. */
    public abstract void forModImpSpecifierSet(ModImpSpecifierSet that);

    /** Process an instance of ModImpAliasClause. */
    public abstract void forModImpAliasClause(ModImpAliasClause that);

    /** Process an instance of AmbCnstDecl. */
    public abstract void forAmbCnstDecl(AmbCnstDecl that);

    /** Process an instance of AmbMemDecl. */
    public abstract void forAmbMemDecl(AmbMemDecl that);

    /** Process an instance of AmbIndDecl. */
    public abstract void forAmbIndDecl(AmbIndDecl that);

    /** Process an instance of AmbEnumMem. */
    public abstract void forAmbEnumMem(AmbEnumMem that);

    /** Process an instance of AmbModElt. */
    public abstract void forAmbModElt(AmbModElt that);

    /** Process an instance of AmbExtModElt. */
    public abstract void forAmbExtModElt(AmbExtModElt that);

    /** Process an instance of ExprList. */
    public abstract void forExprList(ExprList that);

    /** Process an instance of Cond. */
    public abstract void forCond(Cond that);

    /** Process an instance of InfixOpApp. */
    public abstract void forInfixOpApp(InfixOpApp that);

    /** Process an instance of PrefixOpApp. */
    public abstract void forPrefixOpApp(PrefixOpApp that);

    /** Process an instance of UnaryAssignOpApp. */
    public abstract void forUnaryAssignOpApp(UnaryAssignOpApp that);

    /** Process an instance of AssignOpApp. */
    public abstract void forAssignOpApp(AssignOpApp that);

    /** Process an instance of This. */
    public abstract void forThis(This that);

    /** Process an instance of Null. */
    public abstract void forNull(Null that);

    /** Process an instance of Bool. */
    public abstract void forBool(Bool that);

    /** Process an instance of DoubleLiteral. */
    public abstract void forDoubleLiteral(DoubleLiteral that);

    /** Process an instance of IntLiteral. */
    public abstract void forIntLiteral(IntLiteral that);

    /** Process an instance of StringLiteral. */
    public abstract void forStringLiteral(StringLiteral that);

    /** Process an instance of RegularExpression. */
    public abstract void forRegularExpression(RegularExpression that);

    /** Process an instance of VarRef. */
    public abstract void forVarRef(VarRef that);

    /** Process an instance of ArrayExpr. */
    public abstract void forArrayExpr(ArrayExpr that);

    /** Process an instance of ArrayNumberExpr. */
    public abstract void forArrayNumberExpr(ArrayNumberExpr that);

    /** Process an instance of ObjectExpr. */
    public abstract void forObjectExpr(ObjectExpr that);

    /** Process an instance of Parenthesized. */
    public abstract void forParenthesized(Parenthesized that);

    /** Process an instance of FunExpr. */
    public abstract void forFunExpr(FunExpr that);

    /** Process an instance of Bracket. */
    public abstract void forBracket(Bracket that);

    /** Process an instance of Dot. */
    public abstract void forDot(Dot that);

    /** Process an instance of New. */
    public abstract void forNew(New that);

    /** Process an instance of FunApp. */
    public abstract void forFunApp(FunApp that);

    /** Process an instance of PropId. */
    public abstract void forPropId(PropId that);

    /** Process an instance of PropStr. */
    public abstract void forPropStr(PropStr that);

    /** Process an instance of PropNum. */
    public abstract void forPropNum(PropNum that);

    /** Process an instance of Field. */
    public abstract void forField(Field that);

    /** Process an instance of GetProp. */
    public abstract void forGetProp(GetProp that);

    /** Process an instance of SetProp. */
    public abstract void forSetProp(SetProp that);

    /** Process an instance of Id. */
    public abstract void forId(Id that);

    /** Process an instance of Op. */
    public abstract void forOp(Op that);

    /** Process an instance of TypeName. */
    public abstract void forTypeName(TypeName that);

    /** Process an instance of AnonymousFnName. */
    public abstract void forAnonymousFnName(AnonymousFnName that);

    /** Process an instance of Path. */
    public abstract void forPath(Path that);

    /** Process an instance of ModExpStarFromPath. */
    public abstract void forModExpStarFromPath(ModExpStarFromPath that);

    /** Process an instance of ModExpStar. */
    public abstract void forModExpStar(ModExpStar that);

    /** Process an instance of ModExpAlias. */
    public abstract void forModExpAlias(ModExpAlias that);

    /** Process an instance of ModExpName. */
    public abstract void forModExpName(ModExpName that);

    /** Process an instance of ModImpAlias. */
    public abstract void forModImpAlias(ModImpAlias that);

    /** Process an instance of ModImpName. */
    public abstract void forModImpName(ModImpName that);

    /** Process an instance of Label. */
    public abstract void forLabel(Label that);

    /** Process an instance of Comment. */
    public abstract void forComment(Comment that);

    /** Process an instance of Param. */
    public abstract void forParam(Param that);

    /** Process an instance of AnyT. */
    public abstract void forAnyT(AnyT that);

    /** Process an instance of NumberT. */
    public abstract void forNumberT(NumberT that);

    /** Process an instance of BoolT. */
    public abstract void forBoolT(BoolT that);

    /** Process an instance of StringT. */
    public abstract void forStringT(StringT that);

    /** Process an instance of VoidT. */
    public abstract void forVoidT(VoidT that);

    /** Process an instance of TypeRef. */
    public abstract void forTypeRef(TypeRef that);

    /** Process an instance of TypeQuery. */
    public abstract void forTypeQuery(TypeQuery that);

    /** Process an instance of ObjectType. */
    public abstract void forObjectType(ObjectType that);

    /** Process an instance of ArrayType. */
    public abstract void forArrayType(ArrayType that);

    /** Process an instance of FunctionType. */
    public abstract void forFunctionType(FunctionType that);

    /** Process an instance of ConstructorType. */
    public abstract void forConstructorType(ConstructorType that);

    /** Process an instance of ExprType. */
    public abstract void forExprType(ExprType that);

    /** Process an instance of PropertySig. */
    public abstract void forPropertySig(PropertySig that);

    /** Process an instance of CallSig. */
    public abstract void forCallSig(CallSig that);

    /** Process an instance of ConstructSig. */
    public abstract void forConstructSig(ConstructSig that);

    /** Process an instance of IndexSig. */
    public abstract void forIndexSig(IndexSig that);

    /** Process an instance of MethodSig. */
    public abstract void forMethodSig(MethodSig that);

    /** Process an instance of TypeParam. */
    public abstract void forTypeParam(TypeParam that);

    /** Process an instance of TopLevel. */
    public abstract void forTopLevel(TopLevel that);

    /** Process an instance of Functional. */
    public abstract void forFunctional(Functional that);

    /** Process an instance of ASTSpanInfo. */
    public abstract void forASTSpanInfo(ASTSpanInfo that);

    /** Process an instance of PublicMod. */
    public abstract void forPublicMod(PublicMod that);

    /** Process an instance of PrivateMod. */
    public abstract void forPrivateMod(PrivateMod that);

    /** Process an instance of StaticMod. */
    public abstract void forStaticMod(StaticMod that);
}
