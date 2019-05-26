package traductor;

public class Palabra {

    private String Palabra;
    private String ingles;
    private String portugues;
    private String descripcion;

    public Palabra(String Palabra, String ingles, String portugues,String descripcion) {
        this.Palabra = Palabra;
        this.ingles = ingles;
        this.portugues = portugues;
        this.descripcion= descripcion;
    }

    public String getPortugues() {
        return portugues;
    }

    public void setPortugues(String portugues) {
        this.portugues = portugues;
    }

    public String getPalabra() {
        return Palabra;
    }

    public void setPalabra(String Palabra) {
        this.Palabra = Palabra;
    }

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }
      
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Override
    public String toString() {
        return "\nEspañol =" + Palabra + "\nIngles =" + ingles + "\nPortugues =" + portugues +"\nDescripcion ="+ descripcion;
    }


}
