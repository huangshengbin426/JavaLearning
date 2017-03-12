package InnerClass;

import java.util.Date;

public class AnonymousInnerClass {

	public String getDate(Date date){
		return date.toLocaleString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousInnerClass inner = new AnonymousInnerClass();
		String str1 = inner.getDate(new Date());
		System.out.println(str1);
		System.out.println("===================");
		//ʹ�������ڲ���
		String str2 = inner.getDate(new Date(){});
		//ʹ���˻����ţ����ǲ��������ݣ�ִ�н�����������ȫһ��
		//������һ���̳���Date�������Ķ���
		System.out.println(str2);
		
		String str3 = inner.getDate(new Date(){
			public String getDate(Date date){
				return "inner class," + date.toLocaleString();
			}
			//����ΪDate���ڲ��࣬����Ҫ��дDate�еķ���
			//��д�����еķ���
			@Override
			public String toLocaleString(){
				return "inner class," + super.toLocaleString();
			}
		});
		System.out.println(str3);
	}

}
