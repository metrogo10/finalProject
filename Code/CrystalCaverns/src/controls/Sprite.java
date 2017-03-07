package controls;
import javafx.scene.image.Image;
import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;

import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
public class Sprite
{
    private Image image;
    private double posX;
    private double posY;
    private double spdX;
    private double spdY;
    private double width;
    private double height;
    public void setImage(Image i)
    {
        image = i;
        width = i.getWidth();
        height = i.getHeight();
    }
    public void setImage(String filename)
    {
        Image i = new Image(filename);
        setImage(i);
    }
    public void setPosition(double x, double y)
    {
        posX = x;
        posY = y;
    }
    public void setVelocity(double x, double y)
    {
        spdX = x;
        spdY = y;
    }
    public void addVelocity(double x, double y)
    {
        spdX += x;
        spdY += y;
    }
    public void update(double time)
    {
        posX += spdX * time;
        posY += spdY * time;
    }
    public void render(GraphicsContext gc)
    {
        gc.drawImage( image, posX, posY );
    }
    public Rectangle2D getBoundary()
    {
        return new Rectangle2D(posX,posY,width,height);
    }
    public boolean intersects(Sprite s)
    {
        return s.getBoundary().intersects( this.getBoundary() );
    }
}