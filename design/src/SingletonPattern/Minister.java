package SingletonPattern;

import java.util.Random;

//妻子接待客人
public class Minister{
	public static void main(String[] args) {
		//定义4位妻子
		int ministerNum=4;
		Random r=new Random();
		for(int i=0;i<ministerNum;i++){
			Guest guest=Guest.getInstance();
			System.out.print("第"+(i+1)+"位妻子接待的是： ");
			guest.say();
		}
	}
}
