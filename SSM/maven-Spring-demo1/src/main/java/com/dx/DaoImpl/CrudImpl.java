package com.dx.DaoImpl;

import com.dx.Dao.Crud;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 67636
 * @Date: 2022/09/29/21:48
 * @Description:
 */
@Component
public class CrudImpl implements Crud {

    @Override
    public int select(int id) {
        System.out.println("select          "+id);
        return 100;
    }
}
