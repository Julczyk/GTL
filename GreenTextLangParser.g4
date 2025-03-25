parser grammar GreenTextLangParser;

options {
    tokenVocab = GreenTextLangLexer;
}

program
    : (functionDecleration)* EOF
    ;

functionDecleration
    : ENTRY BE SPACE IDENTIFIER NEWLINE functionBody ENTRY PROFIT NEWLINE?
    ;

functionBody
    : (variableDeclaration
    //| structDeclaration
    | functionDecleration
    | statement)*
    ;

statement
    : spit
    | swallow
    ;

spit
    : ENTRY SPIT SPACE literal NEWLINE
    | ENTRY SPIT SPACE IDENTIFIER NEWLINE
    ;

swallow
    : ENTRY SWALLOW SPACE IDENTIFIER NEWLINE
    ;

variableDeclaration
    : ENTRY type IDENTIFIER NEWLINE
    | ENTRY type IDENTIFIER IS literal NEWLINE
    ;

literal
    : DECIMAL_LITERAL
    | FLOAT_LITERAL
    | BOOL_LITERAL
    | STRING_LITERAL
    ;

type
    : complexType
    | primitiveType
    ;

complexType
    : primitiveType MULTIPLE
    | primitiveType ABOUT DECIMAL_LITERAL
    ;

primitiveType
    : SEE
    | TASTE
    | HEAR
    | SMELL
    ;