package Saturday_Reviews.week12_review;



    public class City {
        private String name;
        private double growthRate;
        private long population;
        private String state;

        public City(String name, double growthRate, long population, String state) {
            setName(name);
            setGrowthRate(growthRate);
            setPopulation(population);
            setState(state);
        }

        public String toString() {
            return "City{" +
                    "name='" + getName() + '\'' +
                    ", growthRate=" + growthRate +
                    ", population=" + population +
                    ", state='" + state + '\'' +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getGrowthRate() {
            return growthRate;
        }

        public void setGrowthRate(double growthRate) {
            this.growthRate = growthRate;
        }

        public long getPopulation() {
            return population;
        }

        public void setPopulation(long population) {
            this.population = population;
        }

        public  String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }



/*
create a class City
    encapsulated instance variables:
        city name, growth rate, population, state
    create a constructor to initialize all the variables
    create a toString of all the information
 */