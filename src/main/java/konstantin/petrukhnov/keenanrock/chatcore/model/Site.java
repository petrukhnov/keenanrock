package konstantin.petrukhnov.keenanrock.chatcore.model;

import lombok.Data;

/**
 * Represent remote site(station) location for integrating channels, etc.
 * Created by Konstantin Petrukhnov on 2017-03-26.
 */
@Data
public class Site {
    private String id;
    private String name;
    private String uri;
    //todo keys for access (token is ok for mvp)
    private String token; //provided by remote site

}
