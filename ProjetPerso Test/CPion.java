import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.TransferHandler;

public class CPion extends JPanel{
	
	private static final long serialVersionUID = -3661294679384507829L;
	final Font policePions = new Font(Font.DIALOG, Font.BOLD, 75);
	char lettre;
	int valeur;
	
	/*CPion(char lettre)
	{
		JButton bouton = new JButton(Character.toString(lettre));
		bouton.setPreferredSize(new Dimension(150,100));
		bouton.setBackground(new Color(205,170,125));
		bouton.setFont(policePions);

		//-------------------------------------------------------------------
		//On crée le nouvel objet pour activer le drag'n drop 
	    bouton.setTransferHandler(new TransferHandler("text"));
	     
	    //On spécifie au composant qu'il doit envoyer ses données via son objet TransferHandler
	    bouton.addMouseListener(new MouseAdapter(){
	    //On utilise cet événement pour que les actions soient visibles dès le clic de souris…
		      
	    public void mouseReleased(MouseEvent e){
		     //On récupère le JComponent            
		     JComponent composant = (JComponent)e.getSource();
		     //Du composant, on récupère l'objet de transfert : le nôtre
		     TransferHandler handle = composant.getTransferHandler();
		     //On lui ordonne d'amorcer la procédure de drag'n drop
		     handle.exportAsDrag(composant, e, TransferHandler.COPY);
		     composant.removeAll();
		     
		    }	
	    });
		//-------------------------------------------------------------------
		    
	}*/
	
	CPion(int nbPionsAPiocher)
	{
		super(new BorderLayout());
		
		JToolBar Chevalet = new JToolBar("Chevalet");
		add(Chevalet, BorderLayout.SOUTH);
		setPreferredSize(new Dimension(150, 100));
		
		//CSac SacDeLettres = new CSac();
		//List<Character> listeDeCharacteresPioches = SacDeLettres.Piocher(nbPionsAPiocher);
		
		for(int i=0; i < nbPionsAPiocher; i++)
		{
			
			//JButton bouton = new JButton(listeDeCharacteresPioches.get(i).toString());
			JButton bouton = new JButton("A"+i);
			bouton.setPreferredSize(new Dimension(150,100));
			bouton.setBackground(new Color(205,170,125));
			bouton.setFont(policePions);
			
			//-------------------------------------------------------------------
		    //On crée le nouvel objet pour activer le drag'n drop 
		    bouton.setTransferHandler(new TransferHandler("text"));
		      
		    //On spécifie au composant qu'il doit envoyer ses données via son objet TransferHandler
		    bouton.addMouseListener(new MouseAdapter(){
		      //On utilise cet événement pour que les actions soient visibles dès le clic de souris…
		      
		      public void mouseReleased(MouseEvent e){
		        //On récupère le JComponent            
		        JComponent composant = (JComponent)e.getSource();
		        //Du composant, on récupère l'objet de transfert : le nôtre
		        TransferHandler handle = composant.getTransferHandler();
		        //On lui ordonne d'amorcer la procédure de drag'n drop
		        handle.exportAsDrag(composant, e, TransferHandler.COPY);
		        
		        Chevalet.remove(composant);
		        
		      }
		    });
		    //-------------------------------------------------------------------
		    
            Chevalet.add(bouton);
		}
	}
		
	
	public int getValeurLettre(char lettre)
	{
		switch(lettre)
		{
			case 'A':
			case 'E':
			case 'I':
			case 'L':
			case 'N':
			case 'O':
			case 'R':
			case 'S':
			case 'T':
			case 'U':
				valeur = 1;
				break;
				
			case 'D':
			case 'G':
			case 'M':
				valeur = 2;
				break;
			
			case 'B':
			case 'C':
			case 'P':
				valeur = 3;
				break;
				
			case 'F':
			case 'H':
			case 'V':
				valeur = 4;
				break;
				
			case 'J':
			case 'Q':
				valeur = 8;
				break;
				
			case 'K':
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				valeur = 10;
				break;
				
			case '0':
				valeur = 0;
				break;
		}
		return valeur;
	}
}
