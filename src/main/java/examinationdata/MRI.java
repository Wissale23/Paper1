package examinationdata;

public class MRI {
    private String MRIurl;
    private String MFS;


    public MRI(String MFS, String MRIurl) {
        this.MFS = MFS;
        this.MRIurl = MRIurl;
    }

    public String getMFS() {
        return MFS;
    }

    public String getMRIURL() {
        return MRIurl;
    }

}
