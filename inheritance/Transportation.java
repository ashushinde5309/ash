package inheritance;

public class Transportation {

		private double cap;
		private double sp;
		private double time;
		public Transportation(double cap, double sp, double time) 
		{
			super();
			this.cap = cap;
			this.sp = sp;
			this.time = time;
		}
		
		public void display()
		{
			System.out.println("Transport");
		}
		
		public String toString() {
			return "Transportation [cap=" + cap + ", sp=" + sp + ", time=" + time + "]";
		}
		
		
		
		

	

}
