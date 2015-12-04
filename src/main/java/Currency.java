/**
 * Created by Brian on 04/12/2015.
 */
public class Currency {

    private String devise;
    private double taux;

    public Currency(String devise, double taux){
        this.devise = devise;
        this.taux = taux;
    }


    public String getname(){
        return this.devise;
    }

    public double getTaux(){
        return this.taux;
    }
}

