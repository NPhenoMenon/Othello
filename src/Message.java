import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;




class Message
{
	void send(ColorLabel arrayLabelsW[][], ColorLabel arrayLabelsB[][], JButton buttonW, JButton buttonB, JLabel subW, JLabel subB)
	{
		int nw = 0;
		int nb = 0;
		String str = "";
		
		for(int a = 0; a < 8; a++)
		{
			for(int b = 0; b < 8; b++)
			{
				if(arrayLabelsW[a][b].isWhite() == true)
				{
					nw++;
				}
				
				if(arrayLabelsW[a][b].isBlack() == true)
				{
					nb++;
				}
			}
		}
		
		if(nw > nb)
		{
			str = "White wins: " + nw + ":" + nb;
		}
		else if(nw < nb)
		{
			str = "Black wins: " + nb + ":" + nw;
		}
		else if(nw == nb)
		{
			str = "Stalemate: " + nw + ":" + nb;
		}
		
		int input = JOptionPane.showConfirmDialog(null, str, "Message", JOptionPane.DEFAULT_OPTION);
		
		if(input == 0)
		{
			for(int a = 0; a < 8; a++)
			{
				for(int b = 0; b < 8; b++)
				{
					if(a == 3 && b == 3 || a == 4 && b == 4)
					{
						arrayLabelsW[a][b].setWhite();
						arrayLabelsB[a][b].setWhite();
					}
					else if(a == 3 && b == 4 || a == 4 && b == 3)
					{
						arrayLabelsW[a][b].setBlack();
						arrayLabelsB[a][b].setBlack();
					}
					else
					{
						arrayLabelsW[a][b].clearPiece();
						arrayLabelsB[a][b].clearPiece();
					}
				}
			}
			
			WhiteTurn ob = new WhiteTurn();
			ob.run(arrayLabelsW, arrayLabelsB, buttonW, buttonB, subW, subB);
		}
	}	
}