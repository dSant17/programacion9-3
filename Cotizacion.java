/*
    Nombre: Daniel Antonio Santana Leyva
    Descripción: Actividad 0.2 | Programación Móvil - Clase Cotizacion
    Fecha: 2022/05/05
*/

package actividad02;

public class Cotizacion {
    private int numCotizacion;
    private String descripcion;
    private float precio;
    private int porcentajePagoIn;
    private int plazo;
    
    // Constructor vacío
    public Cotizacion(){
        this.numCotizacion = 0;
        this.descripcion = "";
        this.precio = 0.0f;
        this.porcentajePagoIn = 0;
        this.plazo = 0;
    }
    
    //Constructor de parámetros
    public Cotizacion(int numCotizacion, String descripcion, float precio, int porcentajePagoIn, int plazo){
        this.numCotizacion = numCotizacion;
        this.descripcion = descripcion;
        this.precio = precio;
        this.porcentajePagoIn = porcentajePagoIn;
        this.plazo = plazo;
    }
    
    // Constructor de copia
    public Cotizacion(Cotizacion cot){
        this.numCotizacion = cot.numCotizacion;
        this.descripcion = cot.descripcion;
        this.precio = cot.precio;
        this.porcentajePagoIn = cot.porcentajePagoIn;
        this.plazo = cot.plazo;
    }
    
    //Métodos de propiedades | Encapsulamiento

    /**
     * @return the numCotizacion
     */
    public int getNumCotizacion() {
        return numCotizacion;
    }

    /**
     * @param numCotizacion the numCotizacion to set
     */
    public void setNumCotizacion(int numCotizacion) {
        this.numCotizacion = numCotizacion;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the porcentajePagoIn
     */
    public int getPorcentajePagoIn() {
        return porcentajePagoIn;
    }

    /**
     * @param porcentajePagoIn the porcentajePagoIn to set
     */
    public void setPorcentajePagoIn(int porcentajePagoIn) {
        this.porcentajePagoIn = porcentajePagoIn;
    }

    /**
     * @return the plazo
     */
    public int getPlazo() {
        return plazo;
    }

    /**
     * @param plazo the plazo to set
     */
    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
    
    // Métodos de comportamiento
    
    public float calcularPagoIn(){
        float PagoIn = this.precio * ((float) this.porcentajePagoIn / 100);
        return PagoIn;
    }
    
    public float calcularTotalFin(){
        float TotalFin = this.precio - calcularPagoIn();
        return TotalFin;
    }
    
    public float calcularPagoMen(){
        float PagoMen = calcularTotalFin() / this.plazo;
        return PagoMen;
    }
    
    public void imprimirCotizacion(){
        System.out.println("---------------------------------------------");
        System.out.println("NUM. COTIZACION     " + this.numCotizacion);
        System.out.println("DESCRIPCIÓN         " + this.descripcion);
        System.out.println("PRECIO            $ " + this.precio);
        System.out.println("PORCENTAJE");
        System.out.println("    PAGO INICIAL    " + this.porcentajePagoIn + "%");
        System.out.println("PLAZO               " + this.plazo + " meses");
        System.out.print("\n");
        System.out.println("PAGO INICIAL      $ " + calcularPagoIn());
        System.out.println("TOTAL A FINANCIAR $ " + calcularTotalFin());
        System.out.println("PAGO MENSUAL      $ " + calcularPagoMen());
        System.out.println("---------------------------------------------");
        System.out.print("\n");
    }
}
