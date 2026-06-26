package dev.martinborgman.otel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.pyroscope.javaagent.PyroscopeAgent;
import io.pyroscope.javaagent.config.Config;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		PyroscopeAgent.start(
            new Config.Builder()
                .setApplicationName("my-spring-app")
                .setServerAddress("http://localhost:4040")
                .build()
        );

		SpringApplication.run(Application.class, args);
	}
}


