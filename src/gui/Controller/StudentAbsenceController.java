package gui.Controller;

import gui.util.SceneSwapper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class StudentAbsenceController implements Initializable {
    @FXML
    private Button btnAttend;
    @FXML
    private Label lblDate;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Date date = new Date();
        lblDate.setText(date.toString());
    }

    public void onAttendBtn(ActionEvent actionEvent) {
        btnAttend.setText("Attending");
    }


    public void onBackBtn(ActionEvent actionEvent) throws IOException {
        
        SceneSwapper sceneSwapper = new SceneSwapper();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        sceneSwapper.sceneSwitch(stage, "StudentMainScreen.fxml");
    }
}
