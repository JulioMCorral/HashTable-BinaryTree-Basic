/*This class is the hash table implementation
 * with an array of Linked List to represent the chaining
 * 
 * Methods are as follows:
 * 
 * void insert      --->List node : insets element
 * void print       ---> prints the numbers in the linked list
 * 
 * 
 * 
 * @author    Julio Corral
 * @date      10/29/10
 * @professor Dr. Fuentes
 * @T.A.      Jaime Nava
 */


public class SortedList 
{
    
    public List first;
    
    
    /*Constructor to the first point of the set
     * @return    -->return a variable List of the 
     *               linked list. Point the first as null
     */
    public SortedList() 
    {
        first = null;
    }
    
    
    /*Method to insert the numbers in the linked list 
     * @param  --> use theLink as the set of the numbers in the 
     *             linked list
     * @return --> void method to insert each number
     *               in a secuence    
     */
    public void insert(List theLink)
    {
        theLink.link=first;
        first=theLink;
        
    }
    
    
     /*Method to display the secuences of the linked list
     * @variables -> current to point the first node  
     *             
     * @return --> void method to insert each number
     *               in a secuence    
     */
    public void displayList()
    {
        System.out.print("===> ");
        List current = first;
        
        
        while(current!=null)
        {
            current.printList(); 
            current= current.link; 
        }
        System.out.println();
    }
}
