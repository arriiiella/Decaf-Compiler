# Python-Compiler
 
Coursework for my Programming Languages: Principle and Design module.


### Task

Implement a working compiler for a programming language called Decaf. Decaf is a 64-bit integer-based imperative programming language designed for teaching purposes. It's syntax is somewhere between Java/C and Fortran. It has basic loop constructs like for loops and recursion, branching, and basic arithmetic and logic operations. Decaf is statically linked to the standard C library, and it includes a language facility named callout, which enables use of standard C library functions. 

## Prerequisites
- ANTLR4 
- JDK
- Python3
- Spyder

## Commands 
- `antlr Decaf.g4 -Dlanguage=Python3 -visitor`
- `antlr Decaf.g4`
- `javac Decaf *.java`
- `grun Decaf <INSERT NAME OF PARSER RULE> -gui <INSERT TEST FILE>`

## Decaf Language Rules
[See here](https://github.com/arriiiella/Decaf-Compiler/blob/main/Decaf%20Language.pdf)
