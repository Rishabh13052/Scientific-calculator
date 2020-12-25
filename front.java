import java.util.Stack;
import java.awt.event.*;
import java.awt.*;
public class front extends Frame
	{
	int flag=0;
	TextField t1;
	Label l;
	Button btn[]=new Button[15];
	Button btn1[]=new Button[6];
   	Button btn2[]=new Button[10];
	Panel p1;
	Panel p2;
	Panel p3;
/*	inverse ob=new inverse();
	trig ob1=new trig();
	hyper ob2=new hyper();
	conversion ob3=new conversion();
	log ob4=new log();
	other ob5=new other();
	eq ob6=new eq();*/
	
    public front() 
    {
    	l=new Label("0",Label.RIGHT);
    	t1=new TextField();
    //	Button btn[]
    	/*ob.setVisible(false);
    	ob2.setVisible(false);
    	ob1.setVisible(false);
    	ob3.setVisible(false);
    	ob4.setVisible(false);
    	ob5.setVisible(false);
    	ob6.setVisible(false);*/
    	p1=new Panel();
    	p2=new Panel();
    	p3=new Panel();
    	t1.setBackground(Color.cyan);
    	p1.setLayout(new GridLayout(5,3,5,5));
    	p2.setLayout(new GridLayout(2,3,5,5));
    	p3.setLayout(new GridLayout(5,2,5,5));
    	p1.setBackground(Color.pink);
    	p2.setBackground(Color.PINK);
    	p3.setBackground(Color.pink);
    	for(int i=0;i<15;i++)
    	{
    		btn[i]=new Button();
    		p1.add(btn[i]);
    	}
    	btn[0].setLabel("C");
    	btn[1].setLabel("BACK");
    	btn[2].setLabel("QUIT");
    	btn[3].setLabel("1");
    	btn[4].setLabel("2");
    	btn[5].setLabel("3");
   		btn[6].setLabel("4");	
   		btn[7].setLabel("5");
    	btn[8].setLabel("6");
   		btn[9].setLabel("7");						
   		btn[10].setLabel("8");	
   		btn[11].setLabel("9");
   		btn[12].setLabel(".");
    	btn[13].setLabel("0");
    	btn[14].setLabel("=");
    	
    	for(int i=0;i<6;i++)
    	{
    		btn1[i]=new Button();
    		p2.add(btn1[i]);
    	}
    	btn1[0].setLabel("TRIG  FUN");
    	btn1[1].setLabel("INV  FUN");
    	btn1[2].setLabel("HYP  FUN");
    	btn1[3].setLabel("OTHER FUN");
    	btn1[4].setLabel("LOG FUN");
    	btn1[5].setLabel("CONVERSION");
    	for(int i=0;i<10;i++)
    	{
    		btn2[i]=new Button();
    		p3.add(btn2[i]);
    	}
    	btn2[0].setLabel("+");
    	btn2[1].setLabel("-");
    	btn2[2].setLabel("*");
    	btn2[3].setLabel("/");
    	btn2[4].setLabel("^");
		btn2[5].setLabel("%");
		btn2[6].setLabel("(");
		btn2[7].setLabel(")");
		btn2[8].setLabel("SQRT");
		btn2[9].setLabel("1/x");
    	add(t1,BorderLayout.NORTH);
    	add(p1,BorderLayout.CENTER);
    	add(p3,BorderLayout.EAST);
    	add(p2,BorderLayout.SOUTH);
    //	ob.setVisible(false);
    	pack();
    	setBounds(50,100,300,250);
    	setTitle("Calculator");
    		btn[0].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    				t1.setText("");
    				btn[13].setEnabled(true);
    			} 
    		});  

    		btn[1].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
		    		int l1;
		    		String str=t1.getText();
			        l1=str.length();
			        if(l1>=1)
			        str=str.substring(0,l1-1);
			        t1.setText(str);
			           			
    			} 
    		});
    		btn[2].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    			dispose();
    			
    			System.exit(0);
    		/*	ob1.dispose();
    			ob2.dispose();
    			ob3.dispose();
    			ob4.dispose();
    			ob5.dispose();
    			ob6.dispose();*/
    			} 
    		});
    		btn[3].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    				t1.setText(t1.getText()+"1");
    			} 
    		});
    		btn[4].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    				t1.setText(t1.getText()+"2");
    			} 
    		});
    		btn[5].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    				//int n=Integer.parseInt(l.getText());
    				t1.setText(t1.getText()+"3");
    			} 
    		});
    		btn[6].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    				//	int n=Integer.parseInt(l.getText());
    				t1.setText(t1.getText()+"4");
    			
    			} 
    		});
    		btn[7].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    				//int n=Integer.parseInt(l.getText());
    				t1.setText(t1.getText()+"5");
    			} 
    		});
    		btn[8].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    				//int n=Integer.parseInt(l.getText());
    				t1.setText(t1.getText()+"6");
    			} 
    		});
    		btn[9].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    				//	int n=Integer.parseInt(l.getText());
    				t1.setText(t1.getText()+"7");
    			} 
    		});
    		btn[10].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    				//int n=Integer.parseInt(l.getText());
    				t1.setText(t1.getText()+"8");
    			} 
    		});
    		btn[11].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    				 //double  n=Double.parseDouble(l.getText());
    				t1.setText(t1.getText()+"9");
    			} 
    		});
    		btn[12].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    				// double n=Double.parseDouble(l.getText());
    				t1.setText(t1.getText()+".");
    				String s=t1.getText();
    			/*	if(s.contains("."))
    					{
    					btn[12].setEnabled(false);	
    					}*/
    			} 
    		});
    		btn[13].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    				t1.setText(t1.getText()+"0");
    			} 
    		});
    		btn1[0].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    		    	trig ob=new trig();
    		    //	ob.trig();
    			} 
    		});
    		
    		addWindowListener(new WindowAdapter()
    		{
	 			public void windowClosing(WindowEvent we) 
				{
					dispose();
					System.exit(0);
	 			}
	 		});
	 		btn1[1].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    		    	inverse ob1=new	inverse();
    			} 
    		});
    		btn1[2].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    		    	hyper ob2=new	hyper();
    			} 
    		});
    		btn1[3].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    		    	other ob3=new	other();
    		    	eq ob4=new eq();
    			} 
    		});
    		btn1[4].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    		  		log ob5=new log();
    			} 
    		});	
    		btn1[3].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    		  		double b=Double.parseDouble(t1.getText());  
    		  		b=Math.log(b);	
    		  		t1.setText(b+"");
    		  	} 
    		});
    		btn1[5].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    		  		conversion ob6=new conversion();
    		  	} 
    		});
    	
    		btn2[0].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    				//int n=Integer.parseInt(l.getText());
    				t1.setText(t1.getText()+"+");
    			} 
    		});
    	
    		btn2[1].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    				//int n=Integer.parseInt(l.getText());
    				t1.setText(t1.getText()+"-");
    			} 
    		});
    	
    		btn2[2].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    				//int n=Integer.parseInt(l.getText());
    				t1.setText(t1.getText()+"*");
    			} 
    		});
    	
    		btn2[3].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    				//int n=Integer.parseInt(l.getText());
    				t1.setText(t1.getText()+"/");
    			} 
    		});
    	
    		btn2[4].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    				//int n=Integer.parseInt(l.getText());
    				t1.setText(t1.getText()+"^");
    			} 
    		});
    	
    		btn2[5].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    				//int n=Integer.parseInt(l.getText());
    				t1.setText(t1.getText()+"%");
    			} 
    		});
    	
    		btn2[6].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    				//int n=Integer.parseInt(l.getText());
    				t1.setText(t1.getText()+"(");
    			} 
    		});
    	
    		btn2[7].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    				//int n=Integer.parseInt(l.getText());
    				t1.setText(t1.getText()+")");
    			} 
    		});
    	
    		btn2[9].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    				Double a=Double.parseDouble(t1.getText());
    				if(a!=0)
    				{
    					Double b=1/a;
    					t1.setText(b+"");
    				}
    				else
    				{
    				t1.setText("error");
    				}
    			
    			} 
    		});
	 		btn2[8].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{
    				Double a=Double.parseDouble(t1.getText());
    				if(a>=0)
    				{
    					Double b= Math.sqrt(a);
    					t1.setText(b+"");
    				}
    				else
    				{
    					t1.setText("error");
    				}
    			
    			} 
    		});
    		btn[14].addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent ae)
    			{	
    				try{
    					
    				String str=t1.getText();
    		 		Stack<Integer> op  = new Stack<Integer>();
        			Stack<Double> val = new Stack<Double>();
			        
			        Stack<Integer> optmp  = new Stack<Integer>();
			        Stack<Double> valtmp = new Stack<Double>();
			        
			        String input = str;
			        input = "0" + input;
			        input = input.replaceAll("-","+-");
			        
			        String temp = "";
			        for (int i = 0;i < input.length();i++)
			        {
			            char ch = input.charAt(i);
			            if (ch == '-')
			                temp = "-" + temp;
			            else if (ch != '+' &&  ch != '*' && ch != '/' && ch != '^' && ch !='%')
			               temp = temp + ch;
			            else
			            {
			                val.push(Double.parseDouble(temp));
			                op.push((int)ch);
			                temp = "";
			            }
			        }
			        val.push(Double.parseDouble(temp));
			        
			        char operators[] = {'^','/','*','%','+'};
			        
			        for (int i = 0; i < 6; i++)
			        {
			            boolean it = false;
			            while (!op.isEmpty())
			            {
			                int optr = op.pop();
			                double v1 = val.pop();
			                double v2 = val.pop();
			                if (optr == operators[i])
			                {
			                    
			                     if (i == 0)
			                    {
			                        valtmp.push(Math.pow(v2 , v1));
			                        it = true;
			                        break;
			                    }
			                    if (i == 1)
			                    {
			                        valtmp.push(v2 / v1);
			                        it = true;
			                        break;
			                    }
			                    else if (i == 2)
			                    {
			                        valtmp.push(v2 * v1);
			                        it = true;
			                        break;
			                    }
			                     else if (i == 3)
			                    {
			                        valtmp.push(v2 % v1);
			                        it = true;
			                        break;
			                    }
			                    else if (i == 4)
			                    {
			                        valtmp.push(v2 + v1);
			                        it = true;
			                        break;
			                    }                                        
			                }
			                else
			                {
			                    valtmp.push(v1);
			                    val.push(v2);
			                    optmp.push(optr);
			                }                
			            }    
			            while (!valtmp.isEmpty())
			                val.push(valtmp.pop());
			            while (!optmp.isEmpty())
			                op.push(optmp.pop());
			            if (it)
			                i--;                            
			        }    
			       
			       t1.setText(val.pop()+"");  }
			       catch(Exception ex){
			       	t1.setText("error" );
			       }  
    			}
    		 });
    		setVisible(true); 
		}
	}