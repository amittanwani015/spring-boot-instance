package com.tancor.web.springbootinstance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;

@SpringBootApplication(exclude = {
		DataSourceAutoConfiguration.class,EmbeddedMongoAutoConfiguration.class,
		MongoAutoConfiguration.class, MongoDataAutoConfiguration.class,
})
public class SpringBootInstanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootInstanceApplication.class, args);
	}

}
