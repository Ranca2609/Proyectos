// Generated from C:/Users/Carlos Rangel/Documents/GitHub/OLC2/src\Gramatica.g4 by ANTLR 4.10.1
package Gramatica;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GramaticaParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(GramaticaParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(GramaticaParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GramaticaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#subrutina}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubrutina(GramaticaParser.SubrutinaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#lista_parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_parametros(GramaticaParser.Lista_parametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(GramaticaParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#ldeclp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLdeclp(GramaticaParser.LdeclpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#declaraciones_with_intent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones_with_intent(GramaticaParser.Declaraciones_with_intentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#if_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_(GramaticaParser.If_Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#else_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if(GramaticaParser.Else_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#if_doble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_doble(GramaticaParser.If_dobleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#if_else_doble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else_doble(GramaticaParser.If_else_dobleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#if_triple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_triple(GramaticaParser.If_tripleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#if_else_triple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else_triple(GramaticaParser.If_else_tripleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#if_cuadruple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_cuadruple(GramaticaParser.If_cuadrupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#if_else_cuadruple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else_cuadruple(GramaticaParser.If_else_cuadrupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#declara_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclara_default(GramaticaParser.Declara_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(GramaticaParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#lis_declararion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLis_declararion(GramaticaParser.Lis_declararionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(GramaticaParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#arreglos_dos_decla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArreglos_dos_decla(GramaticaParser.Arreglos_dos_declaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#arreglos_declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArreglos_declaracion(GramaticaParser.Arreglos_declaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#dec_1D_arreglos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_1D_arreglos(GramaticaParser.Dec_1D_arreglosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#dec_allocate_1D}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_allocate_1D(GramaticaParser.Dec_allocate_1DContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#dec_allocate_2D}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_allocate_2D(GramaticaParser.Dec_allocate_2DContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#acceso_arreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcceso_arreglo(GramaticaParser.Acceso_arregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#asiganacion_2D}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsiganacion_2D(GramaticaParser.Asiganacion_2DContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#asignacion_arreglos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_arreglos(GramaticaParser.Asignacion_arreglosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#do}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo(GramaticaParser.DoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while(GramaticaParser.Do_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#dellocate_1D}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDellocate_1D(GramaticaParser.Dellocate_1DContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#tipado_arreglos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipado_arreglos(GramaticaParser.Tipado_arreglosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(GramaticaParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(GramaticaParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code enteroExp}
	 * labeled alternative in {@link GramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnteroExp(GramaticaParser.EnteroExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cadeExp}
	 * labeled alternative in {@link GramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCadeExp(GramaticaParser.CadeExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code complejoExp}
	 * labeled alternative in {@link GramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplejoExp(GramaticaParser.ComplejoExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link GramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExpr(GramaticaParser.FuncExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nada}
	 * labeled alternative in {@link GramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNada(GramaticaParser.NadaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicaAnd}
	 * labeled alternative in {@link GramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicaAnd(GramaticaParser.LogicaAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opLogicalNot}
	 * labeled alternative in {@link GramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpLogicalNot(GramaticaParser.OpLogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aceso_areglo_cor}
	 * labeled alternative in {@link GramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAceso_areglo_cor(GramaticaParser.Aceso_areglo_corContext ctx);
	/**
	 * Visit a parse tree produced by the {@code size_array}
	 * labeled alternative in {@link GramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize_array(GramaticaParser.Size_arrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code verdadExp}
	 * labeled alternative in {@link GramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerdadExp(GramaticaParser.VerdadExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opExp}
	 * labeled alternative in {@link GramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpExp(GramaticaParser.OpExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExp}
	 * labeled alternative in {@link GramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExp(GramaticaParser.IdExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExp}
	 * labeled alternative in {@link GramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExp(GramaticaParser.ParExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aceso_areglo_2D}
	 * labeled alternative in {@link GramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAceso_areglo_2D(GramaticaParser.Aceso_areglo_2DContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decExp}
	 * labeled alternative in {@link GramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecExp(GramaticaParser.DecExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falExp}
	 * labeled alternative in {@link GramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalExp(GramaticaParser.FalExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comaExp}
	 * labeled alternative in {@link GramaticaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComaExp(GramaticaParser.ComaExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numeroArre}
	 * labeled alternative in {@link GramaticaParser#expre2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeroArre(GramaticaParser.NumeroArreContext ctx);
}