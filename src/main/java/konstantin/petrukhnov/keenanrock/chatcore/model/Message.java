package konstantin.petrukhnov.keenanrock.chatcore.model;

import lombok.Data;

import java.util.List;

/**
 * Signle message fro channel or personal communication
 *
 * Should be some way to generate permalinks
 * todo seen by (less than 50 users, optional)
 * todo encryption restriction to unverified devices
 * whisper message that appeared in channels (for 1-5 users), not saved to history
 *
 * Created by Konstantin Petrukhnov on 2017-03-26.
 */
@Data
public class Message {
    private String id;
    private String message;
    private String userId; //sender (some id for system messages?)
    private Long timestamp;
    private String editedById;
    private String editedTS;
    private String channelId; //or direct message container
    private String topicId;
    private List<String> reactions;
    private String externalObject; //e.g. ref to component, etc
    //fixme what about multiple images in sigle message?
    private String internalId; //uploaded file, etc,
    private String internalType;
    //channel invites?

}
