public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
       // rowOfSmallSquares();
     //   columnOfSmallSquares();
   //     gridOfSmallSquares();
        gridOfSmallSquares1();
     //   fitness();



        //   plane.isTrail=true;
        //    for(int x=0;x<50;x=x+10)
        //    {
        //      System.out.println(x);
        //      plane.teleport((x+10),300);
        //      plane.square(10);

        //   }
    }
    public void rowOfSmallSquares() {
        //in this method, create a long row of 10 pixel by 10 pixel squares
        for (int i=0; i<50; i=i+10) {
            System.out.println(i);
            plane.teleport((i+10), 300);
            plane.square(10);
        }
    }

    public void columnOfSmallSquares() {
        //in this method, create a long column of 10 pixel by 10 pixel squares
        for (int y=300; y<350; y=y+10) {
            System.out.println(y);
            plane.teleport(10, (y+10));
            plane.square(10);
        }
    }
    public void gridOfSmallSquares1() { //one loop inside of the other for this to work
        for(int x=10; x<800; x=x+10) {
            for(int y=10; y<500; y=y+10) {
               System.out.println("x: " + x + ",y" + y);
               plane.pausetime=0;
               plane.setColor(y/2,x/3,x/y);
               plane.teleport(x,y);
               plane.square(10);
            }
        }
       /* for(int y=0; y<50; y=y+10) {
            for(int x=0; x<50; x=x+10) {
                plane.teleport((x+10),10);
                plane.square(10);
            }
        }

        */
        }
    public void fitness(){
        for (int s=0; s<5; s=s+1){ //sprints
            System.out.println("sprint"+s);
            for(int p=0;p<10; p=p+1){ //pushups
                System.out.println("pushup"+p);
            }
        }
    }
    public void gridOfSmallSquares() {
        //in this method, loop one of your previous two methods
        //your goal is to create a grid of squares
        //OPTIONAL EXTRA CHALLENGE can you make the squares fade from one color to another?
        for (int i=0; i<50; i=i+10) {
            System.out.println(i);
            plane.teleport((i+10), 300);
            plane.square(10);
        }
        for (int y=300; y<350; y=y+10) {
            System.out.println(y);
            plane.teleport(10, (y+10));
            plane.square(10);
        }
        for (int i=0; i<50; i=i+10) {
            System.out.println(i);
            plane.teleport((i+10), 310);
            plane.square(10);
        }
        for (int y=300; y<350; y=y+10) {
            System.out.println(y);
            plane.teleport(20, (y+10));
            plane.square(10);
        }
        for (int i=0; i<50; i=i+10) {
            System.out.println(i);
            plane.teleport((i+10), 320);
            plane.square(10);
        }
        for (int y=300; y<350; y=y+10) {
            System.out.println(y);
            plane.teleport(30, (y+10));
            plane.square(10);
        }
        for (int i=0; i<50; i=i+10) {
            System.out.println(i);
            plane.teleport((i+10), 330);
            plane.square(10);
        }
        for (int y=300; y<350; y=y+10) {
            System.out.println(y);
            plane.teleport(40, (y+10));
            plane.square(10);
        }
        for (int i=0; i<50; i=i+10) {
            System.out.println(i);
            plane.teleport((i+10), 340);
            plane.square(10);
        }
        for (int y=300; y<350; y=y+10) {
            System.out.println(y);
            plane.teleport(50, (y+10));
            plane.square(10);
        }
    }
}
