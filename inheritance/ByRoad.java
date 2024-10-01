package inheritance;

public class ByRoad extends ByAir
{
	protected double timetaken;
	protected int accOccurs;
	public ByRoad(double cap, double sp, double time, double timereq, int attacksonShip, double tim, double fuel,
			double timetaken, int accOccurs) {
		super(cap, sp, time, timereq, attacksonShip, tim, fuel);
		this.timetaken = timetaken;
		this.accOccurs = accOccurs;
	}
	@Override
	public String toString() {
		return "ByRoad [timetaken=" + timetaken + ", accOccurs=" + accOccurs + ", tim=" + tim + ", fuel=" + fuel
				+ ", timereq=" + timereq + ", attacksonShip=" + attacksonShip + "]";
	}
	
	
}
