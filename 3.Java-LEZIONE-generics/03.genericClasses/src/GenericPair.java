public class GenericPair<T> {
    T param1;
    T param2;
    public GenericPair(T param1, T param2) {
        this.param1 = param1;
        this.param2 = param2;
    }
    public T getParam1() {
        return param1;
    }
    public void setParam1(T param1) {
        this.param1 = param1;
    }
    public T getParam2() {
        return param2;
    }
    public void setParam2(T param2) {
        this.param2 = param2;
    }
}
