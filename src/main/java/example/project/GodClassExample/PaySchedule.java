package example.project.GodClassExample;

import java.util.Date;

public class PaySchedule {

    private String payDay;  // TODO: make this variable private and be accessed through getter/setter

    public PaySchedule(String payDay) {
        this.payDay = payDay;
    }

    public String getPayDay() {
        return payDay;
    }

    public void setPayDay(String payDay) {this.payDay = payDay;};
}
