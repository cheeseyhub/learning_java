import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;;
import javafx.event.*;
import javafx.geometry.*;

public class JavaFxSkelDemo3  extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage)
    {
        myStage.setTitle("THis is a stage title");

        FlowPane rootNode = new FlowPane();
        Scene myScene = new Scene(rootNode, 500,500);
        myStage.setScene(myScene);

        Label myLabel = new Label("This is a javafx label");

        rootNode.getChildren().add(myLabel);
        myStage.show();

    }

    
}
