import java.awt.Color;

import javax.swing.JButton;

public class TestCases extends JButton{

	int i,j;
	
	public TestCases(int i, int j)
	{
		this.i = i;
		this.j = j;
		
		JButton bouton = new JButton();
	}
	
	Color initCouleurCase(String couleur)
	{
		Color returnCouleur = null;
		
		switch(couleur)
		{
			case "rouge":
				returnCouleur = Color.red;
			case "gris":
				returnCouleur = Color.lightGray;
				
		}
		
		return returnCouleur;
	}
	
	public int Get_i()
	{
		System.out.println(this.i);
		return this.i;		
	}
	
	public int Get_j()
	{
		System.out.print(this.j);
		return this.j;
	}
}
