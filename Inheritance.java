//single inheritance
/*class FundamentalForce {
    void Force() {
        System.out.println("There are four fundamental forces.");
    }
}

class Gravitational extends FundamentalForce {
    void Gravity() {
        System.out.println("Fruits fall to the ground due to gravitational Force.");
    }
}

class SingleInheritance {
    public static void main(String[] args) {
        Gravitational G = new Gravitational();
        G.Force();
        G.Gravity();
    }
}*/
//multi level inheritance
/*class Fundamentalforce{
    void force(){
        System.out.println("the fundamentalForce");
    }
}
class NuclearForce extends Fundamentalforce{
    void nuclear(){
        System.out.println("NuclearForce are two types");
        System.out.println("Strong Nuclear force");
        System.out.println("weak nuclear force");
    }

}
class strongNuclearForce extends NuclearForce{
    void strong(){
        System.out.println("Strong nuclear force is responsible for underlying stability of the matter");
    }
}

 class satish {

    public static void main(String[] args) {
        strongNuclearForce sn = new strongNuclearForce();
        sn.strong();
        sn.force();
        sn.nuclear();
    }
}*/
//Hierarchical inheritance
class FundamentalForce {
    void Force() {
        System.out.println("There are four fundamental forces.");
    }
}

class Gravitational extends FundamentalForce {
    void Gravity() {
        System.out.println("Fruits fall to the ground due to gravitational Force.");
    }
}

class Electromagnetic extends FundamentalForce {
    void Particles() {
        System.out.println("The electromagnetic force acts between charged particles");
    }
}

class HierarchicalInheritance {
    public static void main(String[] args) {
        System.out.println("Child 1:");
        Gravitational G = new Gravitational();
        G.Force();
        G.Gravity();
        
        System.out.println();
        System.out.println("Child 2");
        Electromagnetic em = new Electromagnetic();
        em.Force();
        em.Particles();
    }
}

