package lk.sCs.moveManagement.DAO;


import lk.sCs.moveManagement.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;



public interface MovieDAO extends JpaRepository<Movie,String> {



}
