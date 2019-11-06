package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
	private mycontroller controller;

    @Override
    public void start(Stage primaryStage) throws Exception{
       FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
	    Pane mypane=loader.load();
	    controller=loader.getController();
	    MenuBar menuBar=new MenuBar();
	    menuBar=createmenu();
	    menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
	    mypane.getChildren().addAll(menuBar);




        primaryStage.setTitle("TIC-TAC-TOE");
        primaryStage.setScene(new Scene(mypane, 700, 400));
        primaryStage.show();
        primaryStage.setResizable(false);

        Image icon= new Image(getClass().getResourceAsStream("512.png"));
        primaryStage.getIcons().add(icon);



    }


    public static MenuBar createmenu(){

	    Menu file=new Menu("FILE");
	    Menu help=new Menu("HELP");

	    MenuItem exit=new MenuItem("Exit");

	    file.getItems().addAll(exit);

	    MenuItem aboutgame=new MenuItem("About Game");
	    MenuItem aboutdeveloper=new MenuItem("About Developer");
	    MenuItem howtoplay=new MenuItem("How To Play?");

	    exit.setOnAction(event -> {exitthegame();});

	    aboutdeveloper.setOnAction(event ->{
	    	printdeveloperinfo();});

	    aboutgame.setOnAction(event -> {
	    	printinfo();
	    });

	    howtoplay.setOnAction(event -> {
	    	printhowtoplay();
	    });

	    SeparatorMenuItem separatorMenuItem1=new SeparatorMenuItem();
	    SeparatorMenuItem separatorMenuItem2=new SeparatorMenuItem();
	    help.getItems().addAll(aboutgame,separatorMenuItem1,aboutdeveloper,separatorMenuItem2,howtoplay);

	    MenuBar menuBar=new MenuBar();
	    menuBar.getMenus().addAll(file,help);

	    return menuBar;

    }

	private static void exitthegame() {
    	System.exit(0);
		Platform.exit();
	}

	private static void printdeveloperinfo() {
    	Alert alert=new Alert(Alert.AlertType.INFORMATION);
    	alert.setTitle("TIC-TAC-TOE");
    	alert.setHeaderText("About Developer");
    	alert.setContentText("I am Yash Indane and I like to develop system applications.");
    	alert.show();
	}

	private static void printhowtoplay() {
    	Alert alert=new Alert(Alert.AlertType.INFORMATION);
    	alert.setHeaderText("How To Play?");
    	alert.setTitle("TIC-TAC-TOE");
    	alert.setContentText("Win: If the player has two in a row, they can place a third to get three in a row."+
		"Block: If the opponent has two in a row, the player must play the third themselves to block the opponent."+
		"Fork: Create an opportunity where the player has two threats to win (two non-blocked lines of 2)."+
				"Blocking an opponent's fork: If there is only one possible fork for the opponent, the player should block it. Otherwise, the player should block any forks in any way that simultaneously allows them to create two in a row. Otherwise, the player should create a two in a row to force the opponent into defending, as long as it doesn't result in them creating a fork. For example, if X has two opposite corners and O has the center, O must not play a corner in order to win. (Playing a corner in this scenario creates a fork for X to win.)"+
		"Center: A player marks the center. (If it is the first move of the game, playing on a corner gives the second player more opportunities to make a mistake and may therefore be the better choice; however, it makes no difference between perfect players.)"+
		"Opposite corner: If the opponent is in the corner, the player plays the opposite corner."+
				"Empty corner: The player plays in a corner square."+
				"Empty side: The player plays in a middle square on any of the 4 sides.");
    	alert.show();


	}

	private static void printinfo() {
		Alert alert=new Alert(Alert.AlertType.INFORMATION);
		alert.setHeaderText("About Game");
		alert.setTitle("TIC-TAC-TOE");
		alert.setContentText("Tic-tac-toe , noughts and crosses or Xs and Os, is a paper-and-pencil game for two players, X and O, who take turns marking the spaces in a 3×3 grid. The player who succeeds in placing three of their marks in a horizontal, vertical, or diagonal row wins the game. "+
				"Players soon discover that the best play from both parties leads to a draw."
		);
		alert.show();





	}


	public static void main(String[] args) {
        launch(args);
    }
}
