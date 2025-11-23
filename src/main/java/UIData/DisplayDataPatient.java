package UIData;

import examinationdata.Diagnosis;

import javax.swing.*;


public class DisplayDataPatient extends JPanel{
    public DisplayDataPatient(Diagnosis diagnosis1){
        JLabel textPatient = new JLabel("My text");
        textPatient.setText("<html>"+"Name: "+diagnosis1.getName()+"<br>"+"Age: "+diagnosis1.getAge()+"</html>");
        add(textPatient);
    }


}
