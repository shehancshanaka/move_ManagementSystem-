package lk.sCs.moveManagement.business.custom;


import lk.sCs.moveManagement.business.SuperBO;
import lk.sCs.moveManagement.dto.MovieDTO;

public interface MoveBO extends SuperBO {

    public void saveMovie(MovieDTO movieDTO) throws Exception;

    public void updateMovie(MovieDTO movieDTO)throws Exception;

    public void deleteMovie(int id) throws Exception;

}
