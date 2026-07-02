
public class Factura {

    private String nombreCliente;
    private double monto;
    private int numeroMes;
    private String mesTexto;
    private int Electricos;
    private int Automotrices;
    private int Construccion;

    public Factura(String nombreCliente, double monto, int numeroMes,
                    int electricos, int automotrices, int construccion) {
        this.nombreCliente = nombreCliente;
        this.monto = monto;
        this.Electricos = electricos;
        this.Automotrices = automotrices;
        this.Construccion = construccion;
        setMesNumero(numeroMes); 
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getMesNumero() {
        return numeroMes;
    }

   
