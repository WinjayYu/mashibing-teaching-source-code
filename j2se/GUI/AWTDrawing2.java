/*	范例名称：AWT 绘图举例
 * 	源文件名称：AWTDrawing2.java
 *	要  点：
 *		1. AWT组件绘图原理
 *		2. Graphics类及常用绘图方法
 */

import java.awt.*;

class SubPanel extends Panel{
	public void paint(Graphics g){
		g.drawString("this is a drawing test!",20,20);		
		g.drawLine(30,60,100,120);
		g.draw3DRect(60,50,70,30,false);
	}	
}
	
public class AWTDrawing2 {
    private Frame f = new Frame(" Hello Out There!");
    private SubPanel p = new SubPanel();
	public void launchFrame() {
	    f.add(p);
	    f.setSize(170,170);
	    f.setBackground( new Color(89,145,145));
	    f.setVisible( true); 
	}
	public static void main( String args[]) {
	    AWTDrawing2 guiWindow = new AWTDrawing2();
	    guiWindow.launchFrame();
    }
}