package SingletonPattern;

import java.util.Random;

//���ӽӴ�����
public class Minister{
	public static void main(String[] args) {
		//����4λ����
		int ministerNum=4;
		Random r=new Random();
		for(int i=0;i<ministerNum;i++){
			Guest guest=Guest.getInstance();
			System.out.print("��"+(i+1)+"λ���ӽӴ����ǣ� ");
			guest.say();
		}
	}
}
