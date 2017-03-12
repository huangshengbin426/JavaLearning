package InnerClass;

public class StaticInner {

	private static int a = 4;
	private int b = 3;
	public static class Inner {
		public void test(){
			//静态内部类可以访问外部类的静态成员，并且只能访问静态的
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInner.Inner inner = new StaticInner.Inner();
		inner.test();
	}

}

