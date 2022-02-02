import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    private static FXMLLoader fxmlLoaderMain;

    public static void main(String[] args){
    launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        fxmlLoaderMain = new FXMLLoader(getClass().getResource("./gui/view/LoginScreen.fxml"));
        primaryStage.centerOnScreen();
        Scene scene = new Scene(fxmlLoaderMain.load());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Absence Manager");
        //      Image image = new Image("gui/Images/icon.png");
//        primaryStage.getIcons().add(image);
        primaryStage.show();
    }
}
