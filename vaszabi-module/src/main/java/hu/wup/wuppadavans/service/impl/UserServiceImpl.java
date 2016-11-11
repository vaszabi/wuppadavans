package hu.wup.wuppadavans.service.impl;

import hu.wup.wuppadavans.entity.UsersEntity;
import hu.wup.wuppadavans.model.User;
import hu.wup.wuppadavans.repository.UsersRepository;
import hu.wup.wuppadavans.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private UsersRepository usersRepository;
    private List<User> list;

    @Autowired
    public void setUsersRepository(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public UserServiceImpl() {
        this.list = new ArrayList<>();
    }

    @Override
    public List<User> getUsers() {
        List<User> userElements = new ArrayList<>();
        List<UsersEntity> userEntities = usersRepository.findAll();
        for (UsersEntity entity : userEntities) {
            User user = new User();
            user.setFirstname(entity.getFirstname());
            user.setLastname(entity.getLastname());
            user.setGender(entity.getGender());
            user.setAge(entity.getAge());

            userElements.add(user);
        }
        return userElements;
    }

    @Override
    public void delete(Long id) {
        List<User> temp = new ArrayList<>();
        for (User user : list) {
            if (!id.equals(user.getId())) {
                temp.add(user);
            }
        }
        list = temp;
    }

    @Override
    public void createUser(User user) {
        UsersEntity UserEntity = new UsersEntity(user.getFirstname(), user.getLastname(), user.getGender(), user.getAge());
        usersRepository.save(UserEntity);
    }

    @Override
    public User getOneUser(Long id) {

        for (User user : list) {
            if (id.equals(user.getId())) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void modify(Long id, User modifiedUser) {

        for (User user : list) {
            if (id.equals(user.getId())) {
                user.setFirstname(modifiedUser.getFirstname());
                user.setLastname(modifiedUser.getLastname());
                user.setAge(modifiedUser.getAge());
                user.setGender(modifiedUser.getGender());
            }

        }
    }
}

