import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;



public class JavaFxSkelDemo2 extends Application{
    public static void main(String args[])
    {
        launch(args);
    }
    public void init() {

    }
    public void start(Stage myStage) {

        myStage.setTitle("THis is my stage ");

        FlowPane rootNode = new FlowPane();

        Label myLabel = new Label("This is a javaFx label");
        rootNode.getChildren().add(myLabel);

        Scene myScene = new Scene(rootNode,500,500);

        myStage.setScene(myScene);





        myStage.show();

    }
    public void stop() {

    }

    
}
