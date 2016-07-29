package service;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

import business.Bank;

public class LogBefore implements MethodBeforeAdvice {

	@Override
	public void before(Method m, Object[] obj, Object obj1) throws Throwable {
		Log l = LogFactory.getLog(Bank.class);
		l.info("Method before");

	}

}
