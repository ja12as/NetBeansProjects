
package controladores;


public class Profesores {
  int codigo, edad, salario;
String nombre1, apellido1, telefono, cedula, time_inicio,time_hora, tipo_contrato, time_final, eps, fondo_empleado, cesantia_valor, caja_compensacion;
// vinculado:

    public Profesores(int codigo, int edad, int salario, String nombre1, String apellido1, String telefono, String cedula, String time_inicio, String tipo_contrato, String fondo_empleado, String cesantia_valor) {
        this.codigo = codigo;
        this.edad = edad;
        this.salario = salario;
        this.nombre1 = nombre1;
        this.apellido1 = apellido1;
        this.telefono = telefono;
        this.cedula = cedula;
        this.time_inicio = time_inicio;
        this.tipo_contrato = tipo_contrato;
        this.fondo_empleado = fondo_empleado;
        this.cesantia_valor = cesantia_valor;
    }

// contrartista:
   public Profesores(int codigo, int edad, int salario, String nombre1, String apellido1, String telefono, String cedula, String time_inicio, String tipo_contrato, String time_final, String eps, String caja_compensacion) {
        this.codigo = codigo;
        this.edad = edad;
        this.salario = salario;
        this.nombre1 = nombre1;
        this.apellido1 = apellido1;
        this.telefono = telefono;
        this.cedula = cedula;
        this.time_inicio = time_inicio;
        this.tipo_contrato = tipo_contrato;
        this.time_final = time_final;
        this.eps = eps;
        this.caja_compensacion = caja_compensacion;
    }

// catedra:

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTime_inicio() {
        return time_inicio;
    }

    public void setTime_inicio(String time_inicio) {
        this.time_inicio = time_inicio;
    }

    public String getTime_hora() {
        return time_hora;
    }

    public void setTime_hora(String time_hora) {
        this.time_hora = time_hora;
    }

    public String getTipo_contrato() {
        return tipo_contrato;
    }

    public void setTipo_contrato(String tipo_contrato) {
        this.tipo_contrato = tipo_contrato;
    }

    public String getTime_final() {
        return time_final;
    }

    public void setTime_final(String time_final) {
        this.time_final = time_final;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getFondo_empleado() {
        return fondo_empleado;
    }

    public void setFondo_empleado(String fondo_empleado) {
        this.fondo_empleado = fondo_empleado;
    }

    public String getCesantia_valor() {
        return cesantia_valor;
    }

    public void setCesantia_valor(String cesantia_valor) {
        this.cesantia_valor = cesantia_valor;
    }

    public String getCaja_compensacion() {
        return caja_compensacion;
    }

    public void setCaja_compensacion(String caja_compensacion) {
        this.caja_compensacion = caja_compensacion;
    }



}
