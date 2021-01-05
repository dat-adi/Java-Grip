package GUI.JavaFX;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class TreeTest extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	public void init(){
		System.out.println("Initializing the application...");
	}
	
	public void start(Stage myStage) {
		myStage.setTitle("Working with Trees.");
		
		FlowPane rootNode = new FlowPane(10, 10);
		rootNode.setAlignment(Pos.CENTER);
		Scene myScene = new Scene(rootNode, 310, 460);
		myStage.setScene(myScene);
		
		Label response = new Label("No Selection");
		
		TreeItem<String> tiRoot = new TreeItem<String>("Departments");
		TreeItem<String> tiCSE = new TreeItem<String>("CSE");
		tiCSE.getChildren().add(new TreeItem<String>("Data Analysis"));
		tiCSE.getChildren().add(new TreeItem<String>("Networking Security"));
		
		TreeItem<String> tiECE = new TreeItem<String>("ECE");
		tiECE.getChildren().add(new TreeItem<String>("Normal"));
		tiECE.getChildren().add(new TreeItem<String>("Spl."));
		
		TreeItem<String> tiMEC = new TreeItem<String>("MEC");
		tiMEC.getChildren().add(new TreeItem<String>("Normal"));
		tiMEC.getChildren().add(new TreeItem<String>("Spl."));
		
		tiRoot.getChildren().add(tiCSE);
		tiRoot.getChildren().add(tiECE);
		tiRoot.getChildren().add(tiMEC);
		
		TreeView<String> tvDept = new TreeView<String>(tiRoot);
		MultipleSelectionModel<TreeItem<String>> tvSelModel = tvDept.getSelectionModel();
		tvSelModel.selectedItemProperty().addListener(new ChangeListener<TreeItem<String>>(){
			public void changed(ObservableValue<? extends TreeItem<String>> changed, TreeItem<String> oldVal, TreeItem<String> newVal){
				if(newVal != null){
					String path = newVal.getValue();
					TreeItem<String> tmp = newVal.getParent();
					while(tmp != null){
						path = tmp.getValue() + " -> " + path;
						tmp = tmp.getParent();
					}
					
					response.setText("Selection is " + newVal.getValue() + "\nComplete path is " + path);
				}
			}
		});
		
		rootNode.getChildren().addAll(tvDept, response);
		myStage.show();
	}
	
	public void stop(){
		System.out.print("Exiting the application...");
	}
}
