package konstantin.petrukhnov.keenanrock.chatcore.registrationServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Used by microservices  to register
 * (Eureka)
 *
 * Created by Konstantin Petrukhnov on 2017-04-09.
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistrationServer {

    /**
     * Run the application using Spring Boot and an embedded servlet engine.
     *
     * @param args
     *            Program arguments - ignored.
     */
    public static void main(String[] args) {
        // Tell server to look for registration.properties or registration.yml
        System.setProperty("spring.config.name", "registration-server");

        SpringApplication.run(RegistrationServer.class, args);
    }
}

