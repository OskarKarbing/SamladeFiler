package InterfaceLabb;

import java.util.ArrayList;

public class Main {
    static ArrayList<Clothes> clothesList = new ArrayList<>(10);
    public static void main(String[] args) {
        Socks s1 = new Socks("Levis", 49.90, "Summer", 2 );
        clothesList.add(s1);



    }

}
