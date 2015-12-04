import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;



/**
 * Created by Brian on 02/12/2015.
 */

public class ConvertView extends JFrame {

    Currency euro = new Currency("euro", 1);
    Currency dollar = new Currency("dollar", 1.0569);
    Currency livre = new Currency("livre", 0.7102);
    Currency zloty = new Currency("zloty", 4.3133);


    public List<Currency> ListCurrency;
    public void remplirlist(){
        ListCurrency.add(euro);
        ListCurrency.add(dollar);
        ListCurrency.add(livre);
        ListCurrency.add(zloty);
    }


    String[] devise1String = {euro.getname(), dollar.getname(), livre.getname(), zloty.getname()};
    String[] devise2String = {euro.getname(), dollar.getname(), livre.getname(), zloty.getname()};


    private JComboBox devise1List = new JComboBox(devise1String);
    private JComboBox devise2List = new JComboBox(devise2String);
    private JTextField firstNumber  = new JTextField(15);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(15);



    public  ConvertView(){

        ListCurrency = new ArrayList();

        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        calcPanel.add(firstNumber);
        calcPanel.add(devise1List);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);
        calcPanel.add(devise2List);


        this.add(calcPanel);

    }

    public double getFirstNumber(){

        return Double.parseDouble(firstNumber.getText());

    }

    public String getmoney1(){
        return devise1List.getSelectedItem().toString();
    }

    public String getmoney2(){
        return devise2List.getSelectedItem().toString();
    }

    public double getCalcSolution(){

        return Double.parseDouble(calcSolution.getText());

    }

    public void setCalcSolution(double solution){

        calcSolution.setText(Double.toString(solution));

    }


    void addCalculateListener(ActionListener listenForCalcButton){

        calculateButton.addActionListener(listenForCalcButton);

    }

    void displayErrorMessage(String errorMessage){

        JOptionPane.showMessageDialog(this, errorMessage);

    }




}
