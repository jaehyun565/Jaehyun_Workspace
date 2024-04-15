package application;
	
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		
		Group root = new Group();
		Scene scene = new Scene(root, 600, 600, Color.LIGHTSKYBLUE);
		Image icon = new Image("mushroom.png");
		
		Rectangle rectangle = new Rectangle();
		rectangle.setFill(Color.BROWN);
		rectangle.setY(450);
		rectangle.setWidth(scene.getWidth());
		rectangle.setHeight(150);
		
		Image image = new Image("mushroom.png");
		ImageView imageView = new ImageView(image);
		imageView.setFitWidth(50);
		imageView.setFitHeight(50);
		imageView.setX(100);
		imageView.setY(400);
		
		Text text = new Text();
		text.setText("Mushroom Adventure");
		text.setX(130);
		text.setLayoutY(100);
		text.setFont(Font.font("verdana",30));
		text.setFill(Color.RED);
		
		root.getChildren().add(text);
		root.getChildren().add(rectangle);
		root.getChildren().add(imageView);
		stage.setTitle("demo program");
		stage.setScene(scene);
		stage.getIcons().add(icon);
		
		
		
		
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
