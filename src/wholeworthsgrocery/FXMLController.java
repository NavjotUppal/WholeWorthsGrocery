package wholeworthsgrocery;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private TextField breadQty;

    @FXML
    private TextField breadSubtotal;

    @FXML
    private Button buttonCalculate;

    @FXML
    private TextField eggQty;

    @FXML
    private TextField eggSubtotal;

    @FXML
    private TextField milkQty;

    @FXML
    private TextField milkSubtotal;

    @FXML
    private TextField totalBill;

    @FXML
    void handleButtonAction(ActionEvent event) {
try{
    int egg=Integer.parseInt(eggQty.getText());
    int bread=Integer.parseInt(breadQty.getText());
    int milk=Integer.parseInt(milkQty.getText());
    double eggTotal=((egg/12)*5)+((egg%12)*0.50);
    double breadTotal=((bread/2)*6)+((bread%2)*3.50);
    double milkTotal=((milk/3)*7)+((milk%3)*2.50);
    eggSubtotal.setText("$"+Double.toString(eggTotal));
    breadSubtotal.setText("$"+Double.toString(breadTotal));
    milkSubtotal.setText("$"+Double.toString(milkTotal));
   double totalPrice;
   totalPrice= eggTotal+breadTotal+milkTotal;
   totalBill.setText("$"+Double.toString(totalPrice));
}catch(NullPointerException e){
    System.out.println("Null Values are not accepted"+e);
    }catch(NumberFormatException e){
                System.out.println("Only integer values are allowed"+e);
    }catch(Exception e){
        System.out.println(e.toString());
    }
    }

}
