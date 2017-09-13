public class Main {
    public static void main (String[] args) {
        GamePiece newGamePiece= new GamePiece();

        System.out.println("Frozen status: " + newGamePiece.isFrozen());
        newGamePiece.freeze();
        if (newGamePiece.isFrozen()) {
            System.out.println("SUCCESS: Game piece is now frozen");
        } else {
            System.out.println("FAILURE: Game piece is not frozen");
        }

        System.out.println("Current Frozen status: " + newGamePiece.isFrozen());
        newGamePiece.unfreeze();
        if (!newGamePiece.isFrozen()) {
            System.out.println("SUCCESS: Game piece is now unfrozen");
        } else {
            System.out.println("FAILURE: Game piece is still frozen");
        }

        System.out.println("Position x: " + newGamePiece.positionX + "\nPosition y: " + newGamePiece.positionY + "\nFrozen Status: " + newGamePiece.isFrozen());
        newGamePiece.move(2,3);
        System.out.println("New Position x: " + newGamePiece.positionX + "\nNew Position y: " + newGamePiece.positionY + "\nFrozen Status: " + newGamePiece.isFrozen());

        newGamePiece.freeze();
        System.out.println("Current Frozen status: " + newGamePiece.isFrozen());
        newGamePiece.move(3,4);
        System.out.println("Position x: " + newGamePiece.positionX + "\nPosition y: " + newGamePiece.positionY + "\nFrozen Status: " + newGamePiece.isFrozen());
    }
}
