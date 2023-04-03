import static java.lang.System.out;

public class Petshop {
    public static void main(String[] args) {

        animal animal1 = new animal("lila","pitbull","carnivorous");
        bird bird1 = new bird("lola","domestic","herbivorous","fly","wood","low");
        reptil reptill1 = new reptil("lol,","varánidos","carnivorous","ward","yes",5);

        out.println("__________________________________________________________________");
        out.println(animal1.getName()+animal1.getRace()+animal1.getTypeofDiet());
        out.println("___________________________________________________________________");
        out.println(bird1.getName()+     bird1.getRace()+   bird1.getTypeofDiet() +  bird1.getTypeofDiet() + bird1.getFly_or_not_fly()   + bird1.getHabitat_type() +  bird1.getLevel_of_care());
        out.println("_____________________________________________________________________");
        out.println(reptill1.getName());
        out.println("los datos del animal son:");
        out.println("los dards de bird estan ufff");
        out.println("los datos del ave son");
    }
}

