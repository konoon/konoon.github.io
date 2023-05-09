package source23_awtswing;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test15_KeyListene {

   static class MyGUI extends JFrame{
      public MyGUI() {
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setTitle("자바");
         this.setLayout(new FlowLayout());
         
         JTextField field = new JTextField(10);
         JTextArea area = new JTextArea(10, 10);
         this.add(field);
         this.add(area);

		
   }
   }
   public static void main(String[] args) {
      new MyGUI();
   }
}