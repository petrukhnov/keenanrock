package konstantin.petrukhnov.keenanrock.chatcore.model;

import lombok.Data;

import java.util.List;

/**
 * Created by Konstantin Petrukhnov on 2017-03-26.
 */
@Data
public class User {
    private String id;
    private String name;
    private String icon;
    private String remoteIcon; //? or better fetch from internet periodically?
    private String nickname; //for chat mentions/display
    private List<String> roles; //assigned user roles
}
