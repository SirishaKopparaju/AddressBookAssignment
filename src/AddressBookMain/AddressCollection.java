package AddressBookMain;
	import java.util.*;
	import java.util.function.Function;
	import java.util.function.Predicate;
	public class AddressCollection {
	    public static void main(String[] args) {
	        doListDemo();
	        doStackDemo();
	        doQueueDemo();
	        doSetDemo();
	        doMapDemo();
	    }

	    private static void doStackDemo() {
	        System.out.println("In doStackDemo");
	        Stack<String> stack = new Stack();
	        stack.push("Sirisha");
	        stack.push("Sowjanya");
	        stack.push("Vamshi");
	        String pop = (String) stack.pop();
	        Iterator<String> itr = stack.iterator();
	        while (itr.hasNext()) {
	            System.out.println(itr.next());

	        }
	    }

	    private static void doListDemo() {
	        System.out.println("In doListDemo");
	        List<String> list = new LinkedList();
	        list.add("sirisha");
	        list.add("sowjanya");
	        list.add("vamshi");
	        Iterator itr = list.iterator();
	        while (itr.hasNext()) {
	            System.out.println(itr.next());

	        }

	    }

	    private static void doQueueDemo() {
	        System.out.println("\n In doQueueDemo");
	        PriorityQueue<String> queue = new PriorityQueue<>();
	        queue.add("Sirisha Kopparaju");
	        queue.add("Sowjanya Kopparaju");
	        queue.add("Krishna Vamshi");
	        System.out.println("head:" + queue.element());
	        System.out.println("head:" + queue.peek());
	        System.out.println("iterating the queue elements:");
	        Iterator<String> itr = queue.iterator();
	        while (itr.hasNext()) {
	            System.out.println(itr.next());
	        }
	        queue.remove();
	        queue.poll();
	        System.out.println("after removing two elements:");
	        Iterator<String> itr2 = queue.iterator();
	        while (itr2.hasNext()) {
	            System.out.println(itr2.next());

	        }
	    }

	    private static void doSetDemo() {
	        System.out.println("\n In doSetDemo");
	        Set<String> set = new LinkedHashSet<>();
	        set.add("Siri");
	        set.add("Sowju");
	        set.add("Siri");
	        set.add("Kittu");
	        for (String str : set) {
	            System.out.println(str);
	        }
	    }

	    private static void doMapDemo() {
	        Map<Integer, String> map = new HashMap<>();
	        map.put(100, "siri");
	        map.put(101, "sowju");
	        map.put(102, "kittu");
	        for (Map.Entry m : map.entrySet()) {
	            System.out.println(m.getKey() + "" + m.getValue());

	        }


	    }
	}

	
