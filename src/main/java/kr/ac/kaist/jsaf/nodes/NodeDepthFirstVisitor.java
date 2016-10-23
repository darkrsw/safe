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

/** A parametric abstract implementation of a visitor over Node that returns a value.
 ** This visitor implements the visitor interface with methods that
 ** first visit children, and then call forCASEOnly(), passing in
 ** the values of the visits of the children. (CASE is replaced by the case name.)
 ** By default, each of forCASEOnly delegates to a more general case; at the
 ** top of this delegation tree is defaultCase(), which (unless overridden)
 ** throws an exception.
 **/
@SuppressWarnings({"unused", "unchecked"})
public abstract class NodeDepthFirstVisitor<RetType> extends NodeVisitorLambda<RetType> {
    /**
     * This method is run for all cases that are not handled elsewhere.
     * By default, an exception is thrown; subclasses may override this behavior.
     * @throws IllegalArgumentException
    **/
    public RetType defaultCase(Node that) {
        throw new IllegalArgumentException("Visitor " + getClass().getName() + " does not support visiting values of type " + that.getClass().getName());
    }

    /* Methods to handle a node after recursion. */
    public RetType forNodeOnly(Node that) {
        return defaultCase(that);
    }

    public RetType forASTNodeOnly(ASTNode that, RetType info_result) {
        return forNodeOnly(that);
    }

    public RetType forAbstractNodeOnly(AbstractNode that, RetType info_result) {
        return forASTNodeOnly(that, info_result);
    }

    public RetType forProgramOnly(Program that, RetType info_result, RetType body_result) {
        return forAbstractNodeOnly(that, info_result);
    }

    public RetType forSourceElementOnly(SourceElement that, RetType info_result) {
        return forAbstractNodeOnly(that, info_result);
    }

    public RetType forModuleOnly(Module that, RetType info_result) {
        return forSourceElementOnly(that, info_result);
    }

    public RetType forModDeclOnly(ModDecl that, RetType info_result, RetType name_result, RetType body_result) {
        return forModuleOnly(that, info_result);
    }

    public RetType forModExportOnly(ModExport that, RetType info_result) {
        return forModuleOnly(that, info_result);
    }

    public RetType forModExpVarStmtOnly(ModExpVarStmt that, RetType info_result, List<RetType> vds_result) {
        return forModExportOnly(that, info_result);
    }

    public RetType forModExpFunDeclOnly(ModExpFunDecl that, RetType info_result, RetType fd_result) {
        return forModExportOnly(that, info_result);
    }

    public RetType forModExpGetterOnly(ModExpGetter that, RetType info_result, RetType fd_result) {
        return forModExportOnly(that, info_result);
    }

    public RetType forModExpSetterOnly(ModExpSetter that, RetType info_result, RetType fd_result) {
        return forModExportOnly(that, info_result);
    }

    public RetType forModExpSpecifiersOnly(ModExpSpecifiers that, RetType info_result, List<RetType> names_result) {
        return forModExportOnly(that, info_result);
    }

    public RetType forModExpAssignmentOnly(ModExpAssignment that, RetType info_result, RetType id_result) {
        return forModExportOnly(that, info_result);
    }

    public RetType forModImpDeclOnly(ModImpDecl that, RetType info_result, List<RetType> imports_result) {
        return forSourceElementOnly(that, info_result);
    }

    public RetType forExtImpDeclOnly(ExtImpDecl that, RetType info_result, RetType id_result) {
        return forSourceElementOnly(that, info_result);
    }

    public RetType forTSImpDeclOnly(TSImpDecl that, RetType info_result, RetType id_result, RetType path_result) {
        return forSourceElementOnly(that, info_result);
    }

    public RetType forIntfDeclOnly(IntfDecl that, RetType info_result, RetType id_result, List<RetType> tps_result, List<RetType> ext_result, RetType typ_result) {
        return forSourceElementOnly(that, info_result);
    }

    public RetType forAmbDeclOnly(AmbDecl that, RetType info_result) {
        return forSourceElementOnly(that, info_result);
    }

    public RetType forAmbVarDeclOnly(AmbVarDecl that, RetType info_result, RetType id_result, Option<RetType> ty_result) {
        return forAmbDeclOnly(that, info_result);
    }

    public RetType forAmbFunDeclOnly(AmbFunDecl that, RetType info_result, RetType id_result, RetType sig_result) {
        return forAmbDeclOnly(that, info_result);
    }

    public RetType forAmbClsDeclOnly(AmbClsDecl that, RetType info_result, RetType id_result, List<RetType> tps_result, Option<RetType> ext_result, List<RetType> imp_result, List<RetType> elts_result) {
        return forAmbDeclOnly(that, info_result);
    }

    public RetType forAmbEnumDeclOnly(AmbEnumDecl that, RetType info_result, RetType id_result, List<RetType> mem_result) {
        return forAmbDeclOnly(that, info_result);
    }

    public RetType forAmbModDeclOnly(AmbModDecl that, RetType info_result, RetType path_result, List<RetType> mem_result) {
        return forAmbDeclOnly(that, info_result);
    }

    public RetType forAmbExtModDeclOnly(AmbExtModDecl that, RetType info_result, List<RetType> mem_result) {
        return forAmbDeclOnly(that, info_result);
    }

    public RetType forStmtOnly(Stmt that, RetType info_result) {
        return forSourceElementOnly(that, info_result);
    }

    public RetType forNoOpOnly(NoOp that, RetType info_result) {
        return forStmtOnly(that, info_result);
    }

    public RetType forStmtUnitOnly(StmtUnit that, RetType info_result, List<RetType> stmts_result) {
        return forStmtOnly(that, info_result);
    }

    public RetType forFunDeclOnly(FunDecl that, RetType info_result, RetType ftn_result) {
        return forStmtOnly(that, info_result);
    }

    public RetType forBlockOnly(Block that, RetType info_result, List<RetType> stmts_result) {
        return forStmtOnly(that, info_result);
    }

    public RetType forVarStmtOnly(VarStmt that, RetType info_result, List<RetType> vds_result) {
        return forStmtOnly(that, info_result);
    }

    public RetType forEmptyStmtOnly(EmptyStmt that, RetType info_result) {
        return forStmtOnly(that, info_result);
    }

    public RetType forExprStmtOnly(ExprStmt that, RetType info_result, RetType expr_result) {
        return forStmtOnly(that, info_result);
    }

    public RetType forIfOnly(If that, RetType info_result, RetType cond_result, RetType trueBranch_result, Option<RetType> falseBranch_result) {
        return forStmtOnly(that, info_result);
    }

    public RetType forDoWhileOnly(DoWhile that, RetType info_result, RetType body_result, RetType cond_result) {
        return forStmtOnly(that, info_result);
    }

    public RetType forWhileOnly(While that, RetType info_result, RetType cond_result, RetType body_result) {
        return forStmtOnly(that, info_result);
    }

    public RetType forForOnly(For that, RetType info_result, Option<RetType> init_result, Option<RetType> cond_result, Option<RetType> action_result, RetType body_result) {
        return forStmtOnly(that, info_result);
    }

    public RetType forForInOnly(ForIn that, RetType info_result, RetType lhs_result, RetType expr_result, RetType body_result) {
        return forStmtOnly(that, info_result);
    }

    public RetType forForVarOnly(ForVar that, RetType info_result, List<RetType> vars_result, Option<RetType> cond_result, Option<RetType> action_result, RetType body_result) {
        return forStmtOnly(that, info_result);
    }

    public RetType forForVarInOnly(ForVarIn that, RetType info_result, RetType var_result, RetType expr_result, RetType body_result) {
        return forStmtOnly(that, info_result);
    }

    public RetType forContinueOnly(Continue that, RetType info_result, Option<RetType> target_result) {
        return forStmtOnly(that, info_result);
    }

    public RetType forBreakOnly(Break that, RetType info_result, Option<RetType> target_result) {
        return forStmtOnly(that, info_result);
    }

    public RetType forReturnOnly(Return that, RetType info_result, Option<RetType> expr_result) {
        return forStmtOnly(that, info_result);
    }

    public RetType forWithOnly(With that, RetType info_result, RetType expr_result, RetType stmt_result) {
        return forStmtOnly(that, info_result);
    }

    public RetType forSwitchOnly(Switch that, RetType info_result, RetType cond_result, List<RetType> frontCases_result, Option<List<RetType>> def_result, List<RetType> backCases_result) {
        return forStmtOnly(that, info_result);
    }

    public RetType forLabelStmtOnly(LabelStmt that, RetType info_result, RetType label_result, RetType stmt_result) {
        return forStmtOnly(that, info_result);
    }

    public RetType forThrowOnly(Throw that, RetType info_result, RetType expr_result) {
        return forStmtOnly(that, info_result);
    }

    public RetType forTryOnly(Try that, RetType info_result, List<RetType> body_result, Option<RetType> catchBlock_result, Option<List<RetType>> fin_result) {
        return forStmtOnly(that, info_result);
    }

    public RetType forDebuggerOnly(Debugger that, RetType info_result) {
        return forStmtOnly(that, info_result);
    }

    public RetType forSourceElementsOnly(SourceElements that, RetType info_result, List<RetType> body_result) {
        return forAbstractNodeOnly(that, info_result);
    }

    public RetType forVarDeclOnly(VarDecl that, RetType info_result, RetType name_result, Option<RetType> expr_result) {
        return forAbstractNodeOnly(that, info_result);
    }

    public RetType forCaseOnly(Case that, RetType info_result, RetType cond_result, List<RetType> body_result) {
        return forAbstractNodeOnly(that, info_result);
    }

    public RetType forCatchOnly(Catch that, RetType info_result, RetType id_result, List<RetType> body_result) {
        return forAbstractNodeOnly(that, info_result);
    }

    public RetType forModImportOnly(ModImport that, RetType info_result) {
        return forAbstractNodeOnly(that, info_result);
    }

    public RetType forModImpSpecifierSetOnly(ModImpSpecifierSet that, RetType info_result, List<RetType> imports_result, RetType module_result) {
        return forModImportOnly(that, info_result);
    }

    public RetType forModImpAliasClauseOnly(ModImpAliasClause that, RetType info_result, RetType name_result, RetType alias_result) {
        return forModImportOnly(that, info_result);
    }

    public RetType forAmbClsEltOnly(AmbClsElt that, RetType info_result) {
        return forAbstractNodeOnly(that, info_result);
    }

    public RetType forAmbCnstDeclOnly(AmbCnstDecl that, RetType info_result, List<RetType> ps_result) {
        return forAmbClsEltOnly(that, info_result);
    }

    public RetType forAmbMemDeclOnly(AmbMemDecl that, RetType info_result, List<RetType> mods_result, RetType prop_result, Option<RetType> typ_result) {
        return forAmbClsEltOnly(that, info_result);
    }

    public RetType forAmbIndDeclOnly(AmbIndDecl that, RetType info_result, RetType ind_result) {
        return forAmbClsEltOnly(that, info_result);
    }

    public RetType forAmbEnumMemOnly(AmbEnumMem that, RetType info_result, RetType prop_result, Option<RetType> num_result) {
        return forAbstractNodeOnly(that, info_result);
    }

    public RetType forAmbModEltOnly(AmbModElt that, RetType info_result, RetType decl_result) {
        return forAbstractNodeOnly(that, info_result);
    }

    public RetType forAmbExtModEltOnly(AmbExtModElt that, RetType info_result, RetType decl_result) {
        return forAbstractNodeOnly(that, info_result);
    }

    public RetType forExprOnly(Expr that, RetType info_result) {
        return forAbstractNodeOnly(that, info_result);
    }

    public RetType forExprListOnly(ExprList that, RetType info_result, List<RetType> exprs_result) {
        return forExprOnly(that, info_result);
    }

    public RetType forCondOnly(Cond that, RetType info_result, RetType cond_result, RetType trueBranch_result, RetType falseBranch_result) {
        return forExprOnly(that, info_result);
    }

    public RetType forInfixOpAppOnly(InfixOpApp that, RetType info_result, RetType left_result, RetType op_result, RetType right_result) {
        return forExprOnly(that, info_result);
    }

    public RetType forPrefixOpAppOnly(PrefixOpApp that, RetType info_result, RetType op_result, RetType right_result) {
        return forExprOnly(that, info_result);
    }

    public RetType forUnaryAssignOpAppOnly(UnaryAssignOpApp that, RetType info_result, RetType lhs_result, RetType op_result) {
        return forExprOnly(that, info_result);
    }

    public RetType forAssignOpAppOnly(AssignOpApp that, RetType info_result, RetType lhs_result, RetType op_result, RetType right_result) {
        return forExprOnly(that, info_result);
    }

    public RetType forLHSOnly(LHS that, RetType info_result) {
        return forExprOnly(that, info_result);
    }

    public RetType forLiteralOnly(Literal that, RetType info_result) {
        return forLHSOnly(that, info_result);
    }

    public RetType forThisOnly(This that, RetType info_result) {
        return forLiteralOnly(that, info_result);
    }

    public RetType forNullOnly(Null that, RetType info_result) {
        return forLiteralOnly(that, info_result);
    }

    public RetType forBoolOnly(Bool that, RetType info_result) {
        return forLiteralOnly(that, info_result);
    }

    public RetType forNumberLiteralOnly(NumberLiteral that, RetType info_result) {
        return forLiteralOnly(that, info_result);
    }

    public RetType forDoubleLiteralOnly(DoubleLiteral that, RetType info_result) {
        return forNumberLiteralOnly(that, info_result);
    }

    public RetType forIntLiteralOnly(IntLiteral that, RetType info_result) {
        return forNumberLiteralOnly(that, info_result);
    }

    public RetType forStringLiteralOnly(StringLiteral that, RetType info_result) {
        return forLiteralOnly(that, info_result);
    }

    public RetType forRegularExpressionOnly(RegularExpression that, RetType info_result) {
        return forLiteralOnly(that, info_result);
    }

    public RetType forVarRefOnly(VarRef that, RetType info_result, RetType id_result) {
        return forLHSOnly(that, info_result);
    }

    public RetType forArrayExprOnly(ArrayExpr that, RetType info_result, List<Option<RetType>> elements_result) {
        return forLHSOnly(that, info_result);
    }

    public RetType forArrayNumberExprOnly(ArrayNumberExpr that, RetType info_result) {
        return forLHSOnly(that, info_result);
    }

    public RetType forObjectExprOnly(ObjectExpr that, RetType info_result, List<RetType> members_result) {
        return forLHSOnly(that, info_result);
    }

    public RetType forParenthesizedOnly(Parenthesized that, RetType info_result, RetType expr_result) {
        return forLHSOnly(that, info_result);
    }

    public RetType forFunExprOnly(FunExpr that, RetType info_result, RetType ftn_result) {
        return forLHSOnly(that, info_result);
    }

    public RetType forBracketOnly(Bracket that, RetType info_result, RetType obj_result, RetType index_result) {
        return forLHSOnly(that, info_result);
    }

    public RetType forDotOnly(Dot that, RetType info_result, RetType obj_result, RetType member_result) {
        return forLHSOnly(that, info_result);
    }

    public RetType forNewOnly(New that, RetType info_result, RetType lhs_result) {
        return forLHSOnly(that, info_result);
    }

    public RetType forFunAppOnly(FunApp that, RetType info_result, RetType fun_result, List<RetType> args_result) {
        return forLHSOnly(that, info_result);
    }

    public RetType forPropertyOnly(Property that, RetType info_result) {
        return forAbstractNodeOnly(that, info_result);
    }

    public RetType forPropIdOnly(PropId that, RetType info_result, RetType id_result) {
        return forPropertyOnly(that, info_result);
    }

    public RetType forPropStrOnly(PropStr that, RetType info_result) {
        return forPropertyOnly(that, info_result);
    }

    public RetType forPropNumOnly(PropNum that, RetType info_result, RetType num_result) {
        return forPropertyOnly(that, info_result);
    }

    public RetType forMemberOnly(Member that, RetType info_result, RetType prop_result) {
        return forAbstractNodeOnly(that, info_result);
    }

    public RetType forFieldOnly(Field that, RetType info_result, RetType prop_result, RetType expr_result) {
        return forMemberOnly(that, info_result, prop_result);
    }

    public RetType forGetPropOnly(GetProp that, RetType info_result, RetType prop_result, RetType ftn_result) {
        return forMemberOnly(that, info_result, prop_result);
    }

    public RetType forSetPropOnly(SetProp that, RetType info_result, RetType prop_result, RetType ftn_result) {
        return forMemberOnly(that, info_result, prop_result);
    }

    public RetType forNameOnly(Name that, RetType info_result) {
        return forAbstractNodeOnly(that, info_result);
    }

    public RetType forIdOrOpOrAnonymousNameOnly(IdOrOpOrAnonymousName that, RetType info_result) {
        return forNameOnly(that, info_result);
    }

    public RetType forIdOrOpOnly(IdOrOp that, RetType info_result) {
        return forIdOrOpOrAnonymousNameOnly(that, info_result);
    }

    public RetType forIdOnly(Id that, RetType info_result) {
        return forIdOrOpOnly(that, info_result);
    }

    public RetType forOpOnly(Op that, RetType info_result) {
        return forIdOrOpOnly(that, info_result);
    }

    public RetType forTypeNameOnly(TypeName that, RetType info_result, List<RetType> names_result) {
        return forIdOrOpOnly(that, info_result);
    }

    public RetType forAnonymousFnNameOnly(AnonymousFnName that, RetType info_result) {
        return forIdOrOpOrAnonymousNameOnly(that, info_result);
    }

    public RetType forPathOnly(Path that, RetType info_result, List<RetType> names_result) {
        return forNameOnly(that, info_result);
    }

    public RetType forModExpSpecifierOnly(ModExpSpecifier that, RetType info_result) {
        return forNameOnly(that, info_result);
    }

    public RetType forModExpStarFromPathOnly(ModExpStarFromPath that, RetType info_result, RetType module_result) {
        return forModExpSpecifierOnly(that, info_result);
    }

    public RetType forModExpStarOnly(ModExpStar that, RetType info_result) {
        return forModExpSpecifierOnly(that, info_result);
    }

    public RetType forModExpAliasOnly(ModExpAlias that, RetType info_result, RetType name_result, RetType alias_result) {
        return forModExpSpecifierOnly(that, info_result);
    }

    public RetType forModExpNameOnly(ModExpName that, RetType info_result, RetType name_result) {
        return forModExpSpecifierOnly(that, info_result);
    }

    public RetType forModImpSpecifierOnly(ModImpSpecifier that, RetType info_result) {
        return forNameOnly(that, info_result);
    }

    public RetType forModImpAliasOnly(ModImpAlias that, RetType info_result, RetType name_result, RetType alias_result) {
        return forModImpSpecifierOnly(that, info_result);
    }

    public RetType forModImpNameOnly(ModImpName that, RetType info_result, RetType name_result) {
        return forModImpSpecifierOnly(that, info_result);
    }

    public RetType forLabelOnly(Label that, RetType info_result, RetType id_result) {
        return forAbstractNodeOnly(that, info_result);
    }

    public RetType forCommentOnly(Comment that, RetType info_result) {
        return forAbstractNodeOnly(that, info_result);
    }

    public RetType forParamOnly(Param that, RetType info_result, RetType name_result, Option<RetType> mod_result, Option<RetType> typ_result, Option<RetType> defaultExpr_result) {
        return forAbstractNodeOnly(that, info_result);
    }

    public RetType forTypeOnly(Type that, RetType info_result) {
        return forAbstractNodeOnly(that, info_result);
    }

    public RetType forPredefTypeOnly(PredefType that, RetType info_result) {
        return forTypeOnly(that, info_result);
    }

    public RetType forAnyTOnly(AnyT that, RetType info_result) {
        return forPredefTypeOnly(that, info_result);
    }

    public RetType forNumberTOnly(NumberT that, RetType info_result) {
        return forPredefTypeOnly(that, info_result);
    }

    public RetType forBoolTOnly(BoolT that, RetType info_result) {
        return forPredefTypeOnly(that, info_result);
    }

    public RetType forStringTOnly(StringT that, RetType info_result) {
        return forPredefTypeOnly(that, info_result);
    }

    public RetType forVoidTOnly(VoidT that, RetType info_result) {
        return forPredefTypeOnly(that, info_result);
    }

    public RetType forTypeRefOnly(TypeRef that, RetType info_result, RetType name_result, List<RetType> args_result) {
        return forTypeOnly(that, info_result);
    }

    public RetType forTypeQueryOnly(TypeQuery that, RetType info_result, RetType path_result) {
        return forTypeOnly(that, info_result);
    }

    public RetType forTypeLiteralOnly(TypeLiteral that, RetType info_result) {
        return forTypeOnly(that, info_result);
    }

    public RetType forObjectTypeOnly(ObjectType that, RetType info_result, List<RetType> members_result) {
        return forTypeLiteralOnly(that, info_result);
    }

    public RetType forArrayTypeOnly(ArrayType that, RetType info_result, RetType typ_result) {
        return forTypeLiteralOnly(that, info_result);
    }

    public RetType forFunctionTypeOnly(FunctionType that, RetType info_result, List<RetType> tparams_result, List<RetType> params_result, RetType typ_result) {
        return forTypeLiteralOnly(that, info_result);
    }

    public RetType forConstructorTypeOnly(ConstructorType that, RetType info_result, List<RetType> tparams_result, List<RetType> params_result, RetType typ_result) {
        return forTypeLiteralOnly(that, info_result);
    }

    public RetType forExprTypeOnly(ExprType that, RetType info_result) {
        return forTypeOnly(that, info_result);
    }

    public RetType forTypeMemberOnly(TypeMember that, RetType info_result) {
        return forTypeOnly(that, info_result);
    }

    public RetType forPropertySigOnly(PropertySig that, RetType info_result, RetType prop_result, Option<RetType> typ_result) {
        return forTypeMemberOnly(that, info_result);
    }

    public RetType forCallSigOnly(CallSig that, RetType info_result, List<RetType> tparams_result, List<RetType> params_result, Option<RetType> typ_result) {
        return forTypeMemberOnly(that, info_result);
    }

    public RetType forConstructSigOnly(ConstructSig that, RetType info_result, List<RetType> tparams_result, List<RetType> params_result, Option<RetType> typ_result) {
        return forTypeMemberOnly(that, info_result);
    }

    public RetType forIndexSigOnly(IndexSig that, RetType info_result, RetType id_result, RetType annot_result) {
        return forTypeMemberOnly(that, info_result);
    }

    public RetType forMethodSigOnly(MethodSig that, RetType info_result, RetType prop_result, RetType sig_result) {
        return forTypeMemberOnly(that, info_result);
    }

    public RetType forTypeParamOnly(TypeParam that, RetType info_result, RetType name_result, Option<RetType> ext_result) {
        return forAbstractNodeOnly(that, info_result);
    }

    public RetType forScopeBodyOnly(ScopeBody that, List<RetType> fds_result, List<RetType> vds_result) {
        return forNodeOnly(that);
    }

    public RetType forTopLevelOnly(TopLevel that, List<RetType> fds_result, List<RetType> vds_result, List<RetType> stmts_result) {
        return forScopeBodyOnly(that, fds_result, vds_result);
    }

    public RetType forFunctionalOnly(Functional that, List<RetType> fds_result, List<RetType> vds_result, RetType stmts_result, RetType name_result, List<RetType> params_result) {
        return forScopeBodyOnly(that, fds_result, vds_result);
    }

    public RetType forASTSpanInfoOnly(ASTSpanInfo that, Option<RetType> comment_result) {
        return forNodeOnly(that);
    }

    public RetType forModifierOnly(Modifier that) {
        return forNodeOnly(that);
    }

    public RetType forPublicModOnly(PublicMod that) {
        return forModifierOnly(that);
    }

    public RetType forPrivateModOnly(PrivateMod that) {
        return forModifierOnly(that);
    }

    public RetType forStaticModOnly(StaticMod that) {
        return forModifierOnly(that);
    }


    /** Methods to recur on each child. */
    public RetType forProgram(Program that) {
        RetType info_result = recur(that.getInfo());
        RetType body_result = recur(that.getBody());
        return forProgramOnly(that, info_result, body_result);
    }

    public RetType forModDecl(ModDecl that) {
        RetType info_result = recur(that.getInfo());
        RetType name_result = recur(that.getName());
        RetType body_result = recur(that.getBody());
        return forModDeclOnly(that, info_result, name_result, body_result);
    }

    public RetType forModExpVarStmt(ModExpVarStmt that) {
        RetType info_result = recur(that.getInfo());
        List<RetType> vds_result = recurOnListOfVarDecl(that.getVds());
        return forModExpVarStmtOnly(that, info_result, vds_result);
    }

    public RetType forModExpFunDecl(ModExpFunDecl that) {
        RetType info_result = recur(that.getInfo());
        RetType fd_result = recur(that.getFd());
        return forModExpFunDeclOnly(that, info_result, fd_result);
    }

    public RetType forModExpGetter(ModExpGetter that) {
        RetType info_result = recur(that.getInfo());
        RetType fd_result = recur(that.getFd());
        return forModExpGetterOnly(that, info_result, fd_result);
    }

    public RetType forModExpSetter(ModExpSetter that) {
        RetType info_result = recur(that.getInfo());
        RetType fd_result = recur(that.getFd());
        return forModExpSetterOnly(that, info_result, fd_result);
    }

    public RetType forModExpSpecifiers(ModExpSpecifiers that) {
        RetType info_result = recur(that.getInfo());
        List<RetType> names_result = recurOnListOfModExpSpecifier(that.getNames());
        return forModExpSpecifiersOnly(that, info_result, names_result);
    }

    public RetType forModExpAssignment(ModExpAssignment that) {
        RetType info_result = recur(that.getInfo());
        RetType id_result = recur(that.getId());
        return forModExpAssignmentOnly(that, info_result, id_result);
    }

    public RetType forModImpDecl(ModImpDecl that) {
        RetType info_result = recur(that.getInfo());
        List<RetType> imports_result = recurOnListOfModImport(that.getImports());
        return forModImpDeclOnly(that, info_result, imports_result);
    }

    public RetType forExtImpDecl(ExtImpDecl that) {
        RetType info_result = recur(that.getInfo());
        RetType id_result = recur(that.getId());
        return forExtImpDeclOnly(that, info_result, id_result);
    }

    public RetType forTSImpDecl(TSImpDecl that) {
        RetType info_result = recur(that.getInfo());
        RetType id_result = recur(that.getId());
        RetType path_result = recur(that.getPath());
        return forTSImpDeclOnly(that, info_result, id_result, path_result);
    }

    public RetType forIntfDecl(IntfDecl that) {
        RetType info_result = recur(that.getInfo());
        RetType id_result = recur(that.getId());
        List<RetType> tps_result = recurOnListOfTypeParam(that.getTps());
        List<RetType> ext_result = recurOnListOfTypeRef(that.getExt());
        RetType typ_result = recur(that.getTyp());
        return forIntfDeclOnly(that, info_result, id_result, tps_result, ext_result, typ_result);
    }

    public RetType forAmbVarDecl(AmbVarDecl that) {
        RetType info_result = recur(that.getInfo());
        RetType id_result = recur(that.getId());
        Option<RetType> ty_result = recurOnOptionOfType(that.getTy());
        return forAmbVarDeclOnly(that, info_result, id_result, ty_result);
    }

    public RetType forAmbFunDecl(AmbFunDecl that) {
        RetType info_result = recur(that.getInfo());
        RetType id_result = recur(that.getId());
        RetType sig_result = recur(that.getSig());
        return forAmbFunDeclOnly(that, info_result, id_result, sig_result);
    }

    public RetType forAmbClsDecl(AmbClsDecl that) {
        RetType info_result = recur(that.getInfo());
        RetType id_result = recur(that.getId());
        List<RetType> tps_result = recurOnListOfTypeParam(that.getTps());
        Option<RetType> ext_result = recurOnOptionOfTypeRef(that.getExt());
        List<RetType> imp_result = recurOnListOfTypeRef(that.getImp());
        List<RetType> elts_result = recurOnListOfAmbClsElt(that.getElts());
        return forAmbClsDeclOnly(that, info_result, id_result, tps_result, ext_result, imp_result, elts_result);
    }

    public RetType forAmbEnumDecl(AmbEnumDecl that) {
        RetType info_result = recur(that.getInfo());
        RetType id_result = recur(that.getId());
        List<RetType> mem_result = recurOnListOfAmbEnumMem(that.getMem());
        return forAmbEnumDeclOnly(that, info_result, id_result, mem_result);
    }

    public RetType forAmbModDecl(AmbModDecl that) {
        RetType info_result = recur(that.getInfo());
        RetType path_result = recur(that.getPath());
        List<RetType> mem_result = recurOnListOfAmbModElt(that.getMem());
        return forAmbModDeclOnly(that, info_result, path_result, mem_result);
    }

    public RetType forAmbExtModDecl(AmbExtModDecl that) {
        RetType info_result = recur(that.getInfo());
        List<RetType> mem_result = recurOnListOfAmbExtModElt(that.getMem());
        return forAmbExtModDeclOnly(that, info_result, mem_result);
    }

    public RetType forNoOp(NoOp that) {
        RetType info_result = recur(that.getInfo());
        return forNoOpOnly(that, info_result);
    }

    public RetType forStmtUnit(StmtUnit that) {
        RetType info_result = recur(that.getInfo());
        List<RetType> stmts_result = recurOnListOfStmt(that.getStmts());
        return forStmtUnitOnly(that, info_result, stmts_result);
    }

    public RetType forFunDecl(FunDecl that) {
        RetType info_result = recur(that.getInfo());
        RetType ftn_result = recur(that.getFtn());
        return forFunDeclOnly(that, info_result, ftn_result);
    }

    public RetType forBlock(Block that) {
        RetType info_result = recur(that.getInfo());
        List<RetType> stmts_result = recurOnListOfStmt(that.getStmts());
        return forBlockOnly(that, info_result, stmts_result);
    }

    public RetType forVarStmt(VarStmt that) {
        RetType info_result = recur(that.getInfo());
        List<RetType> vds_result = recurOnListOfVarDecl(that.getVds());
        return forVarStmtOnly(that, info_result, vds_result);
    }

    public RetType forEmptyStmt(EmptyStmt that) {
        RetType info_result = recur(that.getInfo());
        return forEmptyStmtOnly(that, info_result);
    }

    public RetType forExprStmt(ExprStmt that) {
        RetType info_result = recur(that.getInfo());
        RetType expr_result = recur(that.getExpr());
        return forExprStmtOnly(that, info_result, expr_result);
    }

    public RetType forIf(If that) {
        RetType info_result = recur(that.getInfo());
        RetType cond_result = recur(that.getCond());
        RetType trueBranch_result = recur(that.getTrueBranch());
        Option<RetType> falseBranch_result = recurOnOptionOfStmt(that.getFalseBranch());
        return forIfOnly(that, info_result, cond_result, trueBranch_result, falseBranch_result);
    }

    public RetType forDoWhile(DoWhile that) {
        RetType info_result = recur(that.getInfo());
        RetType body_result = recur(that.getBody());
        RetType cond_result = recur(that.getCond());
        return forDoWhileOnly(that, info_result, body_result, cond_result);
    }

    public RetType forWhile(While that) {
        RetType info_result = recur(that.getInfo());
        RetType cond_result = recur(that.getCond());
        RetType body_result = recur(that.getBody());
        return forWhileOnly(that, info_result, cond_result, body_result);
    }

    public RetType forFor(For that) {
        RetType info_result = recur(that.getInfo());
        Option<RetType> init_result = recurOnOptionOfExpr(that.getInit());
        Option<RetType> cond_result = recurOnOptionOfExpr(that.getCond());
        Option<RetType> action_result = recurOnOptionOfExpr(that.getAction());
        RetType body_result = recur(that.getBody());
        return forForOnly(that, info_result, init_result, cond_result, action_result, body_result);
    }

    public RetType forForIn(ForIn that) {
        RetType info_result = recur(that.getInfo());
        RetType lhs_result = recur(that.getLhs());
        RetType expr_result = recur(that.getExpr());
        RetType body_result = recur(that.getBody());
        return forForInOnly(that, info_result, lhs_result, expr_result, body_result);
    }

    public RetType forForVar(ForVar that) {
        RetType info_result = recur(that.getInfo());
        List<RetType> vars_result = recurOnListOfVarDecl(that.getVars());
        Option<RetType> cond_result = recurOnOptionOfExpr(that.getCond());
        Option<RetType> action_result = recurOnOptionOfExpr(that.getAction());
        RetType body_result = recur(that.getBody());
        return forForVarOnly(that, info_result, vars_result, cond_result, action_result, body_result);
    }

    public RetType forForVarIn(ForVarIn that) {
        RetType info_result = recur(that.getInfo());
        RetType var_result = recur(that.getVar());
        RetType expr_result = recur(that.getExpr());
        RetType body_result = recur(that.getBody());
        return forForVarInOnly(that, info_result, var_result, expr_result, body_result);
    }

    public RetType forContinue(Continue that) {
        RetType info_result = recur(that.getInfo());
        Option<RetType> target_result = recurOnOptionOfLabel(that.getTarget());
        return forContinueOnly(that, info_result, target_result);
    }

    public RetType forBreak(Break that) {
        RetType info_result = recur(that.getInfo());
        Option<RetType> target_result = recurOnOptionOfLabel(that.getTarget());
        return forBreakOnly(that, info_result, target_result);
    }

    public RetType forReturn(Return that) {
        RetType info_result = recur(that.getInfo());
        Option<RetType> expr_result = recurOnOptionOfExpr(that.getExpr());
        return forReturnOnly(that, info_result, expr_result);
    }

    public RetType forWith(With that) {
        RetType info_result = recur(that.getInfo());
        RetType expr_result = recur(that.getExpr());
        RetType stmt_result = recur(that.getStmt());
        return forWithOnly(that, info_result, expr_result, stmt_result);
    }

    public RetType forSwitch(Switch that) {
        RetType info_result = recur(that.getInfo());
        RetType cond_result = recur(that.getCond());
        List<RetType> frontCases_result = recurOnListOfCase(that.getFrontCases());
        Option<List<RetType>> def_result = recurOnOptionOfListOfStmt(that.getDef());
        List<RetType> backCases_result = recurOnListOfCase(that.getBackCases());
        return forSwitchOnly(that, info_result, cond_result, frontCases_result, def_result, backCases_result);
    }

    public RetType forLabelStmt(LabelStmt that) {
        RetType info_result = recur(that.getInfo());
        RetType label_result = recur(that.getLabel());
        RetType stmt_result = recur(that.getStmt());
        return forLabelStmtOnly(that, info_result, label_result, stmt_result);
    }

    public RetType forThrow(Throw that) {
        RetType info_result = recur(that.getInfo());
        RetType expr_result = recur(that.getExpr());
        return forThrowOnly(that, info_result, expr_result);
    }

    public RetType forTry(Try that) {
        RetType info_result = recur(that.getInfo());
        List<RetType> body_result = recurOnListOfStmt(that.getBody());
        Option<RetType> catchBlock_result = recurOnOptionOfCatch(that.getCatchBlock());
        Option<List<RetType>> fin_result = recurOnOptionOfListOfStmt(that.getFin());
        return forTryOnly(that, info_result, body_result, catchBlock_result, fin_result);
    }

    public RetType forDebugger(Debugger that) {
        RetType info_result = recur(that.getInfo());
        return forDebuggerOnly(that, info_result);
    }

    public RetType forSourceElements(SourceElements that) {
        RetType info_result = recur(that.getInfo());
        List<RetType> body_result = recurOnListOfSourceElement(that.getBody());
        return forSourceElementsOnly(that, info_result, body_result);
    }

    public RetType forVarDecl(VarDecl that) {
        RetType info_result = recur(that.getInfo());
        RetType name_result = recur(that.getName());
        Option<RetType> expr_result = recurOnOptionOfExpr(that.getExpr());
        return forVarDeclOnly(that, info_result, name_result, expr_result);
    }

    public RetType forCase(Case that) {
        RetType info_result = recur(that.getInfo());
        RetType cond_result = recur(that.getCond());
        List<RetType> body_result = recurOnListOfStmt(that.getBody());
        return forCaseOnly(that, info_result, cond_result, body_result);
    }

    public RetType forCatch(Catch that) {
        RetType info_result = recur(that.getInfo());
        RetType id_result = recur(that.getId());
        List<RetType> body_result = recurOnListOfStmt(that.getBody());
        return forCatchOnly(that, info_result, id_result, body_result);
    }

    public RetType forModImpSpecifierSet(ModImpSpecifierSet that) {
        RetType info_result = recur(that.getInfo());
        List<RetType> imports_result = recurOnListOfModImpSpecifier(that.getImports());
        RetType module_result = recur(that.getModule());
        return forModImpSpecifierSetOnly(that, info_result, imports_result, module_result);
    }

    public RetType forModImpAliasClause(ModImpAliasClause that) {
        RetType info_result = recur(that.getInfo());
        RetType name_result = recur(that.getName());
        RetType alias_result = recur(that.getAlias());
        return forModImpAliasClauseOnly(that, info_result, name_result, alias_result);
    }

    public RetType forAmbCnstDecl(AmbCnstDecl that) {
        RetType info_result = recur(that.getInfo());
        List<RetType> ps_result = recurOnListOfParam(that.getPs());
        return forAmbCnstDeclOnly(that, info_result, ps_result);
    }

    public RetType forAmbMemDecl(AmbMemDecl that) {
        RetType info_result = recur(that.getInfo());
        List<RetType> mods_result = recurOnListOfModifier(that.getMods());
        RetType prop_result = recur(that.getProp());
        Option<RetType> typ_result = recurOnOptionOfType(that.getTyp());
        return forAmbMemDeclOnly(that, info_result, mods_result, prop_result, typ_result);
    }

    public RetType forAmbIndDecl(AmbIndDecl that) {
        RetType info_result = recur(that.getInfo());
        RetType ind_result = recur(that.getInd());
        return forAmbIndDeclOnly(that, info_result, ind_result);
    }

    public RetType forAmbEnumMem(AmbEnumMem that) {
        RetType info_result = recur(that.getInfo());
        RetType prop_result = recur(that.getProp());
        Option<RetType> num_result = recurOnOptionOfNumberLiteral(that.getNum());
        return forAmbEnumMemOnly(that, info_result, prop_result, num_result);
    }

    public RetType forAmbModElt(AmbModElt that) {
        RetType info_result = recur(that.getInfo());
        RetType decl_result = recur(that.getDecl());
        return forAmbModEltOnly(that, info_result, decl_result);
    }

    public RetType forAmbExtModElt(AmbExtModElt that) {
        RetType info_result = recur(that.getInfo());
        RetType decl_result = recur(that.getDecl());
        return forAmbExtModEltOnly(that, info_result, decl_result);
    }

    public RetType forExprList(ExprList that) {
        RetType info_result = recur(that.getInfo());
        List<RetType> exprs_result = recurOnListOfExpr(that.getExprs());
        return forExprListOnly(that, info_result, exprs_result);
    }

    public RetType forCond(Cond that) {
        RetType info_result = recur(that.getInfo());
        RetType cond_result = recur(that.getCond());
        RetType trueBranch_result = recur(that.getTrueBranch());
        RetType falseBranch_result = recur(that.getFalseBranch());
        return forCondOnly(that, info_result, cond_result, trueBranch_result, falseBranch_result);
    }

    public RetType forInfixOpApp(InfixOpApp that) {
        RetType info_result = recur(that.getInfo());
        RetType left_result = recur(that.getLeft());
        RetType op_result = recur(that.getOp());
        RetType right_result = recur(that.getRight());
        return forInfixOpAppOnly(that, info_result, left_result, op_result, right_result);
    }

    public RetType forPrefixOpApp(PrefixOpApp that) {
        RetType info_result = recur(that.getInfo());
        RetType op_result = recur(that.getOp());
        RetType right_result = recur(that.getRight());
        return forPrefixOpAppOnly(that, info_result, op_result, right_result);
    }

    public RetType forUnaryAssignOpApp(UnaryAssignOpApp that) {
        RetType info_result = recur(that.getInfo());
        RetType lhs_result = recur(that.getLhs());
        RetType op_result = recur(that.getOp());
        return forUnaryAssignOpAppOnly(that, info_result, lhs_result, op_result);
    }

    public RetType forAssignOpApp(AssignOpApp that) {
        RetType info_result = recur(that.getInfo());
        RetType lhs_result = recur(that.getLhs());
        RetType op_result = recur(that.getOp());
        RetType right_result = recur(that.getRight());
        return forAssignOpAppOnly(that, info_result, lhs_result, op_result, right_result);
    }

    public RetType forThis(This that) {
        RetType info_result = recur(that.getInfo());
        return forThisOnly(that, info_result);
    }

    public RetType forNull(Null that) {
        RetType info_result = recur(that.getInfo());
        return forNullOnly(that, info_result);
    }

    public RetType forBool(Bool that) {
        RetType info_result = recur(that.getInfo());
        return forBoolOnly(that, info_result);
    }

    public RetType forDoubleLiteral(DoubleLiteral that) {
        RetType info_result = recur(that.getInfo());
        return forDoubleLiteralOnly(that, info_result);
    }

    public RetType forIntLiteral(IntLiteral that) {
        RetType info_result = recur(that.getInfo());
        return forIntLiteralOnly(that, info_result);
    }

    public RetType forStringLiteral(StringLiteral that) {
        RetType info_result = recur(that.getInfo());
        return forStringLiteralOnly(that, info_result);
    }

    public RetType forRegularExpression(RegularExpression that) {
        RetType info_result = recur(that.getInfo());
        return forRegularExpressionOnly(that, info_result);
    }

    public RetType forVarRef(VarRef that) {
        RetType info_result = recur(that.getInfo());
        RetType id_result = recur(that.getId());
        return forVarRefOnly(that, info_result, id_result);
    }

    public RetType forArrayExpr(ArrayExpr that) {
        RetType info_result = recur(that.getInfo());
        List<Option<RetType>> elements_result = recurOnListOfOptionOfExpr(that.getElements());
        return forArrayExprOnly(that, info_result, elements_result);
    }

    public RetType forArrayNumberExpr(ArrayNumberExpr that) {
        RetType info_result = recur(that.getInfo());
        return forArrayNumberExprOnly(that, info_result);
    }

    public RetType forObjectExpr(ObjectExpr that) {
        RetType info_result = recur(that.getInfo());
        List<RetType> members_result = recurOnListOfMember(that.getMembers());
        return forObjectExprOnly(that, info_result, members_result);
    }

    public RetType forParenthesized(Parenthesized that) {
        RetType info_result = recur(that.getInfo());
        RetType expr_result = recur(that.getExpr());
        return forParenthesizedOnly(that, info_result, expr_result);
    }

    public RetType forFunExpr(FunExpr that) {
        RetType info_result = recur(that.getInfo());
        RetType ftn_result = recur(that.getFtn());
        return forFunExprOnly(that, info_result, ftn_result);
    }

    public RetType forBracket(Bracket that) {
        RetType info_result = recur(that.getInfo());
        RetType obj_result = recur(that.getObj());
        RetType index_result = recur(that.getIndex());
        return forBracketOnly(that, info_result, obj_result, index_result);
    }

    public RetType forDot(Dot that) {
        RetType info_result = recur(that.getInfo());
        RetType obj_result = recur(that.getObj());
        RetType member_result = recur(that.getMember());
        return forDotOnly(that, info_result, obj_result, member_result);
    }

    public RetType forNew(New that) {
        RetType info_result = recur(that.getInfo());
        RetType lhs_result = recur(that.getLhs());
        return forNewOnly(that, info_result, lhs_result);
    }

    public RetType forFunApp(FunApp that) {
        RetType info_result = recur(that.getInfo());
        RetType fun_result = recur(that.getFun());
        List<RetType> args_result = recurOnListOfExpr(that.getArgs());
        return forFunAppOnly(that, info_result, fun_result, args_result);
    }

    public RetType forPropId(PropId that) {
        RetType info_result = recur(that.getInfo());
        RetType id_result = recur(that.getId());
        return forPropIdOnly(that, info_result, id_result);
    }

    public RetType forPropStr(PropStr that) {
        RetType info_result = recur(that.getInfo());
        return forPropStrOnly(that, info_result);
    }

    public RetType forPropNum(PropNum that) {
        RetType info_result = recur(that.getInfo());
        RetType num_result = recur(that.getNum());
        return forPropNumOnly(that, info_result, num_result);
    }

    public RetType forField(Field that) {
        RetType info_result = recur(that.getInfo());
        RetType prop_result = recur(that.getProp());
        RetType expr_result = recur(that.getExpr());
        return forFieldOnly(that, info_result, prop_result, expr_result);
    }

    public RetType forGetProp(GetProp that) {
        RetType info_result = recur(that.getInfo());
        RetType prop_result = recur(that.getProp());
        RetType ftn_result = recur(that.getFtn());
        return forGetPropOnly(that, info_result, prop_result, ftn_result);
    }

    public RetType forSetProp(SetProp that) {
        RetType info_result = recur(that.getInfo());
        RetType prop_result = recur(that.getProp());
        RetType ftn_result = recur(that.getFtn());
        return forSetPropOnly(that, info_result, prop_result, ftn_result);
    }

    public RetType forId(Id that) {
        RetType info_result = recur(that.getInfo());
        return forIdOnly(that, info_result);
    }

    public RetType forOp(Op that) {
        RetType info_result = recur(that.getInfo());
        return forOpOnly(that, info_result);
    }

    public RetType forTypeName(TypeName that) {
        RetType info_result = recur(that.getInfo());
        List<RetType> names_result = recurOnListOfId(that.getNames());
        return forTypeNameOnly(that, info_result, names_result);
    }

    public RetType forAnonymousFnName(AnonymousFnName that) {
        RetType info_result = recur(that.getInfo());
        return forAnonymousFnNameOnly(that, info_result);
    }

    public RetType forPath(Path that) {
        RetType info_result = recur(that.getInfo());
        List<RetType> names_result = recurOnListOfId(that.getNames());
        return forPathOnly(that, info_result, names_result);
    }

    public RetType forModExpStarFromPath(ModExpStarFromPath that) {
        RetType info_result = recur(that.getInfo());
        RetType module_result = recur(that.getModule());
        return forModExpStarFromPathOnly(that, info_result, module_result);
    }

    public RetType forModExpStar(ModExpStar that) {
        RetType info_result = recur(that.getInfo());
        return forModExpStarOnly(that, info_result);
    }

    public RetType forModExpAlias(ModExpAlias that) {
        RetType info_result = recur(that.getInfo());
        RetType name_result = recur(that.getName());
        RetType alias_result = recur(that.getAlias());
        return forModExpAliasOnly(that, info_result, name_result, alias_result);
    }

    public RetType forModExpName(ModExpName that) {
        RetType info_result = recur(that.getInfo());
        RetType name_result = recur(that.getName());
        return forModExpNameOnly(that, info_result, name_result);
    }

    public RetType forModImpAlias(ModImpAlias that) {
        RetType info_result = recur(that.getInfo());
        RetType name_result = recur(that.getName());
        RetType alias_result = recur(that.getAlias());
        return forModImpAliasOnly(that, info_result, name_result, alias_result);
    }

    public RetType forModImpName(ModImpName that) {
        RetType info_result = recur(that.getInfo());
        RetType name_result = recur(that.getName());
        return forModImpNameOnly(that, info_result, name_result);
    }

    public RetType forLabel(Label that) {
        RetType info_result = recur(that.getInfo());
        RetType id_result = recur(that.getId());
        return forLabelOnly(that, info_result, id_result);
    }

    public RetType forComment(Comment that) {
        RetType info_result = recur(that.getInfo());
        return forCommentOnly(that, info_result);
    }

    public RetType forParam(Param that) {
        RetType info_result = recur(that.getInfo());
        RetType name_result = recur(that.getName());
        Option<RetType> mod_result = recurOnOptionOfModifier(that.getMod());
        Option<RetType> typ_result = recurOnOptionOfType(that.getTyp());
        Option<RetType> defaultExpr_result = recurOnOptionOfExpr(that.getDefaultExpr());
        return forParamOnly(that, info_result, name_result, mod_result, typ_result, defaultExpr_result);
    }

    public RetType forAnyT(AnyT that) {
        RetType info_result = recur(that.getInfo());
        return forAnyTOnly(that, info_result);
    }

    public RetType forNumberT(NumberT that) {
        RetType info_result = recur(that.getInfo());
        return forNumberTOnly(that, info_result);
    }

    public RetType forBoolT(BoolT that) {
        RetType info_result = recur(that.getInfo());
        return forBoolTOnly(that, info_result);
    }

    public RetType forStringT(StringT that) {
        RetType info_result = recur(that.getInfo());
        return forStringTOnly(that, info_result);
    }

    public RetType forVoidT(VoidT that) {
        RetType info_result = recur(that.getInfo());
        return forVoidTOnly(that, info_result);
    }

    public RetType forTypeRef(TypeRef that) {
        RetType info_result = recur(that.getInfo());
        RetType name_result = recur(that.getName());
        List<RetType> args_result = recurOnListOfType(that.getArgs());
        return forTypeRefOnly(that, info_result, name_result, args_result);
    }

    public RetType forTypeQuery(TypeQuery that) {
        RetType info_result = recur(that.getInfo());
        RetType path_result = recur(that.getPath());
        return forTypeQueryOnly(that, info_result, path_result);
    }

    public RetType forObjectType(ObjectType that) {
        RetType info_result = recur(that.getInfo());
        List<RetType> members_result = recurOnListOfTypeMember(that.getMembers());
        return forObjectTypeOnly(that, info_result, members_result);
    }

    public RetType forArrayType(ArrayType that) {
        RetType info_result = recur(that.getInfo());
        RetType typ_result = recur(that.getTyp());
        return forArrayTypeOnly(that, info_result, typ_result);
    }

    public RetType forFunctionType(FunctionType that) {
        RetType info_result = recur(that.getInfo());
        List<RetType> tparams_result = recurOnListOfTypeParam(that.getTparams());
        List<RetType> params_result = recurOnListOfParam(that.getParams());
        RetType typ_result = recur(that.getTyp());
        return forFunctionTypeOnly(that, info_result, tparams_result, params_result, typ_result);
    }

    public RetType forConstructorType(ConstructorType that) {
        RetType info_result = recur(that.getInfo());
        List<RetType> tparams_result = recurOnListOfTypeParam(that.getTparams());
        List<RetType> params_result = recurOnListOfParam(that.getParams());
        RetType typ_result = recur(that.getTyp());
        return forConstructorTypeOnly(that, info_result, tparams_result, params_result, typ_result);
    }

    public RetType forExprType(ExprType that) {
        RetType info_result = recur(that.getInfo());
        return forExprTypeOnly(that, info_result);
    }

    public RetType forPropertySig(PropertySig that) {
        RetType info_result = recur(that.getInfo());
        RetType prop_result = recur(that.getProp());
        Option<RetType> typ_result = recurOnOptionOfType(that.getTyp());
        return forPropertySigOnly(that, info_result, prop_result, typ_result);
    }

    public RetType forCallSig(CallSig that) {
        RetType info_result = recur(that.getInfo());
        List<RetType> tparams_result = recurOnListOfTypeParam(that.getTparams());
        List<RetType> params_result = recurOnListOfParam(that.getParams());
        Option<RetType> typ_result = recurOnOptionOfType(that.getTyp());
        return forCallSigOnly(that, info_result, tparams_result, params_result, typ_result);
    }

    public RetType forConstructSig(ConstructSig that) {
        RetType info_result = recur(that.getInfo());
        List<RetType> tparams_result = recurOnListOfTypeParam(that.getTparams());
        List<RetType> params_result = recurOnListOfParam(that.getParams());
        Option<RetType> typ_result = recurOnOptionOfType(that.getTyp());
        return forConstructSigOnly(that, info_result, tparams_result, params_result, typ_result);
    }

    public RetType forIndexSig(IndexSig that) {
        RetType info_result = recur(that.getInfo());
        RetType id_result = recur(that.getId());
        RetType annot_result = recur(that.getAnnot());
        return forIndexSigOnly(that, info_result, id_result, annot_result);
    }

    public RetType forMethodSig(MethodSig that) {
        RetType info_result = recur(that.getInfo());
        RetType prop_result = recur(that.getProp());
        RetType sig_result = recur(that.getSig());
        return forMethodSigOnly(that, info_result, prop_result, sig_result);
    }

    public RetType forTypeParam(TypeParam that) {
        RetType info_result = recur(that.getInfo());
        RetType name_result = recur(that.getName());
        Option<RetType> ext_result = recurOnOptionOfType(that.getExt());
        return forTypeParamOnly(that, info_result, name_result, ext_result);
    }

    public RetType forTopLevel(TopLevel that) {
        List<RetType> fds_result = recurOnListOfFunDecl(that.getFds());
        List<RetType> vds_result = recurOnListOfVarDecl(that.getVds());
        List<RetType> stmts_result = recurOnListOfSourceElements(that.getStmts());
        return forTopLevelOnly(that, fds_result, vds_result, stmts_result);
    }

    public RetType forFunctional(Functional that) {
        List<RetType> fds_result = recurOnListOfFunDecl(that.getFds());
        List<RetType> vds_result = recurOnListOfVarDecl(that.getVds());
        RetType stmts_result = recur(that.getStmts());
        RetType name_result = recur(that.getName());
        List<RetType> params_result = recurOnListOfId(that.getParams());
        return forFunctionalOnly(that, fds_result, vds_result, stmts_result, name_result, params_result);
    }

    public RetType forASTSpanInfo(ASTSpanInfo that) {
        Option<RetType> comment_result = recurOnOptionOfComment(that.getComment());
        return forASTSpanInfoOnly(that, comment_result);
    }

    public RetType forPublicMod(PublicMod that) {
        return forPublicModOnly(that);
    }

    public RetType forPrivateMod(PrivateMod that) {
        return forPrivateModOnly(that);
    }

    public RetType forStaticMod(StaticMod that) {
        return forStaticModOnly(that);
    }


    public RetType recur(Node that) {
        return that.accept(this);
    }


    public List<RetType> recurOnListOfVarDecl(List<VarDecl> that) {
        java.util.ArrayList<RetType> accum = new java.util.ArrayList<RetType>(that.size());
        for (VarDecl elt : that) {
            accum.add(recur(elt));
        }
        return accum;
    }

    public List<RetType> recurOnListOfModExpSpecifier(List<ModExpSpecifier> that) {
        java.util.ArrayList<RetType> accum = new java.util.ArrayList<RetType>(that.size());
        for (ModExpSpecifier elt : that) {
            accum.add(recur(elt));
        }
        return accum;
    }

    public List<RetType> recurOnListOfModImport(List<ModImport> that) {
        java.util.ArrayList<RetType> accum = new java.util.ArrayList<RetType>(that.size());
        for (ModImport elt : that) {
            accum.add(recur(elt));
        }
        return accum;
    }

    public List<RetType> recurOnListOfTypeParam(List<TypeParam> that) {
        java.util.ArrayList<RetType> accum = new java.util.ArrayList<RetType>(that.size());
        for (TypeParam elt : that) {
            accum.add(recur(elt));
        }
        return accum;
    }

    public List<RetType> recurOnListOfTypeRef(List<TypeRef> that) {
        java.util.ArrayList<RetType> accum = new java.util.ArrayList<RetType>(that.size());
        for (TypeRef elt : that) {
            accum.add(recur(elt));
        }
        return accum;
    }

    public Option<RetType> recurOnOptionOfType(Option<Type> that) {
        if (that.isNone()) return Option.<RetType>none();
        else return Option.<RetType>some(recur(that.unwrap()));
    }

    public Option<RetType> recurOnOptionOfTypeRef(Option<TypeRef> that) {
        if (that.isNone()) return Option.<RetType>none();
        else return Option.<RetType>some(recur(that.unwrap()));
    }

    public List<RetType> recurOnListOfAmbClsElt(List<AmbClsElt> that) {
        java.util.ArrayList<RetType> accum = new java.util.ArrayList<RetType>(that.size());
        for (AmbClsElt elt : that) {
            accum.add(recur(elt));
        }
        return accum;
    }

    public List<RetType> recurOnListOfAmbEnumMem(List<AmbEnumMem> that) {
        java.util.ArrayList<RetType> accum = new java.util.ArrayList<RetType>(that.size());
        for (AmbEnumMem elt : that) {
            accum.add(recur(elt));
        }
        return accum;
    }

    public List<RetType> recurOnListOfAmbModElt(List<AmbModElt> that) {
        java.util.ArrayList<RetType> accum = new java.util.ArrayList<RetType>(that.size());
        for (AmbModElt elt : that) {
            accum.add(recur(elt));
        }
        return accum;
    }

    public List<RetType> recurOnListOfAmbExtModElt(List<AmbExtModElt> that) {
        java.util.ArrayList<RetType> accum = new java.util.ArrayList<RetType>(that.size());
        for (AmbExtModElt elt : that) {
            accum.add(recur(elt));
        }
        return accum;
    }

    public List<RetType> recurOnListOfStmt(List<Stmt> that) {
        java.util.ArrayList<RetType> accum = new java.util.ArrayList<RetType>(that.size());
        for (Stmt elt : that) {
            accum.add(recur(elt));
        }
        return accum;
    }

    public Option<RetType> recurOnOptionOfStmt(Option<Stmt> that) {
        if (that.isNone()) return Option.<RetType>none();
        else return Option.<RetType>some(recur(that.unwrap()));
    }

    public Option<RetType> recurOnOptionOfExpr(Option<Expr> that) {
        if (that.isNone()) return Option.<RetType>none();
        else return Option.<RetType>some(recur(that.unwrap()));
    }

    public Option<RetType> recurOnOptionOfLabel(Option<Label> that) {
        if (that.isNone()) return Option.<RetType>none();
        else return Option.<RetType>some(recur(that.unwrap()));
    }

    public List<RetType> recurOnListOfCase(List<Case> that) {
        java.util.ArrayList<RetType> accum = new java.util.ArrayList<RetType>(that.size());
        for (Case elt : that) {
            accum.add(recur(elt));
        }
        return accum;
    }

    public Option<List<RetType>> recurOnOptionOfListOfStmt(Option<List<Stmt>> that) {
        if (that.isNone()) return Option.<List<RetType>>none();
        else return Option.<List<RetType>>some(recurOnListOfStmt(that.unwrap()));
    }

    public Option<RetType> recurOnOptionOfCatch(Option<Catch> that) {
        if (that.isNone()) return Option.<RetType>none();
        else return Option.<RetType>some(recur(that.unwrap()));
    }

    public List<RetType> recurOnListOfSourceElement(List<SourceElement> that) {
        java.util.ArrayList<RetType> accum = new java.util.ArrayList<RetType>(that.size());
        for (SourceElement elt : that) {
            accum.add(recur(elt));
        }
        return accum;
    }

    public List<RetType> recurOnListOfModImpSpecifier(List<ModImpSpecifier> that) {
        java.util.ArrayList<RetType> accum = new java.util.ArrayList<RetType>(that.size());
        for (ModImpSpecifier elt : that) {
            accum.add(recur(elt));
        }
        return accum;
    }

    public List<RetType> recurOnListOfParam(List<Param> that) {
        java.util.ArrayList<RetType> accum = new java.util.ArrayList<RetType>(that.size());
        for (Param elt : that) {
            accum.add(recur(elt));
        }
        return accum;
    }

    public List<RetType> recurOnListOfModifier(List<Modifier> that) {
        java.util.ArrayList<RetType> accum = new java.util.ArrayList<RetType>(that.size());
        for (Modifier elt : that) {
            accum.add(recur(elt));
        }
        return accum;
    }

    public Option<RetType> recurOnOptionOfNumberLiteral(Option<NumberLiteral> that) {
        if (that.isNone()) return Option.<RetType>none();
        else return Option.<RetType>some(recur(that.unwrap()));
    }

    public List<RetType> recurOnListOfExpr(List<Expr> that) {
        java.util.ArrayList<RetType> accum = new java.util.ArrayList<RetType>(that.size());
        for (Expr elt : that) {
            accum.add(recur(elt));
        }
        return accum;
    }

    public List<Option<RetType>> recurOnListOfOptionOfExpr(List<Option<Expr>> that) {
        java.util.ArrayList<Option<RetType>> accum = new java.util.ArrayList<Option<RetType>>(that.size());
        for (Option<Expr> elt : that) {
            accum.add(recurOnOptionOfExpr(elt));
        }
        return accum;
    }

    public List<RetType> recurOnListOfMember(List<Member> that) {
        java.util.ArrayList<RetType> accum = new java.util.ArrayList<RetType>(that.size());
        for (Member elt : that) {
            accum.add(recur(elt));
        }
        return accum;
    }

    public List<RetType> recurOnListOfId(List<Id> that) {
        java.util.ArrayList<RetType> accum = new java.util.ArrayList<RetType>(that.size());
        for (Id elt : that) {
            accum.add(recur(elt));
        }
        return accum;
    }

    public Option<RetType> recurOnOptionOfModifier(Option<Modifier> that) {
        if (that.isNone()) return Option.<RetType>none();
        else return Option.<RetType>some(recur(that.unwrap()));
    }

    public List<RetType> recurOnListOfType(List<Type> that) {
        java.util.ArrayList<RetType> accum = new java.util.ArrayList<RetType>(that.size());
        for (Type elt : that) {
            accum.add(recur(elt));
        }
        return accum;
    }

    public List<RetType> recurOnListOfTypeMember(List<TypeMember> that) {
        java.util.ArrayList<RetType> accum = new java.util.ArrayList<RetType>(that.size());
        for (TypeMember elt : that) {
            accum.add(recur(elt));
        }
        return accum;
    }

    public List<RetType> recurOnListOfFunDecl(List<FunDecl> that) {
        java.util.ArrayList<RetType> accum = new java.util.ArrayList<RetType>(that.size());
        for (FunDecl elt : that) {
            accum.add(recur(elt));
        }
        return accum;
    }

    public List<RetType> recurOnListOfSourceElements(List<SourceElements> that) {
        java.util.ArrayList<RetType> accum = new java.util.ArrayList<RetType>(that.size());
        for (SourceElements elt : that) {
            accum.add(recur(elt));
        }
        return accum;
    }

    public Option<RetType> recurOnOptionOfComment(Option<Comment> that) {
        if (that.isNone()) return Option.<RetType>none();
        else return Option.<RetType>some(recur(that.unwrap()));
    }
}
