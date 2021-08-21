package com.udu3324.ui;

import com.udu3324.main.Data;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.util.Locale;
import java.util.Objects;

public class MWBotUI {
    private JPanel rootPanel;
    private JButton exitButton;
    private JButton githubButton;
    private JButton discordButton;

    {
        try {
            $$$setupUI$$$();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public MWBotUI() {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                JFrame mwBotUI = new JFrame("MW Bot");
                mwBotUI.setIconImage(ImageIO.read(Objects.requireNonNull(getClass().getResource(Data.icon))));
                mwBotUI.setContentPane(rootPanel);
                mwBotUI.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                mwBotUI.pack();
                mwBotUI.setLocationRelativeTo(null);
                mwBotUI.setResizable(false);
                mwBotUI.setVisible(true);
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException | IOException e) {
                e.printStackTrace();
            }
        });
        exitButton.addActionListener(e -> System.exit(0));
        githubButton.addActionListener(e -> {
            try {
                Desktop.getDesktop().browse(new URI("https://github.com/udu3324"));
            } catch (Exception a) {
                a.printStackTrace();
            }
        });
        discordButton.addActionListener(e -> {
            try {
                Desktop.getDesktop().browse(new URI("https://discord.gg/WWEvMGUKhY"));
            } catch (Exception a) {
                a.printStackTrace();
            }
        });
    }

    private void $$$setupUI$$$() throws IOException {
        rootPanel = new JPanel();
        rootPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(6, 2, new Insets(25, 25, 25, 25), -1, -1));
        rootPanel.setBackground(new Color(-12566464));
        rootPanel.setForeground(new Color(-15198184));
        JLabel titleLabel = new JLabel();
        titleLabel.setBackground(new Color(-1));
        Font titleLabelFont = this.$$$getFont$$$("JetBrains Mono NL", Font.BOLD, 36, titleLabel.getFont());
        if (titleLabelFont != null) titleLabel.setFont(titleLabelFont);
        titleLabel.setForeground(new Color(-1));
        titleLabel.setText("MW Bot");
        rootPanel.add(titleLabel, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        JLabel logoLabel = new JLabel();
        logoLabel.setBackground(new Color(-1));
        Font logoLabelFont = this.$$$getFont$$$("JetBrains Mono NL", Font.BOLD, 48, logoLabel.getFont());
        if (logoLabelFont != null) logoLabel.setFont(logoLabelFont);
        logoLabel.setForeground(new Color(-5000269));
        logoLabel.setIcon(new ImageIcon(ImageIO.read(Objects.requireNonNull(getClass().getResource(Data.icon2)))));
        logoLabel.setText("");
        rootPanel.add(logoLabel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 2, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        JLabel creditLabel = new JLabel();
        creditLabel.setBackground(new Color(-1));
        Font creditLabelFont = this.$$$getFont$$$("JetBrains Mono NL", -1, 18, creditLabel.getFont());
        if (creditLabelFont != null) creditLabel.setFont(creditLabelFont);
        creditLabel.setForeground(new Color(-1));
        creditLabel.setText("By udu3324");
        rootPanel.add(creditLabel, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        JLabel actionLabel = new JLabel();
        actionLabel.setBackground(new Color(-1));
        Font actionLabelFont = this.$$$getFont$$$("JetBrains Mono NL", Font.BOLD, 18, actionLabel.getFont());
        if (actionLabelFont != null) actionLabel.setFont(actionLabelFont);
        actionLabel.setForeground(new Color(-1));
        actionLabel.setHorizontalAlignment(SwingConstants.LEFT);
        actionLabel.setText("Actions");
        rootPanel.add(actionLabel, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        discordButton = new JButton();
        discordButton.setBackground(new Color(-10197916));
        discordButton.setBorderPainted(true);
        discordButton.setFocusable(false);
        Font discordButtonFont = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 16, discordButton.getFont());
        if (discordButtonFont != null) discordButton.setFont(discordButtonFont);
        discordButton.setForeground(new Color(-10983950));
        discordButton.setHorizontalAlignment(SwingConstants.LEFT);
        discordButton.setOpaque(true);
        discordButton.setText("Discord");
        discordButton.setVisible(true);
        rootPanel.add(discordButton, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        githubButton = new JButton();
        githubButton.setBackground(new Color(-10197916));
        githubButton.setBorderPainted(true);
        githubButton.setFocusable(false);
        Font githubButtonFont = this.$$$getFont$$$("JetBrains Mono NL", Font.PLAIN, 16, githubButton.getFont());
        if (githubButtonFont != null) githubButton.setFont(githubButtonFont);
        githubButton.setForeground(new Color(-9443697));
        githubButton.setHorizontalAlignment(SwingConstants.LEFT);
        githubButton.setText("Github");
        rootPanel.add(githubButton, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        exitButton = new JButton();
        exitButton.setBackground(new Color(-10197916));
        exitButton.setBorderPainted(true);
        exitButton.setFocusable(false);
        Font exitButtonFont = this.$$$getFont$$$("JetBrains Mono NL", Font.BOLD, 16, exitButton.getFont());
        if (exitButtonFont != null) exitButton.setFont(exitButtonFont);
        exitButton.setForeground(new Color(-61681));
        exitButton.setHorizontalAlignment(SwingConstants.LEFT);
        exitButton.setText("Exit");
        rootPanel.add(exitButton, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }
}
