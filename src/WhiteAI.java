import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;




public class WhiteAI implements ActionListener
{
	ColorLabel arrayLabelW[][];
	ColorLabel arrayLabelB[][];
	JButton buttonW;
	JButton buttonB;
	JLabel subW;
	JLabel subB;
	
	
	WhiteAI(ColorLabel arrayLabelW[][], ColorLabel arrayLabelB[][], JButton buttonW, JButton buttonB, JLabel subW, JLabel subB)
	{
		this.arrayLabelW = arrayLabelW;
		this.arrayLabelB = arrayLabelB;
		this.buttonW = buttonW;
		this.buttonB = buttonB;
		this.subW = subW;
		this.subB = subB;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		int max = 0;
		int max_a = 0;
		int max_b = 0;
		int dc;
		int x = 0;
		int x2;
		int i;
		int j;
		boolean z;
		boolean bool;
		
		for(int a = 0; a < 8; a++)
		{
			for(int b = 0; b < 8; b++)
			{
				if(arrayLabelW[a][b].getMouseListeners().length > 0)
				{
					dc = 0;
					x = 0;
					x2 = 0;
					z = true;
					bool = false;
					i = a;
					j = b;
					
					
					//Top left
					while(z == true)
					{
						i--;
						j--;
						x2++;
						
						if(i < 0 || j < 0)
						{
							z = false;
						}
						else if(arrayLabelW[i][j].isWhite() == true && x == 1)
						{
							z = false;
						}
						else if(arrayLabelW[i][j].isWhite() == true)
						{
							z = false;
							bool = true;
						}
						else if(arrayLabelW[i][j].isBlack() == false)
						{
							z = false;
						}
					}
					
					if(bool == true)
					{
						x = x + x2;
						dc++;
					}
					
					x2 = 0;
					z = true;
					bool = false;
					i = a;
					j = b;
					
					//Top
					while(z == true)
					{
						i--;
						x2++;
						
						if(i < 0)
						{
							z = false;
						}
						else if(arrayLabelW[i][j].isWhite() == true && x == 1)
						{
							z = false;
						}
						else if(arrayLabelW[i][j].isWhite() == true)
						{
							z = false;
							bool = true;
						}
						else if(arrayLabelW[i][j].isBlack() == false)
						{
							z = false;
						}
					}
					
					if(bool == true)
					{
						x = x + x2;
						dc++;
						
						if(dc > 1)
						{
							x--;
						}
					}
					
					x2 = 0;
					z = true;
					bool = false;
					i = a;
					j = b;
					
					//Top right
					while(z == true)
					{
						i--;
						j++;
						x2++;
						
						if(i < 0 || j > 7)
						{
							z = false;
						}
						else if(arrayLabelW[i][j].isWhite() == true && x == 1)
						{
							z = false;
						}
						else if(arrayLabelW[i][j].isWhite() == true)
						{
							z = false;
							bool = true;
						}
						else if(arrayLabelW[i][j].isBlack() == false)
						{
							z = false;
						}
					}
					
					if(bool == true)
					{
						x = x + x2;
						dc++;
						
						if(dc > 1)
						{
							x--;
						}
					}
					
					x2 = 0;
					z = true;
					bool = false;
					i = a;
					j = b;
					
					//Left
					while(z == true)
					{
						j--;
						x2++;
						
						if(j < 0)
						{
							z = false;
						}
						else if(arrayLabelW[i][j].isWhite() == true && x == 1)
						{
							z = false;
						}
						else if(arrayLabelW[i][j].isWhite() == true)
						{
							z = false;
							bool = true;
						}
						else if(arrayLabelW[i][j].isBlack() == false)
						{
							z = false;
						}
					}
					
					if(bool == true)
					{
						x = x + x2;
						dc++;
						
						if(dc > 1)
						{
							x--;
						}
					}
					
					x2 = 0;
					z = true;
					bool = false;
					i = a;
					j = b;
					
					//Right
					while(z == true)
					{
						j++;
						x2++;
						
						if(j > 7)
						{
							z = false;
						}
						else if(arrayLabelW[i][j].isWhite() == true && x == 1)
						{
							z = false;
						}
						else if(arrayLabelW[i][j].isWhite() == true)
						{
							z = false;
							bool = true;
						}
						else if(arrayLabelW[i][j].isBlack() == false)
						{
							z = false;
						}
					}
					
					if(bool == true)
					{
						x = x + x2;
						dc++;
						
						if(dc > 1)
						{
							x--;
						}
					}
					
					x2 = 0;
					z = true;
					bool = false;
					i = a;
					j = b;
					
					//Bottom left
					while(z == true)
					{
						i++;
						j--;
						x2++;
						
						if(i > 7 || j < 0)
						{
							z = false;
						}
						else if(arrayLabelW[i][j].isWhite() == true && x == 1)
						{
							z = false;
						}
						else if(arrayLabelW[i][j].isWhite() == true)
						{
							z = false;
							bool = true;
						}
						else if(arrayLabelW[i][j].isBlack() == false)
						{
							z = false;
						}
					}
					
					if(bool == true)
					{
						x = x + x2;
						dc++;
						
						if(dc > 1)
						{
							x--;
						}
					}
					
					x2 = 0;
					z = true;
					bool = false;
					i = a;
					j = b;
					
					//Bottom
					while(z == true)
					{
						i++;
						x2++;
						
						if(i > 7)
						{
							z = false;
						}
						else if(arrayLabelW[i][j].isWhite() == true && x == 1)
						{
							z = false;
						}
						else if(arrayLabelW[i][j].isWhite() == true)
						{
							z = false;
							bool = true;
						}
						else if(arrayLabelW[i][j].isBlack() == false)
						{
							z = false;
						}
					}
					
					if(bool == true)
					{
						x = x + x2;
						dc++;
						
						if(dc > 1)
						{
							x--;
						}
					}
					
					x2 = 0;
					z = true;
					bool = false;
					i = a;
					j = b;
					
					//Bottom right
					while(z == true)
					{
						i++;
						j++;
						x2++;
						
						if(i > 7 || j > 7)
						{
							z = false;
						}
						else if(arrayLabelW[i][j].isWhite() == true && x == 1)
						{
							z = false;
						}
						else if(arrayLabelW[i][j].isWhite() == true)
						{
							z = false;
							bool = true;
						}
						else if(arrayLabelW[i][j].isBlack() == false)
						{
							z = false;
						}
					}
					
					if(bool == true)
					{
						x = x + x2;
						dc++;
						
						if(dc > 1)
						{
							x--;
						}
					}
					
					x2 = 0;
					z = true;
					bool = false;
					i = a;
					j = b;
					
					//max
					if(max < x)
					{
						max = x;
						max_a = a;
						max_b = b;
					}
				}				
			}
		}
		
		//Fill
		z = true;
		bool = false;
		i = max_a;
		j = max_b;
		x = 0;
		
		//Top left
		while(z == true)
		{
			x++;
			i--;
			j--;
			
			if(i < 0 || j < 0)
			{
				z = false;
			}
			else if(arrayLabelW[i][j].isWhite() == true && x == 1)
			{
				z = false;
			}
			else if(arrayLabelW[i][j].isWhite() == true)
			{
				z = false;
				bool = true;
			}
			else if(arrayLabelW[i][j].isBlack() == false)
			{
				z = false;
			}
		}
		
		if(bool == true)
		{
			z = true;
			i = max_a;
			j = max_b;
			arrayLabelW[i][j].setWhite();
			arrayLabelB[7 - i][7 - j].setWhite();
			
			while(z == true)
			{
				i--;
				j--;
				
				if(arrayLabelW[i][j].isBlack() == true)
				{
					arrayLabelW[i][j].setWhite();
					arrayLabelB[7 - i][7 - j].setWhite();
				}
				else if(arrayLabelW[i][j].isWhite() == true)
				{
					z = false;
				}
				else
				{
					z = false;
				}
			}
		}
		
		z = true;
		bool = false;
		i = max_a;
		j = max_b;
		x = 0;
		
		//Top
		while(z == true)
		{
			x++;
			i--;
			
			if(i < 0)
			{
				z = false;
			}
			else if(arrayLabelW[i][j].isWhite() == true && x == 1)
			{
				z = false;
			}
			else if(arrayLabelW[i][j].isWhite() == true)
			{
				z = false;
				bool = true;
			}
			else if(arrayLabelW[i][j].isBlack() == false)
			{
				z = false;
			}
		}
		
		if(bool == true)
		{
			z = true;
			i = max_a;
			j = max_b;
			arrayLabelW[i][j].setWhite();
			arrayLabelB[7 - i][7 - j].setWhite();
			
			while(z == true)
			{
				i--;
				
				if(arrayLabelW[i][j].isBlack() == true)
				{
					arrayLabelW[i][j].setWhite();
					arrayLabelB[7 - i][7 - j].setWhite();
				}
				else if(arrayLabelW[i][j].isWhite() == true)
				{
					z = false;
				}
				else
				{
					z = false;
				}
			}
		}
		
		z = true;
		bool = false;
		i = max_a;
		j = max_b;
		x = 0;
		
		//Top right
		while(z == true)
		{
			x++;
			i--;
			j++;
			
			if(i < 0 || j > 7)
			{
				z = false;
			}
			else if(arrayLabelW[i][j].isWhite() == true && x == 1)
			{
				z = false;
			}
			else if(arrayLabelW[i][j].isWhite() == true)
			{
				z = false;
				bool = true;
			}
			else if(arrayLabelW[i][j].isBlack() == false)
			{
				z = false;
			}
		}
		
		if(bool == true)
		{
			z = true;
			i = max_a;
			j = max_b;
			arrayLabelW[i][j].setWhite();
			arrayLabelB[7 - i][7 - j].setWhite();
			
			while(z == true)
			{
				i--;
				j++;
				
				if(arrayLabelW[i][j].isBlack() == true)
				{
					arrayLabelW[i][j].setWhite();
					arrayLabelB[7 - i][7 - j].setWhite();
				}
				else if(arrayLabelW[i][j].isWhite() == true)
				{
					z = false;
				}
				else
				{
					z = false;
				}
			}
		}
		
		z = true;
		bool = false;
		i = max_a;
		j = max_b;
		x = 0;
		
		//Left
		while(z == true)
		{
			x++;
			j--;
			
			if(j < 0)
			{
				z = false;
			}
			else if(arrayLabelW[i][j].isWhite() == true && x == 1)
			{
				z = false;
			}
			else if(arrayLabelW[i][j].isWhite() == true)
			{
				z = false;
				bool = true;
			}
			else if(arrayLabelW[i][j].isBlack() == false)
			{
				z = false;
			}
		}
		
		if(bool == true)
		{
			z = true;
			i = max_a;
			j = max_b;
			arrayLabelW[i][j].setWhite();
			arrayLabelB[7 - i][7 - j].setWhite();
			
			while(z == true)
			{
				j--;
				
				if(arrayLabelW[i][j].isBlack() == true)
				{
					arrayLabelW[i][j].setWhite();
					arrayLabelB[7 - i][7 - j].setWhite();
				}
				else if(arrayLabelW[i][j].isWhite() == true)
				{
					z = false;
				}
				else
				{
					z = false;
				}
			}
		}
		
		z = true;
		bool = false;
		i = max_a;
		j = max_b;
		x = 0;
		
		//Right
		while(z == true)
		{
			x++;
			j++;
			
			if(j > 7)
			{
				z = false;
			}
			else if(arrayLabelW[i][j].isWhite() == true && x == 1)
			{
				z = false;
			}
			else if(arrayLabelW[i][j].isWhite() == true)
			{
				z = false;
				bool = true;
			}
			else if(arrayLabelW[i][j].isBlack() == false)
			{
				z = false;
			}
		}
		
		if(bool == true)
		{
			z = true;
			i = max_a;
			j = max_b;
			arrayLabelW[i][j].setWhite();
			arrayLabelB[7 - i][7 - j].setWhite();
			
			while(z == true)
			{
				j++;
				
				if(arrayLabelW[i][j].isBlack() == true)
				{
					arrayLabelW[i][j].setWhite();
					arrayLabelB[7 - i][7 - j].setWhite();
				}
				else if(arrayLabelW[i][j].isWhite() == true)
				{
					z = false;
				}
				else
				{
					z = false;
				}
			}
		}
		
		z = true;
		bool = false;
		i = max_a;
		j = max_b;
		x = 0;
		
		//Bottom left
		while(z == true)
		{
			x++;
			i++;
			j--;
			
			if(i > 7 || j < 0)
			{
				z = false;
			}
			else if(arrayLabelW[i][j].isWhite() == true && x == 1)
			{
				z = false;
			}
			else if(arrayLabelW[i][j].isWhite() == true)
			{
				z = false;
				bool = true;
			}
			else if(arrayLabelW[i][j].isBlack() == false)
			{
				z = false;
			}
		}
		
		if(bool == true)
		{
			z = true;
			i = max_a;
			j = max_b;
			arrayLabelW[i][j].setWhite();
			arrayLabelB[7 - i][7 - j].setWhite();
			
			while(z == true)
			{
				i++;
				j--;
				
				if(arrayLabelW[i][j].isBlack() == true)
				{
					arrayLabelW[i][j].setWhite();
					arrayLabelB[7 - i][7 - j].setWhite();
				}
				else if(arrayLabelW[i][j].isWhite() == true)
				{
					z = false;
				}
				else
				{
					z = false;
				}
			}
		}
		
		z = true;
		bool = false;
		i = max_a;
		j = max_b;
		x = 0;
		
		//Bottom
		while(z == true)
		{
			x++;
			i++;
			
			if(i > 7)
			{
				z = false;
			}
			else if(arrayLabelW[i][j].isWhite() == true && x == 1)
			{
				z = false;
			}
			else if(arrayLabelW[i][j].isWhite() == true)
			{
				z = false;
				bool = true;
			}
			else if(arrayLabelW[i][j].isBlack() == false)
			{
				z = false;
			}
		}
		
		if(bool == true)
		{
			z = true;
			i = max_a;
			j = max_b;
			arrayLabelW[i][j].setWhite();
			arrayLabelB[7 - i][7 - j].setWhite();
			
			while(z == true)
			{
				i++;
				
				if(arrayLabelW[i][j].isBlack() == true)
				{
					arrayLabelW[i][j].setWhite();
					arrayLabelB[7 - i][7 - j].setWhite();
				}
				else if(arrayLabelW[i][j].isWhite() == true)
				{
					z = false;
				}
				else
				{
					z = false;
				}
			}
		}
		
		z = true;
		bool = false;
		i = max_a;
		j = max_b;
		x = 0;
		
		//Bottom right
		while(z == true)
		{
			x++;
			i++;
			j++;
			
			if(i > 7 || j > 7)
			{
				z = false;
			}
			else if(arrayLabelW[i][j].isWhite() == true && x == 1)
			{
				z = false;
			}
			else if(arrayLabelW[i][j].isWhite() == true)
			{
				z = false;
				bool = true;
			}
			else if(arrayLabelW[i][j].isBlack() == false)
			{
				z = false;
			}
		}
		
		if(bool == true)
		{
			z = true;
			i = max_a;
			j = max_b;
			arrayLabelW[i][j].setWhite();
			arrayLabelB[7 - i][7 - j].setWhite();
			
			while(z == true)
			{
				i++;
				j++;
				
				if(arrayLabelW[i][j].isBlack() == true)
				{
					arrayLabelW[i][j].setWhite();
					arrayLabelB[7 - i][7 - j].setWhite();
				}
				else if(arrayLabelW[i][j].isWhite() == true)
				{
					z = false;
				}
				else
				{
					z = false;
				}
			}
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
		
		buttonW.removeActionListener(this);
		BlackTurn ob = new BlackTurn();
		ob.run(arrayLabelW, arrayLabelB, buttonW, buttonB, subW, subB);
	}
}