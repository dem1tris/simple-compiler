/*
 * Lexer rules
 */
grammar SimpleLang;

TYPE
: ('int'|'str') ;

WHILE
: 'while' ;

DO
: 'do' ;

DONE
: 'done' ;

IF
: 'if' ;

THEN
: 'then' ;

ENDIF
: 'endif' ;

PRINT
: 'print' ;


fragment LETTER
: [a-zA-Z_] ;

fragment DIGIT
: [0-9] ;

NUM
: DIGIT+ ;

STRING
: '"' (LETTER | DIGIT)+ '"'  ;

EOL
: [\n\r] ;

WS
: [ \t]+ -> skip ;

BINOP
  : '+'
  | '-'
  | '*'
  | '/'
  | '<='
  | '<'
  | '>='
  | '>'
  | '=='
  | '!='
  ;

NAME
: LETTER (DIGIT | LETTER)*  ;

simpleExpr
: NUM
| STRING
| NAME
;

expr
: simpleExpr
| expr BINOP expr ;

assignment
: NAME '=' expr ;

declElement
: (NAME | assignment) ;

decl
: TYPE declElement (',' declElement)* ;

cond
: IF expr THEN line* ENDIF;

loop
: WHILE expr DO line* DONE;

print
: PRINT '(' expr ')';

stmt
: decl
| assignment
| print
| expr
| cond
| loop;

line
: stmt? EOL
| stmt
| stmt EOF
;

program
: line* EOF;