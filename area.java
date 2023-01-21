import java.util.*;

public class area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float length = in.nextFloat();
        float breadth = in.nextFloat();
        System.out.format("The area is %f\n", length * breadth);
        in.close();
    }
}
