package Muhtar_SDET.Day30_OOP_Inheritance_Continue.state;

public class State {

    private String name, abbreviation, politicalParty, governor, senator ;
    private int population;

    public State(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);

    }

    public String getName(){
        if (name.isEmpty() || name.isBlank() || name == null){
            return "Unknown";
        }
        return name;
    }
    public void setName(String name){
    if (name.isEmpty() || name.isBlank() || name == null){
            System.err.println("Name can not be empty, blank or null");
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation(){
        return abbreviation;
    }
    public void setAbbreviation(String abbreviation){
        if (abbreviation.isEmpty() || abbreviation.isBlank() || abbreviation == null ){
            System.err.println("Abbreviation can not be empty, blank or null");
            System.exit(1);
        }else {
            this.abbreviation = abbreviation;
        }

    }

    public String getPoliticalParty() {
        return politicalParty;
    }
    public void setPoliticalParty(String politicalParty){
        if (politicalParty.isEmpty() || politicalParty.isBlank() || politicalParty == null ) {
            System.err.println("PoliticalParty can not be empty, blank or null");
            System.exit(1);
        }else {
            this.politicalParty = politicalParty;
        }
    }

    public String getGovernor() {
        return governor;
    }
    public void setGovernor(String governor) {
        if (governor.isEmpty() || governor.isBlank() || governor == null) {
            System.err.println("Abbreviation can not be empty, blank or null");
            System.exit(1);
        } else {
            this.governor = governor;
        }
    }

    public String getSenator() {
        return senator;
    }
    public void setSenator(String senator) {
        if (senator.isEmpty() || senator.isBlank() || senator == null) {
            System.err.println("Abbreviation can not be empty, blank or null");
            System.exit(1);
        } else {
            this.senator = senator;
        }
    }

    public int getPopulation() {

        return population;
    }
    public void setPopulation(int population) {
        if (population < 0) {
            System.err.println("Population must be greater than zero");
            System.exit(1);
        } else {
            this.population = population;
        }
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", abbreviation='" + getAbbreviation() + '\'' +
                ", politicalParty='" + getPoliticalParty() + '\'' +
                ", governor='" + getGovernor() + '\'' +
                ", senator='" + getSenator() + '\'' +
                ", population=" + getPopulation() +
                '}';
    }
}
