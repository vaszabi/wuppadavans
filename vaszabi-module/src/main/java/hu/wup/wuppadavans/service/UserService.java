package hu.wup.wuppadavans.service;

import hu.wup.wuppadavans.model.User;

import java.util.List;

/**
 * Created by szvarga on 2016. 11. 04..
 */
public interface UserService {

    //TODO javadoc
    /**
     * Documentation are there
     *
     * @return List userek listaja
     */
    List<User> getUsers();

    //TODO javadoc
    /**
     *
     * @param id
     */
    void delete(Long id);
    //TODO javadoc
    /**
     *
     * @param user
     */
    void createUser(User user);
}
