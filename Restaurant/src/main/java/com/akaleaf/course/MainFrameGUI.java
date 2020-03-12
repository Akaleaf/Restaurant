package com.akaleaf.course;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class MainFrameGUI extends javax.swing.JFrame {

    public MainFrameGUI() {
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        setTitle("Restaurant");
        initComponents();
        dishTable.getColumnModel().getColumn(1).setMinWidth(78);
        dishTable.getColumnModel().getColumn(1).setMaxWidth(78);
        orderFromMenuTable.getColumnModel().getColumn(1).setMinWidth(64);
        orderFromMenuTable.getColumnModel().getColumn(1).setMaxWidth(64);
        orderFromMenuTable.getColumnModel().getColumn(2).setMinWidth(80);
        orderFromMenuTable.getColumnModel().getColumn(2).setMaxWidth(80);
        orderTable.getColumnModel().getColumn(1).setMinWidth(70);
        orderTable.getColumnModel().getColumn(1).setMaxWidth(70);
        orderTable.getColumnModel().getColumn(2).setMinWidth(100);
        orderTable.getColumnModel().getColumn(2).setMaxWidth(100);
        orderTable.getColumnModel().getColumn(3).setMinWidth(100);
        orderTable.getColumnModel().getColumn(3).setMaxWidth(100);
        updateDishTable("");
        updateWaiterTable("");
        updateOrderTable();
        updateOrderFromMenuTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        dishesListScrollPane = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        addDishButton = new javax.swing.JButton();
        nameOfDishTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dishTable = new javax.swing.JTable();
        priceOfDishTextField = new javax.swing.JTextField();
        deleteDish = new javax.swing.JButton();
        searchForTextField = new javax.swing.JTextField();
        waiterListScrollPane = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        addNewWaiterButton = new javax.swing.JButton();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        deleteWaiter = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        waiterTable = new javax.swing.JTable();
        searchForWaiterTextField = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        orderFromMenuTable = new javax.swing.JTable();
        addOrderFromMenuButton = new javax.swing.JButton();
        countTextField = new javax.swing.JTextField();
        deleteOrderFromMenu = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        dateChooser = new datechooser.beans.DateChooserCombo();
        addOrderButton = new javax.swing.JButton();
        tableNumberTextField = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        deleteOrderButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 750));

        tabbedPane.setPreferredSize(new java.awt.Dimension(406, 471));

        jPanel3.setPreferredSize(new java.awt.Dimension(350, 443));

        addDishButton.setText("Add a new dish");
        addDishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDishButtonActionPerformed(evt);
            }
        });

        nameOfDishTextField.setForeground(javax.swing.UIManager.getDefaults().getColor("textInactiveText"));
        nameOfDishTextField.setText("Name of dish...");
        nameOfDishTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameOfDishTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameOfDishTextFieldFocusLost(evt);
            }
        });
        nameOfDishTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameOfDishTextFieldKeyPressed(evt);
            }
        });

        dishTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Dish", "Price", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dishTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dishTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(dishTable);
        if (dishTable.getColumnModel().getColumnCount() > 0) {
            dishTable.getColumnModel().getColumn(0).setMinWidth(0);
            dishTable.getColumnModel().getColumn(0).setPreferredWidth(0);
            dishTable.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        priceOfDishTextField.setForeground(javax.swing.UIManager.getDefaults().getColor("textInactiveText"));
        priceOfDishTextField.setText("Price of dish...");
        priceOfDishTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                priceOfDishTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                priceOfDishTextFieldFocusLost(evt);
            }
        });
        priceOfDishTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                priceOfDishTextFieldKeyPressed(evt);
            }
        });

        deleteDish.setText("Delete selected dish");
        deleteDish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDishActionPerformed(evt);
            }
        });

        searchForTextField.setForeground(javax.swing.UIManager.getDefaults().getColor("textInactiveText"));
        searchForTextField.setText("Search for...");
        searchForTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchForTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchForTextFieldFocusLost(evt);
            }
        });
        searchForTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchForTextFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(priceOfDishTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(nameOfDishTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addDishButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchForTextField)
                            .addComponent(deleteDish, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDishButton)
                    .addComponent(searchForTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameOfDishTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteDish))
                .addGap(18, 18, 18)
                .addComponent(priceOfDishTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        dishesListScrollPane.setViewportView(jPanel3);

        tabbedPane.addTab("Dishes list", dishesListScrollPane);

        waiterListScrollPane.setPreferredSize(new java.awt.Dimension(400, 403));

        jPanel1.setPreferredSize(new java.awt.Dimension(350, 400));

        addNewWaiterButton.setText("Add a new waiter");
        addNewWaiterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewWaiterButtonActionPerformed(evt);
            }
        });

        firstNameTextField.setForeground(javax.swing.UIManager.getDefaults().getColor("textInactiveText"));
        firstNameTextField.setText("First name...");
        firstNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstNameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameTextFieldFocusLost(evt);
            }
        });
        firstNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                firstNameTextFieldKeyPressed(evt);
            }
        });

        lastNameTextField.setForeground(javax.swing.UIManager.getDefaults().getColor("textInactiveText"));
        lastNameTextField.setText("Last name...");
        lastNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastNameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNameTextFieldFocusLost(evt);
            }
        });
        lastNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lastNameTextFieldKeyPressed(evt);
            }
        });

        deleteWaiter.setText("Delete selected waiter");
        deleteWaiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteWaiterActionPerformed(evt);
            }
        });

        waiterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Waiter", "First Name", "Last Name", "Middle Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        waiterTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                waiterTableKeyReleased(evt);
            }
        });
        jScrollPane6.setViewportView(waiterTable);
        if (waiterTable.getColumnModel().getColumnCount() > 0) {
            waiterTable.getColumnModel().getColumn(0).setMinWidth(0);
            waiterTable.getColumnModel().getColumn(0).setPreferredWidth(0);
            waiterTable.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        searchForWaiterTextField.setForeground(javax.swing.UIManager.getDefaults().getColor("textInactiveText"));
        searchForWaiterTextField.setText("Search for...");
        searchForWaiterTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchForWaiterTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchForWaiterTextFieldFocusLost(evt);
            }
        });
        searchForWaiterTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchForWaiterTextFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchForWaiterTextFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(addNewWaiterButton, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(firstNameTextField))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchForWaiterTextField)
                            .addComponent(deleteWaiter, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNewWaiterButton)
                    .addComponent(searchForWaiterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteWaiter))
                .addGap(18, 18, 18)
                .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        waiterListScrollPane.setViewportView(jPanel1);

        tabbedPane.addTab("Waiters list", waiterListScrollPane);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Orders from menu list"));

        orderFromMenuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Order", "Portions", "Amount", "Dish", "ID Order From Menu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(orderFromMenuTable);
        if (orderFromMenuTable.getColumnModel().getColumnCount() > 0) {
            orderFromMenuTable.getColumnModel().getColumn(0).setMinWidth(0);
            orderFromMenuTable.getColumnModel().getColumn(0).setPreferredWidth(0);
            orderFromMenuTable.getColumnModel().getColumn(0).setMaxWidth(0);
            orderFromMenuTable.getColumnModel().getColumn(4).setMinWidth(0);
            orderFromMenuTable.getColumnModel().getColumn(4).setPreferredWidth(0);
            orderFromMenuTable.getColumnModel().getColumn(4).setMaxWidth(0);
        }

        addOrderFromMenuButton.setText("Add an order from menu");
        addOrderFromMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderFromMenuButtonActionPerformed(evt);
            }
        });

        countTextField.setForeground(javax.swing.UIManager.getDefaults().getColor("textInactiveText"));
        countTextField.setText("Count...");
        countTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                countTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                countTextFieldFocusLost(evt);
            }
        });
        countTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                countTextFieldKeyPressed(evt);
            }
        });

        deleteOrderFromMenu.setText("Delete order from menu");
        deleteOrderFromMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOrderFromMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(addOrderFromMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteOrderFromMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(countTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addOrderFromMenuButton)
                    .addComponent(deleteOrderFromMenu))
                .addGap(18, 18, 18)
                .addComponent(countTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Orders list"));

        dateChooser.setCurrentView(new datechooser.view.appearance.AppearancesList("Bordered",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(187, 187, 187),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(187, 187, 187),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(187, 187, 187),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(187, 187, 187),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateChooser.setWeekStyle(datechooser.view.WeekDaysStyle.SHORT);

    addOrderButton.setText("Add an order");
    addOrderButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            addOrderButtonActionPerformed(evt);
        }
    });

    tableNumberTextField.setForeground(javax.swing.UIManager.getDefaults().getColor("textInactiveText"));
    tableNumberTextField.setText("Table number...");
    tableNumberTextField.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            tableNumberTextFieldFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            tableNumberTextFieldFocusLost(evt);
        }
    });
    tableNumberTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            tableNumberTextFieldKeyPressed(evt);
        }
    });

    orderTable.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "ID Order", "Date", "Table  number", "Total  amount", "Waiter"
        }
    ) {
        Class[] types = new Class [] {
            java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
        };
        boolean[] canEdit = new boolean [] {
            false, false, false, false, false
        };

        public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
        }

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    orderTable.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            orderTableMouseClicked(evt);
        }
    });
    jScrollPane5.setViewportView(orderTable);
    if (orderTable.getColumnModel().getColumnCount() > 0) {
        orderTable.getColumnModel().getColumn(0).setMinWidth(0);
        orderTable.getColumnModel().getColumn(0).setPreferredWidth(0);
        orderTable.getColumnModel().getColumn(0).setMaxWidth(0);
    }

    deleteOrderButton.setText("Delete selected order");
    deleteOrderButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            deleteOrderButtonActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
    jPanel7.setLayout(jPanel7Layout);
    jPanel7Layout.setHorizontalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel7Layout.createSequentialGroup()
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(addOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addComponent(tableNumberTextField, javax.swing.GroupLayout.Alignment.TRAILING))
            .addGap(18, 18, 18)
            .addComponent(deleteOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
    );
    jPanel7Layout.setVerticalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel7Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(addOrderButton)
                .addComponent(deleteOrderButton))
            .addGap(18, 18, 18)
            .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(tableNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(28, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap(10, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    // Метод отображающий данные таблицы блюд
    private void updateDishTable(String parameter) {
        try {
            DBProcessor db = new DBProcessor();
            Connection connection = db.getConnection(URL, USERNAME, PASSWORD);
            String query;
            if (parameter.equals("")) {
                query = "select * from restaurant.Dish";
            } else {
                query = "select * from restaurant.Dish where name like \'%" + parameter + "%\' OR price like \'%" + parameter + "%\'";
            }

            PreparedStatement prepStatement = connection.prepareStatement(query);
            ResultSet resultSet = prepStatement.executeQuery();

            DefaultTableModel dishTableModel = (DefaultTableModel) dishTable.getModel();
            dishTableModel.setRowCount(0);

            int i = 0;
            while (resultSet.next()) {

                dishTableModel.addRow(new Object[]{resultSet.getInt("idDish")});
                dishTableModel.setValueAt(resultSet.getInt("price"), i, 1);
                dishTableModel.setValueAt(resultSet.getString("name"), i, 2);

                i++;

            }

            prepStatement.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Метод отображающий данные таблицы официантов
    private void updateWaiterTable(String parameter) {
        try {
            DBProcessor db = new DBProcessor();
            Connection connection = db.getConnection(URL, USERNAME, PASSWORD);
            String query;
            if (parameter.equals("")) {
                query = "select * from restaurant.Waiter";
            } else {
                query = "select * from restaurant.Waiter where firstName like \'%" + parameter + "%\' OR lastName like \'%" + parameter + "%\' OR middleName like \'%" + parameter + "%\'";
            }

            PreparedStatement prepStatement = connection.prepareStatement(query);
            ResultSet resultSet = prepStatement.executeQuery();

            DefaultTableModel waiterTableModel = (DefaultTableModel) waiterTable.getModel();
            waiterTableModel.setRowCount(0);

            int i = 0;
            while (resultSet.next()) {

                waiterTableModel.addRow(new Object[]{resultSet.getString("idWaiter")});
                waiterTableModel.setValueAt(resultSet.getString("firstName"), i, 1);
                waiterTableModel.setValueAt(resultSet.getString("lastName"), i, 2);
                waiterTableModel.setValueAt(resultSet.getString("middleName"), i, 3);

                i++;

            }

            prepStatement.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Метод отображающий данные таблицы заказов
    private void updateOrderTable() {
        try {
            DBProcessor db = new DBProcessor();
            Connection connection = db.getConnection(URL, USERNAME, PASSWORD);
            String query = "select * from restaurant.Order";

            PreparedStatement prepStatement = connection.prepareStatement(query);
            ResultSet resultSet = prepStatement.executeQuery();

            DefaultTableModel orderTableModel = (DefaultTableModel) orderTable.getModel();
            orderTableModel.setRowCount(0);

            int i = 0;
            while (resultSet.next()) {

                orderTableModel.addRow(new Object[]{resultSet.getInt("idOrder")});
                orderTableModel.setValueAt(resultSet.getString("orderDate"), i, 1);
                orderTableModel.setValueAt(resultSet.getInt("tableNumber"), i, 2);
                orderTableModel.setValueAt(resultSet.getInt("totalAmount"), i, 3);

                String queryWaiter = "select * from restaurant.Waiter where idWaiter like \'" + resultSet.getInt("idWaiter") + "\'";

                PreparedStatement queryWaiterStatement = connection.prepareStatement(queryWaiter);
                ResultSet queryWaiterResultSet = queryWaiterStatement.executeQuery();
                queryWaiterResultSet.next();

                String res;
                try {
                    res = queryWaiterResultSet.getString("lastName") + " " + queryWaiterResultSet.getString("firstName");
                } catch (SQLException ex) {
                    res = " -- DELETED -- ";
                }

                orderTableModel.setValueAt(res, i, 4);

                i++;

            }

            prepStatement.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Метод отображающий данные таблицы заказов из меню
    private void updateOrderFromMenuTable() {

        if (orderTable.getSelectedRow() == -1) {
            return;
        }

        try {
            DBProcessor db = new DBProcessor();
            Connection connection = db.getConnection(URL, USERNAME, PASSWORD);

            int idOrder = (Integer) orderTable.getValueAt(orderTable.getSelectedRow(), 0);

            String query = "select * from restaurant.OrderFromMenu where idOrder like \'" + idOrder + "\'";

            PreparedStatement prepStatement = connection.prepareStatement(query);
            ResultSet resultSet = prepStatement.executeQuery();

            DefaultTableModel orderFromMenuTableModel = (DefaultTableModel) orderFromMenuTable.getModel();
            orderFromMenuTableModel.setRowCount(0);

            int i = 0;
            while (resultSet.next()) {

                orderFromMenuTableModel.addRow(new Object[]{resultSet.getInt("idOrder")});
                orderFromMenuTableModel.setValueAt(resultSet.getInt("count"), i, 1);
                orderFromMenuTableModel.setValueAt(resultSet.getInt("amount"), i, 2);

                String queryDish = "select * from restaurant.Dish where idDish like \'" + resultSet.getInt("idDish") + "\'";

                PreparedStatement queryDishStatement = connection.prepareStatement(queryDish);
                ResultSet queryDishResultSet = queryDishStatement.executeQuery();
                queryDishResultSet.next();

                String res;
                try {
                    res = queryDishResultSet.getString(2);
                } catch (SQLException ex) {
                    res = " -- DELETED -- ";
                }

                orderFromMenuTableModel.setValueAt(res, i, 3);
                orderFromMenuTableModel.setValueAt(resultSet.getInt("idOrderFromMenu"), i, 4);

                queryDishStatement.close();

                i++;

            }

            prepStatement.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Метод, добавляющий новый заказ в базу данных и в таблицу
    private void addOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderButtonActionPerformed
        try {
            DBProcessor db = new DBProcessor();
            Connection connection = db.getConnection(URL, USERNAME, PASSWORD);

            String INSERT = "insert into restaurant.Order (orderDate, tableNumber, idWaiter, totalAmount) values (?, ?, ?, ?)";
            PreparedStatement prepInsert = connection.prepareStatement(INSERT);
            prepInsert.setString(1, dateChooser.getText());
            prepInsert.setInt(2, Integer.parseInt(tableNumberTextField.getText()));
            prepInsert.setInt(3, Integer.parseInt((String) waiterTable.getValueAt(waiterTable.getSelectedRow(), 0)));
            prepInsert.setInt(4, 0);
            prepInsert.execute();

            connection.close();
            updateOrderTable();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_addOrderButtonActionPerformed

    // Метод, удаляющий заказ из базы данных и из таблицы
    private void deleteOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOrderButtonActionPerformed
        try {
            DBProcessor db = new DBProcessor();
            Connection connection = db.getConnection(URL, USERNAME, PASSWORD);

            String INSERT = "delete from restaurant.Order where idOrder=?";
            PreparedStatement prepInsert = connection.prepareStatement(INSERT);
            prepInsert.setInt(1, (Integer) orderTable.getValueAt(orderTable.getSelectedRow(), 0));
            prepInsert.execute();

            connection.close();
            updateOrderTable();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_deleteOrderButtonActionPerformed

    // Метод, добавляющий новый заказ из меню в базу данных и в таблицу
    private void addOrderFromMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderFromMenuButtonActionPerformed
        try {
            DBProcessor db = new DBProcessor();
            Connection connection = db.getConnection(URL, USERNAME, PASSWORD);

            int dishTableSelectedRow = dishTable.getSelectedRow();
            int dishTableIDOrder = (Integer) dishTable.getValueAt(dishTableSelectedRow, 0);
            int orderTableIDOrder = (Integer) orderTable.getValueAt(orderTable.getSelectedRow(), 0);

            String INSERT = "insert into restaurant.OrderFromMenu (idOrder, idDish, count, amount) values (?, ?, ?, ?)";

            PreparedStatement prepInsert = connection.prepareStatement(INSERT);
            prepInsert.setInt(1, orderTableIDOrder);
            prepInsert.setInt(2, dishTableIDOrder);
            prepInsert.setInt(3, Integer.parseInt(countTextField.getText()));

            String dishQuery = "select * from restaurant.Dish where idDish = " + dishTableIDOrder;
            PreparedStatement dishQueryStatement = connection.prepareStatement(dishQuery);
            ResultSet dishQueryResultSet = dishQueryStatement.executeQuery();
            dishQueryResultSet.next();

            prepInsert.setInt(4, (Integer.parseInt(countTextField.getText()) * dishQueryResultSet.getInt("price")));
            prepInsert.execute();

            String UPDATE = "update restaurant.Order set totalAmount = ? where idOrder = " + orderTableIDOrder;

            PreparedStatement prepUpdate = connection.prepareStatement(UPDATE);

            String orderFromMenuQuery = "select * from restaurant.OrderFromMenu where idOrder = " + orderTableIDOrder;
            PreparedStatement orderFromMenuQueryStatement = connection.prepareStatement(orderFromMenuQuery);
            ResultSet orderFromMenuQueryResultSet = orderFromMenuQueryStatement.executeQuery();

            int totalAmount = 0;
            while (orderFromMenuQueryResultSet.next()) {
                totalAmount += orderFromMenuQueryResultSet.getInt("amount");
            }

            prepUpdate.setInt(1, totalAmount);
            prepUpdate.execute();

            connection.close();
            updateOrderFromMenuTable();
            updateOrderTable();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_addOrderFromMenuButtonActionPerformed

    private void countTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_countTextFieldFocusGained
        textFieldFocusGained(countTextField, "Count...");
    }//GEN-LAST:event_countTextFieldFocusGained

    private void tableNumberTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableNumberTextFieldFocusGained
        textFieldFocusGained(tableNumberTextField, "Table number...");
    }//GEN-LAST:event_tableNumberTextFieldFocusGained

    private void countTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_countTextFieldFocusLost
        textFieldFocusLost(countTextField, "Count...");
    }//GEN-LAST:event_countTextFieldFocusLost

    private void tableNumberTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableNumberTextFieldFocusLost
        textFieldFocusLost(tableNumberTextField, "Table number...");
    }//GEN-LAST:event_tableNumberTextFieldFocusLost

    // Удаление официанта из базы данных и из таблицы
    private void deleteWaiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteWaiterActionPerformed
        try {
            DBProcessor db = new DBProcessor();
            Connection connection = db.getConnection(URL, USERNAME, PASSWORD);

            String INSERT = "delete from restaurant.Waiter where idWaiter = ?";
            PreparedStatement prepInsert = connection.prepareStatement(INSERT);
            prepInsert.setInt(1, Integer.parseInt((String) waiterTable.getValueAt(waiterTable.getSelectedRow(), 0)));
            prepInsert.execute();

            connection.close();
            updateWaiterTable("");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_deleteWaiterActionPerformed

    private void lastNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameTextFieldFocusLost
        textFieldFocusLost(lastNameTextField, "Last name...");
    }//GEN-LAST:event_lastNameTextFieldFocusLost

    private void lastNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameTextFieldFocusGained
        textFieldFocusGained(lastNameTextField, "Last name...");
    }//GEN-LAST:event_lastNameTextFieldFocusGained

    private void firstNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameTextFieldFocusLost
        textFieldFocusLost(firstNameTextField, "First name...");
    }//GEN-LAST:event_firstNameTextFieldFocusLost

    private void firstNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameTextFieldFocusGained
        textFieldFocusGained(firstNameTextField, "First name...");
    }//GEN-LAST:event_firstNameTextFieldFocusGained

    // Метод, добавляющий нового официанта в базу дынных и в таблицу
    private void addNewWaiterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewWaiterButtonActionPerformed
        try {
            DBProcessor db = new DBProcessor();
            Connection connection = db.getConnection(URL, USERNAME, PASSWORD);

            String INSERT = "insert into restaurant.Waiter (firstName, lastName, middleName) values (?, ?, ?)";
            PreparedStatement prepInsert = connection.prepareStatement(INSERT);
            prepInsert.setString(1, firstNameTextField.getText());
            prepInsert.setString(2, lastNameTextField.getText());
            prepInsert.setString(3, "");
            prepInsert.execute();

            updateWaiterTable("");
            connection.close();
            updateDishTable("");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_addNewWaiterButtonActionPerformed

    private void searchForTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchForTextFieldFocusLost
        textFieldFocusLost(searchForTextField, "Search for...");
    }//GEN-LAST:event_searchForTextFieldFocusLost

    private void searchForTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchForTextFieldFocusGained
        textFieldFocusGained(searchForTextField, "Search for...");
    }//GEN-LAST:event_searchForTextFieldFocusGained

    // Метод удаления блюда из базы данных и из таблицы
    private void deleteDishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDishActionPerformed
        try {
            DBProcessor db = new DBProcessor();
            Connection connection = db.getConnection(URL, USERNAME, PASSWORD);

            String INSERT = "delete from restaurant.Dish where idDish=?";
            PreparedStatement prepInsert = connection.prepareStatement(INSERT);
            prepInsert.setInt(1, (Integer) dishTable.getValueAt(dishTable.getSelectedRow(), 0));
            prepInsert.execute();

            connection.close();
            updateDishTable("");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_deleteDishActionPerformed

    private void priceOfDishTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_priceOfDishTextFieldFocusLost
        textFieldFocusLost(priceOfDishTextField, "Price of dish...");
    }//GEN-LAST:event_priceOfDishTextFieldFocusLost

    private void priceOfDishTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_priceOfDishTextFieldFocusGained
        textFieldFocusGained(priceOfDishTextField, "Price of dish...");
    }//GEN-LAST:event_priceOfDishTextFieldFocusGained

    private void nameOfDishTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameOfDishTextFieldFocusLost
        textFieldFocusLost(nameOfDishTextField, "Name of dish...");
    }//GEN-LAST:event_nameOfDishTextFieldFocusLost

    private void nameOfDishTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameOfDishTextFieldFocusGained
        textFieldFocusGained(nameOfDishTextField, "Name of dish...");
    }//GEN-LAST:event_nameOfDishTextFieldFocusGained

    // Метод добавления блюда в базу данных и в таблицу
    private void addDishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDishButtonActionPerformed
        try {
            DBProcessor db = new DBProcessor();
            Connection connection = db.getConnection(URL, USERNAME, PASSWORD);

            String query = "select * from restaurant.Dish";

            String INSERT = "insert into restaurant.Dish (name, price) values (?, ?)";
            PreparedStatement prepInsert = connection.prepareStatement(INSERT);
            prepInsert.setString(1, nameOfDishTextField.getText());
            prepInsert.setInt(2, Integer.parseInt(priceOfDishTextField.getText()));
            prepInsert.execute();

            connection.close();
            updateDishTable("");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_addDishButtonActionPerformed

    private void searchForTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchForTextFieldKeyReleased
        updateDishTable(searchForTextField.getText());
    }//GEN-LAST:event_searchForTextFieldKeyReleased

    private void orderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderTableMouseClicked
        updateOrderFromMenuTable();
    }//GEN-LAST:event_orderTableMouseClicked

    private void waiterTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_waiterTableKeyReleased
        try {
            DBProcessor db = new DBProcessor();
            Connection connection = db.getConnection(URL, USERNAME, PASSWORD);
            int idWaiter = Integer.parseInt((String) waiterTable.getValueAt(waiterTable.getSelectedRow(), 0));

            if (waiterTable.getSelectedColumn() == 1) {
                String updateFirstName = "update restaurant.Waiter set firstName = ? where idWaiter = " + idWaiter;
                PreparedStatement prepUpdateFirstName = connection.prepareStatement(updateFirstName);
                prepUpdateFirstName.setString(1, (String) waiterTable.getValueAt(waiterTable.getSelectedRow(), 1));
                prepUpdateFirstName.execute();
            }
            if (waiterTable.getSelectedColumn() == 2) {
                String updateLastName = "update restaurant.Waiter set lastName = ? where idWaiter = " + idWaiter;
                PreparedStatement prepUpdateLastName = connection.prepareStatement(updateLastName);
                prepUpdateLastName.setString(1, (String) waiterTable.getValueAt(waiterTable.getSelectedRow(), 2));
                prepUpdateLastName.execute();
            }
            if (waiterTable.getSelectedColumn() == 3) {
                String updateMiddleName = "update restaurant.Waiter set middleName = ? where idWaiter = " + idWaiter;
                PreparedStatement prepUpdateMiddleName = connection.prepareStatement(updateMiddleName);
                prepUpdateMiddleName.setString(1, (String) waiterTable.getValueAt(waiterTable.getSelectedRow(), 3));
                prepUpdateMiddleName.execute();
            }

            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_waiterTableKeyReleased

    private void dishTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dishTableKeyReleased
        try {
            DBProcessor db = new DBProcessor();
            Connection connection = db.getConnection(URL, USERNAME, PASSWORD);
            int idDish = (Integer) dishTable.getValueAt(dishTable.getSelectedRow(), 0);

            if (dishTable.getSelectedColumn() == 1) {
                String updatePrice = "update restaurant.Dish set price = ? where idDish = " + idDish;
                PreparedStatement prepUpdatePrice = connection.prepareStatement(updatePrice);
                prepUpdatePrice.setInt(1, (Integer) dishTable.getValueAt(dishTable.getSelectedRow(), 1));
                prepUpdatePrice.execute();
            }
            if (dishTable.getSelectedColumn() == 2) {
                String updateName = "update restaurant.Dish set name = ? where idDish = " + idDish;
                PreparedStatement prepUpdateName = connection.prepareStatement(updateName);
                prepUpdateName.setString(1, (String) dishTable.getValueAt(dishTable.getSelectedRow(), 2));
                prepUpdateName.execute();
            }

            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_dishTableKeyReleased

    private void searchForWaiterTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchForWaiterTextFieldKeyReleased
        updateWaiterTable(searchForWaiterTextField.getText());
    }//GEN-LAST:event_searchForWaiterTextFieldKeyReleased

    private void searchForWaiterTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchForWaiterTextFieldFocusGained
        textFieldFocusGained(searchForWaiterTextField, "Search for...");
    }//GEN-LAST:event_searchForWaiterTextFieldFocusGained

    private void searchForWaiterTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchForWaiterTextFieldFocusLost
        textFieldFocusLost(searchForWaiterTextField, "Search for...");
    }//GEN-LAST:event_searchForWaiterTextFieldFocusLost

    private void countTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_countTextFieldKeyPressed
        censorInteger(evt, countTextField);
    }//GEN-LAST:event_countTextFieldKeyPressed

    private void tableNumberTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableNumberTextFieldKeyPressed
        censorInteger(evt, tableNumberTextField);
    }//GEN-LAST:event_tableNumberTextFieldKeyPressed

    private void priceOfDishTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceOfDishTextFieldKeyPressed
        censorInteger(evt, priceOfDishTextField);
    }//GEN-LAST:event_priceOfDishTextFieldKeyPressed

    private void nameOfDishTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameOfDishTextFieldKeyPressed
        censorString(evt, nameOfDishTextField);
    }//GEN-LAST:event_nameOfDishTextFieldKeyPressed

    private void firstNameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameTextFieldKeyPressed
        censorString(evt, firstNameTextField);
    }//GEN-LAST:event_firstNameTextFieldKeyPressed

    private void lastNameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameTextFieldKeyPressed
        censorString(evt, lastNameTextField);
    }//GEN-LAST:event_lastNameTextFieldKeyPressed

    private void searchForWaiterTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchForWaiterTextFieldKeyPressed
        censorString(evt, searchForWaiterTextField);
    }//GEN-LAST:event_searchForWaiterTextFieldKeyPressed

    private void deleteOrderFromMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOrderFromMenuActionPerformed
        try {
            DBProcessor db = new DBProcessor();
            Connection connection = db.getConnection(URL, USERNAME, PASSWORD);

            String INSERT = "delete from restaurant.OrderFromMenu where idOrderFromMenu = ?";

            String updateOrderTableQuery = "update restaurant.Order set totalAmount = ? where idOrder = " + orderFromMenuTable.getValueAt(orderFromMenuTable.getSelectedRow(), 0);
            String executeOrderTableQuery = "select * from restaurant.Order where idOrder = " + orderFromMenuTable.getValueAt(orderFromMenuTable.getSelectedRow(), 0);

                PreparedStatement prepExecuteOrderTableQuery = connection.prepareStatement(executeOrderTableQuery);
                ResultSet executeOrderTableQueryResultSet = prepExecuteOrderTableQuery.executeQuery();
                executeOrderTableQueryResultSet.next();

                PreparedStatement prepUpdateOrderTableQuery = connection.prepareStatement(updateOrderTableQuery);
                prepUpdateOrderTableQuery.setInt(1, executeOrderTableQueryResultSet.getInt("totalAmount") - (Integer)orderFromMenuTable.getValueAt(orderFromMenuTable.getSelectedRow(), 2));
                prepUpdateOrderTableQuery.execute();

                System.out.println(executeOrderTableQueryResultSet.getInt("totalAmount"));
                System.out.println((Integer)orderFromMenuTable.getValueAt(orderFromMenuTable.getSelectedRow(), 2));
                System.out.println(executeOrderTableQueryResultSet.getInt("totalAmount") - (Integer)orderFromMenuTable.getValueAt(orderFromMenuTable.getSelectedRow(), 2));

                PreparedStatement prepInsert = connection.prepareStatement(INSERT);
                prepInsert.setInt(1, (Integer) orderFromMenuTable.getValueAt(orderFromMenuTable.getSelectedRow(), 4));
                prepInsert.execute();

            connection.close();
            updateOrderTable();
            updateOrderFromMenuTable();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_deleteOrderFromMenuActionPerformed

    private void censorInteger(java.awt.event.KeyEvent evt, javax.swing.JTextField textField) {
        char character = evt.getKeyChar();
        if (Character.isDigit(character) || Character.isISOControl(character)) {
            textField.setEditable(true);
        } else {
            textField.setEditable(false);
        }
    }

    private void censorString(java.awt.event.KeyEvent evt, javax.swing.JTextField textField) {
        char character = evt.getKeyChar();
        if (Character.isLetter(character) || Character.isWhitespace(character) || Character.isISOControl(character)) {
            textField.setEditable(true);
        } else {
            textField.setEditable(false);
        }
    }

    private void textFieldFocusLost(javax.swing.JTextField textField, String text) {
        if (textField.getText().equals("")) {
            textField.setText(text);
            textField.setForeground(Color.GRAY);
        }
    }

    private void textFieldFocusGained(javax.swing.JTextField textField, String text) {
        if (textField.getText().equals(text)) {
            textField.setText("");
            textField.setForeground(Color.BLACK);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrameGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDishButton;
    private javax.swing.JButton addNewWaiterButton;
    private javax.swing.JButton addOrderButton;
    private javax.swing.JButton addOrderFromMenuButton;
    private javax.swing.JTextField countTextField;
    private datechooser.beans.DateChooserCombo dateChooser;
    private javax.swing.JButton deleteDish;
    private javax.swing.JButton deleteOrderButton;
    private javax.swing.JButton deleteOrderFromMenu;
    private javax.swing.JButton deleteWaiter;
    private javax.swing.JTable dishTable;
    private javax.swing.JScrollPane dishesListScrollPane;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JTextField nameOfDishTextField;
    private javax.swing.JTable orderFromMenuTable;
    private javax.swing.JTable orderTable;
    private javax.swing.JTextField priceOfDishTextField;
    private javax.swing.JTextField searchForTextField;
    private javax.swing.JTextField searchForWaiterTextField;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTextField tableNumberTextField;
    private javax.swing.JScrollPane waiterListScrollPane;
    private javax.swing.JTable waiterTable;
    // End of variables declaration//GEN-END:variables

    // MySQL Variables declaration
    private static final String USERNAME = "root";
    private static final String PASSWORD = "************";
    private static final String URL = "jdbc:mysql://localhost:3306/mysql?useSSL=false";
    // End of MySQL variables declaration

}


