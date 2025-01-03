package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Sql.sqlData;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class loginController extends sqlData{
	
	@FXML
	private TextField username;
	
	@FXML
	private TextField password;
	
	@FXML
	Label errorMessage;
	
	

	public void loginButtonClick() throws SQLException  {
		
		Connection connection = DriverManager.getConnection(url,sqlname,sqlpass);
		
		Statement statement = connection.createStatement();
		
		String query = "Select * from ecomlogin.login where username = '" + username.getText() + "'and password = '"
				+ password.getText() + "';";
		
		ResultSet result = statement.executeQuery(query);
		
		if (result.next()) {
			
			this.errorMessage.setText("Login Successful");

		}else {
			
			this.errorMessage.setText("Login Failed");
			
		}
	}
}