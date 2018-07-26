public class Number {
    public String divide (){
        int sum = 0;

        for(int x = 0; x < 1000; x++){
            if(x % 3 == 0 || x % 5 == 0){
                sum += x;
            }
        }
        return Integer.toString(sum);
    }

    public static void main(String[] args) {
        Number number = new Number();
        System.out.println("Suma wynosi: " + number.divide());
    }
}
