public class A1_HowToMove extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        System.out.println("This message will be printed to the window below.");
        System.out.println("That window is called the dos window");
        plane.pausetime = 2;
        plane.startingAngle(0);
        plane.setColor(100,200,255);
        plane.isTrail = true;
        plane.move(81);
        plane.startingAngle(90);
        plane.isTrail=true;
        plane.move(81);
        plane.startingAngle(180);
        plane.isTrail = true;
        plane.move(81);
        plane.startingAngle(270);
        plane.isTrail = true;
        plane.move(81);
        plane.startingAngle(180);
        plane.isTrail=true;
        plane.move(30);
        plane.startingAngle(315);
        plane.isTrail=true;
        plane.move(100);
        plane.startingAngle(45);
        plane.isTrail=true;
        plane.move(100);
        plane.startingAngle(180);
        plane.isTrail=true;
        plane.move(30);


    }

}

/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.

*/