package ch.noseryoung;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application{
  @Override
  public void start(Stage primaryStage) {
    try{
      FXMLLoader fxmlLoader = new FXMLLoader();
      fxmlLoader.setLocation(Main.class.getResource("Weather.fxml"));
      Scene scene = new Scene(fxmlLoader.load());
      scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm())  ;
      primaryStage.setTitle("Weather App");
      primaryStage.setScene(scene);
      primaryStage.sizeToScene();
      primaryStage.show();
      primaryStage.sizeToScene();

    }catch(IOException e){
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    launch(args);
  }
}
