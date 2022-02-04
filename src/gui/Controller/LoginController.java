package gui.Controller;

import gui.util.SceneSwapper;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;

public class LoginController {

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
            sceneSwapper.sceneSwitch(stage, "StudentScreen.fxml");
        }
    }
}
