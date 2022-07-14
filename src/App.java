import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Demo.fxml"));
            Scene scene = new Scene(root, 300, 400);

            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Pane root = new Pane();
        // Scene scene = new Scene(root, 600, 600, Color.SKYBLUE);
        // // Stage stage = new Stage();

        // Circle circle = new Circle();
        // circle.setCenterX(350);
        // circle.setCenterY(350);
        // circle.setRadius(50);
        // circle.setFill(Color.ORANGE);

        // root.getChildren().add(circle);

        // primaryStage.setScene(scene);
        // primaryStage.setResizable(false);
        // primaryStage.show();

    }
}