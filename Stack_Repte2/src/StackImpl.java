public class StackImpl<E> implements Stack<E> {

    private E[] stack;
    public static int lastID=0;

    public StackImpl(int len){

        this.stack = (E[]) new Object[len];

    }

    @Override
    public void push(E e) {
        stack[lastID] = e;
        lastID++;
        System.out.println(lastID);
    }

    @Override
    public E pop() {

        E lastObject = stack[lastID];
        stack[lastID] = null;
        lastID--;
        System.out.println(lastID);
        return lastObject;
    }

    @Override
    public int size() {
        return 0;
    }

}
