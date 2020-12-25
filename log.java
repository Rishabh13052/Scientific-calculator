import java.awt.*;
import java.awt.event.*;
public class log extends Frame
 {
	TextField t1;
	GridLayout g;
	Panel p;
	Button b;
    public log() 
    {
    	t1=new TextField();
    	Button b[]=new Button[9];
    	p=new Panel();
    	p.setLayout(new GridLayout(3,3,5,5));
    	for(int i=0;i<9;i++)
    	{	
    		b[i]=new Button();
    		p.add(b[i]);
    	}
    		b[0].setLabel("AC");
    		b[1].setLabel("BACK");
    		b[2].setLabel("QUIT");
    		b[3].setLabel("log10 x");
    		b[4].setLabel("log2 x");
    		b[5].setLabel("loge x");
    		b[6].setLabel("antilog10 x");
    		b[7].setLabel("antilog2 x");
    		b[8].setLabel("antiloge x");
    		add(t1,BorderLayout.NORTH);
    		add(p,BorderLayout.CENTER);	
    		setVisible(true);
    		setBounds(700,400,300,250);	
    		setTitle("Logarithmic  Function");
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
    				try
    				{
    					double b=Double.parseDouble(t1.getText());  
	    		  		b=Math.log10(b);	
	    		  		t1.setText(b+"");
    				}
    				catch(Exception ex)
    				{
    					t1.setText("Error");
    				}
    		  	
    			} 
    		});
    		b[4].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    		  		try
    		  		{
    		  			double b=Double.parseDouble(t1.getText());  
	    		  		b=Math.log10(b)/0.301029995;	
	    		  		t1.setText(b+"");
    		  		}
    		  		catch(Exception ex)
    		  		{
    		  			t1.setText("Error");
    		  		}
    			} 
    		});
    		b[5].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    		  		try
    		  		{
    		  			double b=Double.parseDouble(t1.getText());  
	    		  		b=Math.log(b);	
	    		  		t1.setText(b+"");
    		  		}
    		  		catch(Exception ex)
    		  		{
    		  			t1.setText("Error");
    		  		}
    			} 
    		});
    		b[6].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    		  		try
    		  		{
    		  			double b=Double.parseDouble(t1.getText());  
	    		  		b=Math.pow(10, b);	
	    		  		t1.setText(b+"");
    		  		}
    		  		catch(Exception ex)
    		  		{
    		  			t1.setText("Error");
    		  		}
    			} 
    		});
    		b[7].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    		  		try
    		  		{
    		  			double b=Double.parseDouble(t1.getText());  
	    		  		b=Math.pow(2, b);	
	    		  		t1.setText(b+"");
    		  		}
    		  		catch(Exception ex)
    		  		{
    		  			t1.setText("Error");
    		  		}
    			} 
    		});
    		b[8].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    			  	try
    			  	{
    			  		double b=Double.parseDouble(t1.getText());  
	    		 	 	b=Math.pow(Math.E, b);	
	    		  		t1.setText(b+"");
    			  	}
    			  	catch(Exception ex)
    			  	{
    			  		t1.setText("Error");
    			  	}
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