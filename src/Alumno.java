public class Alumno {

    /**
     * La clase alumno representa un alumno del instituto.
     */
    private String nombre;
    private String apellidos;
    private String clase;
    private String dni;
    private int telefono;

    /**
     * Constructor de la clase Alumno.
     *
     * @param nombre   el nombre del alumno
     * @param apellidos   el apellido del alumno
     * @param dni   el dni del alumno
     * @param clase  la clase del alumno
     * @param telefono el telefono del alumno
     */

    public Alumno(String nombre, String apellidos, String dni, String clase, int telefono)
    {
        nombre = nombre;
        apellidos = apellidos;
        clase = clase;
        dni = dni;
        telefono = telefono;
    }

    /**
     * Obtiene el nombre del alumno
     *
     * @return el nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Establece el nombre del titular de la cuenta.
     *
     * @param nombre el nombre del titular de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene el apellido del alumno
     *
     * @return el apellido del alumno
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece el apellido del alumno.
     *
     * @param apellidos el apellido
     */

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    /**
     * Obtiene la clase del alumno.
     *
     * @return la clase del alumno
     */

    public String getClase() {
        return clase;
    }
    /**
     * Establece la clase del alumno.
     *
     * @param clase la clase del alumno
     */

    public void setClase(String clase) {
        this.clase = clase;
    }

    /**
     * Obtiene el Dni del alumno.
     *
     * @return el dni del alumno
     */
    public String getDni() {
        return dni;
    }

    /**
     * Establece el Dni del alumno.
     *
     * @param dni el dni del alumno
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Obtiene el telefono del alumno.
     *
     * @return el telefono del alumno
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Establece el telefono del alumno.
     *
     * @param telefono el telefono del alumno
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
