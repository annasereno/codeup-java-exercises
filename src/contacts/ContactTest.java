package contacts;

public class ContactTest {

    public static void main(String[] args) {
        /* instantiate an object
        declaring a reference variable
         */
        Contact javier = new Contact();
        javier.setName("Javier");
        javier.setMobile("2103041928");


        Contact ibm = new Contact();
        ibm.setName("IBM");
        ibm.setMobile("7836662534");
        ibm.setEmail("contact@ibm.com");

        Contact mikeHoncho = new Contact("Mike Honcho", "7839990000", "mikehoncho@yahoo.com");
        System.out.println(mikeHoncho.display());

        System.out.println(javier.display());
        System.out.println(ibm.display());
        System.out.println(javier.getEmail());
    }
}
