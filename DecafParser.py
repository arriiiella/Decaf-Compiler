# Generated from Decaf.g4 by ANTLR 4.8
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31")
        buf.write("\13\4\2\t\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\2\2\3\2\2\2\2")
        buf.write("\t\2\4\3\2\2\2\4\5\7\3\2\2\5\6\7\27\2\2\6\7\7\17\2\2\7")
        buf.write("\b\7\20\2\2\b\t\7\2\2\3\t\3\3\2\2\2\2")
        return buf.getvalue()


class DecafParser ( Parser ):

    grammarFileName = "Decaf.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'class'", "'void'", "'int'", "'boolean'", 
                     "'if'", "'else'", "'for'", "'return'", "'break'", "'callout'", 
                     "'['", "']'", "'{'", "'}'", "'('", "')'", "','", "';'", 
                     "'='", "'+='" ]

    symbolicNames = [ "<INVALID>", "CLASS", "VOID", "INT", "BOOL", "IF", 
                      "ELSE", "FOR", "RETURN", "BREAK", "CALLOUT", "LSQUARE", 
                      "RSQUARE", "LCURLY", "RCURLY", "LROUND", "RROUND", 
                      "COMMA", "SEMI", "EQ", "PLUSEQ", "ID", "WS", "COMMENT" ]

    RULE_program = 0

    ruleNames =  [ "program" ]

    EOF = Token.EOF
    CLASS=1
    VOID=2
    INT=3
    BOOL=4
    IF=5
    ELSE=6
    FOR=7
    RETURN=8
    BREAK=9
    CALLOUT=10
    LSQUARE=11
    RSQUARE=12
    LCURLY=13
    RCURLY=14
    LROUND=15
    RROUND=16
    COMMA=17
    SEMI=18
    EQ=19
    PLUSEQ=20
    ID=21
    WS=22
    COMMENT=23

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CLASS(self):
            return self.getToken(DecafParser.CLASS, 0)

        def ID(self):
            return self.getToken(DecafParser.ID, 0)

        def LCURLY(self):
            return self.getToken(DecafParser.LCURLY, 0)

        def RCURLY(self):
            return self.getToken(DecafParser.RCURLY, 0)

        def EOF(self):
            return self.getToken(DecafParser.EOF, 0)

        def getRuleIndex(self):
            return DecafParser.RULE_program

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProgram" ):
                listener.enterProgram(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProgram" ):
                listener.exitProgram(self)




    def program(self):

        localctx = DecafParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 2
            self.match(DecafParser.CLASS)
            self.state = 3
            self.match(DecafParser.ID)
            self.state = 4
            self.match(DecafParser.LCURLY)
            self.state = 5
            self.match(DecafParser.RCURLY)
            self.state = 6
            self.match(DecafParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





