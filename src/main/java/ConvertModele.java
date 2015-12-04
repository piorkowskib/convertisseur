/**
 * Created by Brian on 02/12/2015.
 */
public class ConvertModele {


    private double calculationValue;

    public void affectValue(double firstNumber){

        calculationValue = firstNumber;

    }

    public double getCalculationValue(){

        return calculationValue;

    }

    public double Convert(double quantite, double taux1, double taux2){
        double result;
        result = (taux2 * quantite)/taux1;
        return result;
    }

}

