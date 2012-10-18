package no.conduct.jshizzle;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * @author Bjørn Ola Smievoll &lt;bos@conduct.no&gt;
 */
@Stateless
@LocalBean
public class StuffService {

    @EJB
    private ABean a;

    public String doStuff(String stuff) {

        a.setStuff(a.getStuff() + "+" + stuff);
        return "service - " + a.getStuff();
    }
}
