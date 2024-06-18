
public class RandomEnemy extends Enemy{
	public RandomEnemy(double x,double y,double vx,double vy) {
		super(x,y,vx,vy);
	}
	public void move() {
		super.move();
		vx=Math.random()*4-2;

}
	public void draw(MyFrame f) {
		f.setColor(0,255,0);
		f.fillRect(x-15, y, 10, 20);
		f.setColor(0,255,0);
		f.fillRect(x+5, y, 10, 20);
		f.setColor(0,255,0);
		f.fillRect(x-5, y+20, 10, 10);
}}