/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stock_management.gui;

import javax.swing.JOptionPane;
import com.stock_management.appliance.ApplianceBean;
import com.stock_management.appliance.ApplianceDAO;
import com.stock_management.appliance.ApplianceIO;
import com.stock_management.appliance.DAO;
import com.stock_management.db.DBConnection;
import com.stock_management.user.UserSession;

import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.StringJoiner;
import java.util.TimerTask;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JViewport;
import javax.swing.SwingConstants;
import java.util.Timer;
import java.util.stream.Collectors;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public final class IMSFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrame
     */
    private HashMap<Integer, ApplianceBean> appliancesData;
    private final String companyName;
    private final String userName;
    private final ApplianceIO applianceIO;
    private final Connection connection;
    private final DAO applianceDAO;
    private final int activeID;    
    private Timer timer;
    private boolean anyChanges;
    private File currWorkingFile;
    private boolean isAutoSave;
    private boolean saveTrue_ExportFalse;
    private int applianceID;
    private int nextRow;
    private Component[] whileRegister;
    private FileFilter txtFileFilter;
    private FileFilter xlsxFileFilter;
    private boolean nullField;
    private Object applianceIDR, applianceNameR, categoryR, subCategoryR,
            modelNumberR, weightR, brandNameR, servicesR, priceR, quantityR,
            availabilityR, SKUR, discontinuedR, dateAssignedR, descriptionR,
            commentR;    
    private ApplianceBean toEdit;
    private int selectedRow;
    private int selectedColumn;
    private Component[] updateCancel;
    private Component[] whileUpdate;
    private ApplianceBean applianceBean;
    private boolean viewMode;
    

    public IMSFrame(UserSession userSession) throws Exception {
        initComponents();
        this.companyName = userSession.getCompanyName();
        this.userName = userSession.getUserName();
        this.activeID = userSession.getSessionInfo().getClientID();
        this.connection = userSession.getSessionInfo().getConnection();
        this.applianceDAO = new ApplianceDAO(userSession.getSessionInfo());
        this.applianceIO = new ApplianceIO();      
        this.runOnStart();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sortBG = new javax.swing.ButtonGroup();
        availabilityBG = new javax.swing.ButtonGroup();
        discontinuedBG = new javax.swing.ButtonGroup();
        mainTab = new javax.swing.JTabbedPane();
        homePane = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        userNameL = new javax.swing.JLabel();
        companyNameL = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        newHomeB = new javax.swing.JButton();
        openHomeB = new javax.swing.JButton();
        saveHomeB = new javax.swing.JButton();
        importHomeB = new javax.swing.JButton();
        exportHomeB = new javax.swing.JButton();
        logOutHomeB = new javax.swing.JButton();
        totalApplianceL = new javax.swing.JLabel();
        totalStocksL = new javax.swing.JLabel();
        appWithHighestStockL = new javax.swing.JLabel();
        expectedRevenueL = new javax.swing.JLabel();
        appWithLowestStockL = new javax.swing.JLabel();
        applianceISPane = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        editButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        appDataJTAScroll = new javax.swing.JScrollPane();
        specificationTA = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        commentTA = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        selectedCellJTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        copyButton = new javax.swing.JButton();
        registerPane = new javax.swing.JPanel();
        applianceNameRLabel = new javax.swing.JLabel();
        categoryRL = new javax.swing.JLabel();
        categoryCB = new javax.swing.JComboBox<>();
        quantityRL = new javax.swing.JLabel();
        stockRTextF = new javax.swing.JTextField();
        brandRL = new javax.swing.JLabel();
        companyNameRTextF = new javax.swing.JTextField();
        priceRL = new javax.swing.JLabel();
        modelNumberRL = new javax.swing.JLabel();
        modelNumberRTextF = new javax.swing.JTextField();
        weightRL = new javax.swing.JLabel();
        weightRTextF = new javax.swing.JTextField();
        SKURL = new javax.swing.JLabel();
        applianceSKURTextF = new javax.swing.JTextField();
        eDetailsRLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        eDetailsRTextA = new javax.swing.JTextArea();
        dateRegisteredRLabel = new javax.swing.JLabel();
        dateAssignedRTextF = new javax.swing.JTextField();
        clearRButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        applianceNameRTextF = new javax.swing.JTextField();
        priceRTextF = new javax.swing.JTextField();
        subCategoryRL = new javax.swing.JLabel();
        subCategoryCB = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        servicesRLabel = new javax.swing.JLabel();
        guaranteeRCheckbox = new javax.swing.JCheckBox();
        warrentyYearRLabel = new javax.swing.JLabel();
        guaranteeYearRTextF = new javax.swing.JTextField();
        warrantyRCheckbox = new javax.swing.JCheckBox();
        warrantyYearRTextF = new javax.swing.JTextField();
        repairRCheckbox = new javax.swing.JCheckBox();
        repairInfoRTextF = new javax.swing.JTextField();
        optionalPanel = new javax.swing.JPanel();
        optionalRLabel = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        commentJTA = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        availabilityYRB = new javax.swing.JRadioButton();
        availabilityNRB = new javax.swing.JRadioButton();
        optionalRLabel1 = new javax.swing.JLabel();
        discontinuedYRB = new javax.swing.JRadioButton();
        discontinuedNRB = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        optionalSetButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        applianceIDRTextF = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        cancelUpdateButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        searchPane = new javax.swing.JPanel();
        searchButton = new javax.swing.JButton();
        searchClearButton = new javax.swing.JButton();
        categoryLabel = new javax.swing.JLabel();
        searchCategoryCB = new javax.swing.JComboBox<>();
        pricePanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        searchFromPriceJTF = new javax.swing.JTextField();
        searchToPriceJTF = new javax.swing.JTextField();
        searchByCB = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        searchNameJTF = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        compareTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        compare1JTF = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        compare2JTF = new javax.swing.JTextField();
        compareButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        newMI = new javax.swing.JMenuItem();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        importExcelMI = new javax.swing.JMenuItem();
        exportExcelMI = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        autoSaveMI = new javax.swing.JCheckBoxMenuItem();
        loadSQLMI = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        logOutMI = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        fileNameM = new javax.swing.JMenu();
        savedStatusM = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stock Management System");
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        mainTab.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        mainTab.setPreferredSize(new java.awt.Dimension(940, 535));
        mainTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainTabMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 80)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Welcome,");

        userNameL.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        userNameL.setForeground(new java.awt.Color(0, 153, 153));
        userNameL.setText("User Name Here");

        companyNameL.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        companyNameL.setForeground(new java.awt.Color(102, 102, 102));
        companyNameL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        companyNameL.setText("Company Name Here");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Few Things You Can Try On:");

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        newHomeB.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        newHomeB.setForeground(new java.awt.Color(51, 51, 51));
        newHomeB.setText("New");
        newHomeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newHomeBActionPerformed(evt);
            }
        });

        openHomeB.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        openHomeB.setForeground(new java.awt.Color(51, 51, 51));
        openHomeB.setText("Open");
        openHomeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openHomeBActionPerformed(evt);
            }
        });

        saveHomeB.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        saveHomeB.setForeground(new java.awt.Color(51, 51, 51));
        saveHomeB.setText("Save");
        saveHomeB.setPreferredSize(null);
        saveHomeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveHomeBActionPerformed(evt);
            }
        });

        importHomeB.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        importHomeB.setForeground(new java.awt.Color(51, 51, 51));
        importHomeB.setText("Import From Excel");
        importHomeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importHomeBActionPerformed(evt);
            }
        });

        exportHomeB.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        exportHomeB.setForeground(new java.awt.Color(51, 51, 51));
        exportHomeB.setText("Export To Excel");
        exportHomeB.setPreferredSize(null);
        exportHomeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportHomeBActionPerformed(evt);
            }
        });

        logOutHomeB.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        logOutHomeB.setForeground(new java.awt.Color(51, 51, 51));
        logOutHomeB.setText("Log Out");
        logOutHomeB.setPreferredSize(null);
        logOutHomeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutHomeBActionPerformed(evt);
            }
        });

        totalApplianceL.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        totalApplianceL.setText("Empty Data");

        totalStocksL.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        totalStocksL.setText("Empty Table Data");

        appWithHighestStockL.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        appWithHighestStockL.setText("Empty Table Data");

        expectedRevenueL.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        expectedRevenueL.setText("Expected Revenue");

        appWithLowestStockL.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        appWithLowestStockL.setText("Appliance with Highest Stock:");

        javax.swing.GroupLayout homePaneLayout = new javax.swing.GroupLayout(homePane);
        homePane.setLayout(homePaneLayout);
        homePaneLayout.setHorizontalGroup(
            homePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePaneLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(homePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userNameL)
                    .addComponent(companyNameL)
                    .addComponent(appWithLowestStockL)
                    .addComponent(expectedRevenueL)
                    .addComponent(appWithHighestStockL)
                    .addComponent(totalStocksL)
                    .addComponent(jLabel7)
                    .addComponent(totalApplianceL)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(homePaneLayout.createSequentialGroup()
                        .addComponent(newHomeB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(openHomeB, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(saveHomeB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(importHomeB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exportHomeB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(logOutHomeB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        homePaneLayout.setVerticalGroup(
            homePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePaneLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(companyNameL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(2, 2, 2)
                .addComponent(userNameL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(totalApplianceL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalStocksL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(appWithHighestStockL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(appWithLowestStockL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(expectedRevenueL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(homePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(newHomeB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openHomeB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveHomeB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(importHomeB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exportHomeB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logOutHomeB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        mainTab.addTab("Home", homePane);

        dataTable.setAutoCreateRowSorter(true);
        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Item ID", "Name", "Category", "Sub-Category", "Model Number", "Weight", "Brand", "Service", "Price", "Stocks", "Availability", "SKU", "Discontinued", "Registered Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataTableMouseClicked(evt);
            }
        });
        dataTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dataTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(dataTable);

        editButton.setText("Edit");
        editButton.setEnabled(false);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.setEnabled(false);
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        appDataJTAScroll.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        specificationTA.setEditable(false);
        specificationTA.setColumns(20);
        specificationTA.setRows(5);
        appDataJTAScroll.setViewportView(specificationTA);

        jLabel2.setText("Detailed Descriptions/Specifications");

        commentTA.setEditable(false);
        commentTA.setColumns(20);
        commentTA.setRows(5);
        jScrollPane7.setViewportView(commentTA);

        jLabel10.setText("Comments/Notes");

        selectedCellJTF.setEditable(false);
        selectedCellJTF.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        selectedCellJTF.setAutoscrolls(false);

        jLabel11.setText("Selected Cell Data:");

        copyButton.setText("Copy");
        copyButton.setEnabled(false);
        copyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout applianceISPaneLayout = new javax.swing.GroupLayout(applianceISPane);
        applianceISPane.setLayout(applianceISPaneLayout);
        applianceISPaneLayout.setHorizontalGroup(
            applianceISPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(applianceISPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(applianceISPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(applianceISPaneLayout.createSequentialGroup()
                        .addGroup(applianceISPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(applianceISPaneLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(selectedCellJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(copyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(appDataJTAScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(applianceISPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(applianceISPaneLayout.createSequentialGroup()
                                .addGap(0, 141, Short.MAX_VALUE)
                                .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, applianceISPaneLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane7))))
                .addContainerGap())
        );
        applianceISPaneLayout.setVerticalGroup(
            applianceISPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(applianceISPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(applianceISPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(applianceISPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appDataJTAScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(jScrollPane7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(applianceISPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedCellJTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(copyButton))
                .addContainerGap())
        );

        mainTab.addTab("Appliance's Data", applianceISPane);

        applianceNameRLabel.setText("Appliance Name :");

        categoryRL.setText("Category :");

        categoryCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Home AV", "Kitchenware", "Smart Home", "Heating & Cooling", "Cleaning" }));
        categoryCB.setSelectedItem(null);
        categoryCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryCBActionPerformed(evt);
            }
        });

        quantityRL.setText("Stocks :");

        stockRTextF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        stockRTextF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                stockRTextFKeyPressed(evt);
            }
        });

        brandRL.setText("Brand :");

        priceRL.setText("Price :");

        modelNumberRL.setText("Model Number :");

        weightRL.setText("Weight :");

        SKURL.setText("SKU :");

        applianceSKURTextF.setEditable(false);
        applianceSKURTextF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        eDetailsRLabel.setText("Detail Specifications");

        eDetailsRTextA.setColumns(20);
        eDetailsRTextA.setRows(5);
        eDetailsRTextA.setMaximumSize(new java.awt.Dimension(204, 74));
        jScrollPane4.setViewportView(eDetailsRTextA);

        dateRegisteredRLabel.setText("Registered Date :");

        dateAssignedRTextF.setEditable(false);
        dateAssignedRTextF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        clearRButton.setText("Clear");
        clearRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearRButtonActionPerformed(evt);
            }
        });

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        priceRTextF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        priceRTextF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                priceRTextFKeyPressed(evt);
            }
        });

        subCategoryRL.setText("Sub Category :");

        subCategoryCB.setEnabled(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        servicesRLabel.setText("Services");

        guaranteeRCheckbox.setText("Guarantee");
        guaranteeRCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guaranteeRCheckboxActionPerformed(evt);
            }
        });

        warrentyYearRLabel.setText("Period & Info ");

        guaranteeYearRTextF.setEnabled(false);

        warrantyRCheckbox.setText("Warranty");
        warrantyRCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warrantyRCheckboxActionPerformed(evt);
            }
        });

        warrantyYearRTextF.setEnabled(false);

        repairRCheckbox.setText("Repair");
        repairRCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repairRCheckboxActionPerformed(evt);
            }
        });

        repairInfoRTextF.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(servicesRLabel)
                        .addGap(53, 53, 53)
                        .addComponent(warrentyYearRLabel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(warrantyRCheckbox)
                                    .addComponent(repairRCheckbox))
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(guaranteeRCheckbox)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(warrantyYearRTextF, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(repairInfoRTextF)
                            .addComponent(guaranteeYearRTextF))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(servicesRLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(warrentyYearRLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(guaranteeYearRTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(guaranteeRCheckbox))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(warrantyYearRTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(warrantyRCheckbox))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repairInfoRTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(repairRCheckbox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        optionalPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        optionalPanel.setEnabled(false);

        optionalRLabel.setText("Availability:");
        optionalRLabel.setEnabled(false);

        commentJTA.setEditable(false);
        commentJTA.setColumns(20);
        commentJTA.setRows(5);
        commentJTA.setMaximumSize(new java.awt.Dimension(204, 74));
        jScrollPane5.setViewportView(commentJTA);

        jLabel8.setText("Optional: Can only be set upon registration.");
        jLabel8.setEnabled(false);

        availabilityBG.add(availabilityYRB);
        availabilityYRB.setText("Yes");
        availabilityYRB.setEnabled(false);

        availabilityBG.add(availabilityNRB);
        availabilityNRB.setText("No");
        availabilityNRB.setEnabled(false);

        optionalRLabel1.setText("Discontinued:");
        optionalRLabel1.setEnabled(false);

        discontinuedBG.add(discontinuedYRB);
        discontinuedYRB.setText("Yes");
        discontinuedYRB.setEnabled(false);

        discontinuedBG.add(discontinuedNRB);
        discontinuedNRB.setText("No");
        discontinuedNRB.setEnabled(false);

        jLabel9.setText("Comments");
        jLabel9.setEnabled(false);

        optionalSetButton.setText("Set");
        optionalSetButton.setEnabled(false);
        optionalSetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionalSetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionalPanelLayout = new javax.swing.GroupLayout(optionalPanel);
        optionalPanel.setLayout(optionalPanelLayout);
        optionalPanelLayout.setHorizontalGroup(
            optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(optionalPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionalPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addGroup(optionalPanelLayout.createSequentialGroup()
                        .addGroup(optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(optionalSetButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, optionalPanelLayout.createSequentialGroup()
                                .addGroup(optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(optionalRLabel)
                                    .addComponent(optionalRLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(optionalPanelLayout.createSequentialGroup()
                                        .addComponent(discontinuedYRB)
                                        .addGap(18, 18, 18)
                                        .addComponent(discontinuedNRB))
                                    .addGroup(optionalPanelLayout.createSequentialGroup()
                                        .addComponent(availabilityYRB)
                                        .addGap(18, 18, 18)
                                        .addComponent(availabilityNRB)))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)))
                .addContainerGap())
        );
        optionalPanelLayout.setVerticalGroup(
            optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(2, 2, 2)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(optionalPanelLayout.createSequentialGroup()
                        .addGroup(optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(optionalRLabel)
                            .addComponent(availabilityYRB)
                            .addComponent(availabilityNRB))
                        .addGap(16, 16, 16)
                        .addGroup(optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(optionalRLabel1)
                            .addComponent(discontinuedYRB)
                            .addComponent(discontinuedNRB))
                        .addGap(18, 18, 18)
                        .addComponent(optionalSetButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );

        jLabel1.setText("Item ID:");

        applianceIDRTextF.setEditable(false);
        applianceIDRTextF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        updateButton.setText("Update");
        updateButton.setEnabled(false);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        cancelUpdateButton.setText("Cancel");
        cancelUpdateButton.setEnabled(false);
        cancelUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelUpdateButtonActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Note: The ID is auto-generated upon registeration.");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Note: The Date is auto-generated upon registeration.");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Note: The SKU is auto-generated upon registeration.");

        javax.swing.GroupLayout registerPaneLayout = new javax.swing.GroupLayout(registerPane);
        registerPane.setLayout(registerPaneLayout);
        registerPaneLayout.setHorizontalGroup(
            registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPaneLayout.createSequentialGroup()
                .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPaneLayout.createSequentialGroup()
                        .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(registerPaneLayout.createSequentialGroup()
                                    .addGap(64, 64, 64)
                                    .addComponent(jLabel1))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPaneLayout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addComponent(categoryRL)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SKURL, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(brandRL, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(modelNumberRL, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(applianceNameRLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dateRegisteredRLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(weightRL, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registerPaneLayout.createSequentialGroup()
                                .addComponent(weightRTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(registerPaneLayout.createSequentialGroup()
                                .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(registerPaneLayout.createSequentialGroup()
                                        .addComponent(applianceIDRTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14))
                                    .addGroup(registerPaneLayout.createSequentialGroup()
                                        .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registerPaneLayout.createSequentialGroup()
                                                .addComponent(companyNameRTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(quantityRL))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registerPaneLayout.createSequentialGroup()
                                                .addComponent(modelNumberRTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(priceRL))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registerPaneLayout.createSequentialGroup()
                                                .addComponent(categoryCB, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                                .addComponent(subCategoryRL)))
                                        .addGap(18, 18, 18)
                                        .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(subCategoryCB, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(priceRTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(stockRTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(registerPaneLayout.createSequentialGroup()
                                        .addComponent(dateAssignedRTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel18))
                                    .addGroup(registerPaneLayout.createSequentialGroup()
                                        .addComponent(applianceSKURTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel19))
                                    .addGroup(registerPaneLayout.createSequentialGroup()
                                        .addGap(201, 201, 201)
                                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cancelUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(applianceNameRTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(registerPaneLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(eDetailsRLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPaneLayout.createSequentialGroup()
                                                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(clearRButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jScrollPane4)))))
                    .addGroup(registerPaneLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(optionalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        registerPaneLayout.setVerticalGroup(
            registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(applianceIDRTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eDetailsRLabel)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPaneLayout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateAssignedRTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateRegisteredRLabel)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(applianceNameRTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(applianceNameRLabel))
                        .addGap(18, 18, 18)
                        .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoryCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryRL)
                            .addComponent(subCategoryCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subCategoryRL))
                        .addGap(18, 18, 18)
                        .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modelNumberRTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelNumberRL)
                            .addComponent(priceRTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceRL))
                        .addGap(18, 18, 18)
                        .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(companyNameRTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(brandRL)
                            .addComponent(stockRTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityRL))
                        .addGap(18, 18, 18)
                        .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(applianceSKURTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SKURL)
                            .addComponent(jLabel19)))
                    .addComponent(jScrollPane4))
                .addGap(18, 18, 18)
                .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(registerPaneLayout.createSequentialGroup()
                        .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weightRTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weightRL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registerPaneLayout.createSequentialGroup()
                        .addComponent(optionalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearRButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );

        mainTab.addTab("Register", registerPane);

        searchPane.setPreferredSize(new java.awt.Dimension(940, 495));

        searchButton.setText("Search");
        searchButton.setEnabled(false);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        searchClearButton.setText("Clear");
        searchClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchClearButtonActionPerformed(evt);
            }
        });

        categoryLabel.setText("Category :");
        categoryLabel.setEnabled(false);

        searchCategoryCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Home AV", "Kitchenware", "Smart Home", "Heating & Cooling", "Cleaning" }));
        searchCategoryCB.setEnabled(false);

        pricePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pricePanel.setEnabled(false);

        jLabel4.setText("From:");
        jLabel4.setEnabled(false);

        jLabel6.setText("Price");
        jLabel6.setEnabled(false);

        jLabel5.setText("To:");
        jLabel5.setEnabled(false);

        searchFromPriceJTF.setEditable(false);
        searchFromPriceJTF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        searchFromPriceJTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchFromPriceJTFKeyPressed(evt);
            }
        });

        searchToPriceJTF.setEditable(false);
        searchToPriceJTF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        searchToPriceJTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchToPriceJTFKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pricePanelLayout = new javax.swing.GroupLayout(pricePanel);
        pricePanel.setLayout(pricePanelLayout);
        pricePanelLayout.setHorizontalGroup(
            pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pricePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchToPriceJTF)
                    .addComponent(searchFromPriceJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pricePanelLayout.setVerticalGroup(
            pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pricePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(searchFromPriceJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(searchToPriceJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        searchByCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Category", "Price", "Name" }));
        searchByCB.setSelectedItem(null);
        searchByCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByCBActionPerformed(evt);
            }
        });

        jLabel3.setText("Search By:");

        searchNameJTF.setEditable(false);

        nameLabel.setText("Name :");
        nameLabel.setEnabled(false);

        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Item ID", "Name", "Category", "Sub-Category", "Model Number", "Weight", "Brand", "Service", "Price", "Stocks", "Availability", "SKU", "Discontinued", "Registered Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(searchTable);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        compareTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", null},
                {"", "", null},
                {"", "", null},
                {"", "", null},
                {"", "", null},
                {"", "", null},
                {"", "", null},
                {"", "", null},
                {"", "", null},
                {"", "", null},
                {"", "", null},
                {"", "", null},
                {"", "", null},
                {null, null, null}
            },
            new String [] {
                "Appliance 1", "Vs", "Appliance 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(compareTable);

        jLabel12.setText("Appliance 1:");

        jLabel13.setText("ID");

        compare1JTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                compare1JTFKeyPressed(evt);
            }
        });

        jLabel16.setText("Appliance 2:");

        jLabel17.setText("ID");

        compare2JTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                compare2JTFKeyPressed(evt);
            }
        });

        compareButton.setText("Compare");
        compareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compareButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compare1JTF, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(compare2JTF, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(compareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 97, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(compare1JTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(compare2JTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)
                        .addComponent(compareButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout searchPaneLayout = new javax.swing.GroupLayout(searchPane);
        searchPane.setLayout(searchPaneLayout);
        searchPaneLayout.setHorizontalGroup(
            searchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPaneLayout.createSequentialGroup()
                .addGroup(searchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPaneLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(searchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPaneLayout.createSequentialGroup()
                                .addComponent(searchClearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(searchPaneLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(searchByCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(searchPaneLayout.createSequentialGroup()
                                .addGroup(searchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(categoryLabel)
                                    .addComponent(nameLabel))
                                .addGap(18, 18, 18)
                                .addGroup(searchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchCategoryCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(searchNameJTF)))
                            .addComponent(pricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(searchPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        searchPaneLayout.setVerticalGroup(
            searchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPaneLayout.createSequentialGroup()
                .addGroup(searchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPaneLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(searchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoryLabel)
                            .addComponent(searchCategoryCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(searchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchNameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel))
                        .addGap(20, 20, 20)
                        .addComponent(pricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(searchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(searchByCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(searchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchClearButton)
                            .addComponent(searchButton)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainTab.addTab("Search & Compare", searchPane);

        jMenuBar1.setMargin(new java.awt.Insets(3, 0, 3, 0));

        FileMenu.setText("File");

        newMI.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        newMI.setText("New");
        newMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMIActionPerformed(evt);
            }
        });
        FileMenu.add(newMI);

        openMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openMenuItem.setText("Open");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(openMenuItem);

        saveMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveMenuItem.setText("Save");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(saveMenuItem);

        importExcelMI.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        importExcelMI.setText("Import From Excel");
        importExcelMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importExcelMIActionPerformed(evt);
            }
        });
        FileMenu.add(importExcelMI);

        exportExcelMI.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        exportExcelMI.setText("Export To Excel");
        exportExcelMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportExcelMIActionPerformed(evt);
            }
        });
        FileMenu.add(exportExcelMI);
        FileMenu.add(jSeparator3);

        autoSaveMI.setText("AutoSave Data");
        autoSaveMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoSaveMIActionPerformed(evt);
            }
        });
        FileMenu.add(autoSaveMI);

        loadSQLMI.setText("Load SQL");
        loadSQLMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadSQLMIActionPerformed(evt);
            }
        });
        FileMenu.add(loadSQLMI);
        FileMenu.add(jSeparator2);

        logOutMI.setText("Log Out");
        logOutMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutMIActionPerformed(evt);
            }
        });
        FileMenu.add(logOutMI);

        exitMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        exitMenu.setText("Exit");
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });
        FileMenu.add(exitMenu);

        jMenuBar1.add(FileMenu);

        helpMenu.setText("Help");
        helpMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(helpMenu);

        fileNameM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fileNameMMouseClicked(evt);
            }
        });
        jMenuBar1.add(fileNameM);

        savedStatusM.setText("Saved");
        savedStatusM.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        savedStatusM.setFocusable(false);
        savedStatusM.setOpaque(true);
        savedStatusM.setRequestFocusEnabled(false);
        savedStatusM.setRolloverEnabled(false);
        savedStatusM.setVerifyInputWhenFocusTarget(false);
        jMenuBar1.add(savedStatusM);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        // TODO add your handling code here:
        File f = openFileChooser(true, true, false);
        if (f == null) {
            return;
        }
        currWorkingFile = f;
        openOrImportFile(currWorkingFile, true);
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void compareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compareButtonActionPerformed
        // TODO add your handling code here:
        clearTable(compareTable);
        if (isAppliancesDataEmpty()) {
            return;
        }
        searchClear();
        Component[] jtf = {compare1JTF, compare2JTF};
        if (checkEmptyFields(jtf)) {
            return;         //Verify integer data from Fields.
        }
        int appliance1 = Integer.valueOf(compare1JTF.getText().trim());
        int appliance2 = Integer.valueOf(compare2JTF.getText().trim());
        if (appliance1 == appliance2) {
            JOptionPane.showMessageDialog(this, "Same Appliance cannot be compared!", "Warning: Same IDs", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String nullID = null;
        ApplianceBean a = getFromID(appliance1);
        if (a == null) {
            nullID = String.valueOf(appliance1);
        }

        ApplianceBean b = getFromID(appliance2);
        if (b == null) {
            nullID = String.valueOf(appliance2);
        }

        if (a == null && b == null) {
            JOptionPane.showMessageDialog(this, "Appliances with given IDs " + appliance1 + " & " + appliance2 + " not Found!", "Error: Both Invalid IDs", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (a == null || b == null) {
            JOptionPane.showMessageDialog(this, "Appliance with ID: " + nullID + " not Found!", "Error: Invalid ID", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Object[] aA = a.toObjectArray();
        Object[] vs = {"Appliance ID", "Appliance Name", "Category ", "Sub-Category", "Model Number", "Weight", "Brand", "Service", "Price", "Stocks", "Availability", "SKU", "Discontinued", "Registered Date"};
        Object[] aB = b.toObjectArray();
        for (int i = 0; i < aA.length; i++) {
            compareTable.setValueAt(aA[i], i, 0);
            compareTable.setValueAt(vs[i], i, 1);
            compareTable.setValueAt(aB[i], i, 2);
        }
    }//GEN-LAST:event_compareButtonActionPerformed

    private void searchByCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByCBActionPerformed
        // TODO add your handling code here:
        searchButton.setEnabled(true);
        int selectedIndex = searchByCB.getSelectedIndex();
        switch (selectedIndex) {
            case 0:
                setSearchTabComponents(true, true, false, false, false);
                break;
            case 1:
                setSearchTabComponents(false, false, true, false, false);
                break;
            case 2:
                setSearchTabComponents(false, false, false, true, true);
                break;
        }
    }//GEN-LAST:event_searchByCBActionPerformed

    private void searchClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchClearButtonActionPerformed
        // TODO add your handling code here:
        compareClear();
        searchClear();
    }//GEN-LAST:event_searchClearButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        clearTable(searchTable);
        if (isAppliancesDataEmpty()) {
            return;
        }
        compareClear();
        String msg = "";
        boolean multiResult = true;
        int selectedIndex = searchByCB.getSelectedIndex();
        List<ApplianceBean> ap = null;
        switch (selectedIndex) {
            case 0:
                ap = appliancesData.values().stream()
                        .filter(a -> a.getCategory().equalsIgnoreCase(searchCategoryCB.getSelectedItem().toString()))
                        .collect(Collectors.toList());
                if (ap == null || ap.isEmpty()) 
                    break;
                msg = "Found " + ap.size() + " " + searchCategoryCB.getSelectedItem() + " Appliances:\n";
                break;
            case 1:
                Component[] pJTF = {searchFromPriceJTF, searchToPriceJTF};
                if (checkEmptyFields(pJTF)) {
                    return;
                }
                double priceFrom = Double.valueOf(searchFromPriceJTF.getText().trim());
                double priceTo = Double.valueOf(searchToPriceJTF.getText().trim());
                ap = appliancesData.values().stream()
                        .filter(a -> {
                            double price = a.getPrice();
                            return price >= priceFrom && price <= priceTo;
                                    })
                        .collect(Collectors.toList());
                if (ap == null || ap.isEmpty())
                    break;
                if (priceFrom == priceTo) {
                    multiResult = false;
                    msg = "Found " + ap.get(0).getApplianceName() + " With Given Price " + priceFrom;
                    break;
                }
                msg = "Found " + ap.size() + " Appliances With Price Between " + priceFrom + " & " + priceTo + " :\n";
                break;
            case 2:
                if (checkEmptyField(searchNameJTF)) {
                    return;
                }
                String s = searchNameJTF.getText().trim();
                ap = appliancesData.values().stream()
                        .filter(a -> a.getApplianceName().toLowerCase().contains(s.toLowerCase()))
                        .collect(Collectors.toList());
                if (ap == null || ap.isEmpty())
                    break;
                msg = "Found " + ap.size() + " Appliances With Name \"" + s + "\" :\n";
                break;
        }
        if (ap == null || ap.isEmpty()) {
            optionPane("Nothing Found!", "Error: Returned Null", JOptionPane.ERROR_MESSAGE);
            return;
        }
        importToJTable(searchTable, ap);
        if (multiResult) {
            for (ApplianceBean a : ap) {
                msg = msg.concat("- " + a.getApplianceName()).concat("\n");
            }
        }
        optionPane(msg.trim(), "Results", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        int index = JOptionPane.showConfirmDialog(this, "The Selected Appliance Data Will Be Deleted!", "Are you sure?", JOptionPane.OK_CANCEL_OPTION);
        if (index == JOptionPane.CANCEL_OPTION) {
            return;
        }
        anyChanges = true;
        addRemoveRowToJTable(dataTable, true, true);
        int id = toEdit.getApplianceID();
        appliancesData.remove(id);
        if (!viewMode)
            applianceDAO.deleteAppliance(id);
        if (nextRow > 0)
            nextRow--;
        newRegistration();
    }//GEN-LAST:event_removeButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        clearAISFields();
        clearUpdateField();
        mainTab.setSelectedIndex(2);
        applianceIDRTextF.setText(String.valueOf(toEdit.getApplianceID()));
        applianceSKURTextF.setText(String.valueOf(toEdit.getApplianceSKU()));
        dateAssignedRTextF.setText(String.valueOf(toEdit.getRegDateTime()));
        applianceNameRTextF.setText(toEdit.getApplianceName());
        categoryCB.setSelectedItem(toEdit.getCategory());
        subCategoryCB.setSelectedItem(toEdit.getSubCategory());
        setComponents(updateCancel, true);
        setComponents(whileUpdate, false);
        setComponents(optionalPanel.getComponents(), true);
        optionalSetButton.setEnabled(false);
    }//GEN-LAST:event_editButtonActionPerformed
    
    private void dataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataTableMouseClicked
        // TODO add your handling code here:
        if(selectedRow != dataTable.getSelectedRow()){
            rowSelection();
        }
        if(nullField) {
            dataTable.clearSelection();
            return;
        }
        selectedColumn = dataTable.getSelectedColumn();
        selectedCellJTF.setText(dataTable.getValueAt(selectedRow, selectedColumn).toString());
    }//GEN-LAST:event_dataTableMouseClicked
    
    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuActionPerformed
        // TODO add your handling code here:
        closeWindow();
    }//GEN-LAST:event_exitMenuActionPerformed

    private void helpMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMenuMouseClicked
        // TODO add your handling code here:
        File file = new File("src\\main\\resources\\USER_Manual.pdf");
        try {
            Desktop.getDesktop().open(file);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            JOptionPane.showMessageDialog(this, "File not found", "Error: IO Exception", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_helpMenuMouseClicked

    private void copyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyButtonActionPerformed
        // TODO add your handling code here:
        StringSelection value = new StringSelection(String.valueOf(dataTable.getValueAt(selectedRow, selectedColumn)));
        Clipboard forCopy = Toolkit.getDefaultToolkit().getSystemClipboard();
        forCopy.setContents(value, null);
    }//GEN-LAST:event_copyButtonActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        // TODO add your handling code here:
        isAutoSave = false;
        File f = openFileChooser(false, false, true);
        saveOrExportFile(f, true);
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void searchFromPriceJTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFromPriceJTFKeyPressed
        // TODO add your handling code here:
        checkNumericField(evt.getKeyChar(), searchFromPriceJTF, true);
    }//GEN-LAST:event_searchFromPriceJTFKeyPressed

    private void searchToPriceJTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchToPriceJTFKeyPressed
        // TODO add your handling code here:
        checkNumericField(evt.getKeyChar(), searchToPriceJTF, true);
    }//GEN-LAST:event_searchToPriceJTFKeyPressed

    private void compare1JTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_compare1JTFKeyPressed
        // TODO add your handling code here:
        checkNumericField(evt.getKeyChar(), compare1JTF, false);
    }//GEN-LAST:event_compare1JTFKeyPressed

    private void compare2JTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_compare2JTFKeyPressed
        // TODO add your handling code here:
        checkNumericField(evt.getKeyChar(), compare2JTF, false);
    }//GEN-LAST:event_compare2JTFKeyPressed

    private void exportExcelMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportExcelMIActionPerformed
        // TODO add your handling code here:
        isAutoSave = false;
        File f = openFileChooser(false, false, false);
        saveOrExportFile(f, false);
    }//GEN-LAST:event_exportExcelMIActionPerformed

    private void importExcelMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importExcelMIActionPerformed
        // TODO add your handling code here:
        File f = openFileChooser(true, false, false);
        if (f == null) {
            return;
        }
        currWorkingFile = f;
        openOrImportFile(currWorkingFile, false);
    }//GEN-LAST:event_importExcelMIActionPerformed

    private void logOutMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutMIActionPerformed
        // TODO add your handling code here:
        logOut();
    }//GEN-LAST:event_logOutMIActionPerformed

    private void newMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMIActionPerformed
        // TODO add your handling code here:
        newAPData();
    }//GEN-LAST:event_newMIActionPerformed

    private void autoSaveMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoSaveMIActionPerformed
        // TODO add your handling code here:        
        if (!autoSaveMI.isSelected()) {
            timer.cancel();
            return;
        }
        autoSaveSchedule();
    }//GEN-LAST:event_autoSaveMIActionPerformed

    private void fileNameMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileNameMMouseClicked
        try {
            // TODO add your handling code here:
            if (viewMode)
                Desktop.getDesktop().open(new File(currWorkingFile.getParent()));
        } catch (IOException ex) {
            optionPane("File Not Found!", "Error: IO Exception", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_fileNameMMouseClicked

    private void saveHomeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveHomeBActionPerformed
        // TODO add your handling code here:
        isAutoSave = false;
        File f = openFileChooser(false, false, true);
        saveOrExportFile(f, true);
    }//GEN-LAST:event_saveHomeBActionPerformed

    private void openHomeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openHomeBActionPerformed
        // TODO add your handling code here:
        File f = openFileChooser(true, true, false);
        if (f == null) {
            return;
        }
        currWorkingFile = f;
        openOrImportFile(currWorkingFile, true);
    }//GEN-LAST:event_openHomeBActionPerformed

    private void importHomeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importHomeBActionPerformed
        // TODO add your handling code here:
        File f = openFileChooser(true, false, false);
        if (f == null) {
            return;
        }
        currWorkingFile = f;
        openOrImportFile(currWorkingFile, false);
    }//GEN-LAST:event_importHomeBActionPerformed

    private void exportHomeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportHomeBActionPerformed
        // TODO add your handling code here:
        isAutoSave = false;
        File f = openFileChooser(false, false, false);
        saveOrExportFile(f, false);
    }//GEN-LAST:event_exportHomeBActionPerformed

    private void newHomeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newHomeBActionPerformed
        // TODO add your handling code here:
        newAPData();
    }//GEN-LAST:event_newHomeBActionPerformed

    private void logOutHomeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutHomeBActionPerformed
        // TODO add your handling code here:
        logOut();
    }//GEN-LAST:event_logOutHomeBActionPerformed

    private void mainTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainTabMouseClicked
        // TODO add your handling code here:
        updateHomePage();
        dataTable.clearSelection();
    }//GEN-LAST:event_mainTabMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        closeWindow();
    }//GEN-LAST:event_formWindowClosing

    private void dataTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dataTableKeyReleased
        // TODO add your handling code here:
        if(selectedRow != dataTable.getSelectedRow()){
            rowSelection();
        }
        if(nullField) {
            dataTable.clearSelection();
            return;
        }
        selectedColumn = dataTable.getSelectedColumn();
        selectedCellJTF.setText(dataTable.getValueAt(selectedRow, selectedColumn).toString());
    }//GEN-LAST:event_dataTableKeyReleased

    private void cancelUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelUpdateButtonActionPerformed
        // TODO add your handling code here:
        newRegistration();
        mainTab.setSelectedIndex(1);
    }//GEN-LAST:event_cancelUpdateButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        getFieldsData();
        checkService();
        
        boolean updated = false;

        if (!categoryR.equals(toEdit.getCategory())) {
            toEdit.setCategory((String) categoryR);
            dataTable.setValueAt(categoryR, selectedRow, 2);
            updated = true;
        }
                
        if (!subCategoryR.equals(toEdit.getSubCategory())) {
            toEdit.setCategory((String) subCategoryR);
            dataTable.setValueAt(subCategoryR, selectedRow, 3);
            updated = true;
        }
        
        if (!((String) modelNumberR).isBlank()) {
            toEdit.setModelNumber((String) modelNumberR);
            dataTable.setValueAt(modelNumberR, selectedRow, 4);
            updated = true;
        }

        if (!((String) weightR).isBlank()) {
            toEdit.setWeight((String) weightR);
            dataTable.setValueAt(weightR, selectedRow, 5);
            updated = true;
        }

        if (!((String) brandNameR).isBlank()) {
            toEdit.setBrand((String) brandNameR);
            dataTable.setValueAt(brandNameR, selectedRow, 6);
            updated = true;
        }

        if (!((String) servicesR).isBlank()) {
            toEdit.setService((String) servicesR);
            dataTable.setValueAt(servicesR, selectedRow, 7);
            updated = true;
        }

        if (!((String) priceR).isBlank()) {
            double price = Double.valueOf((String) priceR);
            toEdit.setPrice(price);
            dataTable.setValueAt(price, selectedRow, 8);
            updated = true;
        }

        if (!((String) quantityR).isBlank()) {
            toEdit.setStocks(Integer.valueOf((String) quantityR));
            dataTable.setValueAt(quantityR, selectedRow, 9);
            updated = true;
        }

        if (availabilityR != null) {
            toEdit.setAvailability((boolean) availabilityR);
            dataTable.setValueAt(availabilityR, selectedRow, 10);
            updated = true;
        }

        if (discontinuedR != null) {
            toEdit.setDiscontinued((boolean) discontinuedR);
            dataTable.setValueAt(discontinuedR, selectedRow, 12);
            updated = true;
        }

        if (!((String) descriptionR).isBlank()) {
            toEdit.setDescription((String) descriptionR);
            updated = true;
        }

        if (!((String) commentR).isBlank()) {
            toEdit.setComment((String) commentR);
            updated = true;
        }

        if (!updated) {
            optionPane("All Fields Are Empty!", "Error: Update Fail", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int index = JOptionPane.showConfirmDialog(this, "The Appliance Data Will Be Updated!", "Are you sure?", JOptionPane.OK_CANCEL_OPTION);
        if (index == JOptionPane.CANCEL_OPTION) {
            return;
        }
        
        applianceDAO.updateAppliance(toEdit);
        anyChanges = true;
        newRegistration();
        mainTab.setSelectedIndex(1);
    }//GEN-LAST:event_updateButtonActionPerformed

    private void optionalSetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionalSetButtonActionPerformed
        // TODO add your handling code here:
        getFieldsData();
        applianceBean.setAvailability((boolean) availabilityR);        
        dataTable.setValueAt(availabilityR, nextRow, 10);
        applianceBean.setDiscontinued((boolean) discontinuedR);
        dataTable.setValueAt(discontinuedR, nextRow, 12);
        applianceBean.setComment((String) commentR);
        if (!viewMode) {
            applianceDAO.updateAppliance(applianceBean);
        }
        anyChanges = true;
        optionPane("Set Successfully!", "Optional Setup", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_optionalSetButtonActionPerformed

    private void repairRCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repairRCheckboxActionPerformed
        // TODO add your handling code here:
        repairInfoRTextF.setText("");
        if (repairRCheckbox.isSelected()) {
            repairInfoRTextF.setEnabled(true);
            return;
        }
        repairInfoRTextF.setEnabled(false);
    }//GEN-LAST:event_repairRCheckboxActionPerformed

    private void warrantyRCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warrantyRCheckboxActionPerformed
        // TODO add your handling code here:
        warrantyYearRTextF.setText("");
        if (warrantyRCheckbox.isSelected()) {
            warrantyYearRTextF.setEnabled(true);
            return;
        }
        warrantyYearRTextF.setEnabled(false);
    }//GEN-LAST:event_warrantyRCheckboxActionPerformed

    private void guaranteeRCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guaranteeRCheckboxActionPerformed
        // TODO add your handling code here:
        guaranteeYearRTextF.setText("");
        if (guaranteeRCheckbox.isSelected()) {
            guaranteeYearRTextF.setEnabled(true);
            return;
        }
        guaranteeYearRTextF.setEnabled(false);
    }//GEN-LAST:event_guaranteeRCheckboxActionPerformed

    private void priceRTextFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceRTextFKeyPressed
        // TODO add your handling code here:
        checkNumericField(evt.getKeyChar(), priceRTextF, true);
    }//GEN-LAST:event_priceRTextFKeyPressed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        if (!checkFieldsData()) {
            optionPane("Please! Don't Leave Any Fields Empty!", "Alert", JOptionPane.WARNING_MESSAGE);
            return;
        }
        applianceIDRTextF.setText(String.valueOf(++applianceID));
        dateAssignedRTextF.setText(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
        applianceSKURTextF.setText("#" + generateRandomText(11));
        getFieldsData();
        applianceBean = new ApplianceBean();
        applianceBean.setApplianceID(Integer.valueOf((String) applianceIDR));
        applianceBean.setApplianceName((String) applianceNameR);
        applianceBean.setCategory((String) categoryR);
        applianceBean.setSubCategory((String) subCategoryR);
        applianceBean.setModelNumber((String) modelNumberR);
        applianceBean.setWeight((String) weightR);
        applianceBean.setBrand((String) brandNameR);
        applianceBean.setService((String) servicesR);
        applianceBean.setPrice(Double.valueOf((String) priceR));
        applianceBean.setStocks(Integer.valueOf((String) quantityR));
        applianceBean.setApplianceSKU((String) SKUR);
        applianceBean.setRegDateTime(Timestamp.valueOf((String) dateAssignedR));
        applianceBean.setDescription((String) descriptionR);
        applianceBean.setAddedBy(activeID);
        applianceBean.setComment((String) commentR);
        appliancesData.put(applianceID, applianceBean);
        unSort();
        if (!viewMode) {
            applianceDAO.createAppliance(applianceBean);
        }
        registerButton.setEnabled(false);
        availabilityYRB.setSelected(true);
        discontinuedNRB.setSelected(true);
        anyChanges = true;
        setComponents(optionalPanel.getComponents(), true);
        setComponents(whileRegister, false);
        JOptionPane.showMessageDialog(this, "Data Entered!");
    }//GEN-LAST:event_registerButtonActionPerformed

    private void clearRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearRButtonActionPerformed
        // TODO add your handling code here:
        if (registerButton.isEnabled() || optionalSetButton.isEnabled()) {
            registerButton.setEnabled(true);
            applianceBean = null;
            nextRow++;
            clearRegisterPanel();
        } else {
            clearUpdateField();
        }
    }//GEN-LAST:event_clearRButtonActionPerformed

    private void stockRTextFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockRTextFKeyPressed
        // TODO add your handling code here:
        checkNumericField(evt.getKeyChar(), stockRTextF, false);
    }//GEN-LAST:event_stockRTextFKeyPressed

    private void categoryCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryCBActionPerformed
        // TODO add your handling code here:
        subCategoryCB.setEnabled(true);
        subCategoryCB.removeAllItems();
        int i = categoryCB.getSelectedIndex();
        switch (i) {
            case 0:
            String[] homeAV = {"Television", "Speakers", "TV Stick", "Blueray/DVD player", "Projectors"};
            addItemJComboBox(subCategoryCB, homeAV);
            break;
            case 1:
            String[] kitchenware = {"Refrigerators", "Oven", "Microwave", "Rice Cooker", "Water Purifier", "Electirc Kettle", "Juicers", "Mixers/Grinders", "Blenders"};
            addItemJComboBox(subCategoryCB, kitchenware);
            break;
            case 2:
            String[] smartHome = {"Voice Assistant", "Security Camera", "Thermostat", "Lighting", "Switch", "Door locks", "Surge Protectors"};
            addItemJComboBox(subCategoryCB, smartHome);
            break;
            case 3:
            String[] heatingCooling = {"AC", "Irons", "Fan", "Air Purifier", "Humidifier", "Heater", "Geysers"};
            addItemJComboBox(subCategoryCB, heatingCooling);
            break;
            case 4:
            String[] cleaning = {"Dishwashers", "Vacuum Cleaner", "Washing Machine"};
            addItemJComboBox(subCategoryCB, cleaning);
            break;
        }
    }//GEN-LAST:event_categoryCBActionPerformed

    private void loadSQLMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadSQLMIActionPerformed
        loadFromSQL();
        newRegistration();
        compareClear();
        searchClear();
        clearAISFields();
    }//GEN-LAST:event_loadSQLMIActionPerformed

    private void runOnStart() {
        setLocation(280, 140);        
        fileNameM.setMargin(new Insets(0, 10, 0, 10));
        eDetailsRTextA.setLineWrap(true);
        eDetailsRTextA.setWrapStyleWord(true);
        specificationTA.setLineWrap(true);
        specificationTA.setWrapStyleWord(true);
        savedStatusM.setVisible(false);
        txtFileFilter = new FileNameExtensionFilter("Text File (*.txt)", "txt");
        xlsxFileFilter = new FileNameExtensionFilter("Excel File (*.xlsx)", "xlsx");
        updateCancel = new Component[]{cancelUpdateButton, updateButton};
        whileUpdate = new Component[]{applianceNameRTextF, registerButton};
        whileRegister = new Component[]{applianceNameRTextF, categoryCB, subCategoryCB,
            modelNumberRTextF, weightRTextF, companyNameRTextF, priceRTextF, stockRTextF,
            eDetailsRTextA, warrantyYearRTextF, guaranteeYearRTextF, repairInfoRTextF,
            warrantyRCheckbox, guaranteeRCheckbox, repairRCheckbox};
        isAutoSave = true;
        anyChanges = false;
        selectedRow = -1;
        loadFromSQL();
        tableCellCenterAlign(compareTable);
        mainTab.setSelectedIndex(0); 
        updateHomePage();
    }
    
    private void loadFromSQL() {
        appliancesData = applianceDAO.getAllAppliances();
        int maxID = applianceDAO.getMaxID();
        nextRow = appliancesData.size();
        if (maxID == 0) {
            this.applianceID = 1000;
        } else {
            this.applianceID = maxID;
        }
        if(!appliancesData.isEmpty()) {
            importToJTable(dataTable, new ArrayList<>(appliancesData.values()));
        }
        viewMode = false;
        fileNameM.setEnabled(false);
        autoSaveMI.setEnabled(false);    
        loadSQLMI.setEnabled(false);
    }

    private void updateHomePage() {
        companyNameL.setText(companyName);
        userNameL.setText("Mr. " + userName);
        if (appliancesData.isEmpty()) {
            totalApplianceL.setText("Empty Table Data!");
            totalStocksL.setText("Empty Table Data!");
            appWithHighestStockL.setText("Empty Table Data!");
            appWithLowestStockL.setText("Empty Table Data!");
            expectedRevenueL.setText("Empty Table Data!");
            return;
        }
        totalApplianceL.setText("Total Number Of Appliance In Inventory: " + appliancesData.size());
        int totalStock = 0;
        double expectedRevenue = 0;
        for (ApplianceBean ap : appliancesData.values()) {
            totalStock += ap.getStocks();
            expectedRevenue += ap.getPrice();
        }
        List<ApplianceBean> ap = appliancesData.values().stream()
                .sorted(Comparator.comparing(ApplianceBean::getStocks))
                .collect(Collectors.toList());
        ApplianceBean highestStock = ap.get(ap.size() - 1);
        ApplianceBean lowestStock = ap.get(0);
        totalStocksL.setText("Total Stocks Available In Inventory: " + totalStock);
        String appHighStock = highestStock.getApplianceName();
        String appLowStock = lowestStock.getApplianceName();
        if (appHighStock.length() > 70) {
            appHighStock = appHighStock.substring(0, 70);
        }
        if (appLowStock.length() > 70) {
            appLowStock = appLowStock.substring(0, 70);
        }
        appWithHighestStockL.setText("Appliance with Highest Stocks: " + appHighStock
                + ",    Its Stocks: " + highestStock.getStocks());
        appWithLowestStockL.setText("Appliance with Lowest Stocks: " + appLowStock
                + ",    Its Stocks: " + lowestStock.getStocks());
        expectedRevenueL.setText("Total Expected Revenue Upon Complete Inventory Sale: Rs." + expectedRevenue);
    }

    private void getFieldsData() {
        applianceIDR = applianceIDRTextF.getText();
        applianceNameR = applianceNameRTextF.getText().trim();
        categoryR = categoryCB.getSelectedItem();
        subCategoryR = subCategoryCB.getSelectedItem();
        modelNumberR = modelNumberRTextF.getText().trim();
        weightR = weightRTextF.getText().trim();
        brandNameR = companyNameRTextF.getText().trim();
        priceR = priceRTextF.getText().trim();
        quantityR = stockRTextF.getText().trim();
        SKUR = applianceSKURTextF.getText();
        dateAssignedR = dateAssignedRTextF.getText();
        descriptionR = eDetailsRTextA.getText();
        if (availabilityYRB.isSelected()) {
            availabilityR = true;
        }
        if (availabilityNRB.isSelected()) {
            availabilityR = false;
        }
        if (discontinuedYRB.isSelected()) {
            discontinuedR = true;
        }
        if (discontinuedNRB.isSelected()) {
            discontinuedR = false;
        }
        commentR = commentJTA.getText().trim();
    }

    private boolean checkService() {
        
        StringJoiner services = new StringJoiner(" | ");
        
        if (warrantyRCheckbox.isSelected()) {
            if (checkEmptyField(warrantyYearRTextF)) {
                return false;
            }
            services.add(warrantyRCheckbox.getActionCommand() + "- " + warrantyYearRTextF.getText().trim());
        }
        
        if (guaranteeRCheckbox.isSelected()) {
            if (checkEmptyField(guaranteeYearRTextF)) {
                return false;
            }
            services.add(guaranteeRCheckbox.getActionCommand() + "- " + guaranteeYearRTextF.getText().trim());
        }
        
        if (repairRCheckbox.isSelected()) {
            if (checkEmptyField(repairInfoRTextF)) {
                return false;
            }
            services.add(repairRCheckbox.getActionCommand() + "- " + repairInfoRTextF.getText().trim());
        }
        
        String s = services.toString();
        if (s.isBlank()) {
            servicesR = "";
            return false;
        }        
        servicesR = s;
        return true;
    }

    private boolean checkFieldsData() {
        Component[] isFieldsEmpty = {categoryCB, weightRTextF, companyNameRTextF,
            priceRTextF, stockRTextF, priceRTextF, stockRTextF, eDetailsRTextA};
        if (checkEmptyFields(isFieldsEmpty)) {
            return false;
        }
        return checkService();
    }

    private boolean isAppliancesDataEmpty() {
        if (appliancesData == null || appliancesData.isEmpty()) {
            sortBG.clearSelection();
            optionPane(" No Appliance's Data", "Error: Table is Empty", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }
    
    private void clearRegisterPanel() {
        applianceIDRTextF.setText("");
        applianceNameRTextF.setText("");
        applianceSKURTextF.setText("");
        dateAssignedRTextF.setText("");
        categoryCB.setSelectedItem(null);
        subCategoryCB.setSelectedItem(null);
        commonFieldClear();
        setComponents(whileRegister, true);
        subCategoryCB.setEnabled(false);
        setComponents(optionalPanel.getComponents(), false);
    }
    
    private void commonFieldClear() {
        modelNumberRTextF.setText("");
        priceRTextF.setText("");
        stockRTextF.setText("");
        weightRTextF.setText("");
        companyNameRTextF.setText("");
        warrantyYearRTextF.setText("");
        guaranteeYearRTextF.setText("");
        repairInfoRTextF.setText("");
        eDetailsRTextA.setText("");
        commentJTA.setText("");
        warrantyRCheckbox.setSelected(false);
        warrantyYearRTextF.setEnabled(false);
        guaranteeRCheckbox.setSelected(false);
        guaranteeYearRTextF.setEnabled(false);
        repairRCheckbox.setSelected(false);
        repairInfoRTextF.setEnabled(false);
        availabilityBG.clearSelection();
        discontinuedBG.clearSelection();
    }
    
    private void clearUpdateField() {
        commonFieldClear();
        categoryCB.setSelectedItem(toEdit.getCategory());
        subCategoryCB.setSelectedItem(toEdit.getSubCategory());   
    }

    private void clearAISFields() {
        dataTable.clearSelection();
        copyButton.setEnabled(false);
        commentTA.setText("");
        specificationTA.setText("");
        selectedCellJTF.setText("");
        editButton.setEnabled(false);
        removeButton.setEnabled(false);
    }
        
    private void compareClear() {
        compare1JTF.setText("");
        compare2JTF.setText("");
        clearTable(compareTable);
    }

    private void searchClear() {
        searchByCB.setSelectedItem(null);
        searchButton.setEnabled(false);
        setSearchTabComponents(false, false, false, false, false);
        setDefaultRow(searchTable, 8);
        clearTable(searchTable);
    }
    
    private void checkNumericField(char numericChar, JTextField field, boolean isDouble) {
        if (numericChar == 8 || numericChar == 65535 || numericChar == 127) {
            field.setEditable(true);
            return;
        }
        boolean isNumeric = false;
        if (Character.isDigit(numericChar)) {         //Accepts digits             
            isNumeric = true;
        }
        if (isDouble && numericChar == '.') {             // Acceps dot(.) if the input is of double type
            isNumeric = true;
            if (field.getText().contains(".")) {
                isNumeric = false;
            }
        }
        if (isNumeric) {
            field.setEditable(true);
            setBorderColor(field, false);
        } else {
            field.setEditable(false);
            setBorderColor(field, true);
            javax.swing.Timer animate = new javax.swing.Timer(500, (ActionEvent e) -> {
                setBorderColor(field, false);
            });
            animate.start();
        }
    }

    private boolean checkEmptyFields(Component[] compArray) {
        boolean isEmpty = false;
        for (Component j : compArray) {
            isEmpty = checkEmptyField(j);
            if (isEmpty) {
                return isEmpty;
            }
        }
        return isEmpty;
    }

    private boolean checkEmptyField(Component c) {
        boolean isEmpty = false;
        if (c instanceof JTextField) {
            isEmpty = ((JTextField) c).getText().isBlank();
        }
        if (c instanceof JTextArea) {
            isEmpty = ((JTextArea) c).getText().isBlank();
        }
        if (c instanceof JComboBox) {
            isEmpty = ((JComboBox) c).getSelectedItem() == null;
        }
        return isEmpty;
    }

    private void setSearchTabComponents(boolean a, boolean b, boolean c, boolean d, boolean e) {
        searchNameJTF.setText("");
        searchFromPriceJTF.setText("");
        searchToPriceJTF.setText("");
        searchCategoryCB.setSelectedIndex(0);
        searchCategoryCB.setEnabled(a);
        categoryLabel.setEnabled(b);
        setComponents(pricePanel.getComponents(), c);
        searchNameJTF.setEditable(d);
        nameLabel.setEnabled(e);
    }
        
    private void setComponents(Component[] comp, boolean value) {
        for (Component c : comp) {
            if (c instanceof JTextField) {
                ((JTextField) c).setEditable(value);
            }
            if (c instanceof JTextArea) {
                ((JTextArea) c).setEditable(value);
            }
            if (c instanceof JScrollPane) {
                JViewport view = ((JScrollPane) c).getViewport();
                for (Component cp : view.getComponents()) {
                    if (cp instanceof JTextArea) {
                        ((JTextArea) cp).setEditable(value);
                    }
                }
            }
            if (c instanceof JLabel || c instanceof JButton || c instanceof JComboBox
                    || c instanceof JCheckBox || c instanceof JRadioButton) {
                c.setEnabled(value);
            }
        }
    }
        
    private void setBorderColor(JTextField field, boolean error) {
        if (error) {
            field.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        } else {
            field.setBorder(new JTextField().getBorder());
        }
    }
    
    private void addItemJComboBox(JComboBox<String> jcb, String[] items) {
        for (String a : items) {
            jcb.addItem(a);
        }
    }
    
    private ApplianceBean getFromID(Integer id) {
        return appliancesData.values().stream()
                .filter(a -> a.getApplianceID() == id)
                .findFirst()
                .orElse(null);
    }
        
    private void newRegistration() {
        setComponents(updateCancel, false);
        setComponents(whileUpdate, true);
        clearAISFields();
        clearRegisterPanel();
    }
    
    private void newAPData() {
        File f = openFileChooser(true, true, true);
        if (f == null) {
            return;
        }
        viewMode = true;
        currWorkingFile = f;
        fileNameM.setText(currWorkingFile.getName());
        setDefaultRow(dataTable, 16);
        clearTable(dataTable);
        appliancesData = new HashMap<>();
        nextRow = 0;
        newRegistration();
        compareClear();
        searchClear();
        clearAISFields();
        mainTab.setSelectedIndex(2);
    }
    
    private String generateRandomText(int length) {
        Random r = new Random();
        StringBuilder randText = new StringBuilder();
        for(int i = 0; i < length; i++){
            char character = 0;
            switch (r.nextInt(3)) {
                case 0:
                    character = (char) (65 + r.nextInt(91-65));
                    break;
                case 1:
                    character = (char) (97 + r.nextInt(123-97));
                    break;
                case 2:
                    character = (char) (48 + r.nextInt(58-48));
                    break;                   
            }
            randText.append(character);
        }
        return randText.toString();
    }
    
    private void autoSaveSchedule() {
        timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (anyChanges) {
                    saveOrExportFile(currWorkingFile, saveTrue_ExportFalse);
                    savedStatusM.setVisible(true);
                    javax.swing.Timer animate = new javax.swing.Timer(1500, (ActionEvent e) -> {
                        savedStatusM.setVisible(false);
                    });
                    animate.start();
                }
                anyChanges = false;
            }
        ;
        }; 
        timer.scheduleAtFixedRate(task, 500, 1500);
    }
        
    private void closeWindow() {
        String message = "Do you really want to exit?";
        if (anyChanges) {
            message = "Any unsaved data will be Lost on Exit!";
        }
        if (closeDialog(message, "Home Appliance IS : Exit")){
            try {
                connection.close();
            } catch (SQLException ex) {
                DBConnection.printSQLException(ex);
            }
            System.exit(0);
        } else {
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);      //Terminates all windows/frames.
        }
    }
    
    private boolean closeDialog(String message, String title){
        int Option = JOptionPane.showConfirmDialog(this, message, title, JOptionPane.OK_CANCEL_OPTION);
        return Option == JOptionPane.OK_OPTION;
    }
    
    private void optionPane(String msg, String title, int msgType) {
        JOptionPane.showMessageDialog(this, msg, title, msgType);
    }
    
    private void logOut() {
        if(anyChanges) {
            if (!closeDialog("Any unsaved data will be lost!", "Home Appliance IS : LogOut")) return; 
        }        
        new LoginFrame().setVisible(true);
        this.dispose();
    }

    private File openFileChooser(boolean oiTRUE_seFALSE, boolean OpenTRUE_ImportFALSE, boolean saveTRUE_ExportFALSE) {
        JFileChooser chooser = new JFileChooser("src\\main\\resources\\");
        chooser.removeChoosableFileFilter(chooser.getFileFilter());

        if (oiTRUE_seFALSE && OpenTRUE_ImportFALSE && saveTRUE_ExportFALSE) {
            chooser.addChoosableFileFilter(txtFileFilter);
            chooser.addChoosableFileFilter(xlsxFileFilter);
            chooser.setDialogTitle("Create A New Work File!");
            if (chooser.showDialog(this, "Create") == JFileChooser.CANCEL_OPTION) {
                return null;
            }
            if (chooser.getFileFilter().equals(txtFileFilter)) {
                saveTrue_ExportFalse = true;
                return extensionConcat(chooser.getSelectedFile(), ".txt");
            }
            saveTrue_ExportFalse = false;
            return extensionConcat(chooser.getSelectedFile(), ".xlsx");
        }

        if (OpenTRUE_ImportFALSE || saveTRUE_ExportFALSE) {
            chooser.addChoosableFileFilter(txtFileFilter);
        } else {
            chooser.addChoosableFileFilter(xlsxFileFilter);
        }

        String buttonName;
        if (oiTRUE_seFALSE) {
            if (OpenTRUE_ImportFALSE) {
                buttonName = "Open";
                chooser.setDialogTitle("Open Text File");
            } else {
                buttonName = "Import";
                chooser.setDialogTitle("Import Excel File");
            }
            if (chooser.showDialog(this, buttonName) == JFileChooser.CANCEL_OPTION) {
                return null;
            }
        } else {
            String extension;
            if (saveTRUE_ExportFALSE) {
                extension = ".txt";
                buttonName = "Save";
                chooser.setDialogTitle("Save As Text File");
            } else {
                extension = ".xlsx";
                buttonName = "Export";
                chooser.setDialogTitle("Export To Excel File");
            }
            if (chooser.showDialog(this, buttonName) == JFileChooser.CANCEL_OPTION) {
                return null;
            }
            return extensionConcat(chooser.getSelectedFile(), extension);
        }
        return chooser.getSelectedFile();
    }

    private File extensionConcat(File f, String extension) {
        String filePath = f.getAbsolutePath();
        if (!filePath.toLowerCase().endsWith(extension)) {
            filePath += extension;
        }
        return new File(filePath);
    }
    
    private void unSort() { 
        importToJTable(dataTable, appliancesData.values().stream()
                .sorted(Comparator.comparing(ApplianceBean::getApplianceID))
                .collect(Collectors.toList()));
    }

    private void openOrImportFile(File f, boolean openTRUE_ImportFALSE) {
        if (f == null) {
            return;
        }
        try {
            if (openTRUE_ImportFALSE) {
                appliancesData = applianceIO.openFile(f);
                saveTrue_ExportFalse = true;
            } else {
                appliancesData = applianceIO.importExcelFile(f);
                saveTrue_ExportFalse = false;
            }
            setDefaultRow(dataTable, 16);
            nextRow = appliancesData.size();
            ArrayList<ApplianceBean> a = new ArrayList<>(appliancesData.values());            
            importToJTable(dataTable, a);
            applianceID = a.stream()
                    .max(Comparator.comparing(ApplianceBean::getApplianceID))
                    .get()
                    .getApplianceID();
            viewMode = true;
            autoSaveMI.setEnabled(true);  
            loadSQLMI.setEnabled(true);
            fileNameM.setEnabled(true);
            fileNameM.setText(currWorkingFile.getName());
            newRegistration();
            mainTab.setSelectedIndex(1);
            compareClear();
            searchClear();
            copyButton.setEnabled(false);
        } catch (Exception e) {
            optionPane("Cannot Read File(Unsupported)!\n" + e.getMessage(), "Error: " + e.getClass().getName(), JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    private void saveOrExportFile(File f, boolean saveTRUE_ExportFALSE) {
        if (isAppliancesDataEmpty()) {
            return;
        }
        if (f == null) {
            return;
        }
        try {
            String saveOrExport;
            if (saveTRUE_ExportFALSE) {
                applianceIO.saveFile(appliancesData, f);
                saveOrExport = "Saved";
            } else {
                applianceIO.exportExcelFile(appliancesData, f);
                saveOrExport = "Exported";
            }
            if (!isAutoSave) {
                optionPane("File " + saveOrExport + " Successfully At:\n" + f.getParent(), "File Name: " + f.getName(), JOptionPane.INFORMATION_MESSAGE);
            }
            isAutoSave = true;
        } catch (Exception e) {
            optionPane("Cannot Write File!\n" + e.getMessage(), "Error: " + e.getClass().getName(), JOptionPane.ERROR_MESSAGE);
        }
    }

    private void rowSelection() {
        selectedRow = dataTable.getSelectedRow();
        Component[] buttons = {removeButton, editButton};
        Object id = dataTable.getValueAt(selectedRow, getColumnIndexByName("Item ID"));
        if ( id == null) {
            setComponents(buttons, false);
            copyButton.setEnabled(false);
            clearAISFields();
            nullField = true;
            return;
        }
        toEdit = getFromID((Integer) id);
        setComponents(buttons, true);
        specificationTA.setText(toEdit.getDescription());
        specificationTA.select(0, 0);
        commentTA.setText(toEdit.getComment());
        copyButton.setEnabled(true);
        nullField = false;
    }
    
    private int getColumnIndexByName(String columnName) {
        for(int i=0; i < dataTable.getColumnCount(); i++){
            if (dataTable.getColumnName(i).equals(columnName)) return i;
        }
        return -1;
    }
    
    private void tableCellCenterAlign(JTable jTable) {
        DefaultTableCellRenderer centerAlign = new DefaultTableCellRenderer();
        centerAlign.setHorizontalAlignment(SwingConstants.CENTER);
        for (int columnIndex = 0; columnIndex < jTable.getColumnCount(); columnIndex++) {
            jTable.getTableHeader().setDefaultRenderer(centerAlign);
            jTable.getColumnModel().getColumn(columnIndex).setCellRenderer(centerAlign);
        }
    }

    private void importToJTable(JTable jTable, List<ApplianceBean> ap) {
        if (jTable == searchTable) {
            setDefaultRow(jTable, 8);
        }
        clearTable(jTable);
        int rowSize = ap.size();
        for (int rows = jTable.getRowCount(); rows < rowSize; rows++) {
            addRemoveRowToJTable(jTable, true, false);
        }
        for (int rows = 0; rows < rowSize; rows++) {
            addRow(rows, jTable, ap.get(rows));
        }
    }
    
    private void addRow(int row, JTable jTable, ApplianceBean applianceBean) {
        Object[] values = applianceBean.toObjectArray();
        int columnCount = jTable.getColumnCount();
        for (int column = 0; column < columnCount; column++) {
            jTable.setValueAt(values[column], row, column);
        }
    }

    private void addRemoveRowToJTable(JTable table, boolean add, boolean remove) {       //true for add, false for remove
        Object[] dummyData = {null, null, null, null, null, null, null, null, null, null, null, null, null};
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        if (add) {
            dtm.addRow(dummyData);
        }
        if (remove) {
            dtm.removeRow(selectedRow);
        }
    }
        
    private void setDefaultRow(JTable table, int defaultRowCount) {
        ((DefaultTableModel) table.getModel()).setRowCount(defaultRowCount);
    }
        
    private void clearTable(JTable jTable) {
        jTable.clearSelection();
        int rowCount = jTable.getRowCount();
        int columnCount = jTable.getColumnCount();
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                jTable.setValueAt(null, i, j);
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu FileMenu;
    private javax.swing.JLabel SKURL;
    private javax.swing.JScrollPane appDataJTAScroll;
    private javax.swing.JLabel appWithHighestStockL;
    private javax.swing.JLabel appWithLowestStockL;
    private javax.swing.JTextField applianceIDRTextF;
    private javax.swing.JPanel applianceISPane;
    private javax.swing.JLabel applianceNameRLabel;
    private javax.swing.JTextField applianceNameRTextF;
    private javax.swing.JTextField applianceSKURTextF;
    private javax.swing.JCheckBoxMenuItem autoSaveMI;
    private javax.swing.ButtonGroup availabilityBG;
    private javax.swing.JRadioButton availabilityNRB;
    private javax.swing.JRadioButton availabilityYRB;
    private javax.swing.JLabel brandRL;
    private javax.swing.JButton cancelUpdateButton;
    private javax.swing.JComboBox<String> categoryCB;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JLabel categoryRL;
    private javax.swing.JButton clearRButton;
    private javax.swing.JTextArea commentJTA;
    private javax.swing.JTextArea commentTA;
    private javax.swing.JLabel companyNameL;
    private javax.swing.JTextField companyNameRTextF;
    private javax.swing.JTextField compare1JTF;
    private javax.swing.JTextField compare2JTF;
    private javax.swing.JButton compareButton;
    private javax.swing.JTable compareTable;
    private javax.swing.JButton copyButton;
    private javax.swing.JTable dataTable;
    private javax.swing.JTextField dateAssignedRTextF;
    private javax.swing.JLabel dateRegisteredRLabel;
    private javax.swing.ButtonGroup discontinuedBG;
    private javax.swing.JRadioButton discontinuedNRB;
    private javax.swing.JRadioButton discontinuedYRB;
    private javax.swing.JLabel eDetailsRLabel;
    private javax.swing.JTextArea eDetailsRTextA;
    private javax.swing.JButton editButton;
    private javax.swing.JMenuItem exitMenu;
    private javax.swing.JLabel expectedRevenueL;
    private javax.swing.JMenuItem exportExcelMI;
    private javax.swing.JButton exportHomeB;
    private javax.swing.JMenu fileNameM;
    private javax.swing.JCheckBox guaranteeRCheckbox;
    private javax.swing.JTextField guaranteeYearRTextF;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JPanel homePane;
    private javax.swing.JMenuItem importExcelMI;
    private javax.swing.JButton importHomeB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem loadSQLMI;
    private javax.swing.JButton logOutHomeB;
    private javax.swing.JMenuItem logOutMI;
    private javax.swing.JTabbedPane mainTab;
    private javax.swing.JLabel modelNumberRL;
    private javax.swing.JTextField modelNumberRTextF;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton newHomeB;
    private javax.swing.JMenuItem newMI;
    private javax.swing.JButton openHomeB;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JPanel optionalPanel;
    private javax.swing.JLabel optionalRLabel;
    private javax.swing.JLabel optionalRLabel1;
    private javax.swing.JButton optionalSetButton;
    private javax.swing.JPanel pricePanel;
    private javax.swing.JLabel priceRL;
    private javax.swing.JTextField priceRTextF;
    private javax.swing.JLabel quantityRL;
    private javax.swing.JButton registerButton;
    private javax.swing.JPanel registerPane;
    private javax.swing.JButton removeButton;
    private javax.swing.JTextField repairInfoRTextF;
    private javax.swing.JCheckBox repairRCheckbox;
    private javax.swing.JButton saveHomeB;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JMenu savedStatusM;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> searchByCB;
    private javax.swing.JComboBox<String> searchCategoryCB;
    private javax.swing.JButton searchClearButton;
    private javax.swing.JTextField searchFromPriceJTF;
    private javax.swing.JTextField searchNameJTF;
    private javax.swing.JPanel searchPane;
    private javax.swing.JTable searchTable;
    private javax.swing.JTextField searchToPriceJTF;
    private javax.swing.JTextField selectedCellJTF;
    private javax.swing.JLabel servicesRLabel;
    private javax.swing.ButtonGroup sortBG;
    private javax.swing.JTextArea specificationTA;
    private javax.swing.JTextField stockRTextF;
    private javax.swing.JComboBox<String> subCategoryCB;
    private javax.swing.JLabel subCategoryRL;
    private javax.swing.JLabel totalApplianceL;
    private javax.swing.JLabel totalStocksL;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel userNameL;
    private javax.swing.JCheckBox warrantyRCheckbox;
    private javax.swing.JTextField warrantyYearRTextF;
    private javax.swing.JLabel warrentyYearRLabel;
    private javax.swing.JLabel weightRL;
    private javax.swing.JTextField weightRTextF;
    // End of variables declaration//GEN-END:variables
}
