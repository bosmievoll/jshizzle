package no.conduct.jshizzle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

/**
 * @author Bjørn Ola Smievoll &lt;bos@conduct.no&gt;
 */
@Stateful
@LocalBean
@SessionScoped
public class ABean implements Serializable {

    private static final Logger LOG = Logger.getLogger(ABean.class.getName());

    @EJB
    private BBean b;

    private String stuff;

    @PostConstruct
    void init() {
        stuff = "";
    }

    public String getStuff() {
        return stuff;
    }

    public void setStuff(String stuff) {

        LOG.log(INFO, "Setting stuff: " + stuff);
        this.stuff = stuff;
    }
}
