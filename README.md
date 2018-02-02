# follow-grammar
A small Java project demonstrating how to "follow the grammar" in Java code. The grammar in question is a small expression language:

  Expr ::= NumLitExpr 
         | VarRefExpr 
         | Expr - Expr
         | (Expr ? Expr : Expr)
         
There is an interface Expr that is the supertype of the classes: NumLitExpr, VarRefExpr, MinusExpr, and ConditionalExpr.
Notice how the implementations of freeVars() and eval(Map<String,Integer>) both have a recursion pattern that follows the grammar.
