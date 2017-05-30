import java.util.*;
import java.util.concurrent.*;

class LearnSingleton{
	
	public static void main(String args[]){
	Singleton obj=Singleton.getInstance();
		System.out.println(obj);
		Singleton obj1=obj.getInstance();
		System.out.println(obj1);
		Map<String ,Integer> map=new HashMap<String,Integer>();
		Map<String ,Integer> syncMap=Collections.synchronizedMap(map);
		ConcurrentHashMap<String ,Integer> conCurrMap= new ConcurrentHashMap<String,Integer>();
	}
}