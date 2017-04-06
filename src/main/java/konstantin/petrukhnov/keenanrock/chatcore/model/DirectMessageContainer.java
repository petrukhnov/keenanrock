package konstantin.petrukhnov.keenanrock.chatcore.model;

import lombok.Data;

/**
 * Direct message container e.g. user talking with another
 * dm-message
 * dm-file
 * dm-container //this objects
 *
 * Created by Konstantin Petrukhnov on 2017-03-26.
 */
@Data
public class DirectMessageContainer {
    private String id;
    private String user1id;
    private String user1server;
    private String user2id;
    private String user2server;

}
