package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("needle")
public class Needle7 {

    @Autowired
    public Needle7(Deth8 death) {
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + "";
    }
}
