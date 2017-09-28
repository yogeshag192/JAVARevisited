package threads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestThread {

	public static void main(String[] args) throws InterruptedException {
		
		//MethodClass m1 = new MethodClass();
		Map <String, Integer> map = new HashMap<>();
		Map <String, Integer> map2 = Collections.synchronizedMap(map);
		
		Thread t1 = new Thread("Thread - 1"){
			public void run(){
				/*MethodClass m1 = new MethodClass();
				m1.method1();*/
				System.out.println("Thread - 1 Started..");
				map2.put("thread1", 1);
				
				map2.put("thread1", 2);
		
				map2.put("thread1", 3);
			
				map2.put("thread1", 4);
	
				Iterator it = (Iterator)map2.keySet().iterator();
				
				while (it.hasNext()){
					String key = (String) it.next();
					int value = map.get(key);
					System.out.println("Key: " +key + " Value: " +value);
					
				}
			}
		};
		
		Thread t2 = new Thread("Thread - 2"){
			public void run(){
			/* MethodClass m1 = new MethodClass();
			 m1.method1();*/
			System.out.println("Thread - 2 Started..");
			map2.put("thread2", 1);
		
			map2.put("thread2", 2);
		
			map2.put("thread2", 3);
		
			map2.put("thread2", 4);
			
			Iterator it1 = (Iterator)map2.keySet().iterator();
			
			while (it1.hasNext()){
				String key = (String) it1.next();
				int value = map.get(key);
				System.out.println("Key: " +key + " Value: " +value);
				
			}
			
			
			}
		};

		
		t1.start();
		//t1.join();
		t2.start();
	}

}
