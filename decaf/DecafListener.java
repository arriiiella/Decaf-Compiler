// Generated from Decaf.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DecafParser}.
 */
public interface DecafListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DecafParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DecafParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_decl(DecafParser.Method_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_decl(DecafParser.Method_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#method_arg}.
	 * @param ctx the parse tree
	 */
	void enterMethod_arg(DecafParser.Method_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#method_arg}.
	 * @param ctx the parse tree
	 */
	void exitMethod_arg(DecafParser.Method_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(DecafParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(DecafParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DecafParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DecafParser.BlockContext ctx);
}