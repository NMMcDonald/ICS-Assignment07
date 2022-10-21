import java.util.Scanner;

public class Correctpassword {

    public static void main(String args[]) {
        String user = "";
        String pword = "";
        int nattempts = 0;
        boolean out = false;

        Scanner s = new Scanner(System.in);

        
        while (nattempts < 3) { //When I run the program with correct inputs it keeps running but if I use incorrect inputs it prints wrong pword try again but then program quits
            System.out.println("Username: ");
            user = s.nextLine();
            System.out.println("Type your current password: ");
            pword = s.nextLine();
            out = userPasswordMatch(user, pword);
            nattempts++;
        }

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
    else {
        System.out.println("Username or password incorrect.");
        System.out.println("Try again.");
    }

    return output;
}

}