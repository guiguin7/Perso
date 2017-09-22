import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class CTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame fenetre = new JFrame();
        fenetre.setSize(750, 750);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.getContentPane().add(new TestPlateau(), BorderLayout.CENTER);
        fenetre.getContentPane().add(new CPion(7), BorderLayout.SOUTH);
        fenetre.setVisible(true);
	}

}

		