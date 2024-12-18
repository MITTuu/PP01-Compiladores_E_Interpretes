package code;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char

// Macros con expresiones regulares para usar en reglas
    espacioEnBlanco = [ \t\r]
    nuevaLinea = [\n]
    l_entero = 0|[-]?[1-9][0-9]*
    l_flotante = {l_entero}"."[0-9]+
    l_bool = "true" | "false"
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}

    LineTerminator = \r|\n|\r\n
    InputCharacter = [^\r\n]
    WhiteSpace     = {LineTerminator} | [ \t\f]

    /* comments */
    Comment = {EndOfLineComment} | {DocumentationComment}

    // Comment can be the last line of the file, without line terminator.
    EndOfLineComment     = "#" {InputCharacter}* {LineTerminator}?
    DocumentationComment = "\\_" {CommentContent} "_"+ "/"
    CommentContent       = [^\\]*
%%

/* Números enteros positivos o negativos (permitiendo el 0 como caso especial) */
    {l_entero} { return new Symbol(sym.LiteralEntero, yychar, yyline, yytext()); }

/* Números flotantes positivos o negativos */
    {l_flotante} { return new Symbol(sym.LiteralFlotante, yychar, yyline, yytext()); }

/* Literales booleanos */
    {l_bool} { return new Symbol(sym.LiteralBool, yychar, yyline, yytext()); }

/* A- Apertura y Cierre de bloque - Permiten la creación de funciones, estructuras de control, bloques de código
y sentencias de código */
    "abrecuento" { return new Symbol(sym.AperturaBloque, yychar, yyline, yytext()); }
    "cierracuento" { return new Symbol(sym.CierreBloque, yychar, yyline, yytext()); }

/* B- Manejo de tipos de variables enteras, flotantes, booleanas, caracteres,
cadenas de caracteres (string) y arreglo estático */
    "rodolfo" { return new Symbol(sym.Integer, yychar, yyline, yytext()); }
    "bromista" { return new Symbol(sym.Float, yychar, yyline, yytext()); }
    "trueno" { return new Symbol(sym.Bool, yychar, yyline, yytext()); }
    "cupido" { return new Symbol(sym.Char, yychar, yyline, yytext()); }
    "cometa" { return new Symbol(sym.String, yychar, yyline, yytext()); }

/* C- Este punto de regla de identificadores de traslado después del punto "q" para evitar conflictos*/

/* D- Arreglos unidimensionales de tipo entero o char - Permiten crearlos de tipo entero o char.
También obtienen y modifican sus elementos y ser utilizados en expresiones*/
    "abreempaque" { return new Symbol(sym.CorcheteApertura, yychar, yyline, yytext()); }
    "cierraempaque" { return new Symbol(sym.CorcheteCierre, yychar, yyline, yytext()); }

/* E- Signo de asignacion - Permiten sentencias para creación de variables, creación y asignación de expresiones 
y asignación de expresiones a variables, y algunos casos, sólo expresiones sin 
asignación */
    "entrega" { return new Symbol(sym.SignoAsignacion, yychar, yyline, yytext()); }

/* F- Expresiones literales*/
    '[^']*' { return new Symbol(sym.LiteralCaracter, yychar, yyline, yytext()); }
    \"([^\"\\]|\\.)*\" { return new Symbol(sym.LiteralCadena, yychar, yyline, yytext()); }

/* G- Parentesis - Permiten operadores y operandos, respetando su precedencia y el mismo uso*/
    "abreregalo" { return new Symbol(sym.ParentesisApertura, yychar, yyline, yytext()); }
    "cierraregalo" { return new Symbol(sym.ParentesisCierre, yychar, yyline, yytext()); }

/*h. Permitir expresiones aritméticas binarias de suma, resta, división –entera o decimal
  según el tipo–, multiplicación, módulo y potencia. Para enteros o flotantes.*/
    "navidad" { return new Symbol(sym.Suma, yychar, yyline, yytext()); }
    "intercambio" { return new Symbol(sym.Resta, yychar, yyline, yytext()); }
    "reyes" { return new Symbol(sym.Division, yychar, yyline, yytext()); }
    "nochebuena" { return new Symbol(sym.Multiplicacion, yychar, yyline, yytext()); }
    "magos" { return new Symbol(sym.Modulo, yychar, yyline, yytext()); }
    "adviento" { return new Symbol(sym.Potencia, yychar, yyline, yytext()); }

/*i. Permitir expresiones aritméticas unarias de negativo (-), incremento, decremento,
después del operando (postorden); esto para enteros, el negativo adicionalmente
se puede aplicar a flotantes. El negativo a literales y el incremento y decremento a
variables.*/
    "quien" { return new Symbol(sym.Incremento, yychar, yyline, yytext()); }
    "grinch" { return new Symbol(sym.Decremento, yychar, yyline, yytext()); }
    "-" { return new Symbol(sym.Negativo, yychar, yyline, yytext()); } 

/*j. Permitir expresiones relacionales (sobre enteros y flotantes) de menor, menor o
igual, mayor, mayor o igual, igual y diferente. Los operadores igual y diferente
permiten adicionalmente tipo booleano.*/
    "snowball" { return new Symbol(sym.Menor, yychar, yyline, yytext()); }
    "evergreen" { return new Symbol(sym.MenorIgual, yychar, yyline, yytext()); }
    "minstix" { return new Symbol(sym.Mayor, yychar, yyline, yytext()); }
    "upatree" { return new Symbol(sym.MayorIgual, yychar, yyline, yytext()); }
    "mary" { return new Symbol(sym.Igual, yychar, yyline, yytext()); }
    "openslae" { return new Symbol(sym.Diferente, yychar, yyline, yytext()); }

/*k. Permitir expresiones lógicas de conjunción, disyunción y negación.*/
    "melchor" { return new Symbol(sym.Conjuncion, yychar, yyline, yytext()); }
    "gaspar" { return new Symbol(sym.Disyuncion, yychar, yyline, yytext()); }
    "baltazar" { return new Symbol(sym.Negacion, yychar, yyline, yytext()); }

/*l. Debe permitir sentencias de código para las diferentes expresiones mencionadas
anteriormente y su combinación. Además, dichas expresiones pueden usarse en las
condicionales y bloques de las siguientes estructuras de control.*/
    "finregalo" { return new Symbol(sym.FinSentencia, yychar, yyline, yytext()); }

/*m. Debe permitir el uso de tipos y la combinación de expresiones aritméticas (binarias
y unarias), relacionales y lógicas, según las reglas gramaticales, aritméticas,
relacionales y lógicas del Paradigma Imperativo, por ejemplo, tomando como
referencia el lenguaje C.*/

/*---*/

/*n. Debe permitir las estructuras de control if-[else], while, switch y for, además,
permitir return y break. Las expresiones de las condiciones deberán ser valores
booleanos combinando expresiones aritméticas, lógicas y relacionales.*/
    "elfo" { return new Symbol(sym.If, yychar, yyline, yytext()); }
    "hada" { return new Symbol(sym.Else, yychar, yyline, yytext()); }
    "envuelve" { return new Symbol(sym.While, yychar, yyline, yytext()); }
    "duende" { return new Symbol(sym.For, yychar, yyline, yytext()); }
    "varios" { return new Symbol(sym.Switch, yychar, yyline, yytext()); }
    "historia" { return new Symbol(sym.Case, yychar, yyline, yytext()); }
    "ultimo" { return new Symbol(sym.Default, yychar, yyline, yytext()); }
    "corta" { return new Symbol(sym.Break, yychar, yyline, yytext()); }
    "envia" { return new Symbol(sym.Return, yychar, yyline, yytext()); }
    "sigue" { return new Symbol(sym.DosPuntos, yychar, yyline, yytext()); }
    "," { return new Symbol(sym.Coma, yychar, yyline, yytext()); }

/*o. Debe permitir las funciones de leer (enteros y flotantes) y escribir en la salida
estándar (cadena carácter, enteros y flotantes), se pueden escribir literales o
variables, se lee a identificadores.*/
    "narra" { return new Symbol(sym.Print, yychar, yyline, yytext()); }
    "escucha" { return new Symbol(sym.Read, yychar, yyline, yytext()); }

/*p. Debe permitir la creación y utilización de funciones, estos deben retornar valores
(entero, flotantes, char o booleanos) y recibir parámetros (con tipo). Separador de
parámetros sigue siendo la coma.*/

/*---*/

/*q. Identificador Main - Debe existir un único procedimiento inicial main, por medio de la cual se inicia la
ejecución de los programas.*/
    "_verano_" { return new Symbol(sym.Main, yychar, yyline, yytext()); }

/* C- Identificadores - Regla general - Inician y finalizan con guion bajo*/
    _[a-zA-Z0-9]+_ { return new Symbol(sym.Identificador, yychar, yyline, yytext()); }

/*r. Además, debe permitir comentarios de una línea (#) o múltiples líneas (\_ _/).*/
    {Comment}                      { return new Symbol(sym.Comentario, yychar, yyline, yytext()); }

/* Salto de línea */
    {nuevaLinea} { return new Symbol(sym.Linea, yychar, yyline, yytext()); }

// Espacios en blanco
    {espacioEnBlanco}+ { return new Symbol(sym.EspacioEnBlanco, yychar, yyline, yytext()); }

/* Error de analisis */
    . { return new Symbol(sym.Error, yychar, yyline, yytext()); }

/* Fin de archivo (EOF) */
    <<EOF>> { return new Symbol(sym.FinDeArchivo, yychar, yyline, yytext()); }

