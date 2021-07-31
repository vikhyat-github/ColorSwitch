package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;


public class Main extends Application {
     static MediaPlayer mediaPlayer;

    public static Stage primaryStage;
    private void setPrimaryStage(Stage stage) {
        Main.primaryStage = stage;
    }

    static public Stage getPrimaryStage() {
        return Main.primaryStage;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        tunes();
        Parent root = FXMLLoader.load(getClass().getResource("mainpage.fxml"));
        setPrimaryStage(primaryStage);
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Color Switch");
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.show();
    }

    public void tunes(){


        try {
            String dir = System.getProperty("user.dir");

            //System.out.println(dir);

            String music = dir + "/src/sample/Background.wav";

            Media sound = new Media(new File(music).toURI().toString());
            mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.setAutoPlay(true);
            mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
            mediaPlayer.play();
        }
        catch (Exception e){
            System.out.println("Media player not found");
        }

    }
    public static void main(String[] args) {
        launch(args);
    }
}
