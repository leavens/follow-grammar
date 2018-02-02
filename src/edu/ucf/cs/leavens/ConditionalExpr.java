package edu.ucf.cs.leavens;

import java.util.*;

public class ConditionalExpr implements Expr {
	private Expr test, truePart, falsePart;
	
	public ConditionalExpr(Expr te, Expr e1, Expr e2) { 
		test = te; 
		truePart = e1; 
		falsePart = e2; 
	}
	
    @Override
    public Set<String> freeVars() {
    	Set<String> ret = test.freeVars();
    	ret.addAll(truePart.freeVars());
    	ret.addAll(falsePart.freeVars());
    	return ret;
    }
    
    @Override
    public int eval(Map<String,Integer> store) {
    	return (test.eval(store) != 0 ? truePart.eval(store) : falsePart.eval(store));
    }
}
