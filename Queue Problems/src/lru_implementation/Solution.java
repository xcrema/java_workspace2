package lru_implementation;

import java.util.*;

public class Solution {
	
	static Deque<Integer> dq;
	static HashSet<Integer> map;
	static int csize;
	
	Solution(int n){
		dq = new LinkedList<Integer>();
		map = new HashSet<Integer>();
		csize = n;
	}
	public void refer(int x) {
		if(!map.contains(x)) {
			if(dq.size() == csize) {
				int last = dq.removeLast();
				map.remove(last);
			}
		}
		else {
			int index = 0, i = 0;
			Iterator<Integer> itr = dq.iterator();
			while(itr.hasNext()) {
				if(itr.next() == x) {
					index = i;
					break;
				}
				i++;
			}
			dq.remove(index);
		}
		dq.addFirst(x);
		map.add(x);
	}
	public void display() {
		Iterator<Integer> itr = dq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public static void main(String[] args) {
		Solution ca = new Solution(4);
		ca.refer(1); 
        ca.refer(2); 
        ca.refer(3); 
        ca.refer(1); 
        ca.refer(4); 
        ca.refer(5); 
        ca.display();
	}
}
