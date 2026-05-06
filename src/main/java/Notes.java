import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;

class Notes {
	public static void main(String[] args) {
		Stack<String> books = new Stack<>();

        // Adding elements (Push)
        books.push("Clean Code");
        books.push("Java Concurrency");
        books.push("Design Patterns");

        // Looking at the top (Peek) -> "Design Patterns"
        System.out.println("Top Book: " + books.peek());

        // Removing the top (Pop) -> Removes "Design Patterns"
        books.pop();

        System.out.println("New Top: " + books.peek());


		Queue<String> printerLine = new LinkedList<>();

        // Adding elements (Enqueue)
        printerLine.add("Essay.pdf");
        printerLine.add("Resume.docx");
        printerLine.add("Photo.jpg");

        // Removing the first element (Dequeue) -> "Essay.pdf"
        String currentJob = printerLine.poll(); //or .remove
        System.out.println("Printing: " + currentJob);

        // Who is next? (Peek) -> "Resume.docx"
        System.out.println("Next in line: " + printerLine.peek());














		// Stack<String> books = new Stack<>();
		
		// long startTime = System.nanoTime();

  //       // Adding elements (Push)
  //       books.push("Clean Code");
  //       books.push("Java Concurrency");
  //       books.push("Design Patterns");
        
  //       long endTime = System.nanoTime();
        
        
  //       System.out.println(endTime - startTime);
        
  //       ArrayList<String> books2 = new ArrayList<String>();
        
        
  //       startTime = System.nanoTime();
  //       books2.add("Clean Code");
  //       books2.add("Java Concurrency");
  //       books2.add("Design Patterns");
        
  //       endTime = System.nanoTime();
        
  //       System.out.println(endTime - startTime);
        
  //       ArrayDeque<String> books3 = new ArrayDeque<String>();
        
  //       startTime = System.nanoTime();
  //       books3.addLast("Clean Code");
  //       books3.addLast("Java Concurrency");
  //       books3.addLast("Design Patterns");
        
  //       endTime = System.nanoTime();
  //       System.out.println(endTime - startTime);
        
  //       startTime = System.nanoTime();

  //       // Adding elements (Pop)
  //       books.pop();
  //       books.pop();
  //       books.pop();
        
  //        endTime = System.nanoTime();
        
        
  //       System.out.println(endTime - startTime);
        
        
  //       startTime = System.nanoTime();
        
  //       books2.remove(books2.size() - 1);
  //       books2.remove(books2.size() - 1);
  //       books2.remove(books2.size() - 1);
        
  //       endTime = System.nanoTime();
        
  //       System.out.println(endTime - startTime);
        
  //       startTime = System.nanoTime();
  //       books3.removeLast();
  //       books3.removeLast();
  //       books3.removeLast();
        
  //       endTime = System.nanoTime();
  //       System.out.println(endTime - startTime);
	}
}
