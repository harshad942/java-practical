public class Student {
    private static int n=1;
    protected String name;
    public String registration_no;
    public String bloodgroup;
    private String branch;
    protected String dateofbirth; //DD-MM-YYYY

    Student(String name, String dateofbirth, String bloodgroup, String branch) {
        this.name = name;
        this.dateofbirth = dateofbirth;
        this.bloodgroup = bloodgroup;
        this.branch = branch;
        this.registration_no = generatereg_no(branch);
    }

    private int agecalculator(String dob) {
        int year = Integer.parseInt(dob.substring(6));
        return 2025 - year;
    }

    private static String generatereg_no(String branch){
        String k = String.valueOf(n);
        String rgno = "2023b" + branch.toLowerCase() + "0".repeat(3 - k.length()) + n;
        n++;
        return rgno;
    }

    public String toString() {
        return "Name: " + name +"\nAge: " + agecalculator(dateofbirth) +"\nBlood Group: " + bloodgroup +"\nRegistration No: " + registration_no +"\nBranch: " + branch;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Harshad", "06-11-2005", "B+", "IT");
        System.out.println(s1);
    }
}
