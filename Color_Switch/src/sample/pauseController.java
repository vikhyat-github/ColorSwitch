
package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class pauseController  {
    @FXML
    private AnchorPane root;

    @FXML
    private Button resume;



    @FXML
    public void resume(MouseEvent event){
        System.out.println("resume");
        gameplay.timer.start();
        Ball.move.play();
        Stage stage=(Stage) resume.getScene().getWindow();
        stage.close();





    }
    @FXML
    public void exit(MouseEvent event){
        System.exit(0);

    }
    @FXML
    public void saveExit(MouseEvent event){
        System.out.println("save");


    }


}