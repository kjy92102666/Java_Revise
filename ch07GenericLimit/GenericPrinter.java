package ch07;

public class GenericPrinter<T extends Meterial>  {//<>�ȿ� ���Ե� Ŭ������ ����� ���ڴ�~
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
