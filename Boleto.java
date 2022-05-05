/*
    Nombre: Daniel Antonio Santana Leyva
    Descripción: Actividad 0.1 | Programación Móvil - Clase Boleto
    Fecha: 2022/05/03
*/

package examenintro;

public class Boleto {
    private int id;
    private String cliente;
    private float precio;
    private int tipo;
    private String fecha;
    private String destino;
    
    // Constructor vacío
    public Boleto(){
        this.id = 0;
        this.cliente = "";
        this.precio = 0.0f;
        this.tipo = 0;
        this.fecha = "";
        this.destino = "";
    }
    
    //Constructor de parámetros
    public Boleto(int id, String cliente, float precio, int tipo, String fecha, String destino){
        this.id = id;
        this.cliente = cliente;
        this.precio = precio;
        this.tipo = tipo;
        this.fecha = fecha;
        this.destino = destino;
    }
    
    // Constructor de copia
    public Boleto(Boleto bol){
        this.id = bol.id;
        this.cliente = bol.cliente;
        this.precio = bol.precio;
        this.tipo = bol.tipo;
        this.fecha = bol.fecha;
        this.destino = bol.destino;
    }
    
    //Métodos de propiedades | Encapsulamiento

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    // Métodos de comportamiento
    
    public float calcularSubtotal(){
        float subtotal = 0.0f;
        if (this.tipo == 1){
            subtotal = this.precio;
        }else if (this.tipo == 2){
            subtotal = this.precio * 1.8f;
        }
        return subtotal;
    }
    
    public float calcularImpuesto(){
        float impuesto = calcularSubtotal() * 0.16f;
        return impuesto;
    }
    
    public float hacerDescuento(int edad){
        float descuento = 0.0f;
        if (edad >= 60) {
            descuento = this.precio / 2;
        } else {
            descuento = 0;
        }
        return descuento;
    }
    
    public void calcularTotal(int edad){
        float total = calcularSubtotal() + calcularImpuesto() - hacerDescuento(edad);
        System.out.println("SUBTOTAL:           $ " + calcularSubtotal());
        System.out.println("IMPUESTO:         + $ " + calcularImpuesto());
        System.out.println("DESCUENTO:        - $ " + hacerDescuento(edad));
        System.out.println("---------------------------------");
        System.out.println("TOTAL A PAGAR:      $ " + total);
    }
    
    public void imprimirBoleto(int edad){
        String descTipo = "";
        if (this.tipo == 1){
            descTipo = "Sencillo";
        } else if (this.tipo == 2){
            descTipo = "Doble";
        }
        
        System.out.println("EL DESTINO FELIZ -- AGENCIA DE VIAJES\n");
        System.out.println("No. BOLETO:         " + this.id);
        System.out.println("FECHA:              " + this.fecha);
        System.out.println("NOMBRE DEL CLIENTE: " + this.cliente);
        System.out.println("DESTINO:            " + this.destino);
        System.out.println("TIPO DE VIAJE:      " + this.tipo + ": " + descTipo);
        System.out.println("PRECIO:             $ " + this.precio);
        System.out.println("        ---- IMPORTE ----        ");
        calcularTotal(edad);
    }
}
