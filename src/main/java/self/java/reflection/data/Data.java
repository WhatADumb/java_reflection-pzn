package self.java.reflection.data;

import java.io.Serializable;

public class Data<T extends AutoCloseable & Serializable> {
    private T bit;

    public Data() {
    }

    public Data(T bit) {
        this.bit = bit;
    }

    public T getBit() {
        return bit;
    }

    public void setBit(T bit) {
        this.bit = bit;
    }
}
