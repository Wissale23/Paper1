package UIData;

import examinationdata.Diagnosis;

import javax.swing.*;


public class DisplayDataBP extends JPanel{
    public DisplayDataBP(Diagnosis diagnosis1){
        JLabel textBP = new JLabel("My text");
        textBP.setText("<html>"+"Blood pressure: "+diagnosis1.getSystolic()+"<br>"+" over "+diagnosis1.getDiastolic()+"</html>");

        add(textBP);
    }

}