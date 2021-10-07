public class Supervivencia extends Comprobador implements AlarmListener{
    public void alarm()
    {
        System.out.println("Supervivencia - por los numeros");
        porLosNumeros();
    }

    @Override
    protected void analiza()
    {
        System.out.println("En marcha las camaras");
    }
}
