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
    | variable IS JOINED_BY expression
    | variable EVOLVES
    | variable DEVOLVES
    | variable IS BREEDING_LIKE (NEWLINE ENTRY)? expression (NEWLINE ENTRY)? TIMES
    | variable IS FLIPPED expression
    | variable IS THE_LITERAL_OPPOSITE_OF expression
    | variable IS WHATEVER_LEFT_FROM expression
    ;
// what is a variable
variable
    : NAME S variable
    | (NAME | DECIMAL_LITERAL) TH variable // access to an array can only be a name or a int literal
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
    : INVITE module
    ;
// what is a module
module
    : NAME (S module)? (separator NAME)*
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
    | primitive_type_ing ABOUT expression
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
    : ENTRY THINK_THAT expression NEWLINE
    statement_newline*
    ENTRY RECONSIDER
    ;

// if declaration

if_declaration
    : ENTRY IMPLYING expression NEWLINE
   statement_newline*
    or_statement?
    or_not_statement?
    ENTRY OR_STH
    ;

or_statement
    : ENTRY OR expression NEWLINE
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
    | primitive_type ABOUT expression
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
    : also (ALTERNATIVELY also)*
    ;

also
    : inversion (ALSO inversion)*
    ;

inversion
    : NOT inversion
    | comparison
    ;

comparison
    : sum compare_sum?
    ;

compare_sum
    : VIBE_WITH sum
    | DOESNT_VIBE_WITH sum
    | BEATEN_BY sum
    | DOESNT_BEAT sum
    | BEATS sum
    | UNBEATEN_BY sum
    ;

sum
    : sum JOINED_BY term
    | term
    ;

term
    : term BREEDING_LIKE (NEWLINE ENTRY)? sum (NEWLINE ENTRY)? TIMES
    | term WHATEVER_LEFT_FROM factor
    | factor
    ;

factor
    : THE_LITERAL_OPPOSITE_OF factor
    | FLIPPED factor
    | atom
    ;

atom
    : variable
    | literal
    ;

literal
    : DECIMAL_LITERAL
    | FLOAT_LITERAL
    | STRING_LITERAL
    | BOOL_LITERAL
    ;

// UNCATEGORIZED
// =============

separator
    : COMMA
    | AND
    | NEWLINE ENTRY AND
    ;

//TODO update docs to match new grammar