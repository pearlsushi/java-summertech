public class stack {
    linklist list;
    public stack() {
        list = new linklist();
    }
    public void push(int value) {
        list.add(value,0);
    }
    public int pop() {
        int save = list.get(0);
        list.remove(0);
        return save;

    }
    public int peek() {
        int save = list.get(0);
        return save;
    }
}
