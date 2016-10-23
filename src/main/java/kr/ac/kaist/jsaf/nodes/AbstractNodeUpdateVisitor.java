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

/** 
 * A depth-first visitor that makes an updated copy as it visits (by default).
 * The type of the result is generally the same as that of the argument; where
 * automatic recursion on a field of type T occurs, this must be true for T.
 * Where no changes are made to a node, a new copy is not allocated.
 * This visitor implements the visitor interface with methods that 
 * first update the children, and then call forCASEOnly(), passing in 
 * the values of the updated children. (CASE is replaced by the case name.)
 * Override forCASE or forCASEOnly if you want to transform an AST subtree.
 * There is no automatic delegation to more general cases, because each concrete
 * case has a default implementation.
 */
@SuppressWarnings("unused")
public abstract class AbstractNodeUpdateVisitor extends AbstractNodeVisitorLambda<AbstractNode> {

    /* Methods to handle a node after recursion. */

    public AbstractNode forProgramOnly(Program that, ASTSpanInfo info_result, TopLevel body_result) {
        if (that.getInfo() == info_result && that.getBody() == body_result) return that;
        else return new Program(info_result, body_result);
    }

    public AbstractNode forModDeclOnly(ModDecl that, ASTSpanInfo info_result, Id name_result, TopLevel body_result) {
        if (that.getInfo() == info_result && that.getName() == name_result && that.getBody() == body_result) return that;
        else return new ModDecl(info_result, name_result, body_result);
    }

    public AbstractNode forModExpVarStmtOnly(ModExpVarStmt that, ASTSpanInfo info_result, List<VarDecl> vds_result) {
        if (that.getInfo() == info_result && that.getVds() == vds_result) return that;
        else return new ModExpVarStmt(info_result, vds_result);
    }

    public AbstractNode forModExpFunDeclOnly(ModExpFunDecl that, ASTSpanInfo info_result, FunDecl fd_result) {
        if (that.getInfo() == info_result && that.getFd() == fd_result) return that;
        else return new ModExpFunDecl(info_result, fd_result);
    }

    public AbstractNode forModExpGetterOnly(ModExpGetter that, ASTSpanInfo info_result, GetProp fd_result) {
        if (that.getInfo() == info_result && that.getFd() == fd_result) return that;
        else return new ModExpGetter(info_result, fd_result);
    }

    public AbstractNode forModExpSetterOnly(ModExpSetter that, ASTSpanInfo info_result, SetProp fd_result) {
        if (that.getInfo() == info_result && that.getFd() == fd_result) return that;
        else return new ModExpSetter(info_result, fd_result);
    }

    public AbstractNode forModExpSpecifiersOnly(ModExpSpecifiers that, ASTSpanInfo info_result, List<ModExpSpecifier> names_result) {
        if (that.getInfo() == info_result && that.getNames() == names_result) return that;
        else return new ModExpSpecifiers(info_result, names_result);
    }

    public AbstractNode forModExpAssignmentOnly(ModExpAssignment that, ASTSpanInfo info_result, Id id_result) {
        if (that.getInfo() == info_result && that.getId() == id_result) return that;
        else return new ModExpAssignment(info_result, id_result);
    }

    public AbstractNode forModImpDeclOnly(ModImpDecl that, ASTSpanInfo info_result, List<ModImport> imports_result) {
        if (that.getInfo() == info_result && that.getImports() == imports_result) return that;
        else return new ModImpDecl(info_result, imports_result);
    }

    public AbstractNode forExtImpDeclOnly(ExtImpDecl that, ASTSpanInfo info_result, Id id_result) {
        if (that.getInfo() == info_result && that.getId() == id_result) return that;
        else return new ExtImpDecl(info_result, id_result, that.getModule());
    }

    public AbstractNode forTSImpDeclOnly(TSImpDecl that, ASTSpanInfo info_result, Id id_result, Path path_result) {
        if (that.getInfo() == info_result && that.getId() == id_result && that.getPath() == path_result) return that;
        else return new TSImpDecl(info_result, id_result, path_result);
    }

    public AbstractNode forIntfDeclOnly(IntfDecl that, ASTSpanInfo info_result, Id id_result, List<TypeParam> tps_result, List<TypeRef> ext_result, ObjectType typ_result) {
        if (that.getInfo() == info_result && that.getId() == id_result && that.getTps() == tps_result && that.getExt() == ext_result && that.getTyp() == typ_result) return that;
        else return new IntfDecl(info_result, id_result, tps_result, ext_result, typ_result);
    }

    public AbstractNode forAmbVarDeclOnly(AmbVarDecl that, ASTSpanInfo info_result, Id id_result, Option<Type> ty_result) {
        if (that.getInfo() == info_result && that.getId() == id_result && that.getTy() == ty_result) return that;
        else return new AmbVarDecl(info_result, id_result, ty_result);
    }

    public AbstractNode forAmbFunDeclOnly(AmbFunDecl that, ASTSpanInfo info_result, Id id_result, CallSig sig_result) {
        if (that.getInfo() == info_result && that.getId() == id_result && that.getSig() == sig_result) return that;
        else return new AmbFunDecl(info_result, id_result, sig_result);
    }

    public AbstractNode forAmbClsDeclOnly(AmbClsDecl that, ASTSpanInfo info_result, Id id_result, List<TypeParam> tps_result, Option<TypeRef> ext_result, List<TypeRef> imp_result, List<AmbClsElt> elts_result) {
        if (that.getInfo() == info_result && that.getId() == id_result && that.getTps() == tps_result && that.getExt() == ext_result && that.getImp() == imp_result && that.getElts() == elts_result) return that;
        else return new AmbClsDecl(info_result, id_result, tps_result, ext_result, imp_result, elts_result);
    }

    public AbstractNode forAmbEnumDeclOnly(AmbEnumDecl that, ASTSpanInfo info_result, Id id_result, List<AmbEnumMem> mem_result) {
        if (that.getInfo() == info_result && that.getId() == id_result && that.getMem() == mem_result) return that;
        else return new AmbEnumDecl(info_result, id_result, mem_result);
    }

    public AbstractNode forAmbModDeclOnly(AmbModDecl that, ASTSpanInfo info_result, Path path_result, List<AmbModElt> mem_result) {
        if (that.getInfo() == info_result && that.getPath() == path_result && that.getMem() == mem_result) return that;
        else return new AmbModDecl(info_result, path_result, mem_result);
    }

    public AbstractNode forAmbExtModDeclOnly(AmbExtModDecl that, ASTSpanInfo info_result, List<AmbExtModElt> mem_result) {
        if (that.getInfo() == info_result && that.getMem() == mem_result) return that;
        else return new AmbExtModDecl(info_result, that.getName(), mem_result);
    }

    public AbstractNode forNoOpOnly(NoOp that, ASTSpanInfo info_result) {
        if (that.getInfo() == info_result) return that;
        else return new NoOp(info_result, that.getDesc());
    }

    public AbstractNode forStmtUnitOnly(StmtUnit that, ASTSpanInfo info_result, List<Stmt> stmts_result) {
        if (that.getInfo() == info_result && that.getStmts() == stmts_result) return that;
        else return new StmtUnit(info_result, stmts_result);
    }

    public AbstractNode forFunDeclOnly(FunDecl that, ASTSpanInfo info_result, Functional ftn_result) {
        if (that.getInfo() == info_result && that.getFtn() == ftn_result) return that;
        else return new FunDecl(info_result, ftn_result, that.isStrict());
    }

    public AbstractNode forBlockOnly(Block that, ASTSpanInfo info_result, List<Stmt> stmts_result) {
        if (that.getInfo() == info_result && that.getStmts() == stmts_result) return that;
        else return new Block(info_result, stmts_result, that.isInternal());
    }

    public AbstractNode forVarStmtOnly(VarStmt that, ASTSpanInfo info_result, List<VarDecl> vds_result) {
        if (that.getInfo() == info_result && that.getVds() == vds_result) return that;
        else return new VarStmt(info_result, vds_result);
    }

    public AbstractNode forEmptyStmtOnly(EmptyStmt that, ASTSpanInfo info_result) {
        if (that.getInfo() == info_result) return that;
        else return new EmptyStmt(info_result);
    }

    public AbstractNode forExprStmtOnly(ExprStmt that, ASTSpanInfo info_result, Expr expr_result) {
        if (that.getInfo() == info_result && that.getExpr() == expr_result) return that;
        else return new ExprStmt(info_result, expr_result, that.isInternal());
    }

    public AbstractNode forIfOnly(If that, ASTSpanInfo info_result, Expr cond_result, Stmt trueBranch_result, Option<Stmt> falseBranch_result) {
        if (that.getInfo() == info_result && that.getCond() == cond_result && that.getTrueBranch() == trueBranch_result && that.getFalseBranch() == falseBranch_result) return that;
        else return new If(info_result, cond_result, trueBranch_result, falseBranch_result);
    }

    public AbstractNode forDoWhileOnly(DoWhile that, ASTSpanInfo info_result, Stmt body_result, Expr cond_result) {
        if (that.getInfo() == info_result && that.getBody() == body_result && that.getCond() == cond_result) return that;
        else return new DoWhile(info_result, body_result, cond_result);
    }

    public AbstractNode forWhileOnly(While that, ASTSpanInfo info_result, Expr cond_result, Stmt body_result) {
        if (that.getInfo() == info_result && that.getCond() == cond_result && that.getBody() == body_result) return that;
        else return new While(info_result, cond_result, body_result);
    }

    public AbstractNode forForOnly(For that, ASTSpanInfo info_result, Option<Expr> init_result, Option<Expr> cond_result, Option<Expr> action_result, Stmt body_result) {
        if (that.getInfo() == info_result && that.getInit() == init_result && that.getCond() == cond_result && that.getAction() == action_result && that.getBody() == body_result) return that;
        else return new For(info_result, init_result, cond_result, action_result, body_result);
    }

    public AbstractNode forForInOnly(ForIn that, ASTSpanInfo info_result, LHS lhs_result, Expr expr_result, Stmt body_result) {
        if (that.getInfo() == info_result && that.getLhs() == lhs_result && that.getExpr() == expr_result && that.getBody() == body_result) return that;
        else return new ForIn(info_result, lhs_result, expr_result, body_result);
    }

    public AbstractNode forForVarOnly(ForVar that, ASTSpanInfo info_result, List<VarDecl> vars_result, Option<Expr> cond_result, Option<Expr> action_result, Stmt body_result) {
        if (that.getInfo() == info_result && that.getVars() == vars_result && that.getCond() == cond_result && that.getAction() == action_result && that.getBody() == body_result) return that;
        else return new ForVar(info_result, vars_result, cond_result, action_result, body_result);
    }

    public AbstractNode forForVarInOnly(ForVarIn that, ASTSpanInfo info_result, VarDecl var_result, Expr expr_result, Stmt body_result) {
        if (that.getInfo() == info_result && that.getVar() == var_result && that.getExpr() == expr_result && that.getBody() == body_result) return that;
        else return new ForVarIn(info_result, var_result, expr_result, body_result);
    }

    public AbstractNode forContinueOnly(Continue that, ASTSpanInfo info_result, Option<Label> target_result) {
        if (that.getInfo() == info_result && that.getTarget() == target_result) return that;
        else return new Continue(info_result, target_result);
    }

    public AbstractNode forBreakOnly(Break that, ASTSpanInfo info_result, Option<Label> target_result) {
        if (that.getInfo() == info_result && that.getTarget() == target_result) return that;
        else return new Break(info_result, target_result);
    }

    public AbstractNode forReturnOnly(Return that, ASTSpanInfo info_result, Option<Expr> expr_result) {
        if (that.getInfo() == info_result && that.getExpr() == expr_result) return that;
        else return new Return(info_result, expr_result);
    }

    public AbstractNode forWithOnly(With that, ASTSpanInfo info_result, Expr expr_result, Stmt stmt_result) {
        if (that.getInfo() == info_result && that.getExpr() == expr_result && that.getStmt() == stmt_result) return that;
        else return new With(info_result, expr_result, stmt_result);
    }

    public AbstractNode forSwitchOnly(Switch that, ASTSpanInfo info_result, Expr cond_result, List<Case> frontCases_result, Option<List<Stmt>> def_result, List<Case> backCases_result) {
        if (that.getInfo() == info_result && that.getCond() == cond_result && that.getFrontCases() == frontCases_result && that.getDef() == def_result && that.getBackCases() == backCases_result) return that;
        else return new Switch(info_result, cond_result, frontCases_result, def_result, backCases_result);
    }

    public AbstractNode forLabelStmtOnly(LabelStmt that, ASTSpanInfo info_result, Label label_result, Stmt stmt_result) {
        if (that.getInfo() == info_result && that.getLabel() == label_result && that.getStmt() == stmt_result) return that;
        else return new LabelStmt(info_result, label_result, stmt_result);
    }

    public AbstractNode forThrowOnly(Throw that, ASTSpanInfo info_result, Expr expr_result) {
        if (that.getInfo() == info_result && that.getExpr() == expr_result) return that;
        else return new Throw(info_result, expr_result);
    }

    public AbstractNode forTryOnly(Try that, ASTSpanInfo info_result, List<Stmt> body_result, Option<Catch> catchBlock_result, Option<List<Stmt>> fin_result) {
        if (that.getInfo() == info_result && that.getBody() == body_result && that.getCatchBlock() == catchBlock_result && that.getFin() == fin_result) return that;
        else return new Try(info_result, body_result, catchBlock_result, fin_result);
    }

    public AbstractNode forDebuggerOnly(Debugger that, ASTSpanInfo info_result) {
        if (that.getInfo() == info_result) return that;
        else return new Debugger(info_result);
    }

    public AbstractNode forSourceElementsOnly(SourceElements that, ASTSpanInfo info_result, List<SourceElement> body_result) {
        if (that.getInfo() == info_result && that.getBody() == body_result) return that;
        else return new SourceElements(info_result, body_result, that.isStrict());
    }

    public AbstractNode forVarDeclOnly(VarDecl that, ASTSpanInfo info_result, Id name_result, Option<Expr> expr_result) {
        if (that.getInfo() == info_result && that.getName() == name_result && that.getExpr() == expr_result) return that;
        else return new VarDecl(info_result, name_result, expr_result, that.isStrict());
    }

    public AbstractNode forCaseOnly(Case that, ASTSpanInfo info_result, Expr cond_result, List<Stmt> body_result) {
        if (that.getInfo() == info_result && that.getCond() == cond_result && that.getBody() == body_result) return that;
        else return new Case(info_result, cond_result, body_result);
    }

    public AbstractNode forCatchOnly(Catch that, ASTSpanInfo info_result, Id id_result, List<Stmt> body_result) {
        if (that.getInfo() == info_result && that.getId() == id_result && that.getBody() == body_result) return that;
        else return new Catch(info_result, id_result, body_result);
    }

    public AbstractNode forModImpSpecifierSetOnly(ModImpSpecifierSet that, ASTSpanInfo info_result, List<ModImpSpecifier> imports_result, Path module_result) {
        if (that.getInfo() == info_result && that.getImports() == imports_result && that.getModule() == module_result) return that;
        else return new ModImpSpecifierSet(info_result, imports_result, module_result);
    }

    public AbstractNode forModImpAliasClauseOnly(ModImpAliasClause that, ASTSpanInfo info_result, Path name_result, Id alias_result) {
        if (that.getInfo() == info_result && that.getName() == name_result && that.getAlias() == alias_result) return that;
        else return new ModImpAliasClause(info_result, name_result, alias_result);
    }

    public AbstractNode forAmbCnstDeclOnly(AmbCnstDecl that, ASTSpanInfo info_result, List<Param> ps_result) {
        if (that.getInfo() == info_result && that.getPs() == ps_result) return that;
        else return new AmbCnstDecl(info_result, ps_result);
    }

    public AbstractNode forAmbMemDeclOnly(AmbMemDecl that, ASTSpanInfo info_result, List<Modifier> mods_result, Property prop_result, Option<Type> typ_result) {
        if (that.getInfo() == info_result && that.getMods() == mods_result && that.getProp() == prop_result && that.getTyp() == typ_result) return that;
        else return new AmbMemDecl(info_result, mods_result, prop_result, typ_result);
    }

    public AbstractNode forAmbIndDeclOnly(AmbIndDecl that, ASTSpanInfo info_result, IndexSig ind_result) {
        if (that.getInfo() == info_result && that.getInd() == ind_result) return that;
        else return new AmbIndDecl(info_result, ind_result);
    }

    public AbstractNode forAmbEnumMemOnly(AmbEnumMem that, ASTSpanInfo info_result, Property prop_result, Option<NumberLiteral> num_result) {
        if (that.getInfo() == info_result && that.getProp() == prop_result && that.getNum() == num_result) return that;
        else return new AmbEnumMem(info_result, prop_result, num_result);
    }

    public AbstractNode forAmbModEltOnly(AmbModElt that, ASTSpanInfo info_result, SourceElement decl_result) {
        if (that.getInfo() == info_result && that.getDecl() == decl_result) return that;
        else return new AmbModElt(info_result, decl_result);
    }

    public AbstractNode forAmbExtModEltOnly(AmbExtModElt that, ASTSpanInfo info_result, SourceElement decl_result) {
        if (that.getInfo() == info_result && that.getDecl() == decl_result) return that;
        else return new AmbExtModElt(info_result, decl_result);
    }

    public AbstractNode forExprListOnly(ExprList that, ASTSpanInfo info_result, List<Expr> exprs_result) {
        if (that.getInfo() == info_result && that.getExprs() == exprs_result) return that;
        else return new ExprList(info_result, exprs_result);
    }

    public AbstractNode forCondOnly(Cond that, ASTSpanInfo info_result, Expr cond_result, Expr trueBranch_result, Expr falseBranch_result) {
        if (that.getInfo() == info_result && that.getCond() == cond_result && that.getTrueBranch() == trueBranch_result && that.getFalseBranch() == falseBranch_result) return that;
        else return new Cond(info_result, cond_result, trueBranch_result, falseBranch_result);
    }

    public AbstractNode forInfixOpAppOnly(InfixOpApp that, ASTSpanInfo info_result, Expr left_result, Op op_result, Expr right_result) {
        if (that.getInfo() == info_result && that.getLeft() == left_result && that.getOp() == op_result && that.getRight() == right_result) return that;
        else return new InfixOpApp(info_result, left_result, op_result, right_result);
    }

    public AbstractNode forPrefixOpAppOnly(PrefixOpApp that, ASTSpanInfo info_result, Op op_result, Expr right_result) {
        if (that.getInfo() == info_result && that.getOp() == op_result && that.getRight() == right_result) return that;
        else return new PrefixOpApp(info_result, op_result, right_result);
    }

    public AbstractNode forUnaryAssignOpAppOnly(UnaryAssignOpApp that, ASTSpanInfo info_result, LHS lhs_result, Op op_result) {
        if (that.getInfo() == info_result && that.getLhs() == lhs_result && that.getOp() == op_result) return that;
        else return new UnaryAssignOpApp(info_result, lhs_result, op_result);
    }

    public AbstractNode forAssignOpAppOnly(AssignOpApp that, ASTSpanInfo info_result, LHS lhs_result, Op op_result, Expr right_result) {
        if (that.getInfo() == info_result && that.getLhs() == lhs_result && that.getOp() == op_result && that.getRight() == right_result) return that;
        else return new AssignOpApp(info_result, lhs_result, op_result, right_result);
    }

    public AbstractNode forThisOnly(This that, ASTSpanInfo info_result) {
        if (that.getInfo() == info_result) return that;
        else return new This(info_result);
    }

    public AbstractNode forNullOnly(Null that, ASTSpanInfo info_result) {
        if (that.getInfo() == info_result) return that;
        else return new Null(info_result);
    }

    public AbstractNode forBoolOnly(Bool that, ASTSpanInfo info_result) {
        if (that.getInfo() == info_result) return that;
        else return new Bool(info_result, that.isBool());
    }

    public AbstractNode forDoubleLiteralOnly(DoubleLiteral that, ASTSpanInfo info_result) {
        if (that.getInfo() == info_result) return that;
        else return new DoubleLiteral(info_result, that.getText(), that.getNum());
    }

    public AbstractNode forIntLiteralOnly(IntLiteral that, ASTSpanInfo info_result) {
        if (that.getInfo() == info_result) return that;
        else return new IntLiteral(info_result, that.getIntVal(), that.getRadix());
    }

    public AbstractNode forStringLiteralOnly(StringLiteral that, ASTSpanInfo info_result) {
        if (that.getInfo() == info_result) return that;
        else return new StringLiteral(info_result, that.getQuote(), that.getEscaped());
    }

    public AbstractNode forRegularExpressionOnly(RegularExpression that, ASTSpanInfo info_result) {
        if (that.getInfo() == info_result) return that;
        else return new RegularExpression(info_result, that.getBody(), that.getFlag());
    }

    public AbstractNode forVarRefOnly(VarRef that, ASTSpanInfo info_result, Id id_result) {
        if (that.getInfo() == info_result && that.getId() == id_result) return that;
        else return new VarRef(info_result, id_result);
    }

    public AbstractNode forArrayExprOnly(ArrayExpr that, ASTSpanInfo info_result, List<Option<Expr>> elements_result) {
        if (that.getInfo() == info_result && that.getElements() == elements_result) return that;
        else return new ArrayExpr(info_result, elements_result);
    }

    public AbstractNode forArrayNumberExprOnly(ArrayNumberExpr that, ASTSpanInfo info_result) {
        if (that.getInfo() == info_result) return that;
        else return new ArrayNumberExpr(info_result, that.getElements());
    }

    public AbstractNode forObjectExprOnly(ObjectExpr that, ASTSpanInfo info_result, List<Member> members_result) {
        if (that.getInfo() == info_result && that.getMembers() == members_result) return that;
        else return new ObjectExpr(info_result, members_result);
    }

    public AbstractNode forParenthesizedOnly(Parenthesized that, ASTSpanInfo info_result, Expr expr_result) {
        if (that.getInfo() == info_result && that.getExpr() == expr_result) return that;
        else return new Parenthesized(info_result, expr_result);
    }

    public AbstractNode forFunExprOnly(FunExpr that, ASTSpanInfo info_result, Functional ftn_result) {
        if (that.getInfo() == info_result && that.getFtn() == ftn_result) return that;
        else return new FunExpr(info_result, ftn_result);
    }

    public AbstractNode forBracketOnly(Bracket that, ASTSpanInfo info_result, LHS obj_result, Expr index_result) {
        if (that.getInfo() == info_result && that.getObj() == obj_result && that.getIndex() == index_result) return that;
        else return new Bracket(info_result, obj_result, index_result);
    }

    public AbstractNode forDotOnly(Dot that, ASTSpanInfo info_result, LHS obj_result, Id member_result) {
        if (that.getInfo() == info_result && that.getObj() == obj_result && that.getMember() == member_result) return that;
        else return new Dot(info_result, obj_result, member_result);
    }

    public AbstractNode forNewOnly(New that, ASTSpanInfo info_result, LHS lhs_result) {
        if (that.getInfo() == info_result && that.getLhs() == lhs_result) return that;
        else return new New(info_result, lhs_result);
    }

    public AbstractNode forFunAppOnly(FunApp that, ASTSpanInfo info_result, LHS fun_result, List<Expr> args_result) {
        if (that.getInfo() == info_result && that.getFun() == fun_result && that.getArgs() == args_result) return that;
        else return new FunApp(info_result, fun_result, args_result);
    }

    public AbstractNode forPropIdOnly(PropId that, ASTSpanInfo info_result, Id id_result) {
        if (that.getInfo() == info_result && that.getId() == id_result) return that;
        else return new PropId(info_result, id_result);
    }

    public AbstractNode forPropStrOnly(PropStr that, ASTSpanInfo info_result) {
        if (that.getInfo() == info_result) return that;
        else return new PropStr(info_result, that.getStr());
    }

    public AbstractNode forPropNumOnly(PropNum that, ASTSpanInfo info_result, NumberLiteral num_result) {
        if (that.getInfo() == info_result && that.getNum() == num_result) return that;
        else return new PropNum(info_result, num_result);
    }

    public AbstractNode forFieldOnly(Field that, ASTSpanInfo info_result, Property prop_result, Expr expr_result) {
        if (that.getInfo() == info_result && that.getProp() == prop_result && that.getExpr() == expr_result) return that;
        else return new Field(info_result, prop_result, expr_result);
    }

    public AbstractNode forGetPropOnly(GetProp that, ASTSpanInfo info_result, Property prop_result, Functional ftn_result) {
        if (that.getInfo() == info_result && that.getProp() == prop_result && that.getFtn() == ftn_result) return that;
        else return new GetProp(info_result, prop_result, ftn_result);
    }

    public AbstractNode forSetPropOnly(SetProp that, ASTSpanInfo info_result, Property prop_result, Functional ftn_result) {
        if (that.getInfo() == info_result && that.getProp() == prop_result && that.getFtn() == ftn_result) return that;
        else return new SetProp(info_result, prop_result, ftn_result);
    }

    public AbstractNode forIdOnly(Id that, ASTSpanInfo info_result) {
        if (that.getInfo() == info_result) return that;
        else return new Id(info_result, that.getText(), that.getUniqueName(), that.isWith());
    }

    public AbstractNode forOpOnly(Op that, ASTSpanInfo info_result) {
        if (that.getInfo() == info_result) return that;
        else return new Op(info_result, that.getText());
    }

    public AbstractNode forTypeNameOnly(TypeName that, ASTSpanInfo info_result, List<Id> names_result) {
        if (that.getInfo() == info_result && that.getNames() == names_result) return that;
        else return new TypeName(info_result, that.getText(), names_result);
    }

    public AbstractNode forAnonymousFnNameOnly(AnonymousFnName that, ASTSpanInfo info_result) {
        if (that.getInfo() == info_result) return that;
        else return new AnonymousFnName(info_result);
    }

    public AbstractNode forPathOnly(Path that, ASTSpanInfo info_result, List<Id> names_result) {
        if (that.getInfo() == info_result && that.getNames() == names_result) return that;
        else return new Path(info_result, names_result);
    }

    public AbstractNode forModExpStarFromPathOnly(ModExpStarFromPath that, ASTSpanInfo info_result, Path module_result) {
        if (that.getInfo() == info_result && that.getModule() == module_result) return that;
        else return new ModExpStarFromPath(info_result, module_result);
    }

    public AbstractNode forModExpStarOnly(ModExpStar that, ASTSpanInfo info_result) {
        if (that.getInfo() == info_result) return that;
        else return new ModExpStar(info_result);
    }

    public AbstractNode forModExpAliasOnly(ModExpAlias that, ASTSpanInfo info_result, Id name_result, Path alias_result) {
        if (that.getInfo() == info_result && that.getName() == name_result && that.getAlias() == alias_result) return that;
        else return new ModExpAlias(info_result, name_result, alias_result);
    }

    public AbstractNode forModExpNameOnly(ModExpName that, ASTSpanInfo info_result, Path name_result) {
        if (that.getInfo() == info_result && that.getName() == name_result) return that;
        else return new ModExpName(info_result, name_result);
    }

    public AbstractNode forModImpAliasOnly(ModImpAlias that, ASTSpanInfo info_result, Id name_result, Id alias_result) {
        if (that.getInfo() == info_result && that.getName() == name_result && that.getAlias() == alias_result) return that;
        else return new ModImpAlias(info_result, name_result, alias_result);
    }

    public AbstractNode forModImpNameOnly(ModImpName that, ASTSpanInfo info_result, Id name_result) {
        if (that.getInfo() == info_result && that.getName() == name_result) return that;
        else return new ModImpName(info_result, name_result);
    }

    public AbstractNode forLabelOnly(Label that, ASTSpanInfo info_result, Id id_result) {
        if (that.getInfo() == info_result && that.getId() == id_result) return that;
        else return new Label(info_result, id_result);
    }

    public AbstractNode forCommentOnly(Comment that, ASTSpanInfo info_result) {
        if (that.getInfo() == info_result) return that;
        else return new Comment(info_result, that.getComment());
    }

    public AbstractNode forParamOnly(Param that, ASTSpanInfo info_result, Id name_result, Option<Modifier> mod_result, Option<Type> typ_result, Option<Expr> defaultExpr_result) {
        if (that.getInfo() == info_result && that.getName() == name_result && that.getMod() == mod_result && that.getTyp() == typ_result && that.getDefaultExpr() == defaultExpr_result) return that;
        else return new Param(info_result, name_result, mod_result, typ_result, defaultExpr_result, that.isOptional(), that.isRest());
    }

    public AbstractNode forAnyTOnly(AnyT that, ASTSpanInfo info_result) {
        if (that.getInfo() == info_result) return that;
        else return new AnyT(info_result);
    }

    public AbstractNode forNumberTOnly(NumberT that, ASTSpanInfo info_result) {
        if (that.getInfo() == info_result) return that;
        else return new NumberT(info_result);
    }

    public AbstractNode forBoolTOnly(BoolT that, ASTSpanInfo info_result) {
        if (that.getInfo() == info_result) return that;
        else return new BoolT(info_result);
    }

    public AbstractNode forStringTOnly(StringT that, ASTSpanInfo info_result) {
        if (that.getInfo() == info_result) return that;
        else return new StringT(info_result);
    }

    public AbstractNode forVoidTOnly(VoidT that, ASTSpanInfo info_result) {
        if (that.getInfo() == info_result) return that;
        else return new VoidT(info_result);
    }

    public AbstractNode forTypeRefOnly(TypeRef that, ASTSpanInfo info_result, TypeName name_result, List<Type> args_result) {
        if (that.getInfo() == info_result && that.getName() == name_result && that.getArgs() == args_result) return that;
        else return new TypeRef(info_result, name_result, args_result);
    }

    public AbstractNode forTypeQueryOnly(TypeQuery that, ASTSpanInfo info_result, Path path_result) {
        if (that.getInfo() == info_result && that.getPath() == path_result) return that;
        else return new TypeQuery(info_result, path_result);
    }

    public AbstractNode forObjectTypeOnly(ObjectType that, ASTSpanInfo info_result, List<TypeMember> members_result) {
        if (that.getInfo() == info_result && that.getMembers() == members_result) return that;
        else return new ObjectType(info_result, members_result);
    }

    public AbstractNode forArrayTypeOnly(ArrayType that, ASTSpanInfo info_result, Type typ_result) {
        if (that.getInfo() == info_result && that.getTyp() == typ_result) return that;
        else return new ArrayType(info_result, typ_result);
    }

    public AbstractNode forFunctionTypeOnly(FunctionType that, ASTSpanInfo info_result, List<TypeParam> tparams_result, List<Param> params_result, Type typ_result) {
        if (that.getInfo() == info_result && that.getTparams() == tparams_result && that.getParams() == params_result && that.getTyp() == typ_result) return that;
        else return new FunctionType(info_result, tparams_result, params_result, typ_result);
    }

    public AbstractNode forConstructorTypeOnly(ConstructorType that, ASTSpanInfo info_result, List<TypeParam> tparams_result, List<Param> params_result, Type typ_result) {
        if (that.getInfo() == info_result && that.getTparams() == tparams_result && that.getParams() == params_result && that.getTyp() == typ_result) return that;
        else return new ConstructorType(info_result, tparams_result, params_result, typ_result);
    }

    public AbstractNode forExprTypeOnly(ExprType that, ASTSpanInfo info_result) {
        if (that.getInfo() == info_result) return that;
        else return new ExprType(info_result, that.getName());
    }

    public AbstractNode forPropertySigOnly(PropertySig that, ASTSpanInfo info_result, Property prop_result, Option<Type> typ_result) {
        if (that.getInfo() == info_result && that.getProp() == prop_result && that.getTyp() == typ_result) return that;
        else return new PropertySig(info_result, prop_result, that.isOptional(), typ_result);
    }

    public AbstractNode forCallSigOnly(CallSig that, ASTSpanInfo info_result, List<TypeParam> tparams_result, List<Param> params_result, Option<Type> typ_result) {
        if (that.getInfo() == info_result && that.getTparams() == tparams_result && that.getParams() == params_result && that.getTyp() == typ_result) return that;
        else return new CallSig(info_result, tparams_result, params_result, typ_result);
    }

    public AbstractNode forConstructSigOnly(ConstructSig that, ASTSpanInfo info_result, List<TypeParam> tparams_result, List<Param> params_result, Option<Type> typ_result) {
        if (that.getInfo() == info_result && that.getTparams() == tparams_result && that.getParams() == params_result && that.getTyp() == typ_result) return that;
        else return new ConstructSig(info_result, tparams_result, params_result, typ_result);
    }

    public AbstractNode forIndexSigOnly(IndexSig that, ASTSpanInfo info_result, Id id_result, Type annot_result) {
        if (that.getInfo() == info_result && that.getId() == id_result && that.getAnnot() == annot_result) return that;
        else return new IndexSig(info_result, id_result, annot_result, that.isNum());
    }

    public AbstractNode forMethodSigOnly(MethodSig that, ASTSpanInfo info_result, Property prop_result, CallSig sig_result) {
        if (that.getInfo() == info_result && that.getProp() == prop_result && that.getSig() == sig_result) return that;
        else return new MethodSig(info_result, prop_result, that.isOptional(), sig_result);
    }

    public AbstractNode forTypeParamOnly(TypeParam that, ASTSpanInfo info_result, Id name_result, Option<Type> ext_result) {
        if (that.getInfo() == info_result && that.getName() == name_result && that.getExt() == ext_result) return that;
        else return new TypeParam(info_result, name_result, ext_result);
    }

    /** Methods to recur on each child. */

    public AbstractNode forProgram(Program that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        TopLevel body_result = recurOnTopLevel(that.getBody());
        return forProgramOnly(that, info_result, body_result);
    }


    public AbstractNode forModDecl(ModDecl that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Id name_result = (Id) recur(that.getName());
        TopLevel body_result = recurOnTopLevel(that.getBody());
        return forModDeclOnly(that, info_result, name_result, body_result);
    }


    public AbstractNode forModExpVarStmt(ModExpVarStmt that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        List<VarDecl> vds_result = recurOnListOfVarDecl(that.getVds());
        return forModExpVarStmtOnly(that, info_result, vds_result);
    }


    public AbstractNode forModExpFunDecl(ModExpFunDecl that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        FunDecl fd_result = (FunDecl) recur(that.getFd());
        return forModExpFunDeclOnly(that, info_result, fd_result);
    }


    public AbstractNode forModExpGetter(ModExpGetter that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        GetProp fd_result = (GetProp) recur(that.getFd());
        return forModExpGetterOnly(that, info_result, fd_result);
    }


    public AbstractNode forModExpSetter(ModExpSetter that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        SetProp fd_result = (SetProp) recur(that.getFd());
        return forModExpSetterOnly(that, info_result, fd_result);
    }


    public AbstractNode forModExpSpecifiers(ModExpSpecifiers that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        List<ModExpSpecifier> names_result = recurOnListOfModExpSpecifier(that.getNames());
        return forModExpSpecifiersOnly(that, info_result, names_result);
    }


    public AbstractNode forModExpAssignment(ModExpAssignment that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Id id_result = (Id) recur(that.getId());
        return forModExpAssignmentOnly(that, info_result, id_result);
    }


    public AbstractNode forModImpDecl(ModImpDecl that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        List<ModImport> imports_result = recurOnListOfModImport(that.getImports());
        return forModImpDeclOnly(that, info_result, imports_result);
    }


    public AbstractNode forExtImpDecl(ExtImpDecl that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Id id_result = (Id) recur(that.getId());
        return forExtImpDeclOnly(that, info_result, id_result);
    }


    public AbstractNode forTSImpDecl(TSImpDecl that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Id id_result = (Id) recur(that.getId());
        Path path_result = (Path) recur(that.getPath());
        return forTSImpDeclOnly(that, info_result, id_result, path_result);
    }


    public AbstractNode forIntfDecl(IntfDecl that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Id id_result = (Id) recur(that.getId());
        List<TypeParam> tps_result = recurOnListOfTypeParam(that.getTps());
        List<TypeRef> ext_result = recurOnListOfTypeRef(that.getExt());
        ObjectType typ_result = (ObjectType) recur(that.getTyp());
        return forIntfDeclOnly(that, info_result, id_result, tps_result, ext_result, typ_result);
    }


    public AbstractNode forAmbVarDecl(AmbVarDecl that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Id id_result = (Id) recur(that.getId());
        Option<Type> ty_result = recurOnOptionOfType(that.getTy());
        return forAmbVarDeclOnly(that, info_result, id_result, ty_result);
    }


    public AbstractNode forAmbFunDecl(AmbFunDecl that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Id id_result = (Id) recur(that.getId());
        CallSig sig_result = (CallSig) recur(that.getSig());
        return forAmbFunDeclOnly(that, info_result, id_result, sig_result);
    }


    public AbstractNode forAmbClsDecl(AmbClsDecl that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Id id_result = (Id) recur(that.getId());
        List<TypeParam> tps_result = recurOnListOfTypeParam(that.getTps());
        Option<TypeRef> ext_result = recurOnOptionOfTypeRef(that.getExt());
        List<TypeRef> imp_result = recurOnListOfTypeRef(that.getImp());
        List<AmbClsElt> elts_result = recurOnListOfAmbClsElt(that.getElts());
        return forAmbClsDeclOnly(that, info_result, id_result, tps_result, ext_result, imp_result, elts_result);
    }


    public AbstractNode forAmbEnumDecl(AmbEnumDecl that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Id id_result = (Id) recur(that.getId());
        List<AmbEnumMem> mem_result = recurOnListOfAmbEnumMem(that.getMem());
        return forAmbEnumDeclOnly(that, info_result, id_result, mem_result);
    }


    public AbstractNode forAmbModDecl(AmbModDecl that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Path path_result = (Path) recur(that.getPath());
        List<AmbModElt> mem_result = recurOnListOfAmbModElt(that.getMem());
        return forAmbModDeclOnly(that, info_result, path_result, mem_result);
    }


    public AbstractNode forAmbExtModDecl(AmbExtModDecl that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        List<AmbExtModElt> mem_result = recurOnListOfAmbExtModElt(that.getMem());
        return forAmbExtModDeclOnly(that, info_result, mem_result);
    }


    public AbstractNode forNoOp(NoOp that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        return forNoOpOnly(that, info_result);
    }


    public AbstractNode forStmtUnit(StmtUnit that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        List<Stmt> stmts_result = recurOnListOfStmt(that.getStmts());
        return forStmtUnitOnly(that, info_result, stmts_result);
    }


    public AbstractNode forFunDecl(FunDecl that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Functional ftn_result = recurOnFunctional(that.getFtn());
        return forFunDeclOnly(that, info_result, ftn_result);
    }


    public AbstractNode forBlock(Block that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        List<Stmt> stmts_result = recurOnListOfStmt(that.getStmts());
        return forBlockOnly(that, info_result, stmts_result);
    }


    public AbstractNode forVarStmt(VarStmt that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        List<VarDecl> vds_result = recurOnListOfVarDecl(that.getVds());
        return forVarStmtOnly(that, info_result, vds_result);
    }


    public AbstractNode forEmptyStmt(EmptyStmt that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        return forEmptyStmtOnly(that, info_result);
    }


    public AbstractNode forExprStmt(ExprStmt that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Expr expr_result = (Expr) recur(that.getExpr());
        return forExprStmtOnly(that, info_result, expr_result);
    }


    public AbstractNode forIf(If that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Expr cond_result = (Expr) recur(that.getCond());
        Stmt trueBranch_result = (Stmt) recur(that.getTrueBranch());
        Option<Stmt> falseBranch_result = recurOnOptionOfStmt(that.getFalseBranch());
        return forIfOnly(that, info_result, cond_result, trueBranch_result, falseBranch_result);
    }


    public AbstractNode forDoWhile(DoWhile that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Stmt body_result = (Stmt) recur(that.getBody());
        Expr cond_result = (Expr) recur(that.getCond());
        return forDoWhileOnly(that, info_result, body_result, cond_result);
    }


    public AbstractNode forWhile(While that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Expr cond_result = (Expr) recur(that.getCond());
        Stmt body_result = (Stmt) recur(that.getBody());
        return forWhileOnly(that, info_result, cond_result, body_result);
    }


    public AbstractNode forFor(For that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Option<Expr> init_result = recurOnOptionOfExpr(that.getInit());
        Option<Expr> cond_result = recurOnOptionOfExpr(that.getCond());
        Option<Expr> action_result = recurOnOptionOfExpr(that.getAction());
        Stmt body_result = (Stmt) recur(that.getBody());
        return forForOnly(that, info_result, init_result, cond_result, action_result, body_result);
    }


    public AbstractNode forForIn(ForIn that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        LHS lhs_result = (LHS) recur(that.getLhs());
        Expr expr_result = (Expr) recur(that.getExpr());
        Stmt body_result = (Stmt) recur(that.getBody());
        return forForInOnly(that, info_result, lhs_result, expr_result, body_result);
    }


    public AbstractNode forForVar(ForVar that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        List<VarDecl> vars_result = recurOnListOfVarDecl(that.getVars());
        Option<Expr> cond_result = recurOnOptionOfExpr(that.getCond());
        Option<Expr> action_result = recurOnOptionOfExpr(that.getAction());
        Stmt body_result = (Stmt) recur(that.getBody());
        return forForVarOnly(that, info_result, vars_result, cond_result, action_result, body_result);
    }


    public AbstractNode forForVarIn(ForVarIn that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        VarDecl var_result = (VarDecl) recur(that.getVar());
        Expr expr_result = (Expr) recur(that.getExpr());
        Stmt body_result = (Stmt) recur(that.getBody());
        return forForVarInOnly(that, info_result, var_result, expr_result, body_result);
    }


    public AbstractNode forContinue(Continue that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Option<Label> target_result = recurOnOptionOfLabel(that.getTarget());
        return forContinueOnly(that, info_result, target_result);
    }


    public AbstractNode forBreak(Break that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Option<Label> target_result = recurOnOptionOfLabel(that.getTarget());
        return forBreakOnly(that, info_result, target_result);
    }


    public AbstractNode forReturn(Return that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Option<Expr> expr_result = recurOnOptionOfExpr(that.getExpr());
        return forReturnOnly(that, info_result, expr_result);
    }


    public AbstractNode forWith(With that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Expr expr_result = (Expr) recur(that.getExpr());
        Stmt stmt_result = (Stmt) recur(that.getStmt());
        return forWithOnly(that, info_result, expr_result, stmt_result);
    }


    public AbstractNode forSwitch(Switch that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Expr cond_result = (Expr) recur(that.getCond());
        List<Case> frontCases_result = recurOnListOfCase(that.getFrontCases());
        Option<List<Stmt>> def_result = recurOnOptionOfListOfStmt(that.getDef());
        List<Case> backCases_result = recurOnListOfCase(that.getBackCases());
        return forSwitchOnly(that, info_result, cond_result, frontCases_result, def_result, backCases_result);
    }


    public AbstractNode forLabelStmt(LabelStmt that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Label label_result = (Label) recur(that.getLabel());
        Stmt stmt_result = (Stmt) recur(that.getStmt());
        return forLabelStmtOnly(that, info_result, label_result, stmt_result);
    }


    public AbstractNode forThrow(Throw that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Expr expr_result = (Expr) recur(that.getExpr());
        return forThrowOnly(that, info_result, expr_result);
    }


    public AbstractNode forTry(Try that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        List<Stmt> body_result = recurOnListOfStmt(that.getBody());
        Option<Catch> catchBlock_result = recurOnOptionOfCatch(that.getCatchBlock());
        Option<List<Stmt>> fin_result = recurOnOptionOfListOfStmt(that.getFin());
        return forTryOnly(that, info_result, body_result, catchBlock_result, fin_result);
    }


    public AbstractNode forDebugger(Debugger that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        return forDebuggerOnly(that, info_result);
    }


    public AbstractNode forSourceElements(SourceElements that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        List<SourceElement> body_result = recurOnListOfSourceElement(that.getBody());
        return forSourceElementsOnly(that, info_result, body_result);
    }


    public AbstractNode forVarDecl(VarDecl that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Id name_result = (Id) recur(that.getName());
        Option<Expr> expr_result = recurOnOptionOfExpr(that.getExpr());
        return forVarDeclOnly(that, info_result, name_result, expr_result);
    }


    public AbstractNode forCase(Case that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Expr cond_result = (Expr) recur(that.getCond());
        List<Stmt> body_result = recurOnListOfStmt(that.getBody());
        return forCaseOnly(that, info_result, cond_result, body_result);
    }


    public AbstractNode forCatch(Catch that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Id id_result = (Id) recur(that.getId());
        List<Stmt> body_result = recurOnListOfStmt(that.getBody());
        return forCatchOnly(that, info_result, id_result, body_result);
    }


    public AbstractNode forModImpSpecifierSet(ModImpSpecifierSet that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        List<ModImpSpecifier> imports_result = recurOnListOfModImpSpecifier(that.getImports());
        Path module_result = (Path) recur(that.getModule());
        return forModImpSpecifierSetOnly(that, info_result, imports_result, module_result);
    }


    public AbstractNode forModImpAliasClause(ModImpAliasClause that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Path name_result = (Path) recur(that.getName());
        Id alias_result = (Id) recur(that.getAlias());
        return forModImpAliasClauseOnly(that, info_result, name_result, alias_result);
    }


    public AbstractNode forAmbCnstDecl(AmbCnstDecl that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        List<Param> ps_result = recurOnListOfParam(that.getPs());
        return forAmbCnstDeclOnly(that, info_result, ps_result);
    }


    public AbstractNode forAmbMemDecl(AmbMemDecl that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        List<Modifier> mods_result = recurOnListOfModifier(that.getMods());
        Property prop_result = (Property) recur(that.getProp());
        Option<Type> typ_result = recurOnOptionOfType(that.getTyp());
        return forAmbMemDeclOnly(that, info_result, mods_result, prop_result, typ_result);
    }


    public AbstractNode forAmbIndDecl(AmbIndDecl that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        IndexSig ind_result = (IndexSig) recur(that.getInd());
        return forAmbIndDeclOnly(that, info_result, ind_result);
    }


    public AbstractNode forAmbEnumMem(AmbEnumMem that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Property prop_result = (Property) recur(that.getProp());
        Option<NumberLiteral> num_result = recurOnOptionOfNumberLiteral(that.getNum());
        return forAmbEnumMemOnly(that, info_result, prop_result, num_result);
    }


    public AbstractNode forAmbModElt(AmbModElt that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        SourceElement decl_result = (SourceElement) recur(that.getDecl());
        return forAmbModEltOnly(that, info_result, decl_result);
    }


    public AbstractNode forAmbExtModElt(AmbExtModElt that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        SourceElement decl_result = (SourceElement) recur(that.getDecl());
        return forAmbExtModEltOnly(that, info_result, decl_result);
    }


    public AbstractNode forExprList(ExprList that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        List<Expr> exprs_result = recurOnListOfExpr(that.getExprs());
        return forExprListOnly(that, info_result, exprs_result);
    }


    public AbstractNode forCond(Cond that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Expr cond_result = (Expr) recur(that.getCond());
        Expr trueBranch_result = (Expr) recur(that.getTrueBranch());
        Expr falseBranch_result = (Expr) recur(that.getFalseBranch());
        return forCondOnly(that, info_result, cond_result, trueBranch_result, falseBranch_result);
    }


    public AbstractNode forInfixOpApp(InfixOpApp that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Expr left_result = (Expr) recur(that.getLeft());
        Op op_result = (Op) recur(that.getOp());
        Expr right_result = (Expr) recur(that.getRight());
        return forInfixOpAppOnly(that, info_result, left_result, op_result, right_result);
    }


    public AbstractNode forPrefixOpApp(PrefixOpApp that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Op op_result = (Op) recur(that.getOp());
        Expr right_result = (Expr) recur(that.getRight());
        return forPrefixOpAppOnly(that, info_result, op_result, right_result);
    }


    public AbstractNode forUnaryAssignOpApp(UnaryAssignOpApp that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        LHS lhs_result = (LHS) recur(that.getLhs());
        Op op_result = (Op) recur(that.getOp());
        return forUnaryAssignOpAppOnly(that, info_result, lhs_result, op_result);
    }


    public AbstractNode forAssignOpApp(AssignOpApp that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        LHS lhs_result = (LHS) recur(that.getLhs());
        Op op_result = (Op) recur(that.getOp());
        Expr right_result = (Expr) recur(that.getRight());
        return forAssignOpAppOnly(that, info_result, lhs_result, op_result, right_result);
    }


    public AbstractNode forThis(This that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        return forThisOnly(that, info_result);
    }


    public AbstractNode forNull(Null that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        return forNullOnly(that, info_result);
    }


    public AbstractNode forBool(Bool that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        return forBoolOnly(that, info_result);
    }


    public AbstractNode forDoubleLiteral(DoubleLiteral that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        return forDoubleLiteralOnly(that, info_result);
    }


    public AbstractNode forIntLiteral(IntLiteral that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        return forIntLiteralOnly(that, info_result);
    }


    public AbstractNode forStringLiteral(StringLiteral that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        return forStringLiteralOnly(that, info_result);
    }


    public AbstractNode forRegularExpression(RegularExpression that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        return forRegularExpressionOnly(that, info_result);
    }


    public AbstractNode forVarRef(VarRef that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Id id_result = (Id) recur(that.getId());
        return forVarRefOnly(that, info_result, id_result);
    }


    public AbstractNode forArrayExpr(ArrayExpr that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        List<Option<Expr>> elements_result = recurOnListOfOptionOfExpr(that.getElements());
        return forArrayExprOnly(that, info_result, elements_result);
    }


    public AbstractNode forArrayNumberExpr(ArrayNumberExpr that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        return forArrayNumberExprOnly(that, info_result);
    }


    public AbstractNode forObjectExpr(ObjectExpr that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        List<Member> members_result = recurOnListOfMember(that.getMembers());
        return forObjectExprOnly(that, info_result, members_result);
    }


    public AbstractNode forParenthesized(Parenthesized that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Expr expr_result = (Expr) recur(that.getExpr());
        return forParenthesizedOnly(that, info_result, expr_result);
    }


    public AbstractNode forFunExpr(FunExpr that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Functional ftn_result = recurOnFunctional(that.getFtn());
        return forFunExprOnly(that, info_result, ftn_result);
    }


    public AbstractNode forBracket(Bracket that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        LHS obj_result = (LHS) recur(that.getObj());
        Expr index_result = (Expr) recur(that.getIndex());
        return forBracketOnly(that, info_result, obj_result, index_result);
    }


    public AbstractNode forDot(Dot that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        LHS obj_result = (LHS) recur(that.getObj());
        Id member_result = (Id) recur(that.getMember());
        return forDotOnly(that, info_result, obj_result, member_result);
    }


    public AbstractNode forNew(New that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        LHS lhs_result = (LHS) recur(that.getLhs());
        return forNewOnly(that, info_result, lhs_result);
    }


    public AbstractNode forFunApp(FunApp that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        LHS fun_result = (LHS) recur(that.getFun());
        List<Expr> args_result = recurOnListOfExpr(that.getArgs());
        return forFunAppOnly(that, info_result, fun_result, args_result);
    }


    public AbstractNode forPropId(PropId that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Id id_result = (Id) recur(that.getId());
        return forPropIdOnly(that, info_result, id_result);
    }


    public AbstractNode forPropStr(PropStr that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        return forPropStrOnly(that, info_result);
    }


    public AbstractNode forPropNum(PropNum that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        NumberLiteral num_result = (NumberLiteral) recur(that.getNum());
        return forPropNumOnly(that, info_result, num_result);
    }


    public AbstractNode forField(Field that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Property prop_result = (Property) recur(that.getProp());
        Expr expr_result = (Expr) recur(that.getExpr());
        return forFieldOnly(that, info_result, prop_result, expr_result);
    }


    public AbstractNode forGetProp(GetProp that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Property prop_result = (Property) recur(that.getProp());
        Functional ftn_result = recurOnFunctional(that.getFtn());
        return forGetPropOnly(that, info_result, prop_result, ftn_result);
    }


    public AbstractNode forSetProp(SetProp that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Property prop_result = (Property) recur(that.getProp());
        Functional ftn_result = recurOnFunctional(that.getFtn());
        return forSetPropOnly(that, info_result, prop_result, ftn_result);
    }


    public AbstractNode forId(Id that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        return forIdOnly(that, info_result);
    }


    public AbstractNode forOp(Op that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        return forOpOnly(that, info_result);
    }


    public AbstractNode forTypeName(TypeName that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        List<Id> names_result = recurOnListOfId(that.getNames());
        return forTypeNameOnly(that, info_result, names_result);
    }


    public AbstractNode forAnonymousFnName(AnonymousFnName that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        return forAnonymousFnNameOnly(that, info_result);
    }


    public AbstractNode forPath(Path that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        List<Id> names_result = recurOnListOfId(that.getNames());
        return forPathOnly(that, info_result, names_result);
    }


    public AbstractNode forModExpStarFromPath(ModExpStarFromPath that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Path module_result = (Path) recur(that.getModule());
        return forModExpStarFromPathOnly(that, info_result, module_result);
    }


    public AbstractNode forModExpStar(ModExpStar that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        return forModExpStarOnly(that, info_result);
    }


    public AbstractNode forModExpAlias(ModExpAlias that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Id name_result = (Id) recur(that.getName());
        Path alias_result = (Path) recur(that.getAlias());
        return forModExpAliasOnly(that, info_result, name_result, alias_result);
    }


    public AbstractNode forModExpName(ModExpName that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Path name_result = (Path) recur(that.getName());
        return forModExpNameOnly(that, info_result, name_result);
    }


    public AbstractNode forModImpAlias(ModImpAlias that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Id name_result = (Id) recur(that.getName());
        Id alias_result = (Id) recur(that.getAlias());
        return forModImpAliasOnly(that, info_result, name_result, alias_result);
    }


    public AbstractNode forModImpName(ModImpName that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Id name_result = (Id) recur(that.getName());
        return forModImpNameOnly(that, info_result, name_result);
    }


    public AbstractNode forLabel(Label that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Id id_result = (Id) recur(that.getId());
        return forLabelOnly(that, info_result, id_result);
    }


    public AbstractNode forComment(Comment that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        return forCommentOnly(that, info_result);
    }


    public AbstractNode forParam(Param that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Id name_result = (Id) recur(that.getName());
        Option<Modifier> mod_result = recurOnOptionOfModifier(that.getMod());
        Option<Type> typ_result = recurOnOptionOfType(that.getTyp());
        Option<Expr> defaultExpr_result = recurOnOptionOfExpr(that.getDefaultExpr());
        return forParamOnly(that, info_result, name_result, mod_result, typ_result, defaultExpr_result);
    }


    public AbstractNode forAnyT(AnyT that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        return forAnyTOnly(that, info_result);
    }


    public AbstractNode forNumberT(NumberT that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        return forNumberTOnly(that, info_result);
    }


    public AbstractNode forBoolT(BoolT that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        return forBoolTOnly(that, info_result);
    }


    public AbstractNode forStringT(StringT that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        return forStringTOnly(that, info_result);
    }


    public AbstractNode forVoidT(VoidT that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        return forVoidTOnly(that, info_result);
    }


    public AbstractNode forTypeRef(TypeRef that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        TypeName name_result = (TypeName) recur(that.getName());
        List<Type> args_result = recurOnListOfType(that.getArgs());
        return forTypeRefOnly(that, info_result, name_result, args_result);
    }


    public AbstractNode forTypeQuery(TypeQuery that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Path path_result = (Path) recur(that.getPath());
        return forTypeQueryOnly(that, info_result, path_result);
    }


    public AbstractNode forObjectType(ObjectType that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        List<TypeMember> members_result = recurOnListOfTypeMember(that.getMembers());
        return forObjectTypeOnly(that, info_result, members_result);
    }


    public AbstractNode forArrayType(ArrayType that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Type typ_result = (Type) recur(that.getTyp());
        return forArrayTypeOnly(that, info_result, typ_result);
    }


    public AbstractNode forFunctionType(FunctionType that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        List<TypeParam> tparams_result = recurOnListOfTypeParam(that.getTparams());
        List<Param> params_result = recurOnListOfParam(that.getParams());
        Type typ_result = (Type) recur(that.getTyp());
        return forFunctionTypeOnly(that, info_result, tparams_result, params_result, typ_result);
    }


    public AbstractNode forConstructorType(ConstructorType that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        List<TypeParam> tparams_result = recurOnListOfTypeParam(that.getTparams());
        List<Param> params_result = recurOnListOfParam(that.getParams());
        Type typ_result = (Type) recur(that.getTyp());
        return forConstructorTypeOnly(that, info_result, tparams_result, params_result, typ_result);
    }


    public AbstractNode forExprType(ExprType that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        return forExprTypeOnly(that, info_result);
    }


    public AbstractNode forPropertySig(PropertySig that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Property prop_result = (Property) recur(that.getProp());
        Option<Type> typ_result = recurOnOptionOfType(that.getTyp());
        return forPropertySigOnly(that, info_result, prop_result, typ_result);
    }


    public AbstractNode forCallSig(CallSig that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        List<TypeParam> tparams_result = recurOnListOfTypeParam(that.getTparams());
        List<Param> params_result = recurOnListOfParam(that.getParams());
        Option<Type> typ_result = recurOnOptionOfType(that.getTyp());
        return forCallSigOnly(that, info_result, tparams_result, params_result, typ_result);
    }


    public AbstractNode forConstructSig(ConstructSig that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        List<TypeParam> tparams_result = recurOnListOfTypeParam(that.getTparams());
        List<Param> params_result = recurOnListOfParam(that.getParams());
        Option<Type> typ_result = recurOnOptionOfType(that.getTyp());
        return forConstructSigOnly(that, info_result, tparams_result, params_result, typ_result);
    }


    public AbstractNode forIndexSig(IndexSig that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Id id_result = (Id) recur(that.getId());
        Type annot_result = (Type) recur(that.getAnnot());
        return forIndexSigOnly(that, info_result, id_result, annot_result);
    }


    public AbstractNode forMethodSig(MethodSig that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Property prop_result = (Property) recur(that.getProp());
        CallSig sig_result = (CallSig) recur(that.getSig());
        return forMethodSigOnly(that, info_result, prop_result, sig_result);
    }


    public AbstractNode forTypeParam(TypeParam that) {
        ASTSpanInfo info_result = recurOnASTSpanInfo(that.getInfo());
        Id name_result = (Id) recur(that.getName());
        Option<Type> ext_result = recurOnOptionOfType(that.getExt());
        return forTypeParamOnly(that, info_result, name_result, ext_result);
    }


    public AbstractNode recur(AbstractNode that) {
        return that.accept(this);
    }

    public ASTSpanInfo recurOnASTSpanInfo(ASTSpanInfo that) {
        return that;
    }

    public TopLevel recurOnTopLevel(TopLevel that) {
        return that;
    }

    public List<VarDecl> recurOnListOfVarDecl(List<VarDecl> that) {
        java.util.ArrayList<VarDecl> accum = new java.util.ArrayList<VarDecl>();
        boolean unchanged = true;
        for (VarDecl elt : that) {
            VarDecl update_elt = (VarDecl) recur(elt);
            unchanged &= (elt == update_elt);
            accum.add(update_elt);
        }
        return unchanged ? that : accum;
    }

    public List<ModExpSpecifier> recurOnListOfModExpSpecifier(List<ModExpSpecifier> that) {
        java.util.ArrayList<ModExpSpecifier> accum = new java.util.ArrayList<ModExpSpecifier>();
        boolean unchanged = true;
        for (ModExpSpecifier elt : that) {
            ModExpSpecifier update_elt = (ModExpSpecifier) recur(elt);
            unchanged &= (elt == update_elt);
            accum.add(update_elt);
        }
        return unchanged ? that : accum;
    }

    public List<ModImport> recurOnListOfModImport(List<ModImport> that) {
        java.util.ArrayList<ModImport> accum = new java.util.ArrayList<ModImport>();
        boolean unchanged = true;
        for (ModImport elt : that) {
            ModImport update_elt = (ModImport) recur(elt);
            unchanged &= (elt == update_elt);
            accum.add(update_elt);
        }
        return unchanged ? that : accum;
    }

    public List<TypeParam> recurOnListOfTypeParam(List<TypeParam> that) {
        java.util.ArrayList<TypeParam> accum = new java.util.ArrayList<TypeParam>();
        boolean unchanged = true;
        for (TypeParam elt : that) {
            TypeParam update_elt = (TypeParam) recur(elt);
            unchanged &= (elt == update_elt);
            accum.add(update_elt);
        }
        return unchanged ? that : accum;
    }

    public List<TypeRef> recurOnListOfTypeRef(List<TypeRef> that) {
        java.util.ArrayList<TypeRef> accum = new java.util.ArrayList<TypeRef>();
        boolean unchanged = true;
        for (TypeRef elt : that) {
            TypeRef update_elt = (TypeRef) recur(elt);
            unchanged &= (elt == update_elt);
            accum.add(update_elt);
        }
        return unchanged ? that : accum;
    }

    public Option<Type> recurOnOptionOfType(Option<Type> that) {
        if (that.isNone()) { return that; }
        else {
            Type original = that.unwrap();
            Type updated = (Type) recur(original);
            return (original == updated) ? that : Option.<Type>some(updated);
        }
    }

    public Option<TypeRef> recurOnOptionOfTypeRef(Option<TypeRef> that) {
        if (that.isNone()) { return that; }
        else {
            TypeRef original = that.unwrap();
            TypeRef updated = (TypeRef) recur(original);
            return (original == updated) ? that : Option.<TypeRef>some(updated);
        }
    }

    public List<AmbClsElt> recurOnListOfAmbClsElt(List<AmbClsElt> that) {
        java.util.ArrayList<AmbClsElt> accum = new java.util.ArrayList<AmbClsElt>();
        boolean unchanged = true;
        for (AmbClsElt elt : that) {
            AmbClsElt update_elt = (AmbClsElt) recur(elt);
            unchanged &= (elt == update_elt);
            accum.add(update_elt);
        }
        return unchanged ? that : accum;
    }

    public List<AmbEnumMem> recurOnListOfAmbEnumMem(List<AmbEnumMem> that) {
        java.util.ArrayList<AmbEnumMem> accum = new java.util.ArrayList<AmbEnumMem>();
        boolean unchanged = true;
        for (AmbEnumMem elt : that) {
            AmbEnumMem update_elt = (AmbEnumMem) recur(elt);
            unchanged &= (elt == update_elt);
            accum.add(update_elt);
        }
        return unchanged ? that : accum;
    }

    public List<AmbModElt> recurOnListOfAmbModElt(List<AmbModElt> that) {
        java.util.ArrayList<AmbModElt> accum = new java.util.ArrayList<AmbModElt>();
        boolean unchanged = true;
        for (AmbModElt elt : that) {
            AmbModElt update_elt = (AmbModElt) recur(elt);
            unchanged &= (elt == update_elt);
            accum.add(update_elt);
        }
        return unchanged ? that : accum;
    }

    public List<AmbExtModElt> recurOnListOfAmbExtModElt(List<AmbExtModElt> that) {
        java.util.ArrayList<AmbExtModElt> accum = new java.util.ArrayList<AmbExtModElt>();
        boolean unchanged = true;
        for (AmbExtModElt elt : that) {
            AmbExtModElt update_elt = (AmbExtModElt) recur(elt);
            unchanged &= (elt == update_elt);
            accum.add(update_elt);
        }
        return unchanged ? that : accum;
    }

    public List<Stmt> recurOnListOfStmt(List<Stmt> that) {
        java.util.ArrayList<Stmt> accum = new java.util.ArrayList<Stmt>();
        boolean unchanged = true;
        for (Stmt elt : that) {
            Stmt update_elt = (Stmt) recur(elt);
            unchanged &= (elt == update_elt);
            accum.add(update_elt);
        }
        return unchanged ? that : accum;
    }

    public Functional recurOnFunctional(Functional that) {
        return that;
    }

    public Option<Stmt> recurOnOptionOfStmt(Option<Stmt> that) {
        if (that.isNone()) { return that; }
        else {
            Stmt original = that.unwrap();
            Stmt updated = (Stmt) recur(original);
            return (original == updated) ? that : Option.<Stmt>some(updated);
        }
    }

    public Option<Expr> recurOnOptionOfExpr(Option<Expr> that) {
        if (that.isNone()) { return that; }
        else {
            Expr original = that.unwrap();
            Expr updated = (Expr) recur(original);
            return (original == updated) ? that : Option.<Expr>some(updated);
        }
    }

    public Option<Label> recurOnOptionOfLabel(Option<Label> that) {
        if (that.isNone()) { return that; }
        else {
            Label original = that.unwrap();
            Label updated = (Label) recur(original);
            return (original == updated) ? that : Option.<Label>some(updated);
        }
    }

    public List<Case> recurOnListOfCase(List<Case> that) {
        java.util.ArrayList<Case> accum = new java.util.ArrayList<Case>();
        boolean unchanged = true;
        for (Case elt : that) {
            Case update_elt = (Case) recur(elt);
            unchanged &= (elt == update_elt);
            accum.add(update_elt);
        }
        return unchanged ? that : accum;
    }

    public Option<List<Stmt>> recurOnOptionOfListOfStmt(Option<List<Stmt>> that) {
        if (that.isNone()) { return that; }
        else {
            List<Stmt> original = that.unwrap();
            List<Stmt> updated = recurOnListOfStmt(original);
            return (original == updated) ? that : Option.<List<Stmt>>some(updated);
        }
    }

    public Option<Catch> recurOnOptionOfCatch(Option<Catch> that) {
        if (that.isNone()) { return that; }
        else {
            Catch original = that.unwrap();
            Catch updated = (Catch) recur(original);
            return (original == updated) ? that : Option.<Catch>some(updated);
        }
    }

    public List<SourceElement> recurOnListOfSourceElement(List<SourceElement> that) {
        java.util.ArrayList<SourceElement> accum = new java.util.ArrayList<SourceElement>();
        boolean unchanged = true;
        for (SourceElement elt : that) {
            SourceElement update_elt = (SourceElement) recur(elt);
            unchanged &= (elt == update_elt);
            accum.add(update_elt);
        }
        return unchanged ? that : accum;
    }

    public List<ModImpSpecifier> recurOnListOfModImpSpecifier(List<ModImpSpecifier> that) {
        java.util.ArrayList<ModImpSpecifier> accum = new java.util.ArrayList<ModImpSpecifier>();
        boolean unchanged = true;
        for (ModImpSpecifier elt : that) {
            ModImpSpecifier update_elt = (ModImpSpecifier) recur(elt);
            unchanged &= (elt == update_elt);
            accum.add(update_elt);
        }
        return unchanged ? that : accum;
    }

    public List<Param> recurOnListOfParam(List<Param> that) {
        java.util.ArrayList<Param> accum = new java.util.ArrayList<Param>();
        boolean unchanged = true;
        for (Param elt : that) {
            Param update_elt = (Param) recur(elt);
            unchanged &= (elt == update_elt);
            accum.add(update_elt);
        }
        return unchanged ? that : accum;
    }

    public Modifier recurOnModifier(Modifier that) {
        return that;
    }

    public List<Modifier> recurOnListOfModifier(List<Modifier> that) {
        java.util.ArrayList<Modifier> accum = new java.util.ArrayList<Modifier>();
        boolean unchanged = true;
        for (Modifier elt : that) {
            Modifier update_elt = recurOnModifier(elt);
            unchanged &= (elt == update_elt);
            accum.add(update_elt);
        }
        return unchanged ? that : accum;
    }

    public Option<NumberLiteral> recurOnOptionOfNumberLiteral(Option<NumberLiteral> that) {
        if (that.isNone()) { return that; }
        else {
            NumberLiteral original = that.unwrap();
            NumberLiteral updated = (NumberLiteral) recur(original);
            return (original == updated) ? that : Option.<NumberLiteral>some(updated);
        }
    }

    public List<Expr> recurOnListOfExpr(List<Expr> that) {
        java.util.ArrayList<Expr> accum = new java.util.ArrayList<Expr>();
        boolean unchanged = true;
        for (Expr elt : that) {
            Expr update_elt = (Expr) recur(elt);
            unchanged &= (elt == update_elt);
            accum.add(update_elt);
        }
        return unchanged ? that : accum;
    }

    public List<Option<Expr>> recurOnListOfOptionOfExpr(List<Option<Expr>> that) {
        java.util.ArrayList<Option<Expr>> accum = new java.util.ArrayList<Option<Expr>>();
        boolean unchanged = true;
        for (Option<Expr> elt : that) {
            Option<Expr> update_elt = recurOnOptionOfExpr(elt);
            unchanged &= (elt == update_elt);
            accum.add(update_elt);
        }
        return unchanged ? that : accum;
    }

    public List<Member> recurOnListOfMember(List<Member> that) {
        java.util.ArrayList<Member> accum = new java.util.ArrayList<Member>();
        boolean unchanged = true;
        for (Member elt : that) {
            Member update_elt = (Member) recur(elt);
            unchanged &= (elt == update_elt);
            accum.add(update_elt);
        }
        return unchanged ? that : accum;
    }

    public List<Id> recurOnListOfId(List<Id> that) {
        java.util.ArrayList<Id> accum = new java.util.ArrayList<Id>();
        boolean unchanged = true;
        for (Id elt : that) {
            Id update_elt = (Id) recur(elt);
            unchanged &= (elt == update_elt);
            accum.add(update_elt);
        }
        return unchanged ? that : accum;
    }

    public Option<Modifier> recurOnOptionOfModifier(Option<Modifier> that) {
        if (that.isNone()) { return that; }
        else {
            Modifier original = that.unwrap();
            Modifier updated = recurOnModifier(original);
            return (original == updated) ? that : Option.<Modifier>some(updated);
        }
    }

    public List<Type> recurOnListOfType(List<Type> that) {
        java.util.ArrayList<Type> accum = new java.util.ArrayList<Type>();
        boolean unchanged = true;
        for (Type elt : that) {
            Type update_elt = (Type) recur(elt);
            unchanged &= (elt == update_elt);
            accum.add(update_elt);
        }
        return unchanged ? that : accum;
    }

    public List<TypeMember> recurOnListOfTypeMember(List<TypeMember> that) {
        java.util.ArrayList<TypeMember> accum = new java.util.ArrayList<TypeMember>();
        boolean unchanged = true;
        for (TypeMember elt : that) {
            TypeMember update_elt = (TypeMember) recur(elt);
            unchanged &= (elt == update_elt);
            accum.add(update_elt);
        }
        return unchanged ? that : accum;
    }
}
