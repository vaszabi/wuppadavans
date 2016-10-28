package hu.wup.wuppadavans;


import java.util.ArrayList;
import java.util.List;

public class UserService {

    private List<User> list;

    public UserService() {
        this.list = new ArrayList<>();
    }

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }





}
