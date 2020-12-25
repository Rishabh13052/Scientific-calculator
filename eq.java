import java.awt.*;
import java.awt.event.*;
public class eq extends Frame{
	TextField t1,t2,t3,t4,t5;
	Panel p1;
	GridLayout g;
	Label l1,l2,l3,l4;
	Button b1,b2,b3,b4,b5;
    public eq() {
    	t1=new TextField();
    	t2=new TextField();
    	t3=new TextField();
    	t4=new TextField();
    	t5=new TextField();
    	l1=new Label("a(x³)",Label.CENTER);
    	l2=new Label("b(x²)",Label.CENTER);
    	l3=new Label("c(x)",Label.CENTER);
    	l4=new Label("d()",Label.CENTER);
    	b1=new Button("RESET");
    	b2=new Button("RESULT");
    	Panel p1=new Panel();
    	setTitle("Equation");
    	p1.setLayout(new GridLayout(5,2,5,5));
   		p1.add(l1);
    	p1.add(t2);
    	p1.add(l2);
    	p1.add(t3);
    	p1.add(l3);
    	p1.add(t4);
    	p1.add(l4);
    	p1.add(t5);
    	p1.add(b1);
    	p1.add(b2);
    	add(t1,BorderLayout.NORTH);
    	add(p1,BorderLayout.CENTER);
    	setBounds(50,400,300,250);
    	setVisible(true);
    	p1.setBackground(Color.lightGray);
    	t1.setBackground(Color.CYAN);
    	b1.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent ae)
    		{
    			t1.setText(" ");
    			t2.setText(" ");
    			t3.setText(" ");
    			t4.setText(" ");
    			t5.setText(" ");
    			
    			
    		}
    	});
    	b2.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent ae)
    		{
    			try
    			{
    			
	    			double k=Double.parseDouble(t2.getText());
	    			//double b=Double.parseDouble(t1.getText());
	    			double l=Double.parseDouble(t3.getText());
	    			double m=Double.parseDouble(t4.getText());
	    			double n=Double.parseDouble(t5.getText());
	    			if(k==0.0)
	    			{
	    				double o=m*m-4*l*n;
	    				if(o>=0)
	    				{
	    					double p=((-m+o)/(2*l));
	    					double q=((-m-o)/(2*l));
	    					t1.setText("x1="+p+",x2="+q);	
	    				}
	    				else{
	    				
	    					String str1="IMAGINARY ROOTS";
	    					t1.setText(str1+"");}
	    			}
	    			
	    				if(k!=0.0){
	    			
	    				double f=(((3*m)/k)-((l*l)/(k*k)))/3;
	    				double g=(((2*l*l*l)/(k*k*k))-((9*l*m)/(k*k))+((27*n)/k))/27;
	    				double h=((g*g)/4+(f*f*f)/27);
	    				if(h<=0.0)
	    				{
	    					double i1=Math.sqrt((g*g)/4-h);
	    					double j1=Math.cbrt(i1);
	    					double k1=Math.acos(-(g/(2*i1)));
	    					double l1=j1*(-1);
	    					double m1=Math.cos(k1/3);
	    					double n1=Math.sqrt(3)*Math.sin(k1/3);
	    					double p1=-(l/(3*k));
	    					double x1=2*j1*Math.cos(k1/3)+p1;
	    					double x2=l1*(m1+n1)+p1;
	    					double x3=l1*(m1-n1)+p1;
	    				//	t1.setText(k1+"");
	    					t1.setText("x1="+x1+",x2="+x2+",x3="+x3);
	    					if(g==0.0  && h==0.0)
	    					{
	    					 x1=-(Math.cbrt(n/k));
	    					 x2=-(Math.cbrt(n/k));
	    					 x3=-(Math.cbrt(n/k));
	    					//t1.setText(x1+"");
	    					t1.setText("x1="+x1+",x2="+x2+",x3="+x3);
	    						
	    					}
	    				}
	    				
	    				if(h>0.0)
	    				{
	    					
	    					double r1=-(g/2)+Math.sqrt(h);
	    					double s1=Math.cbrt(r1);
	    					double t2=-(g/2)-(Math.sqrt(h));
	    					double u1=Math.cbrt(t2);
	    					double x1=(s1+u1)-(l/(3*k));
	    					t1.setText("x1="+x1+",Other two are imaginary");
	    				}
	    			}
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