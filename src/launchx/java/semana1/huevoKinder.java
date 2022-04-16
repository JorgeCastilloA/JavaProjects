package launchx.java.semana1;

public class huevoKinder {

    private int llantas;
    private int carroceria;
    private int asientos;
    private int chasis;

    private String color;

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        if (llantas<4){
            System.out.println("Faltan llantas");
        } else
            this.llantas = llantas;
        System.out.println("Llantas listas");
    }

    public int getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(int carroceria) {
        if (carroceria>=1){
            this.carroceria=carroceria;
            System.out.println("Carrocería lista");
        }else
            System.out.println("No hay carrocería");
    }

    public int getAsientos() {
        return asientos;
    }

    public String setAsientos(int asientos) {
        if (asientos<4){
            return "Faltan asientos";
        } else
            this.asientos = asientos;
        return "Interiores listos";
    }

    public int getChasis() {
        return chasis;
    }

    public boolean setChasis(int chasis) {
        if (chasis == 1) {
            this.chasis = chasis;
            System.out.println("Chasis Listo");
            return true;
        } else
        return false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println(color);
    }

    
}