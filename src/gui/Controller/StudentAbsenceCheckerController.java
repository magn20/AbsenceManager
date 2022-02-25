package gui.Controller;

import be.Subject;
import gui.util.SceneSwapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StudentAbsenceCheckerController implements Initializable {
    @FXML
    private PieChart absenceChart;

    public void onBackBtn(ActionEvent actionEvent) throws IOException {
        SceneSwapper sceneSwapper = new SceneSwapper();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setResizable(false);
        sceneSwapper.sceneSwitch(stage, "StudentMainScreen.fxml");

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Absence", 24),
                        new PieChart.Data("Present", 70),
                        new PieChart.Data("Allowed Absence", 10));

        absenceChart.setData(pieChartData);
    }
}
