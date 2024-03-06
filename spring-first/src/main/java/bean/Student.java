package bean;


import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private int age;
    private Map<String, Teacher> teacherMap = new HashMap();

    public void run() {
        System.out.println("学生姓名" + name + "学生年龄" + age);
        System.out.println(teacherMap);
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

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", teacherMap=" + teacherMap +
                '}';
    }
}
