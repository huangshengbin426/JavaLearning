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
		//使用匿名内部类
		String str2 = inner.getDate(new Date(){});
		//使用了花括号，但是不填入内容，执行结果和上面的完全一致
		//生成了一个继承了Date类的子类的对象
		System.out.println(str2);
		
		String str3 = inner.getDate(new Date(){
			public String getDate(Date date){
				return "inner class," + date.toLocaleString();
			}
			//是作为Date的内部类，所以要重写Date中的方法
			//重写父类中的方法
			@Override
			public String toLocaleString(){
				return "inner class," + super.toLocaleString();
			}
		});
		System.out.println(str3);
	}

}
