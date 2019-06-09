package lk.sCs.moveManagement.DAO.impl;

import lk.sCs.moveManagement.DAO.QueryDAO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
public class QueryDAOImpl implements QueryDAO {

    @PersistenceContext
    private EntityManager entityManager;


}
