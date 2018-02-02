package edu.ucf.cs.leavens;

import java.util.*;

// <Expr> ::= <NumLitExpr> | <VarRefExpr> | <Expr> - <Expr> | (<Expr> ? <Expr> : <Expr>)
// <NumLitExpr> ::= <Int>
// <VarRefExpr> ::= <String>

/** Expressions in a grammar. The grammar is:
 * <Expr> ::= <NumLitExpr> | <VarRefExpr> | <Expr> - <Expr> | (<Expr> ? <Expr> : <Expr>)
 * <NumLitExpr> ::= <Int>
 * <VarRefExpr> ::= <String>
 */
public interface Expr {
	
	/** Return the set of free variable names in this expression. */
    Set<String> freeVars();
    
    /** Return the value of this expression in the given store.
     * @param store - maps from variable names to their values.
     */
    int eval(Map<String, Integer> store);
}
