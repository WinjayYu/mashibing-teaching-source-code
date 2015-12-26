/*	范例名称：内部类在事件处理中的使用
 * 	源文件名称：TestInner.java
 *	要  点：
 *  	1. 内部类的性质和用法
 *		2. 将监听器类定义为普通内部类的好处----
 *		   内部类中可直接访问外层类的属性和方法
 */

import java.awt.*;
import java.awt.event.*;

public class TestInner {
	Frame f = new Frame("内部类测试");
	TextField tf = new TextField(30);
	
	public TestInner(){
		f.add(new Label("请按下鼠标左键并拖动"), "North");
		f.add(tf, "South");
		f.setBackground(new Color(120,175,175));
		f.addMouseMotionListener(new InnerMonitor());
		f.addMouseListener(new InnerMonitor());
		f.setSize(300, 200);	    	
		f.setVisible(true);
	}
	
	public static void main(String args[]) {   	
		TestInner t = new TestInner();
	}
	
	private class InnerMonitor implements MouseMotionListener,MouseListener {
		public void mouseDragged(MouseEvent e) {
		    String s = "鼠标拖动到位置（" + e.getX() + "," + e.getY() + ")";
		    tf.setText(s);
		}
		
		public void mouseEntered(MouseEvent e) {
		    String s = "鼠标已进入窗体";
		    tf.setText(s);
		}
		
		public void mouseExited(MouseEvent e) {
		    String s = "鼠标已移出窗体";
		    tf.setText(s);
		}
		public void mouseMoved(MouseEvent e) { }
		public void mousePressed(MouseEvent e) { }
		public void mouseClicked(MouseEvent e) { }
		public void mouseReleased(MouseEvent e) { }
	}//end of Inner class
}//end of Outer class