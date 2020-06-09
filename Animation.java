import java.awt.*;
class Animation extends Frame
{
	public void paint(Graphics g)
	{	
		int x[]={90,90,140,160,300,345,395,405};
		int y[]={430,400,385,340,340,385,395,430};
		int a= 165,b=240,c=155,d=310;

		g.setColor(Color.orange);
		g.fillOval(150,80,80,80);
		g.drawLine(180,120,300,180);
		g.drawLine(180,120,270,180);
		g.drawLine(180,120,240,180);
		g.drawLine(180,120,210,180);
		g.drawLine(180,120,190,180);

	{	
		g.setColor(Color.red);
		g.fillPolygon(x,y,8);
		g.setColor(Color.darkGray);
		g.fillRect(0,450,800,150);

		g.setColor(Color.black);
		g.fillRect(a,350,60,40);
		g.fillRect(b,350,60,40);
		g.fillOval(c,400,45,45);
		g.fillOval(d,400,45,45);

		g.fillRect(610,252,10,200);
		g.fillRect(590,152,50,160);

		g.setColor(Color.red);
		g.fillOval(595,160,40,40);
		try
		{
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
		}
		g.setColor(Color.black);
		g.fillOval(595,160,40,40);
		
		g.setColor(Color.yellow);
		g.fillOval(595,210,40,40);
		try
		{
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
		}
		g.setColor(Color.black);
		g.fillOval(595,210,40,40);

		g.setColor(Color.green);
		g.fillOval(595,260,40,40);

		for(;x[5]<=1000;a=a+5,b=b+5,c=c+5,d=d+5,x[0]=x[0]+5,x[1]=x[1]+5,x[2]=x[2]+5,x[3]=x[3]+5,x[4]=x[4]+5,x[5]=x[5]+5,x[6]=x[6]+5,x[7]=x[7]+5)								
		{
			g.setColor(Color.red);
			g.fillPolygon(x,y,8);
			g.setColor(Color.black);
			g.fillRect(a,350,60,40);
			g.fillRect(b,350,60,40);
			g.fillOval(c,400,45,45);
			g.fillOval(d,400,45,45);
			try
			{
				Thread.sleep(40);
			}
			catch(Exception e)
			{
			}
			g.setColor(Color.cyan);
			g.fillPolygon(x,y,8);
			g.fillRect(a,350,60,40);
			g.fillRect(b,350,60,40);
			g.fillOval(c,400,45,45);
			g.fillOval(d,400,45,45);

			g.setColor(Color.black);
			g.fillRect(610,300,10,152);
		}

		try
		{
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
		}

		g.setColor(Color.black);
		g.fillOval(595,260,40,40);

	repaint(); }		
	}
	public static void main(String ar[])
	{
		Animation ob=new Animation();
		ob.setTitle("Moving Car");
		ob.setSize(800,600);
		ob.setVisible(true);
		ob.setBackground(Color.cyan);
	}
}
