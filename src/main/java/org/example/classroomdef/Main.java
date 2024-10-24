package org.example.classroomdef;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public Main (){}
    @Override
    public void start(Stage stage) throws IOException {
        Main main = new Main();
        main.openWindow("hello-view.fxml");

    }

    public static void main(String[] args) {
        launch();
    }

    public void openWindow(String fxml) throws IOException {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setMaximized(true);
            stage.setTitle("App");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}