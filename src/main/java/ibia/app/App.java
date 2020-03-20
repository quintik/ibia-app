package ibia.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import ibia.app.Util;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene welcomeScene = Util.loadFXMLScene("Welcome");

        stage.setTitle("ibia");
        stage.getIcons().add(Util.WINDOW_ICON);
        stage.setScene(welcomeScene);
        stage.setResizable(false);
        stage.show();
    }
}
