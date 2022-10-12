package absfactory.order;

import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2022/05/23/18:48
 * @Description:
 */
public class OrderStore {
    public static void main(String[] args) {
        new Order(new BJOrder());
        Calendar instance = Calendar.getInstance();
    }
}
