import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JLabel;




public class ColorLabel extends JLabel
{
	Color drawColor; 
	Color borderColor;
	int borderSize; 
	boolean white;
	boolean black;

	
	public ColorLabel( int width, int height, Color color,
			int borderWidth, Color borderCol )
	{
		// Member variable/attribute = parameter
		borderSize = borderWidth;
		drawColor = color;
		borderColor = borderCol;

		// Call some inherited methods from JLabel
		setMinimumSize( new Dimension(width, height) );
		setPreferredSize( new Dimension(width, height) );
	}
	
	
	void setWhite()
	{
		white = true;
		black = false;
	}
	
	
	void setBlack()
	{
		black = true;
		white = false;
	}
	
	
	void clearPiece()
	{
		white = false;
		black = false;
	}
	
	
	boolean checkPiece()
	{
		if(white == true || black == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	boolean isBlack()
	{
		if(black == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	boolean isWhite()
	{
		if(white == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

	public ColorLabel( int width, int height, Color color )
	{
		// Call the other constructor with some default values
		this( width, height, color, 0, null );
	} 

	// A default constructor for testing
	public ColorLabel()
	{	// Again delegate work to the complex constructor
		this(200,200,Color.RED,5, Color.BLUE);
	}

	// This is where we do all of the work...
	protected void paintComponent(Graphics g)
	{
		//super.paintComponent(g); // Do NOT do normal drawing
		if ( borderColor != null )
		{
			g.setColor(borderColor);
			g.fillRect(0, 0, getWidth(), getHeight());
		}
		if ( drawColor != null )
		{
			g.setColor(drawColor);
			g.fillRect(borderSize, borderSize, getWidth() - borderSize*2,
					getHeight()-borderSize*2);
		}
		
		if(white == true)
		{
			g.setColor(Color.BLACK);
			g.drawOval(4,4,getWidth()-2,getHeight()-2);
			g.fillOval(4, 4, getWidth() - 2, getHeight() - 2);
			g.setColor(Color.WHITE);
			g.drawOval(2,2,getWidth()-4,getHeight()-4);
			g.fillOval(2, 2, getWidth() - 4, getHeight() - 4);
		}
		
		if(black == true)
		{
			g.setColor(Color.WHITE);
			g.drawOval(4,4,getWidth()-2,getHeight()-2);
			g.fillOval(4, 4, getWidth() - 2, getHeight() - 2);
			g.setColor(Color.BLACK);
			g.drawOval(2,2,getWidth()-4,getHeight()-4);
			g.fillOval(2, 2, getWidth() - 4, getHeight() - 4);
		}
	}
	
	
	void setDrawColor(Color obj)
	{
		drawColor = obj;
	}
}