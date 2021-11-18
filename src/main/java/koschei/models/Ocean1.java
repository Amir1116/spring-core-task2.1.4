package koschei.models;

import koschei.models.Island2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ocean")
public class Ocean1 {

    @Autowired
    private Island2 island;


    public void setIsland(Island2 island) {
        this.island = island;
    }

    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }
}
