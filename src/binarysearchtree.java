public class binarysearchtree {
    binarynode start;
    public binarysearchtree(){
        this.start = null;
    }
    public void add(int value) {
        binarynode star = start;
        if (start == null) {
            start = new binarynode(value, null, null);
        }
        else {
            while (true) {
                if(value >= star.value) {
                    if (star.rchild == null) {
                    star.rchild = new binarynode(value, null, null);
                    break;
                    } 
                    else {
                        star = star.rchild;
                    }

                }
                else {
                    if (star.lchild == null) {
                        star.lchild = new binarynode(value,null,null);
                        break;
                    }
                    else {
                        star = star.lchild;
                    }
                }
            }
        }
    }
    public void writenode(binarynode node) {
        System.out.println(node.value);
        if (node.lchild != null) {
            writenode(node.lchild);
        }
        if (node.rchild != null) {
            writenode(node.rchild);
        }
    }
    public void write() {
        binarynode star = start;
        writenode(star);
    }
    public boolean contains(int value) {
        binarynode star = start;
        while(true) {
            if (star==null) {
                return false;
            }
            if (value == star.value) {
                return true;
            }
            else if(value > star.value) {
                star = star.rchild;
            }
            else if (value < star.value) {
                star = star.lchild;
            }
        }
    }
    public void remove(int value) {
        binarynode star = start;
        binarynode follow = null;
        if (contains(value)==false) {
            return;
        }
        else if (start.value == value) {
            if (start.lchild == null && start.rchild == null) {
                start = null;
            }
            else if (start.lchild != null && start.rchild != null) {
                star = star.rchild;
                while (star.lchild != null) {
                    star = star.lchild;
                }
                start.value = star.value;
                star.value = value;
                remove(value);
            }
            else {
                if (start.lchild != null) {
                    start = star.lchild;

                }
                if (start.rchild != null) {
                    start = star.rchild;
                }
            }    
        }
        else {
            while (true) {
                
                if (value > star.value) {
                    follow = star;
                    star = star.rchild;
                }
                if (value < star.value) {
                    follow = star;
                    star = star.lchild;
                }
                if (value == star.value) {
                    break;
                }
            }
            if (star.lchild == null && star.rchild == null) {
                if (follow.rchild == star) {
                    follow.rchild = null;
                }
                if (follow.lchild == star) {
                    follow.lchild = null;
                }
            }
            else if (star.lchild != null && star.rchild != null) {
                binarynode save = star.rchild;
                while (save.lchild != null) {
                    save = save.lchild;
                }
                save.value = star.value;
                star.value = value;
                remove(value);
            }
            else {
                if (follow.rchild == star) {
                    if (star.lchild != null) {
                        follow.rchild = star.lchild;
    
                    }
                    if (star.rchild != null) {
                        follow.rchild = star.rchild;
                    }
                }
                if (follow.lchild == star) {
                    if (star.lchild != null) {
                        follow.lchild = star.lchild;
    
                    }
                    if (star.rchild != null) {
                        follow.lchild = star.rchild;
                    }
                }
            }
        }
    }
}
