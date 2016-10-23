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

/** A parametric abstract implementation of a visitor over AbstractNode that return a value.
 ** This visitor implements the visitor interface with methods that each 
 ** delegate to a case representing their superclass.  At the top of this
 ** delegation tree is the method defaultCase(), which (unless overridden)
 ** throws an exception.
 **/
@SuppressWarnings("unused")
public abstract class AbstractNodeAbstractVisitor<RetType>  extends AbstractNodeVisitorLambda<RetType> {
    /**
     * This method is run for all cases that are not handled elsewhere.
     * By default, an exception is thrown; subclasses may override this behavior.
     * @throws IllegalArgumentException
    **/
    public RetType defaultCase(AbstractNode that) {
        throw new IllegalArgumentException("Visitor " + getClass().getName() + " does not support visiting values of type " + that.getClass().getName());
    }

    /* Methods to visit an item. */
    public RetType forAbstractNode(AbstractNode that) {
        return defaultCase(that);
    }

    public RetType forProgram(Program that) {
        return forAbstractNode(that);
    }

    public RetType forSourceElement(SourceElement that) {
        return forAbstractNode(that);
    }

    public RetType forModule(Module that) {
        return forSourceElement(that);
    }

    public RetType forModDecl(ModDecl that) {
        return forModule(that);
    }

    public RetType forModExport(ModExport that) {
        return forModule(that);
    }

    public RetType forModExpVarStmt(ModExpVarStmt that) {
        return forModExport(that);
    }

    public RetType forModExpFunDecl(ModExpFunDecl that) {
        return forModExport(that);
    }

    public RetType forModExpGetter(ModExpGetter that) {
        return forModExport(that);
    }

    public RetType forModExpSetter(ModExpSetter that) {
        return forModExport(that);
    }

    public RetType forModExpSpecifiers(ModExpSpecifiers that) {
        return forModExport(that);
    }

    public RetType forModExpAssignment(ModExpAssignment that) {
        return forModExport(that);
    }

    public RetType forModImpDecl(ModImpDecl that) {
        return forSourceElement(that);
    }

    public RetType forExtImpDecl(ExtImpDecl that) {
        return forSourceElement(that);
    }

    public RetType forTSImpDecl(TSImpDecl that) {
        return forSourceElement(that);
    }

    public RetType forIntfDecl(IntfDecl that) {
        return forSourceElement(that);
    }

    public RetType forAmbDecl(AmbDecl that) {
        return forSourceElement(that);
    }

    public RetType forAmbVarDecl(AmbVarDecl that) {
        return forAmbDecl(that);
    }

    public RetType forAmbFunDecl(AmbFunDecl that) {
        return forAmbDecl(that);
    }

    public RetType forAmbClsDecl(AmbClsDecl that) {
        return forAmbDecl(that);
    }

    public RetType forAmbEnumDecl(AmbEnumDecl that) {
        return forAmbDecl(that);
    }

    public RetType forAmbModDecl(AmbModDecl that) {
        return forAmbDecl(that);
    }

    public RetType forAmbExtModDecl(AmbExtModDecl that) {
        return forAmbDecl(that);
    }

    public RetType forStmt(Stmt that) {
        return forSourceElement(that);
    }

    public RetType forNoOp(NoOp that) {
        return forStmt(that);
    }

    public RetType forStmtUnit(StmtUnit that) {
        return forStmt(that);
    }

    public RetType forFunDecl(FunDecl that) {
        return forStmt(that);
    }

    public RetType forBlock(Block that) {
        return forStmt(that);
    }

    public RetType forVarStmt(VarStmt that) {
        return forStmt(that);
    }

    public RetType forEmptyStmt(EmptyStmt that) {
        return forStmt(that);
    }

    public RetType forExprStmt(ExprStmt that) {
        return forStmt(that);
    }

    public RetType forIf(If that) {
        return forStmt(that);
    }

    public RetType forDoWhile(DoWhile that) {
        return forStmt(that);
    }

    public RetType forWhile(While that) {
        return forStmt(that);
    }

    public RetType forFor(For that) {
        return forStmt(that);
    }

    public RetType forForIn(ForIn that) {
        return forStmt(that);
    }

    public RetType forForVar(ForVar that) {
        return forStmt(that);
    }

    public RetType forForVarIn(ForVarIn that) {
        return forStmt(that);
    }

    public RetType forContinue(Continue that) {
        return forStmt(that);
    }

    public RetType forBreak(Break that) {
        return forStmt(that);
    }

    public RetType forReturn(Return that) {
        return forStmt(that);
    }

    public RetType forWith(With that) {
        return forStmt(that);
    }

    public RetType forSwitch(Switch that) {
        return forStmt(that);
    }

    public RetType forLabelStmt(LabelStmt that) {
        return forStmt(that);
    }

    public RetType forThrow(Throw that) {
        return forStmt(that);
    }

    public RetType forTry(Try that) {
        return forStmt(that);
    }

    public RetType forDebugger(Debugger that) {
        return forStmt(that);
    }

    public RetType forSourceElements(SourceElements that) {
        return forAbstractNode(that);
    }

    public RetType forVarDecl(VarDecl that) {
        return forAbstractNode(that);
    }

    public RetType forCase(Case that) {
        return forAbstractNode(that);
    }

    public RetType forCatch(Catch that) {
        return forAbstractNode(that);
    }

    public RetType forModImport(ModImport that) {
        return forAbstractNode(that);
    }

    public RetType forModImpSpecifierSet(ModImpSpecifierSet that) {
        return forModImport(that);
    }

    public RetType forModImpAliasClause(ModImpAliasClause that) {
        return forModImport(that);
    }

    public RetType forAmbClsElt(AmbClsElt that) {
        return forAbstractNode(that);
    }

    public RetType forAmbCnstDecl(AmbCnstDecl that) {
        return forAmbClsElt(that);
    }

    public RetType forAmbMemDecl(AmbMemDecl that) {
        return forAmbClsElt(that);
    }

    public RetType forAmbIndDecl(AmbIndDecl that) {
        return forAmbClsElt(that);
    }

    public RetType forAmbEnumMem(AmbEnumMem that) {
        return forAbstractNode(that);
    }

    public RetType forAmbModElt(AmbModElt that) {
        return forAbstractNode(that);
    }

    public RetType forAmbExtModElt(AmbExtModElt that) {
        return forAbstractNode(that);
    }

    public RetType forExpr(Expr that) {
        return forAbstractNode(that);
    }

    public RetType forExprList(ExprList that) {
        return forExpr(that);
    }

    public RetType forCond(Cond that) {
        return forExpr(that);
    }

    public RetType forInfixOpApp(InfixOpApp that) {
        return forExpr(that);
    }

    public RetType forPrefixOpApp(PrefixOpApp that) {
        return forExpr(that);
    }

    public RetType forUnaryAssignOpApp(UnaryAssignOpApp that) {
        return forExpr(that);
    }

    public RetType forAssignOpApp(AssignOpApp that) {
        return forExpr(that);
    }

    public RetType forLHS(LHS that) {
        return forExpr(that);
    }

    public RetType forLiteral(Literal that) {
        return forLHS(that);
    }

    public RetType forThis(This that) {
        return forLiteral(that);
    }

    public RetType forNull(Null that) {
        return forLiteral(that);
    }

    public RetType forBool(Bool that) {
        return forLiteral(that);
    }

    public RetType forNumberLiteral(NumberLiteral that) {
        return forLiteral(that);
    }

    public RetType forDoubleLiteral(DoubleLiteral that) {
        return forNumberLiteral(that);
    }

    public RetType forIntLiteral(IntLiteral that) {
        return forNumberLiteral(that);
    }

    public RetType forStringLiteral(StringLiteral that) {
        return forLiteral(that);
    }

    public RetType forRegularExpression(RegularExpression that) {
        return forLiteral(that);
    }

    public RetType forVarRef(VarRef that) {
        return forLHS(that);
    }

    public RetType forArrayExpr(ArrayExpr that) {
        return forLHS(that);
    }

    public RetType forArrayNumberExpr(ArrayNumberExpr that) {
        return forLHS(that);
    }

    public RetType forObjectExpr(ObjectExpr that) {
        return forLHS(that);
    }

    public RetType forParenthesized(Parenthesized that) {
        return forLHS(that);
    }

    public RetType forFunExpr(FunExpr that) {
        return forLHS(that);
    }

    public RetType forBracket(Bracket that) {
        return forLHS(that);
    }

    public RetType forDot(Dot that) {
        return forLHS(that);
    }

    public RetType forNew(New that) {
        return forLHS(that);
    }

    public RetType forFunApp(FunApp that) {
        return forLHS(that);
    }

    public RetType forProperty(Property that) {
        return forAbstractNode(that);
    }

    public RetType forPropId(PropId that) {
        return forProperty(that);
    }

    public RetType forPropStr(PropStr that) {
        return forProperty(that);
    }

    public RetType forPropNum(PropNum that) {
        return forProperty(that);
    }

    public RetType forMember(Member that) {
        return forAbstractNode(that);
    }

    public RetType forField(Field that) {
        return forMember(that);
    }

    public RetType forGetProp(GetProp that) {
        return forMember(that);
    }

    public RetType forSetProp(SetProp that) {
        return forMember(that);
    }

    public RetType forName(Name that) {
        return forAbstractNode(that);
    }

    public RetType forIdOrOpOrAnonymousName(IdOrOpOrAnonymousName that) {
        return forName(that);
    }

    public RetType forIdOrOp(IdOrOp that) {
        return forIdOrOpOrAnonymousName(that);
    }

    public RetType forId(Id that) {
        return forIdOrOp(that);
    }

    public RetType forOp(Op that) {
        return forIdOrOp(that);
    }

    public RetType forTypeName(TypeName that) {
        return forIdOrOp(that);
    }

    public RetType forAnonymousFnName(AnonymousFnName that) {
        return forIdOrOpOrAnonymousName(that);
    }

    public RetType forPath(Path that) {
        return forName(that);
    }

    public RetType forModExpSpecifier(ModExpSpecifier that) {
        return forName(that);
    }

    public RetType forModExpStarFromPath(ModExpStarFromPath that) {
        return forModExpSpecifier(that);
    }

    public RetType forModExpStar(ModExpStar that) {
        return forModExpSpecifier(that);
    }

    public RetType forModExpAlias(ModExpAlias that) {
        return forModExpSpecifier(that);
    }

    public RetType forModExpName(ModExpName that) {
        return forModExpSpecifier(that);
    }

    public RetType forModImpSpecifier(ModImpSpecifier that) {
        return forName(that);
    }

    public RetType forModImpAlias(ModImpAlias that) {
        return forModImpSpecifier(that);
    }

    public RetType forModImpName(ModImpName that) {
        return forModImpSpecifier(that);
    }

    public RetType forLabel(Label that) {
        return forAbstractNode(that);
    }

    public RetType forComment(Comment that) {
        return forAbstractNode(that);
    }

    public RetType forParam(Param that) {
        return forAbstractNode(that);
    }

    public RetType forType(Type that) {
        return forAbstractNode(that);
    }

    public RetType forPredefType(PredefType that) {
        return forType(that);
    }

    public RetType forAnyT(AnyT that) {
        return forPredefType(that);
    }

    public RetType forNumberT(NumberT that) {
        return forPredefType(that);
    }

    public RetType forBoolT(BoolT that) {
        return forPredefType(that);
    }

    public RetType forStringT(StringT that) {
        return forPredefType(that);
    }

    public RetType forVoidT(VoidT that) {
        return forPredefType(that);
    }

    public RetType forTypeRef(TypeRef that) {
        return forType(that);
    }

    public RetType forTypeQuery(TypeQuery that) {
        return forType(that);
    }

    public RetType forTypeLiteral(TypeLiteral that) {
        return forType(that);
    }

    public RetType forObjectType(ObjectType that) {
        return forTypeLiteral(that);
    }

    public RetType forArrayType(ArrayType that) {
        return forTypeLiteral(that);
    }

    public RetType forFunctionType(FunctionType that) {
        return forTypeLiteral(that);
    }

    public RetType forConstructorType(ConstructorType that) {
        return forTypeLiteral(that);
    }

    public RetType forExprType(ExprType that) {
        return forType(that);
    }

    public RetType forTypeMember(TypeMember that) {
        return forType(that);
    }

    public RetType forPropertySig(PropertySig that) {
        return forTypeMember(that);
    }

    public RetType forCallSig(CallSig that) {
        return forTypeMember(that);
    }

    public RetType forConstructSig(ConstructSig that) {
        return forTypeMember(that);
    }

    public RetType forIndexSig(IndexSig that) {
        return forTypeMember(that);
    }

    public RetType forMethodSig(MethodSig that) {
        return forTypeMember(that);
    }

    public RetType forTypeParam(TypeParam that) {
        return forAbstractNode(that);
    }


}
