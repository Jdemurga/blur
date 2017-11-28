package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.application.Application;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;

public class Main extends Application {
	
	private Pane mypane;
	
	/**
	 * crea el Stage
	 */
	
    @Override
    public void start(Stage stage) throws IOException {
    
    	/**
    	 * carga el controlador y la vista fxml 
    	 */
    	
    	FXMLLoader loader = new FXMLLoader(
            getClass().getResource(
                "../view/forest.fxml"
            )
        );
    	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    	//loader.setController(new SetBlur());
        mypane = (Pane) loader.load();

        /**
         * titula y coloca la escena en el stage
         */
        stage.setTitle("Where's the squirrel?");
        stage.setScene(new Scene(mypane));
        stage.setX(screenSize.getWidth()/3);
        stage.setY(screenSize.getHeight()/3);
//        stage.centerOnScreen();
        stage.show();
    }
//   
//    /**
//     * la clase controladora que añade un efecto a la imagen
//     */
//    class SetBlur {
//    	
//    	@FXML
//        private ImageView imageView;       
//
///**
// * inicializa al igual que el constructor pero permite acceder al componente imageView ya creado en fxml
// */
//    	@FXML
//        public void initialize() {           
//                 imageView.setEffect(new GaussianBlur(10));
//        }
//    	
//    }
//   
    /**
     * arranca la aplicación
     * @param args
     */
    
    public static void main(String[] args) {
        launch(args);
    }
    
}