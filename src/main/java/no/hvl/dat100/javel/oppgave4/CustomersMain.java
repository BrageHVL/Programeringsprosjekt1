package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        Customers customers = new Customers(3);
        Customer customer = new Customer(
                "Nicholas", "nicholas@example.com", 1, PowerAgreementType.NORGESPRICE);

        System.out.println("addCustomer: " + customers.addCustomer(customer)); // forventet: true
        System.out.println("countNonNull: " + customers.countNonNull()); // forventet: 1
        System.out.println("getCustomer: " + customers.getCustomer(1)); // forventet: Nicholas ...
        System.out.println("removeCustomer: " + customers.removeCustomer(1)); // forventet: Nicholas ...
        System.out.println("countNonNull etter fjerning: " + customers.countNonNull()); // forventet: 0

    }
}
