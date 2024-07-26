grammar Monitor;

program: (command)+ EOF ;



command 
    : v=ID '=' e=expr ';' #Attr
    | '{' command* '}' #Block
    | 'func' name=ID  arg=args command #Func
    | 'if'  '(' e=expr ')' command #If 
    | 'else' command #Else
    | 'while' '(' e=expr ')' command #While
    | 'var' name=ID '=' vInic=expr ';' #Decl
    | 'log' e=expr ';' #Log
    | 'emit' ev=STRING ('->' values=arr)? ';' #Emit
    | 'listener' ev=STRING '->' func=ID ';' #Listener
    | func=ID arg=args ';' #FuncCall
    ;

expr
    : e=expr op=('*' | '/' | '+' | '-' | '>' | '<' | '==' | '&&' | '||') d=expr #Op
    | '(' e=expr ')' #Group
    | n=ID #Var
    | n=value #Const
    ;

ID: [a-zA-Z_][a-zA-Z0-9_]* ;
NUMBER: ('0'..'9')+ ;
STRING: '"' SCharSequence? '"' | '\'' SCharSequence? '\'';
REGEX: 'r' STRING;

fragment EscapeSequence: '\\' ['"?abfnrtv\\];
fragment SCharSequence: SChar+;
fragment SChar
    : ~["\\\r\n]
    | EscapeSequence
    | '\\\n'   // Added line
    | '\\\r\n' // Added line
    ;

WS: [ \t\r\n]+ -> skip ;
COMMENT: '//' ~[\r\n]* -> skip;
MULTI_LINE_COMMENT: '/*' .*? '*/' -> skip;
 
value
    : STRING
    | NUMBER
    ;

arr
    : '[' value (',' value)* ','? ']'
    | '[' ']'
    ;

args
    : '(' ID (',' ID)* ','? ')'
    | '(' ')'
    ;