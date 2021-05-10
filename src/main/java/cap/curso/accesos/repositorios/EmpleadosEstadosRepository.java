package cap.curso.accesos.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cap.curso.accesos.entidades.EmployeeStatus;


@Repository
public interface EmpleadosEstadosRepository extends CrudRepository<EmployeeStatus, Integer>{
}
