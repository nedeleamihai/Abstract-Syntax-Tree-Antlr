// Define a grammar called Hello
grammar Hello;
/* Definim regulile gramaticii (cu litere mici) */
main : 'int' varlist ';' stmt;
varlist : var | var ',' varlist;

block : '{}' | '{' stmt '}';
stmt : equal | iff | whhile |
       equal stmt | iff stmt | whhile stmt;
equal : var'='aexpr';';
iff : 'if' conditie=bexpr first=block 'else' second=block;
whhile : 'while' conditie=bexpr bloc=block;

aexpr : var | aval | left=aexpr '/' rigth=aexpr | left=aexpr '+' rigth=aexpr | '(' aexpr ')';
bexpr : bval | '!' bexpr | left=aexpr '>' right=aexpr | first=bexpr '&&' second=bexpr | '(' bexpr ')';

var : STRING;
aval : NUMBER;
bval : 'true'|'false';

/* Definim Tokenii ce pot aparea in timpul parsarii */
STRING : [a-z]+;
NUMBER : [1-9][0-9]*|'0';
WS : [ \t\r\n]+ -> skip ;

