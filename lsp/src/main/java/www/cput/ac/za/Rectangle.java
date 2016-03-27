package www.cput.ac.za;

/**
 * Created by Adeebo on 2016/03/27.
 */
public class Rectangle {

    protected int Width;
    protected int Height;

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public int getArea(){
        return Width * Height;
    }
}
