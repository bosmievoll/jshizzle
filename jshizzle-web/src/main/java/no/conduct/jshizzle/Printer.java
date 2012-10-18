package no.conduct.jshizzle;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

/**
 * @author Bjørn Ola Smievoll &lt;bos@conduct.no&gt;
 */
@Named
@RequestScoped
public class Printer {

    private static final Logger LOG = Logger.getLogger(BBean.class.getName());

    private String stuff;

    @EJB
    private StuffService ss;

    public String getStuff() {
        return stuff;
    }

    public void setStuff(String stuff) {
        this.stuff = stuff;
    }

    public void createNewStuff() {
        LOG.log(INFO, "Creating new stuff");
        LOG.log(INFO, "From ss: " + ss.doStuff(getStuff()));
    }
}
