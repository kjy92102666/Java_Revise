package ch07;

public class GenericPrinter<T extends Meterial>  {//<>안에 기입된 클래스만 상속해 쓰겠다~
		private T things;
		
		public void setThings(T things) {
			this.things = things;
		}
		
		public T getThings() {
			return things;
		}
		
		public void printing() {
			things.doSomething();
	}
}
