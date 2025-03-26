lexer grammar GreenTextLangLexer;

// default words

ENTRY        : ' >' WS? -> pushMode(CODE);

COMMENT
    :  ~[ \n] ~[\r\n]*
    | ' ' ~[>\n] ~[\r\n]*
    | ' '
    ;

COMMENT_NEWLINE
      :  ~[ \n] ~[\r\n]* NEWLINE
      | ' ' ~[>\n] ~[\r\n]* NEWLINE
      | ' ' NEWLINE
      ;

END_LIFE     : NEWLINE;

// code words

mode CODE;

// Keywords

BE: 'be';
SEE: 'see';
SEEING: 'seeing';
TASTE: 'taste';
TASTING: 'tasting';
HEAR: 'hear';
HEARING: 'hearing';
SMELL: 'smell';
SMELLING: 'smelling';
SPOT: 'spot';
SPOTTING: 'spotting';
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
CALL: 'call';
REGARDING: 'regarding';
ING: 'ing';
LIKES: 'likes';
THINK_THAT: 'think that';
RECONSIDER: 'reconsider';
IMPLYING: 'implying';
OR_STH: 'or sth';
OR: 'or';
OR_NOT: 'or not';

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
EVOLVES: 'evolves';
DEVOLVES: 'devolves';
BREEDING_LIKE: 'breeding like';
TIMES: 'times';
THE_LITERAL_OPPOSITE_OF: 'the literal opposite of';
FLIPPED: 'flipped';
WHATEVER_LEFT_FROM: 'whatever left from';

// Whitespace and comments

NEWLINE : WS? LINE_COMMENT? '\r'? '\n' -> popMode;
WS        : [ \t\f]+;
LINE_COMMENT : '#' ~[\r\n]*;

// Identifiers

NAME: Letter LetterOrDigit*;

// Fragment rules

fragment EscapeSequence: '\\' [btnfr"'\\];

fragment Digits: [0-9] ([0-9_]* [0-9])?;

fragment LetterOrDigit: Letter | [0-9];

fragment Letter:
    [a-zA-Z$_]                        // these are the "java letters" below 0x7F
    | ~[\u0000-\u007F\uD800-\uDBFF]   // covers all characters above 0x7F which are not a surrogate
    | [\uD800-\uDBFF] [\uDC00-\uDFFF] // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
;