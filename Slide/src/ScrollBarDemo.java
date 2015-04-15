import java.awt.Adjustable;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class ScrollBarDemo extends JFrame
{
	public static JPanel panel, displayPanel;public static JLabel label;
	JFrame frame;
	int red, blue, green;
	public ScrollBarDemo()
	{
		displayPanel= new JPanel();
		displayPanel.setLayout(new BorderLayout());
		label= new JLabel("show colors");
		panel= new JPanel();
		panel.setLayout(new GridLayout(3,1));//size of choose colors border
		panel.setBorder(new CompoundBorder(new TitledBorder("Choose colors"),
				new EmptyBorder(2, 2, 2, 2)));//(top,left,bottom,right)  creates border 

		Listener colors= new Listener();
		panel.add(Listener.SredBar, BorderLayout.NORTH);
		panel.add(Listener.SblueBar, BorderLayout.AFTER_LINE_ENDS);
		panel.add(Listener.SgreenBar, BorderLayout.AFTER_LINE_ENDS);
		
		displayPanel.add(label, BorderLayout.NORTH);//add the panel to the display panel
		displayPanel.add(panel, BorderLayout.CENTER);
		add(displayPanel);//add the display panel to the frame
		setTitle(" SLider Demo");
		setSize(new Dimension(300,200));//frame size
		setVisible(true);
		pack();//sets size of frame to be larger
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}