import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.TransferHandler;

public class TestPlateau extends JPanel {
	
	TestCases TableauDeBoutons[][] = new TestCases[5][2];
	public TestPlateau() 
	{
	
		GridLayout Plateau = new GridLayout(5,2);
		setLayout(Plateau);
		
		Plateau.setHgap(2); // espace entre 2 cases horizontalement
		Plateau.setVgap(2); // espace entre 2 cases verticalement
		for (int i = 0; i < 5; i++)
		      for (int j = 0; j < 2; j++)
		      {
		        TableauDeBoutons[i][j] = new TestCases(i,j);
		        TableauDeBoutons[i][j].setTransferHandler(new TransferHandler("text")); // permet de recevoir le texte que l'on drag and drop
		        TableauDeBoutons[i][j].setBackground(TableauDeBoutons[i][j].initCouleurCase("gris"));
		        //TableauDeBoutons[i][j].setText("zbeub");
		        add(TableauDeBoutons[i][j]);
		      }
	}
	
	public void printText(int i, int j)
	{
		System.out.println(TableauDeBoutons[i][j].getText());
	}
}

/* - PARCOURIR LE TABLEAU DE JBUTTON POUR TROUVER LESQUELS ONT DU TEXTE ET RECUPERER LEURS INDICES DANS LE TABLEAU
 * - HISTORIQUE DES JBUTTON QUI ONT CHANGE LEUR TEXTE => get : couleur, position tableau, multiplicateur, valeur de la lettre...
 */