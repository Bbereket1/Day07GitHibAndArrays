public class KnowledgeCheck {
    public static void main(String[] args) {

        /*

        1. Create a method that takes an array of contacts and returns the 0th item in the array.

        2. A user has to create a new password. The only criteria for password creation is that it
           must be a length of 10 characters or more. Create a method that validates that the password
            meets the criteria.
         */

        String [] Bereketscontacts = {"Nada", "Mahder", "Savet"};
        System.out.println(firstContacts(Bereketscontacts));


        System.out.println(isValidatePassword("vavyupd"));

    }
    public static String firstContacts(String[] contacts) {
        return  contacts [0];
    }

    public static boolean isValidatePassword(String userPassword) {
        boolean results = userPassword.length()>=10;
            return results;

            // or we can just return like- return userPassword.length()>=10;
        }
    }

