parser grammar GreenTextLangParser;

options {
    tokenVocab = GreenTextLangLexer;
}

// STARTING RULES
// ==============

program
    : END_LIFE* code_blocks
    | EOF
    ;

// GENERAL STATEMENTS
// ==================

code_blocks
    : code_block NEWLINE END_LIFE+ code_blocks
    | code_block NEWLINE? END_LIFE* EOF
    ;

code_block
    : (statement NEWLINE | COMMENT)* (statement | COMMENT_NO_NEWLINE)
    ;

statement
    : compound_statement
    | simple_statement
    ;

simple_statement
    : spit
    | swallow
    | variableDeclaration
    ;

compound_statement
    : functionDecleration
    ;

// SIMPLE STATEMENTS
// =================

spit
    : ENTRY SPIT WS expression NEWLINE
    ;

swallow
    : ENTRY SWALLOW WS IDENTIFIER NEWLINE
    ;

variableDeclaration
    : ENTRY type IDENTIFIER NEWLINE
    | ENTRY type IDENTIFIER IS literal NEWLINE
    ;

// COMPOUND STATEMENTS
// ===================

functionDecleration
    : ENTRY BE WS IDENTIFIER NEWLINE functionBody ENTRY PROFIT
    ;

functionBody
    : (statement | COMMENT)*
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

//expressions

expression
    : literal
    | IDENTIFIER
    ;