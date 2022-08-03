package main_window;

import java.io.IOException;

import controllers.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Splash extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(HelperClass.NEW_SPLASH_URL);
//        root.setStyle("-fx-background-radius: 20;" +
//                "-fx-background-color:   #f19f48,   #332b33;" +
//                "-fx-background-insets: 0, 0 3 3 0;");
        root.setStyle("-fx-background-color: transparent");
        Scene scene = new Scene(root, Color.TRANSPARENT);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.initStyle(StageStyle.TRANSPARENT);

        stage.getIcons().add(new Image(getClass().getClassLoader().getResourceAsStream("assets/app_icon.PNG")));
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        MainController.executor.shutdown();
    }
}
