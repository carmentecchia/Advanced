package HashMap2;

    public class Phones {
        String name;
        int year;

        public Phones(String name, int year){
            this.name = name;
            this.year = year;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getYear() {
            return year;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Phones{" +
                    "name=" + name + '\'' +
                    "year=" + year +
                    '}';
        }
    }


