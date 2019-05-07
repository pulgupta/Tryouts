package org.study.patterns.chain.responsibility;

public abstract class AuthenticationHandler {
	
	AuthenticationHandler nextHandler;
	
	abstract boolean isAuthenticated(AuthenticationProvider authProvider);

}
