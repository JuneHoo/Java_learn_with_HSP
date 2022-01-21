package com.edu.generic_;

import com.sun.corba.se.impl.orb.ParserTable;
import org.junit.jupiter.api.Test;

import javax.naming.Name;
import java.util.*;

public class HW01 {
    public static void main(String[] args) {

    }
    @Test
    public void testList() {
        // 在这里给泛型T 指定类型User
        Dao<User> dao = new Dao<>();
        dao.save("001", new User(1, 10, "jack"));
        dao.save("002", new User(2, 18, "king"));
        dao.save("003", new User(3, 38, "smith"));

        List<User> list = dao.list();
        System.out.println("list = " + list);
        dao.update("003", new User(3, 58, "millan"));
        System.out.println("=======修改后=======");
        list = dao.list();
        System.out.println("list = " + list);

        System.out.println("id=003" + dao.get("003"));
    }
}

class User {
    private int id;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", Name='" + Name + '\'' +
                '}';
    }

    private String Name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}


// 泛型类
class Dao<T> {
    private Map<String, T> map = new HashMap<>();

    public T get(String id) {
        return map.get(id);
    }


    public void update(String id, T entity) {
        map.put(id, entity);
    }

    // 返回map中存放的所有T对象
    // 遍历map[k-v] 将map的所有value，封装到ArrayList返回即可
    public List<T> list() {
        List<T> list = new ArrayList<>();

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            list.add(map.get(key));
        }
        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }

    public void save(String id, T entity) {
        map.put(id, entity);
    }

}
