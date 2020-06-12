/*This class is the hash table implementation
 * with an array of Linked List to represent the chaining
 * 
 * Methods are as follows:
 * 
 * int hashFunction     make the basic operation of a hash table
 * void insert          insert the possible numbers to the hash
 * void display table   show the hash table
 * boolean contains     return a boolean if the number is the hash table
 * 
 * @author    Julio Corral
 * @date      10/29/10
 * @professor Dr. Fuentes
 * @T.A.      Jaime Nava
 */

public class HashTAble 
{
    //private varaibles of array and the size
    private SortedList[] array;
    private int size;
    
    
 /*Method that creates the hash table based on the input of the user
  *
  * @param   --> use the input of the user to create the hash table
  * @varaible -> new array of size 
  * @return  -->method void which create the array
  *                    
  */
    public HashTAble(int num)
    {
        size= num;
        array= new SortedList[size];
        
        for(int i=0; i<array.length; i++)
        {
            array[i]= new SortedList();
        }
    }
    
 
 /*Method that inserts to the index of the hash
  *
  * @varaible -> int key to get the number
  * @variable -> int hash that call the hash table
  * @return  --> is a void method that print the numbers
  *              in the hash
  */
    public void insert(List node)
    {
        int key= node.getKey();
        int hash= hashFunction(key);
        array[hash].insert(node);
    }
    

     
 /*Method that print the hash table as an array
  *
  * @varaible -> 
  * @return  -->is a void method to prints only the
  *             structure of the hash table              
  */
    public void displayTable()
    {    
        for(int i=0; i< array.length;i++)
        {
            System.out.print(i+ " . ");
            array[i].displayList(); 
        }
    }
     
    
 /*Method that searches for a specific key in Hash Table
  * @param     --> int n element to be searched for
  * @return    -->boolean flag: true if found 
  *               else return false
  */
    public boolean contains(int n){
        
        int hash= hashFunction(n); 
        int counter = 0; 
        int count=0;
                
        boolean flag = false; 
        List current;
        current=array[hash].first;

        while(current!=null)
        {

            if(current.info==n)
            {
                flag=true;
                counter++;
                current=current.link;
            }

            else
            {
                current=current.link;
                count--;
            }
        }
        if(counter>count)
        {
            System.out.println("Appears"+" "+counter+" times.");
        }
        else
        {
            System.out.println(count);
        }

        return flag;
    }    
    
    
    

 /*Method which compute the method that requires the hash function
  * @param     --> int n key which is the array size
  * @return    -->return the remiander to place the number
  *               in the right place              
  */
    public int hashFunction(int key)
    {
        return key %size;
    } 
}
