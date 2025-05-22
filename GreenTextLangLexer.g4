lexer grammar GreenTextLangLexer;

// DEFAULT TOP LEVEL WORDS
// =======================

ENTRY: ' >' -> mode(CODE), channel(HIDDEN); //start symbol of every line, starts CODE

COMMENT:  (~[ \n] ~[\r\n]* | ' ' ~[>\n] ~[\r\n]* | ' ') -> channel(HIDDEN); //don't bother undestanding that, anything but the entry

COMMENT_NEWLINE: COMMENT NEWLINE -> channel(HIDDEN); //needed because NEWLINE is not HIDDEN

END_LIFE: '\r'? '\n';

// CODE WORDS
// ==========

mode CODE;

// KEYWORDS

INVITE       : 'invite';
BE           : 'be';
SEE          : 'see';
SEEING       : 'seeing';
TASTE        : 'taste';
TASTING      : 'tasting';
HEAR         : 'hear';
HEARING      : 'hearing';
SMELL        : 'smell';
SMELLING     : 'smelling';
SPOT         : 'spot';
SPOTTING     : 'spotting';
SOMEONE_ELSES: 'someone elses';
ABOUT        : 'about';
MULTIPLE     : 'multiple';
TH           : '\'th';
LOOK_AROUND  : 'look around';
LOSE_INTEREST: 'lose interest';
S            : '\'s';
SPIT         : 'spit';
SWALLOW      : 'swallow';
PROFIT       : 'profit';
CALL         : 'call';
CALLING      : 'calling';
REGARDING    : 'regarding';
LIKES        : 'likes';
THINK_THAT   : 'think that';
RECONSIDER   : 'reconsider';
IMPLYING     : 'implying';
OR_STH       : 'or sth';
OR           : 'or';
OR_NOT       : 'or not';
BEGIN        : '('; // open brackets
END          : ')';   // close brackets
LETME        : 'let me';// type casting
PARENT       : 'parent';// higher scope

// LITERALS

DECIMAL_LITERAL: Digits+;
FLOAT_LITERAL  : (Digits '.' Digits? | '.' Digits);
BOOL_LITERAL   : ':c' | 'c:';
STRING_LITERAL : '"' (~["\\\r\n] | EscapeSequence)* '"';

// SEPARATORS

AND  : 'and';
COMMA: ',';

// OPERATORS

// assign
IS: 'is';
// bool
VIBE_WITH       : 'vibe with';
DOESNT_VIBE_WITH: 'doesn\'t vibe with';
BEATEN_BY       : 'beaten by';
DOESNT_BEAT     : 'doesn\'t beat';
BEATS           : 'beats';
UNBEATEN_BY     : 'unbeaten by';
ALSO            : 'also';
ALTERNATIVELY   : 'alternatively';
NOT             : 'not';
// math
JOINED_BY              : 'joined by';
EVOLVES                : 'evolves';
DEVOLVES               : 'devolves';
BREEDING_LIKE          : 'breeding like';
TIMES                  : 'times';
THE_LITERAL_OPPOSITE_OF: 'the literal opposite of';
FLIPPED                : 'flipped';
WHATEVER_LEFT_FROM     : 'whatever left from';

// WHITESPACE AND COMMENTS

NEWLINE     : '\r'? '\n'   -> mode(DEFAULT_MODE);
WS          : [ \t\f]+     -> channel(HIDDEN);
LINE_COMMENT: '#' ~[\r\n]* -> channel(HIDDEN);

// NAMES

NAME: Letter LetterOrDigit*;

// FRAGMENT RULES

fragment EscapeSequence:
    '\\' [btnfr"\\]
    | '\\u' HexDigit HexDigit HexDigit HexDigit
    | '\\U' HexDigit HexDigit HexDigit HexDigit HexDigit HexDigit HexDigit HexDigit
;

fragment HexDigit: [0-9A-Fa-f];

fragment Digits: [0-9] ([0-9_]* [0-9])?;

fragment LetterOrDigit: Letter | [0-9];

fragment Letter:
    [a-zA-Z_]                         // standard letters
    | [!$&*+.\\/:;<=>?@[\]^`{|}~-]    // non-standard ASCII letters
    | ~[\u0000-\u007F\uD800-\uDBFF]   // not letters from above and not invalid unicode 16-bit characters
    | [\uD800-\uDBFF] [\uDC00-\uDFFF] // unicode 32-bit charaters
;