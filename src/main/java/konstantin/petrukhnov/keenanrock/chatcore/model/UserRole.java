package konstantin.petrukhnov.keenanrock.chatcore.model;

import lombok.Data;

/**
 * Abstraction to simplify access management.
 * One or several users may belong to group.
 *
 * Created by Konstantin Petrukhnov on 2017-03-26.
 */
@Data
public class UserRole {
    private String id;
    private String name;
    private String siteId; //from which server

}
