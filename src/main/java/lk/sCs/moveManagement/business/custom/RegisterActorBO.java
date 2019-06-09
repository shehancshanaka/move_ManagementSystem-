package lk.sCs.moveManagement.business.custom;


import lk.sCs.moveManagement.business.SuperBO;
import lk.sCs.moveManagement.dto.RegisterActorDTO;

public interface RegisterActorBO extends SuperBO {

    public void saveActor(RegisterActorDTO registerActorDTO) throws Exception;



}
