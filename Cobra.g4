grammar Cobra;

parse: from_input | from_file;

from_input: stat NEWLINE;
from_file: (stat | NEWLINE)* EOF;

stat: simple_stat | compound_stat;

compound_stat:
	ifStatement
	| whileLoop
	| forLoop
	| functionDeclaration
	| snaketronTraining // Entrenamiento de red neuronal
	| makeNest // Implementar KNN
	| fileHandling // Handle de archivos
	| dataPlotting; // Plot de datos

simple_stat:
	assignment // Asignaciones
	| hiss // Imprimir
	| bite // importar
	| spit // return
	| atom; // expresiones atómicas

expr:
	<assoc = right>left = expr POW right = expr				# powExpr
	| MINUS expr											# unaryMinusExpr
	| NOT expr												# notExpr
	| left = expr op = (MULT | DIV | MOD) right = expr		# multDivModExpr
	| left = expr op = (PLUS | MINUS) right = expr			# addSubExpr
	| left = expr op = (LTEQ | GTEQ | LT | GT) right = expr	# relationalExpr
	| left = expr op = (EQ | NEQ) right = expr				# equalityExpr
	| left = expr op = AND right = expr						# andExpr
	| left = expr op = OR right = expr						# orExpr
	| LPAREN expr RPAREN									# parenExpr
	| atom                                                 # atomExpr
    ;

atom: (INT | FLOAT)	# numericAtom
	| (YAY | NAY)	# booleanAtom
	| STRING		# stringAtom
	| scales		# arrayAtom
	| snake			# objectAtom
	| grabScale		# grabScaleAtom
	| variable		# accessVariableAtom
	| SNAKENT		# nullAtom;
// scales: | ID #arrayAtom | functionCall #functionCallAtom ;

scales:
	LBRACKET (expr (COMMA expr)*)? RBRACKET
	| LBRACKET start = expr COLON (step = expr COLON)? end = expr RBRACKET;

snake: LBRACE (keyvalue (COMMA keyvalue)*)? RBRACE;

grabScale: variable LBRACKET expr RBRACKET;

keyvalue: ID COLON expr;
variable:
	ID (POINT ID)* (LPAREN (expr (COMMA expr)*)? RPAREN)?
	| ID (POINT ID)* RBRACKET expr LBRACKET;
spit: SPIT expression;

bite: BITE ID (POINT ID)* | FROM ID BITE ID;
hiss: HISS LPAREN expression RPAREN;
// Declaración de instrucciones
statement:
	assignment
	| expression
	| controlStructure
	| functionDeclaration
	| snaketronTraining
	| dataPlotting
	| fileHandling;

// Asignación
assignment: ID '=' expression;

// Expresiones aritméticas básicas
expression:
	expression ('+' | '-' | '*' | '/') expression
	| INT
	| FLOAT
	| ID
	| '(' expression ')';

// Estructuras de control (ejemplo de if y bucles)
controlStructure: ifStatement | forLoop | whileLoop;

ifStatement:
	STRIKE LPAREN expression RPAREN LBRACE statement* RBRACE;

forLoop:
	TRAIL LPAREN ID IN expression RPAREN LBRACE statement* RBRACE;

dataPlotting:
	SLITHERPLOT LPAREN (ID | STRING | expression) RPAREN;

whileLoop:
	COIL LPAREN expression RPAREN LBRACE statement* RBRACE;

// Declaración de funciones
functionDeclaration:
	FANG ID LPAREN (ID (',' ID)*)? RPAREN LBRACE statement* RBRACE;

// Instrucción de entrenamiento de un perceptrón
mlTraining: LPAREN ID COMMA ID LPAREN LBRACE statement* RBRACE;

snaketronTraining: TRAINSNAKETRON mlTraining;

makeNest: MAKENEST mlTraining;
// Manejo de archivos
fileHandling:
	'read_file' '(' STRING ')' ';'
	| 'write_file' '(' STRING ',' expression ')' ';';

// Tokens básicos

COIL: 'coil'; // while
FANG: 'fang'; // function
SLITHERPLOT: 'slitherplot'; // plot
TRAINSNAKETRON: 'TrainSnaketron'; // train perceptron
STRIKE: 'strike'; // if
MAKENEST: 'MakeNest'; // KNN
IN: 'in';
TRAIL: 'trail'; // for
HISS: 'hiss'; // print
BITE: 'bite'; // import
FROM: 'from';
SCALES: 'scales'; // array
YAY: 'yay'; // TRUE
NAY: 'nay'; // FALSE
SPIT: 'spit'; // return
SNAKE: 'snake'; // Object
SNAKENT: 'snakent'; // Null 

LBRACKET: '[';
RBRACKET: ']';
LBRACE: '{';
LPAREN: '(';
RPAREN: ')';
RBRACE: '}';
POINT: '.'; // punto
COMMA: ',';
COLON: ':';

POW: '^';
MINUS: '-';
NOT: '!';
MULT: '*';
DIV: '/';
MOD: '%';
PLUS: '+';

GT: '>';
LT: '<';
GTEQ: '>=';
LTEQ: '<=';
EQ: '==';
NEQ: '!=';
AND: 'and';
OR: 'or';

ID: [a-zA-Z_][a-zA-Z_0-9]*;
INT: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]+;
STRING: '"' .*? '"';
NEWLINE: [\n];
WS: [ \t\r\n]+ -> skip;