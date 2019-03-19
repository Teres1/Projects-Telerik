package superhero;

import java.util.List;

public class Power {
    private String name;
    private PowerType powerType;
    public Power() {
    }
    public Power(String name, PowerType powerType) {
        this.name = name;
        this.powerType = powerType;
    }

    public PowerType getPowerType() {
        return powerType;
    }
    public void setPowerType(PowerType powerType) {
        this.powerType = powerType;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}


