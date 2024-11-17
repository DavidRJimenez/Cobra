grammar Cobra;


// Regla de inicio
program : statement+ EOF ;

// Declaración de instrucciones
statement
    : variableDeclaration
    | assignment
    | expression
    | controlStructure
    | functionDeclaration
    | perceptronTraining
    | dataPlotting
    | fileHandling
    ;

// Declaración de variables
variableDeclaration
    : 'var' ID '=' expression ';'
    ;

// Asignación
assignment
    : ID '=' expression ';'
    ;

// Expresiones aritméticas básicas
expression
    : expression ('+' | '-' | '*' | '/') expression
    | INT
    | FLOAT
    | ID
    | '(' expression ')'
    ;

// Estructuras de control (ejemplo de if y bucles)
controlStructure
    : ifStatement
    | forLoop
    | whileLoop
    ;

ifStatement
    : 'if' '(' expression ')' '{' statement* '}'
    ;

forLoop
    : 'for' '(' ID 'in' expression ')' '{' statement* '}'
    ;

dataPlotting
    : 'plot' '(' (ID | STRING | expression) ')' ';'
    ;

whileLoop
    : 'while' '(' expression ')' '{' statement* '}'
    ;

// Declaración de funciones
functionDeclaration
    : 'func' ID '(' (ID (',' ID)*)? ')' '{' statement* '}'
    ;

// Instrucción de entrenamiento de un perceptrón
perceptronTraining
    : 'train_perceptron' '(' ID ',' ID ')' '{' statement* '}'
    ;

// Manejo de archivos
fileHandling
    : 'read_file' '(' STRING ')' ';'
    | 'write_file' '(' STRING ',' expression ')' ';'
    ;

// Tokens básicos
ID      : [a-zA-Z_][a-zA-Z_0-9]* ;
INT     : [0-9]+ ;
FLOAT   : [0-9]+ '.' [0-9]+ ;
STRING  : '"' .*? '"' ;
WS      : [ \t\r\n]+ -> skip ;
