public class Tarjeta {
    private String pregunta;
    private String respuesta;
    private double puntos;

    public Tarjeta(String pregunta, String respuesta, double puntos){
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.puntos = puntos;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getPregunta() {
        return this.pregunta;
    }

    public String getRespuesta() {
        return this.respuesta;
    }

    public double getPuntos() {
        return this.puntos;
    }
}
