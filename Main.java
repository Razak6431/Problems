package AVL_Trees;

public class Main {
    public static void main(String[] args) {
        Binary_Tree bt=new Binary_Tree();
        //int [] nums={13,5,4,15,16,10,3,8,11};
        //int [] nums={1,2,13,14,15,5,6,7,9,8};
        //bt.populate(nums);
        //bt.balance();
       // bt.populatedSort(nums,0,nums.length);
        int [] nums={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        bt.populate(nums);
        bt.balance();
        bt.display();
    }
}
