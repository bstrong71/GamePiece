public class GamePiece {
    int positionX;
    int positionY;
    boolean frozen;
    String name;
    String color;

    // empty constructor
    public GamePiece() {
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
        this.name = "pawn";
        this.color = "red";
    }

//    public GamePiece(int positionX, int positionY, boolean frozen, String name, String color) {
//        this.positionX = positionX;
//        this.positionY = positionY;
//        this.frozen = frozen;
//        this.name = name;
//        this.color = color;
//    }

    // getters and setters
    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // methods to move game piece
    public void move(int newX, int newY) {
        if(!this.isFrozen()){
            this.positionX = newX;
            this.positionY = newY;
        } else {
            System.out.println("This piece is frozen and can't be moved.");
        }
    }
    // method to freeze
    public void freeze() {
        if(!this.isFrozen()){
            this.frozen = true;
        }
    }
    // method to unfreeze
    public void unfreeze() {
        if(this.isFrozen()) {
            this.frozen = false;
        }
    }

}


