import java.util.Scanner;

public class adddnssb<i> {
    public static void main(String[] args) {
        int[] nums = new int[5];
        //创建一个空数组
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("请输入第" + (i + 1) + "名选手的学号：");
            int num = sc.nextByte();
            nums[i] = num;
        }
        System.out.println("五名选手初始学号排序如下：");}
         System.out.println("[");
        for (int i = 0; i <; i++) {
        String s = i != nums.length -1 ? nums[i] + "," : nums[i];
    }
}
