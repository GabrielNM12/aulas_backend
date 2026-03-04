public class ConversorTest {
    public static void main(String[] args) {
        
        Conversor conv = new Conversor();

        System.out.printf("Celsius para Fahrenheit %.2f\n",conv.converter(25.0)); 
        System.out.printf("Horas em minutos: %d\n",conv.converter(2, 30));
    }
}
