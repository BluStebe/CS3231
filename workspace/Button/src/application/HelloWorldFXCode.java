package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import javafx.application.Application;
public class HelloWorldFXCode extends Application{
	private Label label;
	private Button btn;
	private Button btn2;
	private Label label2;
	
	public void start(Stage primaryStage) {
		btn = new Button("First button");
		label = new Label();
		btn2 = new Button("Second button");
		label2 = new Label();
		
		label.setText("First label");
		label2.setText("Second label");
		
		btn.setOnAction(e -> buttonClick(e));
		btn2.setOnAction(e -> buttonClick2(e));
		
		FlowPane root = new FlowPane();
		root.getChildren().add(btn);
		root.getChildren().add(label);
		root.getChildren().add(btn2);
		root.getChildren().add(label2);
		
		Scene scene = new Scene(root, 500, 50);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("My First FX Program Code Style!");
		primaryStage.show();
	}
	
	public void buttonClick(ActionEvent event) {
		label.setText("Hello World!");
	}
	
	public void buttonClick2(ActionEvent event) {
		label2.setText("Goodbye world >_<");
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
