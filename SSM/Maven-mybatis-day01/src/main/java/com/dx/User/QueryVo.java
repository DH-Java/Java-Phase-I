package com.dx.User;

import java.util.List;

public class QueryVo {
    private UserMybatis userMybatis;
    private List<Integer> ids;

    public UserMybatis getUserMybatis() {
        return userMybatis;
    }

    public void setUserMybatis(UserMybatis userMybatis) {
        this.userMybatis = userMybatis;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }
}
