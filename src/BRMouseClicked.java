import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;




public class BRMouseClicked extends MouseAdapter
{
	boolean isWhite;
	ColorLabel arrayLabelW[][];
	ColorLabel arrayLabelB[][];
	JLabel subW;
	JLabel subB;
	JButton buttonW;
	JButton buttonB;
	int a;
	int b;
	int x;
	
	
	BRMouseClicked(boolean z, ColorLabel arrayLabelW[][], ColorLabel arrayLabelB[][], int a, int b, int x, JButton buttonW, JButton buttonB, JLabel subW, JLabel subB)
	{
		isWhite = z;
		this.arrayLabelW = arrayLabelW;
		this.arrayLabelB = arrayLabelB;
		this.a = a;
		this.b = b;
		this.x = x;
		this.buttonW = buttonW;
		this.buttonB = buttonB;
		this.subW = subW;
		this.subB = subB;
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e)
	{	
		if(isWhite == true)
		{
			for(int i = x; i >= 1; i--)
			{
				arrayLabelW[a + i][b + i].setWhite();
				arrayLabelB[7 - (a + i)][7 - (b + i)].setWhite();
			}
			
			for(int a = 0; a < arrayLabelW.length; a++)
			{
				for(int b = 0; b < arrayLabelW.length; b++)
				{
					if(arrayLabelW[a][b].getMouseListeners().length > 0)
					{
						arrayLabelW[a][b].removeMouseListener(arrayLabelW[a][b].getMouseListeners()[0]);
					}
				}
			}
			
			if(buttonW.getActionListeners().length > 0)
			{
				buttonW.removeActionListener(buttonW.getActionListeners()[0]);
			}
			
			BlackTurn ob = new BlackTurn();
			ob.run(arrayLabelW, arrayLabelB, buttonW, buttonB, subW, subB);
		}
		else
		{
			for(int i = x; i >= 1; i--)
			{
				arrayLabelB[a + i][b + i].setBlack();
				arrayLabelW[7 - (a + i)][7 - (b + i)].setBlack();
			}
			
			for(int a = 0; a < arrayLabelB.length; a++)
			{
				for(int b = 0; b < arrayLabelB.length; b++)
				{
					if(arrayLabelB[a][b].getMouseListeners().length > 0)
					{
						arrayLabelB[a][b].removeMouseListener(arrayLabelB[a][b].getMouseListeners()[0]);
					}
				}
			}
			
			if(buttonB.getActionListeners().length > 0)
			{
				buttonB.removeActionListener(buttonB.getActionListeners()[0]);
			}
			
			WhiteTurn ob = new WhiteTurn();
			ob.run(arrayLabelW, arrayLabelB, buttonW, buttonB, subW, subB);
		}
	}
}