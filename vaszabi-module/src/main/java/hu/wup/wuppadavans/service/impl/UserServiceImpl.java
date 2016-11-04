package hu.wup.wuppadavans.service.impl;

import hu.wup.wuppadavans.model.User;
import hu.wup.wuppadavans.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private List<User> list;

    public UserServiceImpl() {
        this.list = new ArrayList<>();
    }

    @Override
    public List<User> getUsers() {
        return list;
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
        list.add(user);
    }
}