package interfaces.interfaces04;

public interface Saludo {

    //no confundir abstract con protected!!!!!
    public String saludoA(String nombre);

    public default String saludo(){
        return "hola";
    }
}
