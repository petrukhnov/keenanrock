package konstantin.petrukhnov.keenanrock.chatcore.authServer.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Konstantin Petrukhnov on 2017-04-07.
 */
@Slf4j
@RestController
public class AccessController {

    @RequestMapping()
    @ResponseBody
    public Object getToken(String clientId, String clientSecret/*, scope?*/) {


        //return token based on client credentials and scope
        return null;
    }


    @RequestMapping()
    @ResponseBody
    public Object performAction(Object userCreds/*incl id, site, etc*/, Object action, Object targetResource/*, scope?*/) {


        //return if allowed or not, specify level of response to user (401, not suff permissions, detailed)
        return null;
    }
}
