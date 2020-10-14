import antlr4 as ant
from DecafLexer import DecafLexer

filein = open('test.dcf', 'r')
lexer = DecafLexer(ant.InputStream(filein.read()))

tokens = lexer.getAllTokens()
for i in range(len(tokens)):
    print(lexer.symbolicNames[tokens[i].type])
