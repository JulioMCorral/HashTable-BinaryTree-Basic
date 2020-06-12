/*This class is the hash table implementation
 * with an array of Linked List to represent the chaining
 * 
 * Methods are as follows:
 * 
 * BinaryTreeNode Constructor defualt
 * BinaryTreeNode with parameters
 * 
 * 
 * @author    Julio Corral
 * @date      10/29/10
 * @professor Dr. Fuentes
 * @T.A.      Jaime Nava
 */

public class BinaryTreeNode
{
    
    //declare the variables
    int element;
    int bfactor;
    BinaryTreeNode leftChild;
    BinaryTreeNode rightChild;
    
    
    //metohd to initialize the varaibles
    public BinaryTreeNode()
    {
        element=0;
        leftChild=null;
        rightChild=null;
        bfactor=0;
    }
    
    //set the variables to another variable
    public BinaryTreeNode (int newItem,int bf, BinaryTreeNode L, BinaryTreeNode R) 
    {
        element=newItem;
        leftChild=L;
        rightChild=R;
        bfactor=bf;
        
    }
    
    
    
}