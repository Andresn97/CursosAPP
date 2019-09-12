
package com.cursos.CursosVirtuales.controllers.v1;

import com.cursos.CursosVirtuales.models.Curso;
import com.cursos.CursosVirtuales.repositorys.CursosRep;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CursoCTR {
    
    @Autowired
    private CursosRep cursosRepositorio;
    
    @GetMapping("/cursos")
    @CrossOrigin
    public List<Curso> getAllCursos(){
        return this.cursosRepositorio.findAll();
    }
    
    @RequestMapping(value = "/curso", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public Curso createCurso(@RequestBody Curso curso){
        return this.cursosRepositorio.save(curso);
    }
    
    @RequestMapping(value = "/editarcurso", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public Curso updateCurso(@RequestBody Curso curso){
        return this.cursosRepositorio.save(curso);
    }
    
    @RequestMapping(value = "/eliminarcurso/{idCurso}", method = RequestMethod.DELETE)
    @ResponseBody
    @CrossOrigin
    public void eliminarCurso(@PathVariable Long idCurso){
        this.cursosRepositorio.eliminarByIdCurso(idCurso);
    }
    
    @GetMapping("/cursos/{idCurso}")
    @ResponseBody
    public Curso getCursoById(@PathVariable Long idCurso){
        return this.cursosRepositorio.buscarCursoById(idCurso);
    }
    
    @GetMapping("/cursos/{nombre}")
    @ResponseBody
    public List<Curso> getCursoByNombre(@PathVariable String nombreCurso){
        return this.cursosRepositorio.buscarCursoByNombre(nombreCurso);
    }
    
}
