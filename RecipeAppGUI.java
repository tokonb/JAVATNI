import javax.swing.*;
        import java.awt.*;

public class RecipeAppGUI extends JFrame {

    private CardLayout cardLayout;
    private JPanel mainCardPanel;

    private JLabel detailNameLabel;
    private JTextArea detailIngredientsArea;
    private JTextArea detailStepsArea;

    public RecipeAppGUI() {
        setTitle("Recipe Management App");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainCardPanel = new JPanel(cardLayout);

        mainCardPanel.add(createMainMenuPanel(), "MainMenu");
        mainCardPanel.add(createSearchPanel(), "SearchMenu");
        mainCardPanel.add(createRecipeDetailPanel(), "RecipeDetail");
        mainCardPanel.add(createAddRecipePanel(), "AddRecipeMenu");

        add(mainCardPanel);
    }

    private JPanel createMainMenuPanel() {
        JPanel panel = new JPanel(new GridBagLayout());

        JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 10, 20));
        JButton btnSearch = new JButton("1. Find Recipes");
        JButton btnAdd = new JButton("2. Add Recipe");

        btnSearch.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnAdd.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnSearch.setPreferredSize(new Dimension(250, 50));

        btnSearch.addActionListener(e -> cardLayout.show(mainCardPanel, "SearchMenu"));
        btnAdd.addActionListener(e -> cardLayout.show(mainCardPanel, "AddRecipeMenu"));

        buttonPanel.add(btnSearch);
        buttonPanel.add(btnAdd);
        panel.add(buttonPanel);

        return panel;
    }

    private JPanel createSearchPanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JPanel topPanel = new JPanel(new BorderLayout(5, 5));
        JTextField txtSearch = new JTextField();
        JButton btnSearch = new JButton("Search");
        topPanel.add(new JLabel("Enter ingredients (e.g., pork, egg, chicken):"), BorderLayout.NORTH);
        topPanel.add(txtSearch, BorderLayout.CENTER);
        topPanel.add(btnSearch, BorderLayout.EAST);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> resultList = new JList<>(listModel);
        resultList.setFont(new Font("Tahoma", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(resultList);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Available Recipes"));

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton btnBack = new JButton("Back");
        JButton btnView = new JButton("View Recipe");
        bottomPanel.add(btnBack);
        bottomPanel.add(btnView);

        btnBack.addActionListener(e -> cardLayout.show(mainCardPanel, "MainMenu"));

        btnSearch.addActionListener(e -> {
            listModel.clear();
            listModel.addElement("Pork Fried Rice");
            listModel.addElement("Pork Omelet");
            listModel.addElement("Tofu Soup");
            listModel.addElement("Spicy Basil Minced Pork");
            listModel.addElement("Tom Yum Goong");
            listModel.addElement("Pad Thai");
            listModel.addElement("Green Curry Chicken");
            listModel.addElement("Papaya Salad");
            listModel.addElement("Chicken Rice");
        });

        btnView.addActionListener(e -> {
            String selectedRecipe = resultList.getSelectedValue();
            if (selectedRecipe != null) {
                detailNameLabel.setText("Menu: " + selectedRecipe);

                String ingredients = "";
                String steps = "";

                switch (selectedRecipe) {
                    case "Pork Fried Rice":
                        ingredients = "- Cooked rice\n- Minced pork\n- Eggs\n- Soy sauce\n- Garlic";
                        steps = "1. Heat oil in a pan and stir-fry garlic.\n2. Add minced pork and cook until brown.\n3. Add eggs and scramble.\n4. Add rice and soy sauce, stir well.\n5. Serve hot.";
                        break;
                    case "Pork Omelet":
                        ingredients = "- 2 Eggs\n- Minced pork\n- Fish sauce\n- Cooking oil";
                        steps = "1. Beat eggs with minced pork and fish sauce.\n2. Heat a large amount of oil in a pan.\n3. Pour the egg mixture into the hot oil.\n4. Fry until golden brown on both sides.\n5. Serve with chili sauce.";
                        break;
                    case "Tofu Soup":
                        ingredients = "- Soft tofu\n- Minced pork\n- Chinese cabbage\n- Clear broth\n- Soy sauce";
                        steps = "1. Boil the clear broth in a pot.\n2. Form minced pork into small balls and add to the boiling broth.\n3. Add Chinese cabbage and season with soy sauce.\n4. Gently add soft tofu.\n5. Simmer for 3 minutes and serve.";
                        break;
                    case "Spicy Basil Minced Pork":
                        ingredients = "- Minced pork\n- Holy basil leaves\n- Fresh chili\n- Garlic\n- Oyster sauce\n- Fish sauce";
                        steps = "1. Pound garlic and chili together.\n2. Stir-fry the garlic and chili paste in hot oil.\n3. Add minced pork and stir until cooked.\n4. Season with oyster sauce and fish sauce.\n5. Add basil leaves, toss quickly, and serve.";
                        break;
                    case "Tom Yum Goong":
                        ingredients = "- Shrimp\n- Lemongrass\n- Galangal\n- Kaffir lime leaves\n- Chili paste\n- Lime juice\n- Fish sauce";
                        steps = "1. Boil water with lemongrass, galangal, and kaffir lime leaves.\n2. Add shrimp and mushrooms.\n3. Stir in chili paste and fish sauce.\n4. Turn off the heat and add lime juice.\n5. Garnish with coriander and serve.";
                        break;
                    case "Pad Thai":
                        ingredients = "- Rice noodles\n- Shrimp\n- Eggs\n- Bean sprouts\n- Roasted peanuts\n- Tamarind sauce";
                        steps = "1. Stir-fry shrimp and set aside.\n2. Scramble eggs in the pan, then add noodles.\n3. Pour in tamarind sauce and mix well.\n4. Add bean sprouts and cooked shrimp.\n5. Serve with crushed peanuts and lime.";
                        break;
                    case "Green Curry Chicken":
                        ingredients = "- Chicken breast\n- Green curry paste\n- Coconut milk\n- Bamboo shoots\n- Sweet basil leaves\n- Fish sauce";
                        steps = "1. Simmer coconut milk with green curry paste until fragrant.\n2. Add sliced chicken breast and cook.\n3. Add bamboo shoots and remaining coconut milk.\n4. Season with fish sauce and sugar.\n5. Top with sweet basil and serve.";
                        break;
                    case "Papaya Salad":
                        ingredients = "- Shredded green papaya\n- Cherry tomatoes\n- Peanuts\n- Fresh chili\n- Garlic\n- Fish sauce\n- Lime juice\n- Palm sugar";
                        steps = "1. Pound garlic and chili in a mortar.\n2. Add palm sugar, fish sauce, and lime juice, then mix.\n3. Add cherry tomatoes and pound gently.\n4. Add shredded papaya and mix everything together.\n5. Top with roasted peanuts and serve.";
                        break;
                    case "Chicken Rice":
                        ingredients = "- Whole chicken\n- Jasmine rice\n- Garlic\n- Ginger\n- Chicken broth\n- Soybean sauce";
                        steps = "1. Boil the whole chicken with ginger and garlic until cooked.\n2. Sauté rice with chicken fat and garlic.\n3. Cook the sautéed rice in the chicken broth.\n4. Slice the boiled chicken.\n5. Serve the chicken over the rice with soybean sauce.";
                        break;
                    default:
                        ingredients = "- Data not found";
                        steps = "- Data not found";
                        break;
                }

                detailIngredientsArea.setText(ingredients);
                detailStepsArea.setText(steps);

                cardLayout.show(mainCardPanel, "RecipeDetail");
            } else {
                JOptionPane.showMessageDialog(panel, "Please select a recipe first.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        });

        panel.add(topPanel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(bottomPanel, BorderLayout.SOUTH);
        return panel;
    }

    private JPanel createRecipeDetailPanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        detailNameLabel = new JLabel("Menu: -", SwingConstants.CENTER);
        detailNameLabel.setFont(new Font("Tahoma", Font.BOLD, 18));

        detailIngredientsArea = new JTextArea(5, 20);
        detailIngredientsArea.setEditable(false);
        JScrollPane ingScrollPane = new JScrollPane(detailIngredientsArea);
        ingScrollPane.setBorder(BorderFactory.createTitledBorder("Ingredients"));

        detailStepsArea = new JTextArea(8, 20);
        detailStepsArea.setEditable(false);
        JScrollPane stepsScrollPane = new JScrollPane(detailStepsArea);
        stepsScrollPane.setBorder(BorderFactory.createTitledBorder("Steps"));

        JPanel centerPanel = new JPanel(new GridLayout(2, 1, 5, 10));
        centerPanel.add(ingScrollPane);
        centerPanel.add(stepsScrollPane);

        JButton btnBack = new JButton("Back to Search");
        btnBack.addActionListener(e -> cardLayout.show(mainCardPanel, "SearchMenu"));

        panel.add(detailNameLabel, BorderLayout.NORTH);
        panel.add(centerPanel, BorderLayout.CENTER);
        panel.add(btnBack, BorderLayout.SOUTH);
        return panel;
    }

    private JPanel createAddRecipePanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel headerLabel = new JLabel("Add New Recipe", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Tahoma", Font.BOLD, 18));

        JPanel formPanel = new JPanel(new BorderLayout(5, 5));

        JPanel namePanel = new JPanel(new BorderLayout(5, 5));
        namePanel.add(new JLabel("Recipe Name:"), BorderLayout.WEST);
        JTextField txtName = new JTextField();
        namePanel.add(txtName, BorderLayout.CENTER);

        JPanel textAreasPanel = new JPanel(new GridLayout(2, 1, 5, 10));

        JTextArea txtIngredients = new JTextArea();
        JScrollPane ingScroll = new JScrollPane(txtIngredients);
        ingScroll.setBorder(BorderFactory.createTitledBorder("Ingredients (one per line)"));

        JTextArea txtSteps = new JTextArea();
        JScrollPane stepScroll = new JScrollPane(txtSteps);
        stepScroll.setBorder(BorderFactory.createTitledBorder("Steps (Step by step)"));

        textAreasPanel.add(ingScroll);
        textAreasPanel.add(stepScroll);

        formPanel.add(namePanel, BorderLayout.NORTH);
        formPanel.add(textAreasPanel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton btnBack = new JButton("Back");
        JButton btnSave = new JButton("Save Recipe");

        bottomPanel.add(btnBack);
        bottomPanel.add(btnSave);

        btnBack.addActionListener(e -> cardLayout.show(mainCardPanel, "MainMenu"));

        btnSave.addActionListener(e -> {
            if (txtName.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(panel, "Please enter a recipe name.", "Missing Information", JOptionPane.ERROR_MESSAGE);
                return;
            }

            JOptionPane.showMessageDialog(panel, "Recipe '" + txtName.getText() + "' saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

            txtName.setText("");
            txtIngredients.setText("");
            txtSteps.setText("");
            cardLayout.show(mainCardPanel, "MainMenu");
        });

        panel.add(headerLabel, BorderLayout.NORTH);
        panel.add(formPanel, BorderLayout.CENTER);
        panel.add(bottomPanel, BorderLayout.SOUTH);
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RecipeAppGUI().setVisible(true);
        });
    }
}