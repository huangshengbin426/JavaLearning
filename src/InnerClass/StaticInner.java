package InnerClass;

public class StaticInner {

	private static int a = 4;
	private int b = 3;
	public static class Inner {
		public void test(){
			//��̬�ڲ�����Է����ⲿ��ľ�̬��Ա������ֻ�ܷ��ʾ�̬��
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInner.Inner inner = new StaticInner.Inner();
		inner.test();
	}

}

