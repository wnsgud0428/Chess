package kr.ac.cau.mecs.lenerd.chess;

import javax.imageio.ImageIO;
import javax.swing.*;

import kr.ac.cau.mecs.lenerd.chess.ChessPieceSprite.ChessPieceSpriteType;
import kr.ac.cau.mecs.lenerd.chess.setPiece;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.*;

public class Chess_main extends JFrame {
   Font font1 = new Font("Gabriola", Font.BOLD + Font.ITALIC, 130);
   BufferedImage background = new BufferedImage(1280, 800, BufferedImage.TYPE_INT_RGB);
   ImagePanel Image = new ImagePanel();

   public Chess_main() {
	   JFrame frame=new JFrame();
	      frame.setTitle("Chess game");
	      frame.setLocationRelativeTo(null);
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      

	      JLabel title = new JLabel("Chess");
	      JPanel p2 = new JPanel(new BorderLayout());
	      title.setFont(font1);
	      title.setForeground(new Color(249, 185, 55));

	      File file = new File("C:\\background1.png");
	      try 
	      {
	         background = ImageIO.read(file);
	         Image.setImage(background);
	      } 
	      catch (Exception e) 
	      {
	         
	      }
	      

	      JButton one = new JButton("1 vs 1");
	      JButton two = new JButton("2 vs 2");
	      JButton exit = new JButton("EXIT");

	      p2.setLayout(null);

	      one.setBounds(300, 650, 150, 70);
	      two.setBounds(600, 650, 150, 70);
	      exit.setBounds(900, 650, 150, 70);
	      title.setBounds(150, 70, 300, 100);

	      p2.add(title);
	      p2.add(one);
	      p2.add(two);
	      p2.add(exit);

	      add(p2, BorderLayout.CENTER);
	      
	      Image.setBounds(0, 0, 1420, 800);
	      p2.add(Image);
	      frame.add(p2);
	      ListenerClass listener = new ListenerClass();
	      one.addActionListener(listener);
	      two.addActionListener(listener);
	      exit.addActionListener(listener);

	      frame.setSize(1280, 800);
	      frame.setVisible(true);
	      frame.setLocation(200,100);
	      
   }

   public static void main(String[] args) {

      new Chess_main();
   }

}
class _1vs1 extends JFrame{
   private ImageIcon white = new ImageIcon("c://white.png");
   private ImageIcon pattern = new ImageIcon("c://pattern.png");
   Font name = new Font("SanSerif", Font.BOLD, 40);
   _1vs1(){
   JFrame frame = new JFrame();
   setPiece setpiece=new setPiece(frame);
   
   JLabel player_1 = new JLabel("Player1");
   JLabel player_2 = new JLabel("Player2");
   player_1.setFont(name);
   player_2.setFont(name);
   player_1.setBounds(50,0,500,200);
   player_2.setBounds(0,750,500,250);
   
   frame.add(player_1);
   frame.add(player_2);
   frame.setSize(2000, 1000);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setLocationRelativeTo(null);
   frame.setVisible(true);
   }
}
class _2vs2 extends JFrame{
   
}
class ListenerClass implements ActionListener {
   
   public void actionPerformed(ActionEvent e) {
      JButton b = (JButton) e.getSource();
      if (b.getText().equals("1 vs 1")) {
         new _1vs1();
      }
      else if(b.getText().equals("2 vs 2")) {
         
      }
      else {
         System.exit(0);
      }
   }
}