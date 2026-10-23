package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();


        Customer nicholas = new Customer(
                "Nicholas", "nicholas@example.com", 1, PowerAgreementType.NORGESPRICE);
        Customer sara = new Customer(
                "Sara", "sara@example.com", 2, PowerAgreementType.SPOTPRICE);
        Customer amir = new Customer(
                "Amir", "amir@example.com", 3, PowerAgreementType.POWERSUPPORT);

        Invoice[] invoices = {
                new Invoice(nicholas, "October", MonthPowerData.powerusage_month, MonthPowerData.powerprices_month),
                new Invoice(sara, "October", MonthPowerData.powerusage_month, MonthPowerData.powerprices_month),
                new Invoice(amir, "October", MonthPowerData.powerusage_month, MonthPowerData.powerprices_month)
        };
        Invoices.processInvoices(invoices);
    }
}
