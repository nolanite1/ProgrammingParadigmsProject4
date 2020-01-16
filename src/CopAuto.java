import java.awt.*;

public class CopAuto extends Auto{
    private static int xRatio;
    private static int yRatio;
    public CopAuto(){
        super("CopAuto",30,new Engine("V8",30,100),"/Users/sai2468/IdeaProjects/Assignment4/src/cop-auto.jpg");
        super.fillUp();
        xRatio = (int)(Math.random()*11) - 5;
        yRatio = (int)(Math.random()*11) - 5;
    }
    public void update(Graphics g){
          this.drive(20,xRatio,yRatio);
//        this.setX(this.getX()+this.xRatio);
//        this.setY(this.getY()+this.yRatio);
        g.drawImage(this.getImage(),this.getX(),this.getY(),60,60,null);
    }
}
