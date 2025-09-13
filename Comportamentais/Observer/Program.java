import subscribers.Client;
import subscribers.Employee;

public class Program {

    public static void main(String[] args) {
        Newsletter n = new Newsletter();

        new Client("Ana", n).registerInNewsletter();
        new Employee("Bruno",  n).registerInNewsletter();
        new Client("John", n);

        n.addMessage("Promoção 20% OFF!");
        n.addMessage("Manutenção hoje às 23h.");
    }

}
