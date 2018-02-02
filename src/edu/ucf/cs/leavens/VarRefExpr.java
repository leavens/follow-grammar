package edu.ucf.cs.leavens;

import java.util.*;

public class VarRefExpr implements Expr {
	private String name;
	
	public VarRefExpr(String s) { name = s; }
	
    @Override
    public Set<String> freeVars() {
    	Set<String> ret = new HashSet<String>();
    	ret.add(name);
    	return ret;  	
    }
    
    @Override
    public int eval(Map<String,Integer> store) {
    	return store.get(name);
    }

}
