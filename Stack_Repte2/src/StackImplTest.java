public class StackImplTest {

    public static void main(String[] args) {
        Stack<Integer> s = new StackImpl<Integer>(5);
        s.push(5);
        s.push(20);
        s.push(15);
        s.pop();
        s.pop();
        s.pop();
    }

}
