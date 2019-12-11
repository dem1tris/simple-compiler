// Generated from C:/Users/jetbrains/dev/nsu/optjava/compiler/src/main/resources\SimpleLang.g4 by ANTLR 4.7.2
package ru.ivanishkin.optjava.compiler;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, TYPE=15, WHILE=16, DO=17, 
		DONE=18, IF=19, THEN=20, ENDIF=21, PRINT=22, NUM=23, STRING=24, EOL=25, 
		WS=26, NAME=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "TYPE", "WHILE", "DO", "DONE", 
			"IF", "THEN", "ENDIF", "PRINT", "LETTER", "DIGIT", "NUM", "STRING", "EOL", 
			"WS", "NAME"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'<='", "'<'", "'>='", "'>'", "'=='", 
			"'!='", "'='", "','", "'('", "')'", null, "'while'", "'do'", "'done'", 
			"'if'", "'then'", "'endif'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "TYPE", "WHILE", "DO", "DONE", "IF", "THEN", "ENDIF", 
			"PRINT", "NUM", "STRING", "EOL", "WS", "NAME"
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


	public SimpleLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00aa\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20d\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\6\32\u008d\n\32\r\32\16\32\u008e\3\33\3\33\3\33\6\33\u0094\n\33"+
		"\r\33\16\33\u0095\3\33\3\33\3\34\3\34\3\35\6\35\u009d\n\35\r\35\16\35"+
		"\u009e\3\35\3\35\3\36\3\36\3\36\7\36\u00a6\n\36\f\36\16\36\u00a9\13\36"+
		"\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2\61\2\63\31\65\32\67\339\34"+
		";\35\3\2\6\5\2C\\aac|\3\2\62;\4\2\f\f\17\17\4\2\13\13\"\"\2\u00ae\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2"+
		"\7A\3\2\2\2\tC\3\2\2\2\13E\3\2\2\2\rH\3\2\2\2\17J\3\2\2\2\21M\3\2\2\2"+
		"\23O\3\2\2\2\25R\3\2\2\2\27U\3\2\2\2\31W\3\2\2\2\33Y\3\2\2\2\35[\3\2\2"+
		"\2\37c\3\2\2\2!e\3\2\2\2#k\3\2\2\2%n\3\2\2\2\'s\3\2\2\2)v\3\2\2\2+{\3"+
		"\2\2\2-\u0081\3\2\2\2/\u0087\3\2\2\2\61\u0089\3\2\2\2\63\u008c\3\2\2\2"+
		"\65\u0090\3\2\2\2\67\u0099\3\2\2\29\u009c\3\2\2\2;\u00a2\3\2\2\2=>\7,"+
		"\2\2>\4\3\2\2\2?@\7\61\2\2@\6\3\2\2\2AB\7-\2\2B\b\3\2\2\2CD\7/\2\2D\n"+
		"\3\2\2\2EF\7>\2\2FG\7?\2\2G\f\3\2\2\2HI\7>\2\2I\16\3\2\2\2JK\7@\2\2KL"+
		"\7?\2\2L\20\3\2\2\2MN\7@\2\2N\22\3\2\2\2OP\7?\2\2PQ\7?\2\2Q\24\3\2\2\2"+
		"RS\7#\2\2ST\7?\2\2T\26\3\2\2\2UV\7?\2\2V\30\3\2\2\2WX\7.\2\2X\32\3\2\2"+
		"\2YZ\7*\2\2Z\34\3\2\2\2[\\\7+\2\2\\\36\3\2\2\2]^\7k\2\2^_\7p\2\2_d\7v"+
		"\2\2`a\7u\2\2ab\7v\2\2bd\7t\2\2c]\3\2\2\2c`\3\2\2\2d \3\2\2\2ef\7y\2\2"+
		"fg\7j\2\2gh\7k\2\2hi\7n\2\2ij\7g\2\2j\"\3\2\2\2kl\7f\2\2lm\7q\2\2m$\3"+
		"\2\2\2no\7f\2\2op\7q\2\2pq\7p\2\2qr\7g\2\2r&\3\2\2\2st\7k\2\2tu\7h\2\2"+
		"u(\3\2\2\2vw\7v\2\2wx\7j\2\2xy\7g\2\2yz\7p\2\2z*\3\2\2\2{|\7g\2\2|}\7"+
		"p\2\2}~\7f\2\2~\177\7k\2\2\177\u0080\7h\2\2\u0080,\3\2\2\2\u0081\u0082"+
		"\7r\2\2\u0082\u0083\7t\2\2\u0083\u0084\7k\2\2\u0084\u0085\7p\2\2\u0085"+
		"\u0086\7v\2\2\u0086.\3\2\2\2\u0087\u0088\t\2\2\2\u0088\60\3\2\2\2\u0089"+
		"\u008a\t\3\2\2\u008a\62\3\2\2\2\u008b\u008d\5\61\31\2\u008c\u008b\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\64\3\2\2\2\u0090\u0093\7$\2\2\u0091\u0094\5/\30\2\u0092\u0094\5\61\31"+
		"\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7$\2\2\u0098"+
		"\66\3\2\2\2\u0099\u009a\t\4\2\2\u009a8\3\2\2\2\u009b\u009d\t\5\2\2\u009c"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\b\35\2\2\u00a1:\3\2\2\2\u00a2\u00a7"+
		"\5/\30\2\u00a3\u00a6\5\61\31\2\u00a4\u00a6\5/\30\2\u00a5\u00a3\3\2\2\2"+
		"\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8<\3\2\2\2\u00a9\u00a7\3\2\2\2\n\2c\u008e\u0093\u0095\u009e"+
		"\u00a5\u00a7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}