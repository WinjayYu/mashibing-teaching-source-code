/*	范例名称：FlowLayout 用法举例
 * 	源文件名称：TestFlowLayout.java
 *	要  点：
 *		1. 布局管理器的概念和作用
 *   	2. FlowLayout的性质及用法
 */

import java.awt.*;

public class TestFlowLayout {
    public static void main(String args[]) {
	 			Frame f = new Frame("Flow Layout");
        Button button1 = new Button("Ok");
        Button button2 = new Button("Open");
        Button button3 = new Button("Close");
        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        f.add(button1);
        f.add(button2);
        f.add(button3);
        f.setSize(100,100);
        f.setVisible(true);
    }
}
