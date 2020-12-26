package GUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MenuWithJavaFX extends Application{
	Label response = new Label("MENU CODE");
	public static void main(String[] args){
		launch(args);
	}
	public void start(Stage myStage){
		
		
		myStage.setTitle("Working with JavaFX");
		
		BorderPane rootNode=new BorderPane();
		
		Scene myScene=new Scene(rootNode,300,300);
		
		myStage.setScene(myScene);
		
		MenuBar mb=new MenuBar();
		
		
		
		//Country MENU
		new Menu("COUNTRY");
		MenuItem india=new MenuItem("INDIA");
		MenuItem australia=new MenuItem("AUSTRALIA");
		MenuItem pakistan=new MenuItem("PAKISTAN");
		MenuItem germany=new MenuItem("GERMANY");
		MenuItem iceland=new MenuItem("ICELAND");
		MenuItem british=new MenuItem("BRITISH");
		MenuItem china=new MenuItem("CHINA");
		
		//Fonts
		new Menu("FONT");
		
		new Menu("NAME");
		MenuItem tim=new MenuItem("TimesRoman");
		MenuItem dia=new MenuItem("Dialog");
		MenuItem san=new MenuItem("SanSerif");
		MenuItem cou=new MenuItem("Courier");
		
		new Menu("TYPE");
		MenuItem bold=new MenuItem("Bold");
		MenuItem italic=new MenuItem("Italic");
		
		new Menu("SIZE");
		MenuItem a=new MenuItem("15");
		MenuItem b=new MenuItem("16");
		MenuItem c=new MenuItem("17");
		MenuItem d=new MenuItem("18");
		
		//colours
		new Menu("COLOUR");
		MenuItem violet=new MenuItem("VIOLET");
		MenuItem indigo=new MenuItem("INDIGO");
		MenuItem blue=new MenuItem("BLUE");
		MenuItem green=new MenuItem("GREEN");
		MenuItem yellow=new MenuItem("YELLOW");
		MenuItem orange=new MenuItem("ORANGE");
		MenuItem red=new MenuItem("RED");
		
		EventHandler<ActionEvent> MEHandler = ae -> {
			String A=((MenuItem)ae.getSource()).getText();
			if(A.equals("INDIA")||A.equals("AUSTRALIA")||A.equals("PAKISTAN")||A.equals("GERMANY")||A.equals("ICELAND")||A.equals("BRITISH")||A.equals("CHINA"))
			{
				response.setText(((MenuItem)ae.getSource()).getText());
				response.setTextFill(Color.BLUE);
				response.setFont(Font.font("Dialog",FontPosture.ITALIC,18));
			}
			if(A.equals("TimesRoman"))
			{
				response.setFont(Font.font("Times New Roman",FontPosture.ITALIC,18));
			}
			if(A.equals("Bold"))
			{
				response.setFont(Font.font("Times New Roman",FontWeight.BOLD,18));
			}
			if(A.equals("Italic"))
			{
				response.setFont(Font.font("Times New Roman",FontPosture.ITALIC,18));
			}
			if(A.equals("Dialog"))
			{
				response.setFont(Font.font("Dialog",FontPosture.ITALIC,18));
			}
			if(A.equals("SanSerif"))
			{
				response.setFont(Font.font("SanSerif",FontPosture.ITALIC,18));
			}
			if(A.equals("Courier"))
			{
				response.setFont(Font.font("Courier",FontPosture.ITALIC,18));
			}
			if(A.equals("Courier"))
			{
				response.setFont(Font.font("Courier",FontPosture.ITALIC,18));
			}
			if(A.equals("VIOLET"))
			{
				response.setTextFill(Color.VIOLET);
			}
			if(A.equals("INDIGO"))
			{
				response.setTextFill(Color.PURPLE);
			}
			if(A.equals("BLUE"))
			{
				response.setTextFill(Color.BLUE);
			}
			if(A.equals("GREEN"))
			{
				response.setTextFill(Color.GREEN);
			}
			if(A.equals("YELLOW"))
			{
				response.setTextFill(Color.YELLOW);
			}
			if(A.equals("ORANGE"))
			{
				response.setTextFill(Color.ORANGE);
			}
			if(A.equals("RED"))
			{
				response.setTextFill(Color.RED);
			}
			
		};
		
		india.setOnAction(MEHandler);
		australia.setOnAction(MEHandler);
		pakistan.setOnAction(MEHandler);
		germany.setOnAction(MEHandler);
		iceland.setOnAction(MEHandler);
		british.setOnAction(MEHandler);
		china.setOnAction(MEHandler);
		
		tim.setOnAction(MEHandler);
		dia.setOnAction(MEHandler);
		san.setOnAction(MEHandler);
		cou.setOnAction(MEHandler);
		
		bold.setOnAction(MEHandler);
		italic.setOnAction(MEHandler);
		
		a.setOnAction(MEHandler);
		b.setOnAction(MEHandler);
		c.setOnAction(MEHandler);
		d.setOnAction(MEHandler);
		
		violet.setOnAction(MEHandler);
		indigo.setOnAction(MEHandler);
		blue.setOnAction(MEHandler);
		green.setOnAction(MEHandler);
		yellow.setOnAction(MEHandler);
		orange.setOnAction(MEHandler);
		red.setOnAction(MEHandler);
		
		rootNode.setTop(mb);
		
		rootNode.setCenter(response);
		myStage.show();
	}
}