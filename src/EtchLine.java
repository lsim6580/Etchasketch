import java.util.ArrayList;
import java.util.List;
/**
 * Created by luke on 10/2/2016.
 */

public class EtchLine {
    private int lineStartX;
    private int lineStartY;
    private List<Integer> middleX = new ArrayList<Integer>();
    private List<Integer> middleY = new ArrayList<Integer>();
    private int lineEndX;
    private int lineEndY;


    public int getMiddleXSize(){
        return middleX.size();
    }

    public int getMiddleYSize(){
        return middleY.size();
    }

    public int getLineEndY() {
        return lineEndY;
    }

    public void setLineEndY(int lineEndY) {
        this.lineEndY = lineEndY;
    }

    public int getLineEndX() {
        return lineEndX;
    }

    public void setLineEndX(int lineEndX) {
        this.lineEndX = lineEndX;
    }

    public int getLineStartY() {
        return lineStartY;
    }

    public void setLineStartY(int lineStartY) {
        this.lineStartY = lineStartY;
    }

    public int getLineStartX() {
        return lineStartX;
    }

    public void setLineStartX(int lineStartX) {
        this.lineStartX = lineStartX;
    }

    public void addMiddleX(int x){
        middleX.add(x);
    }

    public void addMiddleY(int x){
        middleY.add(x);
    }

    public int getMiddleY(int x){
        return middleY.get(x);
    }

    public int getMiddleX(int x){
        return middleX.get(x);
    }
}
