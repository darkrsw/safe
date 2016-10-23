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

/** A parametric interface for visitors over Node that return a value. */
@SuppressWarnings("unused")
public interface NodeVisitor<RetType> extends AbstractNodeVisitor<RetType> {

    /** Process an instance of Program. */
    public RetType forProgram(Program that);

    /** Process an instance of ModDecl. */
    public RetType forModDecl(ModDecl that);

    /** Process an instance of ModExpVarStmt. */
    public RetType forModExpVarStmt(ModExpVarStmt that);

    /** Process an instance of ModExpFunDecl. */
    public RetType forModExpFunDecl(ModExpFunDecl that);

    /** Process an instance of ModExpGetter. */
    public RetType forModExpGetter(ModExpGetter that);

    /** Process an instance of ModExpSetter. */
    public RetType forModExpSetter(ModExpSetter that);

    /** Process an instance of ModExpSpecifiers. */
    public RetType forModExpSpecifiers(ModExpSpecifiers that);

    /** Process an instance of ModExpAssignment. */
    public RetType forModExpAssignment(ModExpAssignment that);

    /** Process an instance of ModImpDecl. */
    public RetType forModImpDecl(ModImpDecl that);

    /** Process an instance of ExtImpDecl. */
    public RetType forExtImpDecl(ExtImpDecl that);

    /** Process an instance of TSImpDecl. */
    public RetType forTSImpDecl(TSImpDecl that);

    /** Process an instance of IntfDecl. */
    public RetType forIntfDecl(IntfDecl that);

    /** Process an instance of AmbVarDecl. */
    public RetType forAmbVarDecl(AmbVarDecl that);

    /** Process an instance of AmbFunDecl. */
    public RetType forAmbFunDecl(AmbFunDecl that);

    /** Process an instance of AmbClsDecl. */
    public RetType forAmbClsDecl(AmbClsDecl that);

    /** Process an instance of AmbEnumDecl. */
    public RetType forAmbEnumDecl(AmbEnumDecl that);

    /** Process an instance of AmbModDecl. */
    public RetType forAmbModDecl(AmbModDecl that);

    /** Process an instance of AmbExtModDecl. */
    public RetType forAmbExtModDecl(AmbExtModDecl that);

    /** Process an instance of NoOp. */
    public RetType forNoOp(NoOp that);

    /** Process an instance of StmtUnit. */
    public RetType forStmtUnit(StmtUnit that);

    /** Process an instance of FunDecl. */
    public RetType forFunDecl(FunDecl that);

    /** Process an instance of Block. */
    public RetType forBlock(Block that);

    /** Process an instance of VarStmt. */
    public RetType forVarStmt(VarStmt that);

    /** Process an instance of EmptyStmt. */
    public RetType forEmptyStmt(EmptyStmt that);

    /** Process an instance of ExprStmt. */
    public RetType forExprStmt(ExprStmt that);

    /** Process an instance of If. */
    public RetType forIf(If that);

    /** Process an instance of DoWhile. */
    public RetType forDoWhile(DoWhile that);

    /** Process an instance of While. */
    public RetType forWhile(While that);

    /** Process an instance of For. */
    public RetType forFor(For that);

    /** Process an instance of ForIn. */
    public RetType forForIn(ForIn that);

    /** Process an instance of ForVar. */
    public RetType forForVar(ForVar that);

    /** Process an instance of ForVarIn. */
    public RetType forForVarIn(ForVarIn that);

    /** Process an instance of Continue. */
    public RetType forContinue(Continue that);

    /** Process an instance of Break. */
    public RetType forBreak(Break that);

    /** Process an instance of Return. */
    public RetType forReturn(Return that);

    /** Process an instance of With. */
    public RetType forWith(With that);

    /** Process an instance of Switch. */
    public RetType forSwitch(Switch that);

    /** Process an instance of LabelStmt. */
    public RetType forLabelStmt(LabelStmt that);

    /** Process an instance of Throw. */
    public RetType forThrow(Throw that);

    /** Process an instance of Try. */
    public RetType forTry(Try that);

    /** Process an instance of Debugger. */
    public RetType forDebugger(Debugger that);

    /** Process an instance of SourceElements. */
    public RetType forSourceElements(SourceElements that);

    /** Process an instance of VarDecl. */
    public RetType forVarDecl(VarDecl that);

    /** Process an instance of Case. */
    public RetType forCase(Case that);

    /** Process an instance of Catch. */
    public RetType forCatch(Catch that);

    /** Process an instance of ModImpSpecifierSet. */
    public RetType forModImpSpecifierSet(ModImpSpecifierSet that);

    /** Process an instance of ModImpAliasClause. */
    public RetType forModImpAliasClause(ModImpAliasClause that);

    /** Process an instance of AmbCnstDecl. */
    public RetType forAmbCnstDecl(AmbCnstDecl that);

    /** Process an instance of AmbMemDecl. */
    public RetType forAmbMemDecl(AmbMemDecl that);

    /** Process an instance of AmbIndDecl. */
    public RetType forAmbIndDecl(AmbIndDecl that);

    /** Process an instance of AmbEnumMem. */
    public RetType forAmbEnumMem(AmbEnumMem that);

    /** Process an instance of AmbModElt. */
    public RetType forAmbModElt(AmbModElt that);

    /** Process an instance of AmbExtModElt. */
    public RetType forAmbExtModElt(AmbExtModElt that);

    /** Process an instance of ExprList. */
    public RetType forExprList(ExprList that);

    /** Process an instance of Cond. */
    public RetType forCond(Cond that);

    /** Process an instance of InfixOpApp. */
    public RetType forInfixOpApp(InfixOpApp that);

    /** Process an instance of PrefixOpApp. */
    public RetType forPrefixOpApp(PrefixOpApp that);

    /** Process an instance of UnaryAssignOpApp. */
    public RetType forUnaryAssignOpApp(UnaryAssignOpApp that);

    /** Process an instance of AssignOpApp. */
    public RetType forAssignOpApp(AssignOpApp that);

    /** Process an instance of This. */
    public RetType forThis(This that);

    /** Process an instance of Null. */
    public RetType forNull(Null that);

    /** Process an instance of Bool. */
    public RetType forBool(Bool that);

    /** Process an instance of DoubleLiteral. */
    public RetType forDoubleLiteral(DoubleLiteral that);

    /** Process an instance of IntLiteral. */
    public RetType forIntLiteral(IntLiteral that);

    /** Process an instance of StringLiteral. */
    public RetType forStringLiteral(StringLiteral that);

    /** Process an instance of RegularExpression. */
    public RetType forRegularExpression(RegularExpression that);

    /** Process an instance of VarRef. */
    public RetType forVarRef(VarRef that);

    /** Process an instance of ArrayExpr. */
    public RetType forArrayExpr(ArrayExpr that);

    /** Process an instance of ArrayNumberExpr. */
    public RetType forArrayNumberExpr(ArrayNumberExpr that);

    /** Process an instance of ObjectExpr. */
    public RetType forObjectExpr(ObjectExpr that);

    /** Process an instance of Parenthesized. */
    public RetType forParenthesized(Parenthesized that);

    /** Process an instance of FunExpr. */
    public RetType forFunExpr(FunExpr that);

    /** Process an instance of Bracket. */
    public RetType forBracket(Bracket that);

    /** Process an instance of Dot. */
    public RetType forDot(Dot that);

    /** Process an instance of New. */
    public RetType forNew(New that);

    /** Process an instance of FunApp. */
    public RetType forFunApp(FunApp that);

    /** Process an instance of PropId. */
    public RetType forPropId(PropId that);

    /** Process an instance of PropStr. */
    public RetType forPropStr(PropStr that);

    /** Process an instance of PropNum. */
    public RetType forPropNum(PropNum that);

    /** Process an instance of Field. */
    public RetType forField(Field that);

    /** Process an instance of GetProp. */
    public RetType forGetProp(GetProp that);

    /** Process an instance of SetProp. */
    public RetType forSetProp(SetProp that);

    /** Process an instance of Id. */
    public RetType forId(Id that);

    /** Process an instance of Op. */
    public RetType forOp(Op that);

    /** Process an instance of TypeName. */
    public RetType forTypeName(TypeName that);

    /** Process an instance of AnonymousFnName. */
    public RetType forAnonymousFnName(AnonymousFnName that);

    /** Process an instance of Path. */
    public RetType forPath(Path that);

    /** Process an instance of ModExpStarFromPath. */
    public RetType forModExpStarFromPath(ModExpStarFromPath that);

    /** Process an instance of ModExpStar. */
    public RetType forModExpStar(ModExpStar that);

    /** Process an instance of ModExpAlias. */
    public RetType forModExpAlias(ModExpAlias that);

    /** Process an instance of ModExpName. */
    public RetType forModExpName(ModExpName that);

    /** Process an instance of ModImpAlias. */
    public RetType forModImpAlias(ModImpAlias that);

    /** Process an instance of ModImpName. */
    public RetType forModImpName(ModImpName that);

    /** Process an instance of Label. */
    public RetType forLabel(Label that);

    /** Process an instance of Comment. */
    public RetType forComment(Comment that);

    /** Process an instance of Param. */
    public RetType forParam(Param that);

    /** Process an instance of AnyT. */
    public RetType forAnyT(AnyT that);

    /** Process an instance of NumberT. */
    public RetType forNumberT(NumberT that);

    /** Process an instance of BoolT. */
    public RetType forBoolT(BoolT that);

    /** Process an instance of StringT. */
    public RetType forStringT(StringT that);

    /** Process an instance of VoidT. */
    public RetType forVoidT(VoidT that);

    /** Process an instance of TypeRef. */
    public RetType forTypeRef(TypeRef that);

    /** Process an instance of TypeQuery. */
    public RetType forTypeQuery(TypeQuery that);

    /** Process an instance of ObjectType. */
    public RetType forObjectType(ObjectType that);

    /** Process an instance of ArrayType. */
    public RetType forArrayType(ArrayType that);

    /** Process an instance of FunctionType. */
    public RetType forFunctionType(FunctionType that);

    /** Process an instance of ConstructorType. */
    public RetType forConstructorType(ConstructorType that);

    /** Process an instance of ExprType. */
    public RetType forExprType(ExprType that);

    /** Process an instance of PropertySig. */
    public RetType forPropertySig(PropertySig that);

    /** Process an instance of CallSig. */
    public RetType forCallSig(CallSig that);

    /** Process an instance of ConstructSig. */
    public RetType forConstructSig(ConstructSig that);

    /** Process an instance of IndexSig. */
    public RetType forIndexSig(IndexSig that);

    /** Process an instance of MethodSig. */
    public RetType forMethodSig(MethodSig that);

    /** Process an instance of TypeParam. */
    public RetType forTypeParam(TypeParam that);

    /** Process an instance of TopLevel. */
    public RetType forTopLevel(TopLevel that);

    /** Process an instance of Functional. */
    public RetType forFunctional(Functional that);

    /** Process an instance of ASTSpanInfo. */
    public RetType forASTSpanInfo(ASTSpanInfo that);

    /** Process an instance of PublicMod. */
    public RetType forPublicMod(PublicMod that);

    /** Process an instance of PrivateMod. */
    public RetType forPrivateMod(PrivateMod that);

    /** Process an instance of StaticMod. */
    public RetType forStaticMod(StaticMod that);
}
