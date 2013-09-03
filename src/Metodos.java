/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user2
 */
public class Metodos {

    private String[] precios = {"3", "8", "5", "4", "2", "1", "10", "9", "10", "13", "1,25", "12", "6", "8", "10"};
    private int precioUnitario, cantidad;
    private String tipoOper, pedido;
    private double precio;
    private javax.swing.JComboBox cmbProducto = null;
    private javax.swing.JTextField txtCantidad = null;

    public Metodos(javax.swing.JComboBox cmbProducto, javax.swing.JTextField txtCantidad) {
        this.cmbProducto = cmbProducto;
        this.txtCantidad = txtCantidad;
                }

    public Metodos(int precioUnitario, String tipoOper, float precio, int cantidad , javax.swing.JComboBox cmbProducto, javax.swing.JTextField txtCantidad) {
        this.precioUnitario = precioUnitario;
        this.tipoOper = tipoOper;
        this.precio = precio;
        this.cantidad = cantidad;
        this.cmbProducto = cmbProducto; 
        this.txtCantidad = txtCantidad;
        
    }
    public void setCombo(javax.swing.JComboBox combo){
        cmbProducto = combo;
    }
    public String getPedido() {
        pedido = "" + cmbProducto.getSelectedItem();
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public String[] getPrecios() {
        return precios;
    }

    public void setPrecios(String[] precios) {
        this.precios = precios;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getTipoOper() {
        return tipoOper;
    }

    public void setTipoOper(String tipoOper) {
        this.tipoOper = tipoOper;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public double getPrecioEfectivo(double precioUnitario, double cantidad) {
        precio = cantidad * precioUnitario;
        return (precio - (precio * 0.05));
    }

    public double getPrecioDebito(double precioUnitario, double cantidad) {
        precio = cantidad * precioUnitario;
        return precio;
    }

    public int getCantidad() {
        cantidad =Integer.parseInt(txtCantidad.getText());
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
