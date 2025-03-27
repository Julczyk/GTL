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
    | function_call
    | invite
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
    : SWALLOW WS variable
    ;

variable_declaration
    : type WS NAME
    | type WS NAME WS IS WS expressions
    | type WS NAME WS IS WS SOMEONE_ELSES variable
    ;

variable_assignment
    : variable WS IS WS SOMEONE_ELSES variable
    | variable WS IS WS expressions
    | variable WS IS WS JOINED_BY WS math_expression
    | variable WS EVOLVES
    | variable WS DEVOLVES
    | variable WS IS WS BREEDING_LIKE WS math_expression WS TIMES
    | variable WS IS WS FLIPPED WS math_expression
    | variable WS IS WS THE_LITERAL_OPPOSITE_OF WS math_expression
    | variable WS IS WS WHATEVER_LEFT_FROM WS math_expression
    ;

variable
    : NAME
    | NAME S WS variable
    | math_expression TH WS variable
    ;

function_call
    : CALL WS function (WS REGARDING WS expressions)?
    ;

function
    : NAME
    | variable S WS function
    ;

invite
    : INVITE WS NAME
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
    : (statement_newline | COMMENT_NEWLINE)*
    //: (ENTRY variable_declaration NEWLINE | COMMENT_NEWLINE)*
    ;

// loops

loop_declaration
    : ENTRY THINK_THAT WS bool_expression NEWLINE
    loop_body
    ENTRY RECONSIDER
    ;

loop_body
    : (statement_newline | COMMENT_NEWLINE)*
    ;

// if

if_declaration
    : ENTRY IMPLYING WS bool_expression NEWLINE
    if_body
    or_statement?
    or_not_statement?
    ENTRY OR_STH
    ;

or_statement
    : ENTRY OR WS bool_expression NEWLINE
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
    : primitive_type WS MULTIPLE
    | primitive_type WS ABOUT WS math_expression
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

math_literal
    : DECIMAL_LITERAL
    | FLOAT_LITERAL
    | STRING_LITERAL
    ;

expressions
    : expression (separator expressions)?
    ;

expression
    : bool_expression
    | math_expression
    ;

bool_expression
    : math_expression WS VIBE_WITH WS math_expression
    | math_expression WS DOESNT_VIBE_WITH WS math_expression
    | math_expression WS BEATEN_BY WS math_expression
    | math_expression WS DOESNT_BEAT WS math_expression
    | math_expression WS BEATS WS math_expression
    | math_expression WS UNBEATEN_BY WS math_expression
    | bool_expression WS ALSO WS bool_expression
    | bool_expression WS ALTERNATIVELY WS bool_expression
    | bool_expression WS (VIBE_WITH | DOESNT_VIBE_WITH) WS bool_expression
    | NOT WS bool_expression
    | BOOL_LITERAL
    | function_call
    | NAME
    | NAME S WS variable
    | math_expression TH WS variable
    ;

math_expression
    : FLIPPED WS math_expression
    | THE_LITERAL_OPPOSITE_OF WS math_expression
    | math_expression WS (EVOLVES | DEVOLVES)
    | math_expression WS BREEDING_LIKE (WS | NEWLINE (COMMENT_NEWLINE)* ENTRY) math_expression (WS | NEWLINE (COMMENT_NEWLINE)* ENTRY) TIMES
    | math_expression WS JOINED_BY WS math_expression
    | math_expression WS WHATEVER_LEFT_FROM WS math_expression
    | math_literal
    | function_call
    | NAME
    | NAME S WS variable
    | math_expression TH WS variable
    ;

separator
    : WS? (',' | AND) WS?
    | NEWLINE (COMMENT_NEWLINE)* ENTRY AND WS
    ;

//TODO update docs to match new grammar