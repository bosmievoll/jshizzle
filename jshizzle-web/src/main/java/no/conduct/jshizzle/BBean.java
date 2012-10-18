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
public class BBean implements Serializable {

    private static final Logger LOG = Logger.getLogger(BBean.class.getName());

    //@EJB
    //private ABean a;

    //@PostConstruct
    void init() {
/*
        if ("".equals(a.getStuff()))
            a.setStuff("Stuff fra B");
        else
            LOG.log(INFO, "Stuff er allerede satt");
*/
    }

    public String getStuff() {
            return "B stuff"; //a.getStuff();
    }
}
