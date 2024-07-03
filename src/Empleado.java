import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {
    public empleado(String nombre, int edad, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        this.fechaInicio = new GregorianCalendar(2000, Calendar.JUNE,23);
    }

    public empleado(String nombre, int edad, double sueldo, Calendar fechaInicio) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        this.fechaInicio = fechaInicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    private String nombre;
    private int edad;
    private double sueldo;
    private Calendar fechaInicio;
}
