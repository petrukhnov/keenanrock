package konstantin.petrukhnov.keenanrock.chatcore.model;

import lombok.Data;

/**
 * Do we need to manage it? Close, delete, etc?
 *
 * Created by Konstantin Petrukhnov on 2017-03-26.
 */
@Data
public class Topic {
    private String id;
    private String channelId;
    private String userId; //author of original message
}
