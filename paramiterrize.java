public class Main {
String name;
int id;
 Main(String name, int id) {
this.name = name;
this.id = id;
}
public static void main(String[] args) {
Main p=new Main("Amit",160);
        System.out.println("Name:"+p.name);
        System.out.println("Id:"+p.id);
 }
}