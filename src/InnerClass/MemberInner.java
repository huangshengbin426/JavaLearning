package InnerClass;

public class MemberInner {

	private int a = 1;
	private int b = 2;
	
	public class Inner {
		private int a = 3;
		public void test(){
			//ֱ�ӷ����ⲿ�����
			System.out.println(b);
			//���ʵ����ڲ����е�a
			System.out.println(a);
			//��δ��ڲ�����ʵ��ⲿ���е�ͬ������
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
