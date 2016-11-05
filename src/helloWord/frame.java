
package helloWord;
import java.awt.*;
import javax.swing.*;

public class frame extends JFrame {

    private static final long serialVersionUID = 1L;

    public frame() {
        Box box = new Box(BoxLayout.Y_AXIS);
        box.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        box.add(Box.createVerticalGlue());
        box.add(new mainFrame());
        box.add(Box.createVerticalGlue());
        add(box);
        pack();
        setTitle("Hello Word");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMaximumSize(getMinimumSize());
        setMinimumSize(getMinimumSize());
        setPreferredSize(getPreferredSize());
        setLocation(150, 150);
        setVisible(true);
       
    }

    public static void main(String[] args) {
        Runnable r = new Runnable() {

            @Override
            public void run() {
            	frame main = new frame();
            }
        };
        javax.swing.SwingUtilities.invokeLater(r);
    }
}

class mainFrame extends JPanel {

    private static final long serialVersionUID = 1L;

    @Override
    public Dimension getMinimumSize() {
        return new Dimension(400, 400);
    }

    @Override
    public Dimension getMaximumSize() {
        return new Dimension(400, 400);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 400);
    }

   /* @Override
    public void paintComponent(Graphics g) {
        int margin = 10;
        Dimension dim = getSize();
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(margin, margin, dim.width - margin * 2, dim.height - margin * 2);
    }*/
    
    public mainFrame(){
    	super();
    	int margin = 0;
    	this.setBackground(Color.ORANGE);
    	Dimension dim = getSize();
    	
    	this.setBounds(margin, margin, dim.width - margin * 2, dim.height - margin * 2);
	
    	
}
}