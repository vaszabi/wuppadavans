package hu.wup.wuppadavans;


import java.util.ArrayList;
import java.util.List;

public class UserService {

    private List<User> list;
    private List<User> newList;

    public UserService() {
        this.list = new ArrayList<>();
    }

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public List<User> getNewList() {
        return newList;
    }

    public void setNewList(List<User> newList) {
        this.newList = newList;
    }

    public void deleteUser(List<User> list, User user) {
        list.forEach(newList.add(list::iterator));

    }
}
