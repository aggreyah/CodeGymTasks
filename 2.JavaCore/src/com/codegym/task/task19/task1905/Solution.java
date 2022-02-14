package com.codegym.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* 
Reinforce the adapter

*/

public class Solution {
    public static Map<String,String> countries = new HashMap<>();

    static {
        countries.put("UA","Ukraine");
        countries.put("US","United States");
        countries.put("FR","France");
    }

    public static void main(String[] args) {
        Customer myCustomer = new Customer() {
            @Override
            public String getCompanyName() {
                return "CodeGym Ltd.";
            }

            @Override
            public String getCountryName() {
                return "United States";
            }
        };

        Contact myContact = new Contact() {
            @Override
            public String getName() {
                return "Peterson, John";
            }

            @Override
            public String getPhoneNumber() {
                return "+1(111)222-3333";
            }
        };

        DataAdapter adapter = new DataAdapter(myCustomer, myContact);
        System.out.println("country code => " + adapter.getCountryCode());
        System.out.println("company => " + adapter.getCompany());
        System.out.println("first name => " + adapter.getContactFirstName());
        System.out.println("last name => " + adapter.getContactLastName());
        System.out.println("dial string => " + adapter.getDialString());
    }

    public static class DataAdapter implements RowItem{
        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.contact = contact;
            this.customer = customer;
        }

        @Override
        public String getCountryCode() {
            String countryCode = "";
            for (Map.Entry<String, String> entry: countries.entrySet()) {
                if (entry.getValue().equals(customer.getCountryName()))
                    countryCode = entry.getKey();
            }
            return countryCode;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String[] nameStringArray = contact.getName().split(" ");
            return nameStringArray[nameStringArray.length - 1];
        }

        @Override
        public String getContactLastName() {
            String[] nameStringArray = contact.getName().split(" ");
            return nameStringArray[0].substring(0, nameStringArray[0].length() - 1);
        }

        @Override
        public String getDialString() {
            String[] numberWithRightParenRemovedArray = contact.getPhoneNumber().split(Pattern.quote(")"));
            String numberWithRightParenRemoved = numberWithRightParenRemovedArray[0] + numberWithRightParenRemovedArray[1];
            String[] numberWithLeftParenRemovedArray = numberWithRightParenRemoved.split(Pattern.quote("("));
            String numberWithBothParensRemoved = numberWithLeftParenRemovedArray[0] + numberWithLeftParenRemovedArray[1];
            String[] numberWithHyphenRemovedArray = numberWithBothParensRemoved.split("-");
            String numberReadyForDial = numberWithHyphenRemovedArray[0] + numberWithHyphenRemovedArray[1];
            return "callto://" + numberReadyForDial;
        }
    }

    public static interface RowItem {
        String getCountryCode();        // For example: US
        String getCompany();            // For example: CodeGym Ltd.
        String getContactFirstName();   // For example: John
        String getContactLastName();    // For example: Peterson
        String getDialString();         // For example: callto://+11112223333
    }

    public static interface Customer {
        String getCompanyName();        // For example: CodeGym Ltd.
        String getCountryName();        // For example: United States
    }

    public static interface Contact {
        String getName();               // For example: Peterson, John
        String getPhoneNumber();        // For example: +1(111)222-3333, +3(805)0123-4567, +380(50)123-4567, etc.
    }
}