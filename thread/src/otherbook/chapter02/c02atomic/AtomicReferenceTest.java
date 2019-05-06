package otherbook.chapter02.c02atomic;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceTest {

    public static void main(String[] args) {
        User user = new User("SongMY", 16);
        User updateUser = new User("LiuFF", 17);
        AtomicReference<User> reference = new AtomicReference<>(user);

        reference.compareAndSet(user, updateUser);
        System.out.println(reference.get());
    }

    public static class User {
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

}


