package game;
import game.Type.pieces;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Gui_Game_Play extends javax.swing.JFrame {

    /**
     * Creates new form Gui_game_play
     */
	 private Gui_Main_Menu MainMenu;
	    
	    private boolean IsGameRunning;
	    private int curr_score;
	    private Component frame = null;
	    private int gamecount;
	    private String color;

	    public Gui_Game_Play() {
	        color = "NONE";
	        SoundEffect.init();
	        
	        setExtendedState(JFrame.MAXIMIZED_BOTH);
	        MainMenu = new Gui_Main_Menu(this);
	        MainMenu.setVisible(true);
	        
	       
	        SoundEffect.init();
	        
	        
	        IsGameRunning = false;
	        MainMenu.getEngine().set_IsPlayer1Turn(false);
	        gamecount = 0;
	        if (ChoosePieceType.getSelectedItem().toString().equalsIgnoreCase("X")) {
	        	MainMenu.getEngine().player2.set_piece_type(pieces.X);
	        	MainMenu.getEngine().player1.set_piece_type(pieces.O);
	        } else {
	        	MainMenu.getEngine().player2.set_piece_type(pieces.O);
	        	MainMenu.getEngine().player1.set_piece_type(pieces.X);
	        }
	        if (MainMenu.getEngine().get_IsPlayer1Turn()) {
	            CurrentTurn.setText("Opponent's");
	            CurrentTurn.setForeground(new java.awt.Color(240, 84, 84));
	        } else {
	            CurrentTurn.setText("Your's");
	            CurrentTurn.setForeground(new java.awt.Color(51, 111, 44));
	        }
	        
	        
	    }

	   
	    public void createFour(){
	        
	    	table = new javax.swing.JTable();
	    	        scrolPan = new javax.swing.JScrollPane();
	    	        pan1 = new javax.swing.JPanel();
	    	        pan00 = new javax.swing.JPanel();
	    	        bx0_y0 = new javax.swing.JButton();
	    	        pan01 = new javax.swing.JPanel();
	    	        bx0_y1 = new javax.swing.JButton();
	    	        pan02 = new javax.swing.JPanel();
	    	        bx0_y2 = new javax.swing.JButton();
	    	        pan03 = new javax.swing.JPanel();
	    	        bx0_y3 = new javax.swing.JButton();

	    	        pan10 = new javax.swing.JPanel();
	    	        bx1_y0 = new javax.swing.JButton();
	    	        pan11 = new javax.swing.JPanel();
	    	        bx1_y1 = new javax.swing.JButton();
	    	        pan12 = new javax.swing.JPanel();
	    	        bx1_y2 = new javax.swing.JButton();
	    	        pan13 = new javax.swing.JPanel();
	    	        bx1_y3 = new javax.swing.JButton();

	    	        pan20 = new javax.swing.JPanel();
	    	        bx2_y0 = new javax.swing.JButton();
	    	        pan21 = new javax.swing.JPanel();
	    	        bx2_y1 = new javax.swing.JButton();
	    	        pan22 = new javax.swing.JPanel();
	    	        bx2_y2 = new javax.swing.JButton();
	    	        pan23 = new javax.swing.JPanel();
	    	        bx2_y3 = new javax.swing.JButton();

	    	        pan30 = new javax.swing.JPanel();
	    	        bx3_y0 = new javax.swing.JButton();
	    	        pan31 = new javax.swing.JPanel();
	    	        bx3_y1 = new javax.swing.JButton();
	    	        pan32 = new javax.swing.JPanel();
	    	        bx3_y2 = new javax.swing.JButton();
	    	        pan33 = new javax.swing.JPanel();
	    	        bx3_y3 = new javax.swing.JButton();

	    	        lab1 = new javax.swing.JLabel();
	    	        currentlabel = new javax.swing.JLabel();
	    	        turn = new javax.swing.JLabel();
	    	        pan2 = new javax.swing.JPanel();
	    	        pan3 = new javax.swing.JPanel();
	    	        reset = new javax.swing.JButton();
	    	        suggestion = new javax.swing.JButton();
	    	        lpieces = new javax.swing.JComboBox();
	    	        choix = new javax.swing.JLabel();
	    	        start = new javax.swing.JButton();
	    	        menu = new javax.swing.JButton();
	    	        pan4 = new javax.swing.JPanel();
	    	        score = new javax.swing.JLabel();
	    	        you = new javax.swing.JLabel();
	    	        opponent = new javax.swing.JLabel();
	    	        score1 = new javax.swing.JLabel();
	    	        score2 = new javax.swing.JLabel();

	    	        table.setModel(new javax.swing.table.DefaultTableModel(
	    	                new Object [][] {
	    	                    {null, null, null, null},
	    	                    {null, null, null, null},
	    	                    {null, null, null, null},
	    	                    {null, null, null, null}
	    	                },
	    	                new String [] {
	    	                    "Title 1", "Title 2", "Title 3", "Title 4"
	    	                }
	    	            ));
	    	        scrolPan.setViewportView(table);

	    	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	    	        setTitle("TIC TAC TOE");
	    	        setVisible(true);

	    	        pan00.setBackground(new java.awt.Color(254, 254, 254));
	    	        pan00.setBorder(new javax.swing.border.MatteBorder(null));

	    	        bx0_y0.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
	    	        bx0_y0.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
	    	        bx0_y0.addActionListener(new java.awt.event.ActionListener() {
	    	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	    	            	bx0_y0ActionPerformed(evt);
	    	            }
	    	        });

	    	        javax.swing.GroupLayout pan00Layout = new javax.swing.GroupLayout(pan00);
	    	        pan00.setLayout(pan00Layout);
	    	        pan00Layout.setHorizontalGroup(
	    	            pan00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addComponent(bx0_y0, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	    	        );
	    	        pan00Layout.setVerticalGroup(
	    	            pan00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addGroup(pan00Layout.createSequentialGroup()
	    	                .addComponent(bx0_y0, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                .addGap(0, 0, Short.MAX_VALUE))
	    	        );

	    	        pan01.setBackground(new java.awt.Color(254, 254, 254));
	    	        pan01.setBorder(new javax.swing.border.MatteBorder(null));

	    	        bx0_y1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
	    	        bx0_y1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
	    	        bx0_y1.addActionListener(new java.awt.event.ActionListener() {
	    	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	    	            	bx0_y1ActionPerformed(evt);
	    	            }
	    	        });

	    	        javax.swing.GroupLayout pan01Layout = new javax.swing.GroupLayout(pan01);
	    	        pan01.setLayout(pan01Layout);
	    	        pan01Layout.setHorizontalGroup(
	    	            pan01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addComponent(bx0_y1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	    	        );
	    	        pan01Layout.setVerticalGroup(
	    	            pan01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addGroup(pan01Layout.createSequentialGroup()
	    	                .addComponent(bx0_y1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                .addGap(0, 0, Short.MAX_VALUE))
	    	        );

	    	        pan02.setBackground(new java.awt.Color(254, 254, 254));
	    	        pan02.setBorder(new javax.swing.border.MatteBorder(null));

	    	        bx0_y2.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
	    	        bx0_y2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
	    	        bx0_y2.addActionListener(new java.awt.event.ActionListener() {
	    	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	    	            	bx0_y2ActionPerformed(evt);
	    	            }
	    	        });

	    	        javax.swing.GroupLayout pan02Layout = new javax.swing.GroupLayout(pan02);
	    	        pan02.setLayout(pan02Layout);
	    	        pan02Layout.setHorizontalGroup(
	    	            pan02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addComponent(bx0_y2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	    	        );
	    	        pan02Layout.setVerticalGroup(
	    	            pan02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addGroup(pan02Layout.createSequentialGroup()
	    	                .addComponent(bx0_y2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                .addGap(0, 0, Short.MAX_VALUE))
	    	        );

	    	        pan03.setBackground(new java.awt.Color(254, 254, 254));
	    	        pan03.setBorder(new javax.swing.border.MatteBorder(null));

	    	        bx0_y3.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
	    	        bx0_y3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
	    	        bx0_y3.addActionListener(new java.awt.event.ActionListener() {
	    	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	    	            	bx0_y3ActionPerformed(evt);
	    	            }
	    	        });

	    	        javax.swing.GroupLayout pan03Layout = new javax.swing.GroupLayout(pan03);
	    	        pan03.setLayout(pan03Layout);
	    	        pan03Layout.setHorizontalGroup(
	    	            pan03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addComponent(bx0_y3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	    	        );
	    	        pan03Layout.setVerticalGroup(
	    	            pan03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addGroup(pan03Layout.createSequentialGroup()
	    	                .addComponent(bx0_y3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                .addGap(0, 0, Short.MAX_VALUE))
	    	        );

	    	        //deuxieme ligne

	    	                pan10.setBackground(new java.awt.Color(254, 254, 254));
	    	        pan10.setBorder(new javax.swing.border.MatteBorder(null));

	    	        bx1_y0.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
	    	        bx1_y0.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
	    	        bx1_y0.addActionListener(new java.awt.event.ActionListener() {
	    	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	    	            	bx1_y0ActionPerformed(evt);
	    	            }
	    	        });

	    	        javax.swing.GroupLayout pan10Layout = new javax.swing.GroupLayout(pan10);
	    	        pan10.setLayout(pan10Layout);
	    	        pan10Layout.setHorizontalGroup(
	    	            pan10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addComponent(bx1_y0, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	    	        );
	    	        pan10Layout.setVerticalGroup(
	    	            pan10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addGroup(pan10Layout.createSequentialGroup()
	    	                .addComponent(bx1_y0, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                .addGap(0, 0, Short.MAX_VALUE))
	    	        );

	    	        pan11.setBackground(new java.awt.Color(254, 254, 254));
	    	        pan11.setBorder(new javax.swing.border.MatteBorder(null));

	    	        bx1_y1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
	    	        bx1_y1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
	    	        bx1_y1.addActionListener(new java.awt.event.ActionListener() {
	    	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	    	            	bx1_y1ActionPerformed(evt);
	    	            }
	    	        });

	    	        javax.swing.GroupLayout pan11Layout = new javax.swing.GroupLayout(pan11);
	    	        pan11.setLayout(pan11Layout);
	    	        pan11Layout.setHorizontalGroup(
	    	            pan11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addComponent(bx1_y1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	    	        );
	    	        pan11Layout.setVerticalGroup(
	    	            pan11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addGroup(pan11Layout.createSequentialGroup()
	    	                .addComponent(bx1_y1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                .addGap(0, 0, Short.MAX_VALUE))
	    	        );

	    	        pan12.setBackground(new java.awt.Color(254, 254, 254));
	    	        pan12.setBorder(new javax.swing.border.MatteBorder(null));

	    	        bx1_y2.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
	    	        bx1_y2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
	    	        bx1_y2.addActionListener(new java.awt.event.ActionListener() {
	    	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	    	            	bx1_y2ActionPerformed(evt);
	    	            }
	    	        });

	    	        javax.swing.GroupLayout pan12Layout = new javax.swing.GroupLayout(pan12);
	    	        pan12.setLayout(pan12Layout);
	    	        pan12Layout.setHorizontalGroup(
	    	            pan12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addComponent(bx1_y2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	    	        );
	    	        pan12Layout.setVerticalGroup(
	    	            pan12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addGroup(pan12Layout.createSequentialGroup()
	    	                .addComponent(bx1_y2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                .addGap(0, 0, Short.MAX_VALUE))
	    	        );

	    	        pan13.setBackground(new java.awt.Color(254, 254, 254));
	    	        pan13.setBorder(new javax.swing.border.MatteBorder(null));

	    	        bx1_y3.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
	    	        bx1_y3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
	    	        bx1_y3.addActionListener(new java.awt.event.ActionListener() {
	    	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	    	            	bx1_y3ActionPerformed(evt);
	    	            }
	    	        });

	    	        javax.swing.GroupLayout pan13Layout = new javax.swing.GroupLayout(pan13);
	    	        pan13.setLayout(pan13Layout);
	    	        pan13Layout.setHorizontalGroup(
	    	            pan13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addComponent(bx1_y3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	    	        );
	    	        pan13Layout.setVerticalGroup(
	    	            pan13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addGroup(pan13Layout.createSequentialGroup()
	    	                .addComponent(bx1_y3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                .addGap(0, 0, Short.MAX_VALUE))
	    	        );

	    	        //trosieme ligne
	    	                pan20.setBackground(new java.awt.Color(254, 254, 254));
	    	        pan20.setBorder(new javax.swing.border.MatteBorder(null));

	    	        bx2_y0.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
	    	        bx2_y0.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
	    	        bx2_y0.addActionListener(new java.awt.event.ActionListener() {
	    	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	    	            	bx2_y0ActionPerformed(evt);
	    	            }
	    	        });

	    	        javax.swing.GroupLayout pan20Layout = new javax.swing.GroupLayout(pan20);
	    	        pan20.setLayout(pan20Layout);
	    	        pan20Layout.setHorizontalGroup(
	    	            pan20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addComponent(bx2_y0, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	    	        );
	    	        pan20Layout.setVerticalGroup(
	    	            pan20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addGroup(pan20Layout.createSequentialGroup()
	    	                .addComponent(bx2_y0, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                .addGap(0, 0, Short.MAX_VALUE))
	    	        );

	    	        pan21.setBackground(new java.awt.Color(254, 254, 254));
	    	        pan21.setBorder(new javax.swing.border.MatteBorder(null));

	    	        bx2_y1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
	    	        bx2_y1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
	    	        bx2_y1.addActionListener(new java.awt.event.ActionListener() {
	    	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	    	            	bx2_y1ActionPerformed(evt);
	    	            }
	    	        });

	    	        javax.swing.GroupLayout pan21Layout = new javax.swing.GroupLayout(pan21);
	    	        pan21.setLayout(pan21Layout);
	    	        pan21Layout.setHorizontalGroup(
	    	            pan21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addComponent(bx2_y1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	    	        );
	    	        pan21Layout.setVerticalGroup(
	    	            pan21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addGroup(pan21Layout.createSequentialGroup()
	    	                .addComponent(bx2_y1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                .addGap(0, 0, Short.MAX_VALUE))
	    	        );

	    	        pan22.setBackground(new java.awt.Color(254, 254, 254));
	    	        pan22.setBorder(new javax.swing.border.MatteBorder(null));

	    	        bx2_y2.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
	    	        bx2_y2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
	    	        bx2_y2.addActionListener(new java.awt.event.ActionListener() {
	    	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	    	            	bx2_y2ActionPerformed(evt);
	    	            }
	    	        });

	    	        javax.swing.GroupLayout pan22Layout = new javax.swing.GroupLayout(pan22);
	    	        pan22.setLayout(pan22Layout);
	    	        pan22Layout.setHorizontalGroup(
	    	            pan22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addComponent(bx2_y2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	    	        );
	    	        pan22Layout.setVerticalGroup(
	    	            pan22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addGroup(pan22Layout.createSequentialGroup()
	    	                .addComponent(bx2_y2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                .addGap(0, 0, Short.MAX_VALUE))
	    	        );

	    	        pan23.setBackground(new java.awt.Color(254, 254, 254));
	    	        pan23.setBorder(new javax.swing.border.MatteBorder(null));

	    	        bx2_y3.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
	    	        bx2_y3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
	    	        bx2_y3.addActionListener(new java.awt.event.ActionListener() {
	    	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	    	            	bx2_y3ActionPerformed(evt);
	    	            }
	    	        });

	    	        javax.swing.GroupLayout pan23Layout = new javax.swing.GroupLayout(pan23);
	    	        pan23.setLayout(pan23Layout);
	    	        pan23Layout.setHorizontalGroup(
	    	            pan23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addComponent(bx2_y3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	    	        );
	    	        pan23Layout.setVerticalGroup(
	    	            pan23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addGroup(pan23Layout.createSequentialGroup()
	    	                .addComponent(bx2_y3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                .addGap(0, 0, Short.MAX_VALUE))
	    	        );

	    	        //quatrieme ligne
	    	                pan30.setBackground(new java.awt.Color(254, 254, 254));
	    	        pan30.setBorder(new javax.swing.border.MatteBorder(null));

	    	        bx3_y0.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
	    	        bx3_y0.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
	    	        bx3_y0.addActionListener(new java.awt.event.ActionListener() {
	    	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	    	            	bx3_y0ActionPerformed(evt);
	    	            }
	    	        });

	    	        javax.swing.GroupLayout pan30Layout = new javax.swing.GroupLayout(pan30);
	    	        pan30.setLayout(pan30Layout);
	    	        pan30Layout.setHorizontalGroup(
	    	            pan30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addComponent(bx3_y0, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	    	        );
	    	        pan30Layout.setVerticalGroup(
	    	            pan30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addGroup(pan30Layout.createSequentialGroup()
	    	                .addComponent(bx3_y0, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                .addGap(0, 0, Short.MAX_VALUE))
	    	        );

	    	        pan31.setBackground(new java.awt.Color(254, 254, 254));
	    	        pan31.setBorder(new javax.swing.border.MatteBorder(null));

	    	        bx3_y1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
	    	        bx3_y1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
	    	        bx3_y1.addActionListener(new java.awt.event.ActionListener() {
	    	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	    	            	bx3_y1ActionPerformed(evt);
	    	            }
	    	        });

	    	        javax.swing.GroupLayout pan31Layout = new javax.swing.GroupLayout(pan31);
	    	        pan31.setLayout(pan31Layout);
	    	        pan31Layout.setHorizontalGroup(
	    	            pan31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addComponent(bx3_y1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	    	        );
	    	        pan31Layout.setVerticalGroup(
	    	            pan31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addGroup(pan31Layout.createSequentialGroup()
	    	                .addComponent(bx3_y1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                .addGap(0, 0, Short.MAX_VALUE))
	    	        );

	    	        pan32.setBackground(new java.awt.Color(254, 254, 254));
	    	        pan32.setBorder(new javax.swing.border.MatteBorder(null));

	    	        bx3_y2.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
	    	        bx3_y2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
	    	        bx3_y2.addActionListener(new java.awt.event.ActionListener() {
	    	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	    	            	bx3_y2ActionPerformed(evt);
	    	            }
	    	        });

	    	        javax.swing.GroupLayout pan32Layout = new javax.swing.GroupLayout(pan32);
	    	        pan32.setLayout(pan32Layout);
	    	        pan32Layout.setHorizontalGroup(
	    	            pan32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addComponent(bx3_y2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	    	        );
	    	        pan32Layout.setVerticalGroup(
	    	            pan32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addGroup(pan32Layout.createSequentialGroup()
	    	                .addComponent(bx3_y2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                .addGap(0, 0, Short.MAX_VALUE))
	    	        );

	    	        pan33.setBackground(new java.awt.Color(254, 254, 254));
	    	        pan33.setBorder(new javax.swing.border.MatteBorder(null));

	    	        bx3_y3.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
	    	        bx3_y3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
	    	        bx3_y3.addActionListener(new java.awt.event.ActionListener() {
	    	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	    	            	bx3_y3ActionPerformed(evt);
	    	            }
	    	        });

	    	        javax.swing.GroupLayout pan33Layout = new javax.swing.GroupLayout(pan33);
	    	        pan33.setLayout(pan33Layout);
	    	        pan33Layout.setHorizontalGroup(
	    	            pan33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addComponent(bx3_y3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	    	        );
	    	        pan33Layout.setVerticalGroup(
	    	            pan33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addGroup(pan33Layout.createSequentialGroup()
	    	                .addComponent(bx3_y3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                .addGap(0, 0, Short.MAX_VALUE))
	    	        );

	    	        javax.swing.GroupLayout pan1Layout = new javax.swing.GroupLayout(pan1);
	    	        pan1.setLayout(pan1Layout);
	    	        pan1Layout.setHorizontalGroup(
	    	                pan1Layout.createSequentialGroup()
	    	                      .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	                           .addComponent(pan00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                           .addComponent(pan10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                           .addComponent(pan20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                           .addComponent(pan30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

	    	                      .addGroup(pan1Layout.createParallelGroup()
	    	                           .addComponent(pan01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                           .addComponent(pan11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                           .addComponent(pan21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                           .addComponent(pan31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	    	                      
	    	                      .addGroup(pan1Layout.createParallelGroup()
	    	                           .addComponent(pan02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                           .addComponent(pan12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                           .addComponent(pan22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                           .addComponent(pan32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

	    	                           .addGroup(pan1Layout.createParallelGroup()
	    	                           .addComponent(pan03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                           .addComponent(pan13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                           .addComponent(pan23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                           .addComponent(pan33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	    	                );

	    	        pan1Layout.setVerticalGroup(
	    	                pan1Layout.createSequentialGroup()
	    	                      .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	    	                           .addComponent(pan00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                           .addComponent(pan01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                           .addComponent(pan02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                           .addComponent(pan03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	    	                      
	    	                      .addGroup(pan1Layout.createParallelGroup()
	    	                           .addComponent(pan10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                           .addComponent(pan11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                           .addComponent(pan12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                           .addComponent(pan13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

	    	                        .addGroup(pan1Layout.createParallelGroup()
	    	                           .addComponent(pan20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                           .addComponent(pan21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                           .addComponent(pan22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                           .addComponent(pan23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

	    	                        .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	    	                           .addComponent(pan30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                           .addComponent(pan31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                           .addComponent(pan32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                           .addComponent(pan33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	    	                );
	    	            ;
	    	        currentlabel.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
	    	        currentlabel.setText("Current Turn : ");

	    	        turn.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
	    	        turn.setText("Opponent");

	    	        javax.swing.GroupLayout pan2Layout = new javax.swing.GroupLayout(pan2);
	    	        pan2.setLayout(pan2Layout);
	    	        pan2Layout.setHorizontalGroup(
	    	            pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addGroup(pan2Layout.createSequentialGroup()
	    	                .addContainerGap(85, Short.MAX_VALUE)
	    	                .addComponent(currentlabel)
	    	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	    	                .addComponent(turn, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    	                .addComponent(lab1)
	    	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    	        );
	    	        pan2Layout.setVerticalGroup(
	    	            pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addGroup(pan2Layout.createSequentialGroup()
	    	                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	                    .addGroup(pan2Layout.createSequentialGroup()
	    	                        .addGap(44, 44, 44)
	    	                        .addComponent(lab1))
	    	                    .addGroup(pan2Layout.createSequentialGroup()
	    	                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    	                        .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	    	                            .addComponent(currentlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                            .addComponent(turn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
	    	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    	        );

	    	        reset.setText("Reset game");
	    	        reset.addActionListener(new java.awt.event.ActionListener() {
	    	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	    	            	ResetGameActionPerformed(evt);
	    	            }
	    	        });

	    	        suggestion.setBackground(new java.awt.Color(130, 130, 112));
	    	        suggestion.setText("Suggest a MOVE");
	    	        suggestion.addActionListener(new java.awt.event.ActionListener() {
	    	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	    	            	MoveSuggestionActionPerformed(evt);
	    	            }
	    	        });

	    	        lpieces.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
	    	        lpieces.setMaximumRowCount(2);
	    	        lpieces.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O", "X" }));
	    	        lpieces.addActionListener(new java.awt.event.ActionListener() {
	    	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	    	            	ChoosePieceTypeActionPerformed(evt);
	    	            }
	    	        });

	    	        choix.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
	    	        choix.setText("Choose X or O  :");

	    	        start.setText("Start game");
	    	        start.addActionListener(new java.awt.event.ActionListener() {
	    	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	    	            	bStartGameActionPerformed(evt);
	    	            }
	    	        });

	    	        menu.setText("Back to Main Menu");
	    	        menu.addActionListener(new java.awt.event.ActionListener() {
	    	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	    	            	BackToMainMenuActionPerformed(evt);
	    	            }
	    	        });

	    	        javax.swing.GroupLayout pan3Layout = new javax.swing.GroupLayout(pan3);
	    	        pan3.setLayout(pan3Layout);
	    	        pan3Layout.setHorizontalGroup(
	    	            pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	    	            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pan3Layout.createSequentialGroup()
	    	                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	    	                    .addGroup(pan3Layout.createSequentialGroup()
	    	                        .addGap(37, 37, 37)
	    	                        .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	                            .addComponent(suggestion, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                            .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                            .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
	    	                        .addGap(0, 0, Short.MAX_VALUE))
	    	                    .addGroup(pan3Layout.createSequentialGroup()
	    	                        .addGap(0, 0, Short.MAX_VALUE)
	    	                        .addComponent(choix, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                        .addGap(18, 18, 18)
	    	                        .addComponent(lpieces, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
	    	                .addContainerGap(15, Short.MAX_VALUE))
	    	        );
	    	        pan3Layout.setVerticalGroup(
	    	            pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addGroup(pan3Layout.createSequentialGroup()
	    	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    	                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	    	                    .addComponent(choix, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                    .addComponent(lpieces, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
	    	                .addGap(67, 67, 67)
	    	                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                .addGap(18, 18, 18)
	    	                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                .addGap(18, 18, 18)
	    	                .addComponent(suggestion, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                .addGap(18, 18, 18)
	    	                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    	        );

	    	        score.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
	    	        score.setText("SCORE");

	    	        you.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
	    	        you.setForeground(new java.awt.Color(51, 111, 44));
	    	        you.setText("    YOU   :");

	    	        opponent.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
	    	        opponent.setForeground(new java.awt.Color(240, 84, 84));
	    	        opponent.setText("Opponent : ");

	    	        score1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
	    	        score1.setForeground(new java.awt.Color(0, 185, 0));
	    	        score1.setText("0");

	    	        score2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
	    	        score2.setForeground(new java.awt.Color(215, 73, 73));
	    	        score2.setText("0");

	    	        javax.swing.GroupLayout pan4Layout = new javax.swing.GroupLayout(pan4);
	    	        pan4.setLayout(pan4Layout);
	    	        pan4Layout.setHorizontalGroup(
	    	            pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addGroup(pan4Layout.createSequentialGroup()
	    	                .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	                    .addGroup(pan4Layout.createSequentialGroup()
	    	                        .addGap(23, 23, 23)
	    	                        .addComponent(score))
	    	                    .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	    	                        .addGroup(pan4Layout.createSequentialGroup()
	    	                            .addComponent(you, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    	                            .addComponent(score1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
	    	                        .addGroup(pan4Layout.createSequentialGroup()
	    	                            .addContainerGap()
	    	                            .addComponent(opponent)
	    	                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	    	                            .addComponent(score2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
	    	                .addContainerGap(23, Short.MAX_VALUE))
	    	        );
	    	        pan4Layout.setVerticalGroup(
	    	            pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addGroup(pan4Layout.createSequentialGroup()
	    	                .addGap(26, 26, 26)
	    	                .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                .addGap(30, 30, 30)
	    	                .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	    	                    .addComponent(you, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                    .addComponent(score1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
	    	                .addGap(20, 20, 20)
	    	                .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	    	                    .addComponent(opponent, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
	    	                    .addComponent(score2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
	    	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    	        );

	    	        javax.swing.GroupLayout layout4 = new javax.swing.GroupLayout(getContentPane());
	    	        getContentPane().setLayout(layout4);
	    	        layout4.setHorizontalGroup(
	    	        		layout4.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addGroup(layout4.createSequentialGroup()
	    	                .addGap(1, 1, 1)
	    	                .addGroup(layout4.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout4.createSequentialGroup()
	    	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
	    	                        .addComponent(pan4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    	                        .addGap(23, 23, 23)
	    	                        .addComponent(pan1))
	    	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout4.createSequentialGroup()
	    	                        .addGap(7, 7, 7)
	    	                        .addComponent(pan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
	    	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	    	                .addComponent(pan3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    	        );
	    	        layout4.setVerticalGroup(
	    	        		layout4.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout4.createSequentialGroup()
	    	                .addGroup(layout4.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	    	                    .addComponent(pan3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    	                    .addGroup(layout4.createSequentialGroup()
	    	                        .addGap(16, 16, 16)
	    	                        .addComponent(pan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    	                        .addGap(11, 11, 11)
	    	                        .addGroup(layout4.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	    	                            .addComponent(pan1)
	    	                            .addGroup(layout4.createSequentialGroup()
	    	                                .addComponent(pan4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    	                                .addGap(7, 7, 7)))))
	    	                .addGap(49, 49, 49))
	    	        );
	    	         pack();
	    	}



		
	    
	    public void createThree() {
	    	jScrollPane1 = new javax.swing.JScrollPane();
	        jTable1 = new javax.swing.JTable();
	        jPanel1 = new javax.swing.JPanel();
	        jPanel2 = new javax.swing.JPanel();
	        x0_y0 = new javax.swing.JButton();
	        jPanel3 = new javax.swing.JPanel();
	        x0_y1 = new javax.swing.JButton();
	        jPanel4 = new javax.swing.JPanel();
	        x0_y2 = new javax.swing.JButton();
	        jPanel5 = new javax.swing.JPanel();
	        x1_y0 = new javax.swing.JButton();
	        jPanel6 = new javax.swing.JPanel();
	        x2_y0 = new javax.swing.JButton();
	        jPanel7 = new javax.swing.JPanel();
	        x1_y1 = new javax.swing.JButton();
	        jPanel8 = new javax.swing.JPanel();
	        jPanel9 = new javax.swing.JPanel();
	        x1_y2 = new javax.swing.JButton();
	        jPanel10 = new javax.swing.JPanel();
	        x2_y1 = new javax.swing.JButton();
	        jPanel11 = new javax.swing.JPanel();
	        x2_y2 = new javax.swing.JButton();
	        jPanel12 = new javax.swing.JPanel();
	        jLabel1 = new javax.swing.JLabel();
	        CURR_TURN_label = new javax.swing.JLabel();
	        CurrentTurn = new javax.swing.JLabel();
	        jPanel13 = new javax.swing.JPanel();
	        ResetGame = new javax.swing.JButton();
	        MoveSuggestion = new javax.swing.JButton();
	        ChoosePieceType = new javax.swing.JComboBox();
	        CHOOSE_label = new javax.swing.JLabel();
	        StartGame = new javax.swing.JButton();
	        BackToMainMenu = new javax.swing.JButton();
	        jPanel14 = new javax.swing.JPanel();
	        SCORE_label = new javax.swing.JLabel();
	        YOU_label = new javax.swing.JLabel();
	        OPPONENT_label = new javax.swing.JLabel();
	        PlayerScore = new javax.swing.JLabel();
	        OpponentScore = new javax.swing.JLabel();

	        jTable1.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {
	                {null, null, null, null},
	                {null, null, null, null},
	                {null, null, null, null},
	                {null, null, null, null}
	            },
	            new String [] {
	                "Title 1", "Title 2", "Title 3", "Title 4"
	            }
	        ));
	        jScrollPane1.setViewportView(jTable1);

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setTitle("TIC TAC TOE");

	        jPanel2.setBackground(new java.awt.Color(254, 254, 254));
	        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

	        x0_y0.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
	        x0_y0.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
	        x0_y0.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                x0_y0ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
	        jPanel2.setLayout(jPanel2Layout);
	        jPanel2Layout.setHorizontalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(x0_y0, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	        );
	        jPanel2Layout.setVerticalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addComponent(x0_y0, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(0, 0, Short.MAX_VALUE))
	        );

	        jPanel3.setBackground(new java.awt.Color(254, 254, 254));
	        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

	        x0_y1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
	        x0_y1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                x0_y1ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
	        jPanel3.setLayout(jPanel3Layout);
	        jPanel3Layout.setHorizontalGroup(
	            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(x0_y1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	        );
	        jPanel3Layout.setVerticalGroup(
	            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(x0_y1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	        );

	        jPanel4.setBackground(new java.awt.Color(252, 252, 252));
	        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));

	        x0_y2.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
	        x0_y2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                x0_y2ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
	        jPanel4.setLayout(jPanel4Layout);
	        jPanel4Layout.setHorizontalGroup(
	            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(x0_y2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	        );
	        jPanel4Layout.setVerticalGroup(
	            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(x0_y2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );

	        jPanel5.setBackground(new java.awt.Color(254, 252, 250));
	        jPanel5.setBorder(new javax.swing.border.MatteBorder(null));

	        x1_y0.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
	        x1_y0.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                x1_y0ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
	        jPanel5.setLayout(jPanel5Layout);
	        jPanel5Layout.setHorizontalGroup(
	            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(x1_y0, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	        );
	        jPanel5Layout.setVerticalGroup(
	            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(x1_y0, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	        );

	        jPanel6.setBackground(new java.awt.Color(253, 251, 250));
	        jPanel6.setBorder(new javax.swing.border.MatteBorder(null));

	        x2_y0.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
	        x2_y0.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                x2_y0ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
	        jPanel6.setLayout(jPanel6Layout);
	        jPanel6Layout.setHorizontalGroup(
	            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(x2_y0, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	        );
	        jPanel6Layout.setVerticalGroup(
	            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(x2_y0, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	        );

	        jPanel7.setBackground(new java.awt.Color(254, 252, 250));
	        jPanel7.setBorder(new javax.swing.border.MatteBorder(null));

	        x1_y1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
	        x1_y1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                x1_y1ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
	        jPanel7.setLayout(jPanel7Layout);
	        jPanel7Layout.setHorizontalGroup(
	            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(x1_y1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	        );
	        jPanel7Layout.setVerticalGroup(
	            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(x1_y1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	        );

	        jPanel9.setBackground(new java.awt.Color(251, 250, 248));
	        jPanel9.setBorder(new javax.swing.border.MatteBorder(null));

	        x1_y2.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
	        x1_y2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                x1_y2ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
	        jPanel9.setLayout(jPanel9Layout);
	        jPanel9Layout.setHorizontalGroup(
	            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(x1_y2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	        );
	        jPanel9Layout.setVerticalGroup(
	            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(x1_y2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	        );

	        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
	        jPanel8.setLayout(jPanel8Layout);
	        jPanel8Layout.setHorizontalGroup(
	            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel8Layout.createSequentialGroup()
	                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(0, 24, Short.MAX_VALUE))
	        );
	        jPanel8Layout.setVerticalGroup(
	            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
	                .addGap(0, 0, Short.MAX_VALUE)
	                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	        );

	        jPanel10.setBackground(new java.awt.Color(251, 250, 248));
	        jPanel10.setBorder(new javax.swing.border.MatteBorder(null));

	        x2_y1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
	        x2_y1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                x2_y1ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
	        jPanel10.setLayout(jPanel10Layout);
	        jPanel10Layout.setHorizontalGroup(
	            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(x2_y1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	        );
	        jPanel10Layout.setVerticalGroup(
	            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(x2_y1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	        );

	        jPanel11.setBackground(new java.awt.Color(250, 248, 246));
	        jPanel11.setBorder(new javax.swing.border.MatteBorder(null));

	        x2_y2.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
	        x2_y2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                x2_y2ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
	        jPanel11.setLayout(jPanel11Layout);
	        jPanel11Layout.setHorizontalGroup(
	            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(x2_y2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	        );
	        jPanel11Layout.setVerticalGroup(
	            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(x2_y2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
	        );

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(0, 0, 0)
	                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(0, 0, 0)
	                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(0, 0, 0)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(0, 0, 0)
	                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(0, 0, 0)
	                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
	                .addGap(0, 0, 0)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(0, 0, 0)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
	        );

	        CURR_TURN_label.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
	        CURR_TURN_label.setText("Current Turn : ");

	        CurrentTurn.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
	        CurrentTurn.setText("Opponent");

	        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
	        jPanel12.setLayout(jPanel12Layout);
	        jPanel12Layout.setHorizontalGroup(
	            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel12Layout.createSequentialGroup()
	                .addContainerGap(85, Short.MAX_VALUE)
	                .addComponent(CURR_TURN_label)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(CurrentTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(jLabel1)
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        jPanel12Layout.setVerticalGroup(
	            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel12Layout.createSequentialGroup()
	                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel12Layout.createSequentialGroup()
	                        .addGap(44, 44, 44)
	                        .addComponent(jLabel1))
	                    .addGroup(jPanel12Layout.createSequentialGroup()
	                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(CURR_TURN_label, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(CurrentTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        ResetGame.setText("Reset game");
	        ResetGame.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                ResetGameActionPerformed(evt);
	            }
	        });

	        MoveSuggestion.setBackground(new java.awt.Color(130, 130, 112));
	        MoveSuggestion.setText("Suggest a MOVE");
	        MoveSuggestion.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                MoveSuggestionActionPerformed(evt);
	            }
	        });

	        ChoosePieceType.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
	        ChoosePieceType.setMaximumRowCount(2);
	        ChoosePieceType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O", "X" }));
	        ChoosePieceType.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                ChoosePieceTypeActionPerformed(evt);
	            }
	        });

	        CHOOSE_label.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
	        CHOOSE_label.setText("Choose X or O  :");

	        StartGame.setText("Start game");
	        StartGame.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                StartGameActionPerformed(evt);
	            }
	        });

	        BackToMainMenu.setText("Back to Main Menu");
	        BackToMainMenu.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                BackToMainMenuActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
	        jPanel13.setLayout(jPanel13Layout);
	        jPanel13Layout.setHorizontalGroup(
	            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
	                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addGroup(jPanel13Layout.createSequentialGroup()
	                        .addGap(37, 37, 37)
	                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(MoveSuggestion, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(ResetGame, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(StartGame, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(BackToMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGap(0, 0, Short.MAX_VALUE))
	                    .addGroup(jPanel13Layout.createSequentialGroup()
	                        .addGap(0, 0, Short.MAX_VALUE)
	                        .addComponent(CHOOSE_label, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(18, 18, 18)
	                        .addComponent(ChoosePieceType, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addContainerGap(15, Short.MAX_VALUE))
	        );
	        jPanel13Layout.setVerticalGroup(
	            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel13Layout.createSequentialGroup()
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(CHOOSE_label, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(ChoosePieceType, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(67, 67, 67)
	                .addComponent(StartGame, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addComponent(ResetGame, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addComponent(MoveSuggestion, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addComponent(BackToMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        SCORE_label.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
	        SCORE_label.setText("SCORE");

	        YOU_label.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
	        YOU_label.setForeground(new java.awt.Color(51, 111, 44));
	        YOU_label.setText("    YOU   :");

	        OPPONENT_label.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
	        OPPONENT_label.setForeground(new java.awt.Color(240, 84, 84));
	        OPPONENT_label.setText("Opponent : ");

	        PlayerScore.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
	        PlayerScore.setForeground(new java.awt.Color(0, 185, 0));
	        PlayerScore.setText("0");

	        OpponentScore.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
	        OpponentScore.setForeground(new java.awt.Color(215, 73, 73));
	        OpponentScore.setText("0");

	        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
	        jPanel14.setLayout(jPanel14Layout);
	        jPanel14Layout.setHorizontalGroup(
	            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel14Layout.createSequentialGroup()
	                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel14Layout.createSequentialGroup()
	                        .addGap(23, 23, 23)
	                        .addComponent(SCORE_label))
	                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                        .addGroup(jPanel14Layout.createSequentialGroup()
	                            .addComponent(YOU_label, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(PlayerScore, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addGroup(jPanel14Layout.createSequentialGroup()
	                            .addContainerGap()
	                            .addComponent(OPPONENT_label)
	                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                            .addComponent(OpponentScore, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                .addContainerGap(23, Short.MAX_VALUE))
	        );
	        jPanel14Layout.setVerticalGroup(
	            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel14Layout.createSequentialGroup()
	                .addGap(26, 26, 26)
	                .addComponent(SCORE_label, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(30, 30, 30)
	                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(YOU_label, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(PlayerScore, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(20, 20, 20)
	                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(OPPONENT_label, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(OpponentScore, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        javax.swing.GroupLayout layout3 = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout3);
	        layout3.setHorizontalGroup(
	            layout3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout3.createSequentialGroup()
	                .addGap(1, 1, 1)
	                .addGroup(layout3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout3.createSequentialGroup()
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
	                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addGap(23, 23, 23)
	                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout3.createSequentialGroup()
	                        .addGap(7, 7, 7)
	                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        layout3.setVerticalGroup(
	            layout3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout3.createSequentialGroup()
	                .addGroup(layout3.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addGroup(layout3.createSequentialGroup()
	                        .addGap(16, 16, 16)
	                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addGap(11, 11, 11)
	                        .addGroup(layout3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addGroup(layout3.createSequentialGroup()
	                                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addGap(7, 7, 7)))))
	                .addGap(49, 49, 49))
	        );

	        pack();
	    }

	    	
	    private void bPlayer1_Move() {

	        int[] bestMove = new int[3];
	        if (IsGameRunning) {

	            

	                if (MainMenu.getEngine().get_IsPlayer1Turn()) {

	                    bestMove = MainMenu.getEngine().findBestMove();

	                    if (bestMove[2] == -1) {
	                         SoundEffect.DRAW.play();
	                        System.out.println("Game Draw");
	                        JOptionPane.showMessageDialog(frame,
	                                "egualité");
	                        IsGameRunning = false;
	                    } else {

	                        if (bestMove[0] == 0 && bestMove[1] == 0) {
	                            MainMenu.getEngine().board.game_board[0][0] = MainMenu.getEngine().player1.get_piece_type();
	                            bx0_y0.setText(MainMenu.getEngine().player1.get_piece_type().toString());

	                        }

	                        if (bestMove[0] == 1 && bestMove[1] == 0) {
	                            MainMenu.getEngine().board.game_board[1][0] = MainMenu.getEngine().player1.get_piece_type();
	                            bx1_y0.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                        }

	                        if (bestMove[0] == 2 && bestMove[1] == 0) {
	                            MainMenu.getEngine().board.game_board[2][0] = MainMenu.getEngine().player1.get_piece_type();
	                            bx2_y0.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                        }
	                        
	                        if (bestMove[0] == 3 && bestMove[1] == 0) {
	                            MainMenu.getEngine().board.game_board[0][0] = MainMenu.getEngine().player1.get_piece_type();
	                            bx3_y0.setText(MainMenu.getEngine().player1.get_piece_type().toString());

	                        }
	                        
	                        if (bestMove[0] == 0 && bestMove[1] == 1) {
	                            MainMenu.getEngine().board.game_board[0][1] = MainMenu.getEngine().player1.get_piece_type();
	                            bx0_y1.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                        }

	                        if (bestMove[0] == 1 && bestMove[1] == 1) {
	                            MainMenu.getEngine().board.game_board[1][1] = MainMenu.getEngine().player1.get_piece_type();
	                            bx1_y1.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                        }

	                        if (bestMove[0] == 2 && bestMove[1] == 1) {
	                            MainMenu.getEngine().board.game_board[2][1] = MainMenu.getEngine().player1.get_piece_type();
	                            bx2_y1.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                        }

	                        if (bestMove[0] == 3 && bestMove[1] == 1) {
	                            MainMenu.getEngine().board.game_board[0][0] = MainMenu.getEngine().player1.get_piece_type();
	                            bx3_y1.setText(MainMenu.getEngine().player1.get_piece_type().toString());

	                        }
	                        
	                        if (bestMove[0] == 0 && bestMove[1] == 2) {
	                            MainMenu.getEngine().board.game_board[0][2] = MainMenu.getEngine().player1.get_piece_type();
	                            bx0_y2.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                        }

	                        if (bestMove[0] == 1 && bestMove[1] == 2) {
	                            MainMenu.getEngine().board.game_board[1][2] = MainMenu.getEngine().player1.get_piece_type();
	                            bx1_y2.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                        }

	                        if (bestMove[0] == 2 && bestMove[1] == 2) {
	                            MainMenu.getEngine().board.game_board[2][2] = MainMenu.getEngine().player1.get_piece_type();
	                            bx2_y2.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                        }
	                        if (bestMove[0] == 3 && bestMove[1] == 2) {
	                            MainMenu.getEngine().board.game_board[0][0] = MainMenu.getEngine().player1.get_piece_type();
	                            bx3_y2.setText(MainMenu.getEngine().player1.get_piece_type().toString());

	                        }
	                        if (bestMove[0] == 0 && bestMove[1] == 3) {
	                            MainMenu.getEngine().board.game_board[0][2] = MainMenu.getEngine().player1.get_piece_type();
	                            bx0_y3.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                        }

	                        if (bestMove[0] == 1 && bestMove[1] == 3) {
	                            MainMenu.getEngine().board.game_board[1][2] = MainMenu.getEngine().player1.get_piece_type();
	                            bx1_y3.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                        }

	                        if (bestMove[0] == 2 && bestMove[1] == 3) {
	                            MainMenu.getEngine().board.game_board[2][2] = MainMenu.getEngine().player1.get_piece_type();
	                            bx2_y3.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                        }
	                        if (bestMove[0] == 3 && bestMove[1] == 3) {
	                            MainMenu.getEngine().board.game_board[0][0] = MainMenu.getEngine().player1.get_piece_type();
	                            bx3_y3.setText(MainMenu.getEngine().player1.get_piece_type().toString());

	                        }
	                        
	                        bSetPlayer2Turn();
	                        curr_score = MainMenu.getEngine().evaluate_score(0);
	                        if (curr_score > 0) {
	                            System.out.println("Player1 Wins");
	                            HighlightWinningOrLoosing();
	                            MainMenu.getEngine().player1.increment_total_wins();
	                            opponent.setText(Integer.toString(MainMenu.getEngine().player1.get_total_wins()));
	                            IsGameRunning = false;
	                            MainMenu.getEngine().board.printBoard();
	                            SoundEffect.LOSING.play();
	                            JOptionPane.showMessageDialog(frame,
	                                    "vous avez perdu");
	                            SoundEffect.LOSING.stop();
	                      

	                        } else if (curr_score < 0) {
	                            System.out.println("Player1 looses");
	                            IsGameRunning = false;
	                            JOptionPane.showMessageDialog(frame,
	                                    "vous avez gagné");
	                       

	                        }
	                        if (!MainMenu.getEngine().IsMoveLeft()) {
	                             SoundEffect.DRAW.play();
	                            JOptionPane.showMessageDialog(frame, "egualite");
	                            IsGameRunning = false;
	                        
	                           
	                        }
	                    }

	                }

	            
	        }
	        System.out.println("Done");
	    }
	    
	    private void bx0_y3ActionPerformed(java.awt.event.ActionEvent evt) {
	        // TODO add your handling code here:
	        SoundEffect.BUTTONCLICK.play();
	        if (IsGameRunning) {
	            if (bx0_y3.getText().isEmpty()) {
	                

	                    MainMenu.getEngine().board.game_board[0][3] = MainMenu.getEngine().player2.get_piece_type();
	                    bx0_y3.setText(MainMenu.getEngine().player2.get_piece_type().toString());

	                    bPlayer2_Move();
	                    bPlayer1_Move();
	                
	            }
	        }
	    }
	    
	    private void bx1_y3ActionPerformed(java.awt.event.ActionEvent evt) {
	        // TODO add your handling code here:
	        SoundEffect.BUTTONCLICK.play();
	        if (IsGameRunning) {
	            if (bx1_y3.getText().isEmpty()) {
	                    MainMenu.getEngine().board.game_board[1][3] = MainMenu.getEngine().player2.get_piece_type();
	                    bx1_y3.setText(MainMenu.getEngine().player2.get_piece_type().toString());

	                    bPlayer2_Move();
	                    bPlayer1_Move();
	                
	            }
	        }
	    }
	    
	    private void bx2_y3ActionPerformed(java.awt.event.ActionEvent evt) {
	        // TODO add your handling code here:
	        SoundEffect.BUTTONCLICK.play();
	        if (IsGameRunning) {
	            if (bx2_y3.getText().isEmpty()) {
	                

	                    MainMenu.getEngine().board.game_board[2][3] = MainMenu.getEngine().player2.get_piece_type();
	                    bx2_y3.setText(MainMenu.getEngine().player2.get_piece_type().toString());

	                    bPlayer2_Move();
	                    bPlayer1_Move();
	                
	            }
	        }
	    }

	    private void bx3_y3ActionPerformed(java.awt.event.ActionEvent evt) {
	        // TODO add your handling code here:
	        SoundEffect.BUTTONCLICK.play();
	        if (IsGameRunning) {
	            if (bx3_y3.getText().isEmpty()) {
	                

	                    MainMenu.getEngine().board.game_board[3][3] = MainMenu.getEngine().player2.get_piece_type();
	                    bx3_y3.setText(MainMenu.getEngine().player2.get_piece_type().toString());

	                    bPlayer2_Move();
	                    bPlayer1_Move();
	                
	            }
	        }
	    }

	    private void bx3_y2ActionPerformed(java.awt.event.ActionEvent evt) {
	        // TODO add your handling code here:
	        SoundEffect.BUTTONCLICK.play();
	        if (IsGameRunning) {
	            if (bx3_y2.getText().isEmpty()) {
	                

	                    MainMenu.getEngine().board.game_board[3][2] = MainMenu.getEngine().player2.get_piece_type();
	                    bx3_y2.setText(MainMenu.getEngine().player2.get_piece_type().toString());

	                    bPlayer2_Move();
	                    bPlayer1_Move();
	                
	            }
	        }
	    }
	
	    private void bx3_y1ActionPerformed(java.awt.event.ActionEvent evt) {
	        // TODO add your handling code here:
	        SoundEffect.BUTTONCLICK.play();
	        if (IsGameRunning) {
	            if (bx3_y1.getText().isEmpty()) {
	                

	                    MainMenu.getEngine().board.game_board[3][1] = MainMenu.getEngine().player2.get_piece_type();
	                    bx3_y1.setText(MainMenu.getEngine().player2.get_piece_type().toString());

	                    bPlayer2_Move();
	                    bPlayer1_Move();
	                }
	            
	        }
	    }
	    
	    private void bx3_y0ActionPerformed(java.awt.event.ActionEvent evt) {
	        // TODO add your handling code here:
	        SoundEffect.BUTTONCLICK.play();
	        if (IsGameRunning) {
	            if (bx3_y0.getText().isEmpty()) {
	                

	                    MainMenu.getEngine().board.game_board[3][0] = MainMenu.getEngine().player2.get_piece_type();
	                    bx3_y0.setText(MainMenu.getEngine().player2.get_piece_type().toString());

	                    bPlayer2_Move();
	                    bPlayer1_Move();
	                }
	            
	        }
	    }

	    private void bx1_y1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1_y1ActionPerformed
	        // TODO add your handling code here:
	        SoundEffect.BUTTONCLICK.play();
	        if (IsGameRunning) {
	            if (bx1_y1.getText().isEmpty()) {
	               
	                
	                
	                    MainMenu.getEngine().board.game_board[1][1] = MainMenu.getEngine().player2.get_piece_type();
	                    bx1_y1.setText(MainMenu.getEngine().player2.get_piece_type().toString());
	                    bPlayer2_Move();
	                    bPlayer1_Move();
	                
	            }
	        }
	    }

	    private void bx0_y0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x0_y0ActionPerformed
	        // TODO add your handling code here:
	        SoundEffect.BUTTONCLICK.play();
	        if (IsGameRunning) {
	            if (bx0_y0.getText().isEmpty()) {
	               
	                    MainMenu.getEngine().board.game_board[0][0] = MainMenu.getEngine().player2.get_piece_type();
	                    bx0_y0.setText(MainMenu.getEngine().player2.get_piece_type().toString());

	                    bPlayer2_Move();
	                    bPlayer1_Move();

	                
	            }
	        }
	    }
	    
	    private void bx2_y2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2_y2ActionPerformed
	        // TODO add your handling code here:
	        SoundEffect.BUTTONCLICK.play();
	        if (IsGameRunning) {
	            if (bx2_y2.getText().isEmpty()) {
	                

	                    MainMenu.getEngine().board.game_board[2][2] = MainMenu.getEngine().player2.get_piece_type();
	                    bx2_y2.setText(MainMenu.getEngine().player2.get_piece_type().toString());

	                    bPlayer2_Move();
	                    bPlayer1_Move();
	                }
	            
	        }
	    }
	    
	    private void bx0_y1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x0_y1ActionPerformed
	        // TODO add your handling code here:
	        SoundEffect.BUTTONCLICK.play();
	        if (IsGameRunning) {
	            if (bx0_y1.getText().isEmpty()) {
	               
	                    MainMenu.getEngine().board.game_board[0][1] = MainMenu.getEngine().player2.get_piece_type();
	                    bx0_y1.setText(MainMenu.getEngine().player2.get_piece_type().toString());

	                    bPlayer2_Move();
	                    bPlayer1_Move();
	                
	            }
	        }
	    }
	    
	    private void bx1_y0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1_y0ActionPerformed
	        // TODO add your handling code here:
	        SoundEffect.BUTTONCLICK.play();
	        if (IsGameRunning) {
	            if (bx1_y0.getText().isEmpty()) {
	               
	                    MainMenu.getEngine().board.game_board[1][0] = MainMenu.getEngine().player2.get_piece_type();
	                    bx1_y0.setText(MainMenu.getEngine().player2.get_piece_type().toString());

	                    bPlayer2_Move();
	                    bPlayer1_Move();
	                
	            }
	        }
	    }
	    
	    private void bx0_y2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x0_y2ActionPerformed
	        // TODO add your handling code here:
	        SoundEffect.BUTTONCLICK.play();
	        if (IsGameRunning) {
	            if (bx0_y2.getText().isEmpty()) {
	                
	                    MainMenu.getEngine().board.game_board[0][2] = MainMenu.getEngine().player2.get_piece_type();
	                    bx0_y2.setText(MainMenu.getEngine().player2.get_piece_type().toString());

	                    bPlayer2_Move();
	                    bPlayer1_Move();
	                }
	            
	        }
	    }
	    
	    private void bx1_y2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1_y2ActionPerformed
	        // TODO add your handling code here:
	        SoundEffect.BUTTONCLICK.play();
	        if (IsGameRunning) {
	            if (bx1_y2.getText().isEmpty()) {
	                
	                    MainMenu.getEngine().board.game_board[1][2] = MainMenu.getEngine().player2.get_piece_type();
	                    bx1_y2.setText(MainMenu.getEngine().player2.get_piece_type().toString());

	                    bPlayer2_Move();
	                    bPlayer1_Move();
	                
	            }
	        }
	    }//GEN-LAST:event_x1_y2ActionPerformed

	    private void bx2_y0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2_y0ActionPerformed
	        // TODO add your handling code here:
	        SoundEffect.BUTTONCLICK.play();
	        if (IsGameRunning) {
	            if (bx2_y0.getText().isEmpty()) {
	                
	                    MainMenu.getEngine().board.game_board[2][0] = MainMenu.getEngine().player2.get_piece_type();
	                    bx2_y0.setText(MainMenu.getEngine().player2.get_piece_type().toString());

	                    bPlayer2_Move();
	                    bPlayer1_Move();
	                
	            }
	        }
	    }//GEN-LAST:event_x2_y0ActionPerformed

	    private void bx2_y1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2_y1ActionPerformed
	        // TODO add your handling code here:
	        SoundEffect.BUTTONCLICK.play();
	        if (IsGameRunning) {
	            if (bx2_y1.getText().isEmpty()) {
	                if (MainMenu.get_IsTwoPlayerGame()) {
	                    if (MainMenu.getEngine().get_IsPlayer1Turn()) {
	                        MainMenu.getEngine().board.game_board[2][1] = MainMenu.getEngine().player1.get_piece_type();
	                        bx2_y1.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                        bPlayer1_Move();
	                    }
	                    
	                    else {
	                        MainMenu.getEngine().board.game_board[2][1] = MainMenu.getEngine().player2.get_piece_type();
	                        bx2_y1.setText(MainMenu.getEngine().player2.get_piece_type().toString());
	                        bPlayer2_Move();
	                    }
	                } 
	                
	                else {
	                    MainMenu.getEngine().board.game_board[2][1] = MainMenu.getEngine().player2.get_piece_type();
	                    bx2_y1.setText(MainMenu.getEngine().player2.get_piece_type().toString());

	                    bPlayer2_Move();
	                    bPlayer1_Move();
	                }
	            }
	        }
	    }//GEN-LAST:event_x2_y1ActionPerformed

	    private void bStartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartGameActionPerformed
	        // TODO Sounadd your handling code here:
	    	
	        if(!IsGameRunning){
	            bResetboard();
	            SoundEffect.START.play();
	            if (gamecount % 2 == 0) {
	                bSetPlayer2Turn();
	            } else {
	                bSetPlayer1Turn();
	            }

	            IsGameRunning = true;
	            if (!MainMenu.get_IsTwoPlayerGame() && MainMenu.getEngine().get_IsPlayer1Turn()) {
	               //MainMenu.getEngine().board.game_board[0][0] = MainMenu.getEngine().player1.get_piece_type();
	               
	              // bx0_y0.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	               bSetPlayer2Turn();
	            }
	            gamecount++;
	        }
	        else{
	            JOptionPane.showMessageDialog(frame,"jeu en cours .reset si vous voulez abandonne");
	        }
	    }
	    
	    
	    private void x1_y1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1_y1ActionPerformed
	        // TODO add your handling code here:
	        SoundEffect.BUTTONCLICK.play();
	        if (IsGameRunning) {
	            if (x1_y1.getText().isEmpty()) {
	                if (MainMenu.get_IsTwoPlayerGame()) {
	                    if (MainMenu.getEngine().get_IsPlayer1Turn()) {
	                        MainMenu.getEngine().board.game_board[1][1] = MainMenu.getEngine().player1.get_piece_type();
	                        x1_y1.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                         
	                        Player1_Move();
	                    } 
	                    else {
	                        MainMenu.getEngine().board.game_board[1][1] = MainMenu.getEngine().player2.get_piece_type();
	                        x1_y1.setText(MainMenu.getEngine().player2.get_piece_type().toString());
	                         Player2_Move();
	                    
	                    }
	                } 
	                
	                else {
	                    MainMenu.getEngine().board.game_board[1][1] = MainMenu.getEngine().player2.get_piece_type();
	                    x1_y1.setText(MainMenu.getEngine().player2.get_piece_type().toString());
	                    Player2_Move();
	                    Player1_Move();
	                }
	            }
	        }
	    }//GEN-LAST:event_x1_y1ActionPerformed

	    private void x0_y0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x0_y0ActionPerformed
	        // TODO add your handling code here:
	        SoundEffect.BUTTONCLICK.play();
	        if (IsGameRunning) {
	            if (x0_y0.getText().isEmpty()) {
	                if (MainMenu.get_IsTwoPlayerGame()) {
	                    if (MainMenu.getEngine().get_IsPlayer1Turn()) {
	                        MainMenu.getEngine().board.game_board[0][0] = MainMenu.getEngine().player1.get_piece_type();
	                        x0_y0.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                        Player1_Move();
	                    }
	                    
	                    else {
	                        MainMenu.getEngine().board.game_board[0][0] = MainMenu.getEngine().player2.get_piece_type();
	                        x0_y0.setText(MainMenu.getEngine().player2.get_piece_type().toString());
	                        Player2_Move();
	                    }
	                } else {
	                    MainMenu.getEngine().board.game_board[0][0] = MainMenu.getEngine().player2.get_piece_type();
	                    x0_y0.setText(MainMenu.getEngine().player2.get_piece_type().toString());

	                    Player2_Move();
	                    Player1_Move();

	                }
	            }
	        }
	    }//GEN-LAST:event_x0_y0ActionPerformed

	    private void x2_y2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2_y2ActionPerformed
	        // TODO add your handling code here:
	        SoundEffect.BUTTONCLICK.play();
	        if (IsGameRunning) {
	            if (x2_y2.getText().isEmpty()) {
	                if (MainMenu.get_IsTwoPlayerGame()) {

	                    if (MainMenu.getEngine().get_IsPlayer1Turn()) {
	                        MainMenu.getEngine().board.game_board[2][2] = MainMenu.getEngine().player1.get_piece_type();
	                        x2_y2.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                        Player1_Move();
	                    } 
	                    else {
	                        MainMenu.getEngine().board.game_board[2][2] = MainMenu.getEngine().player2.get_piece_type();
	                        x2_y2.setText(MainMenu.getEngine().player2.get_piece_type().toString());
	                        Player2_Move();
	                    }
	                } 
	                
	                else {

	                    MainMenu.getEngine().board.game_board[2][2] = MainMenu.getEngine().player2.get_piece_type();
	                    x2_y2.setText(MainMenu.getEngine().player2.get_piece_type().toString());

	                    Player2_Move();
	                    Player1_Move();
	                }
	            }
	        }
	    }//GEN-LAST:event_x2_y2ActionPerformed

	    private void x0_y1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x0_y1ActionPerformed
	        // TODO add your handling code here:
	        SoundEffect.BUTTONCLICK.play();
	        if (IsGameRunning) {
	            if (x0_y1.getText().isEmpty()) {
	                if (MainMenu.get_IsTwoPlayerGame()) {
	                    if (MainMenu.getEngine().get_IsPlayer1Turn()) {
	                        MainMenu.getEngine().board.game_board[0][1] = MainMenu.getEngine().player1.get_piece_type();
	                        x0_y1.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                        Player1_Move();
	                    } 
	                    
	                    else {
	                        MainMenu.getEngine().board.game_board[0][1] = MainMenu.getEngine().player2.get_piece_type();
	                        x0_y1.setText(MainMenu.getEngine().player2.get_piece_type().toString());
	                        Player2_Move();
	                    }
	                } 
	                
	                else {
	                    MainMenu.getEngine().board.game_board[0][1] = MainMenu.getEngine().player2.get_piece_type();
	                    x0_y1.setText(MainMenu.getEngine().player2.get_piece_type().toString());

	                    Player2_Move();
	                    Player1_Move();
	                }
	            }
	        }
	    }//GEN-LAST:event_x0_y1ActionPerformed

	    private void ResetGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetGameActionPerformed
	        // TODO add your handling code here:
	        SoundEffect.CLICK.play();
	        if(MainMenu.getEngine().board.get_no_of_rows()==3){
	        	Resetboard();
        	}
	        if(MainMenu.getEngine().board.get_no_of_rows()==4){
	        	bResetboard();
        	}
	        
	        
	        IsGameRunning = false;
	        

	    }//GEN-LAST:event_ResetGameActionPerformed

	    private void ChoosePieceTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoosePieceTypeActionPerformed
	        // TODO add your handling code here:

	        String piece_type = ChoosePieceType.getSelectedItem().toString();
	        if (!IsGameRunning) {
	            if (piece_type.equalsIgnoreCase("X")) {
	                MainMenu.getEngine().player2.set_piece_type(pieces.X);
	                MainMenu.getEngine().player1.set_piece_type(pieces.O);
	            } else {
	                MainMenu.getEngine().player2.set_piece_type(pieces.O);
	                MainMenu.getEngine().player1.set_piece_type(pieces.X);
	            }
	        } else {
	            SoundEffect.WARNING.play();
	            JOptionPane.showMessageDialog(frame,
	                    "Don't Hurry Game is in progress , Please Reset game to change",
	                    "Changing Piece Type while Game is in Progress",
	                    JOptionPane.WARNING_MESSAGE);

	            ChoosePieceType.setSelectedItem(MainMenu.getEngine().player2.get_piece_type().toString());

	        }
	    }//GEN-LAST:event_ChoosePieceTypeActionPerformed

	    private void BackToMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMainMenuActionPerformed
	        // TODO add your handling code here:
	        
	        JOptionPane optionPane = new JOptionPane(
	                "You Will lost all your game progress\n"
	                + "Would you like to continue.\n",
	                JOptionPane.QUESTION_MESSAGE,
	                JOptionPane.YES_NO_OPTION);

	        JDialog dialog = optionPane.createDialog(new JFrame(), "Resetting Game");
	        SoundEffect.WARNING.play();
	        dialog.setVisible(true);
	        
	        if (optionPane.getValue().toString().equals("0")) {
	        	if(MainMenu.getEngine().board.get_no_of_rows()==3){
	        		Resetboard();
		            ResetScore();
	        	}
	        	if(MainMenu.getEngine().board.get_no_of_rows()==4){
	        		bResetboard();
		            bResetScore();
	        	}
	            
	            IsGameRunning = false;
	            setVisible(false);
	            this.setContentPane(new javax.swing.JPanel());
	            MainMenu.setVisible(true);
	            
	            

	        }


	    }//GEN-LAST:event_BackToMainMenuActionPerformed

	    public javax.swing.JPanel getjPanel14() {
			return jPanel14;
		}


		public void setjPanel14(javax.swing.JPanel jPanel14) {
			this.jPanel14 = jPanel14;
		}


		private void x1_y0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1_y0ActionPerformed
	        // TODO add your handling code here:
	        SoundEffect.BUTTONCLICK.play();
	        if (IsGameRunning) {
	            if (x1_y0.getText().isEmpty()) {
	                if (MainMenu.get_IsTwoPlayerGame()) {
	                    if (MainMenu.getEngine().get_IsPlayer1Turn()) {
	                        MainMenu.getEngine().board.game_board[1][0] = MainMenu.getEngine().player1.get_piece_type();
	                        x1_y0.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                        Player1_Move();
	                    } 
	                    
	                    else {
	                        MainMenu.getEngine().board.game_board[1][0] = MainMenu.getEngine().player2.get_piece_type();
	                        x1_y0.setText(MainMenu.getEngine().player2.get_piece_type().toString());
	                        Player2_Move();
	                    }
	                }
	                
	                else {
	                    MainMenu.getEngine().board.game_board[1][0] = MainMenu.getEngine().player2.get_piece_type();
	                    x1_y0.setText(MainMenu.getEngine().player2.get_piece_type().toString());

	                    Player2_Move();
	                    Player1_Move();
	                }
	            }
	        }
	    }//GEN-LAST:event_x1_y0ActionPerformed

	    private void x0_y2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x0_y2ActionPerformed
	        // TODO add your handling code here:
	        SoundEffect.BUTTONCLICK.play();
	        if (IsGameRunning) {
	            if (x0_y2.getText().isEmpty()) {
	                if (MainMenu.get_IsTwoPlayerGame()) {
	                    if (MainMenu.getEngine().get_IsPlayer1Turn()) {
	                        MainMenu.getEngine().board.game_board[0][2] = MainMenu.getEngine().player1.get_piece_type();
	                        x0_y2.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                        Player1_Move();
	                    }
	                    
	                    else {
	                        MainMenu.getEngine().board.game_board[0][2] = MainMenu.getEngine().player2.get_piece_type();
	                        x0_y2.setText(MainMenu.getEngine().player2.get_piece_type().toString());
	                        Player2_Move();
	                    }
	                } 
	                
	                else {
	                    MainMenu.getEngine().board.game_board[0][2] = MainMenu.getEngine().player2.get_piece_type();
	                    x0_y2.setText(MainMenu.getEngine().player2.get_piece_type().toString());

	                    Player2_Move();
	                    Player1_Move();
	                }
	            }
	        }
	    }//GEN-LAST:event_x0_y2ActionPerformed

	    private void x1_y2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1_y2ActionPerformed
	        // TODO add your handling code here:
	        SoundEffect.BUTTONCLICK.play();
	        if (IsGameRunning) {
	            if (x1_y2.getText().isEmpty()) {
	                if (MainMenu.get_IsTwoPlayerGame()) {
	                    if (MainMenu.getEngine().get_IsPlayer1Turn()) {
	                        MainMenu.getEngine().board.game_board[1][2] = MainMenu.getEngine().player1.get_piece_type();
	                        x1_y2.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                        Player1_Move();
	                    } 
	                    
	                    else {
	                        MainMenu.getEngine().board.game_board[1][2] = MainMenu.getEngine().player2.get_piece_type();
	                        x1_y2.setText(MainMenu.getEngine().player2.get_piece_type().toString());
	                        Player2_Move();
	                    }
	                } 
	                
	                else {
	                    MainMenu.getEngine().board.game_board[1][2] = MainMenu.getEngine().player2.get_piece_type();
	                    x1_y2.setText(MainMenu.getEngine().player2.get_piece_type().toString());

	                    Player2_Move();
	                    Player1_Move();
	                }
	            }
	        }
	    }//GEN-LAST:event_x1_y2ActionPerformed

	    private void x2_y0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2_y0ActionPerformed
	        // TODO add your handling code here:
	        SoundEffect.BUTTONCLICK.play();
	        if (IsGameRunning) {
	            if (x2_y0.getText().isEmpty()) {
	                if (MainMenu.get_IsTwoPlayerGame()) {
	                    if (MainMenu.getEngine().get_IsPlayer1Turn()) {
	                        MainMenu.getEngine().board.game_board[2][0] = MainMenu.getEngine().player1.get_piece_type();
	                        x2_y0.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                        Player1_Move();
	                    } 
	                    
	                    else {
	                        MainMenu.getEngine().board.game_board[2][0] = MainMenu.getEngine().player2.get_piece_type();
	                        x2_y0.setText(MainMenu.getEngine().player2.get_piece_type().toString());
	                        Player2_Move();
	                    }
	                } 
	                
	                else {
	                    MainMenu.getEngine().board.game_board[2][0] = MainMenu.getEngine().player2.get_piece_type();
	                    x2_y0.setText(MainMenu.getEngine().player2.get_piece_type().toString());

	                    Player2_Move();
	                    Player1_Move();
	                }
	            }
	        }
	    }//GEN-LAST:event_x2_y0ActionPerformed

	    private void x2_y1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2_y1ActionPerformed
	        // TODO add your handling code here:
	        SoundEffect.BUTTONCLICK.play();
	        if (IsGameRunning) {
	            if (x2_y1.getText().isEmpty()) {
	                if (MainMenu.get_IsTwoPlayerGame()) {
	                    if (MainMenu.getEngine().get_IsPlayer1Turn()) {
	                        MainMenu.getEngine().board.game_board[2][1] = MainMenu.getEngine().player1.get_piece_type();
	                        x2_y1.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                        Player1_Move();
	                    }
	                    
	                    else {
	                        MainMenu.getEngine().board.game_board[2][1] = MainMenu.getEngine().player2.get_piece_type();
	                        x2_y1.setText(MainMenu.getEngine().player2.get_piece_type().toString());
	                        Player2_Move();
	                    }
	                } 
	                
	                else {
	                    MainMenu.getEngine().board.game_board[2][1] = MainMenu.getEngine().player2.get_piece_type();
	                    x2_y1.setText(MainMenu.getEngine().player2.get_piece_type().toString());

	                    Player2_Move();
	                    Player1_Move();
	                }
	            }
	        }
	    }//GEN-LAST:event_x2_y1ActionPerformed
	    private void bPlayer2_Move() {

	        curr_score = MainMenu.getEngine().evaluate_score(0);
	        bSetPlayer1Turn();
	        if (curr_score > 0) {
	            
	            System.out.println("Player1 Wins");
	            HighlightWinningOrLoosing();
	            IsGameRunning = false;
	            MainMenu.getEngine().board.printBoard();
	            MainMenu.getEngine().player1.increment_total_wins();
	            opponent.setText(Integer.toString(MainMenu.getEngine().player1.get_total_wins()));
	            SoundEffect.LOSING.play();
	            JOptionPane.showMessageDialog(frame,
	                                    "vous avez perdu");
	            SoundEffect.LOSING.stop();
	           
	            

	        } else if (curr_score < 0) {
	            
	            System.out.println("Player2 wins");
	            HighlightWinningOrLoosing();
	            MainMenu.getEngine().board.printBoard();
	            MainMenu.getEngine().player2.increment_total_wins();
	            score1.setText(Integer.toString(MainMenu.getEngine().player2.get_total_wins()));
	            
	            IsGameRunning = false;
	            SoundEffect.WINNING.play();
	            JOptionPane.showMessageDialog(frame,
	                                    "vous avez gagné");
	            SoundEffect.WINNING.stop();
	           

	        }

	        if (!MainMenu.getEngine().IsMoveLeft()) {
	            IsGameRunning = false;
	            SoundEffect.DRAW.play();
	            JOptionPane.showMessageDialog(frame, "egualité");
	           
	        }

	    }
	    
	    private void StartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartGameActionPerformed
	        // TODO Sounadd your handling code here:
	    	System.out.println("test");
	        if(!IsGameRunning){
	            Resetboard();
	            SoundEffect.START.play();
	            if (gamecount % 2 == 0) {
	                SetPlayer2Turn();
	            } else {
	                SetPlayer1Turn();
	            }

	            IsGameRunning = true;
	            if (!MainMenu.get_IsTwoPlayerGame() && MainMenu.getEngine().get_IsPlayer1Turn()) {
	               MainMenu.getEngine().board.game_board[0][0] = MainMenu.getEngine().player1.get_piece_type();
	               
	               //x0_y0.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	               SetPlayer2Turn();
	            }
	            gamecount++;
	        }
	        else{
	            JOptionPane.showMessageDialog(frame,"Game Is Already Running,Please Reset Game If you wan't to start from beginning");
	        }
	    }//GEN-LAST:event_StartGameActionPerformed

	    private void MoveSuggestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoveSuggestionActionPerformed
	        // TODO add your handling code here:
	        SoundEffect.HELP.play();
	        int[] bestMove = MainMenu.getEngine().findBestMove();
	        if (bestMove[2] == -1) {
	            System.out.println("game draw");
	            JOptionPane.showMessageDialog(frame,
	                    "you can't get more than a draw");
	            
	        }  
	        
	        else {

	            if (bestMove[0] == 0 && bestMove[1] == 0) {
	                Blink_Button(x0_y0);

	            }

	            if (bestMove[0] == 1 && bestMove[1] == 0) {
	                Blink_Button(x1_y0);
	            }

	            if (bestMove[0] == 2 && bestMove[1] == 0) {
	               Blink_Button(x2_y0);
	            }

	            if (bestMove[0] == 0 && bestMove[1] == 1) {
	                Blink_Button(x0_y1);
	            }

	            if (bestMove[0] == 1 && bestMove[1] == 1) {
	                Blink_Button(x1_y1);
	            }

	            if (bestMove[0] == 2 && bestMove[1] == 1) {
	                Blink_Button(x2_y1);
	            }

	            if (bestMove[0] == 0 && bestMove[1] == 2) {
	                Blink_Button(x0_y2);
	            }

	            if (bestMove[0] == 1 && bestMove[1] == 2) {
	                Blink_Button(x1_y2);
	            }

	            if (bestMove[0] == 2 && bestMove[1] == 2) {
	               Blink_Button(x2_y2);
	            }

	        
	    }//GEN-LAST:event_MoveSuggestionActionPerformed
	 }
	    private void Blink_Button(final javax.swing.JButton b){
	        Timer blinkTimer = new Timer(500, new ActionListener() {
	        private int count = 0;
	        private int maxCount = 10;
	        private boolean on = false;

	        public void actionPerformed(ActionEvent e) {
	            if (count >= maxCount) {
	                b.setBackground(null);
	                ((Timer) e.getSource()).stop();
	            } else {
	                b.setBackground( on ? Color.YELLOW : null);
	                on = !on;
	                count++;
	            }
	        }

	           
	            
	       });
	        blinkTimer.start();
	    }
	    private void SetPlayer1Turn() {
	        MainMenu.getEngine().set_IsPlayer1Turn(true);
	        CurrentTurn.setText("adversaire");
	        CurrentTurn.setForeground(new java.awt.Color(240, 84, 84));
	    }

	    private void bSetPlayer1Turn() {
	        MainMenu.getEngine().set_IsPlayer1Turn(true);
	        CurrentTurn.setText("adversaire");
	        CurrentTurn.setForeground(new java.awt.Color(240, 84, 84));
	    }
	    
	    private void SetPlayer2Turn() {
	        MainMenu.getEngine().set_IsPlayer1Turn(false);
	        CurrentTurn.setText("votre");
	        CurrentTurn.setForeground(new java.awt.Color(51, 111, 44));
	    }

	    private void Resetboard() {
	        int i, j;

	        MainMenu.getEngine().board.reset();
	        ResetButtonColor();
	        x0_y0.setText("");
	        x0_y1.setText("");
	        x0_y2.setText("");
	        x1_y0.setText("");
	        x1_y1.setText("");
	        x1_y2.setText("");
	        x2_y0.setText("");
	        x2_y1.setText("");
	        x2_y2.setText("");

	    }
	    
	    private void bResetScore() {
	        gamecount = 0;
	        MainMenu.getEngine().player1.reset_total_wins();
	        MainMenu.getEngine().player2.reset_total_wins();
	        score1.setText("0");
	        opponent.setText(("0"));
	    }
	    
	    void bResetButtonColor(){
	        bx0_y0.setBackground(new java.awt.Color(249,249,248));
	        bx0_y1.setBackground(new java.awt.Color(249,249,248));
	        bx0_y2.setBackground(new java.awt.Color(249,249,248));
	        bx0_y3.setBackground(new java.awt.Color(249,249,248));
	        bx1_y0.setBackground(new java.awt.Color(249,249,248));
	        bx1_y1.setBackground(new java.awt.Color(249,249,248));
	        bx1_y2.setBackground(new java.awt.Color(249,249,248));
	        bx1_y3.setBackground(new java.awt.Color(249,249,248));
	        bx2_y0.setBackground(new java.awt.Color(249,249,248));
	        bx2_y1.setBackground(new java.awt.Color(249,249,248));
	        bx2_y2.setBackground(new java.awt.Color(249,249,248));
	        bx2_y3.setBackground(new java.awt.Color(249,249,248));
	        bx3_y0.setBackground(new java.awt.Color(249,249,248));
	        bx3_y1.setBackground(new java.awt.Color(249,249,248));
	        bx3_y2.setBackground(new java.awt.Color(249,249,248));
	        bx3_y3.setBackground(new java.awt.Color(249,249,248));
	        
	        
	    }

	    private void bResetboard() {
	        int i, j;

	        MainMenu.getEngine().board.reset();
	        bResetButtonColor();
	        bx0_y0.setText("");
	        bx0_y1.setText("");
	        bx0_y2.setText("");
	        bx0_y3.setText("");
	        bx1_y0.setText("");
	        bx1_y1.setText("");
	        bx1_y2.setText("");
	        bx1_y3.setText("");
	        bx2_y0.setText("");
	        bx2_y1.setText("");
	        bx2_y2.setText("");
	        bx2_y3.setText("");
	        bx3_y0.setText("");
	        bx3_y1.setText("");
	        bx3_y2.setText("");
	        bx3_y3.setText("");

	    }

	    
	    private void ResetScore() {
	        gamecount = 0;
	        MainMenu.getEngine().player1.reset_total_wins();
	        MainMenu.getEngine().player2.reset_total_wins();
	        PlayerScore.setText("0");
	        OpponentScore.setText(("0"));
	    }

	    private void Player2_Move() {

	        curr_score = MainMenu.getEngine().evaluate_score(0);
	        SetPlayer1Turn();
	        if (curr_score > 0) {
	            
	            System.out.println("Player1 Wins");
	            HighlightWinningOrLoosing();
	            IsGameRunning = false;
	            MainMenu.getEngine().board.printBoard();
	            MainMenu.getEngine().player1.increment_total_wins();
	            OpponentScore.setText(Integer.toString(MainMenu.getEngine().player1.get_total_wins()));
	            SoundEffect.LOSING.play();
	            JOptionPane.showMessageDialog(frame,
	                                    "YOU Lost , Your Opponent has played better than you");
	            SoundEffect.LOSING.stop();
	           
	            

	        } else if (curr_score < 0) {
	            
	            System.out.println("Player2 wins");
	            HighlightWinningOrLoosing();
	            MainMenu.getEngine().board.printBoard();
	            MainMenu.getEngine().player2.increment_total_wins();
	            PlayerScore.setText(Integer.toString(MainMenu.getEngine().player2.get_total_wins()));
	            
	            IsGameRunning = false;
	            SoundEffect.WINNING.play();
	            JOptionPane.showMessageDialog(frame,
	                                    "Hurrah,YOU Won the game");
	            SoundEffect.WINNING.stop();
	           

	        }

	        if (!MainMenu.getEngine().IsMoveLeft()) {
	            IsGameRunning = false;
	            SoundEffect.DRAW.play();
	            JOptionPane.showMessageDialog(frame, "Game DRAW ,It's better than loosing");
	           
	        }

	    }

	    private void Player1_Move() {

	        int[] bestMove = new int[3];
	        if (IsGameRunning) {

	              if (MainMenu.getEngine().get_IsPlayer1Turn()) {

	                    bestMove = MainMenu.getEngine().findBestMove();

	                    if (bestMove[2] == -1) {
	                         SoundEffect.DRAW.play();
	                        System.out.println("Game Draw");
	                        JOptionPane.showMessageDialog(frame,
	                                "Game DRAW ,It's better than loosing");
	                        IsGameRunning = false;
	                    } else {

	                        if (bestMove[0] == 0 && bestMove[1] == 0) {
	                            MainMenu.getEngine().board.game_board[0][0] = MainMenu.getEngine().player1.get_piece_type();
	                            x0_y0.setText(MainMenu.getEngine().player1.get_piece_type().toString());

	                        }

	                        if (bestMove[0] == 1 && bestMove[1] == 0) {
	                            MainMenu.getEngine().board.game_board[1][0] = MainMenu.getEngine().player1.get_piece_type();
	                            x1_y0.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                        }

	                        if (bestMove[0] == 2 && bestMove[1] == 0) {
	                            MainMenu.getEngine().board.game_board[2][0] = MainMenu.getEngine().player1.get_piece_type();
	                            x2_y0.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                        }

	                        if (bestMove[0] == 0 && bestMove[1] == 1) {
	                            MainMenu.getEngine().board.game_board[0][1] = MainMenu.getEngine().player1.get_piece_type();
	                            x0_y1.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                        }

	                        if (bestMove[0] == 1 && bestMove[1] == 1) {
	                            MainMenu.getEngine().board.game_board[1][1] = MainMenu.getEngine().player1.get_piece_type();
	                            x1_y1.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                        }

	                        if (bestMove[0] == 2 && bestMove[1] == 1) {
	                            MainMenu.getEngine().board.game_board[2][1] = MainMenu.getEngine().player1.get_piece_type();
	                            x2_y1.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                        }

	                        if (bestMove[0] == 0 && bestMove[1] == 2) {
	                            MainMenu.getEngine().board.game_board[0][2] = MainMenu.getEngine().player1.get_piece_type();
	                            x0_y2.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                        }

	                        if (bestMove[0] == 1 && bestMove[1] == 2) {
	                            MainMenu.getEngine().board.game_board[1][2] = MainMenu.getEngine().player1.get_piece_type();
	                            x1_y2.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                        }

	                        if (bestMove[0] == 2 && bestMove[1] == 2) {
	                            MainMenu.getEngine().board.game_board[2][2] = MainMenu.getEngine().player1.get_piece_type();
	                            x2_y2.setText(MainMenu.getEngine().player1.get_piece_type().toString());
	                        }

	                        SetPlayer2Turn();
	                        curr_score = MainMenu.getEngine().evaluate_score(0);
	                        if (curr_score > 0) {
	                            System.out.println("Player1 Wins");
	                            HighlightWinningOrLoosing();
	                            MainMenu.getEngine().player1.increment_total_wins();
	                            OpponentScore.setText(Integer.toString(MainMenu.getEngine().player1.get_total_wins()));
	                            IsGameRunning = false;
	                            MainMenu.getEngine().board.printBoard();
	                            SoundEffect.LOSING.play();
	                            JOptionPane.showMessageDialog(frame,
	                                    "YOU Lost , It's unbeatable Bro");
	                            SoundEffect.LOSING.stop();
	                      

	                        } else if (curr_score < 0) {
	                            System.out.println("Player1 looses");
	                            IsGameRunning = false;
	                            JOptionPane.showMessageDialog(frame,
	                                    "This will never happen");
	                       

	                        }
	                        if (!MainMenu.getEngine().IsMoveLeft()) {
	                             SoundEffect.DRAW.play();
	                            JOptionPane.showMessageDialog(frame, "Game DRAW ,It's better than loosing");
	                            IsGameRunning = false;
	                        
	                           
	                        }
	                    }

	                }

	            }
	        
	        System.out.println("Done");
	    }
	    
	    public int Highlight_helper(){
	        int row,col;
	        // Checking for Rows for X or O victory.
	        pieces type = pieces.emp;
	        for (row = 0; row < MainMenu.getEngine().board.get_no_of_rows(); row++)
	        {
	            type = MainMenu.getEngine().board.game_board[row][0];
	            for(col = 0;col < MainMenu.getEngine().board.get_no_of_coloumns();col++){
	                if(MainMenu.getEngine().board.game_board[row][col] != type)
	                    break;
	            }
	            
	            if(col == MainMenu.getEngine().board.get_no_of_coloumns()){
	            
	                if(type == MainMenu.getEngine().player1.get_piece_type()){
	                    color = "RED";
	                    return row + 1;
	                }
	                else if(type == MainMenu.getEngine().player2.get_piece_type()){
	                    color = "GREEN";
	                    return row + 1;
	                }
	            }
	        }

	        // Checking for Columns for X or O victory.
	        for (col = 0; col < MainMenu.getEngine().board.get_no_of_coloumns(); col++)
	        {
	            type = MainMenu.getEngine().board.game_board[0][col];
	            for(row = 0;row < MainMenu.getEngine().board.get_no_of_rows();row++){
	                if(MainMenu.getEngine().board.game_board[row][col] != type)
	                    break;
	                
	            }
	            
	            if(row == MainMenu.getEngine().board.get_no_of_rows()){
	                            
	                if(type == MainMenu.getEngine().player1.get_piece_type()){
	                    color = "RED";
	                    return MainMenu.getEngine().board.get_no_of_rows() + col + 1;
	                }
	                else if(type == MainMenu.getEngine().player2.get_piece_type()){
	                    color = "GREEN";
	                    return MainMenu.getEngine().board.get_no_of_rows() + col + 1;
	                }
	            }
	        }

	        // Checking for Diagonals for X or O victory.
	        type = MainMenu.getEngine().board.game_board[0][0];
	        for(row = 0;row < MainMenu.getEngine().board.get_no_of_rows();row++){
	            
	            if(MainMenu.getEngine().board.game_board[row][row] != type)
	                break;
	            
	        }
	        if(row == MainMenu.getEngine().board.get_no_of_rows()){
	            
	           
	            if(type == MainMenu.getEngine().player1.get_piece_type()){
	               color = "RED";
	               return 7;
	            }
	            else if(type == MainMenu.getEngine().player2.get_piece_type()){
	                color = "GREEN";
	               return 7;
	            }
	        }
	        
	        
	        row = 0;
	        col = MainMenu.getEngine().board.get_no_of_coloumns()-1;
	        type = MainMenu.getEngine().board.game_board[row][col];
	        while(col >= 0){
	            if(MainMenu.getEngine().board.game_board[row][col] != type)
	                break;
	            row++;
	            col--;
	        }
	        
	        if(col < 0){
	            
	            if(type == MainMenu.getEngine().player1.get_piece_type()){
	                color = "RED";
	               return 8;
	            }
	            else if(type == MainMenu.getEngine().player2.get_piece_type()){
	                color = "GREEN";
	               return 8;
	            }
	        }

	        // Else if none of them have won then return 0
	        return 0; 
	        
	    }
	    
	    void HighlightWinningOrLoosing(){
	        int type = Highlight_helper();
	        if(type == 1){
	            if(color.equals("RED")){
	                x0_y0.setBackground(new java.awt.Color(244,38,38));
	                x0_y1.setBackground(new java.awt.Color(244,38,38));
	                x0_y2.setBackground(new java.awt.Color(244,38,38));
	            }
	            else{
	                x0_y0.setBackground(new java.awt.Color(73,220,82));
	                x0_y1.setBackground(new java.awt.Color(73,220,82));
	                x0_y2.setBackground(new java.awt.Color(73,220,82));
	            }
	        }
	        
	        if(type == 2){
	            if(color.equals("RED")){
	                x1_y0.setBackground(new java.awt.Color(244,38,38));
	                x1_y1.setBackground(new java.awt.Color(244,38,38));
	                x1_y2.setBackground(new java.awt.Color(244,38,38));
	            }
	            else{
	                x1_y0.setBackground(new java.awt.Color(73,220,82));
	                x1_y1.setBackground(new java.awt.Color(73,220,82));
	                x1_y2.setBackground(new java.awt.Color(73,220,82));
	            }
	        }
	        
	        if(type == 3){
	            if(color.equals("RED")){
	                x2_y0.setBackground(new java.awt.Color(244,38,38));
	                x2_y1.setBackground(new java.awt.Color(244,38,38));
	                x2_y2.setBackground(new java.awt.Color(244,38,38));
	            }
	            else{
	                x2_y0.setBackground(new java.awt.Color(73,220,82));
	                x2_y1.setBackground(new java.awt.Color(73,220,82));
	                x2_y2.setBackground(new java.awt.Color(73,220,82));
	            }
	        }
	        
	        if(type == 4){
	            if(color.equals("RED")){
	                x0_y0.setBackground(new java.awt.Color(244,38,38));
	                x1_y0.setBackground(new java.awt.Color(244,38,38));
	                x2_y0.setBackground(new java.awt.Color(244,38,38));
	            }
	            else{
	                x0_y0.setBackground(new java.awt.Color(73,220,82));
	                x1_y0.setBackground(new java.awt.Color(73,220,82));
	                x2_y0.setBackground(new java.awt.Color(73,220,82));
	            }
	        }
	        
	        if(type == 5){
	            if(color.equals("RED")){
	                x0_y1.setBackground(new java.awt.Color(244,38,38));
	                x1_y1.setBackground(new java.awt.Color(244,38,38));
	                x2_y1.setBackground(new java.awt.Color(244,38,38));
	            }
	            else{
	                x0_y1.setBackground(new java.awt.Color(73,220,82));
	                x1_y1.setBackground(new java.awt.Color(73,220,82));
	                x2_y1.setBackground(new java.awt.Color(73,220,82));
	            }
	        }
	        
	        if(type == 6){
	            if(color.equals("RED")){
	                x0_y2.setBackground(new java.awt.Color(244,38,38));
	                x1_y2.setBackground(new java.awt.Color(244,38,38));
	                x2_y2.setBackground(new java.awt.Color(244,38,38));
	            }
	            else{
	                x0_y2.setBackground(new java.awt.Color(73,220,82));
	                x1_y2.setBackground(new java.awt.Color(73,220,82));
	                x2_y2.setBackground(new java.awt.Color(73,220,82));
	            }
	        }
	        
	        if(type == 7){
	            if(color.equals("RED")){
	                x0_y0.setBackground(new java.awt.Color(244,38,38));
	                x1_y1.setBackground(new java.awt.Color(244,38,38));
	                x2_y2.setBackground(new java.awt.Color(244,38,38));
	            }
	            else{
	                x0_y0.setBackground(new java.awt.Color(73,220,82));
	                x1_y1.setBackground(new java.awt.Color(73,220,82));
	                x2_y2.setBackground(new java.awt.Color(73,220,82));
	            }
	        }
	        if(type == 8){
	            if(color.equals("RED")){
	                x0_y2.setBackground(new java.awt.Color(244,38,38));
	                x1_y1.setBackground(new java.awt.Color(244,38,38));
	                x2_y0.setBackground(new java.awt.Color(244,38,38));
	            }
	            else{
	                x0_y2.setBackground(new java.awt.Color(73,220,82));
	                x1_y1.setBackground(new java.awt.Color(73,220,82));
	                x2_y0.setBackground(new java.awt.Color(73,220,82));
	            }
	        }
	        
	    }
	    
	    private void bSetPlayer2Turn() {
	        MainMenu.getEngine().set_IsPlayer1Turn(false);
	        turn.setText("votre");
	        turn.setForeground(new java.awt.Color(51, 111, 44));
	    }
	    
	    void ResetButtonColor(){
	        x0_y0.setBackground(new java.awt.Color(249,249,248));
	        x0_y1.setBackground(new java.awt.Color(249,249,248));
	        x0_y2.setBackground(new java.awt.Color(249,249,248));
	        x1_y0.setBackground(new java.awt.Color(249,249,248));
	        x1_y1.setBackground(new java.awt.Color(249,249,248));
	        x1_y2.setBackground(new java.awt.Color(249,249,248));
	        x2_y0.setBackground(new java.awt.Color(249,249,248));
	        x2_y1.setBackground(new java.awt.Color(249,249,248));
	        x2_y2.setBackground(new java.awt.Color(249,249,248));
	        
	        
	    }


	    // Variables declaration - do not modify//GEN-BEGIN:variables
	    private javax.swing.JButton BackToMainMenu;
	    private javax.swing.JLabel CHOOSE_label;
	    private javax.swing.JLabel CURR_TURN_label;
	    private javax.swing.JComboBox ChoosePieceType;
	    private javax.swing.JLabel CurrentTurn;
	    private javax.swing.JButton MoveSuggestion;
	    private javax.swing.JLabel OPPONENT_label;
	    private javax.swing.JLabel OpponentScore;
	    private javax.swing.JLabel PlayerScore;
	    private javax.swing.JButton ResetGame;
	    private javax.swing.JLabel SCORE_label;
	    private javax.swing.JButton StartGame;
	    private javax.swing.JLabel YOU_label;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JPanel jPanel1;
	    
	   
	    private javax.swing.JPanel jPanel14;
	    private javax.swing.JPanel jPanel2;
	    private javax.swing.JPanel jPanel3;
	    private javax.swing.JPanel jPanel4;
	    private javax.swing.JPanel jPanel5;
	    private javax.swing.JPanel jPanel6;
	    private javax.swing.JPanel jPanel7;
	    private javax.swing.JPanel jPanel8;
	    private javax.swing.JPanel jPanel9;
	    private javax.swing.JScrollPane jScrollPane1;
	    private javax.swing.JTable jTable1;
	    
	    
	 
	    private javax.swing.JPanel jPanel10;
	    private javax.swing.JPanel jPanel11;
	    private javax.swing.JPanel jPanel12;
	    private javax.swing.JPanel jPanel13;
	    
	   
	    private javax.swing.JButton x0_y0;
	    private javax.swing.JButton x0_y1;
	    private javax.swing.JButton x0_y2;
	  
	    private javax.swing.JButton x1_y0;
	    private javax.swing.JButton x1_y1;
	    private javax.swing.JButton x1_y2;
	    
	    private javax.swing.JButton x2_y0;
	    private javax.swing.JButton x2_y1;
	    private javax.swing.JButton x2_y2;   
	
	    // End of variables declaration//GEN-END:variables
	    private javax.swing.JLabel lab1;
		private javax.swing.JLabel currentlabel;
		private javax.swing.JLabel turn;
		private javax.swing.JPanel pan2;
		private javax.swing.JPanel pan3;
		private javax.swing.JButton reset;
		private javax.swing.JButton suggestion;
		private javax.swing.JComboBox lpieces;
	    private javax.swing.JButton menu;
	    private javax.swing.JLabel choix;
	    private javax.swing.JButton start;
	    private javax.swing.JPanel pan4;
	    private javax.swing.JLabel score;
	    private javax.swing.JLabel you;
	    private javax.swing.JLabel opponent;
	    private javax.swing.JLabel score1;
	    private javax.swing.JLabel score2;
	    private javax.swing.JPanel pan1;
	    
	    private javax.swing.JPanel pan00;
	    private javax.swing.JPanel pan01;
	    private javax.swing.JPanel pan02;
	    private javax.swing.JPanel pan03;
	    private javax.swing.JPanel pan10;
	    private javax.swing.JPanel pan11;
	    private javax.swing.JPanel pan12;
	    private javax.swing.JPanel pan13;
	    private javax.swing.JPanel pan20;
	    private javax.swing.JPanel pan21;
	    private javax.swing.JPanel pan22;
	    private javax.swing.JPanel pan23;
	    private javax.swing.JPanel pan30;
	    private javax.swing.JPanel pan31;
	    private javax.swing.JPanel pan32;
	    private javax.swing.JPanel pan33;
	    private javax.swing.JScrollPane scrolPan;
	    private javax.swing.JTable table;
	    private javax.swing.JButton bx0_y0;
	    private javax.swing.JButton bx0_y1;
	    private javax.swing.JButton bx0_y2;
	    private javax.swing.JButton bx0_y3;
	    private javax.swing.JButton bx1_y0;
	    private javax.swing.JButton bx1_y1;
	    private javax.swing.JButton bx1_y2;
	    private javax.swing.JButton bx1_y3;
	    private javax.swing.JButton bx2_y0;
	    private javax.swing.JButton bx2_y1;
	    private javax.swing.JButton bx2_y2;   
	    private javax.swing.JButton bx2_y3;
	    private javax.swing.JButton bx3_y0;
	    private javax.swing.JButton bx3_y1;
	    private javax.swing.JButton bx3_y2;
	    private javax.swing.JButton bx3_y3;
	    
}
