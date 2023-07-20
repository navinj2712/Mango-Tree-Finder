public class MangoTreeFinder {

    public static void main(String[] args) {
        MangoTreeFinder mango = new MangoTreeFinder();
        System.out.println(mango.tree(10, 60, 2));
    }
    public boolean tree(int row, int col, int place){
        boolean result = false;

        if(place <= row) result = true;
        else if((place % col) == 0) result = true;
        else if((place % col)  == 1) result = true;
        else result = false;

        return  result;
    }
}
