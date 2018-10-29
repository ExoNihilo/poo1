public class Classroom {
    public static void main(String[] args) {

        Wilder erwan = new Wilder("Erwan", true);
        Wilder gaetan = new Wilder("Gaetan", false);
        Wilder tony = new Wilder("Tony", true);
        Wilder marthe = new Wilder("Marthe", false);

        System.out.println(erwan.whoAmI());
        System.out.println(gaetan.whoAmI());
        System.out.println(tony.whoAmI());
        System.out.println(marthe.whoAmI());

    }
}
