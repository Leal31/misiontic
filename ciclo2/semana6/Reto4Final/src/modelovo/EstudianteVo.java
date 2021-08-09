package modelovo;

public class EstudianteVo {
    
    // Atributos
    private String nombres;
    private String apellidos;
    private String nacimiento;
    private String programa;
    private long celular;
    private String CorreoInst;
    
    // Constructor vacio
    public EstudianteVo() {
        
    }
    
    // Metodo constructor
    public EstudianteVo(String nombres, String apellidos, String nacimiento, String programa, long celular, String CorreoInst) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nacimiento = nacimiento;
        this.programa = programa;
        this.celular = celular;
        this.CorreoInst = CorreoInst;
    }
    
    // Metodos get y set

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

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getCorreoInst() {
        return CorreoInst;
    }

    public void setCorreoInst(String CorreoInst) {
        this.CorreoInst = CorreoInst;
    }
}

