package Muhtar_SDET.Day17_ClassAndObject_Intro.Task4_PatientInfo;

import java.util.Scanner;
  //template
    class Patient {

        Scanner input = new Scanner(System.in);

        public String firstName, lastName, email, street , city, state;
        public int zipCode, age ;
        public float height,weight;
        public String isMarried;
        public long workPhoneNum, personalNum;


        public void setInfo(String firstName, String lastName, String email, String street, String city,
                            String state, int zipCode, int age, float height, float weight,
                            String isMarried, long personalNum, long workPhoneNum)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.city = city;
            this.city = street;
            this.state = state;
            this.zipCode = zipCode;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.isMarried = isMarried;
            this.personalNum = personalNum;
            this.workPhoneNum = workPhoneNum;

        }

        public void showInfo(){
            System.out.println("Enter your first name: ");
            firstName = input.nextLine();

            System.out.println("Enter your last name: ");
            lastName = input.nextLine();

            System.out.println("Enter your email: ");
            email = input.nextLine();

            System.out.println("Enter your street: ");
            street = input.nextLine();

            System.out.println("Enter your city: ");
            city = input.nextLine();

            System.out.println("Enter your state: ");
            state = input.nextLine();

            System.out.println("Enter your zip code: ");
            zipCode = input.nextInt();

            System.out.println("Enter your age: ");
            age = input.nextInt();

            System.out.println("Enter your work phone number: ");
            workPhoneNum = input.nextLong();

            System.out.println("Enter your personal phone number: ");
            personalNum = input.nextLong();

            System.out.println("Are you married ? ");
            isMarried = input.next();

            summary();
        }

        private void summary() {

            System.out.println("Patient personal information" + "\n" + "firstName= " + firstName + "\n" +
                    " lastName= " + lastName + "\n" + ", email=" + email + "\n" + ", city=" + city + "\n" +
                    " state=" + state + "\n" + " zipCode=" + zipCode + "\n" + " age=" + age + "\n" +
                    " height=" + height + "\n" + " weight=" + weight + "\n" + " isMarried=" + isMarried + "\n" +
                    " workPhoneNum=" + workPhoneNum + "\n" + " personalNum=" + personalNum );
        }


        public String toString() {
            return "PatientInfo{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", email='" + email + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", zipCode=" + zipCode +
                    ", age=" + age +
                    ", height=" + height +
                    ", weight=" + weight +
                    ", isMarried=" + isMarried +
                    ", workPhoneNum=" + workPhoneNum +
                    ", personalNum=" + personalNum +
                    '}';
        }
    }

