import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingCartTestDrive {
    public static void main(String[] args) {
        String[] contents = {"Apple", "Orange", "Banana"};
        ShoppingCart s1 = new ShoppingCart(contents);
        s1.addToCart("Grapes");
        s1.addToCart("Kiwi");
        s1.removeFromCart("Grapes");
        s1.checkOut();
    }
}

class ShoppingCart {
    protected ArrayList<String> cartContents;

    public ShoppingCart(String[] contents) {
        this.cartContents = new ArrayList<String>();
        cartContents.addAll(Arrays.asList(contents));
    }

    public ShoppingCart addToCart(String item) {
        this.cartContents.add(item);
        return this;
    }

    public ShoppingCart removeFromCart(String item) {
        this.cartContents.remove(item);
        return this;
    }

    public void checkOut() {
        System.out.println("All items in the cart:");
        for (String item : this.cartContents) {
            System.out.println(item);
        }
    }
}
