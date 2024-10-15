import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class CustomJTree {
    JFrame frame;

    CustomJTree() {
        frame = new JFrame();
        DefaultMutableTreeNode style = new DefaultMutableTreeNode("style");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("color");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("font");
        style.add(color);
        style.add(font);
        DefaultMutableTreeNode red = new DefaultMutableTreeNode("red");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("blue");
        DefaultMutableTreeNode black = new DefaultMutableTreeNode("black");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("green");
        color.add(red);
        color.add(blue);
        color.add(black);
        color.add(green);
        javax.swing.JTree jt = new JTree(style);
        frame.add(jt);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CustomJTree();
    }
}
