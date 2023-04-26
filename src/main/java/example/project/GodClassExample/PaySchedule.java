package example.project.GodClassExample;

import java.util.Date;

public class PaySchedule {

    public String payDay;  // TODO: make this variable private and be accessed through getter/setter

    public PaySchedule(String payDay) {
        this.payDay = payDay;
    }

    public String getPayDay() {
        return payDay;
    }
}
