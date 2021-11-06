package Stream;
	
class Trader{
		String name;
		String city;
		public Trader(String name, String city) {
			super();
			this.name = name;
			this.city = city;
		}
		
		@Override
		public String toString() {
			 
			return name+" "+ city;
		}
		
}


