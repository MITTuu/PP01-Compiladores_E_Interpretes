/* The following code was generated by JFlex 1.4.3 on 16/12/24, 17:09 */

package code;
import java_cup.runtime.Symbol;


class LexerCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  2,  0,  0,  1,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     1,  0, 22, 33,  0,  0,  0, 21,  0,  0, 35,  0,  0, 27, 34, 36, 
    32, 32, 32, 32, 32, 32, 32, 32, 32, 32,  0,  0,  0,  0,  0,  0, 
     0, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 
    32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32,  0, 23,  0,  0, 31, 
     0,  3,  4,  7, 13,  6, 15, 20, 26, 12, 32, 32, 14, 16,  9, 11, 
    18, 19,  5, 17, 10,  8, 24, 28, 29, 25, 30,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\25\1\1\4\2\1\37\0"+
    "\1\5\1\0\1\6\60\0\1\7\3\0\1\10\11\0"+
    "\1\11\20\0\1\12\10\0\1\13\1\0\1\14\2\0"+
    "\1\13\7\0\1\15\3\0\1\16\3\0\1\17\4\0"+
    "\1\20\7\0\1\21\3\0\1\22\1\23\21\0\1\24"+
    "\1\25\1\0\1\26\3\0\1\27\2\0\1\30\4\0"+
    "\1\31\1\32\1\33\2\0\1\13\6\0\1\34\1\35"+
    "\1\0\1\36\4\0\1\37\1\40\4\0\1\41\1\42"+
    "\6\0\1\43\1\44\1\45\1\46\5\0\1\47\2\0"+
    "\1\50\1\51\1\52\3\0\1\53\5\0\1\54\1\55"+
    "\1\0\1\56\3\0\1\57\1\0\1\60\3\0\1\61"+
    "\1\62\1\0\1\63\1\64";

  private static int [] zzUnpackAction() {
    int [] result = new int[298];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\45\0\112\0\45\0\157\0\224\0\271\0\336"+
    "\0\u0103\0\u0128\0\u014d\0\u0172\0\u0197\0\u01bc\0\u01e1\0\u0206"+
    "\0\u022b\0\u0250\0\u0275\0\u029a\0\u02bf\0\u02e4\0\u0309\0\u032e"+
    "\0\u0353\0\45\0\u0378\0\u039d\0\u03c2\0\u03e7\0\u040c\0\u0431"+
    "\0\u0456\0\u047b\0\u04a0\0\u04c5\0\u04ea\0\u050f\0\u0534\0\u0559"+
    "\0\u057e\0\u05a3\0\u05c8\0\u05ed\0\u0612\0\u0637\0\u065c\0\u0681"+
    "\0\u06a6\0\u06cb\0\u06f0\0\u0715\0\u073a\0\u075f\0\u0784\0\u07a9"+
    "\0\u07ce\0\u07f3\0\u02bf\0\45\0\u02e4\0\45\0\u0818\0\u083d"+
    "\0\u0862\0\u0887\0\u08ac\0\u08d1\0\u08f6\0\u091b\0\u0940\0\u0965"+
    "\0\u098a\0\u09af\0\u09d4\0\u09f9\0\u0a1e\0\u0a43\0\u0a68\0\u0a8d"+
    "\0\u0ab2\0\u0ad7\0\u0afc\0\u0b21\0\u0b46\0\u0b6b\0\u0b90\0\u0bb5"+
    "\0\u0bda\0\u0bff\0\u0c24\0\u0c49\0\u0c6e\0\u0c93\0\u0cb8\0\u0cdd"+
    "\0\u0d02\0\u0d27\0\u0d4c\0\u0d71\0\u0d96\0\u0dbb\0\u0de0\0\u0e05"+
    "\0\u0e2a\0\u0e4f\0\u0e74\0\u0e99\0\u0ebe\0\u0ee3\0\u08d1\0\u0f08"+
    "\0\u0f2d\0\u0f52\0\45\0\u0f77\0\u0f9c\0\u0fc1\0\u0fe6\0\u100b"+
    "\0\u1030\0\u1055\0\u107a\0\u109f\0\45\0\u10c4\0\u10e9\0\u110e"+
    "\0\u1133\0\u1158\0\u117d\0\u11a2\0\u11c7\0\u11ec\0\u1211\0\u1236"+
    "\0\u125b\0\u1280\0\u12a5\0\u12ca\0\u12ef\0\45\0\u1314\0\u1339"+
    "\0\u135e\0\u1383\0\u13a8\0\u13cd\0\u13f2\0\u1417\0\u083d\0\u143c"+
    "\0\45\0\u1461\0\u1486\0\45\0\u14ab\0\u14d0\0\u14f5\0\u151a"+
    "\0\u153f\0\u1564\0\u1589\0\45\0\u15ae\0\u15d3\0\u15f8\0\45"+
    "\0\u161d\0\u1642\0\u1667\0\45\0\u168c\0\u16b1\0\u16d6\0\u16fb"+
    "\0\45\0\u1720\0\u1745\0\u176a\0\u178f\0\u17b4\0\u17d9\0\u17fe"+
    "\0\45\0\u1823\0\u1848\0\u186d\0\45\0\45\0\u1892\0\u18b7"+
    "\0\u18dc\0\u1901\0\u1926\0\u194b\0\u1970\0\u1995\0\u19ba\0\u19df"+
    "\0\u1a04\0\u1a29\0\u1a4e\0\u1a73\0\u1a98\0\u1abd\0\u1ae2\0\45"+
    "\0\45\0\u1b07\0\45\0\u1b2c\0\u1b51\0\u1b76\0\45\0\u1b9b"+
    "\0\u1bc0\0\45\0\u1be5\0\u1c0a\0\u1c2f\0\u1c54\0\45\0\45"+
    "\0\45\0\u1c79\0\u1c9e\0\u08d1\0\u1cc3\0\u1ce8\0\u1d0d\0\u1d32"+
    "\0\u1d57\0\u1d7c\0\45\0\45\0\u1da1\0\45\0\u1dc6\0\u1deb"+
    "\0\u1e10\0\u1e35\0\45\0\45\0\u1e5a\0\u1e7f\0\u1ea4\0\u1ec9"+
    "\0\45\0\45\0\u1eee\0\u1f13\0\u1f38\0\u1f5d\0\u1f82\0\u1fa7"+
    "\0\45\0\45\0\45\0\45\0\u1fcc\0\u1ff1\0\u2016\0\u203b"+
    "\0\u2060\0\45\0\u2085\0\u20aa\0\45\0\45\0\u08d1\0\u20cf"+
    "\0\u20f4\0\u2119\0\45\0\u213e\0\u2163\0\u2188\0\u21ad\0\u21d2"+
    "\0\45\0\45\0\u21f7\0\45\0\u221c\0\u2241\0\u2266\0\45"+
    "\0\u228b\0\45\0\u22b0\0\u22d5\0\u22fa\0\45\0\45\0\u231f"+
    "\0\45\0\45";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[298];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\2\1\20"+
    "\1\21\1\22\1\2\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\2\1\31\1\32\3\2\1\33\1\2\1\34"+
    "\3\2\46\0\1\3\47\0\1\35\10\0\1\36\32\0"+
    "\1\37\1\0\1\40\45\0\1\41\4\0\1\42\42\0"+
    "\1\43\4\0\1\44\2\0\1\45\6\0\1\46\24\0"+
    "\1\47\2\0\1\50\1\51\46\0\1\52\3\0\1\53"+
    "\25\0\1\54\7\0\1\55\36\0\1\56\61\0\1\57"+
    "\33\0\1\60\43\0\1\61\50\0\1\62\33\0\1\63"+
    "\2\0\1\64\5\0\1\65\41\0\1\66\2\0\1\67"+
    "\40\0\1\70\37\0\1\71\1\0\1\72\37\0\25\73"+
    "\1\74\17\73\26\75\1\76\1\77\15\75\37\0\1\100"+
    "\10\0\1\101\44\0\1\102\10\0\1\103\30\0\3\104"+
    "\22\105\3\104\1\106\2\105\1\104\3\105\1\104\1\105"+
    "\2\104\1\107\1\104\42\0\1\110\7\0\1\111\67\0"+
    "\1\112\32\0\1\113\41\0\1\114\62\0\1\115\30\0"+
    "\1\116\41\0\1\117\15\0\1\120\33\0\1\121\34\0"+
    "\1\122\43\0\1\123\60\0\1\124\27\0\1\125\12\0"+
    "\1\126\32\0\1\127\50\0\1\130\35\0\1\131\46\0"+
    "\1\132\22\0\1\133\23\0\1\134\45\0\1\135\42\0"+
    "\1\136\50\0\1\137\40\0\1\140\47\0\1\141\40\0"+
    "\1\142\16\0\1\143\36\0\1\144\37\0\1\145\46\0"+
    "\1\146\55\0\1\147\34\0\1\150\51\0\1\151\37\0"+
    "\1\152\30\0\2\75\1\0\42\75\2\100\1\0\34\100"+
    "\1\153\5\100\5\0\1\154\54\0\1\155\50\0\1\156"+
    "\23\0\43\104\1\107\4\104\22\105\3\104\3\105\1\104"+
    "\3\105\1\157\1\105\2\104\1\107\4\104\3\105\1\160"+
    "\16\105\3\104\3\105\1\104\3\105\1\157\1\105\2\104"+
    "\1\107\40\104\1\161\3\104\1\162\44\0\1\163\7\0"+
    "\1\164\52\0\1\165\42\0\1\166\52\0\1\167\32\0"+
    "\1\170\51\0\1\171\36\0\1\172\47\0\1\173\3\0"+
    "\1\174\43\0\1\175\41\0\1\176\41\0\1\177\53\0"+
    "\1\200\42\0\1\201\40\0\1\202\43\0\1\203\53\0"+
    "\1\204\42\0\1\205\37\0\1\206\53\0\1\207\62\0"+
    "\1\210\20\0\1\211\47\0\1\212\41\0\1\213\47\0"+
    "\1\214\40\0\1\215\70\0\1\216\26\0\1\217\40\0"+
    "\1\220\56\0\1\221\57\0\1\222\20\0\1\223\42\0"+
    "\1\224\60\0\1\225\33\0\1\226\33\0\2\100\1\0"+
    "\34\100\1\153\4\100\1\227\14\0\1\230\33\0\1\231"+
    "\53\0\1\232\32\0\3\104\2\105\1\233\17\105\3\104"+
    "\3\105\1\104\3\105\1\157\1\105\2\104\1\107\1\104"+
    "\44\0\1\234\43\104\1\235\1\104\5\0\1\236\1\237"+
    "\1\240\43\0\1\241\41\0\1\242\55\0\1\243\51\0"+
    "\1\244\41\0\1\245\34\0\1\246\44\0\1\247\41\0"+
    "\1\250\50\0\1\251\61\0\1\252\35\0\1\253\32\0"+
    "\1\254\53\0\1\255\37\0\1\256\57\0\1\257\31\0"+
    "\1\260\42\0\1\261\56\0\1\262\35\0\1\263\47\0"+
    "\1\264\54\0\1\265\30\0\1\266\54\0\1\267\35\0"+
    "\1\270\57\0\1\271\55\0\1\272\24\0\1\273\36\0"+
    "\1\274\46\0\1\275\47\0\1\276\36\0\1\277\50\0"+
    "\1\300\50\0\1\301\44\0\1\302\31\0\3\104\1\303"+
    "\21\105\3\104\3\105\1\104\3\105\1\157\1\105\2\104"+
    "\1\107\40\104\1\304\3\104\1\235\1\104\6\0\1\305"+
    "\56\0\1\306\34\0\1\307\45\0\1\310\71\0\1\311"+
    "\27\0\1\312\42\0\1\313\51\0\1\314\36\0\1\315"+
    "\60\0\1\316\17\0\1\317\52\0\1\320\34\0\1\321"+
    "\44\0\1\322\54\0\1\323\37\0\1\324\41\0\1\325"+
    "\45\0\1\326\53\0\1\327\47\0\1\330\35\0\1\331"+
    "\43\0\1\332\62\0\1\333\33\0\1\334\45\0\1\335"+
    "\33\0\1\336\46\0\1\337\71\0\1\340\33\0\1\341"+
    "\30\0\1\342\37\0\3\104\6\105\1\343\13\105\3\104"+
    "\3\105\1\104\3\105\1\157\1\105\2\104\1\107\44\104"+
    "\1\107\1\344\24\0\1\345\42\0\1\346\30\0\1\347"+
    "\50\0\1\350\35\0\1\351\53\0\1\352\45\0\1\353"+
    "\34\0\1\354\71\0\1\355\17\0\1\356\47\0\1\357"+
    "\43\0\1\360\1\361\1\362\43\0\1\363\53\0\1\364"+
    "\37\0\1\365\37\0\1\366\44\0\1\367\44\0\1\370"+
    "\46\0\1\371\74\0\1\372\25\0\1\373\42\0\1\374"+
    "\30\0\3\104\10\105\1\375\11\105\3\104\3\105\1\104"+
    "\3\105\1\157\1\105\2\104\1\107\1\104\3\0\1\376"+
    "\44\0\1\377\52\0\1\u0100\46\0\1\u0101\36\0\1\u0102"+
    "\42\0\1\u0103\47\0\1\u0104\44\0\1\u0105\44\0\1\u0106"+
    "\56\0\1\u0107\34\0\1\u0108\42\0\1\u0109\44\0\1\u010a"+
    "\56\0\1\u010b\42\0\1\u010c\44\0\1\u010d\31\0\1\u010e"+
    "\41\0\3\104\22\105\3\104\3\105\1\104\3\105\1\u010f"+
    "\1\105\2\104\1\107\1\104\16\0\1\u0110\51\0\1\u0111"+
    "\33\0\1\u0112\43\0\1\u0113\57\0\1\u0114\42\0\1\u0115"+
    "\30\0\1\u0116\47\0\1\u0117\37\0\1\u0118\53\0\1\u0119"+
    "\44\0\1\u011a\41\0\1\u011b\47\0\1\u011c\34\0\1\u011d"+
    "\44\0\1\u011e\52\0\1\u011f\36\0\1\u0120\55\0\1\u0121"+
    "\36\0\1\u0122\54\0\1\u0123\51\0\1\u0124\33\0\1\u0125"+
    "\45\0\1\u0126\44\0\1\u0127\41\0\1\u0128\47\0\1\u0129"+
    "\37\0\1\u012a\36\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9028];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\25\1\1\11\2\1\37\0"+
    "\1\11\1\0\1\11\60\0\1\1\3\0\1\11\11\0"+
    "\1\11\20\0\1\11\10\0\1\1\1\0\1\11\2\0"+
    "\1\11\7\0\1\11\3\0\1\11\3\0\1\11\4\0"+
    "\1\11\7\0\1\11\3\0\2\11\21\0\2\11\1\0"+
    "\1\11\3\0\1\11\2\0\1\11\4\0\3\11\2\0"+
    "\1\1\6\0\2\11\1\0\1\11\4\0\2\11\4\0"+
    "\2\11\6\0\4\11\5\0\1\11\2\0\2\11\1\1"+
    "\3\0\1\11\5\0\2\11\1\0\1\11\3\0\1\11"+
    "\1\0\1\11\3\0\2\11\1\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[298];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexerCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 19: 
          { return new Symbol(sym.Incremento, yychar, yyline, yytext());
          }
        case 53: break;
        case 50: 
          { return new Symbol(sym.ParentesisCierre, yychar, yyline, yytext());
          }
        case 54: break;
        case 5: 
          { return new Symbol(sym.LiteralCaracter, yychar, yyline, yytext());
          }
        case 55: break;
        case 30: 
          { return new Symbol(sym.Read, yychar, yyline, yytext());
          }
        case 56: break;
        case 15: 
          { return new Symbol(sym.Break, yychar, yyline, yytext());
          }
        case 57: break;
        case 27: 
          { return new Symbol(sym.Switch, yychar, yyline, yytext());
          }
        case 58: break;
        case 33: 
          { return new Symbol(sym.Conjuncion, yychar, yyline, yytext());
          }
        case 59: break;
        case 12: 
          { return new Symbol(sym.Else, yychar, yyline, yytext());
          }
        case 60: break;
        case 13: 
          { return new Symbol(sym.Division, yychar, yyline, yytext());
          }
        case 61: break;
        case 20: 
          { return new Symbol(sym.Char, yychar, yyline, yytext());
          }
        case 62: break;
        case 16: 
          { return new Symbol(sym.Print, yychar, yyline, yytext());
          }
        case 63: break;
        case 11: 
          { return new Symbol(sym.MultipleLineC, yychar, yyline, yytext());
          }
        case 64: break;
        case 45: 
          { return new Symbol(sym.ParentesisApertura, yychar, yyline, yytext());
          }
        case 65: break;
        case 8: 
          { return new Symbol(sym.OneLineC, yychar, yyline, yytext());
          }
        case 66: break;
        case 26: 
          { return new Symbol(sym.Decremento, yychar, yyline, yytext());
          }
        case 67: break;
        case 23: 
          { return new Symbol(sym.Bool, yychar, yyline, yytext());
          }
        case 68: break;
        case 43: 
          { return new Symbol(sym.MenorIgual, yychar, yyline, yytext());
          }
        case 69: break;
        case 24: 
          { return new Symbol(sym.For, yychar, yyline, yytext());
          }
        case 70: break;
        case 6: 
          { return new Symbol(sym.LiteralCadena, yychar, yyline, yytext());
          }
        case 71: break;
        case 49: 
          { return new Symbol(sym.Resta, yychar, yyline, yytext());
          }
        case 72: break;
        case 44: 
          { return new Symbol(sym.FinSentencia, yychar, yyline, yytext());
          }
        case 73: break;
        case 25: 
          { return new Symbol(sym.Disyuncion, yychar, yyline, yytext());
          }
        case 74: break;
        case 21: 
          { return new Symbol(sym.String, yychar, yyline, yytext());
          }
        case 75: break;
        case 51: 
          { return new Symbol(sym.CierreBloque, yychar, yyline, yytext());
          }
        case 76: break;
        case 22: 
          { return new Symbol(sym.Default, yychar, yyline, yytext());
          }
        case 77: break;
        case 34: 
          { return new Symbol(sym.Mayor, yychar, yyline, yytext());
          }
        case 78: break;
        case 29: 
          { return new Symbol(sym.SignoAsignacion, yychar, yyline, yytext());
          }
        case 79: break;
        case 18: 
          { return new Symbol(sym.DosPuntos, yychar, yyline, yytext());
          }
        case 80: break;
        case 17: 
          { return new Symbol(sym.Modulo, yychar, yyline, yytext());
          }
        case 81: break;
        case 14: 
          { return new Symbol(sym.Return, yychar, yyline, yytext());
          }
        case 82: break;
        case 40: 
          { return new Symbol(sym.Menor, yychar, yyline, yytext());
          }
        case 83: break;
        case 4: 
          { return new Symbol(sym.Negativo, yychar, yyline, yytext());
          }
        case 84: break;
        case 9: 
          { return new Symbol(sym.If, yychar, yyline, yytext());
          }
        case 85: break;
        case 46: 
          { return new Symbol(sym.AperturaBloque, yychar, yyline, yytext());
          }
        case 86: break;
        case 3: 
          { return new Symbol(sym.Linea, yychar, yyline, yytext());
          }
        case 87: break;
        case 41: 
          { return new Symbol(sym.Case, yychar, yyline, yytext());
          }
        case 88: break;
        case 42: 
          { return new Symbol(sym.Main, yychar, yyline, yytext());
          }
        case 89: break;
        case 36: 
          { return new Symbol(sym.Negacion, yychar, yyline, yytext());
          }
        case 90: break;
        case 31: 
          { return new Symbol(sym.MayorIgual, yychar, yyline, yytext());
          }
        case 91: break;
        case 35: 
          { return new Symbol(sym.Potencia, yychar, yyline, yytext());
          }
        case 92: break;
        case 2: 
          { return new Symbol(sym.EspacioEnBlanco, yychar, yyline, yytext());
          }
        case 93: break;
        case 52: 
          { return new Symbol(sym.CorcheteCierre, yychar, yyline, yytext());
          }
        case 94: break;
        case 47: 
          { return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());
          }
        case 95: break;
        case 28: 
          { return new Symbol(sym.Integer, yychar, yyline, yytext());
          }
        case 96: break;
        case 32: 
          { return new Symbol(sym.Suma, yychar, yyline, yytext());
          }
        case 97: break;
        case 39: 
          { return new Symbol(sym.Diferente, yychar, yyline, yytext());
          }
        case 98: break;
        case 1: 
          { return new Symbol(sym.Error, yychar, yyline, yytext());
          }
        case 99: break;
        case 38: 
          { return new Symbol(sym.While, yychar, yyline, yytext());
          }
        case 100: break;
        case 48: 
          { return new Symbol(sym.CorcheteApertura, yychar, yyline, yytext());
          }
        case 101: break;
        case 10: 
          { return new Symbol(sym.Igual, yychar, yyline, yytext());
          }
        case 102: break;
        case 7: 
          { return new Symbol(sym.Identificador, yychar, yyline, yytext());
          }
        case 103: break;
        case 37: 
          { return new Symbol(sym.Float, yychar, yyline, yytext());
          }
        case 104: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              {
                return new Symbol(sym.FinDeArchivo, yychar, yyline, yytext());
              }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
