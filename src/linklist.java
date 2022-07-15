class linklistnode {
    int value;
    linklistnode child;
    public linklistnode(int value, linklistnode child) {
        this.value = value;
        this.child = child;
    }
}
public class linklist {
    linklistnode start;
    public linklist() {
        this.start = null;
    }
    public void add(int value) {
        linklistnode temp = start;
        if (start == null) {
            start = new linklistnode(value, null);
            return;
        }
        else {
            while (true) {
                if (temp.child == null) {
                    temp.child = new linklistnode(value, null);
                    break;
                }
                else {
                    temp = temp.child;
                }
            }
        }
    }
    public int size() {
        linklistnode temp = start;
        int length = 0;
        while (true) {
            if (temp.child == null) {
                return length;
            }
            else {
                temp = temp.child;
                length += 1;
            }
        }
    }
    public void write() {
        linklistnode temp = start;
        for(int i = 0; i < this.size(); i++) {
            System.out.println(temp.value);
            temp = temp.child;
        }
    }
    public void clear() {
        start = null;
    }
    public int get(int index) {
        linklistnode temp = start;
        for (int i=0; i < index; i++) {
            temp = temp.child;
        }
        return temp.value;
    }
    public void add(int value, int index) {
        linklistnode temp = this.start;
        if (index==0) {
            this.start = new linklistnode(value,this.start);
        }
        else {
            for (int i = 0; i < index-1; i++) {
                temp = temp.child;
            }
            linklistnode save = temp.child;
            temp.child = new linklistnode(value, save);
        }
    }
    public int remove(int index) {
        linklistnode temp = start;
        if (index == 0) {
            int savedStart = start.value;
            start = start.child;
            return savedStart;
        }
        else {
            for (int i = 0; i < index-1; i++) {
            temp = temp.child;
            }
        int savedNode = temp.child.value;
        temp.child = temp.child.child;
        return savedNode;
        }
    }
}