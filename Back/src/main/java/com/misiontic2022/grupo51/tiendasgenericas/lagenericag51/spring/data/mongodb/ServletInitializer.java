package com.misiontic2022.grupo51.tiendasgenericas.lagenericag51.spring.data.mongodb;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(GenericaBKApplication.class);
	}

}
