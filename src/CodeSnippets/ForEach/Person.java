package CodeSnippets.ForEach;

    public class Person implements Comparable<Person> {
        private String passportID;
        private String firstname, lastname;

        public Person(String firstname, String lastname, String passportID) {
            super();
            this.passportID = passportID;
            this.firstname = firstname;
            this.lastname = lastname;
        }

        public Person(Person p) {
            this.passportID = new String(p.passportID);
            this.firstname = new String(p.firstname);
            this.lastname = new String(p.lastname);
        }

        @Override
        public int compareTo(Person o) {
            return passportID.compareTo(o.passportID);
        }

    }

