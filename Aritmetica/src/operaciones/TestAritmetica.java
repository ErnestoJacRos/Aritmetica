package operaciones;

public class TestAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 4;
        aritmetica1.suma();
        System.out.println("aritmetica1.sumarConRetorno() = " + aritmetica1.sumarConRetorno());
    }
    
}
