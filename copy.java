public class copy{
    String name;
    int id;

    copy(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        copy c1 = new copy("kaif", 154);
        System.out.println("Name: " + c1.name + " and id: " + c1.id);
    }
}