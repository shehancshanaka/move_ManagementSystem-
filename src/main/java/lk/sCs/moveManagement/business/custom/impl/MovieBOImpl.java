package lk.sCs.moveManagement.business.custom.impl;


import lk.sCs.moveManagement.DAO.MovieDAO;
import lk.sCs.moveManagement.business.custom.MoveBO;
import lk.sCs.moveManagement.dto.MovieDTO;
import lk.sCs.moveManagement.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;



@Component
@Transactional
public class MovieBOImpl implements MoveBO {

    @Autowired
    private MovieDAO movieDAO;





    @Override
    public void saveMovie(MovieDTO movieDTO) throws Exception {
        movieDAO.save(new Movie(movieDTO.getId(),movieDTO.getName()));
    }

    @Override
    public void updateMovie(MovieDTO movieDTO) throws Exception {
        movieDAO.save(new Movie(movieDTO.getId(),movieDTO.getName()));
    }

    @Override
    public void deleteMovie(int id) throws Exception {
      movieDAO.deleteById(String.valueOf(id));

    }
}
