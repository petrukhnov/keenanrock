package konstantin.petrukhnov.keenanrock.chatcore.model;

import lombok.Data;

import java.util.Map;

/**
 * Total collections+indices per server = 3M (absolute max, 2047Mb/628)
 * one channel is about 5 col and 25 ind, so 100K unique chats per site
 *
 * Collection per channel? Or even multiple?
 * ch-[id]-message
 * ch-[id]-file // +images, move to FS in future?
 * ch-[id]-subscriptions //users, or better have list in channels?
 * ch-[id]-access
 *
 * User should be able to select color or even override icon?
 *
 * Created by Konstantin Petrukhnov on 2017-03-26.
 */
@Data
public class Channel {
    private String id;
    private String name;
    private String channelTopic; //channel topic, not same as Topic; do we need to have topic updated?
    private Map<String,Object> settings; //allow smiles, topics, reactions, etc
    private Long created;
    private Long updated;
    //default is not here, but in separate place

    //icon/logo
}
