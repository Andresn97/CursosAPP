
package com.cursos.CursosVirtuales.repositorys;

import com.cursos.CursosVirtuales.models.Curso;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CursosRep extends JpaRepository<Curso, Long>{
    
    @Query(value = "SELECT c FROM Curso c WHERE c.id_curso = :idCurso")
    Curso buscarCursoById(@Param("idCurso") Long idCurso);
    
    @Query(value = "SELECT c FROM Curso c WHERE c.curso_nombre LIKE %:nombreCurso%")
    List<Curso> buscarCursoByNombre(@Param("nombreCurso") String nombreCurso);
    
    @Query(value = "UPDATE Curso c SET c.curso_activo = false WHERE c.id_curso = :idCurso")
    void eliminarByIdCurso(@Param("idCurso") Long idCurso);
    
}
