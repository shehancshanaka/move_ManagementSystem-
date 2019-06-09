package lk.sCs.moveManagement.business.custom.impl;


import lk.sCs.moveManagement.DAO.ActorDAO;
import lk.sCs.moveManagement.DAO.MovieDAO;
import lk.sCs.moveManagement.DAO.RegisterActorDAO;
import lk.sCs.moveManagement.business.custom.RegisterActorBO;
import lk.sCs.moveManagement.dto.ActorDTO;
import lk.sCs.moveManagement.dto.RegisterActorDTO;
import lk.sCs.moveManagement.entity.Movie;
import lk.sCs.moveManagement.entity.RegisterActor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.NoResultException;

@Component
@Transactional
public class RegisterActorBOImpl implements RegisterActorBO {

    @Autowired
    private ActorDAO actorDAO;
    @Autowired
    private MovieDAO movieDAO;
    @Autowired
    private RegisterActorDAO registerActorDAO;

    public void saveActor(ActorDTO actorDTO) throws Exception {

        // Save the order
        registerActorDAO.save(new RegisterActor(actorDTO., order.getOrderDate(), customer));




    }

    @Override
    public void saveActor(RegisterActorDTO registerActorDTO) throws Exception {
        registerActorDAO.save(new Movie(registerActorDTO.,movieDTO.getName()));
    }
}
