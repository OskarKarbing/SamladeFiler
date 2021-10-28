public class Main {
    public static void main(String[] args) {
        Arraylist<String> names = new Arraylist();

        names.add("David");
        names.add("Lisa");
        names.add("Lina");
        names.add("Pelle");


        for (int i = 0 ; i <names.size(); i++){
            System.out.println(names.get(i));
        }
        String name = names.get(0);
        System.out.println(name.length());
    }
}
