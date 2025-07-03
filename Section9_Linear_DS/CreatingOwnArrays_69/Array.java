package Section9_Linear_DS.CreatingOwnArrays_69;

public class Array {
    private int[] items;
    private int CurrentIndex;

    public Array(int initialSize) {
        this.items = new int[initialSize];
    }

    public void insert(int value) {
        this.items[CurrentIndex] = value;
        CurrentIndex++;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < this.CurrentIndex; i++) {
            str.append(this.items[i]).append(", ");
        }
        str.append("\b").append("\b").append("]");
        return str.toString();
    }

    public int Search(int value) {
        // linear Search
        for (int i = 0; i < this.CurrentIndex; i++) {
            if (this.items[i] == value)
                return i;
        }
        return -1;
    }

    public void removeAt(int value) {
        if (value >= this.CurrentIndex) {
            throw new IllegalArgumentException();
        }
        for (int i = value; i <= this.CurrentIndex - 2; i++) {
            this.items[i] = this.items[i + 1];
            CurrentIndex--;
            this.items[CurrentIndex] = 0;
        }
    }

    public int max() {
        int result = this.items[0];
        for (int i = 0; i < this.CurrentIndex; i++) {
            if (items[i] > result) {
                result = items[i];
            }
        }
        return result;
    }

    public int min() {
        int result = this.items[0];
        for (int num : this.items) {
            if (result < num) {
                result = num;
            }
        }
        return result;
    }
}