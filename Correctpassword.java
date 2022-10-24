import java.util.Scanner;

public class Correctpassword {

    public static void main(String args[]) {
        String user = "";
        String pword = "";
        int nattempts = 0;
        boolean out = false;

        Scanner s = new Scanner(System.in);

        
        while (nattempts < 3) { 
            System.out.println("Username: ");
            user = s.nextLine();
            System.out.println("Type your current password: ");
            pword = s.nextLine();
            out = userPasswordMatch(user, pword);
            nattempts++;
            if (out == false) {
                System.out.println("Username or password incorrect.");
                if (nattempts < 3)
                System.out.println("Try again.");
            }
            else{
                break;
            }

        }
        if (nattempts >= 2) {
            System.out.println("Too many attempts.");
        }
        else System.out.println("Login Successful.");


        s.close();
    }

public static boolean userPasswordMatch (String user, String pword) {
    boolean output = false;
    
    String a = new String("alpha");
    String a1 = new String("alpha1");
    String b = new String("beta");
    String b1 = new String("beta1");
    String g = new String("gamma");
    String g1 = new String("gamma1");
    String d = new String("delta");
    String d1 = new String("delta1");


    if ((user.equals(a) && pword.equals(a1)) || ((user.equals(b) && pword.equals(b1)) || ((user.equals(g) && pword.equals(g1))) || ((user.equals(d) && pword.equals(d1))) )) {
        output = true;
        
    }
    else output = false;

    return output;
}

}
