package konstantin.petrukhnov.keenanrock.chatcore.authServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

/**
 * Created by Konstantin Petrukhnov on 2017-04-09.
 */
@EnableAutoConfiguration
@EnableDiscoveryClient
@Import(AccountsConfiguration.class)
public class AccountsServer {

    public static void main(String[] args) {
        // Will configure using accounts-server.yml
        System.setProperty("spring.config.name", "accounts-server");

        SpringApplication.run(AccountsServer.class, args);
    }
}
