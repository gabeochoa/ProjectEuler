import java.awt.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;
public class TEMPLATE extends Applet implements Runnable,KeyListener,MouseListener,MouseMotionListener
{
    Thread runner;
    Image Buffer;
    Graphics gBuffer;
    int width,height;
    
    
  public void init()
    {
        Buffer=createImage(size().width,size().height);
        gBuffer=Buffer.getGraphics();
       
        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
    } 
  
  public void start()
    { if (runner == null)
        {   runner = new Thread (this);
            runner.start();
        } }
   
   public void stop()
    {  if (runner != null)
        {   runner.stop();
            runner = null;
        }  
    }
   
  
   
   public void run()
    { while(true)
       {    
       try {runner.sleep(20);}
            catch (Exception e) { }

            gBuffer.setColor(Color.black);
            gBuffer.fillRect(0,0,size().width,size().height);
            
          
            
         repaint();  
         
        }
    }     
    
    public void keyPressed( KeyEvent e ) {
         //-- Process keys
        switch (e.getKeyCode()) {
            case KeyEvent.VK_SPACE : break;
        }
    }
    public void keyReleased( KeyEvent e ) 
    {
     switch (e.getKeyCode()) {
           case KeyEvent.VK_SPACE: break;
        }
    }
    public void keyTyped( KeyEvent e ) {
      char c = e.getKeyChar();
      if ( c != KeyEvent.CHAR_UNDEFINED ) {
         //repaint();
         e.consume();
      }
     
    }     
   
    public void mouseClicked(MouseEvent me){}
    public void mousePressed(MouseEvent mex)
    {
         //px = mex.getX();
         //py = mex.getY(); 
    }
    public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me){}
    public void mouseExited(MouseEvent me){}
    public void mouseMoved(MouseEvent me)
    {
         //mx = me.getX();
         //my = me.getY();
    }
    public void mouseDragged(MouseEvent me){}

    public void update(Graphics g)
    {        paint(g);    }
   
   public void paint(Graphics g)
    { g.drawImage (Buffer,0,0, this); }}