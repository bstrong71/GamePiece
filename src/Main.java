public class Main {
    public static void main (String[] args) {
        GamePiece newGamePiece= new GamePiece();

        // test if freeze method works
        System.out.println("Frozen status: " + newGamePiece.isFrozen());
        newGamePiece.freeze();
        if (newGamePiece.isFrozen()) {
            System.out.println("SUCCESS: Game piece is now frozen");
        } else {
            System.out.println("FAILURE: Game piece is not frozen");
        }

        // test if unfreeze method works
        System.out.println("Current Frozen status: " + newGamePiece.isFrozen());
        newGamePiece.unfreeze();
        if (!newGamePiece.isFrozen()) {
            System.out.println("SUCCESS: Game piece is now unfrozen");
        } else {
            System.out.println("FAILURE: Game piece is still frozen");
        }

        // test if unfrozen piece can be moved
        System.out.println("Position x: " + newGamePiece.positionX + "\nPosition y: " + newGamePiece.positionY + "\nFrozen Status: " + newGamePiece.isFrozen());
        int newX = 2,
            newY = 3;
        newGamePiece.move(newX,newY);
        if ((newGamePiece.getPositionX() == newX) && (newGamePiece.getPositionY() == newY)) {
            System.out.println("SUCCESS: The unfrozen game piece moved");
        } else {
            System.out.println("FAILURE: The unfrozen game piece did not move");
        }

        // freeze piece for next test
        newGamePiece.freeze();
        // test if frozen piece is able to be moved
        newX = 4;
        newY = 6;
        newGamePiece.move(newX, newY);
        if ((newGamePiece.getPositionX() != newX) && (newGamePiece.getPositionY() != newY)) {
            System.out.println("SUCCESS: The frozen game piece did not move");
        } else {
            System.out.println("FAILURE: The frozen game piece moved and shouldn't have");
        }
    }
}
