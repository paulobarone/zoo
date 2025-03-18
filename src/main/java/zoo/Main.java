package zoo;

import zoo.animals.birds.Falcon;
import zoo.animals.fishs.ElectricEel;
import zoo.animals.mammal.Bear;
import zoo.animals.reptiles.Snake;

public class Main {
  public static void main(String[] args) {
    // Mammal (Bear)
    Bear ursa = new Bear("Ursa", 4, "F");
    Bear urso = new Bear("Urso", 1, "M");

    ursa.startGestation();
    ursa.giveBirth();
    ursa.nurse(urso);

    System.out.println("=========");

    // Bird (Falcon)
    Falcon falcao = new Falcon("Falcão", 3, "F", 150);

    falcao.tame();
    falcao.fly();
    falcao.training();
    falcao.dive();
    falcao.sing();

    falcao.setHasNest(true);
    falcao.layEggs();

    System.out.println("=========");

    // Reptile (Snake)
    Snake cobra = new Snake("Kaa", 7, "F", true, true);
    Snake cobraNaoVenonosa = new Snake("Jiboia", 10, "M", false, true);

    cobra.shedSkin();
    cobra.collectPoison();
    cobraNaoVenonosa.collectPoison();

    System.out.println("=========");

    // Fish (ElectricEel)
    ElectricEel enguia = new ElectricEel("Sparky", 2, "M", "água doce", true);

    enguia.swim();
    enguia.generateElectricity();
  }
}