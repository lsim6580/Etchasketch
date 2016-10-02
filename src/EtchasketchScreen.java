import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

class EtchasketchScreen extends JPanel implements MouseListener, MouseMotionListener {
    private int oldX;
    private int oldY;
    List<EtchLine> etchLines;
    EtchasketchScreen(){
        etchLines = new ArrayList<EtchLine>();
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void clear(){
        etchLines = new ArrayList<EtchLine>();
    }

    public void mouseEntered(MouseEvent e){

    }
    public void mouseClicked(MouseEvent e){

    }
    public void mouseReleased(MouseEvent e){
        etchLines.get(etchLines.size()-1).setLineEndX(e.getX());
        etchLines.get(etchLines.size()-1).setLineEndY(e.getY());
    }
    public void mouseExited(MouseEvent e){

    }
    public void mousePressed(MouseEvent e){
        etchLines.add(new EtchLine());
        etchLines.get(etchLines.size()-1).setLineStartX(e.getX());
        etchLines.get(etchLines.size()-1).setLineStartY(e.getY());
        oldY = e.getY();
        oldX = e.getX();

    }
    public void mouseDragged(MouseEvent e){
        etchLines.get(etchLines.size()-1).addMiddleX(e.getX());
        etchLines.get(etchLines.size()-1).addMiddleY(e.getY());


        int newX = e.getX();
        int newY = e.getY();

        Graphics g = getGraphics();
        g.drawLine( oldX,oldY, newX, newY );
        oldX = newX;
        oldY = newY;



    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(int x = 0; x <etchLines.size(); x++){
            for(int y = 0; y < etchLines.get(x).getMiddleXSize()-1; y++){
                if(y == 0){
                    g.drawLine(etchLines.get(x).getLineStartX(),etchLines.get(x).getLineStartY(), etchLines.get(x)
                            .getMiddleX(y), etchLines.get(x).getMiddleY(y));
                }
                else{
                    g.drawLine(etchLines.get(x).getMiddleX(y),etchLines.get(x).getMiddleY(y),etchLines.get(x)
                            .getMiddleX(y+1),etchLines.get(x).getMiddleY(y+1));

                }
            }
            g.drawLine(etchLines.get(x).getMiddleX(etchLines.get(x).getMiddleXSize()-1),etchLines.get(x).
                    getMiddleY(etchLines.get(x).getMiddleYSize()-1), etchLines.get(x).getLineEndX(), etchLines.get(x)
                    .getLineEndY());

        }



    }
    public void mouseMoved(MouseEvent e){

    }

}