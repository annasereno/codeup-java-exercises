package contacts;

import java.security.cert.CertPath;

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
//        System.out.println(mikeHoncho.display());

        Contact shakira = new Contact("Shakira", "8982450000", "shakira@hipsdontlie.com");

        Contact rickyBobby = new Contact("Ricky Bobby", "7827379999", "ricky@bobby.com");


        Contact[] contacts= {mikeHoncho, rickyBobby,shakira};

        for (Contact contact : contacts){
            System.out.printf("name: %s%n", contact.getName());
            System.out.printf("Phone: %s%n", contact.getMobile());
            System.out.println(" ");
        }

        Contact britney = new Contact("Britney", "7832749487", "itsbritney@b.com");

        contacts = Contact.addContact(contacts, britney);

//        System.out.println(javier.display());
//        System.out.println(ibm.display());
//        System.out.println(javier.getEmail());

    }
}
