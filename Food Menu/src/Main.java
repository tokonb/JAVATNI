import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class Main {
    public JPanel mainPanel;
    private JPanel cardPanel;

    private JTextField txtSearchIngredients;
    private JButton btnSearch;
    private JButton btnGoAdd;

    private JList<String> recipeList;
    private JTextArea txtRecipeDetails;
    private JButton btnBackFromSearch;

    private JTextField txtAddName;
    private JTextArea txtAddIngredients;
    private JTextArea txtAddSteps;
    private JButton btnSaveRecipe;
    private JButton btnBackFromAdd;

    private DefaultListModel<String> listModel;




    public Main() {
        listModel = new DefaultListModel<>();
        if (recipeList != null) {
            recipeList.setModel(listModel);
        }

        if (btnSearch != null) {
            btnSearch.addActionListener(e -> {
                if (txtSearchIngredients != null && txtSearchIngredients.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(mainPanel, "Please enter the ingredients you have first.");
                    return;
                }
                if (listModel != null) {
                    listModel.clear();
                    listModel.addElement("Minced Pork Omelet");
                    listModel.addElement("Garlic Fried Pork");
                    listModel.addElement("Clear Soup with Tofu and Minced Pork");
                }
                if (txtRecipeDetails != null) txtRecipeDetails.setText("Click a menu on the left to view the recipe.");
                switchCard("SearchCard");
            });
        }

        if (btnGoAdd != null) {
            btnGoAdd.addActionListener(e -> switchCard("AddCard"));
        }

        if (recipeList != null) {
            recipeList.addListSelectionListener(e -> {
                if (!e.getValueIsAdjusting()) {
                    String selected = recipeList.getSelectedValue();
                    if (selected != null && txtRecipeDetails != null) {
                        if (selected.equals("Minced Pork Omelet")) {
                            txtRecipeDetails.setText("Menu: Minced Pork Omelet\n\nIngredients:\n- 2 Eggs\n- Minced pork\n- Fish sauce\n\nInstructions:\n1. Beat the eggs in a bowl.\n2. Add minced pork and fish sauce.\n3. Fry in hot oil until golden brown.");
                        } else if (selected.equals("Garlic Fried Pork")) {
                            txtRecipeDetails.setText("Menu: Garlic Fried Pork\n\nIngredients:\n- Sliced pork\n- Minced garlic\n- Oyster sauce\n\nInstructions:\n1. Marinate the pork with oyster sauce.\n2. Fry the garlic until fragrant.\n3. Add the pork and stir-fry until cooked.");
                        } else {
                            txtRecipeDetails.setText("Menu: " + selected + "\n\n(Recipe data not found)");
                        }
                    }
                }
            });
        }

        if (btnBackFromSearch != null) btnBackFromSearch.addActionListener(e -> switchCard("HomeCard"));
        if (btnBackFromAdd != null) btnBackFromAdd.addActionListener(e -> switchCard("HomeCard"));

        if (btnSaveRecipe != null) {
            btnSaveRecipe.addActionListener(e -> {
                if (txtAddName != null && txtAddName.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(mainPanel, "Please enter a recipe name before saving.");
                    return;
                }
                JOptionPane.showMessageDialog(mainPanel, "Recipe added successfully!");
                if (txtAddName != null) txtAddName.setText("");
                if (txtAddIngredients != null) txtAddIngredients.setText("");
                if (txtAddSteps != null) txtAddSteps.setText("");
                switchCard("HomeCard");
            });
        }
    }

    private void switchCard(String cardName) {
        if (cardPanel != null && cardPanel.getLayout() instanceof CardLayout) {
            CardLayout cl = (CardLayout) cardPanel.getLayout();
            cl.show(cardPanel, cardName);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Recipe Management Studio");
            Main app = new Main();


            if (app.mainPanel != null) {
                frame.setContentPane(app.mainPanel);
            }
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    private void createUIComponents() {

        mainPanel = new BackgroundPanel("/background.jpg");
        txtSearchIngredients = (JTextField) new RoundedTextField();

    }

    static class RoundedTextField extends JTextField {
        private int cornerRadius = 25;
        private Color backgroundColor = new Color(255, 255, 255, 180);

        public RoundedTextField() {
            setOpaque(false);
            setBackground(backgroundColor);
            setForeground(Color.BLACK);
            setCaretColor(Color.BLACK);
            setFont(new Font("Tahoma", Font.PLAIN, 18));
            setColumns(20);
            setBorder(new EmptyBorder(10, 20, 10, 20));
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getBackground());
            g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, cornerRadius, cornerRadius);
            g2.dispose();
            super.paintComponent(g);
        }
    }

    static class BackgroundPanel extends JPanel {
        private Image backgroundImage;

        public BackgroundPanel(String fileName) {
            try {
                URL imgUrl = getClass().getResource(fileName);
                if (imgUrl != null) {
                    backgroundImage = ImageIO.read(imgUrl);
                } else {
                    System.err.println("Could not find background image: " + fileName);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            setOpaque(false);
            setLayout(new BorderLayout());
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (backgroundImage != null) {

                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        }
    }
}
