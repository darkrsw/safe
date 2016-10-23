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

/** An abstract visitor over Node that provides a lambda value method;
  * all visit methods are left unimplemented. */
@SuppressWarnings("unused")
public abstract class NodeVisitorLambda<RetType> implements edu.rice.cs.plt.lambda.Lambda<Node, RetType>, NodeVisitor<RetType> {

    public RetType value(Node that) {
        return that.accept(this);
    }


    /** Process an instance of Program. */
    public abstract RetType forProgram(Program that);

    /** Process an instance of ModDecl. */
    public abstract RetType forModDecl(ModDecl that);

    /** Process an instance of ModExpVarStmt. */
    public abstract RetType forModExpVarStmt(ModExpVarStmt that);

    /** Process an instance of ModExpFunDecl. */
    public abstract RetType forModExpFunDecl(ModExpFunDecl that);

    /** Process an instance of ModExpGetter. */
    public abstract RetType forModExpGetter(ModExpGetter that);

    /** Process an instance of ModExpSetter. */
    public abstract RetType forModExpSetter(ModExpSetter that);

    /** Process an instance of ModExpSpecifiers. */
    public abstract RetType forModExpSpecifiers(ModExpSpecifiers that);

    /** Process an instance of ModExpAssignment. */
    public abstract RetType forModExpAssignment(ModExpAssignment that);

    /** Process an instance of ModImpDecl. */
    public abstract RetType forModImpDecl(ModImpDecl that);

    /** Process an instance of ExtImpDecl. */
    public abstract RetType forExtImpDecl(ExtImpDecl that);

    /** Process an instance of TSImpDecl. */
    public abstract RetType forTSImpDecl(TSImpDecl that);

    /** Process an instance of IntfDecl. */
    public abstract RetType forIntfDecl(IntfDecl that);

    /** Process an instance of AmbVarDecl. */
    public abstract RetType forAmbVarDecl(AmbVarDecl that);

    /** Process an instance of AmbFunDecl. */
    public abstract RetType forAmbFunDecl(AmbFunDecl that);

    /** Process an instance of AmbClsDecl. */
    public abstract RetType forAmbClsDecl(AmbClsDecl that);

    /** Process an instance of AmbEnumDecl. */
    public abstract RetType forAmbEnumDecl(AmbEnumDecl that);

    /** Process an instance of AmbModDecl. */
    public abstract RetType forAmbModDecl(AmbModDecl that);

    /** Process an instance of AmbExtModDecl. */
    public abstract RetType forAmbExtModDecl(AmbExtModDecl that);

    /** Process an instance of NoOp. */
    public abstract RetType forNoOp(NoOp that);

    /** Process an instance of StmtUnit. */
    public abstract RetType forStmtUnit(StmtUnit that);

    /** Process an instance of FunDecl. */
    public abstract RetType forFunDecl(FunDecl that);

    /** Process an instance of Block. */
    public abstract RetType forBlock(Block that);

    /** Process an instance of VarStmt. */
    public abstract RetType forVarStmt(VarStmt that);

    /** Process an instance of EmptyStmt. */
    public abstract RetType forEmptyStmt(EmptyStmt that);

    /** Process an instance of ExprStmt. */
    public abstract RetType forExprStmt(ExprStmt that);

    /** Process an instance of If. */
    public abstract RetType forIf(If that);

    /** Process an instance of DoWhile. */
    public abstract RetType forDoWhile(DoWhile that);

    /** Process an instance of While. */
    public abstract RetType forWhile(While that);

    /** Process an instance of For. */
    public abstract RetType forFor(For that);

    /** Process an instance of ForIn. */
    public abstract RetType forForIn(ForIn that);

    /** Process an instance of ForVar. */
    public abstract RetType forForVar(ForVar that);

    /** Process an instance of ForVarIn. */
    public abstract RetType forForVarIn(ForVarIn that);

    /** Process an instance of Continue. */
    public abstract RetType forContinue(Continue that);

    /** Process an instance of Break. */
    public abstract RetType forBreak(Break that);

    /** Process an instance of Return. */
    public abstract RetType forReturn(Return that);

    /** Process an instance of With. */
    public abstract RetType forWith(With that);

    /** Process an instance of Switch. */
    public abstract RetType forSwitch(Switch that);

    /** Process an instance of LabelStmt. */
    public abstract RetType forLabelStmt(LabelStmt that);

    /** Process an instance of Throw. */
    public abstract RetType forThrow(Throw that);

    /** Process an instance of Try. */
    public abstract RetType forTry(Try that);

    /** Process an instance of Debugger. */
    public abstract RetType forDebugger(Debugger that);

    /** Process an instance of SourceElements. */
    public abstract RetType forSourceElements(SourceElements that);

    /** Process an instance of VarDecl. */
    public abstract RetType forVarDecl(VarDecl that);

    /** Process an instance of Case. */
    public abstract RetType forCase(Case that);

    /** Process an instance of Catch. */
    public abstract RetType forCatch(Catch that);

    /** Process an instance of ModImpSpecifierSet. */
    public abstract RetType forModImpSpecifierSet(ModImpSpecifierSet that);

    /** Process an instance of ModImpAliasClause. */
    public abstract RetType forModImpAliasClause(ModImpAliasClause that);

    /** Process an instance of AmbCnstDecl. */
    public abstract RetType forAmbCnstDecl(AmbCnstDecl that);

    /** Process an instance of AmbMemDecl. */
    public abstract RetType forAmbMemDecl(AmbMemDecl that);

    /** Process an instance of AmbIndDecl. */
    public abstract RetType forAmbIndDecl(AmbIndDecl that);

    /** Process an instance of AmbEnumMem. */
    public abstract RetType forAmbEnumMem(AmbEnumMem that);

    /** Process an instance of AmbModElt. */
    public abstract RetType forAmbModElt(AmbModElt that);

    /** Process an instance of AmbExtModElt. */
    public abstract RetType forAmbExtModElt(AmbExtModElt that);

    /** Process an instance of ExprList. */
    public abstract RetType forExprList(ExprList that);

    /** Process an instance of Cond. */
    public abstract RetType forCond(Cond that);

    /** Process an instance of InfixOpApp. */
    public abstract RetType forInfixOpApp(InfixOpApp that);

    /** Process an instance of PrefixOpApp. */
    public abstract RetType forPrefixOpApp(PrefixOpApp that);

    /** Process an instance of UnaryAssignOpApp. */
    public abstract RetType forUnaryAssignOpApp(UnaryAssignOpApp that);

    /** Process an instance of AssignOpApp. */
    public abstract RetType forAssignOpApp(AssignOpApp that);

    /** Process an instance of This. */
    public abstract RetType forThis(This that);

    /** Process an instance of Null. */
    public abstract RetType forNull(Null that);

    /** Process an instance of Bool. */
    public abstract RetType forBool(Bool that);

    /** Process an instance of DoubleLiteral. */
    public abstract RetType forDoubleLiteral(DoubleLiteral that);

    /** Process an instance of IntLiteral. */
    public abstract RetType forIntLiteral(IntLiteral that);

    /** Process an instance of StringLiteral. */
    public abstract RetType forStringLiteral(StringLiteral that);

    /** Process an instance of RegularExpression. */
    public abstract RetType forRegularExpression(RegularExpression that);

    /** Process an instance of VarRef. */
    public abstract RetType forVarRef(VarRef that);

    /** Process an instance of ArrayExpr. */
    public abstract RetType forArrayExpr(ArrayExpr that);

    /** Process an instance of ArrayNumberExpr. */
    public abstract RetType forArrayNumberExpr(ArrayNumberExpr that);

    /** Process an instance of ObjectExpr. */
    public abstract RetType forObjectExpr(ObjectExpr that);

    /** Process an instance of Parenthesized. */
    public abstract RetType forParenthesized(Parenthesized that);

    /** Process an instance of FunExpr. */
    public abstract RetType forFunExpr(FunExpr that);

    /** Process an instance of Bracket. */
    public abstract RetType forBracket(Bracket that);

    /** Process an instance of Dot. */
    public abstract RetType forDot(Dot that);

    /** Process an instance of New. */
    public abstract RetType forNew(New that);

    /** Process an instance of FunApp. */
    public abstract RetType forFunApp(FunApp that);

    /** Process an instance of PropId. */
    public abstract RetType forPropId(PropId that);

    /** Process an instance of PropStr. */
    public abstract RetType forPropStr(PropStr that);

    /** Process an instance of PropNum. */
    public abstract RetType forPropNum(PropNum that);

    /** Process an instance of Field. */
    public abstract RetType forField(Field that);

    /** Process an instance of GetProp. */
    public abstract RetType forGetProp(GetProp that);

    /** Process an instance of SetProp. */
    public abstract RetType forSetProp(SetProp that);

    /** Process an instance of Id. */
    public abstract RetType forId(Id that);

    /** Process an instance of Op. */
    public abstract RetType forOp(Op that);

    /** Process an instance of TypeName. */
    public abstract RetType forTypeName(TypeName that);

    /** Process an instance of AnonymousFnName. */
    public abstract RetType forAnonymousFnName(AnonymousFnName that);

    /** Process an instance of Path. */
    public abstract RetType forPath(Path that);

    /** Process an instance of ModExpStarFromPath. */
    public abstract RetType forModExpStarFromPath(ModExpStarFromPath that);

    /** Process an instance of ModExpStar. */
    public abstract RetType forModExpStar(ModExpStar that);

    /** Process an instance of ModExpAlias. */
    public abstract RetType forModExpAlias(ModExpAlias that);

    /** Process an instance of ModExpName. */
    public abstract RetType forModExpName(ModExpName that);

    /** Process an instance of ModImpAlias. */
    public abstract RetType forModImpAlias(ModImpAlias that);

    /** Process an instance of ModImpName. */
    public abstract RetType forModImpName(ModImpName that);

    /** Process an instance of Label. */
    public abstract RetType forLabel(Label that);

    /** Process an instance of Comment. */
    public abstract RetType forComment(Comment that);

    /** Process an instance of Param. */
    public abstract RetType forParam(Param that);

    /** Process an instance of AnyT. */
    public abstract RetType forAnyT(AnyT that);

    /** Process an instance of NumberT. */
    public abstract RetType forNumberT(NumberT that);

    /** Process an instance of BoolT. */
    public abstract RetType forBoolT(BoolT that);

    /** Process an instance of StringT. */
    public abstract RetType forStringT(StringT that);

    /** Process an instance of VoidT. */
    public abstract RetType forVoidT(VoidT that);

    /** Process an instance of TypeRef. */
    public abstract RetType forTypeRef(TypeRef that);

    /** Process an instance of TypeQuery. */
    public abstract RetType forTypeQuery(TypeQuery that);

    /** Process an instance of ObjectType. */
    public abstract RetType forObjectType(ObjectType that);

    /** Process an instance of ArrayType. */
    public abstract RetType forArrayType(ArrayType that);

    /** Process an instance of FunctionType. */
    public abstract RetType forFunctionType(FunctionType that);

    /** Process an instance of ConstructorType. */
    public abstract RetType forConstructorType(ConstructorType that);

    /** Process an instance of ExprType. */
    public abstract RetType forExprType(ExprType that);

    /** Process an instance of PropertySig. */
    public abstract RetType forPropertySig(PropertySig that);

    /** Process an instance of CallSig. */
    public abstract RetType forCallSig(CallSig that);

    /** Process an instance of ConstructSig. */
    public abstract RetType forConstructSig(ConstructSig that);

    /** Process an instance of IndexSig. */
    public abstract RetType forIndexSig(IndexSig that);

    /** Process an instance of MethodSig. */
    public abstract RetType forMethodSig(MethodSig that);

    /** Process an instance of TypeParam. */
    public abstract RetType forTypeParam(TypeParam that);

    /** Process an instance of TopLevel. */
    public abstract RetType forTopLevel(TopLevel that);

    /** Process an instance of Functional. */
    public abstract RetType forFunctional(Functional that);

    /** Process an instance of ASTSpanInfo. */
    public abstract RetType forASTSpanInfo(ASTSpanInfo that);

    /** Process an instance of PublicMod. */
    public abstract RetType forPublicMod(PublicMod that);

    /** Process an instance of PrivateMod. */
    public abstract RetType forPrivateMod(PrivateMod that);

    /** Process an instance of StaticMod. */
    public abstract RetType forStaticMod(StaticMod that);
}
