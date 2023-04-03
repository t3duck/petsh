public class animal {
    private  String name;
    private String race;
    private String typeofDiet;

    public animal() {
    }

    public animal(String name, String race, String typeofDiet) {
        this.name = name;
        this.race = race;
        this.typeofDiet = typeofDiet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getTypeofDiet() {
        return typeofDiet;
    }

    public void setTypeofDiet(String typeofDiet) {
        this.typeofDiet = typeofDiet;
    }
}
