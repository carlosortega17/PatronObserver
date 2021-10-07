public class Comprobador {
    public void porLosNumeros()
    {
        localiza();
        analiza();
        identifica();   
    }

    protected void localiza()
    {
        System.out.println("Establecer el perimetro");
    }

    protected void analiza()
    {
        System.out.println("Analiza el perimetro");
    }

    protected void identifica()
    {
        System.out.println("Identifica la fuente");
    }
}
