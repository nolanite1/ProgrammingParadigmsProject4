import java.awt.Graphics;
import java.io.IOException;
import java.util.ArrayList;

class Model
{
    private static int count = 0;
    private ArrayList<Sprite> spriteList;
    Model() throws IOException {
        spriteList = new ArrayList<>();
        this.addSprite(0,0);
    }

    public void addSprite(int x, int y){
        count++;
        if(count%2==1){
            spriteList.add(new CopAuto());
        }
        else{
            spriteList.add(new RobberAuto());
        }
        spriteList.get(spriteList.size()-1).setX(x);
        spriteList.get(spriteList.size()-1).setY(y);
    }

    public void update(Graphics g) {
        for(Sprite sprite: spriteList){
            sprite.update(g);
        }
    }
    public void fill(){
        for(Sprite sprite: spriteList){
            ((Auto)sprite).fillUp();
        }
    }
}
