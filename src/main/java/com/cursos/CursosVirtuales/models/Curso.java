package com.cursos.CursosVirtuales.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"Cursos\"")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_curso", nullable = false)
    private Long id_curso;
    
    @Column(name = "curso_nombre", nullable = false)
    private String curso_nombre;
    
    @Column(name = "curso_duracion", nullable = false)
    private int curso_duracion;
    
    @Column(name = "curso_num_cupos", nullable = false)
    private int num_cupos_curso;
    
    @Column(name = "curso_fecha_inicio", nullable = false)
    private Date fecha_inicio_curso;
    
    @Column(name = "curso_fecha_fin", nullable = false)
    private Date fecha_fin_curso;
    
    @Column(name = "curso_horario", nullable = false)
    private String curso_horario;
    
    @Column(name = "curso_docente", nullable = false)
    private  String curso_docente;
    
    @Column(name = "curso_responsable", nullable = false)
    private String curso_responsable;
    
    @Column(name = "curso_disponibilidad", nullable = false)
    private String curso_disponibilidad;
    
    @Column(name = "curso_activo", nullable = false)
    private String curso_activo;

    public Curso() {
    }

    public Curso(Long id_curso, String curso_nombre, int curso_duracion, int num_cupos_curso, Date fecha_inicio_curso, Date fecha_fin_curso, String curso_horario, String curso_docente, String curso_responsable, String curso_disponibilidad, String curso_activo) {
        this.id_curso = id_curso;
        this.curso_nombre = curso_nombre;
        this.curso_duracion = curso_duracion;
        this.num_cupos_curso = num_cupos_curso;
        this.fecha_inicio_curso = fecha_inicio_curso;
        this.fecha_fin_curso = fecha_fin_curso;
        this.curso_horario = curso_horario;
        this.curso_docente = curso_docente;
        this.curso_responsable = curso_responsable;
        this.curso_disponibilidad = curso_disponibilidad;
        this.curso_activo = curso_activo;
    }

    public Long getId_curso() {
        return id_curso;
    }

    public void setId_curso(Long id_curso) {
        this.id_curso = id_curso;
    }

    public String getCurso_nombre() {
        return curso_nombre;
    }

    public void setCurso_nombre(String curso_nombre) {
        this.curso_nombre = curso_nombre;
    }

    public int getCurso_duracion() {
        return curso_duracion;
    }

    public void setCurso_duracion(int curso_duracion) {
        this.curso_duracion = curso_duracion;
    }

    public int getNum_cupos_curso() {
        return num_cupos_curso;
    }

    public void setNum_cupos_curso(int num_cupos_curso) {
        this.num_cupos_curso = num_cupos_curso;
    }

    public Date getFecha_inicio_curso() {
        return fecha_inicio_curso;
    }

    public void setFecha_inicio_curso(Date fecha_inicio_curso) {
        this.fecha_inicio_curso = fecha_inicio_curso;
    }

    public Date getFecha_fin_curso() {
        return fecha_fin_curso;
    }

    public void setFecha_fin_curso(Date fecha_fin_curso) {
        this.fecha_fin_curso = fecha_fin_curso;
    }

    public String getCurso_horario() {
        return curso_horario;
    }

    public void setCurso_horario(String curso_horario) {
        this.curso_horario = curso_horario;
    }

    public String getCurso_docente() {
        return curso_docente;
    }

    public void setCurso_docente(String curso_docente) {
        this.curso_docente = curso_docente;
    }

    public String getCurso_responsable() {
        return curso_responsable;
    }

    public void setCurso_responsable(String curso_responsable) {
        this.curso_responsable = curso_responsable;
    }

    public String getCurso_disponibilidad() {
        return curso_disponibilidad;
    }

    public void setCurso_disponibilidad(String curso_disponibilidad) {
        this.curso_disponibilidad = curso_disponibilidad;
    }

    public String getCurso_activo() {
        return curso_activo;
    }

    public void setCurso_activo(String curso_activo) {
        this.curso_activo = curso_activo;
    }
    
    
    
}
