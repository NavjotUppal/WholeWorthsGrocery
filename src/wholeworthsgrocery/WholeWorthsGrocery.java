package wholeworthsgrocery;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class WholeWorthsGrocery  extends Application {
    @Override
 public void start(Stage stage) throws Exception {
     stage.setTitle("WholeWorths Grocery App");
 Parent root = FXMLLoader.load(getClass().getResource("WholeWorthsUI.fxml"));
 Scene scene = new Scene(root);
 stage.setScene(scene);
 stage.show();
 }
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }
    
}
