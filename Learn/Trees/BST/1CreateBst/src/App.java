public class App 
{
    public static void main(String[] args) throws Exception 
    {
        // Bst bst = new Bst();
        // int datas[] = new int[] {30,20,40,10,25,35,45};
        // bst.Insert(datas);bst.InOrder();
        // bst.Insert(1);bst.InOrder();
        // bst.Insert(-1);bst.InOrder();
        // bst.Insert(0);bst.InOrder();
        // bst.Insert(26);bst.InOrder();

        // Bst bst = new Bst();
        // int datas[] = new int[] {1,2,3,4,5,6,7,8};
        // bst.Insert(datas);bst.InOrder();

        Bst bst = new Bst();
        int datas[] = new int[] {20,16,25,15,17,24,40,34,46,37,36,39};
        bst.Insert(datas);bst.InOrder();
        bst.Delete(17); bst.InOrder();
        //bst.Delete(24); bst.InOrder();
        //bst.Delete(25); bst.InOrder();
        bst.Delete(20); bst.InOrder();
        bst.Delete(20); bst.InOrder();
        
    }
}

class Bst
{
    Node root;

    public boolean Insert(int data)
    {
        if (root == null) 
        {
            root = new Node(data);
            return true;    
        }
        else
        {
            return insert(data,root,null);
        }
    }

    public boolean Insert(int datas[])
    {
        for (int i = 0; i < datas.length; i++) 
        {
            Insert(datas[i]);    
        }

        return true;
    }

    public void Delete(int key)
    {
        root = delete(root, key);
    }

    // Tree traversals

    public void InOrder()
    {
        inorder(root);
        System.out.println();
    }

    // Private blocks
    private final void inorder(Node root)
    {
        if (root != null) 
        {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    private final boolean insert(int key,Node rootNode,Node prevNode)
    {
        if (rootNode == null) 
        {
            if (key < prevNode.data) 
            {
                prevNode.left = new Node(key);    
            }
            else
            {
                prevNode.right = new Node(key);
            }

            return true;    
        }
        else if(rootNode.data == key)
        {
            return false;
        }
        else
        {
            if (key > rootNode.data) 
            {
                return insert(key, rootNode.right, rootNode);
            }
            else
            {
                return insert(key, rootNode.left, rootNode);
            }
        }
    }

    private Node delete(Node root, int key)
    {
        if (root == null) 
        {
            return root;
        }

        if (key < root.data) 
        {
            root.left = delete(root.left, key);
        }
        else if (key > root.data) 
        {
            root.right = delete(root.right, key);    
        }
        else
        {
            if (root.left == null && root.right == null) 
            {
                return null;
            }
            else if (root.left == null) 
            {
                return root.right;
            }
            else if(root.right == null)
            {
                return root.left;
            }
            else
            {
                Node temp = root.right;
                int nextSuccessor = 0;

                while (temp != null) 
                {
                    nextSuccessor = temp.data;
                    temp = temp.left;
                }

                root.data = nextSuccessor;

                // Recur untill a node with no child or 1 child
                root.right = delete(root.right, nextSuccessor);
            }
        }

        return root;
    }

}

class Node
{
    int data;
    Node left,right;

    Node(int data)
    {
        this.data = data;
    }
}
