package controls;
import javax.swing.text.IconView;
import Math.LongValue;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;
public class Test extends Application
{
	public static void main(String[] args)
	{
		launch();
	}
	@Override
	public void start(Stage theStage) throws Exception
	{
		theStage.setTitle("CRYSTAL CAVERNS");
		theStage.setHeight(512);
		theStage.setWidth(512);
		Group root = new Group();
        Scene theScene = new Scene( root );
        theStage.setScene( theScene );
        Canvas canvas = new Canvas( 512, 512 );
        root.getChildren().add( canvas );
        ImageView i = new ImageView();
        Image l = new Image("/Pictures/MM.jpg");
        i.setImage(l);
        Duration d = new Duration(800);
        SpriteAnimation S= new SpriteAnimation(i, d, 8, 4, 0, 0, 310, 377);
        S.setCycleCount(S.INDEFINITE);
        S.play();
        root.getChildren().add(i);
        theStage.show();
	}
}