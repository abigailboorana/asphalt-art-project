import org.code.neighborhood.*;

public class JellyfishPainter extends MuralPainter {


public JellyfishPainter() {
  
 }

public void paintJellyfish (String mainColor, String secondColor, String thirdColor) {
    startPosition();
    paintHead(mainColor, secondColor, thirdColor);

    turnAround();
    resetPosition();

    paintLegs(mainColor);
  
    moveToCorner();
    turnLeft();
}


public void startPosition() {
  move();
  move();
  move();
  move();
  move();
}
  
public void paintHead(String mainColor, String secondColor, String thirdColor) {
  paintLine(mainColor, 5);
  turnRight(); 
  move(); 
  
  turnRight();
  paintLine(mainColor, 7);
  move();
  
  turnToEast();
  move();

  paintLine(mainColor, 2);
  paintLine(secondColor, 1);
  paintLine(mainColor, 3);
  paintLine(secondColor, 1);
  paintLine(mainColor,2);

  turnToWest();
  move();

  paintLine(mainColor, 1);
  paintLine(thirdColor,2);
  paintLine(mainColor,3);
  paintLine(thirdColor, 2);
  paintLine(mainColor,1);

  turnToEast();
  move();
  paintLine(mainColor, 9);

  turnToWest();
  move();
  move();
  paintLine(mainColor, 7);

  turnToEast();
  move();
  move();

} // end of painting class

  public void paintLegs(String mainColor) {
  turnToWest();
  move();
  turnLeft();
  turnLeft();
  paintLine(mainColor, 1);
  move();
  paintLine(mainColor, 1);
  move();
  paintLine(mainColor, 1);
  move();
  paintLine(mainColor, 1);

  turnToEast();
  move();
  turnRight();
  move();
  turnRight();
  move();
  move();
  paintLine(mainColor, 1);
  move();
  paintLine(mainColor, 1);
  move();
  paintLine(mainColor, 1);
  move();
  paintLine(mainColor, 2);

  turnLeft();
  move();
  turnLeft();
  
  move();
  paintLine(mainColor, 1);
  move();
  paintLine(mainColor, 1);
  move();
  paintLine(mainColor, 1);
  move();
  paintLine(mainColor, 1);
  move();
  paintLine(mainColor,1);

  turnToEast();
  move();
  turnRight();
  move();
  turnRight();
  move();
  move();
  paintLine(mainColor, 1);
  move();
  paintLine(mainColor, 1);
  move();
  paintLine(mainColor,1);
  move();
  paintLine(mainColor, 1);
  move();
  paintLine(mainColor, 1);

  turnLeft();
  move();
  turnLeft();

  move();
  move();
  paintLine(mainColor, 1);
  move();
  paintLine(mainColor, 3);
  move();
  paintLine(mainColor, 1);
  move();

  turnToEast();
  move();
  turnRight();
  move();
  turnRight();

  move();
  move();
  move();
  paintLine(mainColor, 1);
  move();
  paintLine(mainColor, 1);
  move();
  paintLine(mainColor, 1);
  move();
  paintLine(mainColor, 1);
} // end of 2nd painting class

  

}