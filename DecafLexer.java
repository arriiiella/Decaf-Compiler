// Generated from Decaf.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, VOID=2, INT=3, BOOL=4, IF=5, ELSE=6, FOR=7, RETURN=8, BREAK=9, 
		CALLOUT=10, LSQUARE=11, RSQUARE=12, LCURLY=13, RCURLY=14, LROUND=15, RROUND=16, 
		COMMA=17, SEMI=18, EQ=19, PLUSEQ=20, ID=21, WS=22, COMMENT=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CLASS", "VOID", "INT", "BOOL", "IF", "ELSE", "FOR", "RETURN", "BREAK", 
			"CALLOUT", "LSQUARE", "RSQUARE", "LCURLY", "RCURLY", "LROUND", "RROUND", 
			"COMMA", "SEMI", "EQ", "PLUSEQ", "ID", "ALPHA", "ALPHA_NUM", "DIGIT", 
			"WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'void'", "'int'", "'boolean'", "'if'", "'else'", "'for'", 
			"'return'", "'break'", "'callout'", "'['", "']'", "'{'", "'}'", "'('", 
			"')'", "','", "';'", "'='", "'+='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "VOID", "INT", "BOOL", "IF", "ELSE", "FOR", "RETURN", 
			"BREAK", "CALLOUT", "LSQUARE", "RSQUARE", "LCURLY", "RCURLY", "LROUND", 
			"RROUND", "COMMA", "SEMI", "EQ", "PLUSEQ", "ID", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public DecafLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Decaf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\7\26\u0087\n\26\f\26\16\26\u008a\13\26\3\27\3\27"+
		"\3\30\3\30\5\30\u0090\n\30\3\31\3\31\3\32\6\32\u0095\n\32\r\32\16\32\u0096"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u009f\n\33\f\33\16\33\u00a2\13\33"+
		"\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\2/\2\61\2\63\30\65\31"+
		"\3\2\6\5\2C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\3\2\f\f\2\u00a5\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67"+
		"\3\2\2\2\5=\3\2\2\2\7B\3\2\2\2\tF\3\2\2\2\13N\3\2\2\2\rQ\3\2\2\2\17V\3"+
		"\2\2\2\21Z\3\2\2\2\23a\3\2\2\2\25g\3\2\2\2\27o\3\2\2\2\31q\3\2\2\2\33"+
		"s\3\2\2\2\35u\3\2\2\2\37w\3\2\2\2!y\3\2\2\2#{\3\2\2\2%}\3\2\2\2\'\177"+
		"\3\2\2\2)\u0081\3\2\2\2+\u0084\3\2\2\2-\u008b\3\2\2\2/\u008f\3\2\2\2\61"+
		"\u0091\3\2\2\2\63\u0094\3\2\2\2\65\u009a\3\2\2\2\678\7e\2\289\7n\2\29"+
		":\7c\2\2:;\7u\2\2;<\7u\2\2<\4\3\2\2\2=>\7x\2\2>?\7q\2\2?@\7k\2\2@A\7f"+
		"\2\2A\6\3\2\2\2BC\7k\2\2CD\7p\2\2DE\7v\2\2E\b\3\2\2\2FG\7d\2\2GH\7q\2"+
		"\2HI\7q\2\2IJ\7n\2\2JK\7g\2\2KL\7c\2\2LM\7p\2\2M\n\3\2\2\2NO\7k\2\2OP"+
		"\7h\2\2P\f\3\2\2\2QR\7g\2\2RS\7n\2\2ST\7u\2\2TU\7g\2\2U\16\3\2\2\2VW\7"+
		"h\2\2WX\7q\2\2XY\7t\2\2Y\20\3\2\2\2Z[\7t\2\2[\\\7g\2\2\\]\7v\2\2]^\7w"+
		"\2\2^_\7t\2\2_`\7p\2\2`\22\3\2\2\2ab\7d\2\2bc\7t\2\2cd\7g\2\2de\7c\2\2"+
		"ef\7m\2\2f\24\3\2\2\2gh\7e\2\2hi\7c\2\2ij\7n\2\2jk\7n\2\2kl\7q\2\2lm\7"+
		"w\2\2mn\7v\2\2n\26\3\2\2\2op\7]\2\2p\30\3\2\2\2qr\7_\2\2r\32\3\2\2\2s"+
		"t\7}\2\2t\34\3\2\2\2uv\7\177\2\2v\36\3\2\2\2wx\7*\2\2x \3\2\2\2yz\7+\2"+
		"\2z\"\3\2\2\2{|\7.\2\2|$\3\2\2\2}~\7=\2\2~&\3\2\2\2\177\u0080\7?\2\2\u0080"+
		"(\3\2\2\2\u0081\u0082\7-\2\2\u0082\u0083\7?\2\2\u0083*\3\2\2\2\u0084\u0088"+
		"\5-\27\2\u0085\u0087\5/\30\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089,\3\2\2\2\u008a\u0088\3\2\2\2"+
		"\u008b\u008c\t\2\2\2\u008c.\3\2\2\2\u008d\u0090\5-\27\2\u008e\u0090\5"+
		"\61\31\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\60\3\2\2\2\u0091"+
		"\u0092\t\3\2\2\u0092\62\3\2\2\2\u0093\u0095\t\4\2\2\u0094\u0093\3\2\2"+
		"\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u0099\b\32\2\2\u0099\64\3\2\2\2\u009a\u009b\7\61\2\2\u009b"+
		"\u009c\7\61\2\2\u009c\u00a0\3\2\2\2\u009d\u009f\n\5\2\2\u009e\u009d\3"+
		"\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\b\33\2\2\u00a4\66\3\2\2"+
		"\2\7\2\u0088\u008f\u0096\u00a0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}