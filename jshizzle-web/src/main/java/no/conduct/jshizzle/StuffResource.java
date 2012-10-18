package no.conduct.jshizzle;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.io.Serializable;

/**
 * @author Bjørn Ola Smievoll &lt;bos@conduct.no&gt;
 */
@Path("/stuff")
@SessionScoped
public class StuffResource implements Serializable {

    @EJB
    private StuffService ss;

    @GET
    @Produces("text/plain")
    public String doStuff() {
        return ss.doStuff("jax-rs stuff");
    }
}
