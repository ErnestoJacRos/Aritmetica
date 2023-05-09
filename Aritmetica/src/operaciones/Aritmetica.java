package operaciones;

public class Aritmetica {
    int a;
    int b;
    public void suma(){
        int resultado  = this.a + this.b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno(){
        return this.a + this.b;
    }
}
