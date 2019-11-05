package ch.noseryoung;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import net.aksingh.owmjapis.CurrentWeather;
import org.json.JSONException;

public class Controller implements Initializable {

  WeatherModel wm;
  int cityID = 2657896;
  //    @FXML
  //    private ToggleButton cityTg;
  @FXML private Label cityNameLbl;
  @FXML private Label descriptionLbl;
  @FXML private Label temperatureLbl;
  @FXML private Label pressureLbl;
  @FXML private Label humidityLbl;
  @FXML private Label windLbl;
  @FXML private TextField cityField;
  @FXML private ImageView weatherIconView;
  @FXML private Image weatherIcon;
  @FXML private Label timeLbl;

  @FXML
  public void initialize(URL location, ResourceBundle resources) throws JSONException {

    wm = new WeatherModel(cityID);
    System.out.println(wm.toString());
    cityNameLbl.textProperty().bindBidirectional(wm.cityNameProperty());
    descriptionLbl.textProperty().bindBidirectional(wm.descriptionProperty());
    temperatureLbl.textProperty().bindBidirectional(wm.temperatureProperty());
    pressureLbl.textProperty().bindBidirectional(wm.pressureProperty());
    humidityLbl.textProperty().bindBidirectional(wm.humidityProperty());
    windLbl.textProperty().bindBidirectional(wm.windProperty());
    weatherIcon = new Image("http://openweathermap.org/img/w/" + wm.getIconID() + ".png");
    weatherIconView.setImage(weatherIcon);
    weatherIconView.setScaleX(1.5);
    weatherIconView.setScaleY(1.5);
    timeLbl.setText(new java.util.Date().toString());
  }
}
