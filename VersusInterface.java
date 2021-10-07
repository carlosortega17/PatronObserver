public class VersusInterface {
    public static void main(String[] args)
    {
        SistemaSensor s = new SistemaSensor();
        s.registro(new Puertas());
        s.registro(new Encendido());
        s.registro(new Supervivencia());
        s.suenaAlarma();
    }
}
