package konstantin.petrukhnov.keenanrock.chatcore.model;

import lombok.Data;

/**
 *
 * todo unique id generator
 * Created by Konstantin Petrukhnov on 2017-03-26.
 */
@Data
public class AccessRule {
    private String id;
    private String actorId; //user or group
    private String siteId;
    private String targetId; //channel,server, etc
    //private String

}
