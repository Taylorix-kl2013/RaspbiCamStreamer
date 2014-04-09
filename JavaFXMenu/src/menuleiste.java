import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class menuleiste {

	public void start(Stage primaryStage) {
		primaryStage.setTitle("Java FX Menue Test");
		Group root = new Group();
		Scene Anzeigefl = new Scene(root, 400,300,Color.WHITE);
		
		// Menu - Leiste
		MenuBar mleiste = new MenuBar();
		
		Menu menu1 = new Menu("Menu");
		
		MenuItem menuItem1 = new MenuItem("Punkt 1");
		menuItem1.setOnAction(new EventHandler<ActionEvent>() {
			 public void handle(ActionEvent e) {
				  System.out.println("Punkt 1 geklickt");
			 }
		});
		
		MenuItem menuItem2 = new MenuItem("Punkt2");
		menuItem2.setOnAction(new EventHandler<ActionEvent>() {
			 public void handle(ActionEvent e) {
				  System.out.println("Punkt 2 geklickt");
			 }
		});
		
		MenuItem menuItem3 = new MenuItem("Punkt3");
		menuItem3.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				System.out.println("Punkt 3 geklickt");
				
			}
							
		});
		
		menu1.getItems().add(menuItem1);
		menu1.getItems().add(menuItem2);
		menu1.getItems().add(menuItem3);
		mleiste.getMenus().add(menu1);
		
		mleiste.prefWidthProperty().bind(primaryStage.widthProperty());
		root.getChildren().add(mleiste);
		
		primaryStage.setScene(Anzeigefl);
		primaryStage.show();
		
	}
}
