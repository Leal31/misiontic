package modelovo;

public class EstudianteVo {
    
    // Atributos
    private String nombres;
    private String apellidos;
    private String nacimiento;
    private String CorreoInst;
    private String correoPersonal;
    private long celular;
    private long fijo;
    private String programa;
    
    
    // Constructor vacio
    public EstudianteVo() {
        
    }
    
    // Metodo constructor
    public EstudianteVo(String nombres, String apellidos, String nacimiento, String CorreoInst, String correoPersonal, long celular, long fijo, String programa) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nacimiento = nacimiento;
        this.CorreoInst = CorreoInst;
        this.correoPersonal = correoPersonal;
        this.celular = celular;
        this.fijo = fijo;
        this.programa = programa;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getCorreoInst() {
        return CorreoInst;
    }

    public void setCorreoInst(String CorreoInst) {
        this.CorreoInst = CorreoInst;
    }

    public String getCorreoPersonal() {
        return correoPersonal;
    }

    public void setCorreoPersonal(String correoPersonal) {
        this.correoPersonal = correoPersonal;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public long getFijo() {
        return fijo;
    }

    public void setFijo(long fijo) {
        this.fijo = fijo;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
    
}

   