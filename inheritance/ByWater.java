package inheritance;

public class ByWater extends Transportation
{
	protected double timereq;
	protected int attacksonShip;
	public ByWater(double cap, double sp, double time, double timereq, int attacksonShip) {
		super(cap, sp, time);
		this.timereq = timereq;
		this.attacksonShip = attacksonShip;
	}
	@Override
	public String toString() {
		return "ByWater [timereq=" + timereq + ", attacksonShip=" + attacksonShip + "]";
	}
	
	

}
