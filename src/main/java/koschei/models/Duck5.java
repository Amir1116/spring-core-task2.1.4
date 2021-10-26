package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("duck")
public class Duck5 {

    @Autowired
    @Qualifier("egge")
    private Egg6 egge;

    @Override
    public String toString() {
        return (", в утке яйцо " + egge.toString());
    }
}
