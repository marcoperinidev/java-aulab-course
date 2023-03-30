public class GenericPair<T1, T2> {
    T1 param1;
    T2 param2;
    public GenericPair(T1 param1, T2 param2) {
        this.param1 = param1;
        this.param2 = param2;
    }
    public T1 getParam1() {
        return param1;
    }
    public void setParam1(T1 param1) {
        this.param1 = param1;
    }
    public T2 getParam2() {
        return param2;
    }
    public void setParam2(T2 param2) {
        this.param2 = param2;
    }

    //! T3 è il parametro che dichiaro nella CHIAMATA della funzione
    //? GenericPair<String, Integer> p1 = new GenericPair<String,Integer>("Ciao", 5);
    //? GenericPair<String, Person> p1 = new GenericPair<String,Person>("Ciao", 5);
    //? p1.<String>returnSomething("ciaone")
    public <T3> T2 returnSomething(T3 param){
        return param2;
    }
}
