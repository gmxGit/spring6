package Di;

public class Emp {
    //员工属于某个部门
    private Dept dept;
    private String ename;
    private Integer age;
    public void work(){
        dept.info();
        System.out.println(ename+" "+"emp work"+" "+age);
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Emp{" +" "+
        "dept=" + dept +""+
                ", ename='" + ename + "'\''" +
                ", age=" + age +
                '}';
    }
}
