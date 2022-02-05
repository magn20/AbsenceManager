package gui.Controller;

import gui.util.SceneSwapper;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentMainController {
    public void onAbsenceBtn(ActionEvent actionEvent) throws IOException {

        SceneSwapper sceneSwapper = new SceneSwapper();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        sceneSwapper.sceneSwitch(stage, "StudentAbsence.fxml");

    }

    public void onScheduleBtn(ActionEvent actionEvent) throws IOException {
        SceneSwapper sceneSwapper = new SceneSwapper();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        sceneSwapper.sceneSwitch(stage, "StudentSchedule.fxml");
    }

    public void onSettingsBtn(ActionEvent actionEvent) {

    }

    public void onLogoutBtn(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();

    }
}
