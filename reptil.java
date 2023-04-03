public class reptil extends animal {
    private String blood_type;
    private String It_is_poisonous;
    private int age;

    public reptil() {
    }

    public reptil(String name, String race, String typeofDiet, String blood_type, String it_is_poisonous, int age) {
        super(name, race, typeofDiet);
        this.blood_type = blood_type;
        It_is_poisonous = it_is_poisonous;
        this.age = age;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }

    public String getIt_is_poisonous() {
        return It_is_poisonous;
    }

    public void setIt_is_poisonous(String it_is_poisonous) {
        It_is_poisonous = it_is_poisonous;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
