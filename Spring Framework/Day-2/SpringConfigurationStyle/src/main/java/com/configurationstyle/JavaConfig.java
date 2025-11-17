package com.configurationstyle;

import org.springframework.aot.generate.ValueCodeGenerator.Delegate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration  // remove or comment it when you are using annotation based config because there also we have use @configuration annotation
public class JavaConfig {
	
	
	@Bean
	Allocator allocator(){
	return new Manager();  // Its returning Manager object where bean name as "manager"
	}
	
	@Bean
	DelegateJavaBasedConfig delegate(Allocator allocator)
	{
		//Spring will inject the Allocator bean here (manager)
	return new DelegateJavaBasedConfig(allocator);
	}
	


}
