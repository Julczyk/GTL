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
    : (code_block NEWLINE END_LIFE+)* code_block NEWLINE? END_LIFE* EOF
    ;

code_block
    : statement_newline* statement
    ;

statement
    : compound_statement
    | ENTRY simple_statement
    | ENTRY
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
    : SPIT expressions
    ;

swallow
    : SWALLOW variable
    ;

variable_declaration
    : type NAME IS SOMEONE_ELSES variable
    | type NAME IS expressions
    | type NAME IS variable
    | type NAME
    ;

variable_assignment
    : variable IS expressions
    | variable IS variable
    | variable IS SOMEONE_ELSES variable
    | variable IS JOINED_BY math_expression
    | variable EVOLVES
    | variable DEVOLVES
    | variable IS BREEDING_LIKE math_expression TIMES
    | variable IS FLIPPED math_expression
    | variable IS THE_LITERAL_OPPOSITE_OF math_expression
    | variable IS WHATEVER_LEFT_FROM math_expression
    ;
// what is a variable
variable
    : NAME S variable
    | math_expression TH variable
    | NAME
    ;

function_call
    : CALL function (REGARDING expressions)?
    ;
// what is a function
function
    : NAME
    | variable S function
    ;

invite
    : INVITE NAME
    ;

// COMPOUND STATEMENTS
// ===================

// functions

function_declaration
    : function_name
    function_return?
    function_arguments?
    statement_newline*
    ENTRY PROFIT
    ;

function_name
    : ENTRY BE NAME NEWLINE
    ;

function_return
    : ENTRY variable_declaration_ing NEWLINE
    ;

function_arguments
    : ENTRY LIKES variable_declaration_ing (separator variable_declaration_ing)* NEWLINE
    ;

// function strict type-ing

variable_declaration_ing
    : type_ing NAME
    | type_ing NAME IS expression
    ;

type_ing
    : complex_type_ing
    | primitive_type_ing
    | struct_type_ing
    ;

complex_type_ing
    : primitive_type_ing MULTIPLE
    | primitive_type_ing ABOUT math_expression
    ;

primitive_type_ing
    : SEEING
    | TASTING
    | HEARING
    | SMELLING
    ;

struct_type_ing
    : SPOTTING NAME
    ;

// struct declaration

struct_declaration
    : struct_name
    statement_newline*
    ENTRY LOSE_INTEREST
    ;

struct_name
    : ENTRY LOOK_AROUND NEWLINE
    ENTRY NAME NEWLINE
    ;

// loops declaration

loop_declaration
    : ENTRY THINK_THAT bool_expression NEWLINE
    statement_newline*
    ENTRY RECONSIDER
    ;

// if declaration

if_declaration
    : ENTRY IMPLYING bool_expression NEWLINE
   statement_newline*
    or_statement?
    or_not_statement?
    ENTRY OR_STH
    ;

or_statement
    : ENTRY OR bool_expression NEWLINE
    statement_newline*
    or_statement?
    or_not_statement?
    ;

or_not_statement
    : ENTRY OR_NOT NEWLINE
    statement_newline*
    ;

// TYPES
// =====

type
    : complex_type
    | primitive_type
    | struct_type
    ;

complex_type
    : primitive_type MULTIPLE
    | primitive_type ABOUT math_expression
    ;

primitive_type
    : SEE
    | TASTE
    | HEAR
    | SMELL
    ;

struct_type
    : SPOT NAME
    ;

// EXPRESSIONS
// ===========

expressions
    : expression (separator expressions)?
    ;

expression
    : math_expression
    | bool_expression
    ;

bool_expression
    : NAME S variable
    | math_expression TH variable
    | math_expression VIBE_WITH math_expression
    | math_expression DOESNT_VIBE_WITH math_expression
    | math_expression BEATEN_BY math_expression
    | math_expression DOESNT_BEAT math_expression
    | math_expression BEATS math_expression
    | math_expression UNBEATEN_BY math_expression
    | bool_expression ALSO bool_expression
    | bool_expression ALTERNATIVELY bool_expression
    | bool_expression (VIBE_WITH | DOESNT_VIBE_WITH) bool_expression
    | NOT bool_expression
    | BOOL_LITERAL
    | function_call
    | NAME
    ;

math_expression
    : NAME S variable
    | math_expression TH variable
    | FLIPPED math_expression
    | THE_LITERAL_OPPOSITE_OF math_expression
    | math_expression (EVOLVES | DEVOLVES)
    | math_expression BREEDING_LIKE (NEWLINE ENTRY)? math_expression (NEWLINE ENTRY)? TIMES
    | math_expression JOINED_BY math_expression
    | math_expression WHATEVER_LEFT_FROM math_expression
    | math_literal
    | function_call
    | NAME
    ;

math_literal
    : DECIMAL_LITERAL
    | FLOAT_LITERAL
    | STRING_LITERAL
    ;

// UNCATEGORIZED
// =============

separator
    : COMMA
    | AND
    | NEWLINE ENTRY AND
    ;

//TODO update docs to match new grammar
//TODO move around the expression statements to be more intutive