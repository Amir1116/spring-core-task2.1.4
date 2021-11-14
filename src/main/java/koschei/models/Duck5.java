package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("duck")
public class Duck5 {

    private final Egg6 egge;

    @Autowired
    public Duck5(Egg6 egge){
        this.egge = egge;
    }

    @Override
    public String toString() {
        return (", в утке яйцо " + egge.toString());
    }
}
