import java.awt.*;
import java.awt.event.*;

public class trig extends Frame
{
	TextField l;
	GridLayout g;
	Panel p1,p2,p3;
	Checkbox cb1,cb2;
	CheckboxGroup cbg;
	Button b[];
    public trig() 
    {
    	l=new TextField();
    	Button b[]=new Button[12];
    	cbg=new CheckboxGroup();
    	cb1=new Checkbox("Radian",cbg,false);
    	cb2=new Checkbox("Degree",cbg,true);
    	Panel p1=new Panel();
    	p2=new Panel();
    	p3=new Panel();
    	p2.setLayout(new GridLayout(1,2));
    	p3.setLayout(new GridLayout(1,2));
    	p1.setLayout(new GridLayout(3,3,5,5));
    	setTitle("Trigonometric  function");
    	p1.setBackground(Color.lightGray);
    	p2.setBackground(Color.LIGHT_GRAY);
    	p3.setBackground(Color.LIGHT_GRAY);
    	l.setBackground(Color.CYAN);
    	for(int i=0;i<9;i++)
    	{
    		 b[i]=new Button();
    		p1.add(b[i]);
    	}
    	b[0].setLabel("C");
    	b[1].setLabel("BACK");
    	b[2].setLabel("QUIT");
    	b[3].setLabel("sin x");
    	b[4].setLabel("cos x");
    	b[5].setLabel("Tan x");
    	b[6].setLabel("cot x");
    	b[7].setLabel("sec x");
    	b[8].setLabel("cosec x");
    	add(p2,BorderLayout.NORTH);
    	p2.add(p3);
    	p2.add(l);
    	p3.add(cb2);
    	p3.add(cb1);
    	add(p1,BorderLayout.CENTER);
    	b[0].addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent ae)
    		{
    			l.setText("");
    		} 
    	});
    	b[1].addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent ae)
    		{	
		    	int len;
         		String str=l.getText();
          		len=str.length();
          		if(len>=1)
            	str=str.substring(0,len-1);
          		l.setText(str);
    		} 
    	});
    	b[2].addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent ae)
    		{
    			dispose();
    		} 
    	});
    	b[3].addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent ae)
    		{	
    			try
    			{
    				if(cb1.getState()==true)
    			{
    				double x=Double.parseDouble(l.getText());
    				
    				double b=Math.sin(x);
    				l.setText(b+"");
    				
    			}
    			if(cb2.getState()==true)
    			{
    		
    				double x=Double.parseDouble(l.getText());
    				x=(Math.PI*x)/180;
    				double b=Math.sin(x);
    				l.setText(b+"");
    				
    			}
    			}
    			catch(Exception ex)
    			{
    				l.setText("Error");
    			}
    		} 
    	});
    	
    	b[4].addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent ae)
    		{
    			try
    			{
    				if(cb1.getState()==true)
    			{
    		
    				double x=Double.parseDouble(l.getText());
    				
    				double b=Math.cos(x);
    				l.setText(b+"");
    				
    			}
    			if(cb2.getState()==true)
    			{
    		
    			double x=Double.parseDouble(l.getText());
 				x=(Math.PI*x)/180;
    			double b=Math.cos(x);
    			l.setText(b+"");
    				
    			}
    			}
    			catch(Exception ex)
    			{
    				l.setText("Error");
    			}
    		} 
    	});
    	b[5].addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent ae)
    		{
    			try
    			{
    				if(cb1.getState()==true)
    			{
    		
    				double x=Double.parseDouble(l.getText());
    				
    				double b=Math.tan(x);
    				l.setText(b+"");
    				
    			}
    			if(cb2.getState()==true)
    			{
    		
    				double x=Double.parseDouble(l.getText());
    				x=(Math.PI*x)/180;
    				double b=Math.tan(x);
    				l.setText(b+"");
    				
    			}
    			}
    			catch(Exception ex)
    			{
    				l.setText("Error");
    			}
    		} 
    	});
    	b[6].addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent ae)
    		{
    			try
    			{
    				if(cb1.getState()==true)
    			{
    		
    				double x=Double.parseDouble(l.getText());
    				
    				double b=1/Math.tan(x);
    				l.setText(b+"");
    				
    			}
    			if(cb2.getState()==true)
    			{
    		
    				double x=Double.parseDouble(l.getText());
    				x=(Math.PI*x)/180;
    				double b=1/Math.tan(x);
    				l.setText(b+"");
    				
    			}
    			}
    			catch(Exception ex)
    			{
    				l.setText("Error");
    			}
    		} 
    	});
    	b[7].addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent ae)
    		{
    			try
    			{
    				if(cb1.getState()==true)
    			{
    		
    				double x=Double.parseDouble(l.getText());
    				
    				double b=1/Math.cos(x);
    				l.setText(b+"");
    				
    			}
    			if(cb2.getState()==true)
    			{
    		
    				double x=Double.parseDouble(l.getText());
    				x=(Math.PI*x)/180;
    				double b=1/Math.cos(x);
    				l.setText(b+"");
    				
    			}
    			}
    			catch(Exception ex)
    			{
    				l.setText("Error");
    			}
    		} 
    	});
    	b[8].addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent ae)
    		{
    			try
    			{
    				if(cb1.getState()==true)
    			{
    		
    				double x=Double.parseDouble(l.getText());
    				
    				double b=1/Math.sin(x);
    				l.setText(b+"");
    				
    			}
    			if(cb2.getState()==true)
    			{
    		
    				double x=Double.parseDouble(l.getText());
    				x=(Math.PI*x)/180;
    				double b=1/Math.sin(x);
    				l.setText(b+"");
    				
    			}
    			}
    			catch(Exception ex)
    			{
    				l.setText("Error");
    			}
    		} 
    	});
    	setVisible(true);
    	setBounds(375,100,300,250);
    	addWindowListener(new WindowAdapter()
    	{
	 		public void windowClosing(WindowEvent we)
			{
				dispose();
	 		}
	 	});
    	
    }
}    
    
