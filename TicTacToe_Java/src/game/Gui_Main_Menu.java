
package game;

import game.Type.pieces;

import java.awt.Component;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Gui_Main_Menu extends javax.swing.JFrame {
	private Board board;
    private Game_Engine engine;
    private Gui_Game_Play GamePlay;
    private boolean IsTwoPlayerGame;
    private boolean firsttime;

   
       public Board getBoard() {
		return board;
	}



	public void setBoard(Board board) {
		this.board = board;
	}



	public Gui_Main_Menu(Gui_Game_Play GamePlay) {
        initComponents();
        
        firsttime = true;
        
        this.GamePlay = GamePlay;
        this.IsTwoPlayerGame = false;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
         
        
    }

    
  
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        play_with_nine = new javax.swing.JButton();
        play_with_seize = new javax.swing.JButton();
        play_with_twenty = new javax.swing.JButton();
        welcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setBackground(new java.awt.Color(224, 187, 149));

        jPanel1.setBackground(new java.awt.Color(240, 242, 241));

        play_with_nine.setText("jouer 3*3");
        play_with_nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	play_with_nineActionPerformed(evt);
            }
            
        });

        play_with_seize.setText("jouer 4*4");
        play_with_seize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	 play_with_seizeActionPerformed(evt);
            }
        });

        play_with_twenty.setText("jouer 5*5");
        play_with_twenty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	 play_with_twentyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent( play_with_nine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent( play_with_seize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent( play_with_twenty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent( play_with_nine, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent( play_with_seize, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent( play_with_twenty, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        welcome.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        welcome.setForeground(new java.awt.Color(233, 132, 132));
        welcome.setText("TIC TAC TOE ");
        welcome.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(welcome)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    public Game_Engine getEngine() {
		return engine;
	}



	public void setEngine(Game_Engine engine) {
		this.engine = engine;
	}



	private void play_with_nineActionPerformed(java.awt.event.ActionEvent evt) {
    	 
		board = new Board(3,3);
        Player player1 = new Player(pieces.O);
        Player player2 = new Player(pieces.X);
        engine = new Game_Engine(board, player1, player2);
        SoundEffect.CLICK.play();
        engine.player1.set_name("COMPUTER");
        setVisible(false);
        GamePlay.createThree();
        GamePlay.setVisible(true);
        
        
        if(firsttime){
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "1.Click on Start Game Button to play the Game\n" 
                                           + "2.Current Turn will be displyed at the top of the game window\n");
            firsttime = false;
        }
        
    }
private void play_with_seizeActionPerformed(java.awt.event.ActionEvent evt) {
        
	board = new Board(4,4);
    Player player1 = new Player(pieces.O);
    Player player2 = new Player(pieces.X);
    
    
    engine = new Game_Engine(board, player1, player2);
        SoundEffect.CLICK.play();
        engine.player1.set_name("COMPUTER");
        setVisible(false);
        GamePlay.createFour();
        GamePlay.setVisible(true);
        
        
        if(firsttime){
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "1.Click on Start Game Button to play the Game\n" 
                                           + "2.Current Turn will be displyed at the top of the game window\n");
            firsttime = false;
        }
        
    }
private void play_with_twentyActionPerformed(java.awt.event.ActionEvent evt) {
    
	board = new Board(5,5);
    Player player1 = new Player(pieces.O);
    Player player2 = new Player(pieces.X);
    
    
    engine = new Game_Engine(board, player1, player2);
    SoundEffect.CLICK.play();
    engine.player1.set_name("COMPUTER");
    setVisible(false);
    GamePlay.setVisible(true);
    IsTwoPlayerGame = false;
    
    if(firsttime){
        Component frame = null;
        JOptionPane.showMessageDialog(frame, "1.Click on Start Game Button to play the Game\n" 
                                       + "2.Current Turn will be displyed at the top of the game window\n");
        firsttime = false;
    }
    
}

    

    

    public boolean get_IsTwoPlayerGame(){
        return IsTwoPlayerGame;
        
    }
  
    
    private javax.swing.JButton play_with_twenty;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton  play_with_nine;
    private javax.swing.JButton  play_with_seize;
    private javax.swing.JLabel  welcome;
    
}
