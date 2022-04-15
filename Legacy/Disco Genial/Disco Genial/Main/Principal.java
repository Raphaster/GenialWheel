package Main;
import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import java.util.Random;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene; 
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;  

public class Principal extends Application {  
   @Override 
   public void start(Stage stage) throws FileNotFoundException {  
	  //Valor aleatório entre 0 e 360
	  Random randomGenerator = new Random();
	  int randomInt = randomGenerator.nextInt(360) + 1;
	  
	  //Carrega a Imagem "fundo"
      Image imagem0 = new Image(new FileInputStream("./Recursos/fundo.png"));  
      ImageView discoGenial = new ImageView(imagem0); 
      discoGenial.setX(0); 
      discoGenial.setY(0); 
      discoGenial.setFitHeight(700); 
      discoGenial.setFitWidth(700); 
      discoGenial.setPreserveRatio(true); 
	  
      //Carrega a Imagem "ExternoMenor"
      
      Image imagem1 = new Image(new FileInputStream("./Recursos/externoMenor.png"));  
      ImageView externoMenor = new ImageView(imagem1); 
      externoMenor.setX(-3); 
      externoMenor.setY(40); 
      externoMenor.setFitHeight(700); 
      externoMenor.setFitWidth(700); 
      externoMenor.setPreserveRatio(true); 
      
      //Carrega a Imagem "ExternoMaior"
      
      Image imagem2 = new Image(new FileInputStream("./Recursos/externoMaior.png"));  
      ImageView externoMaior = new ImageView(imagem2); 
      externoMaior.setX(-3); 
      externoMaior.setY(40); 
      externoMaior.setFitHeight(700); 
      externoMaior.setFitWidth(700); 
      externoMaior.setPreserveRatio(true); 
      
	  //Carrega a Imagem "InternoMaior"
      Image imagem3 = new Image(new FileInputStream("./Recursos/internoMaior.png"));  
      ImageView internoMaior = new ImageView(imagem3); 
      internoMaior.setX(109); 
      internoMaior.setY(190); 
      internoMaior.setFitHeight(400); 
      internoMaior.setFitWidth(400); 
      internoMaior.setPreserveRatio(true);  
      
      //Carrega a Imagem "InternoMenor"
      Image imagem4 = new Image(new FileInputStream("./Recursos/internoMenor.png"));  
      ImageView internoMenor = new ImageView(imagem4); 
      internoMenor.setX(184); 
      internoMenor.setY(265); 
      internoMenor.setFitHeight(250); 
      internoMenor.setFitWidth(250); 
      internoMenor.setPreserveRatio(true); 
      
      //Carrega a Imagem "fatorEstrutural"
      Image imagem5 = new Image(new FileInputStream("./Recursos/fatorEstrutural.png"));  
      ImageView fatorEstrutural = new ImageView(imagem5); 
      fatorEstrutural.setX(625.0f); 
      fatorEstrutural.setY(250.f); 
      fatorEstrutural.setFitHeight(115); 
      fatorEstrutural.setFitWidth(115); 
      fatorEstrutural.setPreserveRatio(true);
      
      //Carrega a Imagem "fatorEstrutural2"
      Image imagem6 = new Image(new FileInputStream("./Recursos/fatorEstrutural2.png"));  
      ImageView fatorEstrutural2 = new ImageView(imagem6); 
      fatorEstrutural2.setX(625.0f); 
      fatorEstrutural2.setY(325.f); 
      fatorEstrutural2.setFitHeight(115); 
      fatorEstrutural2.setFitWidth(115); 
      fatorEstrutural2.setPreserveRatio(true);
      
      //Carrega a Imagem "perguntaQualificante"
      Image imagem7 = new Image(new FileInputStream("./Recursos/perguntaQualificante.png"));  
      ImageView perguntaQualificante = new ImageView(imagem7); 
      perguntaQualificante.setX(625.0f); 
      perguntaQualificante.setY(400.f); 
      perguntaQualificante.setFitHeight(115); 
      perguntaQualificante.setFitWidth(115); 
      perguntaQualificante.setPreserveRatio(true);
      
      //Carrega a Imagem "perguntaTécnica"
      Image imagem8 = new Image(new FileInputStream("./Recursos/perguntaTecnica.png"));  
      ImageView perguntaTecnica = new ImageView(imagem8); 
      perguntaTecnica.setX(625.0f); 
      perguntaTecnica.setY(475.f); 
      perguntaTecnica.setFitHeight(115); 
      perguntaTecnica.setFitWidth(115); 
      perguntaTecnica.setPreserveRatio(true);
      
      //Carrega a Imagem "randomico"
      Image imagem9 = new Image(new FileInputStream("./Recursos/randomico.png"));  
      ImageView randomico = new ImageView(imagem9); 
      randomico.setX(625.0f); 
      randomico.setY(550.f); 
      randomico.setFitHeight(115); 
      randomico.setFitWidth(115); 
      randomico.setPreserveRatio(true);
      
      //Prepara as Rotações
      RotateTransition rotateInternoMaior = new RotateTransition(); 
      rotateInternoMaior.setDuration(Duration.millis(1000)); 
      rotateInternoMaior.setNode(internoMaior);       
      rotateInternoMaior.setByAngle(randomInt); 
      rotateInternoMaior.setAutoReverse(false); 
      
      RotateTransition rotateInternoMenor = new RotateTransition(); 
      rotateInternoMenor.setDuration(Duration.millis(1000)); 
      rotateInternoMenor.setNode(internoMenor);       
      rotateInternoMenor.setByAngle(randomInt); 
      rotateInternoMenor.setAutoReverse(false);
      
      RotateTransition rotateExternoMaior = new RotateTransition(); 
      rotateExternoMaior.setDuration(Duration.millis(1000)); 
      rotateExternoMaior.setNode(externoMaior);       
      rotateExternoMaior.setByAngle(randomInt); 
      rotateExternoMaior.setAutoReverse(false);
      
      RotateTransition rotateExternoMenor = new RotateTransition(); 
      rotateExternoMenor.setDuration(Duration.millis(1000)); 
      rotateExternoMenor.setNode(externoMenor);       
      rotateExternoMenor.setByAngle(randomInt); 
      rotateExternoMenor.setAutoReverse(false);
      
      EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() { 
         @Override 
         public void handle(MouseEvent e) { 
       	  Random randomGenerator = new Random();
       	  int randomInt = randomGenerator.nextInt(360) + 1;
       	  rotateInternoMaior.setByAngle(- 360 - randomInt);
       	  rotateInternoMaior.play();
         } 
      };  
      perguntaQualificante.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
      
      EventHandler<MouseEvent> eventHandler2 = new EventHandler<MouseEvent>() { 
         @Override 
         public void handle(MouseEvent e) { 
       	  Random randomGenerator = new Random();
       	  int randomInt = randomGenerator.nextInt(360) + 1;
       	  rotateInternoMenor.setByAngle(360 + randomInt);
       	  rotateInternoMenor.play();
         } 
      };  
      perguntaTecnica.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler2);
      
      EventHandler<MouseEvent> eventHandler3 = new EventHandler<MouseEvent>() { 
          @Override 
          public void handle(MouseEvent e) { 
        	  Random randomGenerator = new Random();
        	  int randomInt = randomGenerator.nextInt(360) + 1;
        	  rotateExternoMenor.setByAngle(360 + randomInt);
        	  rotateExternoMenor.play();
          } 
       };  
       fatorEstrutural2.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler3);
       
       EventHandler<MouseEvent> eventHandler4 = new EventHandler<MouseEvent>() { 
           @Override 
           public void handle(MouseEvent e) { 
         	  Random randomGenerator = new Random();
         	  int randomInt = randomGenerator.nextInt(360) + 1;
         	  rotateExternoMaior.setByAngle(- 360 - randomInt);
         	  rotateExternoMaior.play();
           } 
        };  
        fatorEstrutural.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler4);
        
        randomico.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
        randomico.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler2);
        randomico.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler3);
        randomico.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler4);
      
      //Exibição
      Group root = new Group();  
      ObservableList<Node> list = root.getChildren(); 
      list.add(discoGenial);
      list.add(externoMaior);
      list.add(externoMenor);
      list.add(internoMaior);
      list.add(internoMenor);
      list.add(perguntaQualificante);
      list.add(perguntaTecnica);
      list.add(fatorEstrutural2);
      list.add(fatorEstrutural);
      list.add(randomico);
      Scene scene = new Scene(root, 750, 700);  
      stage.setTitle("Disco Genial");  
      stage.setScene(scene);
      stage.show();
   }  
   public static void main(String args[]) { 
      launch(args); 
   } 
}