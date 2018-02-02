package edu.ucf.cs.leavens;

import java.util.*;

public class NumLitExpr implements Expr {
	private int nval;
	
	public NumLitExpr(int n) { nval = n; }
	
    @Override
    public Set<String> freeVars() {
    	return new HashSet<String>();
    }
    
    @Override
    public int eval(Map<String,Integer> store) {
    	return nval;
    }
}
