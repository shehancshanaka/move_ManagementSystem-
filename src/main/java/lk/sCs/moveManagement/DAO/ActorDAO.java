package lk.sCs.moveManagement.DAO;


import lk.sCs.moveManagement.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorDAO extends JpaRepository<Actor,String> {
    
}
