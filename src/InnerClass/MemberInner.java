package InnerClass;

public class MemberInner {

	private int a = 1;
	private int b = 2;
	
	public class Inner {
		private int a = 3;
		public void test(){
			//直接访问外部类对象
			System.out.println(b);
			//访问的是内部类中的a
			System.out.println(a);
			//如何从内部类访问到外部类中的同名变量
			System.out.println(MemberInner.this.a);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberInner mi = new MemberInner();
		MemberInner.Inner inner = mi.new Inner();
		inner.test();
	}

}
