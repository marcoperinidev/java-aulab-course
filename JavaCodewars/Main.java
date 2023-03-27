public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.whoLikesIt("Peter"));
        System.out.println(Solution.whoLikesIt("Jacob", "Alex"));
        System.out.println(Solution.whoLikesIt("Max", "John", "Mark"));
        System.out.println(Solution.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
        System.out.println(ShorterSolution.whoLikesIt("Mariottide", "Jacob", "Mark", "Max"));
    }

}
