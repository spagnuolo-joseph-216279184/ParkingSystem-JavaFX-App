package main;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AdminLoginController {

    @FXML
    private PasswordField adminPasswordField;

    @FXML
    private TextField adminUsernameField;

    @FXML
    private Text invalid;

    @FXML
    void adminLogin(ActionEvent event) {
    	
    	if(adminUsernameField.getText().equals("admin") && adminPasswordField.getText().equals("abc123")) {
    		try {
    			Parent homePageParent = FXMLLoader.load(getClass().getResource("AdminMain.fxml"));
    			Scene homePageScene = new Scene(homePageParent);
    			Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    			appStage.setScene(homePageScene);
    			appStage.centerOnScreen();
    			appStage.show();
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
		}
    	else {
    		invalid.setVisible(true);
    	}
    }
    
    @FXML
    void back(ActionEvent event) throws Exception {
    	try {
			Parent homePageParent = FXMLLoader.load(getClass().getResource("Opening.fxml"));
			Scene homePageScene = new Scene(homePageParent);
			Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			appStage.setScene(homePageScene);
			appStage.centerOnScreen();
			appStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
