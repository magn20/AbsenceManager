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
        stage.setResizable(false);
        sceneSwapper.sceneSwitch(stage, "StudentAbsence.fxml");

    }

    public void onScheduleBtn(ActionEvent actionEvent) throws IOException {
        SceneSwapper sceneSwapper = new SceneSwapper();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setResizable(false);
        sceneSwapper.sceneSwitch(stage, "StudentSchedule.fxml");
    }

    public void onSettingsBtn(ActionEvent actionEvent) throws IOException {
        SceneSwapper sceneSwapper = new SceneSwapper();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setResizable(false);
        sceneSwapper.sceneSwitch(stage, "StudentAbsenceChecker.fxml");
    }

    public void onLogoutBtn(ActionEvent actionEvent) throws IOException {
        SceneSwapper sceneSwapper = new SceneSwapper();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setResizable(false);
        sceneSwapper.sceneSwitch(stage, "LoginScreen.fxml");

    }
}
