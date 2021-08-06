import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;




class Main
{
	JFrame guiFrame;
	JFrame guiFrameB;
	static JButton buttonW;
	static JButton buttonB;
	static JLabel subW;
	static JLabel subB;
	static ColorLabel arrayLabelsW[][];
	static ColorLabel arrayLabelsB[][];
	
	
	public static void main(String[] args)
	{
		Main ob = new Main();
		ob.whiteGUI();
		ob.blackGUI();
		WhiteTurn ob2 = new WhiteTurn();
		ob2.run(arrayLabelsW, arrayLabelsB, buttonW, buttonB, subW, subB);
	}
	
	
	void whiteGUI()
	{
		guiFrame = new JFrame();
		guiFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		guiFrame.setTitle("Reversi - white player");
		arrayLabelsW = new ColorLabel[8][8];
		
		
		for(int a = 0; a < 8; a++)
		{
			for(int b = 0; b < 8; b++)
			{
				arrayLabelsW[a][b] = new ColorLabel(50, 50, Color.GREEN, 1, Color.BLACK);
				
				if(a == 3 && b == 3 || a == 4 && b == 4)
				{
					arrayLabelsW[a][b].setWhite();
				}
				
				if(a == 3 && b == 4 || a == 4 && b == 3)
				{
					arrayLabelsW[a][b].setBlack();
				}
			}
		}
		
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(8,8));
		
		for(int a = 0; a < 8; a++)
		{
			for(int b = 0; b < 8; b++)
			{
				jp.add(arrayLabelsW[a][b]);
			}
		}
		
		buttonW = new JButton("Greedy AI (play white)");
		guiFrame.getContentPane().add(buttonW, BorderLayout.SOUTH);
		subW = new JLabel();
		guiFrame.getContentPane().add(subW, BorderLayout.NORTH);
		guiFrame.add(jp);
		guiFrame.pack();
		guiFrame.setLocationRelativeTo(null);
		guiFrame.setVisible(true);
	}
	
	
	void blackGUI()
	{
		guiFrameB = new JFrame();
		guiFrameB.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		guiFrameB.setTitle("Reversi - black player");
		arrayLabelsB = new ColorLabel[8][8];
		
		
		for(int a = 0; a < 8; a++)
		{
			for(int b = 0; b < 8; b++)
			{
				arrayLabelsB[a][b] = new ColorLabel(50, 50, Color.GREEN, 1, Color.BLACK);
				
				if(a == 3 && b == 3 || a == 4 && b == 4)
				{
					arrayLabelsB[a][b].setWhite();
				}
				
				if(a == 3 && b == 4 || a == 4 && b == 3)
				{
					arrayLabelsB[a][b].setBlack();
				}
			}
		}
		
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(8,8));
		
		for(int a = 0; a < 8; a++)
		{
			for(int b = 0; b < 8; b++)
			{
				jp.add(arrayLabelsB[a][b]);
			}
		}
		
		buttonB = new JButton("Greedy AI (play black)");
		guiFrameB.getContentPane().add(buttonB, BorderLayout.SOUTH);
		subB = new JLabel();
		guiFrameB.getContentPane().add(subB, BorderLayout.NORTH);
		guiFrameB.add(jp);
		guiFrameB.pack();
		guiFrameB.setLocationRelativeTo(null);
		guiFrameB.setVisible(true);
	}
}