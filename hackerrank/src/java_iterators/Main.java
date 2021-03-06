
package java_iterators;

import java.util.*;
public class Main{
	
   @SuppressWarnings("rawtypes")
   static Iterator func(ArrayList mylist){
      Iterator it=mylist.iterator();
      while(it.hasNext()){
         Object element = it.next();
         if(element instanceof String)//Hints: use instanceof operator

			break;
		}
      return it;
      
   }
   
   @SuppressWarnings({ "unchecked", "rawtypes" })
   public static void main(String []args){
      ArrayList mylist = new ArrayList();
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      for(int i = 0;i<n;i++){
         mylist.add(sc.nextInt());
      }
      
      mylist.add("###");
      for(int i=0;i<m;i++){
         mylist.add(sc.next());
      }
      
      Iterator it=func(mylist);
      //Iterator it = mylist.iterator();
      while(it.hasNext()){
         Object element = it.next();
         //System.out.println(element.getClass().getName());
         System.out.println((String)element);
      }
      sc.close();
   }
}
