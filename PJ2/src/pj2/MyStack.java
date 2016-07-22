/**
    A class of stacks whose entries are stored in a chain of nodes.
    Implement all methods in MyStack class
    Main Reference : text book or class notes
    Do not change or add data fields 
*/

package PJ2;

public class MyStack<T> implements StackInterface<T>
{
   
   // Data fields
   private Node<T> topNode; // references the first node in the chain
   private int numberOfEntries;  
  
   public MyStack()
   {
       topNode = null;
       numberOfEntries = 0;
      // add stataments
   } // end default constructor
  
   /**
    * This function is used to push a data to the top of stack
    * @param newEntry - T
   */
   public void push(T newEntry)
   {
      // add stataments
       Node newNode = new Node(newEntry, topNode);
       if(topNode == null)
       {
           topNode = new Node(newEntry);
       }
       else
       {
           newNode.setNextNode(topNode);
           topNode = newNode;
       }
       numberOfEntries++;
   } // end push

   /**
    * This function is used to peek at the first data of stack
    * @return topData
    */
   public T peek()
   {
      // add stataments
      T topData = null;
      if(topNode != null)
      {
          topData = topNode.getData();
      }
      return topData;
   } // end peek

   /**
    * This function is used to pop the first data of stack
    * @return topData - the data being popped
    */
   public T pop()
   {
       T topData = peek();
       if(topNode != null)
      {
          topNode = topNode.getNextNode();
      }
       numberOfEntries--;
      return topData;
   } // end pop

   /**
    * This function is used to check the stack is empty or not
    * @return true if no data on the stack
    * @return false if the stack is not empty
    */
   public boolean empty()
   {
      // add stataments
       if(topNode == null)
       {
           return true;
       }
       else
       {
           return false;
       }
   } // end empty

   /**
    * This function is used to return the number of data on the stack
    * @return numberOfEntries - int
    */
   public int size()
   {
      // add stataments
      return numberOfEntries;
   } // end isEmpty

   /**
    * This function is used to clear the stack
    */
   public void clear()
   {
      // add stataments
       topNode = null;
       numberOfEntries = 0;
   } // end clear

   /**
    * This function is used to print out all the data on the stack
    * @return sta - a string represents all the data
    */
   public String toString()
   {
      // add stataments
       String sta = "";
       Node currentNode = topNode;
       while(currentNode != null)
       {
           sta += currentNode.getData() + ",";
           currentNode = currentNode.getNextNode();
       }
       sta = "[" + sta + "]";
      return sta;
   }


   /****************************************************
      Do not modify: Stack test 

      Expected output:

	OK: stack is empty
	Push 3 data: 10, 30, 50
	Print stack [50,30,10,]
	OK: stack size is 3
	OK: peek stack top is 50
	OK: stack is not empty
	Pop 2 data: 50, 30
	Print stack [30,10,]
	Print stack [10,]
	OK: stack pop data is 30
	Clear stack
	Print stack []

   ******************************************************/



   public static void main (String args[])
   {
	MyStack<Integer> s = new MyStack<Integer>();
	if (s.empty()) 
            System.out.println("OK: stack is empty");
	else
            System.out.println("Error: stack is not empty");

	s.push(10);
	s.push(30);
	s.push(50);
        System.out.println("Push 3 data: 10, 30, 50");
        System.out.println("Print stack " + s);

	if (s.size() == 3) 
            System.out.println("OK: stack size is 3");
	else
            System.out.println("Error: stack size is " + s.size());

	if (s.peek() == 50) 
            System.out.println("OK: peek stack top is 50");
	else
            System.out.println("Error: peek stack top is " + s.size());

	if (!s.empty()) 
            System.out.println("OK: stack is not empty");
	else
            System.out.println("Error: stack is empty");

        System.out.println("Pop 2 data: 50, 30");
        s.pop();
        System.out.println("Print stack " + s);
	int data=s.pop();
        System.out.println("Print stack " + s);
	if (data == 30) 
            System.out.println("OK: stack pop data is 30");
	else
            System.out.println("Error: stack pop data is " + data);

        System.out.println("Clear stack");
        s.clear();
        System.out.println("Print stack " + s);
   }

} // end Stack
