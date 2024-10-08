package Muhtar_SDET.Day08_Ternaries_SwitchStatement;

public class Task2_FieldTrip {
    public static void main(String[] args) {
        int grade = 100;

        String location = "Unknown";
        int numOfGroup = 0;
        String teacher = "Unknown";

        if (grade >= 1 && grade <= 6) { // else blog does not put because if if blog does not execute print will execute
            if (grade == 1) {
                location = "Apple orchard";
                numOfGroup = 3;
                teacher = "Ms. Smith";

            } else if (grade == 2) {
                location = "Zoo";
                numOfGroup = 7;
                teacher = "Ms. Lee";

            } else if (grade == 3) {
                location = "Aquarium";
                numOfGroup = 5;
                teacher = "Ms. Wilson";
            }else if (grade == 4) {
                location = "Movie theater";
                numOfGroup = 2;
                teacher = "Ms. Reyes";
            }else if (grade == 5) {
                location = "Museum";
                numOfGroup = 5;
                teacher = "Ms. Lela";

            }else { // grade ==6
                location = "Six Flags";
                numOfGroup = 8;
                teacher = "Mr. Watt";
            }
        }
        System.out.println("location = " + location);
        System.out.println("numOfGroup = " + numOfGroup);
        System.out.println("teacher = " + teacher);
    }
}

/*
Create a class called FieldTrip. Your school goes on a Field trip each year.The place you go will be based on your grade.
		Given a variable gradeNumber figure out the details of your field trip. Print the information at the end.
			    Data based on grade:
			        grade - 1
				        location -  Apple orchard
				        number of groups - 3
				        teacher in charge - Ms. Smith

			        grade - 2
				        location - Zoo
				        number of groups - 7
				        teacher in charge - Mr. Lee

			        grade - 3
				        location - Aquarium
				        number of groups - 5
				        teacher in charge - Ms. Wilson

			        grade - 4
				        location - Movie theater
				        number of groups - 2
				        teacher in charge - Ms. Reyes

			        grade - 5
				        location - Museum
				        number of groups - 5
				        teacher in charge - Ms. Lela

			        grade - 6
				        location - Six Flags
				        number of groups - 8
				        teacher in charge - Mr. Watt

			        for any other gradeNumber:
			        	location - Unknown
			        	numer of gourps - 0
			        	teacher in charge - Unknown
 */