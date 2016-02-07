package hometasks.Chapter10.task13;

/**
 * Created by Admin on 07.02.2016.
 */
public class HorrorShow {
    static void u(Monster b){b.menace();}
    static void v(DangerousMonster d){
        d.menace();
        d.destroy();
    }
    static void w(Lethal l){l.kill();}

    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla().dangerousMonster();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire().vampire();
        u(vlad);
        v(vlad);
        w(vlad);

    }
}

class DragonZilla {
   public DangerousMonster dangerousMonster(){
       return new DangerousMonster() {
           @Override
           public void destroy() {

           }

           @Override
           public void menace() {

           }
       };
   }
}

class VeryBadVampire{
    public Vampire vampire(){
        return new Vampire() {
            @Override
            public void menace() {

            }

            @Override
            public void destroy() {

            }

            @Override
            public void drinkblood() {

            }

            @Override
            public void kill() {

            }
        };
    }

    /*public DangerousMonster dangerousMonster(){
        return new DangerousMonster() {
            @Override
            public void destroy() {

            }

            @Override
            public void menace() {

            }
        };
    }*/

}

interface Vampire extends DangerousMonster,Lethal {
    void drinkblood();
}

interface DangerousMonster extends Monster{
    void destroy();
}

interface Monster{
    void menace();
}

interface Lethal{
    void kill();
}

