package SingletonPattern;

import java.util.ArrayList;
import java.util.Random;

public class Guest {
    //��������ܲ�����ʵ��
	private static int maxNumOfGuest =8;
    //����ÿ�������˽������
	private static ArrayList<String> nameList=new ArrayList<String>();
    //�����б��������еĿ���
    private static ArrayList< Guest> guestList=new ArrayList< Guest>();
    //��ǰ���˵����
    private static int countNumOfGuest=0;
    //�������еĶ���
    static{
    	for(int i=0;i< maxNumOfGuest;i++)
          guestList.add(new Guest ("��"+(i+1)+"λ����"));
     }
	//Լ��
	private Guest(){   }
	//����������ƣ�����һ�����˶���
	private Guest (String name){
    	nameList.add(name);
	}
	//�����ȡһ�����˶���
	public static Guest getInstance(){
		Random random=new Random();
   		countNumOfGuest=random.nextInt(maxNumOfGuest) ;
   		return guestList.get(countNumOfGuest);
	}
	//��������
	public static void say(){
		System.out.println(nameList. get(countNumOfGuest));
	}
}
