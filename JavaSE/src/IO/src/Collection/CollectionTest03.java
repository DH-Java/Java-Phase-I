package IO.src.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;


public class CollectionTest03 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        User user = new User("abc");
        collection.add(user);
        User user1 = new User("abc");
        System.out.println(collection.contains(user1));
        collection.remove(user1);
        System.out.println(collection.size());

    }
}

class User{
    String name;
    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }


}
