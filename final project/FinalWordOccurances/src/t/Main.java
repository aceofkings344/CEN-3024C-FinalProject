package t;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.stage.*;
import javafx.util.Callback;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.Scene;


public class Main extends Application{
	
	private static List<List<String>> ordered = new ArrayList<List<String>>();
	private static List<List<String>> fromDatabase = new ArrayList<List<String>>();
	
	public void start(Stage s) throws Exception {
		fromDatabase = get();
		
		Label l1 = new Label("Select number of words to display count for: ");
		TextArea ta = new TextArea();		
		Button b1 = new Button("Top 20 Words");
		Button b2 = new Button("Top 50 Words");
		Button b3 = new Button("All words");
		
		ta.setEditable(false);
		
		GridPane ro = new GridPane();
		ro.addRow(0, l1);
		ro.addRow(1, b1);
		ro.addRow(2, b2);
		ro.addRow(3, b3);
		
		VBox vb = new VBox(ro, ta);
		VBox.setVgrow(ta, Priority.ALWAYS);
		
		Scene sc = new Scene(vb, 750, 750);

		b1.setOnAction(value -> {
			String r = "";
			try {
				r = Organize.topTwenty(fromDatabase);
			} catch (Exception e) {
				e.printStackTrace();
			}
			ta.setText(r);
		});
		
		b2.setOnAction(value -> {
			String r = "";
			try {
				r = Organize.topFifty(fromDatabase);
			} catch (Exception e) {
				e.printStackTrace();
			}
			ta.setText(r);
		});
		
		b3.setOnAction(value -> {
			String r = "";
			try {
				r = Organize.all(fromDatabase);
			} catch (Exception e) {
				e.printStackTrace();
			}
			ta.setText(r);
		});
		
		s.setScene(sc);
		s.setTitle("Poem word occurances");
		s.show();		
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Organize.org();
		ordered = Organize.organized();
		post();
		launch(args);

	}
	
	public static Connection getConnection() throws Exception{
		try {
			String url = "jdbc:mysql://localhost:3306/wordOccurrences";
			String username = "user1";
			String password = "password";
			
			Connection conn = DriverManager.getConnection(url, username, password);
			return conn;
		} 
		catch(Exception e) {
			System.out.println(e);
			}
		
		return null;
	}
	
	public static void post() throws Exception{
		Connection con = getConnection();
		for(int i = 0; i < ordered.size(); i++) {
			try {
				
				PreparedStatement posted = con.prepareStatement("INSERT INTO word (word, count) VALUES ('"+ordered.get(i).get(0)+"', '"+ordered.get(i).get(1)+"')");
				
				posted.executeUpdate();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
			System.out.println("Insert Completed");
		
	}
	
	public static List<List<String>> get() throws Exception{
		List<List<String>> arr = new ArrayList<List<String>>();
		try {
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement("SELECT word,count FROM word");
			
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				List<String> temp = new ArrayList<>();
				temp.add(result.getString("word"));
				temp.add(result.getString("count"));
				arr.add(temp);
			}
			System.out.println("All records have been selected");
			return arr;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
