package koschei.config;

import koschei.models.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    public static Island2 getIsland() {
        return new Island2(getWood());
    }

    public static Wood3 getWood(){
        return new Wood3(getRabbit());
    }

    public static Rabbit4 getRabbit(){
        return new Rabbit4(getDuck());
    }

    public static Duck5 getDuck(){
        return new Duck5(getEgge());
    }

    public static Egg6 getEgge(){
        return new Egg6(getNeedle());
    }

    public static Needle7 getNeedle(){
        return new Needle7(getDeath());
    }

    public static Deth8 getDeath(){
        return new Deth8();
    }
}
