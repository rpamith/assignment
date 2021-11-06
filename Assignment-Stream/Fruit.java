package Stream;

class Fruit{
		String name;
		int calories;
		int price;
		String color;
		public Fruit(String name, int calories, int price, String color) {
			super();
			this.name = name;
			this.calories = calories;
			this.price = price;
			this.color = color;
		}
		@Override
		public String toString() {
			return "Fruit [name=" + name + ", calories=" + calories + ", price=" + price + ", color=" + color + "]";
		}
}
