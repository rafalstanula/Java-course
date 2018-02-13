public class MyMap<KeyType, ValueType> {

    Object[][] map;

    public MyMap() {
        this.map = new Object[0][2];
    }

    public boolean put(KeyType key, ValueType value) {
        boolean checkIsKeyInMap = false;

        for (int i = 0; i < this.map.length; i++){
            if(map[i][0].equals(key)){
                checkIsKeyInMap = true;
                map[i][1] = value;
            }
        }
        if(!checkIsKeyInMap) {
            Object[][] newMap = new Object[this.map.length + 1][2];
            {
                for (int i = 0; i < this.map.length; i++) {
                    for (int j = 0; j < 2; j++) {
                        newMap[i][j] = this.map[i][j];
                    }
                }
            }
            newMap[this.map.length][0] = key;
            newMap[this.map.length][1] = value;
            this.map = newMap;
            return true;
        }
        return false;
    }

    public ValueType get(KeyType key) {
        for (int i = 0; i < this.map.length; i++){
            if(this.map[i][0].equals(key)){
                return (ValueType) this.map[i][1];
            }
        }
        return null;
    }

}
