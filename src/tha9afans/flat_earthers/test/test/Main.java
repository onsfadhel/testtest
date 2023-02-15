package tha9afans.flat_earthers.test.test;

import tha9afans.flat_earthers.test.entities.Personne;
import tha9afans.flat_earthers.test.services.ServicePersonne;
import tha9afans.flat_earthers.test.services.ServiceRole;

public class Main {
    public static void main(String[] args) {

        Personne p1= new Personne("852000","test","fadhel","testfl@gmail.com","test","25789632","tunis","2007-04-24");
        ServicePersonne sp = new ServicePersonne();
        ServiceRole sr=new ServiceRole();
        System.out.println(sp.getOneById(5));



    }
}
