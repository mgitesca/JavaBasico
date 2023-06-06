public class ifElse {
    public static void main(String[] args) {
        boolean check = true;
        if (check){
            System.out.println("Verdadero");
        }
        int num1= 5;
        int num2=10;
        int num3= 20;

        if (num1>num2 && num3>num2){
            System.out.println("Verdero");
        } else if (num1<num3) {
            System.out.println("Entro al else if");
        } else {
            System.out.println("Falso");
        }
        System.out.println("FIN");
    }
}
