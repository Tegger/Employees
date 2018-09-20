public class Main {
    public static void main(String args[]){

        Employee person1 = new Employee(1,1,"John", "Arbuckle", "Jarbuckle@yahoo.com", "815-245-6774",
                "247-856-2234", "765-324-0998");

        Employee person2 = new Employee(2,2,"Jane", "Doe", "Jdoe@yahoo.com", "815-325-4324",
                "232-345-4216", "732-765-2943");

        Employee person3 = new Employee(2,2,"Jack", "Borne", "Jborne@yahoo.com", "815-634-5132",
                "533-623-5363", "321-987-4324");
        person1.printAll();
        person2.printAll();
        person3.printAll();

    }




}
