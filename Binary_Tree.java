package AVL_Trees;

public class Binary_Tree {

    public class Node{
       private int value;
       private Node left;
       private Node right;
       private int height;

       public Node(int value){
           this.value=value;
       }


    }
  public Node root;
    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }

    public void insert(int value){
        this.root=insert(root,value);
    }

    private Node insert(Node node,int value){
        if(node==null){
            node=new Node(value);
            return node;
        }

        if(value<node.value){
            node.left=insert(node.left,value);
        }

        if(value>node.value){
            node.right=insert(node.right,value);
        }

        node.height=Math.max(height(node.left),height(node.right))+1;

        return rotate(node);


    }

    public void display(){
        display(root,"Root Node : ");
    }

    private void display(Node node,String details){
        if(node==null){
            return;
        }

        System.out.println(details + node.value);
        display(node.left,   "Left Node of the node :"+ node.value+" ");

        display(node.right," Right node of the node : " + node.value +" ");
    }

    public void populate(int [] nums){
        for(int i=0;i<nums.length;i++){
            insert(nums[i]);
        }
    }

    public void populatedSort(int [] nums,int start,int end){
        if(start>=end){
            return;
        }
        int mid=(start+end)/2;
        this.insert(nums[mid]);
        populatedSort(nums,start,mid);
        populatedSort(nums,mid+1,end);

    }

     public boolean balance(){
       return balance(root);
     }
    public boolean balance(Node node){
        if(node==null){
            return true;
        }
       return Math.abs(height(node.left)-height(node.right))<=1
               && balance(node.left) && balance(node.right);
    }

    public Node rotate(Node node){
        if(height(node.left)-height(node.right)>1){
            //left heavy

            if(height(node.left.left)-height(node.left.right)>0){
               // left-left case
                return rightRotate(node);


            }

            if(height(node.left.left)-height(node.left.right)<0){
                //left-right case
                node.left=leftRotate(node.left);
                return rightRotate(node);

            }
        }

        //checking for the other 2 cases that is right cases
        if(height(node.left)-height(node.right)<-1){
            //then it is right heavy

            if(height(node.right.left)-height(node.right.right)<0){
                //left- right case
                return leftRotate(node);
            }

            if(height(node.right.left)-height(node.right.right)>0){
                node.right=rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    public Node leftRotate(Node c){
        Node p=c.right;
        Node t=p.left;

        p.left=c;
        c.right=t;

        p.height=Math.max(height(p.left),height(p.right))+1;
        c.height=Math.max(height(c.left),height(c.right))+1;


       return p;


    }

    public Node rightRotate(Node p){

        Node c=p.left;
        Node t=c.right;

        c.right=p;
        p.left=t;

        p.height=Math.max(height(p.left),height(p.right))+1;
        c.height=Math.max(height(c.left),height(c.right))+1;
        return c;

    }
}
