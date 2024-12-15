
package code;

public enum Tokens {
    /*Palabras reservadas*/
    AperturaBloque,
    CierreBloque,
    Integer,
    Float,
    Bool,
    Char,
    String,
    Identificador,
    CorcheteApertura,
    CorcheteCierre,
    SignoAsignacion,
    ParentesisApertura,
    ParentesisCierre,
    
    /*Literales*/
    LiteralCaracter,
    LiteralCadena,
    
    /*Expresiones aritmeticas*/
    Suma,
    Resta,
    Division,
    Multiplicacion,
    Modulo,
    Potencia,
    Incremento,
    Decremento,
    Negativo,

    /*Expresiones relacionales*/
    Menor,
    MenorIgual,
    Mayor,
    MayorIgual,
    Igual,
    Diferente,

    /*Expresiones logicas*/
    Conjuncion,
    Disyuncion,
    Negacion,

    /*Expresiones de control*/
    If,
    Else,
    While,
    For,
    Switch,
    Case,
    Default,
    Break,
    Return,
    DosPuntos,

    /*Lectura*/
    Print,
    Read,

    /*Comentarios*/
    OneLineC,
    MultipleLineC,

    /*Otros*/
    Linea,
    Error,
    FinDeArchivo,
    FinSentencia,
    Main
}
