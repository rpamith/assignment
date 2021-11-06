package Stream;

class Transiction{
		Trader trader;
		int year;
		int value;
		public Transiction(Trader trader, int year, int value) {
			super();
			this.trader = trader;
			this.year = year;
			this.value = value;
		}
		@Override
		public String toString() {
			
			  return trader.name +" "+year+ " " +value ;
		}
		

}
