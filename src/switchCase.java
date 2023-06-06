public class switchCase {
    public static void main(String[] args) {

        String clima ="cloudy";
        switch (clima){
            case "sunny":
                System.out.println("El tiempo es soleado");
                break;
            case "cloudy":
                System.out.println("El tiempo es nublado");
                break;
            default: // cuando no hay coinsidencia
                System.out.println("No se identifico el clima");
                break
        }
    }
}
