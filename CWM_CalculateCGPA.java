import com.sun.jdi.PathSearchingVirtualMachine;

public class CWM_CalculateCGPA {
    public static void main(String[] args) {
        float sub1 = 95;
        float sub2 = 89;

        float sub3 = 91;
        float cgpa = (sub1+sub2+sub3)/30;
        System.out.println(cgpa);
    }
}
