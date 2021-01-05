package GUI.JavaFX;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.scene.layout.*;

public class SecondHello extends Application {
	public static void main(String[] args) {
		System.out.println("Launching the JavaFX application");
		launch(args);
	}
	public void init(){
		System.out.println("Initializing the JavaFX Application...");
	}
	
	public void start(Stage myStage){
		System.out.println("Inside the start method...");
		
		myStage.setTitle("JavaFX Skeleton");
		
		FlowPane rootNode = new FlowPane();
		Scene myScene = new Scene(rootNode, 500, 200);
		
		Label myLabel = new Label("This should be the second Hello program that I've made using Java's GUI components.");
		rootNode.getChildren().add(myLabel);
		
		myStage.setScene(myScene);
		myStage.show();
	}
	
	public void stop(){
		System.out.println("Ending the application...");
	}
}
