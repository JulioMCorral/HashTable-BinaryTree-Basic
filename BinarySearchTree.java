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

import java.util.Scanner;
public class BinarySearchTree 
{
    //varaibles public and private that
    //the tree should has
    public static int pos;
    public static BinaryTreeNode [] array;
    private BinaryTreeNode root;
    
    
    /*Method that create the root as null
     * @variable  --> the root initialize to null 
     */
    public BinarySearchTree () 
    {
        root=null;
    }   
    
    
    /*Method that insert the numbers to the tree
     * param  --> int item of the numbers of the tree
     * param  --> binarytreenode bt to start the tree
     * @variable  --> the root initialize to null 
     * @return    --> bt that returns the tree empty with
     *                random numbers
     */
    private BinaryTreeNode insert(int item, BinaryTreeNode bt)
    {
        {
            
            if( bt == null )
            return new BinaryTreeNode( item,0, null,null );
            
            
            if(item<bt.element)
            
            bt.leftChild = insert( item, bt.leftChild );
            
            else if( item > bt.element )
            
            
            bt.rightChild = insert(item, bt.rightChild );
            else
            ;  
            
            return bt;
        }
        
    }
    
    
    /*Method that use the main call 
     * @return  --> the root which is null will be set
     *              to the parameter of the method insert
     */
    public void insert(int item)
    {
        root=insert(item,root);
    }
     
    /*Method that travers the tree to search a number
     * @param     --> int depth of the height of the tree
     * @param     --> BinaryTreeNode t to identify the data in the node
     * @return    --> this method is void type which will output the 
     *                tree in a way.
     */
    private void printTree(BinaryTreeNode t, int depth)
    {

        if(t==null)
        {
            return ;
        }

        else 
            printTree(t.rightChild, depth+1);

        for(int i=0; i<depth;i++)
        {
            System.out.print("     ");
            
        }

        System.out.println(t.element);

        printTree(t.leftChild, depth+1);
    }
    
    /*Method that travers the tree to search a number
     * @return    --> recursion call to the printTree
     *                and set up the tree in the screen
     */
    public void printTree()
    {
        printTree(root,0); 
    }
    
    /*Method that travers the tree to search a number
     * @param     --> int item of the number
     * @param     --> BinaryTreeNode t to identify the data in the node
     * @return    --> Return a boolean if the numbers is found 
     *                
     */
    private boolean contains(int item, BinaryTreeNode t)
    {
        
        if( t == null )
            return false;
        
        if( item < t.element )
            
            return contains( item, t.leftChild );
        
        else if( item > t.element )
            
            return contains( item, t.rightChild );
        else
            
            return true;    
        
    }
    
    /*Method that travers the tree to search a number
     * @param     --> int item of the number to add in the tree
     * @return    --> Return the method continas to compute the 
     *                the internal method contins
     *                
     */
    public boolean contains(int item)
    {
        return contains(item, root);
    }   
}