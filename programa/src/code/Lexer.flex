package code;
import static code.Tokens.*;
%%
%class Lexer
%type Tokens

// Macros con expresiones regulares para usar en reglas
espacioEnBlanco = [ \t\r]
nuevaLinea = [\n]

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
\"([^\"\\]|\\.)*\" { lexeme = yytext(); return LiteralCadena; }

/* G- Parentesis - Permiten operadores y operandos, respetando su precedencia y el mismo uso*/
"abreregalo" { lexeme = yytext(); return ParentesisApertura; }
"cierraregalo" { lexeme = yytext(); return ParentesisCierre; }

/*h. Permitir expresiones aritméticas binarias de suma, resta, división –entera o decimal
  según el tipo–, multiplicación, módulo y potencia. Para enteros o flotantes.*/
"navidad" { lexeme = yytext(); return Suma; }
"intercambio" { lexeme = yytext(); return Resta; }
"reyes" { lexeme = yytext(); return Division; }
"nochebuena" { lexeme = yytext(); return Multiplicacion; }
"magos" { lexeme = yytext(); return Modulo; }
"adviento" { lexeme = yytext(); return Potencia; }

/*i. Permitir expresiones aritméticas unarias de negativo (-), incremento, decremento,
después del operando (postorden); esto para enteros, el negativo adicionalmente
se puede aplicar a flotantes. El negativo a literales y el incremento y decremento a
variables.*/
"quien" { lexeme = yytext(); return Incremento; }
"grinch" { lexeme = yytext(); return Decremento; }
"-" { lexeme = yytext(); return Negativo; } 

/*j. Permitir expresiones relacionales (sobre enteros y flotantes) de menor, menor o
igual, mayor, mayor o igual, igual y diferente. Los operadores igual y diferente
permiten adicionalmente tipo booleano.*/
"snowball" { lexeme = yytext(); return Menor; }
"evergreen" { lexeme = yytext(); return MenorIgual; }
"minstix" { lexeme = yytext(); return Mayor; }
"upatree" { lexeme = yytext(); return MayorIgual; }
"mary" { lexeme = yytext(); return Igual; }
"openslae" { lexeme = yytext(); return Diferente; }

/*k. Permitir expresiones lógicas de conjunción, disyunción y negación.*/
"melchor" { lexeme = yytext(); return Conjuncion; }
"gaspar" { lexeme = yytext(); return Disyuncion; }
"baltazar" { lexeme = yytext(); return Negacion; }

/*l. Debe permitir sentencias de código para las diferentes expresiones mencionadas
anteriormente y su combinación. Además, dichas expresiones pueden usarse en las
condicionales y bloques de las siguientes estructuras de control.*/
"finregalo" { lexeme = yytext(); return FinSentencia; }

/*m. Debe permitir el uso de tipos y la combinación de expresiones aritméticas (binarias
y unarias), relacionales y lógicas, según las reglas gramaticales, aritméticas,
relacionales y lógicas del Paradigma Imperativo, por ejemplo, tomando como
referencia el lenguaje C.*/

/*---*/

/*n. Debe permitir las estructuras de control if-[else], while, switch y for, además,
permitir return y break. Las expresiones de las condiciones deberán ser valores
booleanos combinando expresiones aritméticas, lógicas y relacionales.*/
"elfo" { lexeme = yytext(); return If; }
"hada" { lexeme = yytext(); return Else; }
"envuelve" { lexeme = yytext(); return While; }
"duende" { lexeme = yytext(); return For; }
"varios" { lexeme = yytext(); return Switch; }
"historia" { lexeme = yytext(); return Case; }
"ultimo" { lexeme = yytext(); return Default; }
"corta" { lexeme = yytext(); return Break; }
"envia" { lexeme = yytext(); return Return; }
"sigue" { lexeme = yytext(); return DosPuntos; }

/*o. Debe permitir las funciones de leer (enteros y flotantes) y escribir en la salida
estándar (cadena carácter, enteros y flotantes), se pueden escribir literales o
variables, se lee a identificadores.*/
"narra" { lexeme = yytext(); return Print; }
"escucha" { lexeme = yytext(); return Read; }

/*p. Debe permitir la creación y utilización de funciones, estos deben retornar valores
(entero, flotantes, char o booleanos) y recibir parámetros (con tipo). Separador de
parámetros sigue siendo la coma.*/

/*---*/

/*q. Debe existir un único procedimiento inicial main, por medio de la cual se inicia la
ejecución de los programas.*/
"_verano_" { lexeme = yytext(); return Main; }

/*r. Además, debe permitir comentarios de una línea (#) o múltiples líneas (\_ _/).*/
"#.*" { lexeme = yytext(); return OneLineC; }
"\\_.*?\\_/" { lexeme = yytext(); return MultipleLineC; }

/* Salto de línea */
{nuevaLinea} { lexeme=yytext(); return Linea;}

// Espacios en blanco
{espacioEnBlanco}+ { lexeme=yytext(); return EspacioEnBlanco; }

/* Error de analisis */
. {return Error;}

/* Fin de archivo (EOF) */
<<EOF>> { lexeme=yytext(); return FinDeArchivo; }
