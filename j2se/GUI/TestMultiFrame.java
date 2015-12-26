import java.awt.*;

public class TestMultiFrame {
    public static void main(String args[]) {
        MyFrame f1 = 
            new MyFrame(100,100,200,200,Color.BLUE);
        MyFrame f2 = 
            new MyFrame(300,100,200,200,Color.YELLOW);
        MyFrame f3 = 
            new MyFrame(100,300,200,200,Color.GREEN);
        MyFrame f4 = 
            new MyFrame(300,300,200,200,Color.MAGENTA);
    }
}




class MyFrame extends Frame{
    static int id = 0;
    MyFrame(int x,int y,int w,int h,Color color){
        super("MyFrame " + (++id));
        setBackground(color);
        setLayout(null);
        setBounds(x,y,w,h);
        setVisible(true);
    }
}
