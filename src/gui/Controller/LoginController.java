package gui.Controller;

import gui.util.SceneSwapper;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    public TextField lblUsername;
    public TextField lblPassword;
    public ImageView imgBackground;
    public AnchorPane anchorpaneBackground;

    public LoginController(){



    }

    public void onLoginBtn(ActionEvent actionEvent) throws IOException {

        if(lblUsername.getText().toLowerCase(Locale.ROOT).equals("trine") && lblPassword.getText().toLowerCase(Locale.ROOT).equals("1234")){

            SceneSwapper sceneSwapper = new SceneSwapper();
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            sceneSwapper.sceneSwitch(stage, "TeacherScreen.fxml");
        }

        if(lblUsername.getText().toLowerCase(Locale.ROOT).equals("hans") && lblPassword.getText().toLowerCase(Locale.ROOT).equals("1234")){

            SceneSwapper sceneSwapper = new SceneSwapper();
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            sceneSwapper.sceneSwitch(stage, "StudentMainScreen.fxml");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        imgBackground.fitWidthProperty().bind(anchorpaneBackground.widthProperty());
        imgBackground.fitHeightProperty().bind(anchorpaneBackground.heightProperty());


    }
}
