 public class Employee {
        private int ID;
        private int shift;
        private String firstName;
        private String lastName;
        private String emailAddress;
        private String homePhone;
        private String workPhone;
        private String cellPhone;


        public Employee(int ID, int shift, String firstName, String lastName, String emailAddress, String homePhone, String workPhone, String cellPhone){
            this.ID = ID;
            this.shift = shift;
            this.firstName = firstName;
            this.lastName = lastName;
            this.emailAddress = emailAddress;
            this.homePhone = homePhone;
            this.workPhone = workPhone;
            this.cellPhone = cellPhone;

        }

        public int getID(){
            return ID;
        }

        public void setID(int ID){
            this.ID = ID;
        }

         public int getShift(){
            return shift;
         }

         public void setshift(int shift){
            this.shift = shift;
         }

        public String getFirstName(){
            return firstName;
        }

        public void setFirstName(String firstName){
            this.firstName = firstName;
        }

        public String getLastName(){
            return lastName;
        }

        public void setLastName(String lastName){
            this.lastName = lastName;
        }

        public String getEmailAddress(){
            return emailAddress;
        }

        public void setEmailAddress(String emailAddress){
            this.emailAddress = emailAddress;
        }
        public String getHomePhone(){
            return homePhone;
        }

        public void setHomePhone(String homePhone){
            this.homePhone = homePhone;
        }
        public String getfirstName(){
            return firstName;
        }

        public void setID(String firstName){
            this.firstName = firstName;
        }
        public String getWorkPhone(){
            return workPhone;
        }

        public void setWorkPhone(String workPhone){
            this.workPhone = workPhone;
        }
        public String getCellPhone(){
            return cellPhone;
        }

        public void setCellPhone(String cellPhone){
            this.cellPhone = cellPhone;
        }





        public void printAll(){
            System.out.println("ID Number: " + ID + "\nWorking Shift: " + shift + "\nFirst Name: " + firstName + "\nLast Name" + lastName + "\n" + "\nEmail: " + emailAddress + "\nHome Phomne: "
                    + homePhone + "\nWork Phone: " + workPhone + "\nCell Phone: " + cellPhone + "\n\n");
        }


    }


