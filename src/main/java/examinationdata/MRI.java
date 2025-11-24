package examinationdata;

public class MRI {
    private String MRIurl; //private String[] MRIurls;  // array of URLs
    private String MFS;


    public MRI(String MFS, String MRIurl) {  //String[] MRIurls for multiple
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

 //String[] MRIurls for multiple
    public String[] getMRIURLs() {
        return MRIurls;
    }
