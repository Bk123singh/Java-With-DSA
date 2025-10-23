public class interface1 {

    public static void main(String [] args){
            
        Human h =new Human();
        h.paint();
        h.moves();

    }
}


interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down,left , right, diagonal");
    }

}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down,left , right");
    }

}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down,left , right , diagonal(by 1 steps)");
    }

}

interface  harbivor {
    void moves();
     
}

interface Carnivore {
    void paint();
}

class Human implements harbivor, Carnivore {
    public void moves() {
        System.out.println("for steps");
    }

    public void paint() {
        System.out.println("he run fast");
    }
}