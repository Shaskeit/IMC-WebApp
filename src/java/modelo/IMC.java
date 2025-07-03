package modelo;

public class IMC {
    private int id;
    private int usuarioId;
    private double peso;
    private double altura;
    private double resultado;

    public IMC() {
    }

    public IMC(int id, int usuarioId, double peso, double altura, double resultado) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.peso = peso;
        this.altura = altura;
        this.resultado = resultado;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
