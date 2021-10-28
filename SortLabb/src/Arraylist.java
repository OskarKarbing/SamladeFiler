public class Arraylist<Bonke> {
    Bonke[] things = (Bonke[]) new Object[10];
    int counter = 0;

    public void add(Bonke o){
        things[counter] = o;
        counter++;
    }

    public Bonke get(int index){
        return things[index];
    }

    public int size(){
        return counter;
    }
    public String toString(){
        String s="";
        for (int i = 0; i < counter; i++){
        s = s + things[i] + " ";
        } return s;
    }
}
