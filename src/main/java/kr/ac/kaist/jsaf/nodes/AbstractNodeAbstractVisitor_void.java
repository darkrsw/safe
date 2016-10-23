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

/** An abstract implementation of a visitor over AbstractNode that does not return a value.
 ** This visitor implements the visitor interface with methods that each 
 ** delegate to a case representing their superclass.  At the top of this
 ** delegation tree is the method defaultCase(), which (unless overridden)
 ** is a no-op.
 **/
@SuppressWarnings("unused")
public class AbstractNodeAbstractVisitor_void extends AbstractNodeVisitorRunnable1 {
    /**
     * This method is run for all cases that are not handled elsewhere.
     * By default, it is a no-op; subclasses may override this behavior.
    **/
    public void defaultCase(AbstractNode that) {}

    /* Methods to visit an item. */
    public void forAbstractNode(AbstractNode that) {
        defaultCase(that);
    }

    public void forProgram(Program that) {
        forAbstractNode(that);
    }

    public void forSourceElement(SourceElement that) {
        forAbstractNode(that);
    }

    public void forModule(Module that) {
        forSourceElement(that);
    }

    public void forModDecl(ModDecl that) {
        forModule(that);
    }

    public void forModExport(ModExport that) {
        forModule(that);
    }

    public void forModExpVarStmt(ModExpVarStmt that) {
        forModExport(that);
    }

    public void forModExpFunDecl(ModExpFunDecl that) {
        forModExport(that);
    }

    public void forModExpGetter(ModExpGetter that) {
        forModExport(that);
    }

    public void forModExpSetter(ModExpSetter that) {
        forModExport(that);
    }

    public void forModExpSpecifiers(ModExpSpecifiers that) {
        forModExport(that);
    }

    public void forModExpAssignment(ModExpAssignment that) {
        forModExport(that);
    }

    public void forModImpDecl(ModImpDecl that) {
        forSourceElement(that);
    }

    public void forExtImpDecl(ExtImpDecl that) {
        forSourceElement(that);
    }

    public void forTSImpDecl(TSImpDecl that) {
        forSourceElement(that);
    }

    public void forIntfDecl(IntfDecl that) {
        forSourceElement(that);
    }

    public void forAmbDecl(AmbDecl that) {
        forSourceElement(that);
    }

    public void forAmbVarDecl(AmbVarDecl that) {
        forAmbDecl(that);
    }

    public void forAmbFunDecl(AmbFunDecl that) {
        forAmbDecl(that);
    }

    public void forAmbClsDecl(AmbClsDecl that) {
        forAmbDecl(that);
    }

    public void forAmbEnumDecl(AmbEnumDecl that) {
        forAmbDecl(that);
    }

    public void forAmbModDecl(AmbModDecl that) {
        forAmbDecl(that);
    }

    public void forAmbExtModDecl(AmbExtModDecl that) {
        forAmbDecl(that);
    }

    public void forStmt(Stmt that) {
        forSourceElement(that);
    }

    public void forNoOp(NoOp that) {
        forStmt(that);
    }

    public void forStmtUnit(StmtUnit that) {
        forStmt(that);
    }

    public void forFunDecl(FunDecl that) {
        forStmt(that);
    }

    public void forBlock(Block that) {
        forStmt(that);
    }

    public void forVarStmt(VarStmt that) {
        forStmt(that);
    }

    public void forEmptyStmt(EmptyStmt that) {
        forStmt(that);
    }

    public void forExprStmt(ExprStmt that) {
        forStmt(that);
    }

    public void forIf(If that) {
        forStmt(that);
    }

    public void forDoWhile(DoWhile that) {
        forStmt(that);
    }

    public void forWhile(While that) {
        forStmt(that);
    }

    public void forFor(For that) {
        forStmt(that);
    }

    public void forForIn(ForIn that) {
        forStmt(that);
    }

    public void forForVar(ForVar that) {
        forStmt(that);
    }

    public void forForVarIn(ForVarIn that) {
        forStmt(that);
    }

    public void forContinue(Continue that) {
        forStmt(that);
    }

    public void forBreak(Break that) {
        forStmt(that);
    }

    public void forReturn(Return that) {
        forStmt(that);
    }

    public void forWith(With that) {
        forStmt(that);
    }

    public void forSwitch(Switch that) {
        forStmt(that);
    }

    public void forLabelStmt(LabelStmt that) {
        forStmt(that);
    }

    public void forThrow(Throw that) {
        forStmt(that);
    }

    public void forTry(Try that) {
        forStmt(that);
    }

    public void forDebugger(Debugger that) {
        forStmt(that);
    }

    public void forSourceElements(SourceElements that) {
        forAbstractNode(that);
    }

    public void forVarDecl(VarDecl that) {
        forAbstractNode(that);
    }

    public void forCase(Case that) {
        forAbstractNode(that);
    }

    public void forCatch(Catch that) {
        forAbstractNode(that);
    }

    public void forModImport(ModImport that) {
        forAbstractNode(that);
    }

    public void forModImpSpecifierSet(ModImpSpecifierSet that) {
        forModImport(that);
    }

    public void forModImpAliasClause(ModImpAliasClause that) {
        forModImport(that);
    }

    public void forAmbClsElt(AmbClsElt that) {
        forAbstractNode(that);
    }

    public void forAmbCnstDecl(AmbCnstDecl that) {
        forAmbClsElt(that);
    }

    public void forAmbMemDecl(AmbMemDecl that) {
        forAmbClsElt(that);
    }

    public void forAmbIndDecl(AmbIndDecl that) {
        forAmbClsElt(that);
    }

    public void forAmbEnumMem(AmbEnumMem that) {
        forAbstractNode(that);
    }

    public void forAmbModElt(AmbModElt that) {
        forAbstractNode(that);
    }

    public void forAmbExtModElt(AmbExtModElt that) {
        forAbstractNode(that);
    }

    public void forExpr(Expr that) {
        forAbstractNode(that);
    }

    public void forExprList(ExprList that) {
        forExpr(that);
    }

    public void forCond(Cond that) {
        forExpr(that);
    }

    public void forInfixOpApp(InfixOpApp that) {
        forExpr(that);
    }

    public void forPrefixOpApp(PrefixOpApp that) {
        forExpr(that);
    }

    public void forUnaryAssignOpApp(UnaryAssignOpApp that) {
        forExpr(that);
    }

    public void forAssignOpApp(AssignOpApp that) {
        forExpr(that);
    }

    public void forLHS(LHS that) {
        forExpr(that);
    }

    public void forLiteral(Literal that) {
        forLHS(that);
    }

    public void forThis(This that) {
        forLiteral(that);
    }

    public void forNull(Null that) {
        forLiteral(that);
    }

    public void forBool(Bool that) {
        forLiteral(that);
    }

    public void forNumberLiteral(NumberLiteral that) {
        forLiteral(that);
    }

    public void forDoubleLiteral(DoubleLiteral that) {
        forNumberLiteral(that);
    }

    public void forIntLiteral(IntLiteral that) {
        forNumberLiteral(that);
    }

    public void forStringLiteral(StringLiteral that) {
        forLiteral(that);
    }

    public void forRegularExpression(RegularExpression that) {
        forLiteral(that);
    }

    public void forVarRef(VarRef that) {
        forLHS(that);
    }

    public void forArrayExpr(ArrayExpr that) {
        forLHS(that);
    }

    public void forArrayNumberExpr(ArrayNumberExpr that) {
        forLHS(that);
    }

    public void forObjectExpr(ObjectExpr that) {
        forLHS(that);
    }

    public void forParenthesized(Parenthesized that) {
        forLHS(that);
    }

    public void forFunExpr(FunExpr that) {
        forLHS(that);
    }

    public void forBracket(Bracket that) {
        forLHS(that);
    }

    public void forDot(Dot that) {
        forLHS(that);
    }

    public void forNew(New that) {
        forLHS(that);
    }

    public void forFunApp(FunApp that) {
        forLHS(that);
    }

    public void forProperty(Property that) {
        forAbstractNode(that);
    }

    public void forPropId(PropId that) {
        forProperty(that);
    }

    public void forPropStr(PropStr that) {
        forProperty(that);
    }

    public void forPropNum(PropNum that) {
        forProperty(that);
    }

    public void forMember(Member that) {
        forAbstractNode(that);
    }

    public void forField(Field that) {
        forMember(that);
    }

    public void forGetProp(GetProp that) {
        forMember(that);
    }

    public void forSetProp(SetProp that) {
        forMember(that);
    }

    public void forName(Name that) {
        forAbstractNode(that);
    }

    public void forIdOrOpOrAnonymousName(IdOrOpOrAnonymousName that) {
        forName(that);
    }

    public void forIdOrOp(IdOrOp that) {
        forIdOrOpOrAnonymousName(that);
    }

    public void forId(Id that) {
        forIdOrOp(that);
    }

    public void forOp(Op that) {
        forIdOrOp(that);
    }

    public void forTypeName(TypeName that) {
        forIdOrOp(that);
    }

    public void forAnonymousFnName(AnonymousFnName that) {
        forIdOrOpOrAnonymousName(that);
    }

    public void forPath(Path that) {
        forName(that);
    }

    public void forModExpSpecifier(ModExpSpecifier that) {
        forName(that);
    }

    public void forModExpStarFromPath(ModExpStarFromPath that) {
        forModExpSpecifier(that);
    }

    public void forModExpStar(ModExpStar that) {
        forModExpSpecifier(that);
    }

    public void forModExpAlias(ModExpAlias that) {
        forModExpSpecifier(that);
    }

    public void forModExpName(ModExpName that) {
        forModExpSpecifier(that);
    }

    public void forModImpSpecifier(ModImpSpecifier that) {
        forName(that);
    }

    public void forModImpAlias(ModImpAlias that) {
        forModImpSpecifier(that);
    }

    public void forModImpName(ModImpName that) {
        forModImpSpecifier(that);
    }

    public void forLabel(Label that) {
        forAbstractNode(that);
    }

    public void forComment(Comment that) {
        forAbstractNode(that);
    }

    public void forParam(Param that) {
        forAbstractNode(that);
    }

    public void forType(Type that) {
        forAbstractNode(that);
    }

    public void forPredefType(PredefType that) {
        forType(that);
    }

    public void forAnyT(AnyT that) {
        forPredefType(that);
    }

    public void forNumberT(NumberT that) {
        forPredefType(that);
    }

    public void forBoolT(BoolT that) {
        forPredefType(that);
    }

    public void forStringT(StringT that) {
        forPredefType(that);
    }

    public void forVoidT(VoidT that) {
        forPredefType(that);
    }

    public void forTypeRef(TypeRef that) {
        forType(that);
    }

    public void forTypeQuery(TypeQuery that) {
        forType(that);
    }

    public void forTypeLiteral(TypeLiteral that) {
        forType(that);
    }

    public void forObjectType(ObjectType that) {
        forTypeLiteral(that);
    }

    public void forArrayType(ArrayType that) {
        forTypeLiteral(that);
    }

    public void forFunctionType(FunctionType that) {
        forTypeLiteral(that);
    }

    public void forConstructorType(ConstructorType that) {
        forTypeLiteral(that);
    }

    public void forExprType(ExprType that) {
        forType(that);
    }

    public void forTypeMember(TypeMember that) {
        forType(that);
    }

    public void forPropertySig(PropertySig that) {
        forTypeMember(that);
    }

    public void forCallSig(CallSig that) {
        forTypeMember(that);
    }

    public void forConstructSig(ConstructSig that) {
        forTypeMember(that);
    }

    public void forIndexSig(IndexSig that) {
        forTypeMember(that);
    }

    public void forMethodSig(MethodSig that) {
        forTypeMember(that);
    }

    public void forTypeParam(TypeParam that) {
        forAbstractNode(that);
    }

}
