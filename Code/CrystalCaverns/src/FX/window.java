package FX;
import java.util.ArrayList;
import Characters.Player;
import Math.LongValue;
import controls.Sprite;
import controls.gameEngine;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import scenery.Ceiling;
import scenery.floor;
import scenery.wallL;
import scenery.wallR;
public class window extends Application
{
	private gameEngine G = new gameEngine();
	private floor f = new floor();
	private wallL wl= new wallL();
	private wallR wr= new wallR();
	private Ceiling c= new Ceiling();
	public static void main(String[] args)
    {
        launch(args);
    }
	public void start(Stage theStage)
	{
        theStage.setTitle("CRYSTAL CAVERNS");
        Group root = new Group();
        Scene theScene = new Scene( root );
        theStage.setScene( theScene );
        Canvas canvas = new Canvas( 512, 512 );
        root.getChildren().add( canvas );
        //
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.drawImage(G.getP().getImage(), 0, 0);
        gc.drawImage(f.getImage(), 0, 0);
        //
        G.getP().setPosition(34, 400);
        ArrayList<String> input = new ArrayList<String>();
        theScene.setOnKeyPressed
        (
        new EventHandler<KeyEvent>()
    	{
       		public void handle(KeyEvent e)
                {
                    String code = e.getCode().toString();
                    if ( !input.contains(code) )
                    {
                    	input.add( code );
                    }
                }
            }
        );
        theScene.setOnKeyReleased
        (
            new EventHandler<KeyEvent>()
            {
                public void handle(KeyEvent e)
                {
                    String code = e.getCode().toString();
                    input.remove( code );
                }
            }
        );
        LongValue lastNanoTime = new LongValue(System.nanoTime());
	        new AnimationTimer()
	        {
	        	  public void handle(long currentNanoTime)
	        	    {
	        	        double elapsedTime = (currentNanoTime - lastNanoTime.value) / 1000000000.0;
	        	        lastNanoTime.value = currentNanoTime;
	        	        G.getP().addVelocity(0,30);
	        	        if (input.contains("LEFT"))
	        	        {
	        	            G.getP().addVelocity(-30,0);
	        	        }
	        	        if (input.contains("RIGHT"))
	        	        {
	        	        	G.getP().addVelocity(30,0);
	        	        }
	        	        if (input.contains("DOWN"))
	        	        {
	        	        	G.getP().addVelocity(0,30);
	        	        }
	        	        if(G.getP().intersects(f))
	        	        {
	        	        	if(G.getP().getSpdY()>0)
	        	        	{
	        	        		G.getP().stopfall();
	        	        	}
		        	        if (input.contains("SPACE"))
		        	        {
		        	        	G.getP().addVelocity(0, -560);
		        	        }
	        	        }
	        	        if(G.getP().intersects(c))
	        	        {
	        	        	if(G.getP().getSpdY()<0)
	        	        	{
	        	        		G.getP().setSpdY(0);
	        	        	}
	        	        }
	        	        if(G.getP().intersects(wl))
	        	        {
	        	        	if(G.getP().getSpdX()<0)
	        	        	{
	        	        		G.getP().setSpdX(0);
	        	        	}
	        	        }
	        	        if(G.getP().intersects(wr))
	        	        {
	        	        	if(G.getP().getSpdX()>0)
	        	        	{
	        	        		G.getP().setSpdX(0);
	        	        	}
	        	        }
	        	        G.getP().update(elapsedTime);
	        	        wl.setPosition(0, 0);
	        	        wr.setPosition(480, 0);
	        	        c.setPosition(0, 0);
	        	        f.setPosY(480);
	        	        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
	        	        G.getP().render(gc);
	        	        wl.render(gc);
	        	        wr.render(gc);
	        	        c.render(gc);
	        	        f.render(gc);
	            }
	        }.start();
	        theStage.show();
	    }
	}