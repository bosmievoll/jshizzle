package no.conduct.jshizzle;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author Bjørn Ola Smievoll &lt;bos@conduct.no&gt;
 */
@Path("/foo")
public class FooResource {

    @GET
    @Produces("text/plain")
    public String fooShizzle() {
        return "Foo Shizzle!";
    }
}
