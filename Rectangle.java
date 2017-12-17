
/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle
{
    // instance variables - replace the example below with your own
    private int width;
    private int height;
    private int tmp;
    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle(int w, int h)
    {
        // initialise instance variables
        width = w;
        height = h;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    /**
    public int sampleMethod(int y)
    {
        // put your code here
        //return x + y;
    }*/
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
    public int getArea(){
        return width*height;
    }
    public int getPerimeter(){
        return 2*(width+height);
    }
    void flip(){
        tmp = width;
        width = height;
        height = tmp;
    }
}
