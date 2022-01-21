import java.util.ArrayList;

public class Subject {
    boolean status = false;
    ArrayList<String> subject_preference;
    String matched_preference, name;

    public Subject(String name, ArrayList<String> subject_preference) {

        this.subject_preference = subject_preference;
        this.name = name;
    }

    public boolean isSubjectMatched(Subject subject) {
        if (subject.status == true && subject.matched_preference != null) {
            return true;
        } else {
            return false;
        }
    }

    public static void subjectPreferenceMatcher(Subject[] subject) {
        int reverse_counter = subject.length-1;
        System.out.println("reverse_counter:" + reverse_counter);
        for (int i = 0; i <= subject.length - 1; i++) {
            reverse_counter--;
            for (int x = 0; x <= subject[i].subject_preference.size()-1; x++) {
                System.out.println("foward index:"+i+" reverse index:"+reverse_counter+" index of x:"+ x);
                if (subject[i].subject_preference
                        .indexOf(subject[i].subject_preference.get(x)) <= subject[reverse_counter].subject_preference
                                .indexOf(subject[reverse_counter].subject_preference.get(x-1))
                        && subject[reverse_counter].subject_preference
                                .indexOf(subject[reverse_counter].subject_preference
                                        .get(x)) <= subject[i].subject_preference
                                                .indexOf(subject[i].subject_preference.get(x))) {
                    subject[i].status = true;
                    subject[reverse_counter].status = true;
                    subject[i].matched_preference = subject[reverse_counter].subject_preference.get(x);
                    subject[reverse_counter].matched_preference = subject[i].subject_preference.get(x);
                } else {
                    System.out.println("No match found!");
                }
            }
        }
        for (int i = 0; i < subject.length; i++) {
            System.out.println("Matched couples are:" + subject[i].matched_preference + " and " + subject[i].name);
        }
        System.out.println("Processing completed");
    }

    public boolean isAvailable(Subject subject) {
        if (subject.matched_preference != null && status == true) {
            System.out.println("Match already made!");
            return true;
        } else {
            System.out.println("Match available!");
            return false;
        }
    }
}
