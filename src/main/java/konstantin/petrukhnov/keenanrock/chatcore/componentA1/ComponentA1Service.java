package konstantin.petrukhnov.keenanrock.chatcore.componentA1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Example of external service
 *
 * Created by Konstantin Petrukhnov on 2017-04-09.
 */
@Slf4j
@Service
public class ComponentA1Service {

	// uses Ribbon to look-up the service to use
    @Autowired
    @LoadBalanced
    protected RestTemplate restTemplate;

    protected String serviceUrl;


    public ComponentA1Service(String serviceUrl) {
        this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
                : "http://" + serviceUrl;
    }


    /**
     * Example of get permission, replace Object with real class (e.g. Token)
     *
     * @return
     */
    public Object validateAccess(Object token, Object scope) {

        Object data = null; // token, scope, etc

        return restTemplate.postForObject(serviceUrl + "/access/", data, Object.class);
    }

}
