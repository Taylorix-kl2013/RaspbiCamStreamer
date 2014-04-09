import java.io.File;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.MenuItemBuilder;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.shape.Rectangle;


public class JavaFXMenu extends Application{
	
	public static void main(String[] args) {
		
	    launch(args);
	}

	public void start(final Stage primaryStage) {
		///////////////////////////////////////////
		// Author : Alexander Faust              //
		// letzte Änderungen : 09.04.2014        //
		// Version : 1.0						 //
		///////////////////////////////////////////
		
		// primarystage erstellen und formatieren => FensterElement
		primaryStage.setTitle("Java FX Menue Test");
		primaryStage.setHeight(400);
		primaryStage.setWidth(700);
		// Gruppe erstellen - Der Behälter der Alle Steuerelement aufnimmt
		Group root = new Group();								 
		// Layouttabelle zum positionieren der Elemente
		GridPane Layouttab = new GridPane();
		Layouttab.setMinHeight(400);
		Layouttab.setMinWidth(700);
		Layouttab.setHgap(10);
		Layouttab.setVgap(10);
		Layouttab.setMaxHeight(10);
		Layouttab.setMaxWidth(10);
		Layouttab.prefWidthProperty().bind(primaryStage.widthProperty());
		//Die Anzeigefläche die das Behälterelement aufnimmt - also die Gruppe an Elementen 
		Scene Anzeigefl = new Scene(root, 400,700,Color.ALICEBLUE); 
		//Menu - Leiste erstellen
		MenuBar mleiste = new MenuBar(); 
		//Das Menü das in die Leiste soll
		Menu menu1 = new Menu("Menu");
		//Menüpunkt mit Eventhändler zum Schliessen des Programms
		MenuItem menuItem3 = new MenuItem("Exit");
		menuItem3.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				System.exit(0);
			}
    	});
		// btn1 - der Startknopf - an dem das Unheil seinen Lauf nimmt
		Button btn1 = new Button();
		btn1.setLayoutX(100);
		btn1.setLayoutY(80);
		btn1.setText("START");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				//////////////////////////// Hier Aufruf der START Klasse zum starten des Streams ///////////////////////////////////////
		}
		});
		//Mediaplayer zum abspielen des Streams ===== >>>> 
		//Media Streamplayer = new Media("");
		//MediaPlayer medPlay = new MediaPlayer(Streamplayer);
		//medPlay.setAutoPlay(false);
		//MediaView mediaView = new MediaView(medPlay);
		//HBox hbmed = new HBox();
		//hbmed.getChildren().addAll(btn1,mediaView);
		//hbmed.setSpacing(10);
		//Speichern Knopf über Durchsuchen Speichern Dialog öffnet sich
		Button btnsave = new Button();
		btnsave.setLayoutX(200);
		btnsave.setLayoutY(80);
		btnsave.setText("Durchsuchen");
		btnsave.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				FileChooser fileChooser = new FileChooser();
				fileChooser.setTitle("Save Stream");
				File file = fileChooser.showSaveDialog(primaryStage);
				///////////////////////////////// Hier Aufruf der Speichern Klasse über Dialogfenster - oben öffnen Dialogfenster ////////////////////////
			}
		});
		//Knopf zum übernehmen der gesamten einstellungen 
		Button btnaccept = new Button();
		btnaccept.setLayoutX(200);
		btnaccept.setLayoutY(80);
		btnaccept.setText("Einstellungen übernehmen");
		btnaccept.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent event) {
					//////////////////// Hier Klassenaufruf für Einstellungen übernehmen /////////////////////////////
				}
		});
		// HBox enthält die Elemente label zur beschriftung Speicherort und das Textfeld dazu
		TextField txtsave = new TextField();		
		Label lblsave = new Label("Speicherort :");
		HBox hbsave = new HBox();
		hbsave.getChildren().addAll(lblsave,txtsave,btnsave);
		hbsave.setSpacing(10);
		//Das Menü nimmt die menüpunkte auf
		menu1.getItems().add(menuItem3); 
		//Die Menüleiste nimmt das Menü auf
		mleiste.getMenus().add(menu1); 
		//Die Menüleiste wird an die Fensterbreite angepasst
		mleiste.prefWidthProperty().bind(primaryStage.widthProperty());
		
		// HBox enthält die Elemente label zur beschriftung Bitrate und das Textfeld dazu
		Label lblrating = new Label("Bitrate :");
		TextField txtrating = new TextField();
		HBox hbrating = new HBox();
		hbrating.getChildren().addAll(lblrating,txtrating);
		hbrating.setSpacing(10);
		// HBox enthält die Elemente label zur beschriftung FPS und das Textfeld dazu
		Label lblfps = new Label("FPS :");
		TextField txtfps = new TextField();
		HBox hbfps = new HBox();
		hbfps.getChildren().addAll(lblfps,txtfps);
		hbfps.setSpacing(10);
		// HBox enthält die Elemente label zur beschriftung Aufnahmedauer und das Textfeld dazu
		Label lblrec = new Label("Aufnahmedauer :");
		TextField txtrec = new TextField();
		HBox hbrec = new HBox();
		hbrec.getChildren().addAll(lblrec,txtrec);
		hbrec.setSpacing(10);
		// HBox enthält die Elemente label zur beschriftung E-MailAdresse und das Textfeld dazu
		Label lblmail = new Label("E-Mail Adresse :");
		TextField txtmail = new TextField();
		HBox hbmail = new HBox();
		hbmail.getChildren().addAll(lblmail,txtmail);
		hbmail.setSpacing(10);
		// Die Gruppe root nimmt die Menüleiste auf
		root.getChildren().add(mleiste);
		// Die Gruppe root nimmt zusätzlich die Layouttabelle auf - Wichtig die Reihenfolge beachten
		root.getChildren().add(Layouttab);
		//Ab hier nimmt die Layouttabelle die einzelnen Elemente auf und positioniert sie über X,Y koordinaten
		Layouttab.add(btn1,0,3); // ===== >>>>> Rausnehmen wenn Media Player bereit
		//Layouttab.add(hbmed,0,3); ==== >>>> Einfügen wenn Media Player bereit
		Layouttab.add(hbsave,0,6);
		Layouttab.add(mleiste, 0, 0);
		Layouttab.add(hbrating, 0, 4);
		Layouttab.add(hbfps, 0, 5);
		Layouttab.add(hbrec, 0, 7);
		Layouttab.add(hbmail, 0, 8);
		Layouttab.add(btnaccept,0,9);
		//Ein-/Ausschalten der Linien der Gridpane
		Layouttab.setGridLinesVisible(false);
		//die primarystage bekommt die anzeigefläche zugewiesen mit allen Elementen die zuvor aufgenommen wurden
		primaryStage.setScene(Anzeigefl);
		//Fenster anzeigen
		primaryStage.show();
		
	}

}
