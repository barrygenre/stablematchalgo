import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> p1Pref = new ArrayList<String>();// jonte -male
        p1Pref.add("eltashie");
        p1Pref.add("mary");
        p1Pref.add("Ruth");
        p1Pref.add("leah");
        ArrayList<String> p2Pref = new ArrayList<String>();// eltashie -female
        p2Pref.add("kante");
        p2Pref.add("saka");
        p2Pref.add("vive");
        p2Pref.add("jonte");
        ArrayList<String> p3Pref = new ArrayList<String>();// leah -female
        p3Pref.add("saka");
        p3Pref.add("jonte");
        p3Pref.add("kante");
        p3Pref.add("vive");
        ArrayList<String> p4Pref = new ArrayList<String>();// saka -male
        p4Pref.add("Ruth");
        p4Pref.add("mary");
        p4Pref.add("leah");
        p4Pref.add("eltashie");
        ArrayList<String> p5Pref = new ArrayList<String>();// mary -female
        p4Pref.add("vive");
        p4Pref.add("kante");
        p4Pref.add("saka");
        p4Pref.add("jonte");
        ArrayList<String> p6Pref = new ArrayList<String>();// ruth -female
        p4Pref.add("jonte");
        p4Pref.add("kante");
        p4Pref.add("vive");
        p4Pref.add("saka");
        ArrayList<String> p7Pref = new ArrayList<String>();// vive -male
        p4Pref.add("leah");
        p4Pref.add("eltashie");
        p4Pref.add("mary");
        p4Pref.add("Ruth");
        ArrayList<String> p8Pref = new ArrayList<String>();// kante
        p4Pref.add("eltashie");
        p4Pref.add("Ruth");
        p4Pref.add("leah");
        p4Pref.add("mary");

        Subject p1 = new Subject("jonte", p1Pref);
        Subject p2 = new Subject("elstashie", p2Pref);
        Subject p3 = new Subject("leah", p3Pref);
        Subject p4 = new Subject("saka", p4Pref);
        Subject p5 = new Subject("mary", p5Pref);
        Subject p6 = new Subject("Ruth", p6Pref);
        Subject p7 = new Subject("vive", p7Pref);
        Subject p8 = new Subject("kante", p8Pref);
        Subject[] parr = { p1, p2, p3, p4, p5, p6, p7, p8 };
        Subject.subjectPreferenceMatcher(parr);

    }
}
