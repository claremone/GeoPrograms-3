public class A5_square extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {



        for(int i=30;i<120;i=i+10){
           System.out.println(i);
            plane.triangle(i);
        }

        for(int i=2;i<14;i=i+2){
           System.out.println(i);
            plane.startingAngle(0);
            plane.triangle(i);
        }

        for(int i=2; i<=12; i=i+2){
            System.out.println(i);
            plane.startingAngle(0);
            plane.triangle(i);
        }

        for(int g=10; g>0; g=g-1){
            System.out.println(g);
        }

        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.pausetime = 1;
        plane.setColor(200, 100, 100);




        plane.startingAngle(90);
        //fives();
       // countDown();
       // drawASquare();
        //square();
        bird();
        tree();
        sun();
        plane.teleport(500,100);
        smiley();

        //example of a loop:
        //(int x=starting value, x<=ending value,
        //for(int x=1;x<=10; x=x+1){
            //the code we want to repeat
           // tree();
        }




    public void bird() {
        plane.isTrail = false;
        plane.startingAngle(0);
        plane.move(300);
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 200, 100);
        plane.move(50);
        plane.turn(120);
        plane.move(50);
        plane.turn(120);
        plane.move(50);
        plane.setColor(100, 100, 100);
        plane.startingAngle(225);
        plane.move(50);
        plane.turn(45);
        plane.move(50);
        plane.turn(45);
        plane.move(50);
        plane.turn(45);
        plane.move(50);
        plane.turn(45);
        plane.move(50);
        plane.turn(45);
        plane.move(50);
        plane.turn(45);
        plane.move(50);
        plane.turn(45);
        plane.move(50);
        plane.turn(45);
        plane.move(50);
        plane.isTrail = false;
        plane.turn(45);
        plane.move(50);
        plane.turn(45);
        plane.move(50);
        plane.turn(45);
        plane.move(50);
        plane.turn(45);
        plane.move(75);
        plane.isTrail=true;
        plane.startingAngle(225);
        plane.setColor(100, 100, 100);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
    }

    public void tree() {
        plane.teleport(935,107);
        plane.isTrail = true;
        plane.setColor(0, 255, 0);
        plane.startingAngle(225);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.move(100);
        plane.turn(45);
        plane.teleport(789,280);
        plane.setColor(102,51,0);
        plane.startingAngle(90);
        plane.move(400);
        plane.turn(90);
        plane.move(50);
        plane.turn(90);
        plane.move(400);
    }

    public void sun() {
        plane.teleport(242,86);
        plane.isTrail=true;
        plane.setColor(255,255,0);
        plane.startingAngle(225);
        plane.turn(345);
        plane.move(50);
        plane.turn(120);
        plane.move(50);
        plane.turn(15);
        plane.move(50);
        plane.turn(120);
        plane.move(50);
        plane.turn(15);
        plane.move(50);
        plane.turn(120);
        plane.move(50);
        plane.turn(15);
        plane.move(50);
        plane.turn(120);
        plane.move(50);
        plane.turn(15);
        plane.move(50);
        plane.turn(120);
        plane.move(50);
        plane.turn(15);
        plane.move(50);
        plane.turn(120);
        plane.move(50);
        plane.turn(15);
        plane.move(50);
        plane.turn(120);
        plane.move(50);
        plane.turn(15);
        plane.move(50);
        plane.turn(120);
        plane.move(50);
        plane.turn(15);

    }

    public void smiley() {
        plane.startingAngle(45);
        plane.move(30);
        plane.turn(60);
        plane.move(70);
        plane.turn(60);
        plane.move(30);
        plane.teleport(566,62);
        plane.move(15);
        plane.teleport(527,68);
        plane.move(15);
    }
    public void fives (){
        for(int i=5; i<36; i=i+1){
            System.out.println(i);
        }
    }
    public void countDown(){
        for(int i=7; i>1; i=i-1){
            System.out.println(i);
        }
    }
    public void drawASquare(){
        for(int x=70; x<74; x=x+1) {
           plane.isTrail = true;
           plane.move(50);
           plane.turn(90);
       }
    }

    public void square (){
        for(int x=70; x<74; x=x+1){
            drawASquare();
            plane.move(100);
            plane.startingAngle(0);

        }
    }
}


/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- setColor(int r, int g, int b)
   setColor() sets the color of the plane's trail.
   plane.setColor(0, 0, 255); sets the color of the plane's trail to blue.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.
   
- turn(int x)
   turn() rotates the plane left by the number of degrees specified in the parameter.
   plane.turn(50); will turn the plane left 50 degrees.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.
   
- int trailWidth
   trailWidth controls the width of the trail left by the plane.
   plane.trailWidth = 10; sets the width of the trail to 10.

*/