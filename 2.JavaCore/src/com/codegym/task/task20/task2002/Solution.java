package com.codegym.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Reading and writing to a file: CodeGym

*/

public class Solution {
    public static void main(String[] args) {
        // You can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        try {
            File yourFile = File.createTempFile("task2002OutPut", ".txt");
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            CodeGym codeGym = new CodeGym();
            // Initialize users field for the codeGym object here
            User user1 = new User();
            user1.setCountry(User.Country.UNITED_STATES);
            user1.setMale(true);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");
            Date date1 = sdf.parse("1982 12 20");
            user1.setBirthDate(date1);
            user1.setFirstName("Aggrey");
            user1.setLastName("Ochieng");

            User user2 = new User();
            user2.setCountry(User.Country.OTHER);
            user2.setMale(false);
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy MM dd");
            Date date2 = sdf2.parse("1992 9 15");
            user2.setBirthDate(date2);
            user2.setFirstName("Bingu");
            user2.setLastName("Mutharika");

            User user3 = new User();
            user3.setCountry(User.Country.UNITED_KINGDOM);
            user3.setMale(false);
            SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy MM dd");
            Date date3 = sdf3.parse("1978 1 31");
            user3.setBirthDate(date3);
            user3.setFirstName("Mwalimu");
            user3.setLastName("Nyerere");

            codeGym.users.add(user1);
            codeGym.users.add(user2);
            codeGym.users.add(user3);


            codeGym.save(outputStream);
            outputStream.flush();

            CodeGym loadedObject = new CodeGym();
            loadedObject.load(inputStream);
            // Here check that the codeGym object is equal to the loadedObject object
            System.out.println("loaded equals written => " + loadedObject.equals(codeGym));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class CodeGym {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            // Implement this method
            PrintWriter writer = new PrintWriter(outputStream);
            String hasUsers = users.isEmpty() ? "no":"yes";
            writer.println("does this codegym have users?=>" + hasUsers);

            if (hasUsers.equals("yes")){
                for (User user: this.users ) {
                    writer.println(user.getFirstName());
                    writer.println(user.getLastName());

                    Calendar calendar = Calendar.getInstance();
                    calendar.clear();
                    calendar.setTime(user.getBirthDate());
                    writer.println(user.getBirthDate().getTime());

                    writer.println(user.isMale());
                    writer.println(user.getCountry());
                }
            }
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            // Implement this method
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String hasUsers = reader.readLine().split("=>")[1];

            if (hasUsers.equals("yes")){
                while (reader.ready()) {
                    String firstName = reader.readLine();
                    String lastName = reader.readLine();

                    Date date = new Date(Long.parseLong(reader.readLine()));

                    boolean male = Boolean.parseBoolean(reader.readLine());
                    String country = reader.readLine();

                    User user = new User();
                    user.setFirstName(firstName);
                    user.setLastName(lastName);
                    user.setBirthDate(date);
                    user.setMale(male);
                    user.setCountry(User.Country.valueOf(country));
                    this.users.add(user);
                }
            }
            reader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodeGym codeGym = (CodeGym) o;

            return users != null ? users.equals(codeGym.users) : codeGym.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
