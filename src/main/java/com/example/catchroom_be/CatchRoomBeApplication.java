package com.example.catchroom_be;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Slf4j
@SpringBootApplication

public class CatchRoomBeApplication {
	@Value("${log.slack.web-hook-url}")
	private static String url;

	public static void main(String[] args) {
		SpringApplication.run(CatchRoomBeApplication.class, args);
		log.error("캐치룸 서버 에러 모니터링 테스트");
		log.error(url);
	}

}
