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
 ** This visitor implements the visitor interface with methods that 
 ** first call forCASEDoFirst(), second visit the children, and finally 
 ** call forCASEOnly().  (CASE is replaced by the case name.)
 ** By default, each of forCASEDoFirst and forCASEOnly delegates
 ** to a more general case.  At the top of this delegation tree are
 ** defaultDoFirst() and defaultCase(), respectively, which (unless
 ** overridden) are no-ops.
 **/
@SuppressWarnings("unused")
public class AbstractNodeDepthFirstVisitor_void extends AbstractNodeVisitorRunnable1 {
    /**
     * This method is run for all cases that are not handled elsewhere.
     * By default, it is a no-op; subclasses may override this behavior.
    **/
    public void defaultCase(AbstractNode that) {}


    /**
     * This method is run for all DoFirst cases that are not handled elsewhere.
     * By default, it is a no-op; subclasses may override this behavior.
    **/
    public void defaultDoFirst(AbstractNode that) {}

    /* Methods to handle a node before recursion. */
    public void forAbstractNodeDoFirst(AbstractNode that) {
        defaultDoFirst(that);
    }

    public void forProgramDoFirst(Program that) {
        forAbstractNodeDoFirst(that);
    }

    public void forSourceElementDoFirst(SourceElement that) {
        forAbstractNodeDoFirst(that);
    }

    public void forModuleDoFirst(Module that) {
        forSourceElementDoFirst(that);
    }

    public void forModDeclDoFirst(ModDecl that) {
        forModuleDoFirst(that);
    }

    public void forModExportDoFirst(ModExport that) {
        forModuleDoFirst(that);
    }

    public void forModExpVarStmtDoFirst(ModExpVarStmt that) {
        forModExportDoFirst(that);
    }

    public void forModExpFunDeclDoFirst(ModExpFunDecl that) {
        forModExportDoFirst(that);
    }

    public void forModExpGetterDoFirst(ModExpGetter that) {
        forModExportDoFirst(that);
    }

    public void forModExpSetterDoFirst(ModExpSetter that) {
        forModExportDoFirst(that);
    }

    public void forModExpSpecifiersDoFirst(ModExpSpecifiers that) {
        forModExportDoFirst(that);
    }

    public void forModExpAssignmentDoFirst(ModExpAssignment that) {
        forModExportDoFirst(that);
    }

    public void forModImpDeclDoFirst(ModImpDecl that) {
        forSourceElementDoFirst(that);
    }

    public void forExtImpDeclDoFirst(ExtImpDecl that) {
        forSourceElementDoFirst(that);
    }

    public void forTSImpDeclDoFirst(TSImpDecl that) {
        forSourceElementDoFirst(that);
    }

    public void forIntfDeclDoFirst(IntfDecl that) {
        forSourceElementDoFirst(that);
    }

    public void forAmbDeclDoFirst(AmbDecl that) {
        forSourceElementDoFirst(that);
    }

    public void forAmbVarDeclDoFirst(AmbVarDecl that) {
        forAmbDeclDoFirst(that);
    }

    public void forAmbFunDeclDoFirst(AmbFunDecl that) {
        forAmbDeclDoFirst(that);
    }

    public void forAmbClsDeclDoFirst(AmbClsDecl that) {
        forAmbDeclDoFirst(that);
    }

    public void forAmbEnumDeclDoFirst(AmbEnumDecl that) {
        forAmbDeclDoFirst(that);
    }

    public void forAmbModDeclDoFirst(AmbModDecl that) {
        forAmbDeclDoFirst(that);
    }

    public void forAmbExtModDeclDoFirst(AmbExtModDecl that) {
        forAmbDeclDoFirst(that);
    }

    public void forStmtDoFirst(Stmt that) {
        forSourceElementDoFirst(that);
    }

    public void forNoOpDoFirst(NoOp that) {
        forStmtDoFirst(that);
    }

    public void forStmtUnitDoFirst(StmtUnit that) {
        forStmtDoFirst(that);
    }

    public void forFunDeclDoFirst(FunDecl that) {
        forStmtDoFirst(that);
    }

    public void forBlockDoFirst(Block that) {
        forStmtDoFirst(that);
    }

    public void forVarStmtDoFirst(VarStmt that) {
        forStmtDoFirst(that);
    }

    public void forEmptyStmtDoFirst(EmptyStmt that) {
        forStmtDoFirst(that);
    }

    public void forExprStmtDoFirst(ExprStmt that) {
        forStmtDoFirst(that);
    }

    public void forIfDoFirst(If that) {
        forStmtDoFirst(that);
    }

    public void forDoWhileDoFirst(DoWhile that) {
        forStmtDoFirst(that);
    }

    public void forWhileDoFirst(While that) {
        forStmtDoFirst(that);
    }

    public void forForDoFirst(For that) {
        forStmtDoFirst(that);
    }

    public void forForInDoFirst(ForIn that) {
        forStmtDoFirst(that);
    }

    public void forForVarDoFirst(ForVar that) {
        forStmtDoFirst(that);
    }

    public void forForVarInDoFirst(ForVarIn that) {
        forStmtDoFirst(that);
    }

    public void forContinueDoFirst(Continue that) {
        forStmtDoFirst(that);
    }

    public void forBreakDoFirst(Break that) {
        forStmtDoFirst(that);
    }

    public void forReturnDoFirst(Return that) {
        forStmtDoFirst(that);
    }

    public void forWithDoFirst(With that) {
        forStmtDoFirst(that);
    }

    public void forSwitchDoFirst(Switch that) {
        forStmtDoFirst(that);
    }

    public void forLabelStmtDoFirst(LabelStmt that) {
        forStmtDoFirst(that);
    }

    public void forThrowDoFirst(Throw that) {
        forStmtDoFirst(that);
    }

    public void forTryDoFirst(Try that) {
        forStmtDoFirst(that);
    }

    public void forDebuggerDoFirst(Debugger that) {
        forStmtDoFirst(that);
    }

    public void forSourceElementsDoFirst(SourceElements that) {
        forAbstractNodeDoFirst(that);
    }

    public void forVarDeclDoFirst(VarDecl that) {
        forAbstractNodeDoFirst(that);
    }

    public void forCaseDoFirst(Case that) {
        forAbstractNodeDoFirst(that);
    }

    public void forCatchDoFirst(Catch that) {
        forAbstractNodeDoFirst(that);
    }

    public void forModImportDoFirst(ModImport that) {
        forAbstractNodeDoFirst(that);
    }

    public void forModImpSpecifierSetDoFirst(ModImpSpecifierSet that) {
        forModImportDoFirst(that);
    }

    public void forModImpAliasClauseDoFirst(ModImpAliasClause that) {
        forModImportDoFirst(that);
    }

    public void forAmbClsEltDoFirst(AmbClsElt that) {
        forAbstractNodeDoFirst(that);
    }

    public void forAmbCnstDeclDoFirst(AmbCnstDecl that) {
        forAmbClsEltDoFirst(that);
    }

    public void forAmbMemDeclDoFirst(AmbMemDecl that) {
        forAmbClsEltDoFirst(that);
    }

    public void forAmbIndDeclDoFirst(AmbIndDecl that) {
        forAmbClsEltDoFirst(that);
    }

    public void forAmbEnumMemDoFirst(AmbEnumMem that) {
        forAbstractNodeDoFirst(that);
    }

    public void forAmbModEltDoFirst(AmbModElt that) {
        forAbstractNodeDoFirst(that);
    }

    public void forAmbExtModEltDoFirst(AmbExtModElt that) {
        forAbstractNodeDoFirst(that);
    }

    public void forExprDoFirst(Expr that) {
        forAbstractNodeDoFirst(that);
    }

    public void forExprListDoFirst(ExprList that) {
        forExprDoFirst(that);
    }

    public void forCondDoFirst(Cond that) {
        forExprDoFirst(that);
    }

    public void forInfixOpAppDoFirst(InfixOpApp that) {
        forExprDoFirst(that);
    }

    public void forPrefixOpAppDoFirst(PrefixOpApp that) {
        forExprDoFirst(that);
    }

    public void forUnaryAssignOpAppDoFirst(UnaryAssignOpApp that) {
        forExprDoFirst(that);
    }

    public void forAssignOpAppDoFirst(AssignOpApp that) {
        forExprDoFirst(that);
    }

    public void forLHSDoFirst(LHS that) {
        forExprDoFirst(that);
    }

    public void forLiteralDoFirst(Literal that) {
        forLHSDoFirst(that);
    }

    public void forThisDoFirst(This that) {
        forLiteralDoFirst(that);
    }

    public void forNullDoFirst(Null that) {
        forLiteralDoFirst(that);
    }

    public void forBoolDoFirst(Bool that) {
        forLiteralDoFirst(that);
    }

    public void forNumberLiteralDoFirst(NumberLiteral that) {
        forLiteralDoFirst(that);
    }

    public void forDoubleLiteralDoFirst(DoubleLiteral that) {
        forNumberLiteralDoFirst(that);
    }

    public void forIntLiteralDoFirst(IntLiteral that) {
        forNumberLiteralDoFirst(that);
    }

    public void forStringLiteralDoFirst(StringLiteral that) {
        forLiteralDoFirst(that);
    }

    public void forRegularExpressionDoFirst(RegularExpression that) {
        forLiteralDoFirst(that);
    }

    public void forVarRefDoFirst(VarRef that) {
        forLHSDoFirst(that);
    }

    public void forArrayExprDoFirst(ArrayExpr that) {
        forLHSDoFirst(that);
    }

    public void forArrayNumberExprDoFirst(ArrayNumberExpr that) {
        forLHSDoFirst(that);
    }

    public void forObjectExprDoFirst(ObjectExpr that) {
        forLHSDoFirst(that);
    }

    public void forParenthesizedDoFirst(Parenthesized that) {
        forLHSDoFirst(that);
    }

    public void forFunExprDoFirst(FunExpr that) {
        forLHSDoFirst(that);
    }

    public void forBracketDoFirst(Bracket that) {
        forLHSDoFirst(that);
    }

    public void forDotDoFirst(Dot that) {
        forLHSDoFirst(that);
    }

    public void forNewDoFirst(New that) {
        forLHSDoFirst(that);
    }

    public void forFunAppDoFirst(FunApp that) {
        forLHSDoFirst(that);
    }

    public void forPropertyDoFirst(Property that) {
        forAbstractNodeDoFirst(that);
    }

    public void forPropIdDoFirst(PropId that) {
        forPropertyDoFirst(that);
    }

    public void forPropStrDoFirst(PropStr that) {
        forPropertyDoFirst(that);
    }

    public void forPropNumDoFirst(PropNum that) {
        forPropertyDoFirst(that);
    }

    public void forMemberDoFirst(Member that) {
        forAbstractNodeDoFirst(that);
    }

    public void forFieldDoFirst(Field that) {
        forMemberDoFirst(that);
    }

    public void forGetPropDoFirst(GetProp that) {
        forMemberDoFirst(that);
    }

    public void forSetPropDoFirst(SetProp that) {
        forMemberDoFirst(that);
    }

    public void forNameDoFirst(Name that) {
        forAbstractNodeDoFirst(that);
    }

    public void forIdOrOpOrAnonymousNameDoFirst(IdOrOpOrAnonymousName that) {
        forNameDoFirst(that);
    }

    public void forIdOrOpDoFirst(IdOrOp that) {
        forIdOrOpOrAnonymousNameDoFirst(that);
    }

    public void forIdDoFirst(Id that) {
        forIdOrOpDoFirst(that);
    }

    public void forOpDoFirst(Op that) {
        forIdOrOpDoFirst(that);
    }

    public void forTypeNameDoFirst(TypeName that) {
        forIdOrOpDoFirst(that);
    }

    public void forAnonymousFnNameDoFirst(AnonymousFnName that) {
        forIdOrOpOrAnonymousNameDoFirst(that);
    }

    public void forPathDoFirst(Path that) {
        forNameDoFirst(that);
    }

    public void forModExpSpecifierDoFirst(ModExpSpecifier that) {
        forNameDoFirst(that);
    }

    public void forModExpStarFromPathDoFirst(ModExpStarFromPath that) {
        forModExpSpecifierDoFirst(that);
    }

    public void forModExpStarDoFirst(ModExpStar that) {
        forModExpSpecifierDoFirst(that);
    }

    public void forModExpAliasDoFirst(ModExpAlias that) {
        forModExpSpecifierDoFirst(that);
    }

    public void forModExpNameDoFirst(ModExpName that) {
        forModExpSpecifierDoFirst(that);
    }

    public void forModImpSpecifierDoFirst(ModImpSpecifier that) {
        forNameDoFirst(that);
    }

    public void forModImpAliasDoFirst(ModImpAlias that) {
        forModImpSpecifierDoFirst(that);
    }

    public void forModImpNameDoFirst(ModImpName that) {
        forModImpSpecifierDoFirst(that);
    }

    public void forLabelDoFirst(Label that) {
        forAbstractNodeDoFirst(that);
    }

    public void forCommentDoFirst(Comment that) {
        forAbstractNodeDoFirst(that);
    }

    public void forParamDoFirst(Param that) {
        forAbstractNodeDoFirst(that);
    }

    public void forTypeDoFirst(Type that) {
        forAbstractNodeDoFirst(that);
    }

    public void forPredefTypeDoFirst(PredefType that) {
        forTypeDoFirst(that);
    }

    public void forAnyTDoFirst(AnyT that) {
        forPredefTypeDoFirst(that);
    }

    public void forNumberTDoFirst(NumberT that) {
        forPredefTypeDoFirst(that);
    }

    public void forBoolTDoFirst(BoolT that) {
        forPredefTypeDoFirst(that);
    }

    public void forStringTDoFirst(StringT that) {
        forPredefTypeDoFirst(that);
    }

    public void forVoidTDoFirst(VoidT that) {
        forPredefTypeDoFirst(that);
    }

    public void forTypeRefDoFirst(TypeRef that) {
        forTypeDoFirst(that);
    }

    public void forTypeQueryDoFirst(TypeQuery that) {
        forTypeDoFirst(that);
    }

    public void forTypeLiteralDoFirst(TypeLiteral that) {
        forTypeDoFirst(that);
    }

    public void forObjectTypeDoFirst(ObjectType that) {
        forTypeLiteralDoFirst(that);
    }

    public void forArrayTypeDoFirst(ArrayType that) {
        forTypeLiteralDoFirst(that);
    }

    public void forFunctionTypeDoFirst(FunctionType that) {
        forTypeLiteralDoFirst(that);
    }

    public void forConstructorTypeDoFirst(ConstructorType that) {
        forTypeLiteralDoFirst(that);
    }

    public void forExprTypeDoFirst(ExprType that) {
        forTypeDoFirst(that);
    }

    public void forTypeMemberDoFirst(TypeMember that) {
        forTypeDoFirst(that);
    }

    public void forPropertySigDoFirst(PropertySig that) {
        forTypeMemberDoFirst(that);
    }

    public void forCallSigDoFirst(CallSig that) {
        forTypeMemberDoFirst(that);
    }

    public void forConstructSigDoFirst(ConstructSig that) {
        forTypeMemberDoFirst(that);
    }

    public void forIndexSigDoFirst(IndexSig that) {
        forTypeMemberDoFirst(that);
    }

    public void forMethodSigDoFirst(MethodSig that) {
        forTypeMemberDoFirst(that);
    }

    public void forTypeParamDoFirst(TypeParam that) {
        forAbstractNodeDoFirst(that);
    }

    /* Methods to handle a node after recursion. */
    public void forAbstractNodeOnly(AbstractNode that) {
        defaultCase(that);
    }

    public void forProgramOnly(Program that) {
        forAbstractNodeOnly(that);
    }

    public void forSourceElementOnly(SourceElement that) {
        forAbstractNodeOnly(that);
    }

    public void forModuleOnly(Module that) {
        forSourceElementOnly(that);
    }

    public void forModDeclOnly(ModDecl that) {
        forModuleOnly(that);
    }

    public void forModExportOnly(ModExport that) {
        forModuleOnly(that);
    }

    public void forModExpVarStmtOnly(ModExpVarStmt that) {
        forModExportOnly(that);
    }

    public void forModExpFunDeclOnly(ModExpFunDecl that) {
        forModExportOnly(that);
    }

    public void forModExpGetterOnly(ModExpGetter that) {
        forModExportOnly(that);
    }

    public void forModExpSetterOnly(ModExpSetter that) {
        forModExportOnly(that);
    }

    public void forModExpSpecifiersOnly(ModExpSpecifiers that) {
        forModExportOnly(that);
    }

    public void forModExpAssignmentOnly(ModExpAssignment that) {
        forModExportOnly(that);
    }

    public void forModImpDeclOnly(ModImpDecl that) {
        forSourceElementOnly(that);
    }

    public void forExtImpDeclOnly(ExtImpDecl that) {
        forSourceElementOnly(that);
    }

    public void forTSImpDeclOnly(TSImpDecl that) {
        forSourceElementOnly(that);
    }

    public void forIntfDeclOnly(IntfDecl that) {
        forSourceElementOnly(that);
    }

    public void forAmbDeclOnly(AmbDecl that) {
        forSourceElementOnly(that);
    }

    public void forAmbVarDeclOnly(AmbVarDecl that) {
        forAmbDeclOnly(that);
    }

    public void forAmbFunDeclOnly(AmbFunDecl that) {
        forAmbDeclOnly(that);
    }

    public void forAmbClsDeclOnly(AmbClsDecl that) {
        forAmbDeclOnly(that);
    }

    public void forAmbEnumDeclOnly(AmbEnumDecl that) {
        forAmbDeclOnly(that);
    }

    public void forAmbModDeclOnly(AmbModDecl that) {
        forAmbDeclOnly(that);
    }

    public void forAmbExtModDeclOnly(AmbExtModDecl that) {
        forAmbDeclOnly(that);
    }

    public void forStmtOnly(Stmt that) {
        forSourceElementOnly(that);
    }

    public void forNoOpOnly(NoOp that) {
        forStmtOnly(that);
    }

    public void forStmtUnitOnly(StmtUnit that) {
        forStmtOnly(that);
    }

    public void forFunDeclOnly(FunDecl that) {
        forStmtOnly(that);
    }

    public void forBlockOnly(Block that) {
        forStmtOnly(that);
    }

    public void forVarStmtOnly(VarStmt that) {
        forStmtOnly(that);
    }

    public void forEmptyStmtOnly(EmptyStmt that) {
        forStmtOnly(that);
    }

    public void forExprStmtOnly(ExprStmt that) {
        forStmtOnly(that);
    }

    public void forIfOnly(If that) {
        forStmtOnly(that);
    }

    public void forDoWhileOnly(DoWhile that) {
        forStmtOnly(that);
    }

    public void forWhileOnly(While that) {
        forStmtOnly(that);
    }

    public void forForOnly(For that) {
        forStmtOnly(that);
    }

    public void forForInOnly(ForIn that) {
        forStmtOnly(that);
    }

    public void forForVarOnly(ForVar that) {
        forStmtOnly(that);
    }

    public void forForVarInOnly(ForVarIn that) {
        forStmtOnly(that);
    }

    public void forContinueOnly(Continue that) {
        forStmtOnly(that);
    }

    public void forBreakOnly(Break that) {
        forStmtOnly(that);
    }

    public void forReturnOnly(Return that) {
        forStmtOnly(that);
    }

    public void forWithOnly(With that) {
        forStmtOnly(that);
    }

    public void forSwitchOnly(Switch that) {
        forStmtOnly(that);
    }

    public void forLabelStmtOnly(LabelStmt that) {
        forStmtOnly(that);
    }

    public void forThrowOnly(Throw that) {
        forStmtOnly(that);
    }

    public void forTryOnly(Try that) {
        forStmtOnly(that);
    }

    public void forDebuggerOnly(Debugger that) {
        forStmtOnly(that);
    }

    public void forSourceElementsOnly(SourceElements that) {
        forAbstractNodeOnly(that);
    }

    public void forVarDeclOnly(VarDecl that) {
        forAbstractNodeOnly(that);
    }

    public void forCaseOnly(Case that) {
        forAbstractNodeOnly(that);
    }

    public void forCatchOnly(Catch that) {
        forAbstractNodeOnly(that);
    }

    public void forModImportOnly(ModImport that) {
        forAbstractNodeOnly(that);
    }

    public void forModImpSpecifierSetOnly(ModImpSpecifierSet that) {
        forModImportOnly(that);
    }

    public void forModImpAliasClauseOnly(ModImpAliasClause that) {
        forModImportOnly(that);
    }

    public void forAmbClsEltOnly(AmbClsElt that) {
        forAbstractNodeOnly(that);
    }

    public void forAmbCnstDeclOnly(AmbCnstDecl that) {
        forAmbClsEltOnly(that);
    }

    public void forAmbMemDeclOnly(AmbMemDecl that) {
        forAmbClsEltOnly(that);
    }

    public void forAmbIndDeclOnly(AmbIndDecl that) {
        forAmbClsEltOnly(that);
    }

    public void forAmbEnumMemOnly(AmbEnumMem that) {
        forAbstractNodeOnly(that);
    }

    public void forAmbModEltOnly(AmbModElt that) {
        forAbstractNodeOnly(that);
    }

    public void forAmbExtModEltOnly(AmbExtModElt that) {
        forAbstractNodeOnly(that);
    }

    public void forExprOnly(Expr that) {
        forAbstractNodeOnly(that);
    }

    public void forExprListOnly(ExprList that) {
        forExprOnly(that);
    }

    public void forCondOnly(Cond that) {
        forExprOnly(that);
    }

    public void forInfixOpAppOnly(InfixOpApp that) {
        forExprOnly(that);
    }

    public void forPrefixOpAppOnly(PrefixOpApp that) {
        forExprOnly(that);
    }

    public void forUnaryAssignOpAppOnly(UnaryAssignOpApp that) {
        forExprOnly(that);
    }

    public void forAssignOpAppOnly(AssignOpApp that) {
        forExprOnly(that);
    }

    public void forLHSOnly(LHS that) {
        forExprOnly(that);
    }

    public void forLiteralOnly(Literal that) {
        forLHSOnly(that);
    }

    public void forThisOnly(This that) {
        forLiteralOnly(that);
    }

    public void forNullOnly(Null that) {
        forLiteralOnly(that);
    }

    public void forBoolOnly(Bool that) {
        forLiteralOnly(that);
    }

    public void forNumberLiteralOnly(NumberLiteral that) {
        forLiteralOnly(that);
    }

    public void forDoubleLiteralOnly(DoubleLiteral that) {
        forNumberLiteralOnly(that);
    }

    public void forIntLiteralOnly(IntLiteral that) {
        forNumberLiteralOnly(that);
    }

    public void forStringLiteralOnly(StringLiteral that) {
        forLiteralOnly(that);
    }

    public void forRegularExpressionOnly(RegularExpression that) {
        forLiteralOnly(that);
    }

    public void forVarRefOnly(VarRef that) {
        forLHSOnly(that);
    }

    public void forArrayExprOnly(ArrayExpr that) {
        forLHSOnly(that);
    }

    public void forArrayNumberExprOnly(ArrayNumberExpr that) {
        forLHSOnly(that);
    }

    public void forObjectExprOnly(ObjectExpr that) {
        forLHSOnly(that);
    }

    public void forParenthesizedOnly(Parenthesized that) {
        forLHSOnly(that);
    }

    public void forFunExprOnly(FunExpr that) {
        forLHSOnly(that);
    }

    public void forBracketOnly(Bracket that) {
        forLHSOnly(that);
    }

    public void forDotOnly(Dot that) {
        forLHSOnly(that);
    }

    public void forNewOnly(New that) {
        forLHSOnly(that);
    }

    public void forFunAppOnly(FunApp that) {
        forLHSOnly(that);
    }

    public void forPropertyOnly(Property that) {
        forAbstractNodeOnly(that);
    }

    public void forPropIdOnly(PropId that) {
        forPropertyOnly(that);
    }

    public void forPropStrOnly(PropStr that) {
        forPropertyOnly(that);
    }

    public void forPropNumOnly(PropNum that) {
        forPropertyOnly(that);
    }

    public void forMemberOnly(Member that) {
        forAbstractNodeOnly(that);
    }

    public void forFieldOnly(Field that) {
        forMemberOnly(that);
    }

    public void forGetPropOnly(GetProp that) {
        forMemberOnly(that);
    }

    public void forSetPropOnly(SetProp that) {
        forMemberOnly(that);
    }

    public void forNameOnly(Name that) {
        forAbstractNodeOnly(that);
    }

    public void forIdOrOpOrAnonymousNameOnly(IdOrOpOrAnonymousName that) {
        forNameOnly(that);
    }

    public void forIdOrOpOnly(IdOrOp that) {
        forIdOrOpOrAnonymousNameOnly(that);
    }

    public void forIdOnly(Id that) {
        forIdOrOpOnly(that);
    }

    public void forOpOnly(Op that) {
        forIdOrOpOnly(that);
    }

    public void forTypeNameOnly(TypeName that) {
        forIdOrOpOnly(that);
    }

    public void forAnonymousFnNameOnly(AnonymousFnName that) {
        forIdOrOpOrAnonymousNameOnly(that);
    }

    public void forPathOnly(Path that) {
        forNameOnly(that);
    }

    public void forModExpSpecifierOnly(ModExpSpecifier that) {
        forNameOnly(that);
    }

    public void forModExpStarFromPathOnly(ModExpStarFromPath that) {
        forModExpSpecifierOnly(that);
    }

    public void forModExpStarOnly(ModExpStar that) {
        forModExpSpecifierOnly(that);
    }

    public void forModExpAliasOnly(ModExpAlias that) {
        forModExpSpecifierOnly(that);
    }

    public void forModExpNameOnly(ModExpName that) {
        forModExpSpecifierOnly(that);
    }

    public void forModImpSpecifierOnly(ModImpSpecifier that) {
        forNameOnly(that);
    }

    public void forModImpAliasOnly(ModImpAlias that) {
        forModImpSpecifierOnly(that);
    }

    public void forModImpNameOnly(ModImpName that) {
        forModImpSpecifierOnly(that);
    }

    public void forLabelOnly(Label that) {
        forAbstractNodeOnly(that);
    }

    public void forCommentOnly(Comment that) {
        forAbstractNodeOnly(that);
    }

    public void forParamOnly(Param that) {
        forAbstractNodeOnly(that);
    }

    public void forTypeOnly(Type that) {
        forAbstractNodeOnly(that);
    }

    public void forPredefTypeOnly(PredefType that) {
        forTypeOnly(that);
    }

    public void forAnyTOnly(AnyT that) {
        forPredefTypeOnly(that);
    }

    public void forNumberTOnly(NumberT that) {
        forPredefTypeOnly(that);
    }

    public void forBoolTOnly(BoolT that) {
        forPredefTypeOnly(that);
    }

    public void forStringTOnly(StringT that) {
        forPredefTypeOnly(that);
    }

    public void forVoidTOnly(VoidT that) {
        forPredefTypeOnly(that);
    }

    public void forTypeRefOnly(TypeRef that) {
        forTypeOnly(that);
    }

    public void forTypeQueryOnly(TypeQuery that) {
        forTypeOnly(that);
    }

    public void forTypeLiteralOnly(TypeLiteral that) {
        forTypeOnly(that);
    }

    public void forObjectTypeOnly(ObjectType that) {
        forTypeLiteralOnly(that);
    }

    public void forArrayTypeOnly(ArrayType that) {
        forTypeLiteralOnly(that);
    }

    public void forFunctionTypeOnly(FunctionType that) {
        forTypeLiteralOnly(that);
    }

    public void forConstructorTypeOnly(ConstructorType that) {
        forTypeLiteralOnly(that);
    }

    public void forExprTypeOnly(ExprType that) {
        forTypeOnly(that);
    }

    public void forTypeMemberOnly(TypeMember that) {
        forTypeOnly(that);
    }

    public void forPropertySigOnly(PropertySig that) {
        forTypeMemberOnly(that);
    }

    public void forCallSigOnly(CallSig that) {
        forTypeMemberOnly(that);
    }

    public void forConstructSigOnly(ConstructSig that) {
        forTypeMemberOnly(that);
    }

    public void forIndexSigOnly(IndexSig that) {
        forTypeMemberOnly(that);
    }

    public void forMethodSigOnly(MethodSig that) {
        forTypeMemberOnly(that);
    }

    public void forTypeParamOnly(TypeParam that) {
        forAbstractNodeOnly(that);
    }

    /* Methods to recur on each child. */
    public void forProgram(Program that) {
        forProgramDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnTopLevel(that.getBody());
        forProgramOnly(that);
    }

    public void forModDecl(ModDecl that) {
        forModDeclDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getName());
        recurOnTopLevel(that.getBody());
        forModDeclOnly(that);
    }

    public void forModExpVarStmt(ModExpVarStmt that) {
        forModExpVarStmtDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnListOfVarDecl(that.getVds());
        forModExpVarStmtOnly(that);
    }

    public void forModExpFunDecl(ModExpFunDecl that) {
        forModExpFunDeclDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getFd());
        forModExpFunDeclOnly(that);
    }

    public void forModExpGetter(ModExpGetter that) {
        forModExpGetterDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getFd());
        forModExpGetterOnly(that);
    }

    public void forModExpSetter(ModExpSetter that) {
        forModExpSetterDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getFd());
        forModExpSetterOnly(that);
    }

    public void forModExpSpecifiers(ModExpSpecifiers that) {
        forModExpSpecifiersDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnListOfModExpSpecifier(that.getNames());
        forModExpSpecifiersOnly(that);
    }

    public void forModExpAssignment(ModExpAssignment that) {
        forModExpAssignmentDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getId());
        forModExpAssignmentOnly(that);
    }

    public void forModImpDecl(ModImpDecl that) {
        forModImpDeclDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnListOfModImport(that.getImports());
        forModImpDeclOnly(that);
    }

    public void forExtImpDecl(ExtImpDecl that) {
        forExtImpDeclDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getId());
        forExtImpDeclOnly(that);
    }

    public void forTSImpDecl(TSImpDecl that) {
        forTSImpDeclDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getId());
        recur(that.getPath());
        forTSImpDeclOnly(that);
    }

    public void forIntfDecl(IntfDecl that) {
        forIntfDeclDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getId());
        recurOnListOfTypeParam(that.getTps());
        recurOnListOfTypeRef(that.getExt());
        recur(that.getTyp());
        forIntfDeclOnly(that);
    }

    public void forAmbVarDecl(AmbVarDecl that) {
        forAmbVarDeclDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getId());
        recurOnOptionOfType(that.getTy());
        forAmbVarDeclOnly(that);
    }

    public void forAmbFunDecl(AmbFunDecl that) {
        forAmbFunDeclDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getId());
        recur(that.getSig());
        forAmbFunDeclOnly(that);
    }

    public void forAmbClsDecl(AmbClsDecl that) {
        forAmbClsDeclDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getId());
        recurOnListOfTypeParam(that.getTps());
        recurOnOptionOfTypeRef(that.getExt());
        recurOnListOfTypeRef(that.getImp());
        recurOnListOfAmbClsElt(that.getElts());
        forAmbClsDeclOnly(that);
    }

    public void forAmbEnumDecl(AmbEnumDecl that) {
        forAmbEnumDeclDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getId());
        recurOnListOfAmbEnumMem(that.getMem());
        forAmbEnumDeclOnly(that);
    }

    public void forAmbModDecl(AmbModDecl that) {
        forAmbModDeclDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getPath());
        recurOnListOfAmbModElt(that.getMem());
        forAmbModDeclOnly(that);
    }

    public void forAmbExtModDecl(AmbExtModDecl that) {
        forAmbExtModDeclDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnListOfAmbExtModElt(that.getMem());
        forAmbExtModDeclOnly(that);
    }

    public void forNoOp(NoOp that) {
        forNoOpDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        forNoOpOnly(that);
    }

    public void forStmtUnit(StmtUnit that) {
        forStmtUnitDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnListOfStmt(that.getStmts());
        forStmtUnitOnly(that);
    }

    public void forFunDecl(FunDecl that) {
        forFunDeclDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnFunctional(that.getFtn());
        forFunDeclOnly(that);
    }

    public void forBlock(Block that) {
        forBlockDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnListOfStmt(that.getStmts());
        forBlockOnly(that);
    }

    public void forVarStmt(VarStmt that) {
        forVarStmtDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnListOfVarDecl(that.getVds());
        forVarStmtOnly(that);
    }

    public void forEmptyStmt(EmptyStmt that) {
        forEmptyStmtDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        forEmptyStmtOnly(that);
    }

    public void forExprStmt(ExprStmt that) {
        forExprStmtDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getExpr());
        forExprStmtOnly(that);
    }

    public void forIf(If that) {
        forIfDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getCond());
        recur(that.getTrueBranch());
        recurOnOptionOfStmt(that.getFalseBranch());
        forIfOnly(that);
    }

    public void forDoWhile(DoWhile that) {
        forDoWhileDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getBody());
        recur(that.getCond());
        forDoWhileOnly(that);
    }

    public void forWhile(While that) {
        forWhileDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getCond());
        recur(that.getBody());
        forWhileOnly(that);
    }

    public void forFor(For that) {
        forForDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnOptionOfExpr(that.getInit());
        recurOnOptionOfExpr(that.getCond());
        recurOnOptionOfExpr(that.getAction());
        recur(that.getBody());
        forForOnly(that);
    }

    public void forForIn(ForIn that) {
        forForInDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getLhs());
        recur(that.getExpr());
        recur(that.getBody());
        forForInOnly(that);
    }

    public void forForVar(ForVar that) {
        forForVarDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnListOfVarDecl(that.getVars());
        recurOnOptionOfExpr(that.getCond());
        recurOnOptionOfExpr(that.getAction());
        recur(that.getBody());
        forForVarOnly(that);
    }

    public void forForVarIn(ForVarIn that) {
        forForVarInDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getVar());
        recur(that.getExpr());
        recur(that.getBody());
        forForVarInOnly(that);
    }

    public void forContinue(Continue that) {
        forContinueDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnOptionOfLabel(that.getTarget());
        forContinueOnly(that);
    }

    public void forBreak(Break that) {
        forBreakDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnOptionOfLabel(that.getTarget());
        forBreakOnly(that);
    }

    public void forReturn(Return that) {
        forReturnDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnOptionOfExpr(that.getExpr());
        forReturnOnly(that);
    }

    public void forWith(With that) {
        forWithDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getExpr());
        recur(that.getStmt());
        forWithOnly(that);
    }

    public void forSwitch(Switch that) {
        forSwitchDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getCond());
        recurOnListOfCase(that.getFrontCases());
        recurOnOptionOfListOfStmt(that.getDef());
        recurOnListOfCase(that.getBackCases());
        forSwitchOnly(that);
    }

    public void forLabelStmt(LabelStmt that) {
        forLabelStmtDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getLabel());
        recur(that.getStmt());
        forLabelStmtOnly(that);
    }

    public void forThrow(Throw that) {
        forThrowDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getExpr());
        forThrowOnly(that);
    }

    public void forTry(Try that) {
        forTryDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnListOfStmt(that.getBody());
        recurOnOptionOfCatch(that.getCatchBlock());
        recurOnOptionOfListOfStmt(that.getFin());
        forTryOnly(that);
    }

    public void forDebugger(Debugger that) {
        forDebuggerDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        forDebuggerOnly(that);
    }

    public void forSourceElements(SourceElements that) {
        forSourceElementsDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnListOfSourceElement(that.getBody());
        forSourceElementsOnly(that);
    }

    public void forVarDecl(VarDecl that) {
        forVarDeclDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getName());
        recurOnOptionOfExpr(that.getExpr());
        forVarDeclOnly(that);
    }

    public void forCase(Case that) {
        forCaseDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getCond());
        recurOnListOfStmt(that.getBody());
        forCaseOnly(that);
    }

    public void forCatch(Catch that) {
        forCatchDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getId());
        recurOnListOfStmt(that.getBody());
        forCatchOnly(that);
    }

    public void forModImpSpecifierSet(ModImpSpecifierSet that) {
        forModImpSpecifierSetDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnListOfModImpSpecifier(that.getImports());
        recur(that.getModule());
        forModImpSpecifierSetOnly(that);
    }

    public void forModImpAliasClause(ModImpAliasClause that) {
        forModImpAliasClauseDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getName());
        recur(that.getAlias());
        forModImpAliasClauseOnly(that);
    }

    public void forAmbCnstDecl(AmbCnstDecl that) {
        forAmbCnstDeclDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnListOfParam(that.getPs());
        forAmbCnstDeclOnly(that);
    }

    public void forAmbMemDecl(AmbMemDecl that) {
        forAmbMemDeclDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnListOfModifier(that.getMods());
        recur(that.getProp());
        recurOnOptionOfType(that.getTyp());
        forAmbMemDeclOnly(that);
    }

    public void forAmbIndDecl(AmbIndDecl that) {
        forAmbIndDeclDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getInd());
        forAmbIndDeclOnly(that);
    }

    public void forAmbEnumMem(AmbEnumMem that) {
        forAmbEnumMemDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getProp());
        recurOnOptionOfNumberLiteral(that.getNum());
        forAmbEnumMemOnly(that);
    }

    public void forAmbModElt(AmbModElt that) {
        forAmbModEltDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getDecl());
        forAmbModEltOnly(that);
    }

    public void forAmbExtModElt(AmbExtModElt that) {
        forAmbExtModEltDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getDecl());
        forAmbExtModEltOnly(that);
    }

    public void forExprList(ExprList that) {
        forExprListDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnListOfExpr(that.getExprs());
        forExprListOnly(that);
    }

    public void forCond(Cond that) {
        forCondDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getCond());
        recur(that.getTrueBranch());
        recur(that.getFalseBranch());
        forCondOnly(that);
    }

    public void forInfixOpApp(InfixOpApp that) {
        forInfixOpAppDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getLeft());
        recur(that.getOp());
        recur(that.getRight());
        forInfixOpAppOnly(that);
    }

    public void forPrefixOpApp(PrefixOpApp that) {
        forPrefixOpAppDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getOp());
        recur(that.getRight());
        forPrefixOpAppOnly(that);
    }

    public void forUnaryAssignOpApp(UnaryAssignOpApp that) {
        forUnaryAssignOpAppDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getLhs());
        recur(that.getOp());
        forUnaryAssignOpAppOnly(that);
    }

    public void forAssignOpApp(AssignOpApp that) {
        forAssignOpAppDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getLhs());
        recur(that.getOp());
        recur(that.getRight());
        forAssignOpAppOnly(that);
    }

    public void forThis(This that) {
        forThisDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        forThisOnly(that);
    }

    public void forNull(Null that) {
        forNullDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        forNullOnly(that);
    }

    public void forBool(Bool that) {
        forBoolDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        forBoolOnly(that);
    }

    public void forDoubleLiteral(DoubleLiteral that) {
        forDoubleLiteralDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        forDoubleLiteralOnly(that);
    }

    public void forIntLiteral(IntLiteral that) {
        forIntLiteralDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        forIntLiteralOnly(that);
    }

    public void forStringLiteral(StringLiteral that) {
        forStringLiteralDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        forStringLiteralOnly(that);
    }

    public void forRegularExpression(RegularExpression that) {
        forRegularExpressionDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        forRegularExpressionOnly(that);
    }

    public void forVarRef(VarRef that) {
        forVarRefDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getId());
        forVarRefOnly(that);
    }

    public void forArrayExpr(ArrayExpr that) {
        forArrayExprDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnListOfOptionOfExpr(that.getElements());
        forArrayExprOnly(that);
    }

    public void forArrayNumberExpr(ArrayNumberExpr that) {
        forArrayNumberExprDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        forArrayNumberExprOnly(that);
    }

    public void forObjectExpr(ObjectExpr that) {
        forObjectExprDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnListOfMember(that.getMembers());
        forObjectExprOnly(that);
    }

    public void forParenthesized(Parenthesized that) {
        forParenthesizedDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getExpr());
        forParenthesizedOnly(that);
    }

    public void forFunExpr(FunExpr that) {
        forFunExprDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnFunctional(that.getFtn());
        forFunExprOnly(that);
    }

    public void forBracket(Bracket that) {
        forBracketDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getObj());
        recur(that.getIndex());
        forBracketOnly(that);
    }

    public void forDot(Dot that) {
        forDotDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getObj());
        recur(that.getMember());
        forDotOnly(that);
    }

    public void forNew(New that) {
        forNewDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getLhs());
        forNewOnly(that);
    }

    public void forFunApp(FunApp that) {
        forFunAppDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getFun());
        recurOnListOfExpr(that.getArgs());
        forFunAppOnly(that);
    }

    public void forPropId(PropId that) {
        forPropIdDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getId());
        forPropIdOnly(that);
    }

    public void forPropStr(PropStr that) {
        forPropStrDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        forPropStrOnly(that);
    }

    public void forPropNum(PropNum that) {
        forPropNumDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getNum());
        forPropNumOnly(that);
    }

    public void forField(Field that) {
        forFieldDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getProp());
        recur(that.getExpr());
        forFieldOnly(that);
    }

    public void forGetProp(GetProp that) {
        forGetPropDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getProp());
        recurOnFunctional(that.getFtn());
        forGetPropOnly(that);
    }

    public void forSetProp(SetProp that) {
        forSetPropDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getProp());
        recurOnFunctional(that.getFtn());
        forSetPropOnly(that);
    }

    public void forId(Id that) {
        forIdDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        forIdOnly(that);
    }

    public void forOp(Op that) {
        forOpDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        forOpOnly(that);
    }

    public void forTypeName(TypeName that) {
        forTypeNameDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnListOfId(that.getNames());
        forTypeNameOnly(that);
    }

    public void forAnonymousFnName(AnonymousFnName that) {
        forAnonymousFnNameDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        forAnonymousFnNameOnly(that);
    }

    public void forPath(Path that) {
        forPathDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnListOfId(that.getNames());
        forPathOnly(that);
    }

    public void forModExpStarFromPath(ModExpStarFromPath that) {
        forModExpStarFromPathDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getModule());
        forModExpStarFromPathOnly(that);
    }

    public void forModExpStar(ModExpStar that) {
        forModExpStarDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        forModExpStarOnly(that);
    }

    public void forModExpAlias(ModExpAlias that) {
        forModExpAliasDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getName());
        recur(that.getAlias());
        forModExpAliasOnly(that);
    }

    public void forModExpName(ModExpName that) {
        forModExpNameDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getName());
        forModExpNameOnly(that);
    }

    public void forModImpAlias(ModImpAlias that) {
        forModImpAliasDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getName());
        recur(that.getAlias());
        forModImpAliasOnly(that);
    }

    public void forModImpName(ModImpName that) {
        forModImpNameDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getName());
        forModImpNameOnly(that);
    }

    public void forLabel(Label that) {
        forLabelDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getId());
        forLabelOnly(that);
    }

    public void forComment(Comment that) {
        forCommentDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        forCommentOnly(that);
    }

    public void forParam(Param that) {
        forParamDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getName());
        recurOnOptionOfModifier(that.getMod());
        recurOnOptionOfType(that.getTyp());
        recurOnOptionOfExpr(that.getDefaultExpr());
        forParamOnly(that);
    }

    public void forAnyT(AnyT that) {
        forAnyTDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        forAnyTOnly(that);
    }

    public void forNumberT(NumberT that) {
        forNumberTDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        forNumberTOnly(that);
    }

    public void forBoolT(BoolT that) {
        forBoolTDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        forBoolTOnly(that);
    }

    public void forStringT(StringT that) {
        forStringTDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        forStringTOnly(that);
    }

    public void forVoidT(VoidT that) {
        forVoidTDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        forVoidTOnly(that);
    }

    public void forTypeRef(TypeRef that) {
        forTypeRefDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getName());
        recurOnListOfType(that.getArgs());
        forTypeRefOnly(that);
    }

    public void forTypeQuery(TypeQuery that) {
        forTypeQueryDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getPath());
        forTypeQueryOnly(that);
    }

    public void forObjectType(ObjectType that) {
        forObjectTypeDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnListOfTypeMember(that.getMembers());
        forObjectTypeOnly(that);
    }

    public void forArrayType(ArrayType that) {
        forArrayTypeDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getTyp());
        forArrayTypeOnly(that);
    }

    public void forFunctionType(FunctionType that) {
        forFunctionTypeDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnListOfTypeParam(that.getTparams());
        recurOnListOfParam(that.getParams());
        recur(that.getTyp());
        forFunctionTypeOnly(that);
    }

    public void forConstructorType(ConstructorType that) {
        forConstructorTypeDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnListOfTypeParam(that.getTparams());
        recurOnListOfParam(that.getParams());
        recur(that.getTyp());
        forConstructorTypeOnly(that);
    }

    public void forExprType(ExprType that) {
        forExprTypeDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        forExprTypeOnly(that);
    }

    public void forPropertySig(PropertySig that) {
        forPropertySigDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getProp());
        recurOnOptionOfType(that.getTyp());
        forPropertySigOnly(that);
    }

    public void forCallSig(CallSig that) {
        forCallSigDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnListOfTypeParam(that.getTparams());
        recurOnListOfParam(that.getParams());
        recurOnOptionOfType(that.getTyp());
        forCallSigOnly(that);
    }

    public void forConstructSig(ConstructSig that) {
        forConstructSigDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recurOnListOfTypeParam(that.getTparams());
        recurOnListOfParam(that.getParams());
        recurOnOptionOfType(that.getTyp());
        forConstructSigOnly(that);
    }

    public void forIndexSig(IndexSig that) {
        forIndexSigDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getId());
        recur(that.getAnnot());
        forIndexSigOnly(that);
    }

    public void forMethodSig(MethodSig that) {
        forMethodSigDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getProp());
        recur(that.getSig());
        forMethodSigOnly(that);
    }

    public void forTypeParam(TypeParam that) {
        forTypeParamDoFirst(that);
        recurOnASTSpanInfo(that.getInfo());
        recur(that.getName());
        recurOnOptionOfType(that.getExt());
        forTypeParamOnly(that);
    }


    public void recur(AbstractNode that) {
        that.accept(this);
    }

    public void recurOnASTSpanInfo(ASTSpanInfo that) {
    }

    public void recurOnTopLevel(TopLevel that) {
    }

    public void recurOnListOfVarDecl(List<VarDecl> that) {
        for (VarDecl elt : that) {
            recur(elt);
        }
    }

    public void recurOnListOfModExpSpecifier(List<ModExpSpecifier> that) {
        for (ModExpSpecifier elt : that) {
            recur(elt);
        }
    }

    public void recurOnListOfModImport(List<ModImport> that) {
        for (ModImport elt : that) {
            recur(elt);
        }
    }

    public void recurOnListOfTypeParam(List<TypeParam> that) {
        for (TypeParam elt : that) {
            recur(elt);
        }
    }

    public void recurOnListOfTypeRef(List<TypeRef> that) {
        for (TypeRef elt : that) {
            recur(elt);
        }
    }

    public void recurOnOptionOfType(Option<Type> that) {
        if (!that.isNone()) recur(that.unwrap());
    }

    public void recurOnOptionOfTypeRef(Option<TypeRef> that) {
        if (!that.isNone()) recur(that.unwrap());
    }

    public void recurOnListOfAmbClsElt(List<AmbClsElt> that) {
        for (AmbClsElt elt : that) {
            recur(elt);
        }
    }

    public void recurOnListOfAmbEnumMem(List<AmbEnumMem> that) {
        for (AmbEnumMem elt : that) {
            recur(elt);
        }
    }

    public void recurOnListOfAmbModElt(List<AmbModElt> that) {
        for (AmbModElt elt : that) {
            recur(elt);
        }
    }

    public void recurOnListOfAmbExtModElt(List<AmbExtModElt> that) {
        for (AmbExtModElt elt : that) {
            recur(elt);
        }
    }

    public void recurOnListOfStmt(List<Stmt> that) {
        for (Stmt elt : that) {
            recur(elt);
        }
    }

    public void recurOnFunctional(Functional that) {
    }

    public void recurOnOptionOfStmt(Option<Stmt> that) {
        if (!that.isNone()) recur(that.unwrap());
    }

    public void recurOnOptionOfExpr(Option<Expr> that) {
        if (!that.isNone()) recur(that.unwrap());
    }

    public void recurOnOptionOfLabel(Option<Label> that) {
        if (!that.isNone()) recur(that.unwrap());
    }

    public void recurOnListOfCase(List<Case> that) {
        for (Case elt : that) {
            recur(elt);
        }
    }

    public void recurOnOptionOfListOfStmt(Option<List<Stmt>> that) {
        if (!that.isNone()) recurOnListOfStmt(that.unwrap());
    }

    public void recurOnOptionOfCatch(Option<Catch> that) {
        if (!that.isNone()) recur(that.unwrap());
    }

    public void recurOnListOfSourceElement(List<SourceElement> that) {
        for (SourceElement elt : that) {
            recur(elt);
        }
    }

    public void recurOnListOfModImpSpecifier(List<ModImpSpecifier> that) {
        for (ModImpSpecifier elt : that) {
            recur(elt);
        }
    }

    public void recurOnListOfParam(List<Param> that) {
        for (Param elt : that) {
            recur(elt);
        }
    }

    public void recurOnModifier(Modifier that) {
    }

    public void recurOnListOfModifier(List<Modifier> that) {
        for (Modifier elt : that) {
            recurOnModifier(elt);
        }
    }

    public void recurOnOptionOfNumberLiteral(Option<NumberLiteral> that) {
        if (!that.isNone()) recur(that.unwrap());
    }

    public void recurOnListOfExpr(List<Expr> that) {
        for (Expr elt : that) {
            recur(elt);
        }
    }

    public void recurOnListOfOptionOfExpr(List<Option<Expr>> that) {
        for (Option<Expr> elt : that) {
            recurOnOptionOfExpr(elt);
        }
    }

    public void recurOnListOfMember(List<Member> that) {
        for (Member elt : that) {
            recur(elt);
        }
    }

    public void recurOnListOfId(List<Id> that) {
        for (Id elt : that) {
            recur(elt);
        }
    }

    public void recurOnOptionOfModifier(Option<Modifier> that) {
        if (!that.isNone()) recurOnModifier(that.unwrap());
    }

    public void recurOnListOfType(List<Type> that) {
        for (Type elt : that) {
            recur(elt);
        }
    }

    public void recurOnListOfTypeMember(List<TypeMember> that) {
        for (TypeMember elt : that) {
            recur(elt);
        }
    }
}
