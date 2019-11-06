package sample;


import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;
import javafx.util.Duration;


import java.net.URL;

import java.util.ResourceBundle;

public class mycontroller implements Initializable {

	@FXML
	public Pane panepane1;
	@FXML
	public GridPane gamegrid;
	@FXML
	public Button b1,b2,b3,b4,b5,b6,b7,b8,b9,resetgamebutton;
	@FXML
	public ChoiceBox choice1,choice2;
	@FXML
	public TextField name1,name2;

	boolean is_player_one_chance=true;
	boolean check_colour_1=true;
	boolean check_colour_2=true;



	@Override
	public void initialize(URL location, ResourceBundle resources) {

		Circle circle1 = new Circle();
		circle1.setRadius(30);
		circle1.setFill(Color.DARKBLUE);
		circle1.setCenterX(-60);
		circle1.setCenterY(-60);
		circle1.setSmooth(true);
		
		Circle circle2=new Circle();
		circle2.setRadius(30);
		circle2.setFill(Color.GRAY);
		circle2.setCenterX(-60);
		circle2.setCenterY(-60);
		circle2.setSmooth(true);

		Circle circle3=new Circle();
		circle3.setRadius(30);
		circle3.setFill(Color.KHAKI);
		circle3.setCenterX(-60);
		circle3.setCenterY(-60);
		circle3.setSmooth(true);

		Circle circle4=new Circle();
		circle4.setRadius(30);
		circle4.setFill(Color.PEACHPUFF);
		circle4.setCenterX(-60);
		circle4.setCenterY(-60);
		circle4.setSmooth(true);

		Circle circle5=new Circle();
		circle5.setRadius(30);
		circle5.setFill(Color.TEAL);
		circle5.setCenterX(-60);
		circle5.setCenterY(-60);
		circle5.setSmooth(true);


		Circle circle6=new Circle();
		circle6.setRadius(30);
		circle6.setFill(Color.AZURE);
		circle6.setCenterX(-60);
		circle6.setCenterY(-60);
		circle6.setSmooth(true);

		Circle circle7=new Circle();
		circle7.setRadius(30);
		circle7.setFill(Color.CADETBLUE);
		circle7.setCenterX(-60);
		circle7.setCenterY(-60);
		circle7.setSmooth(true);

		Circle circle8=new Circle();
		circle8.setRadius(30);
		circle8.setFill(Color.ROSYBROWN);
		circle8.setCenterX(-60);
		circle8.setCenterY(-60);
		circle8.setSmooth(true);

		Circle circle9=new Circle();
		circle9.setRadius(30);
		circle9.setFill(Color.CORNSILK);
		circle9.setCenterX(-60);
		circle9.setCenterY(-60);
		circle9.setSmooth(true);


		Line line=new Line();//diagonal1
		line.setStroke(Color.PEACHPUFF);
		line.setStrokeWidth(7.5);
		line.setSmooth(true);
		line.setStrokeLineCap(StrokeLineCap.ROUND);
		line.setStartY(-180);
		line.setStartX(-140);
		line.setEndY(-4);
		line.setEndX(75);




		Line line1=new Line();//diagonal2
		line1.setStroke(Color.PEACHPUFF);
		line1.setStrokeWidth(7.5);
		line1.setSmooth(true);
		line1.setStrokeLineCap(StrokeLineCap.ROUND);
		line1.setStartY(-175);
		line1.setStartX(295);
		line1.setEndY(-6);
		line1.setEndX(65);

		Line line2=new Line();
		line2.setStroke(Color.PEACHPUFF);
		line2.setStrokeWidth(7.5);
		line2.setSmooth(true);
		line2.setStrokeLineCap(StrokeLineCap.ROUND);
		line2.setStartY(-240);
		line2.setStartX(87);
		line2.setEndY(0);
		line2.setEndX(87);

		Line line3=new Line();
		line3.setStroke(Color.PEACHPUFF);
		line3.setStrokeWidth(7.5);
		line3.setSmooth(true);
		line3.setStrokeLineCap(StrokeLineCap.ROUND);
		line3.setStartY(-240);
		line3.setStartX(140);
		line3.setEndY(0);
		line3.setEndX(140);

		Line line4=new Line();
		line4.setStroke(Color.PEACHPUFF);
		line4.setStrokeWidth(7.5);
		line4.setStrokeLineCap(StrokeLineCap.ROUND);
		line4.setSmooth(true);
		line4.setStartY(-240);
		line4.setStartX(200);
		line4.setEndY(0);
		line4.setEndX(200);

		Line line5=new Line();
		line5.setStroke(Color.PEACHPUFF);
		line5.setStrokeWidth(7.5);
		line5.setStrokeLineCap(StrokeLineCap.ROUND);
		line5.setSmooth(true);
		line5.setStartY(110);
		line5.setStartX(-320);
		line5.setEndY(110);
		line5.setEndX(-5);

		Line line6=new Line();
		line6.setStroke(Color.PEACHPUFF);
		line6.setStrokeWidth(7.5);
		line6.setStrokeLineCap(StrokeLineCap.ROUND);
		line6.setSmooth(true);
		line6.setStartY(70);
		line6.setStartX(-320);
		line6.setEndY(70);
		line6.setEndX(-5);

		Line line7=new Line();
		line7.setStroke(Color.PEACHPUFF);
		line7.setStrokeWidth(7.5);
		line7.setStrokeLineCap(StrokeLineCap.ROUND);
		line7.setSmooth(true);
		line7.setStartY(152);
		line7.setStartX(-320);
		line7.setEndY(152);
		line7.setEndX(-5);

		choice1.getItems().setAll("BLUE","WHITE");
		choice1.setValue("BLUE");

		choice2.getItems().setAll("RED","GREEN");
		choice2.setValue("RED");


		choice1.getSelectionModel().selectedItemProperty().addListener((observable,oldValue,newValue)->{ check_colour_1 =! check_colour_1;});

		choice2.getSelectionModel().selectedItemProperty().addListener((observable,oldValue,newValue)->{check_colour_2=!check_colour_2;});

		resetgamebutton.setOnAction(event ->
		{

			resetgame(circle1,circle2,circle3,circle4,circle5,circle6,circle7,circle8,circle9,line,line1,line2,line3,line4,line5,line6,line7);
			is_player_one_chance=true;

		});







		b1.setOnAction(event ->{
			if((circle1.getTranslateX()!=235)&&(circle1.getTranslateY()!=200)) {
				is_player_one_chance=!is_player_one_chance;
				animate1(circle1);
				checkwin(circle1, circle2, circle3, circle4, circle5, circle6, circle7, circle8, circle9,line,line1,line2,line3,line4,line5,line6,line7);

			}else{
				dontcheat();
			}


		});
		b2.setOnAction(event -> {

			if((circle2.getTranslateX()!=340)&&(circle2.getTranslateY()!=200)) {
				is_player_one_chance=!is_player_one_chance;
				animate2(circle2);
				checkwin(circle1, circle2, circle3, circle4, circle5, circle6, circle7, circle8, circle9,line,line1,line2,line3,line4,line5,line6,line7);

			}else {
				dontcheat();
			}
		});
		b3.setOnAction(event -> {
			is_player_one_chance=!is_player_one_chance;
			if((circle3.getTranslateX()!=450)&&(circle3.getTranslateY()!=200)) {
				animate3(circle3);
				checkwin(circle1, circle2, circle3, circle4, circle5, circle6, circle7, circle8, circle9,line,line1,line2,line3,line4,line5,line6,line7);


			}else {
				dontcheat();
			}
		});
		b4.setOnAction(event ->{
			if((circle4.getTranslateX()!=235)&&(circle4.getTranslateY()!=280)) {
				is_player_one_chance=!is_player_one_chance;
				animate4(circle4);
				checkwin(circle1, circle2, circle3, circle4, circle5, circle6, circle7, circle8, circle9,line,line1,line2,line3,line4,line5,line6,line7);

			}else {
				dontcheat();
			}
		});
		b5.setOnAction(event -> {

			if ((circle5.getTranslateX()!=340)&&(circle5.getTranslateY()!=280)) {
				is_player_one_chance=!is_player_one_chance;

				animate5(circle5);
				checkwin(circle1, circle2, circle3, circle4, circle5, circle6, circle7, circle8, circle9,line,line1,line2,line3,line4,line5,line6,line7);
			}else {
				dontcheat();
			}
		});
		b6.setOnAction(event -> {

			if ((circle6.getTranslateX()!=450)&&(circle6.getTranslateY()!=280)) {
				is_player_one_chance=!is_player_one_chance;

				animate6(circle6);
				checkwin(circle1, circle2, circle3, circle4, circle5, circle6, circle7, circle8, circle9,line,line1,line2,line3,line4,line5,line6,line7);
			}else {
				dontcheat();
			}
		});
		b7.setOnAction(event -> {
			if ((circle7.getTranslateX()!=235)&&(circle7.getTranslateY()!=365)) {
				is_player_one_chance=!is_player_one_chance;
				animate7(circle7);
				checkwin(circle1, circle2, circle3, circle4, circle5, circle6, circle7, circle8, circle9,line,line1,line2,line3,line4,line5,line6,line7);

			}else {
				dontcheat();
			}
		});
		b8.setOnAction(event -> {
			if ((circle8.getTranslateX()!=340)&&(circle8.getTranslateY()!=365)) {
				is_player_one_chance=!is_player_one_chance;
				animate8(circle8);
				checkwin(circle1, circle2, circle3, circle4, circle5, circle6, circle7, circle8, circle9,line,line1,line2,line3,line4,line5,line6,line7);

			}else {
				dontcheat();
			}

		});
		b9.setOnAction(event -> {
			is_player_one_chance=!is_player_one_chance;
			if ((circle9.getTranslateX()!=450)&&(circle9.getTranslateY()!=365)) {

				animate9(circle9);
				checkwin(circle1, circle2, circle3, circle4, circle5, circle6, circle7, circle8, circle9,line,line1,line2,line3,line4,line5,line6,line7);
			}else {
				dontcheat();
			}

		});


		panepane1.getChildren().addAll(circle2,circle1,circle3,circle4,circle5,circle6,circle7,circle8,circle9,line,line1,line2,line3,line4,line5,line6,line7);

		}



	private void resetgame(Circle circle1, Circle circle2,Circle circle3,Circle circle4,Circle circle5,Circle circle6,Circle circle7,Circle circle8,Circle circle9,Line line,Line line1,Line line2,Line line3, Line line4,Line line5,Line line6,Line line7){

		TranslateTransition translateTransition=new TranslateTransition();
		translateTransition.setNode(circle1);
		translateTransition.setDuration(Duration.millis(0.1));
		translateTransition.setToY(-60);
		translateTransition.setToX(-60);
		translateTransition.play();
		circle1.setFill(Color.DARKBLUE);


		TranslateTransition translateTransition1=new TranslateTransition();
		translateTransition1.setNode(circle2);
		translateTransition1.setDuration(Duration.millis(0.1));
		translateTransition1.setToY(-60);
		translateTransition1.setToX(-60);
		translateTransition1.play();
		circle2.setFill(Color.GRAY);

		TranslateTransition translateTransition2=new TranslateTransition();
		translateTransition2.setNode(circle3);
		translateTransition2.setDuration(Duration.millis(0.1));
		translateTransition2.setToY(-60);
		translateTransition2.setToX(-60);
		translateTransition2.play();
		circle3.setFill(Color.KHAKI);

		TranslateTransition translateTransition3=new TranslateTransition();
		translateTransition3.setNode(circle4);
		translateTransition3.setDuration(Duration.millis(0.1));
		translateTransition3.setToY(-60);
		translateTransition3.setToX(-60);
		translateTransition3.play();
		circle4.setFill(Color.PEACHPUFF);

		TranslateTransition translateTransition4=new TranslateTransition();
		translateTransition4.setNode(circle5);
		translateTransition4.setDuration(Duration.millis(0.1));
		translateTransition4.setToY(-60);
		translateTransition4.setToX(-60);
		translateTransition4.play();
		circle5.setFill(Color.TEAL);

		TranslateTransition translateTransition5=new TranslateTransition();
		translateTransition5.setNode(circle6);
		translateTransition5.setDuration(Duration.millis(0.1));
		translateTransition5.setToY(-60);
		translateTransition5.setToX(-60);
		translateTransition5.play();
		circle6.setFill(Color.AZURE);

		TranslateTransition translateTransition6=new TranslateTransition();
		translateTransition6.setNode(circle7);
		translateTransition6.setDuration(Duration.millis(0.1));
		translateTransition6.setToY(-60);
		translateTransition6.setToX(-60);
		translateTransition6.play();
		circle7.setFill(Color.CADETBLUE);

		TranslateTransition translateTransition7=new TranslateTransition();
		translateTransition7.setNode(circle8);
		translateTransition7.setDuration(Duration.millis(0.1));
		translateTransition7.setToY(-60);
		translateTransition7.setToX(-60);
		translateTransition7.play();
		circle8.setFill(Color.ROSYBROWN);

		TranslateTransition translateTransition8=new TranslateTransition();
		translateTransition8.setNode(circle9);
		translateTransition8.setDuration(Duration.millis(0.1));
		translateTransition8.setToY(-60);
		translateTransition8.setToX(-60);
		translateTransition8.play();
		circle9.setFill(Color.CORNSILK);

		TranslateTransition translateTransition9=new TranslateTransition();
		translateTransition9.setNode(line);
		translateTransition9.setDuration(Duration.millis(0.1));
		translateTransition9.setToY(-180);
		translateTransition9.setToX(-140);
		translateTransition9.play();

		TranslateTransition translateTransition10=new TranslateTransition();
		translateTransition10.setNode(line1);
		translateTransition10.setDuration(Duration.millis(0.1));
		translateTransition10.setToY(-175);
		translateTransition10.setToX(295);
		translateTransition10.play();

		TranslateTransition translateTransition11=new TranslateTransition();
		translateTransition11.setNode(line2);
		translateTransition11.setDuration(Duration.millis(0.1));
		translateTransition11.setToY(-240);
		translateTransition11.setToX(87);
		translateTransition11.play();

		TranslateTransition translateTransition12=new TranslateTransition();
		translateTransition12.setNode(line3);
		translateTransition12.setDuration(Duration.millis(0.1));
		translateTransition12.setToY(-240);
		translateTransition12.setToX(140);
		translateTransition12.play();

		TranslateTransition translateTransition13=new TranslateTransition();
		translateTransition13.setNode(line4);
		translateTransition13.setDuration(Duration.millis(0.1));
		translateTransition13.setToY(-240);
		translateTransition13.setToX(200);
		translateTransition13.play();

		TranslateTransition translateTransition14=new TranslateTransition();
		translateTransition14.setNode(line5);
		translateTransition14.setDuration(Duration.millis(0.1));
		translateTransition14.setToY(110);
		translateTransition14.setToX(-320);
		translateTransition14.play();

		TranslateTransition translateTransition15=new TranslateTransition();
		translateTransition15.setNode(line6);
		translateTransition15.setDuration(Duration.millis(0.1));
		translateTransition15.setToY(70);
		translateTransition15.setToX(-320);
		translateTransition15.play();

		TranslateTransition translateTransition16=new TranslateTransition();
		translateTransition16.setNode(line7);
		translateTransition16.setDuration(Duration.millis(0.1));
		translateTransition16.setToY(152);
		translateTransition16.setToX(-320);
		translateTransition16.play();


	}


	private void dontcheat() {
	   Alert alert=new Alert(Alert.AlertType.WARNING);
	   alert.setTitle("TIC-TAC-TOE");
	   alert.setHeaderText(null);
	   alert.setContentText("Please fill in other empty space");
	   alert.show();
	}


	private void checkwin(Circle circle1, Circle circle2,Circle circle3,Circle circle4,Circle circle5,
	                      Circle circle6,Circle circle7,Circle circle8,Circle circle9,Line line,Line line1,Line line2,Line line3, Line line4,Line line5,Line line6,Line line7) {
		//this are horizontal checks

         if((circle1.getFill()==circle2.getFill())&&(circle1.getFill()==circle3.getFill())){
	         TranslateTransition translateTransition1=new TranslateTransition();
	         translateTransition1.setNode(line6);
	         translateTransition1.setDuration(Duration.millis(0.1));
	         translateTransition1.setToY(70);
	         translateTransition1.setToX(448);
	         translateTransition1.play();

	         if(!is_player_one_chance){
	         	Alert alert=new Alert(Alert.AlertType.INFORMATION);
	         	alert.setTitle("TIC-TAC-TOE");
	         	alert.setHeaderText("RESULT");
	         	alert.setContentText("The winner is: "+ name1.getText());
	         	alert.show();


	         }else {
		         Alert alert=new Alert(Alert.AlertType.INFORMATION);
		         alert.setTitle("TIC-TAC-TOE");
		         alert.setHeaderText("RESULT");
		         alert.setContentText("The winner is: "+ name2.getText());
		         alert.show();

	         }


         }else if((circle4.getFill()==circle5.getFill())&&(circle4.getFill()==circle6.getFill())){
	         TranslateTransition translateTransition1=new TranslateTransition();
	         translateTransition1.setNode(line5);
	         translateTransition1.setDuration(Duration.millis(0.1));
	         translateTransition1.setToY(110);
	         translateTransition1.setToX(448);
	         translateTransition1.play();

	         if(!is_player_one_chance){
		         Alert alert=new Alert(Alert.AlertType.INFORMATION);
		         alert.setTitle("TIC-TAC-TOE");
		         alert.setHeaderText("RESULT");
		         alert.setContentText("The winner is: "+ name1.getText());
		         alert.show();
	         }else {
		         Alert alert=new Alert(Alert.AlertType.INFORMATION);
		         alert.setTitle("TIC-TAC-TOE");
		         alert.setHeaderText("RESULT");
		         alert.setContentText("The winner is: "+ name2.getText());
		         alert.show();

	         }



         }else if ((circle7.getFill()==circle8.getFill())&&(circle7.getFill()==circle9.getFill())){
	         TranslateTransition translateTransition1=new TranslateTransition();
	         translateTransition1.setNode(line7);
	         translateTransition1.setDuration(Duration.millis(0.1));
	         translateTransition1.setToY(152);
	         translateTransition1.setToX(448);
	         translateTransition1.play();
	         if(!is_player_one_chance){
		         Alert alert=new Alert(Alert.AlertType.INFORMATION);
		         alert.setTitle("TIC-TAC-TOE");
		         alert.setHeaderText("RESULT");
		         alert.setContentText("The winner is: "+ name1.getText());
		         alert.show();
	         }else {
		         Alert alert=new Alert(Alert.AlertType.INFORMATION);
		         alert.setTitle("TIC-TAC-TOE");
		         alert.setHeaderText("RESULT");
		         alert.setContentText("The winner is: "+ name2.getText());
		         alert.show();

	         }

         }
         //this are vertical checks
         else if ((circle1.getFill()==circle4.getFill())&&(circle7.getFill()==circle1.getFill())){
	         TranslateTransition translateTransition1=new TranslateTransition();
	         translateTransition1.setNode(line2);
	         translateTransition1.setDuration(Duration.millis(0.1));
	         translateTransition1.setToY(342.5);
	         translateTransition1.setToX(87);
	         translateTransition1.play();

	         if(!is_player_one_chance){
		         Alert alert=new Alert(Alert.AlertType.INFORMATION);
		         alert.setTitle("TIC-TAC-TOE");
		         alert.setHeaderText("RESULT");
		         alert.setContentText("The winner is: "+ name1.getText());
		         alert.show();
	         }else {
		         Alert alert=new Alert(Alert.AlertType.INFORMATION);
		         alert.setTitle("TIC-TAC-TOE");
		         alert.setHeaderText("RESULT");
		         alert.setContentText("The winner is: "+ name2.getText());
		         alert.show();

	         }

         }else if ((circle2.getFill()==circle5.getFill())&&(circle2.getFill()==circle8.getFill())){
	         TranslateTransition translateTransition1=new TranslateTransition();
	         translateTransition1.setNode(line3);
	         translateTransition1.setDuration(Duration.millis(0.1));
	         translateTransition1.setToY(342.5);
	         translateTransition1.setToX(140);
	         translateTransition1.play();

	         if(!is_player_one_chance){
		         Alert alert=new Alert(Alert.AlertType.INFORMATION);
		         alert.setTitle("TIC-TAC-TOE");
		         alert.setHeaderText("RESULT");
		         alert.setContentText("The winner is: "+ name1.getText());
		         alert.show();
	         }else {
		         Alert alert=new Alert(Alert.AlertType.INFORMATION);
		         alert.setTitle("TIC-TAC-TOE");
		         alert.setHeaderText("RESULT");
		         alert.setContentText("The winner is: "+ name2.getText());
		         alert.show();

	         }

         }else if ((circle3.getFill()==circle6.getFill())&&(circle3.getFill()==circle9.getFill())){
	         TranslateTransition translateTransition1=new TranslateTransition();
	         translateTransition1.setNode(line4);
	         translateTransition1.setDuration(Duration.millis(0.1));
	         translateTransition1.setToY(342.5);
	         translateTransition1.setToX(190);
	         translateTransition1.play();

	         if(!is_player_one_chance){
		         Alert alert=new Alert(Alert.AlertType.INFORMATION);
		         alert.setTitle("TIC-TAC-TOE");
		         alert.setHeaderText("RESULT");
		         alert.setContentText("The winner is: "+ name1.getText());
		         alert.show();
	         }else {
		         Alert alert=new Alert(Alert.AlertType.INFORMATION);
		         alert.setTitle("TIC-TAC-TOE");
		         alert.setHeaderText("RESULT");
		         alert.setContentText("The winner is: "+ name2.getText());
		         alert.show();

	         }

         }
         //diagonal checks
		else if ((circle1.getFill()==circle5.getFill())&&(circle1.getFill()==circle9.getFill())){

	         TranslateTransition translateTransition1=new TranslateTransition();
	         translateTransition1.setDuration(Duration.millis(1));
	         translateTransition1.setNode(line);
	         translateTransition1.setToX(315);
	         translateTransition1.setToY(315);
	         translateTransition1.play();

	         if(!is_player_one_chance){
		         Alert alert=new Alert(Alert.AlertType.INFORMATION);
		         alert.setTitle("TIC-TAC-TOE");
		         alert.setHeaderText("RESULT");
		         alert.setContentText("The winner is: "+ name1.getText());
		         alert.show();
	         }else {
		         Alert alert=new Alert(Alert.AlertType.INFORMATION);
		         alert.setTitle("TIC-TAC-TOE");
		         alert.setHeaderText("RESULT");
		         alert.setContentText("The winner is: "+ name2.getText());
		         alert.show();
	         }
         }
		else if ((circle3.getFill()==circle5.getFill())&&(circle3.getFill()==circle7.getFill())){

	         TranslateTransition translateTransition2=new TranslateTransition();
	         translateTransition2.setDuration(Duration.millis(1));
	         translateTransition2.setNode(line1);
	         translateTransition2.setToX(100);
	         translateTransition2.setToY(315);
	         translateTransition2.play();

	         if(!is_player_one_chance){
		         Alert alert=new Alert(Alert.AlertType.INFORMATION);
		         alert.setTitle("TIC-TAC-TOE");
		         alert.setHeaderText("RESULT");
		         alert.setContentText("The winner is: "+ name1.getText());
		         alert.show();
	         }else {
		         Alert alert=new Alert(Alert.AlertType.INFORMATION);
		         alert.setTitle("TIC-TAC-TOE");
		         alert.setHeaderText("RESULT");
		         alert.setContentText("The winner is: "+ name2.getText());
		         alert.show();

	         }
         }

	}


	private void animate9 (Circle circle9) {

		if(is_player_one_chance){
			if(check_colour_2){
				circle9.setFill(Color.RED);
			}else {
				circle9.setFill(Color.GREEN);
			}
		}
		else {
			if(check_colour_1){
				circle9.setFill(Color.BLUE);
			}else {
				circle9.setFill(Color.WHITE);
			}
		}
		TranslateTransition translateTransition=new TranslateTransition();
		translateTransition.setNode(circle9);
		translateTransition.setDuration(Duration.millis(0.1));
		translateTransition.setToY(365);
		translateTransition.setToX(450);
		translateTransition.play();


	}

	private void animate8(Circle circle8) {


		if(is_player_one_chance){
			if(check_colour_2){
				circle8.setFill(Color.RED);
			}else {
				circle8.setFill(Color.GREEN);
			}
		}
		else {
			if(check_colour_1){
				circle8.setFill(Color.BLUE);
			}else {
				circle8.setFill(Color.WHITE);
			}
		}

		TranslateTransition translateTransition=new TranslateTransition();
		translateTransition.setNode(circle8);
		translateTransition.setDuration(Duration.millis(0.1));
		translateTransition.setToY(365);
		translateTransition.setToX(340);
		translateTransition.play();

	}

	private void animate7(Circle circle7) {

		if(is_player_one_chance){
			if(check_colour_2){
				circle7.setFill(Color.RED);
			}else {
				circle7.setFill(Color.GREEN);
			}
		}
		else {
			if(check_colour_1){
				circle7.setFill(Color.BLUE);
			}else {
				circle7.setFill(Color.WHITE);
			}
		}

		TranslateTransition translateTransition=new TranslateTransition();
		translateTransition.setNode(circle7);
		translateTransition.setDuration(Duration.millis(0.1));
		translateTransition.setToY(365);
		translateTransition.setToX(235);
		translateTransition.play();

	}

	private void animate6(Circle circle6) {

		if(is_player_one_chance){
			if(check_colour_2){
				circle6.setFill(Color.RED);
			}else {
				circle6.setFill(Color.GREEN);
			}
		}
		else {
			if(check_colour_1){
				circle6.setFill(Color.BLUE);
			}else {
				circle6.setFill(Color.WHITE);
			}
		}
		TranslateTransition translateTransition=new TranslateTransition();
		translateTransition.setNode(circle6);
		translateTransition.setDuration(Duration.millis(0.1));
		translateTransition.setToY(280);
		translateTransition.setToX(450);
		translateTransition.play();
	}

	private void animate5(Circle circle5) {

		if(is_player_one_chance){
			if(check_colour_2){
				circle5.setFill(Color.RED);
			}else {
				circle5.setFill(Color.GREEN);
			}
		}
		else {
			if(check_colour_1){
				circle5.setFill(Color.BLUE);
			}else {
				circle5.setFill(Color.WHITE);
			}
		}

		TranslateTransition translateTransition=new TranslateTransition();
		translateTransition.setNode(circle5);
		translateTransition.setDuration(Duration.millis(0.1));
		translateTransition.setToY(280);
		translateTransition.setToX(340);
		translateTransition.play();

	}

	private void animate4(Circle circle4) {

		if(is_player_one_chance){
			if(check_colour_2){
				circle4.setFill(Color.RED);
			}else {
				circle4.setFill(Color.GREEN);
			}
		}
		else {
			if(check_colour_1){
				circle4.setFill(Color.BLUE);
			}else {
				circle4.setFill(Color.WHITE);
			}
		}


		TranslateTransition translateTransition=new TranslateTransition();
		translateTransition.setNode(circle4);
		translateTransition.setDuration(Duration.millis(0.1));
		translateTransition.setToY(280);
		translateTransition.setToX(235);
		translateTransition.play();

	}

	private void animate3(Circle circle3) {

		if(is_player_one_chance){
			if(check_colour_2){
				circle3.setFill(Color.RED);
			}else {
				circle3.setFill(Color.GREEN);
			}
		}
		else {
			if(check_colour_1){
				circle3.setFill(Color.BLUE);
			}else {
				circle3.setFill(Color.WHITE);
			}
		}


		TranslateTransition translateTransition=new TranslateTransition();
		translateTransition.setNode(circle3);
		translateTransition.setDuration(Duration.millis(0.1));
		translateTransition.setToY(200);
		translateTransition.setToX(450);
		translateTransition.play();

	}

	private void animate2(Circle circle2) {

		if(is_player_one_chance){
			if(check_colour_2){
				circle2.setFill(Color.RED);
			}else {
				circle2.setFill(Color.GREEN);
			}
		}
		else {
			if(check_colour_1){
				circle2.setFill(Color.BLUE);
			}else {
				circle2.setFill(Color.WHITE);
			}
		}

		TranslateTransition translateTransition=new TranslateTransition();
		translateTransition.setNode(circle2);
		translateTransition.setDuration(Duration.millis(0.1));
		translateTransition.setToY(200);
		translateTransition.setToX(340);
		translateTransition.play();

	}

	private void animate1(Circle circle1) {

		if(is_player_one_chance){
			if(check_colour_2){
				circle1.setFill(Color.RED);
			}else {
				circle1.setFill(Color.GREEN);
			}
		}
		else {
			if(check_colour_1){
				circle1.setFill(Color.BLUE);
			}else {
				circle1.setFill(Color.WHITE);
			}
		}


		TranslateTransition translateTransition=new TranslateTransition();
		translateTransition.setNode(circle1);
		translateTransition.setDuration(Duration.millis(0.1));
		translateTransition.setToY(200);
		translateTransition.setToX(235);
		translateTransition.play();

	}

}






