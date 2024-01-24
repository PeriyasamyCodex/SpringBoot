package com.spboot.tryouts;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.spboot.tryouts.util.MyApplicationListener;
import com.spboot.tryouts.util.MyJMSTemplateClient;

@SpringBootApplication
//@EnableJms
@EnableAspectJAutoProxy(proxyTargetClass=true)
@EnableScheduling
@EnableCaching
@EnableEurekaClient
public class SpringBootRestServiceApplication implements CommandLineRunner, ExitCodeGenerator {

	@Autowired
	private ApplicationArguments applicationArguments;
	
	@Autowired
	private MyJMSTemplateClient myJMSProducer;

	@Bean
	public Queue queue() {

		return new ActiveMQQueue("outbound.queue");

	}

	public static void main(String[] args) {

		SpringApplication application = new SpringApplication(SpringBootRestServiceApplication.class);
		application.addListeners(new MyApplicationListener());

		/**
		 * Use this below to text exit code generator
		 * System.exit(SpringApplication.exit(application.run(args)));
		 */

		application.run(args);

		/*
		 * application.setS
		 * SpringApplication.run(SpringBootRestServiceApplication.class, args);
		 */
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Application command line arguments->" + applicationArguments.getOptionValues("foo"));
		//System.out.println("Application Command Line Runner arguments->" + args[1]);
		
		//Send Sample JMS Message
		//myJMSProducer.sendJMSMessage();
	}

	@Override
	public int getExitCode() {
		System.out.println("EXIT CODE HAS BEEN MODIFIED SUCCESSFULLY");
		return 42;
	}
}
