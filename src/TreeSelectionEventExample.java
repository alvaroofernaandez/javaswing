import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;

public class TreeSelectionEventExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("TreeSelectionEvent Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
            DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Node 1");
            DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Node 2");
            DefaultMutableTreeNode node3 = new DefaultMutableTreeNode("Node 3");

            root.add(node1);
            root.add(node2);
            root.add(node3);

            JTree tree = new JTree(root);
            tree.addTreeSelectionListener(new TreeSelectionListener() {
                @Override
                public void valueChanged(TreeSelectionEvent e) {
                    TreePath selectedPath = e.getNewLeadSelectionPath();
                    if (selectedPath != null) {
                        Object selectedNode = selectedPath.getLastPathComponent();
                        if (selectedNode instanceof DefaultMutableTreeNode) {
                            String nodeName = ((DefaultMutableTreeNode) selectedNode).getUserObject().toString();
                            updateLabel(nodeName);
                        }
                    }
                }
            });

            frame.add(new JScrollPane(tree));
            frame.setVisible(true);
        });
    }

    private static void updateLabel(String nodeName) {
        System.out.println("Node selected: " + nodeName);
    }
}
