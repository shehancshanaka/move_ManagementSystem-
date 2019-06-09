package lk.sCs.moveManagement.business.custom.impl;


import lk.sCs.moveManagement.DAO.ActorDAO;
import lk.sCs.moveManagement.business.custom.ActorBO;
import lk.sCs.moveManagement.dto.ActorDTO;
import lk.sCs.moveManagement.entity.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Transactional
public class ActorBOImpl implements ActorBO {

    @Autowired
    private ActorDAO actorDAO;


    @Override
    public List<ActorDTO> getAllCustomers() throws Exception {
        //List<ActorDTO> customers = ActorDAO.findAll().stream().map(customer -> new ActorDTO(Actor.getId(), customer.getName(), customer)).collect(Collectors.toList());

        return null;
    }

    @Override
    public void saveCustomer(ActorDTO dto) throws Exception {
        actorDAO.save(new Actor(dto.getId(), dto.getName(), dto.getAge()));
    }

    @Override
    public void updateCustomer(ActorDTO dto) throws Exception {
        actorDAO.save(new Actor(dto.getId(), dto.getName(), dto.getAge()));
    }

    @Override
    public void removeCustomer(int id) throws Exception {
        actorDAO.deleteById(String.valueOf(id));
    }


}
