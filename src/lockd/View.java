package lockd;

import javax.swing.*;
import static lockd.FileIO.*;
import java.awt.datatransfer.*;
import java.awt.Toolkit;

/**
 * @author johnandrewoss
 * @date 01/11/2017
 * @title View.java
 * @purpose Handles all of the UX.
 * 
 */

public class View extends javax.swing.JFrame {

    /*
     * Creates new form View and initializes components.
     */
    private Locker locker;
    private String data;
    private DefaultListModel model1 = new DefaultListModel();
    private Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        
    public View(String title){
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Error during View instantiation: " + e.toString());
        }
        initComponents();
        mainPane.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        settingsFrame = new javax.swing.JFrame();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        settingsOldPassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        settingsNewPassword = new javax.swing.JPasswordField();
        settingsChangeMasterPassword = new javax.swing.JButton();
        modifyEntryLabel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        settingsChangeEntry = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        settingsUsernameField = new javax.swing.JTextField();
        settingsPasswordField = new javax.swing.JTextField();
        changeMasterPwgen = new javax.swing.JButton();
        modifyEntryPWGen = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        addItemFrame = new javax.swing.JFrame();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        addEntryButton = new javax.swing.JButton();
        addUsernameField = new javax.swing.JTextField();
        addPasswordField = new javax.swing.JTextField();
        addServiceField = new javax.swing.JTextField();
        addItemPwgen = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        loginPane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loginGoButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        masterPasswordField = new javax.swing.JPasswordField();
        mainPane = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dService = new javax.swing.JLabel();
        mainUsernameField = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mainPasswordField = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        settingsFrame.setAlwaysOnTop(true);
        settingsFrame.setResizable(false);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(50, 50, 50));
        jLabel5.setText("Settings");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setText("Change Master Password");

        settingsOldPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200), 2));

        jLabel8.setText("Old Password:");

        jLabel10.setText("New Password:");

        settingsNewPassword.setToolTipText("");
        settingsNewPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200), 2));

        settingsChangeMasterPassword.setText("Change");
        settingsChangeMasterPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsChangeMasterPasswordActionPerformed(evt);
            }
        });

        modifyEntryLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        modifyEntryLabel.setText("Modify Entry:");

        jLabel14.setText("Username");

        jLabel15.setText("Password");

        settingsChangeEntry.setText("Change");
        settingsChangeEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsChangeEntryActionPerformed(evt);
            }
        });

        settingsUsernameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200), 2));

        settingsPasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200), 2));

        changeMasterPwgen.setText("G");
        changeMasterPwgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeMasterPwgenActionPerformed(evt);
            }
        });

        modifyEntryPWGen.setText("G");
        modifyEntryPWGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyEntryPWGenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout settingsFrameLayout = new javax.swing.GroupLayout(settingsFrame.getContentPane());
        settingsFrame.getContentPane().setLayout(settingsFrameLayout);
        settingsFrameLayout.setHorizontalGroup(
            settingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsFrameLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(settingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingsFrameLayout.createSequentialGroup()
                        .addComponent(settingsPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modifyEntryPWGen, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(settingsChangeEntry)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(modifyEntryLabel)
                    .addComponent(settingsChangeMasterPassword)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(settingsOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(settingsFrameLayout.createSequentialGroup()
                        .addGroup(settingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(settingsUsernameField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(settingsNewPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeMasterPwgen, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        settingsFrameLayout.setVerticalGroup(
            settingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsFrameLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingsOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(settingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(settingsNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeMasterPwgen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingsChangeMasterPassword)
                .addGap(30, 30, 30)
                .addComponent(modifyEntryLabel)
                .addGap(12, 12, 12)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingsUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(settingsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(settingsPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifyEntryPWGen))
                .addGap(17, 17, 17)
                .addComponent(settingsChangeEntry)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jRadioButton1.setText("jRadioButton1");

        addItemFrame.setAlwaysOnTop(true);
        addItemFrame.setResizable(false);

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(50, 50, 50));
        jLabel13.setText("Add Item");

        jLabel17.setText("Service:");

        jLabel18.setText("Username:");

        jLabel19.setText("Password:");

        addEntryButton.setText("Add Entry");
        addEntryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEntryButtonActionPerformed(evt);
            }
        });

        addUsernameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 195, 199), 2));

        addPasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 195, 199), 2));

        addServiceField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 195, 199), 2));

        addItemPwgen.setText("G");

        javax.swing.GroupLayout addItemFrameLayout = new javax.swing.GroupLayout(addItemFrame.getContentPane());
        addItemFrame.getContentPane().setLayout(addItemFrameLayout);
        addItemFrameLayout.setHorizontalGroup(
            addItemFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addItemFrameLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(addItemFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addEntryButton)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18)
                    .addComponent(jSeparator2)
                    .addComponent(jLabel17)
                    .addComponent(jLabel13)
                    .addComponent(addPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(addUsernameField)
                    .addComponent(addServiceField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addItemPwgen, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        addItemFrameLayout.setVerticalGroup(
            addItemFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addItemFrameLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addServiceField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addItemFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addItemPwgen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addEntryButton)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(495, 653));

        loginPane.setBackground(new java.awt.Color(52, 73, 94));
        loginPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 62, 80), 6));
        loginPane.setPreferredSize(new java.awt.Dimension(495, 653));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 240, 241));
        jLabel1.setText("Enter Master Password");

        loginGoButton.setText("Go");
        loginGoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginGoButtonActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lockd/lockd2.png"))); // NOI18N

        masterPasswordField.setBackground(new java.awt.Color(236, 240, 241));
        masterPasswordField.setForeground(new java.awt.Color(25, 25, 25));
        masterPasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 195, 199), 3));

        javax.swing.GroupLayout loginPaneLayout = new javax.swing.GroupLayout(loginPane);
        loginPane.setLayout(loginPaneLayout);
        loginPaneLayout.setHorizontalGroup(
            loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPaneLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addGroup(loginPaneLayout.createSequentialGroup()
                        .addComponent(masterPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginGoButton)))
                .addGap(118, 118, 118))
        );
        loginPaneLayout.setVerticalGroup(
            loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPaneLayout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginGoButton)
                    .addComponent(masterPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(222, 222, 222))
        );

        mainPane.setBackground(new java.awt.Color(236, 240, 241));
        mainPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 195, 199), 3));
        mainPane.setPreferredSize(new java.awt.Dimension(495, 630));

        jList1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jList1.setForeground(new java.awt.Color(30, 30, 30));
        jList1.setFixedCellHeight(35);
        jList1.setSelectedIndex(0);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lockd/lockd.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 30, 30));
        jLabel2.setText("Service");

        dService.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dService.setText("...");

        mainUsernameField.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        mainUsernameField.setText("...");
        mainUsernameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 195, 199), 3));
        mainUsernameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainUsernameFieldMouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(30, 30, 30));
        jLabel7.setText("Username");

        mainPasswordField.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        mainPasswordField.setText("...");
        mainPasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(189, 195, 199), 3));
        mainPasswordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainPasswordFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mainPasswordFieldMouseEntered(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(30, 30, 30));
        jLabel9.setText("Password");

        addButton.setText("+");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        settingsButton.setText("Settings");
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });

        removeButton.setText("-");
        removeButton.setEnabled(false);
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(100, 100, 100));
        jLabel11.setText("Click username or password to");

        jLabel12.setForeground(new java.awt.Color(100, 100, 100));
        jLabel12.setText("copy text to clipboard.");

        javax.swing.GroupLayout mainPaneLayout = new javax.swing.GroupLayout(mainPane);
        mainPane.setLayout(mainPaneLayout);
        mainPaneLayout.setHorizontalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPaneLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPaneLayout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPaneLayout.createSequentialGroup()
                        .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(18, 18, 18)
                        .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dService)
                            .addComponent(jLabel7)
                            .addComponent(mainUsernameField)
                            .addComponent(jLabel9)
                            .addComponent(mainPasswordField)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addGroup(mainPaneLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                                .addComponent(settingsButton)))))
                .addGap(29, 29, 29))
        );
        mainPaneLayout.setVerticalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPaneLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPaneLayout.createSequentialGroup()
                        .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(settingsButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dService)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainUsernameField)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainPasswordField))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(removeButton))
                .addGap(13, 13, 13))
        );

        jLayeredPane1.setLayer(loginPane, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(mainPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPane, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(mainPane, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPane, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(mainPane, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginGoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginGoButtonActionPerformed
        String mp = String.valueOf(masterPasswordField.getPassword());
        locker = new Locker(mp);
        data = locker.unlock();
        if (data == null) {
            masterPasswordField.setText(null);
            return;
        }
        indexData(data);
        mainPane.setVisible(true);
        loginPane.setVisible(false);
        dataRowsList.stream().forEach((x) -> {
            model1.addElement(x[0]);
        });
        jList1.setModel(model1);
        jList1.setSelectedIndex(0);
        jList1.requestFocus();
    }//GEN-LAST:event_loginGoButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure?");
        switch (confirm) {
            case JOptionPane.NO_OPTION:
                System.out.println("No button clicked");
                break;
            case JOptionPane.YES_OPTION:
                System.out.println("Yes button clicked");
                if (dataRowsList.size() > 1) {
                    int s = jList1.getSelectedIndex();
                    if (s == 0) {
                        jList1.setSelectedIndex(s + 1);
                        dataRowsList.remove(s);
                        model1.remove(s);
                    } else {
                        jList1.setSelectedIndex(s - 1);
                        dataRowsList.remove(s);
                        model1.remove(s);
                    }
                } else {
                    removeButton.setEnabled(false);
                }
                break;
            case JOptionPane.CLOSED_OPTION:
                System.out.println("Confirm removal dialog closed");
                break;
            default:
                break;
        }
        updateLocker();
    }//GEN-LAST:event_removeButtonActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        settingsFrame.setSize(275,500);
        settingsFrame.setVisible(true);
        String[] s = dataRowsList.get(jList1.getSelectedIndex());
        modifyEntryLabel.setText("Modify Entry: "+s[0]);
        settingsUsernameField.setText(s[1]);
        settingsPasswordField.setText(s[2]);
    }//GEN-LAST:event_settingsButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        addItemFrame.setSize(275,325);
        addItemFrame.setVisible(true);
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        int s = jList1.getSelectedIndex();
        dService.setText(dataRowsList.get(s)[0]);
        mainUsernameField.setText(dataRowsList.get(s)[1]);
        mainPasswordField.setText("••••••••••••");
        if (dataRowsList.size()>1) {
            removeButton.setEnabled(true);
        }
    }//GEN-LAST:event_jList1ValueChanged

    private void mainPasswordFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPasswordFieldMouseEntered
        int s = jList1.getSelectedIndex();
        mainPasswordField.setText(dataRowsList.get(s)[2]);
    }//GEN-LAST:event_mainPasswordFieldMouseEntered
    
    /*
     * @purpose: Refreshes the current view.
     */
    private void refresh() {
        int s = jList1.getSelectedIndex();
        dService.setText(dataRowsList.get(s)[0]);
        mainUsernameField.setText(dataRowsList.get(s)[1]);
    }
    
    /*
     * @purpose: Rewrites the data to data.csv by calling Locker() methods.
     */
    private void updateLocker(){
        StringBuilder newData = new StringBuilder();
        newData.append(fileHeader+"\n");
        dataRowsList.stream().forEach((row) -> {
            newData.append(row[0]+","+row[1]+","+row[2]+"\n");
        });
        data = newData.toString();
        indexData(data);
        refresh();
        locker.saveFile(data);                        
    }
    
    private void settingsChangeEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsChangeEntryActionPerformed
        int s = jList1.getSelectedIndex();
        modifyItem(s,1,settingsUsernameField.getText());
        modifyItem(s,2,settingsPasswordField.getText());
        updateLocker();
    }//GEN-LAST:event_settingsChangeEntryActionPerformed

    private void addEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEntryButtonActionPerformed
            String[] NI = new String[]{addServiceField.getText(),addUsernameField.getText(),addPasswordField.getText()};
            addItem(NI[0],NI[1],NI[2]);
            model1.add(dataRowsList.size()-1,NI[0]);
            updateLocker();
    }//GEN-LAST:event_addEntryButtonActionPerformed

    private void mainUsernameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainUsernameFieldMouseClicked
        StringSelection stringSelection = new StringSelection(mainUsernameField.getText());
        clpbrd.setContents(stringSelection, null);
    }//GEN-LAST:event_mainUsernameFieldMouseClicked

    private void mainPasswordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPasswordFieldMouseClicked
        StringSelection stringSelection = new StringSelection(dataRowsList.get(jList1.getSelectedIndex())[2]);
        clpbrd.setContents(stringSelection, null);
    }//GEN-LAST:event_mainPasswordFieldMouseClicked

    private void settingsChangeMasterPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsChangeMasterPasswordActionPerformed
          // to-do: check if old password inputted is equal to the master password, if so, change it with the generated password.
    }//GEN-LAST:event_settingsChangeMasterPasswordActionPerformed

    private void changeMasterPwgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeMasterPwgenActionPerformed
        PasswordBuilder builder = new PasswordBuilder();
        builder.lowercase(5)
                .uppercase(1)
                .digits(2)
                .specials(1)
                .shuffle();
        String tempPW = (builder.build());
        settingsNewPassword.setText(tempPW);
        refresh();
    }//GEN-LAST:event_changeMasterPwgenActionPerformed

    private void modifyEntryPWGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyEntryPWGenActionPerformed
        PasswordBuilder builder = new PasswordBuilder();
        builder.lowercase(5)
                .uppercase(1)
                .digits(2)
                .specials(1)
                .shuffle();
        String tempPW = (builder.build());
        settingsPasswordField.setText(tempPW);
        refresh();
    }//GEN-LAST:event_modifyEntryPWGenActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton addEntryButton;
    private javax.swing.JFrame addItemFrame;
    private javax.swing.JButton addItemPwgen;
    private javax.swing.JTextField addPasswordField;
    private javax.swing.JTextField addServiceField;
    private javax.swing.JTextField addUsernameField;
    private javax.swing.JButton changeMasterPwgen;
    private javax.swing.JLabel dService;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton loginGoButton;
    private javax.swing.JPanel loginPane;
    private javax.swing.JPanel mainPane;
    private javax.swing.JLabel mainPasswordField;
    private javax.swing.JLabel mainUsernameField;
    private javax.swing.JPasswordField masterPasswordField;
    private javax.swing.JLabel modifyEntryLabel;
    private javax.swing.JButton modifyEntryPWGen;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton settingsButton;
    private javax.swing.JButton settingsChangeEntry;
    private javax.swing.JButton settingsChangeMasterPassword;
    private javax.swing.JFrame settingsFrame;
    private javax.swing.JPasswordField settingsNewPassword;
    private javax.swing.JPasswordField settingsOldPassword;
    private javax.swing.JTextField settingsPasswordField;
    private javax.swing.JTextField settingsUsernameField;
    // End of variables declaration//GEN-END:variables
}