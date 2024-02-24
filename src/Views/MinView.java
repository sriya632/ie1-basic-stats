
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class MinView implements View{

    //Instance variables
    double min;
    String name;
    JTextField jtfMin;

    public MinView(){
        min = 0;
        name = "Min";
        jtfMin = new JTextField(5);
        jtfMin.setEditable(false);
    }

    @Override
    public void update(ArrayList<Double> numbers) {
        // TODO Auto-generated method stub
        min = BasicStats.min(BasicStats.getArrayDouble(numbers));
        jtfMin.setText("" + min);
    }