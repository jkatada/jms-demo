package com.example.jms.domain.service;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class JmsListenerInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("!! invoke start: " + invocation.getMethod());
		Object result = invocation.proceed();
		System.out.println("!! invoke end: " + invocation.getMethod());

		return result;
	}

}
