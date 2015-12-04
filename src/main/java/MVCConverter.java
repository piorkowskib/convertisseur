/**
 * Created by Brian on 02/12/2015.
 */
public class MVCConverter {

    public static void main(String[] args) {

        ConvertView theView = new ConvertView();
        ConvertModele theModele = new ConvertModele();
        ConvertController theController = new ConvertController(theView, theModele);

        theView.setVisible(true);


    }


}
