package edu.ucf.cs.leavens;

import java.util.*;

public class MinusExpr implements Expr {
	private Expr left, right;
	
	public MinusExpr(Expr e1, Expr e2) { left = e1; right = e2; }
	
    @Override
    public Set<String> freeVars() {
    	Set<String> ret = left.freeVars();
    	ret.addAll(right.freeVars());
    	return ret;
    }
    
    @Override
    public int eval(Map<String,Integer> store) {
    	return left.eval(store) - right.eval(store);
    }

}
