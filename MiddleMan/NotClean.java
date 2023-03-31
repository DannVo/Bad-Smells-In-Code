package MiddleMan;

public class NotClean {
    void Main(String[] args){
        Person person = new Person();
        Department department = person.getDepartment();
        person = department.GetManager();
    }

    class Person{
        public Department department;
        public  Department getDepartment(){
            return department;
        }
    }

    class Department{
        private Person manager;
        public Department(Person manager){
            this.manager = manager;
        }

        public Person GetManager(){
            return manager;
        }
    }
}
