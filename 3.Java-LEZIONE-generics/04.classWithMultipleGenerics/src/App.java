public class App {
    public static void main(String[] args) throws Exception {
      GenericPair<String, Integer> p1 = new GenericPair<String,Integer>("Ciao", 5);
      System.out.println("I parametri sono : " + p1.getParam1() + " " + p1.getParam2());
      // public <T3> T2 returnSomething(T3 param){
      //   return param2;
      // }

      System.out.println(p1.<String>returnSomething("ciaone"));

    }
}
