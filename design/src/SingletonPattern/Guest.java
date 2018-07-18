package SingletonPattern;

import java.util.ArrayList;
import java.util.Random;

public class Guest {
    //定义最多能产生的实例
	private static int maxNumOfGuest =8;
    //容纳每个对象的私有属性
	private static ArrayList<String> nameList=new ArrayList<String>();
    //定义列表，容纳所有的客人
    private static ArrayList< Guest> guestList=new ArrayList< Guest>();
    //当前客人的序号
    private static int countNumOfGuest=0;
    //产生所有的对象
    static{
    	for(int i=0;i< maxNumOfGuest;i++)
          guestList.add(new Guest ("第"+(i+1)+"位客人"));
     }
	//约束
	private Guest(){   }
	//传入客人名称，建立一个客人对象
	private Guest (String name){
    	nameList.add(name);
	}
	//随机获取一个客人对象
	public static Guest getInstance(){
		Random random=new Random();
   		countNumOfGuest=random.nextInt(maxNumOfGuest) ;
   		return guestList.get(countNumOfGuest);
	}
	//客人来了
	public static void say(){
		System.out.println(nameList. get(countNumOfGuest));
	}
}
