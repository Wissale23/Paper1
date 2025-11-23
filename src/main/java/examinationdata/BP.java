package examinationdata;

public class BP {
    private String duration;
    private String Diastolic;
    private String Systolic;

    public BP(String duration, String Diastolic, String Systolic) {
        this.duration = duration;
        this.Diastolic = Diastolic;
        this.Systolic = Systolic;
    }

    public String getDuration() {
        return duration;
    }
    public String getDiastolic() {
        return Diastolic;
    }
    public String getSystolic() {
        return Systolic;
    }

}
