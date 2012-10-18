package no.conduct.jshizzle;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Bjørn Ola Smievoll &lt;bos@conduct.no&gt;
 */
@ApplicationPath("/resources")
public class JShizzleApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        return new HashSet<Class<?>>() {{
            add(FooResource.class);
            add(StuffResource.class);
        }};
    }
}
