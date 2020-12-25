import java.awt.*;
import java.awt.event.*;
public class conversion extends Frame 
{
	TextField t;
	GridLayout g;
	Panel p1,p2;
	Button b[];
	Button b1[];	
    public conversion()
    {
    	t=new TextField();
    	p1=new Panel();
    	p2=new Panel();
    	Button b[]=new Button[21];
    	Button b1[]=new Button[7];
    	p1.setLayout(new GridLayout(7,3,2,2));
    	p2.setLayout(new GridLayout(7,1,2,2));
    	add(t,BorderLayout.NORTH);
    	setTitle("Conversion");
    	for(int i=0;i<21;i++)
    	{
    		b[i]=new Button();
    		p1.add(b[i]);
    	}
    	b[0].setLabel("AC");
    	b[1].setLabel("BACK");
    	b[2].setLabel("QUIT");
    	b[3].setLabel("1");
    	b[4].setLabel("2");
    	b[5].setLabel("3");
    	b[6].setLabel("4");
    	b[7].setLabel("5");
    	b[8].setLabel("6");
    	b[9].setLabel("7");
    	b[10].setLabel("8");
    	b[11].setLabel("9");
    	b[12].setLabel(".");
    	b[13].setLabel("0");
    	b[14].setLabel("=");
    	b[15].setLabel("A");
    	b[16].setLabel("B");
    	b[17].setLabel("C");
    	b[18].setLabel("D");
    	b[19].setLabel("E");
    	b[20].setLabel("F");
    	add(p1,BorderLayout.CENTER);
    	p1.setBackground(Color.lightGray);
    	p2.setBackground(Color.LIGHT_GRAY);
    	//p3.setBackground(Color.LIGHT_GRAY);
    	t.setBackground(Color.CYAN);
    	for(int i=0;i<7;i++)
    	{
    	b1[i]=new Button();
    		p2.add(b1[i]);	
    	}
    		b1[0].setLabel("D TO B");
    		b1[1].setLabel("D TO O");
    		b1[2].setLabel("D TO H");
    		b1[3].setLabel("B TO D");
    		b1[4].setLabel("O TO D");
    		b1[5].setLabel("H TO D");
    		b1[6].setLabel("ROMAN");
    		add(p2,BorderLayout.EAST);	
    		setVisible(true);
    		setBounds(1025,400,300,250);
    		b[0].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    				t.setText(" ");
    				//	btn[13].setEnabled(true);
    			} 
    		});
    		b[1].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{	
		    	
    			
					int len;
        		  	String str=t.getText();
          			len=str.length();
          			if(len>=1)
            		str=str.substring(0,len-1);
          			t.setText(str);
				    			
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
    			
    				t.setText(t.getText()+"1");
    			
    		} 
    		});
    		b[4].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    			
    				t.setText(t.getText()+"2");
    			
    		} 
    		});
    		b[5].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    			
    				t.setText(t.getText()+"3");
    			
    			} 
    		});
    		b[6].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    			
    				t.setText(t.getText()+"4");
    			
    			} 
    		});
    		b[7].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    			
    				t.setText(t.getText()+"5");
    			
    			} 
    		});
    		b[8].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    			
    				t.setText(t.getText()+"6");
    			
    			} 
    		});
    		b[9].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    			
    				t.setText(t.getText()+"7");
    			
    			} 
    		});
    		b[10].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    			
    				t.setText(t.getText()+"8");
    			
    			} 
    		});
    		b[11].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    			
    				t.setText(t.getText()+"9");
    			
    			} 
    		});
    		b[12].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    			
    				t.setText(t.getText()+".");
    			
    			} 
    		});
    		b[13].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    			
    				t.setText(t.getText()+"0");
    			
    			} 
    		});
    		b[14].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    			
    				t.setText(t.getText()+"=");
    			
    			} 
    		});
    		b[15].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    			
    				t.setText(t.getText()+"A");
    			
    			} 
    			
    		});
    		b[16].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    			
    				t.setText(t.getText()+"B");
    			
    			} 
    		});
    		b[17].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    			
    				t.setText(t.getText()+"C");
    			
    			} 
    		});
    		b[18].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    			
    				t.setText(t.getText()+"D");
    			
    			} 
    		});
    		b[19].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    			
    				t.setText(t.getText()+"E");
    			
    			} 
    		});
    		b[20].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    			
    				t.setText(t.getText()+"F");
    			
    			} 
    		});
    		b1[2].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    				try
    				{
    					int a=Integer.parseInt(t.getText());
        			String str = Integer.toHexString(a);
      				t.setText(str+"");
    				}
    				catch(Exception ex)
    				{
    					t.setText("Error");
    				}
    			} 
    		});
	    	b1[1].addActionListener(new ActionListener()
	    	{
	    		public void actionPerformed(ActionEvent ae)
	    		{
	    			try
	    			{
	    				int a=Integer.parseInt(t.getText());
	        		String str = Integer.toOctalString(a);
	      			t.setText(str+"");
	    			}
	    			catch(Exception ex)
	    			{
	    				t.setText("Error");
	    			}
	    		} 
	    	});
	    	b1[0].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    				try
    				{
    					int a=Integer.parseInt(t.getText());
        			String str = Integer.toBinaryString(a);
      				t.setText(str+"");
    				}
    				catch(Exception ex)
    				{
    					t.setText("Error");
    				}
    			} 
    		});
	    	b1[5].addActionListener(new ActionListener()
	    	{
	    		public void actionPerformed(ActionEvent ae)
	    		{
	    			try
	    			{
	    				String str=t.getText();
	    			int a = Integer.parseInt(str, 16);
	        		//	String str = Integer.toBinaryString(a);
	      			t.setText(a+"");
	    			}
	    			catch(Exception ex)
	    			{
	    				t.setText("Error");
	    			}
	    		} 
	    	});
	    	b1[3].addActionListener(new ActionListener()
	    	{
	    		public void actionPerformed(ActionEvent ae)
	    		{
	    			try
	    			{
	    				String str=t.getText();
	    			int a = Integer.parseInt(str, 2);
	        		//	String str = Integer.toBinaryString(a);
	      			t.setText(a+"");
	    			}
	    			catch(Exception ex)
	    			{
	    				t.setText("Error");
	    			}
	    		} 
	    	});
	    	b1[4].addActionListener(new ActionListener()
	    	{
	    		public void actionPerformed(ActionEvent ae)
	    		{
	    			try
	    			{
	    				String str=t.getText();
	    			int a = Integer.parseInt(str, 8);
	        		//	String str = Integer.toBinaryString(a);
	      			t.setText(a+"");
	    			}
	    			catch(Exception ex)
	    			{
	    				t.setText("Error");
	    			}
	    		} 
	    	});
	    	b1[6].addActionListener(new ActionListener()
	    	{
	    		public void actionPerformed(ActionEvent ae)
	    		{
	    	
					try
					{
						int num=Integer.parseInt(t.getText());
					if(num>0 && num<4000) 
					{
					 
				
						String thou[]={"","M","MM","MMM"};
						String hund[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
						String ten[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
						String unit[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
					 
					
						int th=num/1000;
						int h=(num/100)%10;
						int t1=(num/10)%10;
						int u=num%10;
					 
						t.setText(thou[th]+hund[h]+ten[t1]+unit[u]);
				
					}
					}
					catch(Exception ex)
					{
						t.setText("Error");
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