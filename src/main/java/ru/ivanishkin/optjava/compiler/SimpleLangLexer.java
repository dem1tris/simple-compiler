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
		T__0=1, T__1=2, T__2=3, T__3=4, TYPE=5, WHILE=6, DO=7, DONE=8, IF=9, THEN=10, 
		ENDIF=11, PRINT=12, NUM=13, STRING=14, EOL=15, WS=16, BINOP=17, NAME=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "TYPE", "WHILE", "DO", "DONE", "IF", 
			"THEN", "ENDIF", "PRINT", "LETTER", "DIGIT", "NUM", "STRING", "EOL", 
			"WS", "BINOP", "NAME"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "','", "'('", "')'", null, "'while'", "'do'", "'done'", 
			"'if'", "'then'", "'endif'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "TYPE", "WHILE", "DO", "DONE", "IF", "THEN", 
			"ENDIF", "PRINT", "NUM", "STRING", "EOL", "WS", "BINOP", "NAME"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u008d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6:\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\6\20c\n\20"+
		"\r\20\16\20d\3\21\3\21\3\21\6\21j\n\21\r\21\16\21k\3\21\3\21\3\22\3\22"+
		"\3\23\6\23s\n\23\r\23\16\23t\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u0084\n\24\3\25\3\25\3\25\7\25\u0089\n\25"+
		"\f\25\16\25\u008c\13\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\2\35\2\37\17!\20#\21%\22\'\23)\24\3\2\7\5\2C\\aac"+
		"|\3\2\62;\4\2\f\f\17\17\4\2\13\13\"\"\5\2,-//\61\61\2\u0097\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\139\3\2\2\2\r;\3\2\2"+
		"\2\17A\3\2\2\2\21D\3\2\2\2\23I\3\2\2\2\25L\3\2\2\2\27Q\3\2\2\2\31W\3\2"+
		"\2\2\33]\3\2\2\2\35_\3\2\2\2\37b\3\2\2\2!f\3\2\2\2#o\3\2\2\2%r\3\2\2\2"+
		"\'\u0083\3\2\2\2)\u0085\3\2\2\2+,\7?\2\2,\4\3\2\2\2-.\7.\2\2.\6\3\2\2"+
		"\2/\60\7*\2\2\60\b\3\2\2\2\61\62\7+\2\2\62\n\3\2\2\2\63\64\7k\2\2\64\65"+
		"\7p\2\2\65:\7v\2\2\66\67\7u\2\2\678\7v\2\28:\7t\2\29\63\3\2\2\29\66\3"+
		"\2\2\2:\f\3\2\2\2;<\7y\2\2<=\7j\2\2=>\7k\2\2>?\7n\2\2?@\7g\2\2@\16\3\2"+
		"\2\2AB\7f\2\2BC\7q\2\2C\20\3\2\2\2DE\7f\2\2EF\7q\2\2FG\7p\2\2GH\7g\2\2"+
		"H\22\3\2\2\2IJ\7k\2\2JK\7h\2\2K\24\3\2\2\2LM\7v\2\2MN\7j\2\2NO\7g\2\2"+
		"OP\7p\2\2P\26\3\2\2\2QR\7g\2\2RS\7p\2\2ST\7f\2\2TU\7k\2\2UV\7h\2\2V\30"+
		"\3\2\2\2WX\7r\2\2XY\7t\2\2YZ\7k\2\2Z[\7p\2\2[\\\7v\2\2\\\32\3\2\2\2]^"+
		"\t\2\2\2^\34\3\2\2\2_`\t\3\2\2`\36\3\2\2\2ac\5\35\17\2ba\3\2\2\2cd\3\2"+
		"\2\2db\3\2\2\2de\3\2\2\2e \3\2\2\2fi\7$\2\2gj\5\33\16\2hj\5\35\17\2ig"+
		"\3\2\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7$\2\2n\""+
		"\3\2\2\2op\t\4\2\2p$\3\2\2\2qs\t\5\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2t"+
		"u\3\2\2\2uv\3\2\2\2vw\b\23\2\2w&\3\2\2\2x\u0084\t\6\2\2yz\7>\2\2z\u0084"+
		"\7?\2\2{\u0084\7>\2\2|}\7@\2\2}\u0084\7?\2\2~\u0084\7@\2\2\177\u0080\7"+
		"?\2\2\u0080\u0084\7?\2\2\u0081\u0082\7#\2\2\u0082\u0084\7?\2\2\u0083x"+
		"\3\2\2\2\u0083y\3\2\2\2\u0083{\3\2\2\2\u0083|\3\2\2\2\u0083~\3\2\2\2\u0083"+
		"\177\3\2\2\2\u0083\u0081\3\2\2\2\u0084(\3\2\2\2\u0085\u008a\5\33\16\2"+
		"\u0086\u0089\5\35\17\2\u0087\u0089\5\33\16\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b*\3\2\2\2\u008c\u008a\3\2\2\2\13\29dikt\u0083\u0088\u008a\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}