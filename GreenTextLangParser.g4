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
    | simple_statement
    ;

statement_newline
    : compound_statement NEWLINE
    | simple_statement NEWLINE
    | NEWLINE
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
    : SWALLOW parent_variable
    ;

variable_declaration
    : type NAME IS SOMEONE_ELSES parent_variable
    | type NAME IS expressions
    | type NAME IS function_call_ing
    | type NAME
    ;

variable_assignment
    : parent_variable IS function_call_ing
    | parent_variable IS SOMEONE_ELSES parent_variable
    | parent_variable IS JOINED_BY expressions
    | parent_variable EVOLVES
    | parent_variable DEVOLVES
    | parent_variable IS BREEDING_LIKE NEWLINE? expressions NEWLINE? TIMES
    | parent_variable IS FLIPPED expressions
    | parent_variable IS THE_LITERAL_OPPOSITE_OF expressions
    | parent_variable IS WHATEVER_LEFT_FROM expressions
    | parent_variable IS expressions
    ;

parent_variable:
    | PARENT* variable
    ;

variable
    : NAME S variable
    | (NAME | DECIMAL_LITERAL) TH variable // access to an array can only be a name or an int literal
    | NAME
    ;

function_call_ing
    : CALLING parent_variable (REGARDING expressions)?
    ;

function_call
    : CALL parent_variable (REGARDING expressions)?
    ;

invite
    : INVITE nested_name (separator NAME)*
    ;

// COMPOUND STATEMENTS
// ===================

// functions

function_declaration
    : BE NAME NEWLINE
    function_return?
    function_arguments?
    statement_newline*
    PROFIT
    ;

function_return
    : variable_declaration_ing_without_elses NEWLINE
    ;

function_arguments
    : LIKES variable_declaration_ing (separator variable_declaration_ing)* NEWLINE
    ;

// struct declaration

struct_declaration
    : LOOK_AROUND NEWLINE
    NAME NEWLINE
    statement_newline*
    LOSE_INTEREST
    ;

// loops declaration

loop_declaration
    : THINK_THAT expression NEWLINE
    statement_newline*
    RECONSIDER
    ;

// if declaration

if_declaration
    : IMPLYING expression NEWLINE
    statement_newline*
    (or_statement | or_not_statement)?
    OR_STH
    ;

or_statement
    : OR expression NEWLINE
    statement_newline*
    (or_statement | or_not_statement)?
    ;

or_not_statement
    : OR_NOT NEWLINE
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
    | SPOT ABOUT expression nested_name
    | SPOT MULTIPLE nested_name
    ;

primitive_type
    : SEE
    | TASTE
    | HEAR
    | SMELL
    ;

struct_type
    : SPOT nested_name
    ;

// function strict type-ing

variable_declaration_ing_without_elses
    : type_ing NAME IS expressions
    | type_ing NAME IS function_call_ing
    | type_ing NAME
    ;

variable_declaration_ing
    : type_ing SOMEONE_ELSES NAME
    | type_ing NAME
    ;

type_ing
    : complex_type_ing
    | primitive_type_ing
    | struct_type_ing
    ;

complex_type_ing
    : primitive_type_ing MULTIPLE
    | primitive_type_ing ABOUT expression
    | SPOTTING ABOUT expression nested_name
    | SPOTTING MULTIPLE nested_name
    ;

primitive_type_ing
    : SEEING
    | TASTING
    | HEARING
    | SMELLING
    ;

struct_type_ing
    : SPOTTING nested_name
    ;

// EXPRESSIONS
// ===========

expressions
    : expression (separator expression)*
    ;

expression
    : also (NEWLINE? ALTERNATIVELY also)*
    ;

also
    : inversion (NEWLINE? ALSO inversion)*
    ;

inversion
    : NOT inversion
    | comparison
    ;

comparison
    : sum VIBE_WITH sum
    | sum DOESNT_VIBE_WITH sum
    | sum BEATEN_BY sum
    | sum DOESNT_BEAT sum
    | sum BEATS sum
    | sum UNBEATEN_BY sum
    | sum
    ;

sum
    : sum JOINED_BY term
    | term
    ;

term
    : term BREEDING_LIKE NEWLINE? expressions NEWLINE? TIMES
    | term WHATEVER_LEFT_FROM factor
    | factor
    ;

factor
    : THE_LITERAL_OPPOSITE_OF factor
    | FLIPPED factor
    | atom
    ;

atom
    : parent_variable
    | literal
    | BEGIN NEWLINE? expressions END
    | LETME type atom
    ;

literal
    : DECIMAL_LITERAL
    | FLOAT_LITERAL
    | STRING_LITERAL
    | BOOL_LITERAL
    ;

// UNCATEGORIZED
// =============

nested_name
    : NAME (S nested_name)?
    ;

separator
    : COMMA
    | AND
    | NEWLINE AND
    ;
