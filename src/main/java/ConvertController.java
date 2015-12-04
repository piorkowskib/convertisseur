/**
 * Created by Brian on 02/12/2015.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertController {

    private ConvertView theView;
    private ConvertModele theModel;

    public ConvertController(ConvertView theView, ConvertModele theModel) {
        this.theView = theView;
        this.theModel = theModel;


        this.theView.addCalculateListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            double firstNumber = 0;
            double taux1 = 0;
            double taux2 = 0;

            try{

                firstNumber = theView.getFirstNumber();
                String name1 = theView.getmoney1();
                String name2 = theView.getmoney2();
                theView.remplirlist();
                for(int i = 0; i< theView.ListCurrency.size(); i++){
                    if (name1 == theView.ListCurrency.get(i).getname()){
                        taux1 = theView.ListCurrency.get(i).getTaux();
                    }
                    if (name2 == theView.ListCurrency.get(i).getname()){
                        taux2 = theView.ListCurrency.get(i).getTaux();
                    }
                }

                theModel.affectValue(theModel.Convert(firstNumber,taux1,taux2));

                theView.setCalcSolution(theModel.getCalculationValue());

            }

            catch(NumberFormatException ex){

                System.out.println(ex);

                theView.displayErrorMessage("vous devez rentrer 2 entiers");

            }

        }

    }


}