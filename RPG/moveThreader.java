import javax.swing.JComponent;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
public class moveThreader extends Thread
{
    private int d;
    private Point p;
    private Entity e;
    private boolean cancel = false;
    public void moveThreader(Entity _e, Point _p, int _d)
    {
        e=_e;
        p=_p;
        d=_d;
        this.start();
    }

    public void run()
    {
        while (!cancel)
        {

        }
        cancel = false;
    }
    public void cancel()
    {
        cancel = true;
    }
}