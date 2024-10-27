package javax.ws.rs;

import javax.ws.rs.core.Response;
/**
 *
 * @author Juan Carlos Rios
 */
public class NotAuthorizedException extends WebApplicationException {

    public NotAuthorizedException(String message) {
        super(Response.status(Response.Status.UNAUTHORIZED).entity(message).build());
    }
}

