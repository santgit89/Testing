package client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.Bank;

public class Client {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ConfigurableApplicationContext cac = new ClassPathXmlApplicationContext("resources/spring.xml");
		Bank b = (Bank) cac.getBean("proxy");
		int amount = b.deposit(2000, "sbi123");
		System.out.println(amount);

	}

}
