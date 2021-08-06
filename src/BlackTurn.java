import javax.swing.JButton;
import javax.swing.JLabel;




class BlackTurn 
{
	void run(ColorLabel arrayLabelsW[][], ColorLabel arrayLabelsB[][], JButton buttonW, JButton buttonB, JLabel subW, JLabel subB)
	{
		boolean bool = false;
		boolean z;
		int x;
		subW.setText("White player - not your turn");
		subB.setText("Black player - click place to put piece");
		
		for(int a = 0; a < 8; a++)
		{
			for(int b = 0; b < 8; b++)
			{
				if(arrayLabelsB[a][b].isBlack() == true)
				{
					z = true;
					x = 1;
					
					//Top left
					while(z == true)
					{
						if(a - x < 0 || b - x < 0)
						{
							z = false;
						}
						else if(arrayLabelsB[a - x][b - x].isWhite() == true)
						{
							x++;
						}
						else if(arrayLabelsB[a - x][b - x].isBlack() == true)
						{
							z = false;
						}
						else if(arrayLabelsB[a - x][b - x].checkPiece() == false && x == 1)
						{
							z = false;
						}
						else if(arrayLabelsB[a - x][b - x].checkPiece() == false)
						{
							TLMouseClicked ob = new TLMouseClicked(false, arrayLabelsW, arrayLabelsB, a, b, x, buttonW, buttonB, subW, subB);
							arrayLabelsB[a - x][b - x].addMouseListener(ob);							
							z = false;
							bool = true;
						}
						else
						{
							z = false;
						}
					}
					
					z = true;
					x = 1;
					
					//Top
					while(z == true)
					{
						if(a - x < 0)
						{
							z = false;
						}
						else if(arrayLabelsB[a - x][b].isWhite() == true)
						{
							x++;
						}
						else if(arrayLabelsB[a - x][b].isBlack() == true)
						{
							z = false;
						}
						else if(arrayLabelsB[a - x][b].checkPiece() == false && x == 1)
						{
							z = false;
						}
						else if(arrayLabelsB[a - x][b].checkPiece() == false)
						{
							TMouseClicked ob = new TMouseClicked(false, arrayLabelsW, arrayLabelsB, a, b, x, buttonW, buttonB, subW, subB);
							arrayLabelsB[a - x][b].addMouseListener(ob);							
							z = false;
							bool = true;
						}
						else
						{
							z = false;
						}
					}
					
					z = true;
					x = 1;
					
					//Top Right
					while(z == true)
					{
						if(a - x < 0 || b + x > 7)
						{
							z = false;
						}
						else if(arrayLabelsB[a - x][b + x].isWhite() == true)
						{
							x++;
						}
						else if(arrayLabelsB[a - x][b + x].isBlack() == true)
						{
							z = false;
						}
						else if(arrayLabelsB[a - x][b + x].checkPiece() == false && x == 1)
						{
							z = false;
						}
						else if(arrayLabelsB[a - x][b + x].checkPiece() == false)
						{
							TRMouseClicked ob = new TRMouseClicked(false, arrayLabelsW, arrayLabelsB, a, b, x, buttonW, buttonB, subW, subB);
							arrayLabelsB[a - x][b + x].addMouseListener(ob);							
							z = false;
							bool = true;
						}
						else
						{
							z = false;
						}
					}
					
					z = true;
					x = 1;
					
					//Left
					while(z == true)
					{
						if(b - x < 0)
						{
							z = false;
						}
						else if(arrayLabelsB[a][b - x].isWhite() == true)
						{
							x++;
						}
						else if(arrayLabelsB[a][b - x].isBlack() == true)
						{
							z = false;
						}
						else if(arrayLabelsB[a][b - x].checkPiece() == false && x == 1)
						{
							z = false;
						}
						else if(arrayLabelsB[a][b - x].checkPiece() == false)
						{
							LMouseClicked ob = new LMouseClicked(false, arrayLabelsW, arrayLabelsB, a, b, x, buttonW, buttonB, subW, subB);
							arrayLabelsB[a][b - x].addMouseListener(ob);							
							z = false;
							bool = true;
						}
						else
						{
							z = false;
						}
					}
					
					z = true;
					x = 1;
					
					//Right
					while(z == true)
					{
						if(b + x > 7)
						{
							z = false;
						}
						else if(arrayLabelsB[a][b + x].isWhite() == true)
						{
							x++;
						}
						else if(arrayLabelsB[a][b + x].isBlack() == true)
						{
							z = false;
						}
						else if(arrayLabelsB[a][b + x].checkPiece() == false && x == 1)
						{
							z = false;
						}
						else if(arrayLabelsB[a][b + x].checkPiece() == false)
						{
							RMouseClicked ob = new RMouseClicked(false, arrayLabelsW, arrayLabelsB, a, b, x, buttonW, buttonB, subW, subB);
							arrayLabelsB[a][b + x].addMouseListener(ob);							
							z = false;
							bool = true;
						}
						else
						{
							z = false;
						}
					}
					
					z = true;
					x = 1;
					
					//Bottom Left
					while(z == true)
					{
						if(a + x > 7 || b - x < 0)
						{
							z = false;
						}
						else if(arrayLabelsB[a + x][b - x].isWhite() == true)
						{
							x++;
						}
						else if(arrayLabelsB[a + x][b - x].isBlack() == true)
						{
							z = false;
						}
						else if(arrayLabelsB[a + x][b - x].checkPiece() == false && x == 1)
						{
							z = false;
						}
						else if(arrayLabelsB[a + x][b - x].checkPiece() == false)
						{
							BLMouseClicked ob = new BLMouseClicked(false, arrayLabelsW, arrayLabelsB, a, b, x, buttonW, buttonB, subW, subB);
							arrayLabelsB[a + x][b - x].addMouseListener(ob);							
							z = false;
							bool = true;
						}
						else
						{
							z = false;
						}
					}
					
					z = true;
					x = 1;
					
					//Bottom
					while(z == true)
					{
						if(a + x > 7)
						{
							z = false;
						}
						else if(arrayLabelsB[a + x][b].isWhite() == true)
						{
							x++;
						}
						else if(arrayLabelsB[a + x][b].isBlack() == true)
						{
							z = false;
						}
						else if(arrayLabelsB[a + x][b].checkPiece() == false && x == 1)
						{
							z = false;
						}
						else if(arrayLabelsB[a + x][b].checkPiece() == false)
						{
							BMouseClicked ob = new BMouseClicked(false, arrayLabelsW, arrayLabelsB, a, b, x, buttonW, buttonB, subW, subB);
							arrayLabelsB[a + x][b].addMouseListener(ob);							
							z = false;
							bool = true;
						}
						else
						{
							z = false;
						}
					}
					
					z = true;
					x = 1;
					
					//Bottom right
					while(z == true)
					{
						if(a + x > 7 || b + x > 7)
						{
							z = false;
						}
						else if(arrayLabelsB[a + x][b + x].isWhite() == true)
						{
							x++;
						}
						else if(arrayLabelsB[a + x][b + x].isBlack() == true)
						{
							z = false;
						}
						else if(arrayLabelsB[a + x][b + x].checkPiece() == false && x == 1)
						{
							z = false;
						}
						else if(arrayLabelsB[a + x][b + x].checkPiece() == false)
						{
							BRMouseClicked ob = new BRMouseClicked(false, arrayLabelsW, arrayLabelsB, a, b, x, buttonW, buttonB, subW, subB);
							arrayLabelsB[a + x][b + x].addMouseListener(ob);							
							z = false;
							bool = true;
						}
						else
						{
							z = false;
						}
					}
				}
			}
		}
		
		if(bool == false)
		{
			WhiteTurn obj = new WhiteTurn();
			obj.run(arrayLabelsW, arrayLabelsB, buttonW, buttonB, subW, subB);
		}
		
		if(buttonB.getActionListeners().length == 0)
		{	
			BlackAI ob2 = new BlackAI(arrayLabelsW, arrayLabelsB, buttonW, buttonB, subW, subB);
			buttonB.addActionListener(ob2);
		}
	}
	
	
	boolean existListener(ColorLabel arrayLabelsB[][])
	{
		boolean bool = false;
		boolean z;
		int x;
		
		for(int a = 0; a < 8; a++)
		{
			for(int b = 0; b < 8; b++)
			{
				if(arrayLabelsB[a][b].isBlack() == true)
				{
					z = true;
					x = 1;
					
					//Top left
					while(z == true)
					{
						if(a - x < 0 || b - x < 0)
						{
							z = false;
						}
						else if(arrayLabelsB[a - x][b - x].isWhite() == true)
						{
							x++;
						}
						else if(arrayLabelsB[a - x][b - x].isBlack() == true)
						{
							z = false;
						}
						else if(arrayLabelsB[a - x][b - x].checkPiece() == false && x == 1)
						{
							z = false;
						}
						else if(arrayLabelsB[a - x][b - x].checkPiece() == false)
						{
							z = false;
							bool = true;
						}
						else
						{
							z = false;
						}
					}
					
					z = true;
					x = 1;
					
					//Top
					while(z == true)
					{
						if(a - x < 0)
						{
							z = false;
						}
						else if(arrayLabelsB[a - x][b].isWhite() == true)
						{
							x++;
						}
						else if(arrayLabelsB[a - x][b].isBlack() == true)
						{
							z = false;
						}
						else if(arrayLabelsB[a - x][b].checkPiece() == false && x == 1)
						{
							z = false;
						}
						else if(arrayLabelsB[a - x][b].checkPiece() == false)
						{							
							z = false;
							bool = true;
						}
						else
						{
							z = false;
						}
					}
					
					z = true;
					x = 1;
					
					//Top Right
					while(z == true)
					{
						if(a - x < 0 || b + x > 7)
						{
							z = false;
						}
						else if(arrayLabelsB[a - x][b + x].isWhite() == true)
						{
							x++;
						}
						else if(arrayLabelsB[a - x][b + x].isBlack() == true)
						{
							z = false;
						}
						else if(arrayLabelsB[a - x][b + x].checkPiece() == false && x == 1)
						{
							z = false;
						}
						else if(arrayLabelsB[a - x][b + x].checkPiece() == false)
						{						
							z = false;
							bool = true;
						}
						else
						{
							z = false;
						}
					}
					
					z = true;
					x = 1;
					
					//Left
					while(z == true)
					{
						if(b - x < 0)
						{
							z = false;
						}
						else if(arrayLabelsB[a][b - x].isWhite() == true)
						{
							x++;
						}
						else if(arrayLabelsB[a][b - x].isBlack() == true)
						{
							z = false;
						}
						else if(arrayLabelsB[a][b - x].checkPiece() == false && x == 1)
						{
							z = false;
						}
						else if(arrayLabelsB[a][b - x].checkPiece() == false)
						{							
							z = false;
							bool = true;
						}
						else
						{
							z = false;
						}
					}
					
					z = true;
					x = 1;
					
					//Right
					while(z == true)
					{
						if(b + x > 7)
						{
							z = false;
						}
						else if(arrayLabelsB[a][b + x].isWhite() == true)
						{
							x++;
						}
						else if(arrayLabelsB[a][b + x].isBlack() == true)
						{
							z = false;
						}
						else if(arrayLabelsB[a][b + x].checkPiece() == false && x == 1)
						{
							z = false;
						}
						else if(arrayLabelsB[a][b + x].checkPiece() == false)
						{							
							z = false;
							bool = true;
						}
						else
						{
							z = false;
						}
					}
					
					z = true;
					x = 1;
					
					//Bottom Left
					while(z == true)
					{
						if(a + x > 7 || b - x < 0)
						{
							z = false;
						}
						else if(arrayLabelsB[a + x][b - x].isWhite() == true)
						{
							x++;
						}
						else if(arrayLabelsB[a + x][b - x].isBlack() == true)
						{
							z = false;
						}
						else if(arrayLabelsB[a + x][b - x].checkPiece() == false && x == 1)
						{
							z = false;
						}
						else if(arrayLabelsB[a + x][b - x].checkPiece() == false)
						{					
							z = false;
							bool = true;
						}
						else
						{
							z = false;
						}
					}
					
					z = true;
					x = 1;
					
					//Bottom
					while(z == true)
					{
						if(a + x > 7)
						{
							z = false;
						}
						else if(arrayLabelsB[a + x][b].isWhite() == true)
						{
							x++;
						}
						else if(arrayLabelsB[a + x][b].isBlack() == true)
						{
							z = false;
						}
						else if(arrayLabelsB[a + x][b].checkPiece() == false && x == 1)
						{
							z = false;
						}
						else if(arrayLabelsB[a + x][b].checkPiece() == false)
						{						
							z = false;
							bool = true;
						}
						else
						{
							z = false;
						}
					}
					
					z = true;
					x = 1;
					
					//Bottom right
					while(z == true)
					{
						if(a + x > 7 || b + x > 7)
						{
							z = false;
						}
						else if(arrayLabelsB[a + x][b + x].isWhite() == true)
						{
							x++;
						}
						else if(arrayLabelsB[a + x][b + x].isBlack() == true)
						{
							z = false;
						}
						else if(arrayLabelsB[a + x][b + x].checkPiece() == false && x == 1)
						{
							z = false;
						}
						else if(arrayLabelsB[a + x][b + x].checkPiece() == false)
						{							
							z = false;
							bool = true;
						}
						else
						{
							z = false;
						}
					}
				}
			}
		}
		
		return bool;
	}
}