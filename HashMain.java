/*This class is the hash table implementation
 * with an array of Linked List to represent the chaining
 * 
 * Methods are as follows:
 * 
 * void insert      --->List node : insets element
 * void print       ---> prints the tree
 * public BinaryTreeSearch --->a root initialize as null
 * boolean contains --->int n: looks for n in the tree
 * 
 * 
 * @author    Julio Corral
 * @date      10/29/10
 * @professor Dr. Fuentes
 * @T.A.      Jaime Nava
 */


import java.util.*;
import java.util.Random;
public class HashMain {
    
    public static void main(String[] args){
        
        int size; //constant for modulo
        Scanner input= new Scanner(System.in);
        
        
        System.out.println("Enter size of array: ");
        size= input.nextInt();
        int sizePrime=prime(size);
        int []myArray;
        long start,end;
        Random rangeMinMax=new Random();        
        
//it contains the array size
        myArray=randomWalkArray(sizePrime);
        //create instance of hash table object & pass size as parameter
        HashTAble table = new HashTAble(sizePrime); 
        BinarySearchTree myFirstTree=new BinarySearchTree();
        
        
        
        
        for (int i=0; i<sizePrime; i++)
            
            //insert the elements to the first tree
            myFirstTree.insert(myArray[i]);
        
        
        System.out.println("====================BINARY SEARCH TREE====================================");
        //extract the items that has the binary search tree
        

        
        myFirstTree.printTree();
        
        System.out.println("Search a number in BST:: " );
        int findBst=input.nextInt();
        start=System.nanoTime();
        System.out.println(myFirstTree.contains(findBst));
        end=System.nanoTime();
        System.out.println("time to search: " + (end-start));
        System.out.println("========================HASH TABLE================================\n");
        
        
        
        
        
        for(int x=0;x<sizePrime;x++)
            table.insert(new List(myArray[x]));
        table.displayTable();
        System.out.println("search a number: ");
        int find=input.nextInt();
        start=System.nanoTime();
        System.out.println( table.contains(find));
        end=System.nanoTime();
        System.out.println("Time to search: " + (end-start));
        
        
        
        
    }
    
    
    /*Method that searches for a specific key in Hash Table
     * @param     --> int n element to be searched for
     * @return    -->boolean flag: true if found
     */
    public static int prime(int n){
        
        boolean prime = false;
        while (n > 1 && !prime){
            prime = true;
            for (int i = 2; i < n / 2; i++) 
                if (n % i == 0)
                prime = false;
            if (!prime)
                n--;
        }
        return n; 
    }
    
    
     /*Method that generates random numbers without negative sign
  * @param     --> int n array size and insert the numbers 
  * @varaibles --> An empty array which will insert the numbers
  * @return    --> Return an array with the random numbers
  *                and the random numbers
  */
    public static int [] randomWalkArray(int n)
    {

        Random generator = new Random ();
        int [] randArray=new int[n];
        //set to 0
        randArray[0]=0;

        for(int i=1;i<n;i++)
            randArray[i]=Math.abs(randArray[i-1] + generator.nextInt(201)-100);

        return randArray;
    }   
}