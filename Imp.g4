grammar Imp;

// Análise Sintática
start : (command)+ EOF ;

//Comandos
command : 'print' '(' e=expression ')' ';' #Print
    | v=VAR '=' e=expression ';' #Atrib
    | '{' command* '}' #Block
    | 'if'  '(' e=expression ')' cTrue=command 'else' cFalse=command #If
    | 'while' '(' e=expression ')' cRep=command #While
    | 'int' name=VAR '=' vInic=expression ';' #Dec
    ;

//Expressoes
expression : n=NUMBER #Const 
    | n=VAR #Var
    | e=expression o=OP d=expression #Op
    | '(' e=expression ')' #Group
    ;

// Análise Léxica
OP : '+' | '-' | '*' | '/' | '>' | '<' | '==' | '>=' | '<=' ;
NUMBER : [0-9]+ ;
VAR : [a-z]+ ;
TYPE : 'int' | 'bool' | 'char' ;

ESPACOS : (' '|'\n') -> skip ;
