package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SampleController {
	@FXML
	private Label fahren;
	@FXML
	private Label kelvin;
	@FXML
	private TextField celsius;
	@FXML
	private Label error;
	@FXML
	private Button aboutBtn;
	// Event Listener on Button.onAction
	@FXML
	public void handleConvertNowBtnAction(ActionEvent event) {
		// TODO Autogenerated
		error.setText("");
		try {
			fahren.setText((Integer.parseInt(celsius.getText())*1.8+32)+"");
			kelvin.setText((Integer.parseInt(celsius.getText())+273.15)+"");
		}
		catch (Exception e) {
			error.setText("Error! Please enter valid number");
		}
	}
	@FXML
	public void handleAboutBtn(ActionEvent event) {
		try {
			Stage stage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("FXMLAbout.fxml"));
			stage.setScene(new Scene(root));
			stage.setTitle("About the Programmer");
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.initOwner(aboutBtn.getScene().getWindow());
			stage.showAndWait();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
