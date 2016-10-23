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

/** A parametric abstract implementation of a visitor over AbstractNode that returns a value.
 ** This visitor implements the visitor interface with methods that
 ** first visit children, and then call forCASEOnly(), passing in
 ** the values of the visits of the children. (CASE is replaced by the case name.)
 ** By default, each of forCASEOnly delegates to a more general case; at the
 ** top of this delegation tree is defaultCase(), which (unless overridden)
 ** throws an exception.
 **/
@SuppressWarnings({"unused", "unchecked"})
public abstract class AbstractNodeDepthFirstVisitor<RetType> extends AbstractNodeVisitorLambda<RetType> {
    /**
     * This method is run for all cases that are not handled elsewhere.
     * By default, an exception is thrown; subclasses may override this behavior.
     * @throws IllegalArgumentException
    **/
    public RetType defaultCase(AbstractNode that) {
        throw new IllegalArgumentException("Visitor " + getClass().getName() + " does not support visiting values of type " + that.getClass().getName());
    }

    /* Methods to handle a node after recursion. */
    public RetType forAbstractNodeOnly(AbstractNode that) {
        return defaultCase(that);
    }

    public RetType forProgramOnly(Program that) {
        return forAbstractNodeOnly(that);
    }

    public RetType forSourceElementOnly(SourceElement that) {
        return forAbstractNodeOnly(that);
    }

    public RetType forModuleOnly(Module that) {
        return forSourceElementOnly(that);
    }

    public RetType forModDeclOnly(ModDecl that, RetType name_result) {
        return forModuleOnly(that);
    }

    public RetType forModExportOnly(ModExport that) {
        return forModuleOnly(that);
    }

    public RetType forModExpVarStmtOnly(ModExpVarStmt that, List<RetType> vds_result) {
        return forModExportOnly(that);
    }

    public RetType forModExpFunDeclOnly(ModExpFunDecl that, RetType fd_result) {
        return forModExportOnly(that);
    }

    public RetType forModExpGetterOnly(ModExpGetter that, RetType fd_result) {
        return forModExportOnly(that);
    }

    public RetType forModExpSetterOnly(ModExpSetter that, RetType fd_result) {
        return forModExportOnly(that);
    }

    public RetType forModExpSpecifiersOnly(ModExpSpecifiers that, List<RetType> names_result) {
        return forModExportOnly(that);
    }

    public RetType forModExpAssignmentOnly(ModExpAssignment that, RetType id_result) {
        return forModExportOnly(that);
    }

    public RetType forModImpDeclOnly(ModImpDecl that, List<RetType> imports_result) {
        return forSourceElementOnly(that);
    }

    public RetType forExtImpDeclOnly(ExtImpDecl that, RetType id_result) {
        return forSourceElementOnly(that);
    }

    public RetType forTSImpDeclOnly(TSImpDecl that, RetType id_result, RetType path_result) {
        return forSourceElementOnly(that);
    }

    public RetType forIntfDeclOnly(IntfDecl that, RetType id_result, List<RetType> tps_result, List<RetType> ext_result, RetType typ_result) {
        return forSourceElementOnly(that);
    }

    public RetType forAmbDeclOnly(AmbDecl that) {
        return forSourceElementOnly(that);
    }

    public RetType forAmbVarDeclOnly(AmbVarDecl that, RetType id_result, Option<RetType> ty_result) {
        return forAmbDeclOnly(that);
    }

    public RetType forAmbFunDeclOnly(AmbFunDecl that, RetType id_result, RetType sig_result) {
        return forAmbDeclOnly(that);
    }

    public RetType forAmbClsDeclOnly(AmbClsDecl that, RetType id_result, List<RetType> tps_result, Option<RetType> ext_result, List<RetType> imp_result, List<RetType> elts_result) {
        return forAmbDeclOnly(that);
    }

    public RetType forAmbEnumDeclOnly(AmbEnumDecl that, RetType id_result, List<RetType> mem_result) {
        return forAmbDeclOnly(that);
    }

    public RetType forAmbModDeclOnly(AmbModDecl that, RetType path_result, List<RetType> mem_result) {
        return forAmbDeclOnly(that);
    }

    public RetType forAmbExtModDeclOnly(AmbExtModDecl that, List<RetType> mem_result) {
        return forAmbDeclOnly(that);
    }

    public RetType forStmtOnly(Stmt that) {
        return forSourceElementOnly(that);
    }

    public RetType forNoOpOnly(NoOp that) {
        return forStmtOnly(that);
    }

    public RetType forStmtUnitOnly(StmtUnit that, List<RetType> stmts_result) {
        return forStmtOnly(that);
    }

    public RetType forFunDeclOnly(FunDecl that) {
        return forStmtOnly(that);
    }

    public RetType forBlockOnly(Block that, List<RetType> stmts_result) {
        return forStmtOnly(that);
    }

    public RetType forVarStmtOnly(VarStmt that, List<RetType> vds_result) {
        return forStmtOnly(that);
    }

    public RetType forEmptyStmtOnly(EmptyStmt that) {
        return forStmtOnly(that);
    }

    public RetType forExprStmtOnly(ExprStmt that, RetType expr_result) {
        return forStmtOnly(that);
    }

    public RetType forIfOnly(If that, RetType cond_result, RetType trueBranch_result, Option<RetType> falseBranch_result) {
        return forStmtOnly(that);
    }

    public RetType forDoWhileOnly(DoWhile that, RetType body_result, RetType cond_result) {
        return forStmtOnly(that);
    }

    public RetType forWhileOnly(While that, RetType cond_result, RetType body_result) {
        return forStmtOnly(that);
    }

    public RetType forForOnly(For that, Option<RetType> init_result, Option<RetType> cond_result, Option<RetType> action_result, RetType body_result) {
        return forStmtOnly(that);
    }

    public RetType forForInOnly(ForIn that, RetType lhs_result, RetType expr_result, RetType body_result) {
        return forStmtOnly(that);
    }

    public RetType forForVarOnly(ForVar that, List<RetType> vars_result, Option<RetType> cond_result, Option<RetType> action_result, RetType body_result) {
        return forStmtOnly(that);
    }

    public RetType forForVarInOnly(ForVarIn that, RetType var_result, RetType expr_result, RetType body_result) {
        return forStmtOnly(that);
    }

    public RetType forContinueOnly(Continue that, Option<RetType> target_result) {
        return forStmtOnly(that);
    }

    public RetType forBreakOnly(Break that, Option<RetType> target_result) {
        return forStmtOnly(that);
    }

    public RetType forReturnOnly(Return that, Option<RetType> expr_result) {
        return forStmtOnly(that);
    }

    public RetType forWithOnly(With that, RetType expr_result, RetType stmt_result) {
        return forStmtOnly(that);
    }

    public RetType forSwitchOnly(Switch that, RetType cond_result, List<RetType> frontCases_result, Option<List<RetType>> def_result, List<RetType> backCases_result) {
        return forStmtOnly(that);
    }

    public RetType forLabelStmtOnly(LabelStmt that, RetType label_result, RetType stmt_result) {
        return forStmtOnly(that);
    }

    public RetType forThrowOnly(Throw that, RetType expr_result) {
        return forStmtOnly(that);
    }

    public RetType forTryOnly(Try that, List<RetType> body_result, Option<RetType> catchBlock_result, Option<List<RetType>> fin_result) {
        return forStmtOnly(that);
    }

    public RetType forDebuggerOnly(Debugger that) {
        return forStmtOnly(that);
    }

    public RetType forSourceElementsOnly(SourceElements that, List<RetType> body_result) {
        return forAbstractNodeOnly(that);
    }

    public RetType forVarDeclOnly(VarDecl that, RetType name_result, Option<RetType> expr_result) {
        return forAbstractNodeOnly(that);
    }

    public RetType forCaseOnly(Case that, RetType cond_result, List<RetType> body_result) {
        return forAbstractNodeOnly(that);
    }

    public RetType forCatchOnly(Catch that, RetType id_result, List<RetType> body_result) {
        return forAbstractNodeOnly(that);
    }

    public RetType forModImportOnly(ModImport that) {
        return forAbstractNodeOnly(that);
    }

    public RetType forModImpSpecifierSetOnly(ModImpSpecifierSet that, List<RetType> imports_result, RetType module_result) {
        return forModImportOnly(that);
    }

    public RetType forModImpAliasClauseOnly(ModImpAliasClause that, RetType name_result, RetType alias_result) {
        return forModImportOnly(that);
    }

    public RetType forAmbClsEltOnly(AmbClsElt that) {
        return forAbstractNodeOnly(that);
    }

    public RetType forAmbCnstDeclOnly(AmbCnstDecl that, List<RetType> ps_result) {
        return forAmbClsEltOnly(that);
    }

    public RetType forAmbMemDeclOnly(AmbMemDecl that, RetType prop_result, Option<RetType> typ_result) {
        return forAmbClsEltOnly(that);
    }

    public RetType forAmbIndDeclOnly(AmbIndDecl that, RetType ind_result) {
        return forAmbClsEltOnly(that);
    }

    public RetType forAmbEnumMemOnly(AmbEnumMem that, RetType prop_result, Option<RetType> num_result) {
        return forAbstractNodeOnly(that);
    }

    public RetType forAmbModEltOnly(AmbModElt that, RetType decl_result) {
        return forAbstractNodeOnly(that);
    }

    public RetType forAmbExtModEltOnly(AmbExtModElt that, RetType decl_result) {
        return forAbstractNodeOnly(that);
    }

    public RetType forExprOnly(Expr that) {
        return forAbstractNodeOnly(that);
    }

    public RetType forExprListOnly(ExprList that, List<RetType> exprs_result) {
        return forExprOnly(that);
    }

    public RetType forCondOnly(Cond that, RetType cond_result, RetType trueBranch_result, RetType falseBranch_result) {
        return forExprOnly(that);
    }

    public RetType forInfixOpAppOnly(InfixOpApp that, RetType left_result, RetType op_result, RetType right_result) {
        return forExprOnly(that);
    }

    public RetType forPrefixOpAppOnly(PrefixOpApp that, RetType op_result, RetType right_result) {
        return forExprOnly(that);
    }

    public RetType forUnaryAssignOpAppOnly(UnaryAssignOpApp that, RetType lhs_result, RetType op_result) {
        return forExprOnly(that);
    }

    public RetType forAssignOpAppOnly(AssignOpApp that, RetType lhs_result, RetType op_result, RetType right_result) {
        return forExprOnly(that);
    }

    public RetType forLHSOnly(LHS that) {
        return forExprOnly(that);
    }

    public RetType forLiteralOnly(Literal that) {
        return forLHSOnly(that);
    }

    public RetType forThisOnly(This that) {
        return forLiteralOnly(that);
    }

    public RetType forNullOnly(Null that) {
        return forLiteralOnly(that);
    }

    public RetType forBoolOnly(Bool that) {
        return forLiteralOnly(that);
    }

    public RetType forNumberLiteralOnly(NumberLiteral that) {
        return forLiteralOnly(that);
    }

    public RetType forDoubleLiteralOnly(DoubleLiteral that) {
        return forNumberLiteralOnly(that);
    }

    public RetType forIntLiteralOnly(IntLiteral that) {
        return forNumberLiteralOnly(that);
    }

    public RetType forStringLiteralOnly(StringLiteral that) {
        return forLiteralOnly(that);
    }

    public RetType forRegularExpressionOnly(RegularExpression that) {
        return forLiteralOnly(that);
    }

    public RetType forVarRefOnly(VarRef that, RetType id_result) {
        return forLHSOnly(that);
    }

    public RetType forArrayExprOnly(ArrayExpr that, List<Option<RetType>> elements_result) {
        return forLHSOnly(that);
    }

    public RetType forArrayNumberExprOnly(ArrayNumberExpr that) {
        return forLHSOnly(that);
    }

    public RetType forObjectExprOnly(ObjectExpr that, List<RetType> members_result) {
        return forLHSOnly(that);
    }

    public RetType forParenthesizedOnly(Parenthesized that, RetType expr_result) {
        return forLHSOnly(that);
    }

    public RetType forFunExprOnly(FunExpr that) {
        return forLHSOnly(that);
    }

    public RetType forBracketOnly(Bracket that, RetType obj_result, RetType index_result) {
        return forLHSOnly(that);
    }

    public RetType forDotOnly(Dot that, RetType obj_result, RetType member_result) {
        return forLHSOnly(that);
    }

    public RetType forNewOnly(New that, RetType lhs_result) {
        return forLHSOnly(that);
    }

    public RetType forFunAppOnly(FunApp that, RetType fun_result, List<RetType> args_result) {
        return forLHSOnly(that);
    }

    public RetType forPropertyOnly(Property that) {
        return forAbstractNodeOnly(that);
    }

    public RetType forPropIdOnly(PropId that, RetType id_result) {
        return forPropertyOnly(that);
    }

    public RetType forPropStrOnly(PropStr that) {
        return forPropertyOnly(that);
    }

    public RetType forPropNumOnly(PropNum that, RetType num_result) {
        return forPropertyOnly(that);
    }

    public RetType forMemberOnly(Member that, RetType prop_result) {
        return forAbstractNodeOnly(that);
    }

    public RetType forFieldOnly(Field that, RetType prop_result, RetType expr_result) {
        return forMemberOnly(that, prop_result);
    }

    public RetType forGetPropOnly(GetProp that, RetType prop_result) {
        return forMemberOnly(that, prop_result);
    }

    public RetType forSetPropOnly(SetProp that, RetType prop_result) {
        return forMemberOnly(that, prop_result);
    }

    public RetType forNameOnly(Name that) {
        return forAbstractNodeOnly(that);
    }

    public RetType forIdOrOpOrAnonymousNameOnly(IdOrOpOrAnonymousName that) {
        return forNameOnly(that);
    }

    public RetType forIdOrOpOnly(IdOrOp that) {
        return forIdOrOpOrAnonymousNameOnly(that);
    }

    public RetType forIdOnly(Id that) {
        return forIdOrOpOnly(that);
    }

    public RetType forOpOnly(Op that) {
        return forIdOrOpOnly(that);
    }

    public RetType forTypeNameOnly(TypeName that, List<RetType> names_result) {
        return forIdOrOpOnly(that);
    }

    public RetType forAnonymousFnNameOnly(AnonymousFnName that) {
        return forIdOrOpOrAnonymousNameOnly(that);
    }

    public RetType forPathOnly(Path that, List<RetType> names_result) {
        return forNameOnly(that);
    }

    public RetType forModExpSpecifierOnly(ModExpSpecifier that) {
        return forNameOnly(that);
    }

    public RetType forModExpStarFromPathOnly(ModExpStarFromPath that, RetType module_result) {
        return forModExpSpecifierOnly(that);
    }

    public RetType forModExpStarOnly(ModExpStar that) {
        return forModExpSpecifierOnly(that);
    }

    public RetType forModExpAliasOnly(ModExpAlias that, RetType name_result, RetType alias_result) {
        return forModExpSpecifierOnly(that);
    }

    public RetType forModExpNameOnly(ModExpName that, RetType name_result) {
        return forModExpSpecifierOnly(that);
    }

    public RetType forModImpSpecifierOnly(ModImpSpecifier that) {
        return forNameOnly(that);
    }

    public RetType forModImpAliasOnly(ModImpAlias that, RetType name_result, RetType alias_result) {
        return forModImpSpecifierOnly(that);
    }

    public RetType forModImpNameOnly(ModImpName that, RetType name_result) {
        return forModImpSpecifierOnly(that);
    }

    public RetType forLabelOnly(Label that, RetType id_result) {
        return forAbstractNodeOnly(that);
    }

    public RetType forCommentOnly(Comment that) {
        return forAbstractNodeOnly(that);
    }

    public RetType forParamOnly(Param that, RetType name_result, Option<RetType> typ_result, Option<RetType> defaultExpr_result) {
        return forAbstractNodeOnly(that);
    }

    public RetType forTypeOnly(Type that) {
        return forAbstractNodeOnly(that);
    }

    public RetType forPredefTypeOnly(PredefType that) {
        return forTypeOnly(that);
    }

    public RetType forAnyTOnly(AnyT that) {
        return forPredefTypeOnly(that);
    }

    public RetType forNumberTOnly(NumberT that) {
        return forPredefTypeOnly(that);
    }

    public RetType forBoolTOnly(BoolT that) {
        return forPredefTypeOnly(that);
    }

    public RetType forStringTOnly(StringT that) {
        return forPredefTypeOnly(that);
    }

    public RetType forVoidTOnly(VoidT that) {
        return forPredefTypeOnly(that);
    }

    public RetType forTypeRefOnly(TypeRef that, RetType name_result, List<RetType> args_result) {
        return forTypeOnly(that);
    }

    public RetType forTypeQueryOnly(TypeQuery that, RetType path_result) {
        return forTypeOnly(that);
    }

    public RetType forTypeLiteralOnly(TypeLiteral that) {
        return forTypeOnly(that);
    }

    public RetType forObjectTypeOnly(ObjectType that, List<RetType> members_result) {
        return forTypeLiteralOnly(that);
    }

    public RetType forArrayTypeOnly(ArrayType that, RetType typ_result) {
        return forTypeLiteralOnly(that);
    }

    public RetType forFunctionTypeOnly(FunctionType that, List<RetType> tparams_result, List<RetType> params_result, RetType typ_result) {
        return forTypeLiteralOnly(that);
    }

    public RetType forConstructorTypeOnly(ConstructorType that, List<RetType> tparams_result, List<RetType> params_result, RetType typ_result) {
        return forTypeLiteralOnly(that);
    }

    public RetType forExprTypeOnly(ExprType that) {
        return forTypeOnly(that);
    }

    public RetType forTypeMemberOnly(TypeMember that) {
        return forTypeOnly(that);
    }

    public RetType forPropertySigOnly(PropertySig that, RetType prop_result, Option<RetType> typ_result) {
        return forTypeMemberOnly(that);
    }

    public RetType forCallSigOnly(CallSig that, List<RetType> tparams_result, List<RetType> params_result, Option<RetType> typ_result) {
        return forTypeMemberOnly(that);
    }

    public RetType forConstructSigOnly(ConstructSig that, List<RetType> tparams_result, List<RetType> params_result, Option<RetType> typ_result) {
        return forTypeMemberOnly(that);
    }

    public RetType forIndexSigOnly(IndexSig that, RetType id_result, RetType annot_result) {
        return forTypeMemberOnly(that);
    }

    public RetType forMethodSigOnly(MethodSig that, RetType prop_result, RetType sig_result) {
        return forTypeMemberOnly(that);
    }

    public RetType forTypeParamOnly(TypeParam that, RetType name_result, Option<RetType> ext_result) {
        return forAbstractNodeOnly(that);
    }


    /** Methods to recur on each child. */
    public RetType forProgram(Program that) {
        return forProgramOnly(that);
    }

    public RetType forModDecl(ModDecl that) {
        RetType name_result = recur(that.getName());
        return forModDeclOnly(that, name_result);
    }

    public RetType forModExpVarStmt(ModExpVarStmt that) {
        List<RetType> vds_result = recurOnListOfVarDecl(that.getVds());
        return forModExpVarStmtOnly(that, vds_result);
    }

    public RetType forModExpFunDecl(ModExpFunDecl that) {
        RetType fd_result = recur(that.getFd());
        return forModExpFunDeclOnly(that, fd_result);
    }

    public RetType forModExpGetter(ModExpGetter that) {
        RetType fd_result = recur(that.getFd());
        return forModExpGetterOnly(that, fd_result);
    }

    public RetType forModExpSetter(ModExpSetter that) {
        RetType fd_result = recur(that.getFd());
        return forModExpSetterOnly(that, fd_result);
    }

    public RetType forModExpSpecifiers(ModExpSpecifiers that) {
        List<RetType> names_result = recurOnListOfModExpSpecifier(that.getNames());
        return forModExpSpecifiersOnly(that, names_result);
    }

    public RetType forModExpAssignment(ModExpAssignment that) {
        RetType id_result = recur(that.getId());
        return forModExpAssignmentOnly(that, id_result);
    }

    public RetType forModImpDecl(ModImpDecl that) {
        List<RetType> imports_result = recurOnListOfModImport(that.getImports());
        return forModImpDeclOnly(that, imports_result);
    }

    public RetType forExtImpDecl(ExtImpDecl that) {
        RetType id_result = recur(that.getId());
        return forExtImpDeclOnly(that, id_result);
    }

    public RetType forTSImpDecl(TSImpDecl that) {
        RetType id_result = recur(that.getId());
        RetType path_result = recur(that.getPath());
        return forTSImpDeclOnly(that, id_result, path_result);
    }

    public RetType forIntfDecl(IntfDecl that) {
        RetType id_result = recur(that.getId());
        List<RetType> tps_result = recurOnListOfTypeParam(that.getTps());
        List<RetType> ext_result = recurOnListOfTypeRef(that.getExt());
        RetType typ_result = recur(that.getTyp());
        return forIntfDeclOnly(that, id_result, tps_result, ext_result, typ_result);
    }

    public RetType forAmbVarDecl(AmbVarDecl that) {
        RetType id_result = recur(that.getId());
        Option<RetType> ty_result = recurOnOptionOfType(that.getTy());
        return forAmbVarDeclOnly(that, id_result, ty_result);
    }

    public RetType forAmbFunDecl(AmbFunDecl that) {
        RetType id_result = recur(that.getId());
        RetType sig_result = recur(that.getSig());
        return forAmbFunDeclOnly(that, id_result, sig_result);
    }

    public RetType forAmbClsDecl(AmbClsDecl that) {
        RetType id_result = recur(that.getId());
        List<RetType> tps_result = recurOnListOfTypeParam(that.getTps());
        Option<RetType> ext_result = recurOnOptionOfTypeRef(that.getExt());
        List<RetType> imp_result = recurOnListOfTypeRef(that.getImp());
        List<RetType> elts_result = recurOnListOfAmbClsElt(that.getElts());
        return forAmbClsDeclOnly(that, id_result, tps_result, ext_result, imp_result, elts_result);
    }

    public RetType forAmbEnumDecl(AmbEnumDecl that) {
        RetType id_result = recur(that.getId());
        List<RetType> mem_result = recurOnListOfAmbEnumMem(that.getMem());
        return forAmbEnumDeclOnly(that, id_result, mem_result);
    }

    public RetType forAmbModDecl(AmbModDecl that) {
        RetType path_result = recur(that.getPath());
        List<RetType> mem_result = recurOnListOfAmbModElt(that.getMem());
        return forAmbModDeclOnly(that, path_result, mem_result);
    }

    public RetType forAmbExtModDecl(AmbExtModDecl that) {
        List<RetType> mem_result = recurOnListOfAmbExtModElt(that.getMem());
        return forAmbExtModDeclOnly(that, mem_result);
    }

    public RetType forNoOp(NoOp that) {
        return forNoOpOnly(that);
    }

    public RetType forStmtUnit(StmtUnit that) {
        List<RetType> stmts_result = recurOnListOfStmt(that.getStmts());
        return forStmtUnitOnly(that, stmts_result);
    }

    public RetType forFunDecl(FunDecl that) {
        return forFunDeclOnly(that);
    }

    public RetType forBlock(Block that) {
        List<RetType> stmts_result = recurOnListOfStmt(that.getStmts());
        return forBlockOnly(that, stmts_result);
    }

    public RetType forVarStmt(VarStmt that) {
        List<RetType> vds_result = recurOnListOfVarDecl(that.getVds());
        return forVarStmtOnly(that, vds_result);
    }

    public RetType forEmptyStmt(EmptyStmt that) {
        return forEmptyStmtOnly(that);
    }

    public RetType forExprStmt(ExprStmt that) {
        RetType expr_result = recur(that.getExpr());
        return forExprStmtOnly(that, expr_result);
    }

    public RetType forIf(If that) {
        RetType cond_result = recur(that.getCond());
        RetType trueBranch_result = recur(that.getTrueBranch());
        Option<RetType> falseBranch_result = recurOnOptionOfStmt(that.getFalseBranch());
        return forIfOnly(that, cond_result, trueBranch_result, falseBranch_result);
    }

    public RetType forDoWhile(DoWhile that) {
        RetType body_result = recur(that.getBody());
        RetType cond_result = recur(that.getCond());
        return forDoWhileOnly(that, body_result, cond_result);
    }

    public RetType forWhile(While that) {
        RetType cond_result = recur(that.getCond());
        RetType body_result = recur(that.getBody());
        return forWhileOnly(that, cond_result, body_result);
    }

    public RetType forFor(For that) {
        Option<RetType> init_result = recurOnOptionOfExpr(that.getInit());
        Option<RetType> cond_result = recurOnOptionOfExpr(that.getCond());
        Option<RetType> action_result = recurOnOptionOfExpr(that.getAction());
        RetType body_result = recur(that.getBody());
        return forForOnly(that, init_result, cond_result, action_result, body_result);
    }

    public RetType forForIn(ForIn that) {
        RetType lhs_result = recur(that.getLhs());
        RetType expr_result = recur(that.getExpr());
        RetType body_result = recur(that.getBody());
        return forForInOnly(that, lhs_result, expr_result, body_result);
    }

    public RetType forForVar(ForVar that) {
        List<RetType> vars_result = recurOnListOfVarDecl(that.getVars());
        Option<RetType> cond_result = recurOnOptionOfExpr(that.getCond());
        Option<RetType> action_result = recurOnOptionOfExpr(that.getAction());
        RetType body_result = recur(that.getBody());
        return forForVarOnly(that, vars_result, cond_result, action_result, body_result);
    }

    public RetType forForVarIn(ForVarIn that) {
        RetType var_result = recur(that.getVar());
        RetType expr_result = recur(that.getExpr());
        RetType body_result = recur(that.getBody());
        return forForVarInOnly(that, var_result, expr_result, body_result);
    }

    public RetType forContinue(Continue that) {
        Option<RetType> target_result = recurOnOptionOfLabel(that.getTarget());
        return forContinueOnly(that, target_result);
    }

    public RetType forBreak(Break that) {
        Option<RetType> target_result = recurOnOptionOfLabel(that.getTarget());
        return forBreakOnly(that, target_result);
    }

    public RetType forReturn(Return that) {
        Option<RetType> expr_result = recurOnOptionOfExpr(that.getExpr());
        return forReturnOnly(that, expr_result);
    }

    public RetType forWith(With that) {
        RetType expr_result = recur(that.getExpr());
        RetType stmt_result = recur(that.getStmt());
        return forWithOnly(that, expr_result, stmt_result);
    }

    public RetType forSwitch(Switch that) {
        RetType cond_result = recur(that.getCond());
        List<RetType> frontCases_result = recurOnListOfCase(that.getFrontCases());
        Option<List<RetType>> def_result = recurOnOptionOfListOfStmt(that.getDef());
        List<RetType> backCases_result = recurOnListOfCase(that.getBackCases());
        return forSwitchOnly(that, cond_result, frontCases_result, def_result, backCases_result);
    }

    public RetType forLabelStmt(LabelStmt that) {
        RetType label_result = recur(that.getLabel());
        RetType stmt_result = recur(that.getStmt());
        return forLabelStmtOnly(that, label_result, stmt_result);
    }

    public RetType forThrow(Throw that) {
        RetType expr_result = recur(that.getExpr());
        return forThrowOnly(that, expr_result);
    }

    public RetType forTry(Try that) {
        List<RetType> body_result = recurOnListOfStmt(that.getBody());
        Option<RetType> catchBlock_result = recurOnOptionOfCatch(that.getCatchBlock());
        Option<List<RetType>> fin_result = recurOnOptionOfListOfStmt(that.getFin());
        return forTryOnly(that, body_result, catchBlock_result, fin_result);
    }

    public RetType forDebugger(Debugger that) {
        return forDebuggerOnly(that);
    }

    public RetType forSourceElements(SourceElements that) {
        List<RetType> body_result = recurOnListOfSourceElement(that.getBody());
        return forSourceElementsOnly(that, body_result);
    }

    public RetType forVarDecl(VarDecl that) {
        RetType name_result = recur(that.getName());
        Option<RetType> expr_result = recurOnOptionOfExpr(that.getExpr());
        return forVarDeclOnly(that, name_result, expr_result);
    }

    public RetType forCase(Case that) {
        RetType cond_result = recur(that.getCond());
        List<RetType> body_result = recurOnListOfStmt(that.getBody());
        return forCaseOnly(that, cond_result, body_result);
    }

    public RetType forCatch(Catch that) {
        RetType id_result = recur(that.getId());
        List<RetType> body_result = recurOnListOfStmt(that.getBody());
        return forCatchOnly(that, id_result, body_result);
    }

    public RetType forModImpSpecifierSet(ModImpSpecifierSet that) {
        List<RetType> imports_result = recurOnListOfModImpSpecifier(that.getImports());
        RetType module_result = recur(that.getModule());
        return forModImpSpecifierSetOnly(that, imports_result, module_result);
    }

    public RetType forModImpAliasClause(ModImpAliasClause that) {
        RetType name_result = recur(that.getName());
        RetType alias_result = recur(that.getAlias());
        return forModImpAliasClauseOnly(that, name_result, alias_result);
    }

    public RetType forAmbCnstDecl(AmbCnstDecl that) {
        List<RetType> ps_result = recurOnListOfParam(that.getPs());
        return forAmbCnstDeclOnly(that, ps_result);
    }

    public RetType forAmbMemDecl(AmbMemDecl that) {
        RetType prop_result = recur(that.getProp());
        Option<RetType> typ_result = recurOnOptionOfType(that.getTyp());
        return forAmbMemDeclOnly(that, prop_result, typ_result);
    }

    public RetType forAmbIndDecl(AmbIndDecl that) {
        RetType ind_result = recur(that.getInd());
        return forAmbIndDeclOnly(that, ind_result);
    }

    public RetType forAmbEnumMem(AmbEnumMem that) {
        RetType prop_result = recur(that.getProp());
        Option<RetType> num_result = recurOnOptionOfNumberLiteral(that.getNum());
        return forAmbEnumMemOnly(that, prop_result, num_result);
    }

    public RetType forAmbModElt(AmbModElt that) {
        RetType decl_result = recur(that.getDecl());
        return forAmbModEltOnly(that, decl_result);
    }

    public RetType forAmbExtModElt(AmbExtModElt that) {
        RetType decl_result = recur(that.getDecl());
        return forAmbExtModEltOnly(that, decl_result);
    }

    public RetType forExprList(ExprList that) {
        List<RetType> exprs_result = recurOnListOfExpr(that.getExprs());
        return forExprListOnly(that, exprs_result);
    }

    public RetType forCond(Cond that) {
        RetType cond_result = recur(that.getCond());
        RetType trueBranch_result = recur(that.getTrueBranch());
        RetType falseBranch_result = recur(that.getFalseBranch());
        return forCondOnly(that, cond_result, trueBranch_result, falseBranch_result);
    }

    public RetType forInfixOpApp(InfixOpApp that) {
        RetType left_result = recur(that.getLeft());
        RetType op_result = recur(that.getOp());
        RetType right_result = recur(that.getRight());
        return forInfixOpAppOnly(that, left_result, op_result, right_result);
    }

    public RetType forPrefixOpApp(PrefixOpApp that) {
        RetType op_result = recur(that.getOp());
        RetType right_result = recur(that.getRight());
        return forPrefixOpAppOnly(that, op_result, right_result);
    }

    public RetType forUnaryAssignOpApp(UnaryAssignOpApp that) {
        RetType lhs_result = recur(that.getLhs());
        RetType op_result = recur(that.getOp());
        return forUnaryAssignOpAppOnly(that, lhs_result, op_result);
    }

    public RetType forAssignOpApp(AssignOpApp that) {
        RetType lhs_result = recur(that.getLhs());
        RetType op_result = recur(that.getOp());
        RetType right_result = recur(that.getRight());
        return forAssignOpAppOnly(that, lhs_result, op_result, right_result);
    }

    public RetType forThis(This that) {
        return forThisOnly(that);
    }

    public RetType forNull(Null that) {
        return forNullOnly(that);
    }

    public RetType forBool(Bool that) {
        return forBoolOnly(that);
    }

    public RetType forDoubleLiteral(DoubleLiteral that) {
        return forDoubleLiteralOnly(that);
    }

    public RetType forIntLiteral(IntLiteral that) {
        return forIntLiteralOnly(that);
    }

    public RetType forStringLiteral(StringLiteral that) {
        return forStringLiteralOnly(that);
    }

    public RetType forRegularExpression(RegularExpression that) {
        return forRegularExpressionOnly(that);
    }

    public RetType forVarRef(VarRef that) {
        RetType id_result = recur(that.getId());
        return forVarRefOnly(that, id_result);
    }

    public RetType forArrayExpr(ArrayExpr that) {
        List<Option<RetType>> elements_result = recurOnListOfOptionOfExpr(that.getElements());
        return forArrayExprOnly(that, elements_result);
    }

    public RetType forArrayNumberExpr(ArrayNumberExpr that) {
        return forArrayNumberExprOnly(that);
    }

    public RetType forObjectExpr(ObjectExpr that) {
        List<RetType> members_result = recurOnListOfMember(that.getMembers());
        return forObjectExprOnly(that, members_result);
    }

    public RetType forParenthesized(Parenthesized that) {
        RetType expr_result = recur(that.getExpr());
        return forParenthesizedOnly(that, expr_result);
    }

    public RetType forFunExpr(FunExpr that) {
        return forFunExprOnly(that);
    }

    public RetType forBracket(Bracket that) {
        RetType obj_result = recur(that.getObj());
        RetType index_result = recur(that.getIndex());
        return forBracketOnly(that, obj_result, index_result);
    }

    public RetType forDot(Dot that) {
        RetType obj_result = recur(that.getObj());
        RetType member_result = recur(that.getMember());
        return forDotOnly(that, obj_result, member_result);
    }

    public RetType forNew(New that) {
        RetType lhs_result = recur(that.getLhs());
        return forNewOnly(that, lhs_result);
    }

    public RetType forFunApp(FunApp that) {
        RetType fun_result = recur(that.getFun());
        List<RetType> args_result = recurOnListOfExpr(that.getArgs());
        return forFunAppOnly(that, fun_result, args_result);
    }

    public RetType forPropId(PropId that) {
        RetType id_result = recur(that.getId());
        return forPropIdOnly(that, id_result);
    }

    public RetType forPropStr(PropStr that) {
        return forPropStrOnly(that);
    }

    public RetType forPropNum(PropNum that) {
        RetType num_result = recur(that.getNum());
        return forPropNumOnly(that, num_result);
    }

    public RetType forField(Field that) {
        RetType prop_result = recur(that.getProp());
        RetType expr_result = recur(that.getExpr());
        return forFieldOnly(that, prop_result, expr_result);
    }

    public RetType forGetProp(GetProp that) {
        RetType prop_result = recur(that.getProp());
        return forGetPropOnly(that, prop_result);
    }

    public RetType forSetProp(SetProp that) {
        RetType prop_result = recur(that.getProp());
        return forSetPropOnly(that, prop_result);
    }

    public RetType forId(Id that) {
        return forIdOnly(that);
    }

    public RetType forOp(Op that) {
        return forOpOnly(that);
    }

    public RetType forTypeName(TypeName that) {
        List<RetType> names_result = recurOnListOfId(that.getNames());
        return forTypeNameOnly(that, names_result);
    }

    public RetType forAnonymousFnName(AnonymousFnName that) {
        return forAnonymousFnNameOnly(that);
    }

    public RetType forPath(Path that) {
        List<RetType> names_result = recurOnListOfId(that.getNames());
        return forPathOnly(that, names_result);
    }

    public RetType forModExpStarFromPath(ModExpStarFromPath that) {
        RetType module_result = recur(that.getModule());
        return forModExpStarFromPathOnly(that, module_result);
    }

    public RetType forModExpStar(ModExpStar that) {
        return forModExpStarOnly(that);
    }

    public RetType forModExpAlias(ModExpAlias that) {
        RetType name_result = recur(that.getName());
        RetType alias_result = recur(that.getAlias());
        return forModExpAliasOnly(that, name_result, alias_result);
    }

    public RetType forModExpName(ModExpName that) {
        RetType name_result = recur(that.getName());
        return forModExpNameOnly(that, name_result);
    }

    public RetType forModImpAlias(ModImpAlias that) {
        RetType name_result = recur(that.getName());
        RetType alias_result = recur(that.getAlias());
        return forModImpAliasOnly(that, name_result, alias_result);
    }

    public RetType forModImpName(ModImpName that) {
        RetType name_result = recur(that.getName());
        return forModImpNameOnly(that, name_result);
    }

    public RetType forLabel(Label that) {
        RetType id_result = recur(that.getId());
        return forLabelOnly(that, id_result);
    }

    public RetType forComment(Comment that) {
        return forCommentOnly(that);
    }

    public RetType forParam(Param that) {
        RetType name_result = recur(that.getName());
        Option<RetType> typ_result = recurOnOptionOfType(that.getTyp());
        Option<RetType> defaultExpr_result = recurOnOptionOfExpr(that.getDefaultExpr());
        return forParamOnly(that, name_result, typ_result, defaultExpr_result);
    }

    public RetType forAnyT(AnyT that) {
        return forAnyTOnly(that);
    }

    public RetType forNumberT(NumberT that) {
        return forNumberTOnly(that);
    }

    public RetType forBoolT(BoolT that) {
        return forBoolTOnly(that);
    }

    public RetType forStringT(StringT that) {
        return forStringTOnly(that);
    }

    public RetType forVoidT(VoidT that) {
        return forVoidTOnly(that);
    }

    public RetType forTypeRef(TypeRef that) {
        RetType name_result = recur(that.getName());
        List<RetType> args_result = recurOnListOfType(that.getArgs());
        return forTypeRefOnly(that, name_result, args_result);
    }

    public RetType forTypeQuery(TypeQuery that) {
        RetType path_result = recur(that.getPath());
        return forTypeQueryOnly(that, path_result);
    }

    public RetType forObjectType(ObjectType that) {
        List<RetType> members_result = recurOnListOfTypeMember(that.getMembers());
        return forObjectTypeOnly(that, members_result);
    }

    public RetType forArrayType(ArrayType that) {
        RetType typ_result = recur(that.getTyp());
        return forArrayTypeOnly(that, typ_result);
    }

    public RetType forFunctionType(FunctionType that) {
        List<RetType> tparams_result = recurOnListOfTypeParam(that.getTparams());
        List<RetType> params_result = recurOnListOfParam(that.getParams());
        RetType typ_result = recur(that.getTyp());
        return forFunctionTypeOnly(that, tparams_result, params_result, typ_result);
    }

    public RetType forConstructorType(ConstructorType that) {
        List<RetType> tparams_result = recurOnListOfTypeParam(that.getTparams());
        List<RetType> params_result = recurOnListOfParam(that.getParams());
        RetType typ_result = recur(that.getTyp());
        return forConstructorTypeOnly(that, tparams_result, params_result, typ_result);
    }

    public RetType forExprType(ExprType that) {
        return forExprTypeOnly(that);
    }

    public RetType forPropertySig(PropertySig that) {
        RetType prop_result = recur(that.getProp());
        Option<RetType> typ_result = recurOnOptionOfType(that.getTyp());
        return forPropertySigOnly(that, prop_result, typ_result);
    }

    public RetType forCallSig(CallSig that) {
        List<RetType> tparams_result = recurOnListOfTypeParam(that.getTparams());
        List<RetType> params_result = recurOnListOfParam(that.getParams());
        Option<RetType> typ_result = recurOnOptionOfType(that.getTyp());
        return forCallSigOnly(that, tparams_result, params_result, typ_result);
    }

    public RetType forConstructSig(ConstructSig that) {
        List<RetType> tparams_result = recurOnListOfTypeParam(that.getTparams());
        List<RetType> params_result = recurOnListOfParam(that.getParams());
        Option<RetType> typ_result = recurOnOptionOfType(that.getTyp());
        return forConstructSigOnly(that, tparams_result, params_result, typ_result);
    }

    public RetType forIndexSig(IndexSig that) {
        RetType id_result = recur(that.getId());
        RetType annot_result = recur(that.getAnnot());
        return forIndexSigOnly(that, id_result, annot_result);
    }

    public RetType forMethodSig(MethodSig that) {
        RetType prop_result = recur(that.getProp());
        RetType sig_result = recur(that.getSig());
        return forMethodSigOnly(that, prop_result, sig_result);
    }

    public RetType forTypeParam(TypeParam that) {
        RetType name_result = recur(that.getName());
        Option<RetType> ext_result = recurOnOptionOfType(that.getExt());
        return forTypeParamOnly(that, name_result, ext_result);
    }


    public RetType recur(AbstractNode that) {
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
}
