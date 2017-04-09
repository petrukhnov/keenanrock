package konstantin.petrukhnov.keenanrock.chatcore.authServer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Konstantin Petrukhnov on 2017-04-09.
 */
@Configuration
@ComponentScan
@PropertySource("classpath:db-config.properties")
public class AccountsConfiguration {

}