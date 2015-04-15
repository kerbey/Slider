import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Listener
{
	int red, green, blue;
	static JSlider SgreenBar, SblueBar;
	public static JLabel label;
	static JSlider SredBar;

	public Listener()
	{	
		SredBar = new JSlider();
		SblueBar= new JSlider();
		SgreenBar= new JSlider();
		
		SredBar= new JSlider(JSlider.HORIZONTAL,0,255,0);//red scroll bar all bars are set to be horizontal
		SredBar.addChangeListener(new ChangeListener()
		{
			JLabel label=ScrollBarDemo.label;

			@Override
			public void stateChanged(ChangeEvent e)
			{
				JSlider source = (JSlider)e.getSource();//program knows when slider moves
				red= source.getValue();//now it changes colors based on class
				label.setForeground(new Color(red, green, blue)); 
			}	
		});


		
		SblueBar= new JSlider(JSlider.HORIZONTAL,0,255,0);//blue scroll bar
		SblueBar.addChangeListener(new ChangeListener()
		{
			JLabel label=ScrollBarDemo.label;

			@Override
			public void stateChanged(ChangeEvent e)
			{
				JSlider source = (JSlider)e.getSource();
				blue= source.getValue();
				label.setForeground(new Color(red, green, blue));
			}	
		});
		SgreenBar= new JSlider(JSlider.HORIZONTAL,0,255,0);//green scroll bar
		SgreenBar.addChangeListener(new ChangeListener()
		{
			JLabel label=ScrollBarDemo.label;

			@Override
			public void stateChanged(ChangeEvent e)
			{
				JSlider source = (JSlider)e.getSource();
				
				green= source.getValue();
				label.setForeground(new Color(red, green, blue));
				
			}	
		});
	}
}