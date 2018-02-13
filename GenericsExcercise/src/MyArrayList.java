public class MyArrayList<ListItemType> {

    private Object[] list;

    public MyArrayList() {
        this.list = new Object[0];
    }

    public void add(ListItemType o) {
        Object[] newList = new Object[this.list.length + 1];
        for(int i = 0; i < this.list.length; i++) {
            newList[i] = this.list[i];
        }
        newList[this.list.length] = o;
        this.list = newList;
    }

    public ListItemType get(int index) {
        return (ListItemType) this.list[index];
    }
}
