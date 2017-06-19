import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class PAFRunner {

	public static void main( String[] args) throws Exception {
		ANTLRInputStream input = new ANTLRInputStream("-3+23;");
		PAFGrammarLexer lexer = new PAFGrammarLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		PAFGrammarParser parser = new PAFGrammarParser(tokens);
		ParseTree tree = parser.s();
		System.out.println(tree.toStringTree(parser));

	}
	
}