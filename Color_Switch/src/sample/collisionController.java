package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class collisionController {

    @FXML
    private Button okay;

    @FXML
    private Label label;

    @FXML
    private void initialize(){
        label.setText(Integer.toString(Animationtimer.Global));
    }

    @FXML
    public void okayfunc(MouseEvent event){
        System.exit(0);

    }

    @FXML
    public void restartfunc(MouseEvent event){

        Stage stage=(Stage) okay.getScene().getWindow();
        stage.close();
        mainpageController.stage.close();


    }
}
