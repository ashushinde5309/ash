package inheritance;

public class ByAir extends ByWater
{
	protected double tim;
	protected double fuel;
	public ByAir(double cap, double sp, double time, double timereq, int attacksonShip, double tim, double fuel) {
		super(cap, sp, time, timereq, attacksonShip);
		this.tim = tim;
		this.fuel = fuel;
	}
	@Override
	public String toString() {
		return "ByAir [tim=" + tim + ", fuel=" + fuel + ", timereq=" + timereq + ", attacksonShip=" + attacksonShip
				+ "]";
	}
	
	

}
