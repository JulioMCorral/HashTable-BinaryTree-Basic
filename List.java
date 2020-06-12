/*This class is the hash table implementation
 * with an array of Linked List to represent the chaining
 * 
 * Methods are as follows:
 * 
 * List             set the info to data
 * void printList   prints a blank space between numbers 
 * int getKey       set a variable to a current value witout loss it
 * 
 * @author    Julio Corral
 * @date      10/29/10
 * @professor Dr. Fuentes
 * @T.A.      Jaime Nava
 */

public class List {
    
    public int info;
    public List link;
    
/*Method that searches for a specific key in Hash Table
     * @param     --> int n element to be searched for
     * @return    -->boolean flag: true if found
     */
    public List(int data)
    {
        info=data;
    }
    
    
/*constructor that capture a current value of the hash
     * @return  --> return the info of the hash
     */
    public int getKey()
    {
        return info;
    }
    
     
/*Method that prints a space between the numbers
     * @return    --> a void method which print the number
     *                and print the blank space
     */
    public void printList()
    {
        System.out.print(info + " ");
    }
}
