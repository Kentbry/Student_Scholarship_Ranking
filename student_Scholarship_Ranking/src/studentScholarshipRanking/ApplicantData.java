package studentScholarshipRanking;

public class ApplicantData {

    public static String[] studentID = new String[100];
    public static String[] studentName = new String[100];
    public static double[] studentScore = new double[100];
    public static boolean[] awarded = new boolean[100];

    public static int count = 0;

    public static boolean addApplicant(String id, String name, double score) {

        if (count >= studentID.length) {
            return false;
        }

        if (findIndex(id) != -1) {
            return false;
        }

        studentID[count] = id;
        studentName[count] = name;
        studentScore[count] = score;
        awarded[count] = false;

        count++;

        return true;
    }

    public static void main(String[] args) {

    }
}
