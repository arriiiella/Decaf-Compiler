grammar Decaf;

/*LEXER RULES*/

CLASS : 'class';
VOID : 'void';
INT : 'int';
BOOL : 'boolean';
IF : 'if';
ELSE : 'else';
FOR : 'for';
RETURN : 'return';
BREAK : 'break'; 
CALLOUT : 'callout';

LSQUARE : '[';
RSQUARE : ']';
LCURLY : '{';
RCURLY : '}';
LROUND : '(';
RROUND : ')';

COMMA : ',';
SEMI : ';';
EQ : '=';
PLUSEQ : '+=';

ID : ALPHA ALPHA_NUM*;
fragment ALPHA: [a-zA-Z_];
fragment ALPHA_NUM : ALPHA | DIGIT;
fragment DIGIT : [0-9]; 

WS : [ \t\r\n]+ -> skip;

COMMENT : '//' ~'\n'* -> skip;
 
/*parser rules*/

program : CLASS ID LCURLY method_decl* RCURLY EOF;

method_decl : (data_type | VOID) ID LROUND (method_arg (COMMA method_arg)*)? RROUND block;

method_arg: data_type ID;

data_type : INT | BOOL;

block : LCURLY RCURLY;