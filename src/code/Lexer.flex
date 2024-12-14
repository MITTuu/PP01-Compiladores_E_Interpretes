package code;
import static code.Tokens.*;
%%
%class Lexer
%type Tokens

// Macros con expresiones regulares para usar en reglas
whitespace = [ \t\r]
newline = [\n]

%{
    public String lexeme;
%}
%%

/* A- Apertura y Cierre de bloque - Permiten la creación de funciones, estructuras de control, bloques de código
y sentencias de código */

"abrecuento" { lexeme = yytext(); return AperturaBloque; }
"cierracuento" { lexeme = yytext(); return CierreBloque; }

/* B- Manejo de tipos de variables enteras, flotantes, booleanas, caracteres,
cadenas de caracteres (string) y arreglo estático */
"rodolfo" { lexeme = yytext(); return Integer; }
"bromista" { lexeme = yytext(); return Float; }
"trueno" { lexeme = yytext(); return Bool; }
"cupido" { lexeme = yytext(); return Char; }
"cometa" { lexeme = yytext(); return String; }


/* C- Identificadores - Inician y finalizan con guion bajo*/
/*_[a-zA-Z][a-zA-Z0-9]*_ { lexeme = yytext(); return Identificador; } */
_[a-zA-Z0-9]+_ { lexeme = yytext(); return Identificador; }

/* D- Arreglos unidimensionales de tipo entero o char - Permiten crearlos de tipo entero o char.
También obtienen y modifican sus elementos y ser utilizados en expresiones*/
"abreempaque" { lexeme = yytext(); return CorcheteApertura; }
"cierraempaque" { lexeme = yytext(); return CorcheteCierre; }

/* E- Signo de asignacion - Permiten sentencias para creación de variables, creación y asignación de expresiones 
y asignación de expresiones a variables, y algunos casos, sólo expresiones sin 
asignación */
"entrega" { lexeme = yytext(); return SignoAsignacion; }

/* F- Expresiones literales*/
'[^']*' { lexeme = yytext(); return LiteralCaracter; }
"\"[^\"\n]*\"" { lexeme = yytext(); return LiteralCadena; }

/* G- Parentesis - Permiten operadores y operandos, respetando su precedencia y el mismo uso*/
"abreregalo" { lexeme = yytext(); return ParentesisApertura; }
"cierraregalo" { lexeme = yytext(); return ParentesisCierre; }

/* Salto de línea */
{newline} { lexeme=yytext(); return Linea;}

/* Error de analisis */
. {return Error;}

/* Fin de archivo (EOF) */
<<EOF>> { lexeme=yytext(); return FinDeArchivo; }
