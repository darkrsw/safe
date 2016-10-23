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

/** An interface for visitors over AbstractNode that do not return a value. */
@SuppressWarnings("unused")
public interface AbstractNodeVisitor_void {

    /** Process an instance of Program. */
    public void forProgram(Program that);

    /** Process an instance of ModDecl. */
    public void forModDecl(ModDecl that);

    /** Process an instance of ModExpVarStmt. */
    public void forModExpVarStmt(ModExpVarStmt that);

    /** Process an instance of ModExpFunDecl. */
    public void forModExpFunDecl(ModExpFunDecl that);

    /** Process an instance of ModExpGetter. */
    public void forModExpGetter(ModExpGetter that);

    /** Process an instance of ModExpSetter. */
    public void forModExpSetter(ModExpSetter that);

    /** Process an instance of ModExpSpecifiers. */
    public void forModExpSpecifiers(ModExpSpecifiers that);

    /** Process an instance of ModExpAssignment. */
    public void forModExpAssignment(ModExpAssignment that);

    /** Process an instance of ModImpDecl. */
    public void forModImpDecl(ModImpDecl that);

    /** Process an instance of ExtImpDecl. */
    public void forExtImpDecl(ExtImpDecl that);

    /** Process an instance of TSImpDecl. */
    public void forTSImpDecl(TSImpDecl that);

    /** Process an instance of IntfDecl. */
    public void forIntfDecl(IntfDecl that);

    /** Process an instance of AmbVarDecl. */
    public void forAmbVarDecl(AmbVarDecl that);

    /** Process an instance of AmbFunDecl. */
    public void forAmbFunDecl(AmbFunDecl that);

    /** Process an instance of AmbClsDecl. */
    public void forAmbClsDecl(AmbClsDecl that);

    /** Process an instance of AmbEnumDecl. */
    public void forAmbEnumDecl(AmbEnumDecl that);

    /** Process an instance of AmbModDecl. */
    public void forAmbModDecl(AmbModDecl that);

    /** Process an instance of AmbExtModDecl. */
    public void forAmbExtModDecl(AmbExtModDecl that);

    /** Process an instance of NoOp. */
    public void forNoOp(NoOp that);

    /** Process an instance of StmtUnit. */
    public void forStmtUnit(StmtUnit that);

    /** Process an instance of FunDecl. */
    public void forFunDecl(FunDecl that);

    /** Process an instance of Block. */
    public void forBlock(Block that);

    /** Process an instance of VarStmt. */
    public void forVarStmt(VarStmt that);

    /** Process an instance of EmptyStmt. */
    public void forEmptyStmt(EmptyStmt that);

    /** Process an instance of ExprStmt. */
    public void forExprStmt(ExprStmt that);

    /** Process an instance of If. */
    public void forIf(If that);

    /** Process an instance of DoWhile. */
    public void forDoWhile(DoWhile that);

    /** Process an instance of While. */
    public void forWhile(While that);

    /** Process an instance of For. */
    public void forFor(For that);

    /** Process an instance of ForIn. */
    public void forForIn(ForIn that);

    /** Process an instance of ForVar. */
    public void forForVar(ForVar that);

    /** Process an instance of ForVarIn. */
    public void forForVarIn(ForVarIn that);

    /** Process an instance of Continue. */
    public void forContinue(Continue that);

    /** Process an instance of Break. */
    public void forBreak(Break that);

    /** Process an instance of Return. */
    public void forReturn(Return that);

    /** Process an instance of With. */
    public void forWith(With that);

    /** Process an instance of Switch. */
    public void forSwitch(Switch that);

    /** Process an instance of LabelStmt. */
    public void forLabelStmt(LabelStmt that);

    /** Process an instance of Throw. */
    public void forThrow(Throw that);

    /** Process an instance of Try. */
    public void forTry(Try that);

    /** Process an instance of Debugger. */
    public void forDebugger(Debugger that);

    /** Process an instance of SourceElements. */
    public void forSourceElements(SourceElements that);

    /** Process an instance of VarDecl. */
    public void forVarDecl(VarDecl that);

    /** Process an instance of Case. */
    public void forCase(Case that);

    /** Process an instance of Catch. */
    public void forCatch(Catch that);

    /** Process an instance of ModImpSpecifierSet. */
    public void forModImpSpecifierSet(ModImpSpecifierSet that);

    /** Process an instance of ModImpAliasClause. */
    public void forModImpAliasClause(ModImpAliasClause that);

    /** Process an instance of AmbCnstDecl. */
    public void forAmbCnstDecl(AmbCnstDecl that);

    /** Process an instance of AmbMemDecl. */
    public void forAmbMemDecl(AmbMemDecl that);

    /** Process an instance of AmbIndDecl. */
    public void forAmbIndDecl(AmbIndDecl that);

    /** Process an instance of AmbEnumMem. */
    public void forAmbEnumMem(AmbEnumMem that);

    /** Process an instance of AmbModElt. */
    public void forAmbModElt(AmbModElt that);

    /** Process an instance of AmbExtModElt. */
    public void forAmbExtModElt(AmbExtModElt that);

    /** Process an instance of ExprList. */
    public void forExprList(ExprList that);

    /** Process an instance of Cond. */
    public void forCond(Cond that);

    /** Process an instance of InfixOpApp. */
    public void forInfixOpApp(InfixOpApp that);

    /** Process an instance of PrefixOpApp. */
    public void forPrefixOpApp(PrefixOpApp that);

    /** Process an instance of UnaryAssignOpApp. */
    public void forUnaryAssignOpApp(UnaryAssignOpApp that);

    /** Process an instance of AssignOpApp. */
    public void forAssignOpApp(AssignOpApp that);

    /** Process an instance of This. */
    public void forThis(This that);

    /** Process an instance of Null. */
    public void forNull(Null that);

    /** Process an instance of Bool. */
    public void forBool(Bool that);

    /** Process an instance of DoubleLiteral. */
    public void forDoubleLiteral(DoubleLiteral that);

    /** Process an instance of IntLiteral. */
    public void forIntLiteral(IntLiteral that);

    /** Process an instance of StringLiteral. */
    public void forStringLiteral(StringLiteral that);

    /** Process an instance of RegularExpression. */
    public void forRegularExpression(RegularExpression that);

    /** Process an instance of VarRef. */
    public void forVarRef(VarRef that);

    /** Process an instance of ArrayExpr. */
    public void forArrayExpr(ArrayExpr that);

    /** Process an instance of ArrayNumberExpr. */
    public void forArrayNumberExpr(ArrayNumberExpr that);

    /** Process an instance of ObjectExpr. */
    public void forObjectExpr(ObjectExpr that);

    /** Process an instance of Parenthesized. */
    public void forParenthesized(Parenthesized that);

    /** Process an instance of FunExpr. */
    public void forFunExpr(FunExpr that);

    /** Process an instance of Bracket. */
    public void forBracket(Bracket that);

    /** Process an instance of Dot. */
    public void forDot(Dot that);

    /** Process an instance of New. */
    public void forNew(New that);

    /** Process an instance of FunApp. */
    public void forFunApp(FunApp that);

    /** Process an instance of PropId. */
    public void forPropId(PropId that);

    /** Process an instance of PropStr. */
    public void forPropStr(PropStr that);

    /** Process an instance of PropNum. */
    public void forPropNum(PropNum that);

    /** Process an instance of Field. */
    public void forField(Field that);

    /** Process an instance of GetProp. */
    public void forGetProp(GetProp that);

    /** Process an instance of SetProp. */
    public void forSetProp(SetProp that);

    /** Process an instance of Id. */
    public void forId(Id that);

    /** Process an instance of Op. */
    public void forOp(Op that);

    /** Process an instance of TypeName. */
    public void forTypeName(TypeName that);

    /** Process an instance of AnonymousFnName. */
    public void forAnonymousFnName(AnonymousFnName that);

    /** Process an instance of Path. */
    public void forPath(Path that);

    /** Process an instance of ModExpStarFromPath. */
    public void forModExpStarFromPath(ModExpStarFromPath that);

    /** Process an instance of ModExpStar. */
    public void forModExpStar(ModExpStar that);

    /** Process an instance of ModExpAlias. */
    public void forModExpAlias(ModExpAlias that);

    /** Process an instance of ModExpName. */
    public void forModExpName(ModExpName that);

    /** Process an instance of ModImpAlias. */
    public void forModImpAlias(ModImpAlias that);

    /** Process an instance of ModImpName. */
    public void forModImpName(ModImpName that);

    /** Process an instance of Label. */
    public void forLabel(Label that);

    /** Process an instance of Comment. */
    public void forComment(Comment that);

    /** Process an instance of Param. */
    public void forParam(Param that);

    /** Process an instance of AnyT. */
    public void forAnyT(AnyT that);

    /** Process an instance of NumberT. */
    public void forNumberT(NumberT that);

    /** Process an instance of BoolT. */
    public void forBoolT(BoolT that);

    /** Process an instance of StringT. */
    public void forStringT(StringT that);

    /** Process an instance of VoidT. */
    public void forVoidT(VoidT that);

    /** Process an instance of TypeRef. */
    public void forTypeRef(TypeRef that);

    /** Process an instance of TypeQuery. */
    public void forTypeQuery(TypeQuery that);

    /** Process an instance of ObjectType. */
    public void forObjectType(ObjectType that);

    /** Process an instance of ArrayType. */
    public void forArrayType(ArrayType that);

    /** Process an instance of FunctionType. */
    public void forFunctionType(FunctionType that);

    /** Process an instance of ConstructorType. */
    public void forConstructorType(ConstructorType that);

    /** Process an instance of ExprType. */
    public void forExprType(ExprType that);

    /** Process an instance of PropertySig. */
    public void forPropertySig(PropertySig that);

    /** Process an instance of CallSig. */
    public void forCallSig(CallSig that);

    /** Process an instance of ConstructSig. */
    public void forConstructSig(ConstructSig that);

    /** Process an instance of IndexSig. */
    public void forIndexSig(IndexSig that);

    /** Process an instance of MethodSig. */
    public void forMethodSig(MethodSig that);

    /** Process an instance of TypeParam. */
    public void forTypeParam(TypeParam that);
}
