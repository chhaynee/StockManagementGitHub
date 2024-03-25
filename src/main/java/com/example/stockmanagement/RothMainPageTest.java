    package com.example.stockmanagement;

    import javafx.application.Application;
    import javafx.fxml.FXMLLoader;
    import javafx.scene.Parent;
    import javafx.scene.Scene;
    import javafx.stage.Stage;
    import com.example.stockmanagement.hongpart.LoginController;

    import java.io.IOException;


    public class RothMainPageTest extends Application {
        private static Stage stg;

        @Override
        public void start(Stage primaryStage) {
            try {

                stg = primaryStage;
                primaryStage.setResizable(false);
                // Load the FXML file
                FXMLLoader loader = new FXMLLoader(getClass().getResource("hongfxmlpart/login.fxml"));
                Parent root = loader.load();

                // Get the controller and set the stage
                LoginController loginController = loader.getController();
                loginController.setStage(primaryStage);

                // Set up the stage
                primaryStage.setTitle("ORGANIC OASIS");
                primaryStage.setScene(new Scene(root, 1240, 600));
                primaryStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        public static void main(String[] args) {
            launch(args);
        }

    }
