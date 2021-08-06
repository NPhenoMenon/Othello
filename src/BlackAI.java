import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;




public class BlackAI implements ActionListener
{
	ColorLabel arrayLabelW[][];
	ColorLabel arrayLabelB[][];
	JButton buttonW;
	JButton buttonB;
	JLabel subW;
	JLabel subB;
	
	
	BlackAI(ColorLabel arrayLabelW[][], ColorLabel arrayLabelB[][], JButton buttonW, JButton buttonB, JLabel subW, JLabel subB)
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
				if(arrayLabelB[a][b].getMouseListeners().length > 0)
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
						else if(arrayLabelB[i][j].isBlack() == true && x == 1)
						{
							z = false;
						}
						else if(arrayLabelB[i][j].isBlack() == true)
						{
							z = false;
							bool = true;
						}
						else if(arrayLabelB[i][j].isWhite() == false)
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
						else if(arrayLabelB[i][j].isBlack() == true && x == 1)
						{
							z = false;
						}
						else if(arrayLabelB[i][j].isBlack() == true)
						{
							z = false;
							bool = true;
						}
						else if(arrayLabelB[i][j].isWhite() == false)
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
						else if(arrayLabelB[i][j].isBlack() == true && x == 1)
						{
							z = false;
						}
						else if(arrayLabelB[i][j].isBlack() == true)
						{
							z = false;
							bool = true;
						}
						else if(arrayLabelB[i][j].isWhite() == false)
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
						else if(arrayLabelB[i][j].isBlack() == true && x == 1)
						{
							z = false;
						}
						else if(arrayLabelB[i][j].isBlack() == true)
						{
							z = false;
							bool = true;
						}
						else if(arrayLabelB[i][j].isWhite() == false)
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
						else if(arrayLabelB[i][j].isBlack() == true && x == 1)
						{
							z = false;
						}
						else if(arrayLabelB[i][j].isBlack() == true)
						{
							z = false;
							bool = true;
						}
						else if(arrayLabelB[i][j].isWhite() == false)
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
						else if(arrayLabelB[i][j].isBlack() == true && x == 1)
						{
							z = false;
						}
						else if(arrayLabelB[i][j].isBlack() == true)
						{
							z = false;
							bool = true;
						}
						else if(arrayLabelB[i][j].isWhite() == false)
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
						else if(arrayLabelB[i][j].isBlack() == true && x == 1)
						{
							z = false;
						}
						else if(arrayLabelB[i][j].isBlack() == true)
						{
							z = false;
							bool = true;
						}
						else if(arrayLabelB[i][j].isWhite() == false)
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
						else if(arrayLabelB[i][j].isBlack() == true && x == 1)
						{
							z = false;
						}
						else if(arrayLabelB[i][j].isBlack() == true)
						{
							z = false;
							bool = true;
						}
						else if(arrayLabelB[i][j].isWhite() == false)
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
			else if(arrayLabelB[i][j].isBlack() == true && x == 1)
			{
				z = false;
			}
			else if(arrayLabelB[i][j].isBlack() == true)
			{
				z = false;
				bool = true;
			}
			else if(arrayLabelB[i][j].isWhite() == false)
			{
				z = false;
			}
		}
		
		if(bool == true)
		{
			z = true;
			i = max_a;
			j = max_b;
			arrayLabelB[i][j].setBlack();
			arrayLabelW[7 - i][7 - j].setBlack();
			
			while(z == true)
			{
				i--;
				j--;
				
				if(arrayLabelB[i][j].isWhite() == true)
				{
					arrayLabelB[i][j].setBlack();
					arrayLabelW[7 - i][7 - j].setBlack();
				}
				else if(arrayLabelB[i][j].isBlack() == true)
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
			else if(arrayLabelB[i][j].isBlack() == true && x == 1)
			{
				z = false;
			}
			else if(arrayLabelB[i][j].isBlack() == true)
			{
				z = false;
				bool = true;
			}
			else if(arrayLabelB[i][j].isWhite() == false)
			{
				z = false;
			}
		}
		
		if(bool == true)
		{
			z = true;
			i = max_a;
			j = max_b;
			arrayLabelB[i][j].setBlack();
			arrayLabelW[7 - i][7 - j].setBlack();
			
			while(z == true)
			{
				i--;
				
				if(arrayLabelB[i][j].isWhite() == true)
				{
					arrayLabelB[i][j].setBlack();
					arrayLabelW[7 - i][7 - j].setBlack();
				}
				else if(arrayLabelB[i][j].isBlack() == true)
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
			else if(arrayLabelB[i][j].isBlack() == true && x == 1)
			{
				z = false;
			}
			else if(arrayLabelB[i][j].isBlack() == true)
			{
				z = false;
				bool = true;
			}
			else if(arrayLabelB[i][j].isWhite() == false)
			{
				z = false;
			}
		}
		
		if(bool == true)
		{
			z = true;
			i = max_a;
			j = max_b;
			arrayLabelB[i][j].setBlack();
			arrayLabelW[7 - i][7 - j].setBlack();
			
			while(z == true)
			{
				i--;
				j++;
				
				if(arrayLabelB[i][j].isWhite() == true)
				{
					arrayLabelB[i][j].setBlack();
					arrayLabelW[7 - i][7 - j].setBlack();
				}
				else if(arrayLabelB[i][j].isBlack() == true)
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
			else if(arrayLabelB[i][j].isBlack() == true && x == 1)
			{
				z = false;
			}
			else if(arrayLabelB[i][j].isBlack() == true)
			{
				z = false;
				bool = true;
			}
			else if(arrayLabelB[i][j].isWhite() == false)
			{
				z = false;
			}
		}
		
		if(bool == true)
		{
			z = true;
			i = max_a;
			j = max_b;
			arrayLabelB[i][j].setBlack();
			arrayLabelW[7 - i][7 - j].setBlack();
			
			while(z == true)
			{
				j--;
				
				if(arrayLabelB[i][j].isWhite() == true)
				{
					arrayLabelB[i][j].setBlack();
					arrayLabelW[7 - i][7 - j].setBlack();
				}
				else if(arrayLabelB[i][j].isBlack() == true)
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
			else if(arrayLabelB[i][j].isBlack() == true && x == 1)
			{
				z = false;
			}
			else if(arrayLabelB[i][j].isBlack() == true)
			{
				z = false;
				bool = true;
			}
			else if(arrayLabelB[i][j].isWhite() == false)
			{
				z = false;
			}
		}
		
		if(bool == true)
		{
			z = true;
			i = max_a;
			j = max_b;
			arrayLabelB[i][j].setBlack();
			arrayLabelW[7 - i][7 - j].setBlack();
			
			while(z == true)
			{
				j++;
				
				if(arrayLabelB[i][j].isWhite() == true)
				{
					arrayLabelB[i][j].setBlack();
					arrayLabelW[7 - i][7 - j].setBlack();
				}
				else if(arrayLabelB[i][j].isBlack() == true)
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
			else if(arrayLabelB[i][j].isBlack() == true && x == 1)
			{
				z = false;
			}
			else if(arrayLabelB[i][j].isBlack() == true)
			{
				z = false;
				bool = true;
			}
			else if(arrayLabelB[i][j].isWhite() == false)
			{
				z = false;
			}
		}
		
		if(bool == true)
		{
			z = true;
			i = max_a;
			j = max_b;
			arrayLabelB[i][j].setBlack();
			arrayLabelW[7 - i][7 - j].setBlack();
			
			while(z == true)
			{
				i++;
				j--;
				
				if(arrayLabelB[i][j].isWhite() == true)
				{
					arrayLabelB[i][j].setBlack();
					arrayLabelW[7 - i][7 - j].setBlack();
				}
				else if(arrayLabelB[i][j].isBlack() == true)
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
			else if(arrayLabelB[i][j].isBlack() == true && x == 1)
			{
				z = false;
			}
			else if(arrayLabelB[i][j].isBlack() == true)
			{
				z = false;
				bool = true;
			}
			else if(arrayLabelB[i][j].isWhite() == false)
			{
				z = false;
			}
		}
		
		if(bool == true)
		{
			z = true;
			i = max_a;
			j = max_b;
			arrayLabelB[i][j].setBlack();
			arrayLabelW[7 - i][7 - j].setBlack();
			
			while(z == true)
			{
				i++;
				
				if(arrayLabelB[i][j].isWhite() == true)
				{
					arrayLabelB[i][j].setBlack();
					arrayLabelW[7 - i][7 - j].setBlack();
				}
				else if(arrayLabelB[i][j].isBlack() == true)
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
			else if(arrayLabelB[i][j].isBlack() == true && x == 1)
			{
				z = false;
			}
			else if(arrayLabelB[i][j].isBlack() == true)
			{
				z = false;
				bool = true;
			}
			else if(arrayLabelB[i][j].isWhite() == false)
			{
				z = false;
			}
		}
		
		if(bool == true)
		{
			z = true;
			i = max_a;
			j = max_b;
			arrayLabelB[i][j].setBlack();
			arrayLabelW[7 - i][7 - j].setBlack();
			
			while(z == true)
			{
				i++;
				j++;
				
				if(arrayLabelB[i][j].isWhite() == true)
				{
					arrayLabelB[i][j].setBlack();
					arrayLabelW[7 - i][7 - j].setBlack();
				}
				else if(arrayLabelB[i][j].isBlack() == true)
				{
					z = false;
				}
				else
				{
					z = false;
				}
			}
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
		
		buttonB.removeActionListener(this);
		WhiteTurn ob = new WhiteTurn();
		ob.run(arrayLabelW, arrayLabelB, buttonW, buttonB, subW, subB);
	}
}