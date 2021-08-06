import javax.swing.JButton;
import javax.swing.JLabel;




class WhiteTurn
{	
	void run(ColorLabel arrayLabelsW[][], ColorLabel arrayLabelsB[][], JButton buttonW, JButton buttonB, JLabel subW, JLabel subB)
	{
		boolean z;
		boolean bool1 = false;
		boolean bool2;
		int x;
		subW.setText("White player - click place to put piece");
		subB.setText("Black PLayer - not your turn");
		
		for(int a = 0; a < 8; a++)
		{
			for(int b = 0; b < 8; b++)
			{
				if(arrayLabelsW[a][b].isWhite() == true)
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
						else if(arrayLabelsW[a - x][b - x].isBlack() == true)
						{
							x++;
						}
						else if(arrayLabelsW[a - x][b - x].isWhite() == true)
						{
							z = false;
						}
						else if(arrayLabelsW[a - x][b - x].checkPiece() == false && x == 1)
						{
							z = false;
						}
						else if(arrayLabelsW[a - x][b - x].checkPiece() == false)
						{
							TLMouseClicked ob = new TLMouseClicked(true, arrayLabelsW, arrayLabelsB, a, b, x, buttonW, buttonB, subW, subB);
							arrayLabelsW[a - x][b - x].addMouseListener(ob);							
							z = false;
							bool1 = true;
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
						else if(arrayLabelsW[a - x][b].isBlack() == true)
						{
							x++;
						}
						else if(arrayLabelsW[a - x][b].isWhite() == true)
						{
							z = false;
						}
						else if(arrayLabelsW[a - x][b].checkPiece() == false && x == 1)
						{
							z = false;
						}
						else if(arrayLabelsW[a - x][b].checkPiece() == false)
						{
							TMouseClicked ob = new TMouseClicked(true, arrayLabelsW, arrayLabelsB, a, b, x, buttonW, buttonB, subW, subB);
							arrayLabelsW[a - x][b].addMouseListener(ob);							
							z = false;
							bool1 = true;
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
						else if(arrayLabelsW[a - x][b + x].isBlack() == true)
						{
							x++;
						}
						else if(arrayLabelsW[a - x][b + x].isWhite() == true)
						{
							z = false;
						}
						else if(arrayLabelsW[a - x][b + x].checkPiece() == false && x == 1)
						{
							z = false;
						}
						else if(arrayLabelsW[a - x][b + x].checkPiece() == false)
						{
							TRMouseClicked ob = new TRMouseClicked(true, arrayLabelsW, arrayLabelsB, a, b, x, buttonW, buttonB, subW, subB);
							arrayLabelsW[a - x][b + x].addMouseListener(ob);							
							z = false;
							bool1 = true;
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
						else if(arrayLabelsW[a][b - x].isBlack() == true)
						{
							x++;
						}
						else if(arrayLabelsW[a][b - x].isWhite() == true)
						{
							z = false;
						}
						else if(arrayLabelsW[a][b - x].checkPiece() == false && x == 1)
						{
							z = false;
						}
						else if(arrayLabelsW[a][b - x].checkPiece() == false)
						{
							LMouseClicked ob = new LMouseClicked(true, arrayLabelsW, arrayLabelsB, a, b, x, buttonW, buttonB, subW, subB);
							arrayLabelsW[a][b - x].addMouseListener(ob);							
							z = false;
							bool1 = true;
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
						else if(arrayLabelsW[a][b + x].isBlack() == true)
						{
							x++;
						}
						else if(arrayLabelsW[a][b + x].isWhite() == true)
						{
							z = false;
						}
						else if(arrayLabelsW[a][b + x].checkPiece() == false && x == 1)
						{
							z = false;
						}
						else if(arrayLabelsW[a][b + x].checkPiece() == false)
						{
							RMouseClicked ob = new RMouseClicked(true, arrayLabelsW, arrayLabelsB, a, b, x, buttonW, buttonB, subW, subB);
							arrayLabelsW[a][b + x].addMouseListener(ob);							
							z = false;
							bool1 = true;
						}
						else
						{
							z = false;
						}
					}
					
					z = true;
					x = 1;
					
					//BottomLeft
					while(z == true)
					{
						if(a + x > 7 || b - x < 0)
						{
							z = false;
						}
						else if(arrayLabelsW[a + x][b - x].isBlack() == true)
						{
							x++;
						}
						else if(arrayLabelsW[a + x][b - x].isWhite() == true)
						{
							z = false;
						}
						else if(arrayLabelsW[a + x][b - x].checkPiece() == false && x == 1)
						{
							z = false;
						}
						else if(arrayLabelsW[a + x][b - x].checkPiece() == false)
						{
							BLMouseClicked ob = new BLMouseClicked(true, arrayLabelsW, arrayLabelsB, a, b, x, buttonW, buttonB, subW, subB);
							arrayLabelsW[a + x][b - x].addMouseListener(ob);							
							z = false;
							bool1 = true;
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
						else if(arrayLabelsW[a + x][b].isBlack() == true)
						{
							x++;
						}
						else if(arrayLabelsW[a + x][b].isWhite() == true)
						{
							z = false;
						}
						else if(arrayLabelsW[a + x][b].checkPiece() == false && x == 1)
						{
							z = false;
						}
						else if(arrayLabelsW[a + x][b].checkPiece() == false)
						{
							BMouseClicked ob = new BMouseClicked(true, arrayLabelsW, arrayLabelsB, a, b, x, buttonW, buttonB, subW, subB);
							arrayLabelsW[a + x][b].addMouseListener(ob);							
							z = false;
							bool1 = true;
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
						else if(arrayLabelsW[a + x][b + x].isBlack() == true)
						{
							x++;
						}
						else if(arrayLabelsW[a + x][b + x].isWhite() == true)
						{
							z = false;
						}
						else if(arrayLabelsW[a + x][b + x].checkPiece() == false && x == 1)
						{
							z = false;
						}
						else if(arrayLabelsW[a + x][b + x].checkPiece() == false)
						{
							BRMouseClicked ob = new BRMouseClicked(true, arrayLabelsW, arrayLabelsB, a, b, x, buttonW, buttonB, subW, subB);
							arrayLabelsW[a + x][b + x].addMouseListener(ob);							
							z = false;
							bool1 = true;
						}
						else
						{
							z = false;
						}
					}
				}
			}
		}
		
		if(bool1 == false)
		{
			BlackTurn obj1 = new BlackTurn();
			bool2 = obj1.existListener(arrayLabelsB);
			
			if(bool2 == false)
			{
				Message obj2 = new Message();
				obj2.send(arrayLabelsW, arrayLabelsB, buttonW, buttonB, subW, subB);
			}
			else
			{
				obj1.run(arrayLabelsW, arrayLabelsB, buttonW, buttonB, subW, subB);
			}
		}
		
		if(buttonW.getActionListeners().length == 0)
		{	
			WhiteAI ob2 = new WhiteAI(arrayLabelsW, arrayLabelsB, buttonW, buttonB, subW, subB);
			buttonW.addActionListener(ob2);
		}
	}
}