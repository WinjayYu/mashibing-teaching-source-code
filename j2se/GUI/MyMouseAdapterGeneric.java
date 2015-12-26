import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class MyMouseAdapterGeneric{
  public static void main(String args[]) {
    new MyFrame99("drawing...");
  }
}

class MyFrame99 extends Frame {
  ArrayList<Point> points = null;
  MyFrame99(String s) {
    super(s);
    points = new ArrayList<Point>(); 
    setLayout(null);
    setBounds(300,300,400,300); 
    this.setBackground(new Color(204,204,255));
    setVisible(true);
    this.addMouseListener(new Monitor());
	}
	
	public void paint(Graphics g) {
    Iterator<Point> i = points.iterator();
    while(i.hasNext()){
      Point p = i.next();
      g.setColor(Color.BLUE);
      g.fillOval(p.x,p.y,10,10);
    }
  }
  
  public void addPoint(Point p){
    points.add(p);
  }
}

class Monitor extends MouseAdapter {
  public void mousePressed(MouseEvent e) {
    MyFrame99 f = (MyFrame99)e.getSource();
    f.addPoint(new Point(e.getX(),e.getY()));
    f.repaint();
  }
}
