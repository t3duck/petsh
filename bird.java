public class bird extends animal{

private String fly_or_not_fly;

private String habitat_type;
private String level_of_care;

    public bird() {
    }

    public bird(String name, String race, String typeofDiet, String fly_or_not_fly, String habitat_type, String level_of_care) {
        super(name, race, typeofDiet);
        this.fly_or_not_fly = fly_or_not_fly;
        this.habitat_type = habitat_type;
        this.level_of_care = level_of_care;
    }

    public String getFly_or_not_fly() {
        return fly_or_not_fly;
    }

    public void setFly_or_not_fly(String fly_or_not_fly) {
        this.fly_or_not_fly = fly_or_not_fly;
    }

    public String getHabitat_type() {
        return habitat_type;
    }

    public void setHabitat_type(String habitat_type) {
        this.habitat_type = habitat_type;
    }

    public String getLevel_of_care() {
        return level_of_care;
    }

    public void setLevel_of_care(String level_of_care) {
        this.level_of_care = level_of_care;
    }
}
