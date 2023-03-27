public class Developer {
    public static void main(String[] args) throws Exception {

        String[] programmingLanguages = new String[]{"Java", "C++", "C#", "Python", "JavaScript"};
        John john = new John("John", 25, programmingLanguages, "I need coffee break");

        john.getCoffeeBreak();
        System.out.println(john.getName());
        System.out.println(john.getAge());
        System.out.println(john.getProgrammingLanguages());
    }
}
