
public class PlayerBullet extends Character{
	public PlayerBullet(double x,double y,double vx,double vy) {
		
		super(x,y,vx,vy);
	}
	public void draw(MyFrame f) {
		f.setColor(90,128,90);
		f.fillRect(x, y, 30, 30);
		
	}

}
