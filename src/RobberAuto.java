import java.awt.*;

public class RobberAuto extends Auto{
    private int xRatio;
    private int yRatio;

    public RobberAuto(){
        super("RobberAuto",20,new Engine("V8",20,200),"/Users/sai2468/IdeaProjects/Assignment4/src/red-auto.jpg");
        super.fillUp();
        this.xRatio = (int)(Math.random()*11)-5;
        this.yRatio = (int)(Math.random()*11)-5;
    }
    public void update(Graphics g){
        this.drive(40,this.xRatio,this.yRatio);
        g.drawImage(this.getImage(),this.getX(),this.getY(),60,60,null);
    }
}
