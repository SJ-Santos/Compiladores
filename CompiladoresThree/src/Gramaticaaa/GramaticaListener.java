// Generated from Gramatica.g4 by ANTLR 4.13.1
package Gramaticaaa;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(GramaticaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(GramaticaParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#printar}.
	 * @param ctx the parse tree
	 */
	void enterPrintar(GramaticaParser.PrintarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#printar}.
	 * @param ctx the parse tree
	 */
	void exitPrintar(GramaticaParser.PrintarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaracaovariavel}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaovariavel(GramaticaParser.DeclaracaovariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaracaovariavel}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaovariavel(GramaticaParser.DeclaracaovariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(GramaticaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(GramaticaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaracaofuncao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaofuncao(GramaticaParser.DeclaracaofuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaracaofuncao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaofuncao(GramaticaParser.DeclaracaofuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(GramaticaParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(GramaticaParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(GramaticaParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(GramaticaParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(GramaticaParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(GramaticaParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(GramaticaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(GramaticaParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(GramaticaParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(GramaticaParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#atribuicaomatematica}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicaomatematica(GramaticaParser.AtribuicaomatematicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#atribuicaomatematica}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicaomatematica(GramaticaParser.AtribuicaomatematicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comparacao}.
	 * @param ctx the parse tree
	 */
	void enterComparacao(GramaticaParser.ComparacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comparacao}.
	 * @param ctx the parse tree
	 */
	void exitComparacao(GramaticaParser.ComparacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(GramaticaParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(GramaticaParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(GramaticaParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(GramaticaParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#estruturacontrole}.
	 * @param ctx the parse tree
	 */
	void enterEstruturacontrole(GramaticaParser.EstruturacontroleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#estruturacontrole}.
	 * @param ctx the parse tree
	 */
	void exitEstruturacontrole(GramaticaParser.EstruturacontroleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#caselista}.
	 * @param ctx the parse tree
	 */
	void enterCaselista(GramaticaParser.CaselistaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#caselista}.
	 * @param ctx the parse tree
	 */
	void exitCaselista(GramaticaParser.CaselistaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#operatorfor}.
	 * @param ctx the parse tree
	 */
	void enterOperatorfor(GramaticaParser.OperatorforContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#operatorfor}.
	 * @param ctx the parse tree
	 */
	void exitOperatorfor(GramaticaParser.OperatorforContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#casedecl}.
	 * @param ctx the parse tree
	 */
	void enterCasedecl(GramaticaParser.CasedeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#casedecl}.
	 * @param ctx the parse tree
	 */
	void exitCasedecl(GramaticaParser.CasedeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaracaoestrutura}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoestrutura(GramaticaParser.DeclaracaoestruturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaracaoestrutura}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoestrutura(GramaticaParser.DeclaracaoestruturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(GramaticaParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(GramaticaParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#arrayinicializacao}.
	 * @param ctx the parse tree
	 */
	void enterArrayinicializacao(GramaticaParser.ArrayinicializacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#arrayinicializacao}.
	 * @param ctx the parse tree
	 */
	void exitArrayinicializacao(GramaticaParser.ArrayinicializacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressaolista}.
	 * @param ctx the parse tree
	 */
	void enterExpressaolista(GramaticaParser.ExpressaolistaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressaolista}.
	 * @param ctx the parse tree
	 */
	void exitExpressaolista(GramaticaParser.ExpressaolistaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressaologica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaologica(GramaticaParser.ExpressaologicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressaologica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaologica(GramaticaParser.ExpressaologicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressaorelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressaorelacional(GramaticaParser.ExpressaorelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressaorelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressaorelacional(GramaticaParser.ExpressaorelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressaoaritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoaritmetica(GramaticaParser.ExpressaoaritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressaoaritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoaritmetica(GramaticaParser.ExpressaoaritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressaomultiplicativa}.
	 * @param ctx the parse tree
	 */
	void enterExpressaomultiplicativa(GramaticaParser.ExpressaomultiplicativaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressaomultiplicativa}.
	 * @param ctx the parse tree
	 */
	void exitExpressaomultiplicativa(GramaticaParser.ExpressaomultiplicativaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressaounaria}.
	 * @param ctx the parse tree
	 */
	void enterExpressaounaria(GramaticaParser.ExpressaounariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressaounaria}.
	 * @param ctx the parse tree
	 */
	void exitExpressaounaria(GramaticaParser.ExpressaounariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressaopostfix}.
	 * @param ctx the parse tree
	 */
	void enterExpressaopostfix(GramaticaParser.ExpressaopostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressaopostfix}.
	 * @param ctx the parse tree
	 */
	void exitExpressaopostfix(GramaticaParser.ExpressaopostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(GramaticaParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(GramaticaParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#primaria}.
	 * @param ctx the parse tree
	 */
	void enterPrimaria(GramaticaParser.PrimariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#primaria}.
	 * @param ctx the parse tree
	 */
	void exitPrimaria(GramaticaParser.PrimariaContext ctx);
}