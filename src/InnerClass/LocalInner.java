package InnerClass;

public class LocalInner {

	private int a = 1;
	public void test() {
		int b = 2;
		final int c = 3;
		
		class Inner{
			public void test(){
				System.out.println(a);
//				System.out.println(b); //�����Է��ʷ�final�ľֲ�����
				System.out.println(c);
			}
		}
		Inner inner = new Inner();
		inner.test();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInner li = new LocalInner();
		li.test();
	}

}
