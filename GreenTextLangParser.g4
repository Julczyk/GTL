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
    : ((code_block NEWLINE | COMMENT_NEWLINE) END_LIFE+)* code_block WS? NEWLINE? END_LIFE* EOF
    ;

code_block
    : (statement_newline | COMMENT_NEWLINE)* (statement | COMMENT)
    ;

statement
    : compound_statement
    | ENTRY simple_statement
    ;

statement_newline
    : compound_statement NEWLINE
    | ENTRY simple_statement NEWLINE
    | ENTRY NEWLINE
    ;

simple_statement
    : spit
    | swallow
    | variable_declaration
    | variable_assignment
    | expression
    | function_call
    ;

compound_statement
    : function_declaration
    | struct_declaration
    | loop_declaration
    | if_declaration
    ;

// SIMPLE STATEMENTS
// =================

spit
    : SPIT WS expressions
    ;

swallow
    : SWALLOW WS NAME
    ;

variable_declaration
    : type WS NAME
    | type WS NAME WS IS WS expressions
    | type WS NAME WS IS WS SOMEONE_ELSES NAME
    ;

variable_assignment
    : NAME WS IS WS expressions
    | NAME WS IS WS SOMEONE_ELSES NAME
    | NAME WS IS WS JOINED_BY WS expression
    | NAME WS EVOLVES
    | NAME WS DEVOLVES
    | NAME WS IS WS BREEDING_LIKE WS expression WS TIMES
    | NAME WS IS WS FLIPPED WS expression
    | NAME WS IS WS THE_LITERAL_OPPOSITE_OF WS expression
    | NAME WS IS WS WHATEVER_LEFT_FROM WS expression
    ;

function_call
    : CALL WS NAME (WS REGARDING WS expressions)?
    ;

// COMPOUND STATEMENTS
// ===================

// functions

function_declaration
    : function_name
    function_return?
    function_arguments?
    function_body
    ENTRY PROFIT
    ;

function_name
    : ENTRY BE WS NAME NEWLINE
    ;

function_return
    : ENTRY variable_declaration_ing NEWLINE
    ;

function_arguments
    : ENTRY LIKES WS variable_declaration_ing (separator variable_declaration_ing)* NEWLINE
    ;

function_body
    : (statement_newline | COMMENT_NEWLINE)*
    ;

// function helpers

variable_declaration_ing
    : type_ing NAME
    | type_ing NAME WS IS WS expression
    ;

type_ing
    : complex_type_ing
    | primitive_type_ing
    | struct_type_ing
    ;

complex_type_ing
    : primitive_type_ing MULTIPLE WS
    | primitive_type_ing ABOUT WS DECIMAL_LITERAL WS
    ;

primitive_type_ing
    : SEEING WS
    | TASTING WS
    | HEARING WS
    | SMELLING WS
    ;

struct_type_ing
    : SPOTTING WS NAME WS
    ;

// struct declaration

struct_declaration
    : struct_name
    struct_body
    ENTRY LOSE_INTEREST
    ;

struct_name
    : ENTRY LOOK_AROUND NEWLINE
    ENTRY NAME NEWLINE
    ;

struct_body
    : (ENTRY variable_declaration NEWLINE | COMMENT_NEWLINE)*
    ;

// loops

loop_declaration
    : ENTRY THINK_THAT WS expression NEWLINE
    loop_body
    ENTRY RECONSIDER
    ;

loop_body
    : (statement_newline | COMMENT_NEWLINE)*
    ;

// if

if_declaration
    : ENTRY IMPLYING WS expression NEWLINE
    if_body
    or_statement?
    or_not_statement?
    ENTRY OR_STH
    ;

or_statement
    : ENTRY OR WS expression NEWLINE
    if_body
    or_statement?
    or_not_statement?
    ;

or_not_statement
    : ENTRY OR_NOT NEWLINE
    if_body
    ;

if_body
    : (statement_newline | COMMENT_NEWLINE)*
    ;

// types

type
    : complex_type
    | primitive_type
    | struct_type
    ;

complex_type
    : primitive_type MULTIPLE
    | primitive_type ABOUT DECIMAL_LITERAL
    ;

primitive_type
    : SEE
    | TASTE
    | HEAR
    | SMELL
    ;

struct_type
    : SPOT WS NAME
    ;

// expressions

literal
    : DECIMAL_LITERAL
    | FLOAT_LITERAL
    | BOOL_LITERAL
    | STRING_LITERAL
    ;

expressions
    : expression (separator expressions)?
    ;

expression
    : expression WS VIBE_WITH WS expression
    | expression WS DOESNT_VIBE_WITH WS expression
    | expression WS BEATEN_BY WS expression
    | expression WS DOESNT_BEAT WS expression
    | expression WS BEATS WS expression
    | expression WS UNBEATEN_BY WS expression
    | expression WS ALSO WS expression
    | expression WS ALTERNATIVELY WS expression
    | NOT WS expression
    | expression WS JOINED_BY WS expression
    | expression WS EVOLVES
    | expression WS DEVOLVES
    | expression WS BREEDING_LIKE WS expression WS TIMES
    | FLIPPED WS expression
    | THE_LITERAL_OPPOSITE_OF WS expression
    | expression WS WHATEVER_LEFT_FROM WS expression
    | literal
    | function_call
    | NAME
    ;

separator
    : WS? (',' | AND) WS?
    | NEWLINE (COMMENT_NEWLINE)* ENTRY AND WS
    ;

//TODO 'th - for table access
//TODO 's - for struct access
//TODO expression order
//TODO update docs to match new grammar
//TODO add import method