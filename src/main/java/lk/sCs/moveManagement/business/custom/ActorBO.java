package lk.sCs.moveManagement.business.custom;



import lk.sCs.moveManagement.business.SuperBO;
import lk.sCs.moveManagement.dto.ActorDTO;

import java.util.List;

public interface ActorBO extends SuperBO {
    public List<ActorDTO> getAllCustomers() throws Exception;
    public void saveCustomer(ActorDTO dto)  throws Exception;

    public void updateCustomer(ActorDTO dto)throws Exception;

    public void removeCustomer(int id)throws Exception;



}
