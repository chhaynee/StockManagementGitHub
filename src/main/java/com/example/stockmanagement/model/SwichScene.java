    package com.example.stockmanagement.model;

    import javafx.fxml.FXMLLoader;
    import javafx.scene.layout.AnchorPane;
    import com.example.stockmanagement.RothMainPageTest;

    import java.io.IOException;
    import java.util.Objects;

    public class SwichScene {
        public SwichScene(AnchorPane currentAnchorPane, String fxml) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(Objects.requireNonNull(RothMainPageTest.class.getResource(fxml)));
                AnchorPane nextAnchorPane = loader.load();

                currentAnchorPane.getChildren().clear();
                currentAnchorPane.getChildren().add(nextAnchorPane);
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Error loading FXML file: " + fxml);
            }
        }

    }

