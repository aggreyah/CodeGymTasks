package com.codegym.task.task19.task1903;

/* 
Adapting multiple interfaces

*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<>();

    static {
        countries.put("US", "United States");
        countries.put("UA", "Ukraine");
        countries.put("FR", "France");
    }

    public static void main(String[] args) {
//        IncomeData incomeData = new IncomeData() {
//            @Override
//            public String getCountryCode() {
//                return "US";
//            }
//
//            @Override
//            public String getCompany() {
//                return "CodeGym Ltd.";
//            }
//
//            @Override
//            public String getContactFirstName() {
//                return "John";
//            }
//
//            @Override
//            public String getContactLastName() {
//                return "Smith";
//            }
//
//            @Override
//            public int getCountryPhoneCode() {
//                return 1;
//            }
//
//            @Override
//            public int getPhoneNumber() {
//                return 991234567;
//            }
//        };
//
//        Customer customer = new Customer() {
//            @Override
//            public String getCompanyName() {
//                return null;
//            }
//
//            @Override
//            public String getCountryName() {
//                return null;
//            }
//        };
//
//        Contact contact = new Contact() {
//            @Override
//            public String getName() {
//                return null;
//            }
//
//            @Override
//            public String getPhoneNumber() {
//                return null;
//            }
//        };
//
//        IncomeDataAdapter adapter = new IncomeDataAdapter(incomeData);
//        System.out.println("company => " + adapter.getCompanyName());
//        System.out.println("country => " + adapter.getCountryName());
//        System.out.println("name => " + adapter.getName());
//        System.out.println("phone number => " + adapter.getPhoneNumber());
    }

    // Left pad a string with the specified character
    public static String padLeft(String s, int size,char pad) {
        StringBuilder builder = new StringBuilder(s);
        builder = builder.reverse(); // reverse initial string
        while(builder.length()<size) {
            builder.append(pad); // append at end
        }
        return builder.reverse().toString(); // reverse again!
    }

    public static class IncomeDataAdapter implements Customer, Contact{
        private IncomeData data;

        IncomeDataAdapter(IncomeData data){
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return String.format("%s, %s", data.getContactLastName(), data.getContactFirstName());
        }

        @Override
        public String getPhoneNumber() {
            String tenDigitPhoneNumber = Integer.toString(data.getPhoneNumber());
            tenDigitPhoneNumber = tenDigitPhoneNumber.length() < 10?
                    padLeft(tenDigitPhoneNumber, 10, '0'): tenDigitPhoneNumber;
            String formattedPhoneNumber = String.format("+%d(%s)%s-%s-%s", data.getCountryPhoneCode()
                    , tenDigitPhoneNumber.substring(0,3), tenDigitPhoneNumber.substring(3, 6),
                    tenDigitPhoneNumber.substring(6, 8), tenDigitPhoneNumber.substring(8));
            return formattedPhoneNumber;
        }
    }


    public static interface IncomeData {
        String getCountryCode();        // For example: US

        String getCompany();            // For example: CodeGym Ltd.

        String getContactFirstName();   // For example: John

        String getContactLastName();    // For example: Smith

        int getCountryPhoneCode();      // For example: 1

        int getPhoneNumber();           // For example: 991234567
    }

    public static interface Customer {
        String getCompanyName();        // For example: CodeGym Ltd.

        String getCountryName();        // For example: United States
    }

    public static interface Contact {
        String getName();               // For example: Smith, John

        String getPhoneNumber();        // For example: +1(099)123-45-67
    }
}