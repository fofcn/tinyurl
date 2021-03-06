package com.github.tinyurl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * 短连接主要应用于对字数有限制的业务场景
 * 场景1：
 * 发短信到用户手机时，如果短信内容过长，且短信内容需要有链接且链接过长，
 * 那么链接有被截断的可能，所以需要将连接缩短
 * @author errorfatal@gmail.com
 * @date 2020.07.02
 */
@SpringBootApplication(exclude={MongoAutoConfiguration.class,
		MongoDataAutoConfiguration.class,
		RedisAutoConfiguration.class,
		RedisRepositoriesAutoConfiguration.class})
@ComponentScan("com.github")
@MapperScan(value = "com.github.tinyurl.dao")
public class TinyUrlApplication {

	public static void main(String[] args) {
		SpringApplication.run(TinyUrlApplication.class, args);
	}

}
