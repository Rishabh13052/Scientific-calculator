import java.awt.*;
import java.awt.event.*;
public class other extends Frame
 {
	TextField t1;
	GridLayout g;
	Panel p;
	Button b;
    public other() 
    {
    	t1=new TextField();
    	Button b[]=new Button[15];
    	p=new Panel();
    	p.setLayout(new GridLayout(5,3,5,5));
    	for(int i=0;i<15;i++)
    	{	
    		b[i]=new Button();
    		p.add(b[i]);
    	}
    		b[0].setLabel("AC");
    		b[1].setLabel("BACK");
    		b[2].setLabel("QUIT");
    		b[3].setLabel("square(x)");
    		b[4].setLabel("cube(x)");
    		b[5].setLabel("crt x");
    		b[6].setLabel("ciel x");
    		b[7].setLabel("floor x");
    		b[8].setLabel("abs x");
    		b[9].setLabel("todegrees x");
    		b[10].setLabel("toradians x");
    		b[11].setLabel("exp x");
    		b[12].setLabel("signum x");
    		b[13].setLabel("Round x");
    		b[14].setLabel("PIE");
    		add(t1,BorderLayout.NORTH);
    		add(p,BorderLayout.CENTER);	
    		setVisible(true);
    		setBounds(375,400,300,250);	
    		setTitle("other  Function");
    		p.setBackground(Color.lightGray);
    		t1.setBackground(Color.CYAN);
    		b[0].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    				t1.setText(" ");
    				//	btn[13].setEnabled(true);
    			} 
    		});
    		b[1].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{	
		    		int len;
          			String str=t1.getText();
          			len=str.length();
          			if(len>=1)
            		str=str.substring(0,len-1);
          			t1.setText(str);
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
    		  		double b=Double.parseDouble(t1.getText());  
    		  		b=b*b;	
    		  		t1.setText(b+"");
    			} 
    		});
    		b[4].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    		  		double b=Double.parseDouble(t1.getText());  
    		  		b=b*b*b;	
    		  		t1.setText(b+"");
    			} 
    		});
    		b[5].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    		  		double b=Double.parseDouble(t1.getText());  
    		  		b=Math.cbrt(b);	
    		  		t1.setText(b+"");
    			} 
    		});
    		b[6].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    		  		double b=Double.parseDouble(t1.getText());  
    		  		b=Math.ceil(b);	
    		  		t1.setText(b+"");
    			} 
    		});
    		b[7].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    		  		double b=Double.parseDouble(t1.getText());  
    		  		b=Math.floor(b);	
    		  		t1.setText(b+"");
    			} 
    		});
    		b[8].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    		  		double b=Double.parseDouble(t1.getText());  
    		  		b=Math.abs(b);	
    		  		t1.setText(b+"");
    			} 
    		});
    		b[9].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    		  		double b=Double.parseDouble(t1.getText());  
    		  		b=Math.toDegrees(b);	
    		  		t1.setText(b+"");
    			} 
    		});
    		b[10].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    		  		double b=Double.parseDouble(t1.getText());  
    		  		b=Math.toRadians(b);	
    		  		t1.setText(b+"");
    			} 
    		});
    		b[11].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    		  		double b=Double.parseDouble(t1.getText());  
    		  		b=Math.exp(b);	
    		  		t1.setText(b+"");
    			} 
    		});
    		b[12].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    		  		double b=Double.parseDouble(t1.getText());  
    		  		b=Math.signum(b);	
    		  		t1.setText(b+"");
    			} 
    		});
    		b[13].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    		  		double b=Double.parseDouble(t1.getText());  
    		  		b=Math.cbrt(b);	
    		  		t1.setText(b+"");
    			} 
    		});
    		b[14].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    		  		double b=Double.parseDouble(t1.getText());  
    		  		b=Math.PI;	
    		  		t1.setText(b+"");
    			} 
    		});
    		addWindowListener(new WindowAdapter()
    		{
	 			public void windowClosing(WindowEvent we)
				{
					dispose();
	 			}
	 		});

    }
 }
