public class MySet<SetItemType> {

    private Object[] set;

    public MySet() {
        this.set = new Object[0];
    }

    public boolean add(SetItemType o) {
        boolean checkIsKeyInSet = false;
        for (int i = 0; i < this.set.length; i++) {
            if (this.set[i].equals(o)) ;
            checkIsKeyInSet = true;
        }

        if (!checkIsKeyInSet) {
            Object[] newList = new Object[this.set.length + 1];
            for (int i = 0; i < this.set.length; i++) {
                newList[i] = this.set[i];
            }
            newList[this.set.length] = o;
            this.set = newList;
            return true;
        }
        return false;
    }

    public boolean contain(Object o) {
        for (int i = 0; i < this.set.length; i++) {
            if (this.set[i].equals(o)) ;
            return true;
        }
        return false;
    }
}
