public class BST {
    TreeNode root;

    public BST(){
        root = null;
    }

    public BST(TreeNode node){
        root = node;
    }


    public TreeNode Add(int val){
        TreeNode newNode = new TreeNode(val);
        if (root == null){
            root = newNode;
            return root;
        }

        TreeNode p = null;
        TreeNode n = root;

        while (n != null){
            if (n.val < val){
                p = n;
                n = n.right;
            }
            else{
                p = n;
                n = n.left;
            }
        }

        if (p.val < val){
            p.right = newNode;
        }
        else{
            p.left = newNode;
        }
        return root;
    }

    public void PrintInOrder(){
        InOrder(root);
    }

    public void InOrder(TreeNode node){
        if (node == null){
            return;
        }
        InOrder(node.left);
        System.out.print(" " + node.val + " ");
        InOrder(node.right);
    }

    
    public void PrintPreOrder(){
        // Metodun icini uygun sekilde doldurunuz.
     preOrder(root);

}
public void preOrder(TreeNode node){
        if (node == null){
            return;
        }
       
        System.out.print(" " + node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void PrintPostOrder(){
        // Metodun icini uygun sekilde doldurunuz.
     postOrder(root);
 
     
}
public void postOrder(TreeNode node){
        if (node == null){
            return;
        }
       postOrder(node.left);
        postOrder(node.right);
        System.out.print(" " + node.val + " ");
    }


    
   
    public boolean IsBST(){
        // Metodun icini uygun sekilde doldurunuz.
return isBST(root);
}
boolean isBST(TreeNode node)
{
    if (node == null)
        return true;
    if (node.left != null && node.left.val > node.val)
        return false;
    if (node.right != null && node.right.val < node.val)
        return false;
    if (!isBST(node.left) || !isBST(node.right))
        return false;
    return true;
}

}
