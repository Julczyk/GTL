lexer grammar GreenTextLangLexer;

// default words

ENTRY        : ' >' WS -> pushMode(CODE);

COMMENT_NO_NEWLINE:  ~[ \n] ~[\r\n]*
                   | ' ' ~[>\n] ~[\r\n]*
                   | ' '
                   ;

COMMENT      :  ~[ \n] ~[\r\n]* NEWLINE
             | ' ' ~[>\n] ~[\r\n]* NEWLINE
             | ' ' NEWLINE
             ;

END_LIFE     : NEWLINE;

// code words

mode CODE;

// Keywords

BE: 'be';
SEE: 'see';
TASTE: 'taste';
HEAR: 'hear';
SMELL: 'smell';
SPOT: 'spot';
SOMEONE_ELSES: 'someone elses';
ABOUT: 'about';
MULTIPLE: 'multiple';
TH: '\'th';
LOOK_AROUND: 'look around';
LOSE_INTEREST: 'lose interest';
S: '\'s';
SPIT: 'spit';
SWALLOW: 'swallow';
PROFIT: 'profit';

// Literals

DECIMAL_LITERAL: Digits+;

FLOAT_LITERAL: (Digits '.' Digits? | '.' Digits);

BOOL_LITERAL: ':c' | 'c:';

STRING_LITERAL: '"' (~["\\\r\n] | EscapeSequence)* '"';

// Separators

AND    : 'and';
COMMA  : ',';

// Operators

IS      : 'is';
VIBE_WITH: 'vibe with';
DOESNT_VIBE_WITH: 'doesn’t vibe with';
BEATEN_BY: 'beaten by';
DOESNT_BEAT: 'doesn’t beat';
BEATS: 'beats';
UNBEATEN_BY: 'unbeaten by';
ALSO: 'also';
ALTERNATIVELY: 'alternatively';
NOT: 'not';

JOINED_BY: 'joined by';

// Whitespace and comments

NEWLINE : '\r'? '\n' -> popMode;
WS        : [ \t\f]+;
LINE_COMMENT : '#' ~[\r\n]*;

// Identifiers

IDENTIFIER: Letter LetterOrDigit*;

// Fragment rules

fragment EscapeSequence:
    '\\' 'u005c'? [btnfr"'\\]
    | '\\' 'u005c'? ([0-3]? [0-7])? [0-7]
    | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
;

fragment HexDigits: HexDigit ((HexDigit | '_')* HexDigit)?;

fragment HexDigit: [0-9a-fA-F];

fragment Digits: [0-9] ([0-9_]* [0-9])?;

fragment LetterOrDigit: Letter | [0-9];

fragment Letter:
    [a-zA-Z$_]                        // these are the "java letters" below 0x7F
    | ~[\u0000-\u007F\uD800-\uDBFF]   // covers all characters above 0x7F which are not a surrogate
    | [\uD800-\uDBFF] [\uDC00-\uDFFF] // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
;