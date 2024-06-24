
public class DropEnemy extends Enemy{
	public DropEnemy(double x,double y,double vx,double vy) {
		super(x,y,vx,vy);
		life=1;
	}
	public void move() {
		super.move();
		vy=vy+0.1;
	}
	public void draw(MyFrame f) {
		f.setColor(0,255,0);
		f.fillRect(x-15, y, 30, 10);
		f.setColor(0,255,0);
		f.fillRect(x-5, y+10, 10, 20);
		
}
}