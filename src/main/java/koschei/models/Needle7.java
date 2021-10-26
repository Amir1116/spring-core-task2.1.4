package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("needle")
public class Needle7 {

    @Autowired
    @Qualifier("death")
    private Deth8 death;


    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + "";
    }
}
