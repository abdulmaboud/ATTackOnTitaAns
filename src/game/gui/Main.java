package game.gui;
	
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.ZoomEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.PriorityQueue;

import game.engine.*;
import game.engine.exceptions.InsufficientResourcesException;
import game.engine.exceptions.InvalidLaneException;
import game.engine.lanes.Lane;
import game.engine.titans.AbnormalTitan;
import game.engine.titans.ArmoredTitan;
import game.engine.titans.ColossalTitan;
import game.engine.titans.Titan;
import game.engine.weapons.PiercingCannon;
import game.engine.weapons.SniperCannon;
import game.engine.weapons.VolleySpreadCannon;
import game.engine.weapons.WallTrap;
import game.engine.weapons.Weapon;
import game.engine.weapons.WeaponRegistry;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


public class Main extends Application {
	////welcome///
	
	private Battle Battle;
	private AnchorPane root1;
	private Scene scene1;
	private Button start;
	private Label lname;
	private Button quit;
	private Image img;
	private ImageView viw;
	private Image icn;
	
	
	//////inst//////
	
	private AnchorPane rootinst;
	private Scene sceneinst;
	private Button next;
	private Image imginst;
	private ImageView viwinst;
	private TextArea txta;
	
	

	 
	 /////////scene2//////
	private Scene scene2;
	private AnchorPane root2;
	Button easy;
	Button hard;
	Image img2;
	ImageView viw2;
	
	/////easy scene////
	
	private AnchorPane root3;
	private Scene easyscene;
	private VBox wshop;
	private Button pc;
	private Button snp;
	private Button trp;
	private Button w4;
	private Label l1;
	private Label l2;
	private Label l3;
	private Label l4;
	private Label l5;
	private ProgressBar hb1;
	private ProgressBar hb2;
	private ProgressBar hb3;
	private Image imgpc;
	private ImageView viwpc;
	private Image imgsnp;
	private ImageView viwsnp;
	private Image imgtrp;
	private ImageView viwtrp;
	private Image imgw4;
	private ImageView viww4;
	private AnchorPane a1;
	private AnchorPane a2;
	private AnchorPane a3;
	private Image bcg;
	private ImageView bvv;
	private Label scr;
	private Label rsc;
	private Label phs;
	private Label trn;
	private Label lan;
	private AnchorPane lane1;
	private AnchorPane lane2;
	private AnchorPane lane3;
	private VBox wall1;
	private VBox wall2;
	private VBox wall3;
	private StackPane sp1;
	private StackPane sp2;
	private StackPane sp3;
	private StackPane sp4;
	private StackPane sp5;
	private StackPane sp6;
	private StackPane sp7;
	private StackPane sp8;
	private StackPane sp9;
	private StackPane sp10;
	private StackPane sp11;
	private StackPane sp12;
	
	private ImageView im1;
	private ImageView im2;
	private ImageView im3;
	private ImageView im4;
	private ImageView im5;
	private ImageView im6;
	private ImageView im7;
	private ImageView im8;
	private ImageView im9;
	private ImageView im10;
	private ImageView im11;
	private ImageView im12;
	
	
	private Image ig1;
	private Image ig2;
	private Image ig3;
	private Image ig4;
	
	
	
	
	private Text t1;
	private Text t2;
	private Text t3;
	private Text t4;
	private Text t5;
	private Text t6;
	private Text t7;
	private Text t8;
	private Text t9;
	private Text t10;
	private Text t11;
	private Text t12;
	
	private AnchorPane an1;
	private AnchorPane an2;
	private AnchorPane an3;
	private Button pass;
	private RadioButton rb1;
	private RadioButton rb2;
	private RadioButton rb3;
	private ToggleGroup tg;
    private Label dngr1;
    private Label dngr2;
    private Label dngr3;
	
	private StackPane sptitan;
	private   Image imgtitan;
	private ImageView ivtitan;
	private Text txttitan;
	
	/*String audiopath="kkk";
	Media audio=new Media(Paths.get(audiopath).toUri().toString());
	MediaPlayer mediaplayer= new MediaPlayer(audio);*/
	
	
	///////scene3//////////
	private Battle Battle2;
	private AnchorPane root4;
	private Scene hardscene;
	private Label scr2;
	private Label rsc2;
	private Label phs2;
	private Label trn2;
	private Label lan2;
	
	
	private VBox wshophrd;
	private Button pchrd;
	private Button snphrd;
	private Button trphrd;
	private Button w4hrd;
	private Label l1hrd;
	private Label l2hrd;
	private Label l3hrd;
	private Label l4hrd;
	private Label l5hrd;
	
	
	private RadioButton rb1hrd;
	private RadioButton rb2hrd;
	private RadioButton rb3hrd;
	private RadioButton rb4hrd;
	private RadioButton rb5hrd;
	private ToggleGroup tghrd;
	private Button passhrd;
    
	private Label dngr1hrd;
    private Label dngr2hrd;
    private Label dngr3hrd;
    private Label dngr4hrd;
    private Label dngr5hrd;
    
    

	private ProgressBar hb1sc3;
	private ProgressBar hb2sc3;
	private ProgressBar hb3sc;
	private ProgressBar hb4sc;
	private ProgressBar hb5sc;
	
	
	private Image imgpch;
	private ImageView viwpch;
	private Image imgsnph;
	private ImageView viwsnph;
	private Image imgtrph;
	private ImageView viwtrph;
	private Image imgw4h;
	private ImageView viww4h;
	
	
	
	
	
	
	
	
	private VBox wall1h;
	private VBox wall2h;
	private VBox wall3h;
	private VBox wall4h;
	private VBox wall5h;
	private StackPane sp1h;
	private StackPane sp2h;
	private StackPane sp3h;
	private StackPane sp4h;
	private StackPane sp5h;
	private StackPane sp6h;
	private StackPane sp7h;
	private StackPane sp8h;
	private StackPane sp9h;
	private StackPane sp10h;
	private StackPane sp11h;
	private StackPane sp12h;
	private StackPane sp13h;
	private StackPane sp14h;
	private StackPane sp15h;
	private StackPane sp16h;
	private StackPane sp17h;
	private StackPane sp18h;
	private StackPane sp19h;
	private StackPane sp20h;
	
	
	
	private ImageView im1h;
	private ImageView im2h;
	private ImageView im3h;
	private ImageView im4h;
	private ImageView im5h;
	private ImageView im6h;
	private ImageView im7h;
	private ImageView im8h;
	private ImageView im9h;
	private ImageView im10h;
	private ImageView im11h;
	private ImageView im12h;
	private ImageView im13h;
	private ImageView im14h;
	private ImageView im15h;
	private ImageView im16h;
	private ImageView im17h;
	private ImageView im18h;
	private ImageView im19h;
	private ImageView im20h;;
	
	
	private Image ig1h;
	private Image ig2h;
	private Image ig3h;
	private Image ig4h;
	
	
	
	
	private Text t1h;
	private Text t2h;
	private Text t3h;
	private Text t4h;
	private Text t5h;
	private Text t6h;
	private Text t7h;
	private Text t8h;
	private Text t9h;
	private Text t10h;
	private Text t11h;
	private Text t12h;
	private Text t13h;
	private Text t14h;
	private Text t15h;
	private Text t16h;
	private Text t17h;
	private Text t18h;
	private Text t19h;
	private Text t20h;
	
	
	private AnchorPane an1h;
	private AnchorPane an2h;
	private AnchorPane an3h;
	private AnchorPane an4h;
	private AnchorPane an5h;
	

	private ProgressBar hb1h;
	private ProgressBar hb2h;
	private ProgressBar hb3h;
	private ProgressBar hb4h;
	private ProgressBar hb5h;
	
	private Image imgppr;
	private ImageView vpp;
	
	private Image imbrdya;
	private ImageView ivbrdya;
	

	
	 private void gameovercheckeasy() {
  	   if(Battle.isGameOver()) {
  		   Alert alert=new Alert(Alert.AlertType.ERROR);
				alert.setHeaderText("Game Over");
				alert.setContentText("You lost!");
				alert.showAndWait();}
  		   
  	   }
	
	 private void gameovercheckhard() {
	  	   if(Battle2.isGameOver()) {
	  		   Alert alert=new Alert(Alert.AlertType.ERROR);
					alert.setHeaderText("Game Over");
					alert.setContentText("You lost!");
					alert.showAndWait();}
	  		   
	  	   }
		
     
     
	

	
	
	
	private void Updatehbeasy() {
		hb1.setProgress(Battle.getOriginalLanes().get(0).getLaneWall().getCurrentHealth()*0.0001);
		hb2.setProgress(Battle.getOriginalLanes().get(1).getLaneWall().getCurrentHealth()*0.0001);
		hb3.setProgress(Battle.getOriginalLanes().get(2).getLaneWall().getCurrentHealth()*0.0001);
	} 
	
	
	private void Updatehbhard() {
		hb1h.setProgress(Battle2.getOriginalLanes().get(0).getLaneWall().getCurrentHealth()*0.0001);
		hb2h.setProgress(Battle2.getOriginalLanes().get(1).getLaneWall().getCurrentHealth()*0.0001);
		hb3h.setProgress(Battle2.getOriginalLanes().get(2).getLaneWall().getCurrentHealth()*0.0001);
		hb4h.setProgress(Battle2.getOriginalLanes().get(3).getLaneWall().getCurrentHealth()*0.0001);
		hb5h.setProgress(Battle2.getOriginalLanes().get(4).getLaneWall().getCurrentHealth()*0.0001);
	
	
	}
	
	
	

    private StackPane addTitanbutt(Titan t) {
 	
 	 sptitan=new StackPane();
 	txttitan=new Text("health:"+t.getCurrentHealth());
 	   if(t instanceof AbnormalTitan) {
 		   imgtitan=new Image("Run+Attack.png");
 		   ivtitan=new ImageView(imgtitan);
 		  
 		  
 	   }
 	   else if(t instanceof ArmoredTitan) {
 		   imgtitan=new Image("Run.png");
 		   ivtitan=new ImageView(imgtitan);
 		  ivtitan.setFitHeight(100);
 		  
 	   }
 	   
 	   else if(t instanceof ColossalTitan) {
 		   imgtitan=new Image("Runee.png");
 		   ivtitan=new ImageView(imgtitan);
 		   ivtitan.setFitHeight(150);
 		 
 	   }
 	   
 	   else  {
 		   imgtitan=new Image("Runrtpng.png");
 		   ivtitan=new ImageView(imgtitan);
 		  ivtitan.setFitHeight(100);
 		   
 	   }
 	  sptitan.getChildren().addAll(ivtitan,txttitan);
 	  sptitan.setLayoutX(t.getDistance());
 	   return(sptitan);
 	   
    }
    
    private void addtoleast() {
    
    	Lane lstdngr=Battle.getLanes().peek();
    	PriorityQueue<Titan> pqt=new PriorityQueue<Titan>();
   
    	if(lstdngr==Battle.getOriginalLanes().get(0)) {
    		
    		an1.getChildren().clear();
    		StackPane temprndm1;
    		for(int i=0;i<lstdngr.getTitans().size();i++) {
    			Titan top=lstdngr.getTitans().poll();
    			temprndm1=addTitanbutt(top);
    			temprndm1.setLayoutY((int)Math.random()*(150-50+1)+50);
    			an1.getChildren().add(temprndm1);
    			pqt.add(top);
    			
    		}}
    		else if(lstdngr==Battle.getOriginalLanes().get(1)) {
    			an2.getChildren().clear();
    			StackPane temprndm2;
        		for(int i=0;i<lstdngr.getTitans().size();i++) {
        			Titan top=lstdngr.getTitans().poll();
        			temprndm2=addTitanbutt(top);
        			temprndm2.setLayoutY((int)Math.random()*(350-150+1)+150);
        			an2.getChildren().add(temprndm2);
        			pqt.add(top);
        			
        		}}
        		
        			
    		
        	
    	
    		else if(lstdngr==Battle.getOriginalLanes().get(2)) {
    			
    			an3.getChildren().clear();
    			StackPane temprndm3;
        		for(int i=0;i<lstdngr.getTitans().size();i++) {
        			Titan top=lstdngr.getTitans().poll();
        			temprndm3=addTitanbutt(top);
        			temprndm3.setLayoutY((int)Math.random()*(650-400+1)+400);
        			an3.getChildren().add(temprndm3);
        			pqt.add(top);
        			
        		}}
    	 lstdngr.getTitans().addAll(pqt);}
        	
    	
    
    
    private void addtoleasthrd() {
    	Lane lstdngr=Battle2.getLanes().peek();
    	PriorityQueue<Titan> pqt=new PriorityQueue<Titan>();
   
    	if(lstdngr==Battle2.getOriginalLanes().get(0)) {
    		an1h.getChildren().clear();
    		StackPane temprndm4;
    		for(int i=0;i<lstdngr.getTitans().size();i++) {
    			Titan top=lstdngr.getTitans().poll();
    			temprndm4=addTitanbutt(top);
    			temprndm4.setLayoutY((int)Math.random()*(150-50+1)+50);
    			an1h.getChildren().add(temprndm4);
    			pqt.add(top);
    			
    		}}
    		else if(lstdngr==Battle2.getOriginalLanes().get(1)) {
    			an2h.getChildren().clear();
    			StackPane temprndm6;
        		for(int i=0;i<lstdngr.getTitans().size();i++) {
        			Titan top=lstdngr.getTitans().poll();
        			temprndm6=addTitanbutt(top);
        			temprndm6.setLayoutY((int)Math.random()*(320-180+1)+180);
        			an2h.getChildren().add(temprndm6);
        			pqt.add(top);
        			
    		}
        	
    	}
    		else if(lstdngr==Battle2.getOriginalLanes().get(2)) {
    			an3h.getChildren().clear();
    			StackPane temprndm7;
        		for(int i=0;i<lstdngr.getTitans().size();i++) {
        			Titan top=lstdngr.getTitans().poll();
        			temprndm7=addTitanbutt(top);
        			temprndm7.setLayoutY((int)Math.random()*(500-350+1)+350);
        			an3h.getChildren().add(temprndm7);
        			pqt.add(top);
        			
    		}
        	
    	}
else if(lstdngr==Battle2.getOriginalLanes().get(3)) {
	an4h.getChildren().clear();
	StackPane temprndm8;
        		for(int i=0;i<lstdngr.getTitans().size();i++) {
        			Titan top=lstdngr.getTitans().poll();
        			temprndm8=addTitanbutt(top);
        			temprndm8.setLayoutY((int)Math.random()*(650-520+1)+520);
        			an4h.getChildren().add(temprndm8);
        			pqt.add(top);
        			
    		}
        	
    	}
else if(lstdngr==Battle2.getOriginalLanes().get(4)) {
	an5h.getChildren().clear();
	StackPane temprndm9;
	for(int i=0;i<lstdngr.getTitans().size();i++) {
		Titan top=lstdngr.getTitans().poll();
		temprndm9=addTitanbutt(top);
		temprndm9.setLayoutY((int)Math.random()*(800-625+1)+625);
		an5h.getChildren().add(temprndm9);
		pqt.add(top);
		
}

}
   lstdngr.getTitans().addAll(pqt); }
    
 
	
	

	
	
		
	
	
	

	public void start(Stage primaryStage) {
		try {
			 root1 = new AnchorPane();
		    scene1 = new Scene(root1,800,800);
			scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("AttackOnTitans");
			icn=new Image("icon.jpeg");
			primaryStage.getIcons().add(icn);
			img=new Image("oopott.png");
			viw=new ImageView(img);
			viw.setFitHeight(900);
			viw.setFitWidth(1500);
			root1.getChildren().add(viw);
			start=new Button(">Start");
			start.setStyle("-fx-bacground-color:transparent; -fx-border-width: 0; -fx-border-color: transparent;");
			start.setLayoutX(670);
			start.setLayoutY(500);
			start.setFont(new Font("Papyrus",40));
			root1.getChildren().add(start);
			start.setOpacity(0.6);
			quit=new Button(">Quit");
			quit.setStyle("-fx-bacground-color:transparent; -fx-border-width: 0; -fx-border-color: transparent;");
			quit.setLayoutX(670);
			quit.setLayoutY(700);
			quit.setFont(new Font("Papyrus",40));
			root1.getChildren().add(quit);
			quit.setOpacity(0.6);
			lname=new Label("Attack on Titans");
			lname.setLayoutX(550);
			lname.setLayoutY(400);
			lname.setTextFill(Color.ORANGERED);
			lname.setFont(new Font("Papyrus",50));
			root1.getChildren().add(lname);
			start.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent event) {
					primaryStage.setScene(sceneinst);
				}
			});
			
			quit.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent event) {
					Platform.exit();
				}
			});
			
			
		
			
			/////////scene2//////
			
			
				root2 = new AnchorPane();
			  scene2=new Scene(root2,1000,1000);
			  easy=new Button(">Easy");
			hard=new Button(">Hard");
			img2=new Image("howhowa.jpg");
			viw2 =new ImageView(img2);
			viw2.setFitHeight(900);
			viw2.setFitWidth(1500);
			root2.getChildren().add(viw2);
			easy.setLayoutX(100);
			hard.setLayoutX(100);
			easy.setLayoutY(600);
			hard.setLayoutY(300);
			easy.setFont(new Font("Papyrus",70));
			hard.setFont(new Font("Papyrus",70));
			easy.setTextFill(Color.ORANGERED);
			hard.setTextFill(Color.ORANGERED);
			hard.setOpacity(0.75);
			easy.setOpacity(0.75);
			root2.getChildren().add(easy);
			root2.getChildren().add(hard);
			easy.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent event) {
				
					primaryStage.setScene(easyscene);
					
				}
				
				
			});
			hard.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent event) {
					primaryStage.setScene(hardscene);
				}
				
				
			});
			
			
			
			////////easy scene///////
			root3 =new AnchorPane();
			pc=new Button();
			snp=new Button();
            trp=new Button();
	        w4=new Button();
	        bcg=new Image("mohmedff.jpeg");
	        bvv=new ImageView(bcg);
	        bvv.setFitHeight(900);
	        bvv.setFitWidth(1600);
	        bvv.setOpacity(0.75);
	        root3.getChildren().add(bvv);
	     
	        pc.setPrefHeight(250);
	        snp.setPrefHeight(200);
	        trp.setPrefHeight(200);
	        w4.setPrefHeight(200);
	        pc.setPrefWidth(80);
	        w4.setPrefWidth(80);
	        trp.setPrefWidth(80);
	        snp.setPrefWidth(80);
	        wshop= new VBox(pc,snp,trp,w4);
	        wshop.setLayoutX(170);
	        wshop.setLayoutY(50);
	        root3.getChildren().add(wshop);
	        Battle=new Battle(1,0,400,3,250);
	        WeaponRegistry xpc=Battle.getWeaponFactory().getWeaponShop().get(1);
	        WeaponRegistry xtrp=Battle.getWeaponFactory().getWeaponShop().get(4);
	        WeaponRegistry xsnp=Battle.getWeaponFactory().getWeaponShop().get(2);
	        WeaponRegistry xw4=Battle.getWeaponFactory().getWeaponShop().get(3);
	        
	        String spc="Name:"+xpc.getName()+"\n"+"Damage:"+xpc.getDamage()+"\n"+"Price:"+xpc.getPrice()+"\n"+"Type: PiercingCannon";
	        String strp="Name:"+ xtrp.getName()+"\n"+"Damage:"+xtrp.getDamage()+"\n"+"Price:"+xtrp.getPrice()+"\n"+"Type:WallTrape";
	        String ssnp="Name:"+xsnp.getName()+"\n"+"Damage:"+xsnp.getDamage()+"\n"+"Price:"+xsnp.getPrice()+"\n"+"Type:SniperCannon";
	        String sw4="Name:"+xw4.getName()+"\n"+"Damage:"+xw4.getDamage()+"\n"+"Price:"+xw4.getPrice()+"\n"+"Type:VolleySpreadCannon";
	        l1=new Label(spc);
	        l2=new Label(strp);
	        l3=new Label(ssnp);
	        l4=new Label(sw4);
	        l5=new Label("WEAPON SHOP");
	       
	        l5.setFont(new Font("Papyrus",20));
	        l1.setTextFill(Color.ORANGERED);
	        l2.setTextFill(Color.ORANGERED);
	        l3.setTextFill(Color.ORANGERED);
	        l4.setTextFill(Color.ORANGERED);
	        l5.setTextFill(Color.ORANGERED);
	        l1.setLayoutX(10);
	        l2.setLayoutX(10);
	        l3.setLayoutX(10);
	        l4.setLayoutX(10);
	        l1.setLayoutY(150);
	        l2.setLayoutY(350);
	        l3.setLayoutY(550);
	        l4.setLayoutY(750);
	        l5.setLayoutX(6);
	        l5.setLayoutY(75);
	        
	        imgpc=new Image("cannon.png");
	        imgsnp=new Image("tb49.jpg");
	        imgtrp=new Image("wlltrp.jpg");
	       
	        
	        viwpc=new ImageView(imgpc);
	        viwpc.setFitHeight(150);
	        viwpc.setFitWidth(70);
	        pc.setGraphic(viwpc);
	        viwsnp =new ImageView(imgtrp);
	        viwsnp.setFitHeight(200);
	        viwsnp.setFitWidth(70);
	        snp.setGraphic(viwsnp);
	        viwtrp =new ImageView(imgsnp);
	        viwtrp.setFitHeight(200);
	        viwtrp.setFitWidth(70);
	        trp.setGraphic(viwtrp);
	        imgw4 =new Image("yout.jpeg");
	        viww4 =new ImageView(imgw4);
	        viww4.setFitHeight(200);
	        viww4.setFitWidth(70);
	        w4.setGraphic(viww4);
	        
	        
	        
	        
	        
	        
	        hb1=new ProgressBar(1);
	        hb1.setPrefHeight(260);
	        hb1.setPrefWidth(10);
	        hb1.setLayoutX(260);
	        hb1.setLayoutY(50);
	        hb1.setStyle("-fx-accent: red;");

	        
	        hb2=new ProgressBar(1);
	        hb2.setPrefHeight(260);
	        hb2.setPrefWidth(10);
	        hb2.setLayoutX(260);
	        hb2.setLayoutY(320);
	        hb2.setStyle("-fx-accent: red;");
	        
	        hb3=new ProgressBar(1);
	        hb3.setPrefHeight(260);
	        hb3.setPrefWidth(10);
	        hb3.setLayoutX(260);
	        hb3.setLayoutY(600);
	        hb3.setStyle("-fx-accent: red;");
	       
	        
	        root3.getChildren().add(l1);
	        root3.getChildren().add(l2);
	        root3.getChildren().add(l3);
	        root3.getChildren().add(l4);
	        root3.getChildren().add(l5);
	        root3.getChildren().add(hb1);
	        root3.getChildren().add(hb2);
	        root3.getChildren().add(hb3);
	        
	        a1=new AnchorPane();
	        a1.setPrefHeight(150);
	        a1.setPrefWidth(400);
	        a1.setLayoutX(200);
	        a1.setLayoutY(100);
	        root3.getChildren().add(a1);
	        scr=new Label("Score:"+Battle.getScore());
	        scr.setFont(new Font("Papyrus",20));
	        root3.getChildren().add(scr);
	       rsc=new Label("Resourses:"+Battle.getResourcesGathered());
	       trn=new Label("Turn:"+Battle.getNumberOfTurns());
	       phs=new Label("Phase: "+Battle.getBattlePhase());
	       lan = new Label("Lane: " + Battle.getOriginalLanes().size() );
	       rsc.setLayoutX(200);
	       trn.setLayoutX(400);
	       phs.setLayoutX(600);
	       lan.setLayoutX(800);
	       rsc.setFont(new Font("Papyrus",20));
	       phs.setFont(new Font("Papyrus",20));
	       trn.setFont(new Font("Papyrus",20));
	       lan.setFont(new Font("Papyrus",20));
	       root3.getChildren().add(rsc);
	       root3.getChildren().add(trn);
	       root3.getChildren().add(phs);
	       root3.getChildren().add(lan);
	       
	       
	       
	       ig1 = new Image ("cannon.png");
	       ig2 = new Image ("wlltrp.jpg");
	       ig3 = new Image ("tb49.jpg");
	       ig4 = new Image ("yout.jpeg");
	       
	       
	       
	       im1 = new ImageView(ig1);
	       im2 = new ImageView(ig2);
	       im3 = new ImageView(ig3);
	       im4 = new ImageView(ig4);

	       im5 = new ImageView(ig1);
	       im6 = new ImageView(ig2);
	       im7 = new ImageView(ig3);
	       im8 = new ImageView(ig4);

	       im9 = new ImageView(ig1);
	       im10 = new ImageView(ig2);
	       im11 = new ImageView(ig3);
	       im12 = new ImageView(ig4);
	       
	       im1.setFitHeight(60);
	       im1.setFitWidth(60);
	  
	       
	       im2.setFitHeight(60);
	       im2.setFitWidth(60);
	       
	       im3.setFitHeight(60);
	       im3.setFitWidth(60);
	       
	       im4.setFitHeight(60);
	       im4.setFitWidth(60);
	       
	       im5.setFitHeight(60);
	       im5.setFitWidth(60);
	  
	       im6.setFitHeight(60);
	       im6.setFitWidth(60);
	  
	       im7.setFitHeight(60);
	       im7.setFitWidth(60);
	  
	       im8.setFitHeight(60);
	       im8.setFitWidth(60);
	  
	       im9.setFitHeight(60);
	       im9.setFitWidth(60);
	      
	       im10.setFitHeight(60);
	       im10.setFitWidth(60);
	  
	       im11.setFitHeight(60);
	       im11.setFitWidth(60);
	  
	       im12.setFitHeight(60);
	       im12.setFitWidth(60);
	  
	  
	       
	       
	       t1 = new Text("0");
	       t2 = new Text("0");
	       t3 = new Text("0");
	       t4 = new Text("0");
	       t5 = new Text("0");
	       t6 = new Text("0");
	       t7 = new Text("0");
	       t8 = new Text("0");
	       t9 = new Text("0");
	       t10 = new Text("0");
	       t11= new Text("0");
	       t12= new Text("0");
	       
	       im1.setOpacity(0.4);
	       im2.setOpacity(0.4);
	       im3.setOpacity(0.4);
	       im4.setOpacity(0.4);
	       im5.setOpacity(0.4);
	       im6.setOpacity(0.4);
	       im7.setOpacity(0.4);
	       im8.setOpacity(0.4);
	       im9.setOpacity(0.4);
	       im10.setOpacity(0.4);
	       im11.setOpacity(0.4);
	       im12.setOpacity(0.4);
	       
	       
	       sp1=new StackPane(im1,t1);
	       sp2=new StackPane(im2,t2);
	       sp3=new StackPane(im3,t3);
	       sp4=new StackPane(im4,t4);
	       sp5=new StackPane(im5,t5);
	       sp6=new StackPane(im6,t6);
	       sp7=new StackPane(im7,t7);
	       sp8=new StackPane(im8,t8);
	       sp9=new StackPane(im9,t9);
	       sp10=new StackPane(im10,t10);
	       sp11=new StackPane(im11,t11);
	       sp12=new StackPane(im12,t12);
	       
	       wall1=new VBox();
	       wall2=new VBox();
	       wall3=new VBox();
	       
	       
	       wall1.setLayoutX(270);
	       wall1.setLayoutY(60);
	       
	       wall2.setLayoutX(270);
	       wall2.setLayoutY(320);
	       
	       wall3.setLayoutX(270);
	       wall3.setLayoutY(600);
	       
	       
	      wall1.getChildren().addAll(sp1,sp2,sp3,sp4);
	      wall2.getChildren().addAll(sp5,sp6,sp7,sp8);
	      wall3.getChildren().addAll(sp9,sp10,sp11,sp12);
	     
	      
	       
	      root3.getChildren().add(wall1);
	       root3.getChildren().add(wall2);
	       root3.getChildren().add(wall3);
	     
	       an1=new AnchorPane();
	       an2=new AnchorPane();
	       an3=new AnchorPane();
	       an1.setLayoutX(330);
	       an2.setLayoutX(330);
	       an3.setLayoutX(330);
	       an1.setLayoutY(60);
	       an2.setLayoutY(330);
	       an3.setLayoutY(600);
	       an2.setPrefWidth(700);
	       an2.setPrefHeight(240);
	       an3.setPrefWidth(700);
	       an3.setPrefHeight(240);
	       an1.setPrefWidth(700);
	       an1.setPrefHeight(240);
	      
	       pass=new Button("Pass Turn");
	       pass.setLayoutX(1150);
	       pass.setOpacity(0.4);
	       pass.setPrefHeight(30);
	       pass.setPrefWidth(300);
	       rb1= new RadioButton("lane1");
	       rb1.setLayoutX(900);
	       rb1.setLayoutY(10);
	       rb1.setSelected(true);
	
	       rb2= new RadioButton("lane2");
	       rb2.setLayoutX(975);
	       rb2.setLayoutY(10);
	       rb3= new RadioButton("lane3");
	       rb3.setLayoutX(1050);
	       rb3.setLayoutY(10);
	       tg=new ToggleGroup();
	       rb1.setToggleGroup(tg);
	       rb2.setToggleGroup(tg);
	       rb3.setToggleGroup(tg);
	       
	       dngr1=new Label("Danger:"+Battle.getOriginalLanes().get(0).getDangerLevel());
	       dngr2=new Label("Danger:"+Battle.getOriginalLanes().get(1).getDangerLevel());
	       dngr3=new Label("Danger:"+Battle.getOriginalLanes().get(2).getDangerLevel());
	       
	       dngr1.setLayoutY(30);
	       dngr1.setLayoutX(900);
	       
	       dngr2.setLayoutY(30);
	       dngr2.setLayoutX(980);
	       
	       dngr3.setLayoutY(30);
	       dngr3.setLayoutX(1050);
	       
	     
	      
	       
	       root3.getChildren().add(dngr3);
	       root3.getChildren().add(dngr2);
	       root3.getChildren().add(dngr1);
	       root3.getChildren().add(rb1);
	       root3.getChildren().add(rb2);
	       root3.getChildren().add(rb3);
	      
	       root3.getChildren().add(pass);
	       root3.getChildren().add(an1);
	       root3.getChildren().add(an2);
	       root3.getChildren().add(an3);
	      
	       
	       
	       
	       
	      
	    
	       
	      
	       
	       
	       pass.setOnAction(new EventHandler<ActionEvent>(){/////refresherssss//////
	    	   public void handle(ActionEvent event1) {
	    		   gameovercheckeasy();
	    		   Battle.passTurn();
	    		  
	    		   trn.setText("Turn: "+Battle.getNumberOfTurns());
	    		   rsc.setText("Resources: "+Battle.getResourcesGathered());
	    		   scr.setText("Score: "+Battle.getScore());
	    		   phs.setText("Phase: "+Battle.getBattlePhase());
	    		   addtoleast();
	    		   Updatehbeasy();
	    		   gameovercheckeasy();
	    		   
	    		   
	    	   }
	       });
	       
	       
	       pc.setOnAction(new EventHandler<ActionEvent>(){
	    	   public void handle(ActionEvent event1) {
	    		   int c=0;
	    		   gameovercheckeasy();
	    		   ArrayList<Weapon> tmp=new  ArrayList<Weapon>();
	    		   if(rb1.isSelected()) {
	    			   try {
							Battle.purchaseWeapon(1, Battle.getOriginalLanes().get(0));
							
						} catch (InsufficientResourcesException | InvalidLaneException e) {
							Alert alert=new Alert(Alert.AlertType.ERROR);
							alert.setHeaderText("Invalid Selection");
							alert.setContentText(e.getMessage());
							alert.initOwner(primaryStage);
							alert.showAndWait();}
	    			   tmp=Battle.getOriginalLanes().get(0).getWeapons();
	    			   
	    			   for(int i=0;i<tmp.size();i++) {
	    				   if(tmp.get(i) instanceof PiercingCannon ) {
	    					   c++;  
	    					   
	    				   }}
	    				 
	    				  t1.setText(Integer.toString(c));
	    			   }
	    			 
	    		   
	    		   else if(rb2.isSelected()) {
	    			   try {
							Battle.purchaseWeapon(1, Battle.getOriginalLanes().get(1));
							
						} catch (InsufficientResourcesException | InvalidLaneException e) {
							Alert alert=new Alert(Alert.AlertType.ERROR);
							alert.setHeaderText("Invalid Selection");
							alert.setContentText(e.getMessage());
							alert.initOwner(primaryStage);
							alert.showAndWait();}
	    			   
	    			   
	    			   
	    			   tmp=Battle.getOriginalLanes().get(1).getWeapons();
	    			   
	    			   for(int i=0;i<tmp.size();i++) {
	    				   if(tmp.get(i) instanceof PiercingCannon ) {
	    					   c++;  
	    					   
	    				   }
	    				 
	    				  t5.setText(Integer.toString(c));
	    			   }
	    		   }
	    		   else if(rb3.isSelected()) {
	    			   try {
							Battle.purchaseWeapon(1, Battle.getOriginalLanes().get(2));
							
						} catch (InsufficientResourcesException | InvalidLaneException e) {
							Alert alert=new Alert(Alert.AlertType.ERROR);
							alert.setHeaderText("Invalid Selection");
							alert.setContentText(e.getMessage());
							alert.initOwner(primaryStage);
							alert.showAndWait();}
	    			   
	    			   
	    			   
	    			   tmp=Battle.getOriginalLanes().get(2).getWeapons();
	    			   
	    			   for(int i=0;i<tmp.size();i++) {
	    				   if(tmp.get(i) instanceof PiercingCannon ) {
	    					   c++;  
	    					   
	    				   }
	    				 
	    				  t9.setText(Integer.toString(c));
	    			   }
	    		   }
	    		   rsc.setText("Resources: "+Battle.getResourcesGathered()); 
	    		   trn.setText("Turn: "+Battle.getNumberOfTurns());
	    		   scr.setText("Score: "+Battle.getScore());
	    		   phs.setText("Phase: "+Battle.getBattlePhase());
	    		   dngr1.setText("Danger: "+Battle.getOriginalLanes().get(0).getDangerLevel());
	    		   dngr2.setText("Danger: "+Battle.getOriginalLanes().get(1).getDangerLevel());
	    		   dngr3.setText("Danger: "+Battle.getOriginalLanes().get(2).getDangerLevel());
	    		   addtoleast();
	    		   Updatehbeasy();
	    		   gameovercheckeasy();
	    		   }
	       
	       });
	       
	       trp.setOnAction(new EventHandler<ActionEvent>(){
	    	   public void handle(ActionEvent event1) {
	    		   gameovercheckeasy();
	    		   int c=0;
	    		   ArrayList<Weapon> tmp=new  ArrayList<Weapon>();
	    		   if(rb1.isSelected()) {
	    			   try {
							Battle.purchaseWeapon(2, Battle.getOriginalLanes().get(0));
							
						} catch (InsufficientResourcesException | InvalidLaneException e) {
							Alert alert=new Alert(Alert.AlertType.ERROR);
							alert.setHeaderText("Invalid Selection");
							alert.setContentText(e.getMessage());
							alert.initOwner(primaryStage);
							alert.showAndWait();}
	    			   tmp=Battle.getOriginalLanes().get(0).getWeapons();
	    			   
	    			   for(int i=0;i<tmp.size();i++) {
	    				   if(tmp.get(i) instanceof SniperCannon ) {
	    					   c++;  
	    					   
	    				   }}
	    				 
	    				  t3.setText(Integer.toString(c));
	    			   }
	    			 
	    		   
	    		   else if(rb2.isSelected()) {
	    			   try {
							Battle.purchaseWeapon(2, Battle.getOriginalLanes().get(1));
							
						} catch (InsufficientResourcesException | InvalidLaneException e) {
							Alert alert=new Alert(Alert.AlertType.ERROR);
							alert.setHeaderText("ERROR");
							alert.setContentText(e.getMessage());
							alert.initOwner(primaryStage);
							alert.showAndWait();}
	    			   
	    			   
	    			   
	    			   tmp=Battle.getOriginalLanes().get(1).getWeapons();
	    			   
	    			   for(int i=0;i<tmp.size();i++) {
	    				   if(tmp.get(i) instanceof SniperCannon ) {
	    					   c++;  
	    					   
	    				   }
	    				 
	    				  t7.setText(Integer.toString(c));
	    			   }
	    		   }
	    		   else if(rb3.isSelected()) {
	    			   try {
							Battle.purchaseWeapon(2, Battle.getOriginalLanes().get(2));
							
						} catch (InsufficientResourcesException | InvalidLaneException e) {
							Alert alert=new Alert(Alert.AlertType.ERROR);
							alert.setHeaderText("ERROR");
							alert.setContentText(e.getMessage());
							alert.initOwner(primaryStage);
							alert.showAndWait();
							}
	    			   
	    			   
	    			   
	    			   tmp=Battle.getOriginalLanes().get(2).getWeapons();
	    			   
	    			   for(int i=0;i<tmp.size();i++) {
	    				   if(tmp.get(i) instanceof SniperCannon ) {
	    					   c++;  
	    					   
	    				   }
	    				 
	    				  t11.setText(Integer.toString(c));
	    			   }
	    		   }
	    		   rsc.setText("Resources: "+Battle.getResourcesGathered()); 
	    		   trn.setText("Turn: "+Battle.getNumberOfTurns());
	    		   scr.setText("Score: "+Battle.getScore());
	    		   phs.setText("Phase: "+Battle.getBattlePhase());
	    		   dngr1.setText("Danger: "+Battle.getOriginalLanes().get(0).getDangerLevel());
	    		   dngr2.setText("Danger: "+Battle.getOriginalLanes().get(1).getDangerLevel());
	    		   dngr3.setText("Danger: "+Battle.getOriginalLanes().get(2).getDangerLevel());
	    		   addtoleast();
	    		   Updatehbeasy();
	    		   gameovercheckeasy();
	    		   
	    		   }
	       
	       });
	       
	      snp.setOnAction(new EventHandler<ActionEvent>(){
	    	   public void handle(ActionEvent event1) {
	    		   gameovercheckeasy();
	    		   int c=0;
	    		   ArrayList<Weapon> tmp=new  ArrayList<Weapon>();
	    		   if(rb1.isSelected()) {
	    			   try {
							Battle.purchaseWeapon(4, Battle.getOriginalLanes().get(0));
							
						} catch (InsufficientResourcesException | InvalidLaneException e) {
							Alert alert=new Alert(Alert.AlertType.ERROR);
							alert.setHeaderText("Invalid Selection");
							alert.setContentText(e.getMessage());
							alert.initOwner(primaryStage);
							alert.showAndWait();}
	    			   tmp=Battle.getOriginalLanes().get(0).getWeapons();
	    			   
	    			   for(int i=0;i<tmp.size();i++) {
	    				   if(tmp.get(i) instanceof WallTrap) {
	    					   c++;  
	    					   
	    				   }}
	    				 
	    				  t2.setText(Integer.toString(c));
	    			   }
	    			 
	    		   
	    		   else if(rb2.isSelected()) {
	    			   try {
							Battle.purchaseWeapon(4, Battle.getOriginalLanes().get(1));
							
						} catch (InsufficientResourcesException | InvalidLaneException e) {
							Alert alert=new Alert(Alert.AlertType.ERROR);
							alert.setHeaderText("Invalid Selection");
							alert.setContentText(e.getMessage());
							alert.initOwner(primaryStage);
							alert.showAndWait();}
	    			   
	    			   
	    			   
	    			   tmp=Battle.getOriginalLanes().get(1).getWeapons();
	    			   
	    			   for(int i=0;i<tmp.size();i++) {
	    				   if(tmp.get(i) instanceof WallTrap ) {
	    					   c++;  
	    					   
	    				   }
	    				 
	    				  t6.setText(Integer.toString(c));
	    			   }
	    		   }
	    		   else if(rb3.isSelected()) {
	    			   try {
							Battle.purchaseWeapon(4, Battle.getOriginalLanes().get(2));
							
						} catch (InsufficientResourcesException | InvalidLaneException e) {
							Alert alert=new Alert(Alert.AlertType.ERROR);
							alert.setHeaderText("Invalid Selection");
							alert.setContentText(e.getMessage());
							alert.initOwner(primaryStage);
							alert.showAndWait();}
	    			   
	    			   
	    			   
	    			   tmp=Battle.getOriginalLanes().get(2).getWeapons();
	    			   
	    			   for(int i=0;i<tmp.size();i++) {
	    				   if(tmp.get(i) instanceof WallTrap ) {
	    					   c++;  
	    					   
	    				   }
	    				 
	    				  t10.setText(Integer.toString(c));
	    			   }
	    		   }
	    		   rsc.setText("Resources: "+Battle.getResourcesGathered()); 
	    		   trn.setText("Turn: "+Battle.getNumberOfTurns());
	    		   scr.setText("Score: "+Battle.getScore());
	    		   phs.setText("Phase: "+Battle.getBattlePhase());
	    		   dngr1.setText("Danger: "+Battle.getOriginalLanes().get(0).getDangerLevel());
	    		   dngr2.setText("Danger: "+Battle.getOriginalLanes().get(1).getDangerLevel());
	    		   dngr3.setText("Danger: "+Battle.getOriginalLanes().get(2).getDangerLevel());
	    		   addtoleast();
	    		   gameovercheckeasy();
	    		   }
	       
	       });
	       w4.setOnAction(new EventHandler<ActionEvent>(){
	    	   public void handle(ActionEvent event1) {
	    		   gameovercheckeasy();
	    		   int c=0;
	    		   ArrayList<Weapon> tmp=new  ArrayList<Weapon>();
	    		   if(rb1.isSelected()) {
	    			   try {
							Battle.purchaseWeapon(3, Battle.getOriginalLanes().get(0));
							
						} catch (InsufficientResourcesException | InvalidLaneException e) {
							Alert alert=new Alert(Alert.AlertType.ERROR);
							alert.setHeaderText("Invalid Selection");
							alert.setContentText(e.getMessage());
							alert.initOwner(primaryStage);
							alert.showAndWait();}
	    			   tmp=Battle.getOriginalLanes().get(0).getWeapons();
	    			   
	    			   for(int i=0;i<tmp.size();i++) {
	    				   if(tmp.get(i) instanceof VolleySpreadCannon ) {
	    					   c++;  
	    					   
	    				   }}
	    				 
	    				  t4.setText(Integer.toString(c));
	    			   }
	    			 
	    		   
	    		   else if(rb2.isSelected()) {
	    			   try {
							Battle.purchaseWeapon(3, Battle.getOriginalLanes().get(1));
							
						} catch (InsufficientResourcesException | InvalidLaneException e) {
							Alert alert=new Alert(Alert.AlertType.ERROR);
							alert.setHeaderText("Invalid Selection");
							alert.setContentText(e.getMessage());
							alert.initOwner(primaryStage);
							alert.showAndWait();}
	    			   
	    			   
	    			   
	    			   tmp=Battle.getOriginalLanes().get(1).getWeapons();
	    			   
	    			   for(int i=0;i<tmp.size();i++) {
	    				   if(tmp.get(i) instanceof VolleySpreadCannon ) {
	    					   c++;  
	    					   
	    				   }
	    				 
	    				  t8.setText(Integer.toString(c));
	    			   }
	    		   }
	    		   else if(rb3.isSelected()) {
	    			   try {
							Battle.purchaseWeapon(3, Battle.getOriginalLanes().get(2));
							
						} catch (InsufficientResourcesException | InvalidLaneException e) {
							Alert alert=new Alert(Alert.AlertType.ERROR);
							alert.setHeaderText("Invalid Selection");
							alert.setContentText(e.getMessage());
							alert.initOwner(primaryStage);
							alert.showAndWait();}
	    			   
	    			   
	    			   
	    			   tmp=Battle.getOriginalLanes().get(2).getWeapons();
	    			   
	    			   for(int i=0;i<tmp.size();i++) {
	    				   if(tmp.get(i) instanceof VolleySpreadCannon ) {
	    					   c++;  
	    					   
	    				   }
	    				 
	    				  t12.setText(Integer.toString(c));
	    			   }
	    		   }
	    		   
	    		   rsc.setText("Resources: "+Battle.getResourcesGathered()); 
	    		   trn.setText("Turn: "+Battle.getNumberOfTurns());
	    		  scr.setText("Score: "+Battle.getScore());
	    		  phs.setText("Phase: "+Battle.getBattlePhase());
	    		  dngr1.setText("Danger: "+Battle.getOriginalLanes().get(0).getDangerLevel());
	    		   dngr2.setText("Danger: "+Battle.getOriginalLanes().get(1).getDangerLevel());
	    		   dngr3.setText("Danger: "+Battle.getOriginalLanes().get(2).getDangerLevel());
	    		   addtoleast();
	    		   Updatehbeasy();
	    		   gameovercheckeasy();
	    		   }
	       
	       });
	       
	       

	   
	      
	       
	       /////scene3/////
	      
	       
	       root4=new AnchorPane();
	       Battle2=new Battle(1,0,300,5,125);
	       imgppr= new Image("lava.png");
	       
	       vpp=new ImageView(imgppr);
	       vpp.setFitHeight(900);
	        vpp.setFitWidth(1600);
	
	       vpp.setOpacity(0.7);
	       root4.getChildren().add(vpp);
	       pchrd=new Button();
			snphrd=new Button();
           trphrd=new Button();
	        w4hrd=new Button();
	       pchrd.setPrefHeight(250);
	        snphrd.setPrefHeight(200);
	        trphrd.setPrefHeight(200);
	        w4hrd.setPrefHeight(200);
	        pchrd.setPrefWidth(80);
	        w4hrd.setPrefWidth(80);
	        trphrd.setPrefWidth(80);
	        snphrd.setPrefWidth(80);
	        wshophrd= new VBox(pchrd,snphrd,trphrd,w4hrd);
	        wshophrd.setLayoutX(170);
	        wshophrd.setLayoutY(50);
	        root4.getChildren().add(wshophrd);
	       
	        WeaponRegistry xpch=Battle2.getWeaponFactory().getWeaponShop().get(1);
	        WeaponRegistry xtrph=Battle2.getWeaponFactory().getWeaponShop().get(4);
	        WeaponRegistry xsnph=Battle2.getWeaponFactory().getWeaponShop().get(2);
	        WeaponRegistry xw4h=Battle2.getWeaponFactory().getWeaponShop().get(3);
	        
	        String spchrd="Name:"+xpch.getName()+"\n"+"Damage:"+xpch.getDamage()+"\n"+"Price:"+xpch.getPrice()+"\n"+"Type: PiercingCannon";
	        String strphrd="Name:"+ xtrph.getName()+"\n"+"Damage:"+xtrph.getDamage()+"\n"+"Price:"+xtrph.getPrice()+"\n"+"Type:WallTrape";
	        String ssnphrd="Name:"+xsnph.getName()+"\n"+"Damage:"+xsnph.getDamage()+"\n"+"Price:"+xsnph.getPrice()+"\n"+"Type:SniperCannon";
	        String sw4hrd="Name:"+xw4h.getName()+"\n"+"Damage:"+xw4h.getDamage()+"\n"+"Price:"+xw4h.getPrice()+"\n"+"Type:VolleySpreadCannon";
	        l1hrd=new Label(spchrd);
	        l2hrd=new Label(strphrd);
	        l3hrd=new Label(ssnphrd);
	        l4hrd=new Label(sw4hrd);
	        l5hrd=new Label("WEAPON SHOP");
	       
	        l5hrd.setFont(new Font("Papyrus",20));
	        l1hrd.setTextFill(Color.ORANGERED);
	        l2hrd.setTextFill(Color.ORANGERED);
	        l3hrd.setTextFill(Color.ORANGERED);
	        l4hrd.setTextFill(Color.ORANGERED);
	        l5hrd.setTextFill(Color.ORANGERED);
	        l1hrd.setLayoutX(10);
	        l2hrd.setLayoutX(10);
	        l3hrd.setLayoutX(10);
	        l4hrd.setLayoutX(10);
	        l1hrd.setLayoutY(150);
	        l2hrd.setLayoutY(350);
	        l3hrd.setLayoutY(550);
	        l4hrd.setLayoutY(750);
	        l5hrd.setLayoutX(6);
	        l5hrd.setLayoutY(75);
	        root4.getChildren().add(l1hrd);
	        root4.getChildren().add(l2hrd);
	        root4.getChildren().add(l3hrd);
	        root4.getChildren().add(l4hrd);
	        root4.getChildren().add(l5hrd);
	        
	        
	        
	        imgpch=new Image("cannon.png");
	        imgsnph=new Image("tb49.jpg");
	        imgtrph=new Image("wlltrp.jpg");
	       
	        
	        viwpch=new ImageView(imgpch);
	        viwpch.setFitHeight(150);
	        viwpch.setFitWidth(70);
	        pchrd.setGraphic(viwpc);
	        viwsnph =new ImageView(imgtrph);
	        viwsnph.setFitHeight(200);
	        viwsnph.setFitWidth(70);
	        snphrd.setGraphic(viwsnp);
	        viwtrph =new ImageView(imgsnph);
	        viwtrph.setFitHeight(200);
	        viwtrph.setFitWidth(70);
	        trphrd.setGraphic(viwtrph);
	        imgw4h =new Image("yout.jpeg");
	        viww4h =new ImageView(imgw4h);
	        viww4h.setFitHeight(200);
	        viww4h.setFitWidth(70);
	        w4hrd.setGraphic(viww4h);
	        
	        
	  
	     
	      scr2=new Label("Score:"+Battle2.getScore());
	        scr2.setFont(new Font("Papyrus",20));
	        
	       rsc2=new Label("Resourses:"+Battle2.getResourcesGathered());
	       trn2=new Label("Turn:"+Battle2.getNumberOfTurns());
	       phs2=new Label("Phase: "+Battle2.getBattlePhase());
	       lan2 = new Label("Lane: " + Battle2.getOriginalLanes().size() );
	       rsc2.setLayoutX(200);
	       trn2.setLayoutX(400);
	       phs2.setLayoutX(600);
	       lan2.setLayoutX(800);
	       rsc2.setFont(new Font("Papyrus",20));
	       phs2.setFont(new Font("Papyrus",20));
	       trn2.setFont(new Font("Papyrus",20));
	       lan2.setFont(new Font("Papyrus",20));
	       root4.getChildren().add(rsc2);
	       root4.getChildren().add(trn2);
	       root4.getChildren().add(phs2);
	       root4.getChildren().add(lan2);
	       root4.getChildren().add(scr2);
	       
	       passhrd=new Button("Pass Turn");
	       passhrd.setLayoutX(1300);
	       passhrd.setOpacity(0.4);
	       passhrd.setPrefHeight(30);
	       passhrd.setPrefWidth(100);
	       rb1hrd= new RadioButton("lane1");
	       rb1hrd.setLayoutX(900);
	       rb1hrd.setLayoutY(10);
	       rb1hrd.setSelected(true);
	       rb2hrd= new RadioButton("lane2");
	       rb2hrd.setLayoutX(970);
	       rb2hrd.setLayoutY(10);
	       rb3hrd= new RadioButton("lane3");
	       rb3hrd.setLayoutX(1050);
	       rb3hrd.setLayoutY(10);
	       rb4hrd= new RadioButton("lane4");
	       rb4hrd.setLayoutX(1120);
	       rb4hrd.setLayoutY(10);
	       rb5hrd= new RadioButton("lane5");
	       rb5hrd.setLayoutX(1200);
	       rb5hrd.setLayoutY(10);
	 
	       
	       tghrd=new ToggleGroup();
	       rb1hrd.setToggleGroup(tg);
	       rb2hrd.setToggleGroup(tg);
	       rb3hrd.setToggleGroup(tg);
	       rb4hrd.setToggleGroup(tg);
	       rb5hrd.setToggleGroup(tg);
	       root4.getChildren().add(rb1hrd);
	       root4.getChildren().add(rb2hrd);
	       root4.getChildren().add(rb3hrd);
	       root4.getChildren().add(rb4hrd);
	       root4.getChildren().add(rb5hrd);
	       root4.getChildren().add(passhrd);
	       
	       dngr1hrd=new Label("Danger:"+Battle2.getOriginalLanes().get(0).getDangerLevel());
	       dngr2hrd=new Label("Danger:"+Battle2.getOriginalLanes().get(1).getDangerLevel());
	       dngr3hrd=new Label("Danger:"+Battle2.getOriginalLanes().get(2).getDangerLevel());
	       dngr4hrd=new Label("Danger:"+Battle2.getOriginalLanes().get(3).getDangerLevel());
	       dngr5hrd=new Label("Danger:"+Battle2.getOriginalLanes().get(4).getDangerLevel());
	       dngr1hrd.setLayoutY(30);
	       dngr1hrd.setLayoutX(880);
	       
	      
	       
	       dngr2hrd.setLayoutY(30);
	       dngr2hrd.setLayoutX(950);
	       
	       dngr3hrd.setLayoutY(30);
	       dngr3hrd.setLayoutX(1020);
	       
	       dngr4hrd.setLayoutY(30);
	       dngr4hrd.setLayoutX(1100);
	       
	       dngr5hrd.setLayoutY(30);
	       dngr5hrd.setLayoutX(1180);
	       
	       
	       

	       an1h=new AnchorPane();
	       an2h=new AnchorPane();
	       an3h=new AnchorPane();
	       an4h=new AnchorPane();
	       an5h=new AnchorPane();
	       an1h.setLayoutX(330);
	       an2h.setLayoutX(330);
	       an3h.setLayoutX(330);
	       an4h.setLayoutX(330);
	       an5h.setLayoutX(330);
	       an1h.setLayoutY(60);
	       an2h.setLayoutY(210);
	       an3h.setLayoutY(390);
	       an4h.setLayoutY(570);
	       an5h.setLayoutY(710);
	       an2h.setPrefWidth(700);
	       an2h.setPrefHeight(160);
	       an3h.setPrefWidth(700);
	       an3h.setPrefHeight(160);
	       an1h.setPrefWidth(700);
	       an1h.setPrefHeight(160);
	       an5h.setPrefWidth(700);
	       an5h.setPrefHeight(160);
	       an4h.setPrefWidth(700);
	       an4h.setPrefHeight(160);
	       
	       root4.getChildren().add(an1h);
	       root4.getChildren().add(an2h);
	       root4.getChildren().add(an3h);
	       root4.getChildren().add(an4h);
	       root4.getChildren().add(an5h);
	       root4.getChildren().add(dngr1hrd);
	       root4.getChildren().add(dngr2hrd);
	       root4.getChildren().add(dngr3hrd);
	       root4.getChildren().add(dngr4hrd);
	       root4.getChildren().add(dngr5hrd);
	      
	       passhrd.setOnAction(new EventHandler<ActionEvent>(){/////refresherssss//////
	    	   public void handle(ActionEvent event1) {
	    		   gameovercheckhard();
	    		   Battle2.passTurn();
	    		   trn2.setText("Turn: "+Battle2.getNumberOfTurns());
	    		   rsc2.setText("Resources: "+Battle2.getResourcesGathered());
	    		   scr2.setText("Score: "+Battle2.getScore());
	    		   phs2.setText("Phase: "+Battle2.getBattlePhase());
	    		   addtoleasthrd();
	    		   Updatehbhard();
	    		   gameovercheckhard();
	    		   
	    	   }
	       });
	       
	       
	       
	       pchrd.setOnAction(new EventHandler<ActionEvent>(){
	    	   public void handle(ActionEvent event1) {
	    		   gameovercheckhard();
	    		   int c=0;
	    		   ArrayList<Weapon> tmp=new  ArrayList<Weapon>();
	    		   if(rb1hrd.isSelected()) {
	    			   try {
							Battle2.purchaseWeapon(1, Battle2.getOriginalLanes().get(0));
							
						} catch (InsufficientResourcesException | InvalidLaneException e) {
							Alert alert=new Alert(Alert.AlertType.ERROR);
							alert.setHeaderText("ERROR");
							alert.setContentText(e.getMessage());
							alert.initOwner(primaryStage);
							alert.showAndWait();}
	    			   tmp=Battle2.getOriginalLanes().get(0).getWeapons();
	    			   
	    			   for(int i=0;i<tmp.size();i++) {
	    				   if(tmp.get(i) instanceof PiercingCannon ) {
	    					   c++;  
	    					   
	    				   }}
	    				 
	    				  t1h.setText(Integer.toString(c));
	    			   }
	    			 
	    		   
	    		   else if(rb2hrd.isSelected()) {
	    			   try {
							Battle2.purchaseWeapon(1, Battle2.getOriginalLanes().get(1));
							
						} catch (InsufficientResourcesException | InvalidLaneException e) {
							Alert alert=new Alert(Alert.AlertType.ERROR);
							alert.setHeaderText("ERROR");
							alert.setContentText(e.getMessage());
							alert.initOwner(primaryStage);
							alert.showAndWait();}
	    			   
	    			   
	    			   
	    			   tmp=Battle2.getOriginalLanes().get(1).getWeapons();
	    			   
	    			   for(int i=0;i<tmp.size();i++) {
	    				   if(tmp.get(i) instanceof PiercingCannon ) {
	    					   c++;  
	    					   
	    				   }
	    			   }
	    				  t5h.setText(Integer.toString(c));
	    			   
	    		   }
	    		   else if(rb3hrd.isSelected()) {
	    			   try {
							Battle2.purchaseWeapon(1, Battle2.getOriginalLanes().get(2));
							
						} catch (InsufficientResourcesException | InvalidLaneException e) {
							Alert alert=new Alert(Alert.AlertType.ERROR);
							alert.setHeaderText("ERROR");
							alert.setContentText(e.getMessage());
							alert.initOwner(primaryStage);
							alert.showAndWait();}
	    			   
	    			   
	    			   
	    			   tmp=Battle2.getOriginalLanes().get(2).getWeapons();
	    			   
	    			   for(int i=0;i<tmp.size();i++) {
	    				   if(tmp.get(i) instanceof PiercingCannon ) {
	    					   c++;  
	    					   
	    				   }}
	    				 
	    				  t9h.setText(Integer.toString(c));
	    			   
	    		   }
	    			   else if(rb4hrd.isSelected()) {
		    			   try {
								Battle2.purchaseWeapon(1, Battle2.getOriginalLanes().get(3));
								
							} catch (InsufficientResourcesException | InvalidLaneException e) {
								Alert alert=new Alert(Alert.AlertType.ERROR);
								alert.setHeaderText("ERROR");
								alert.setContentText(e.getMessage());
								alert.initOwner(primaryStage);
								alert.showAndWait();}
		    			   
		    			   
		    			   
		    			   tmp=Battle2.getOriginalLanes().get(3).getWeapons();
		    			   
		    			   for(int i=0;i<tmp.size();i++) {
		    				   if(tmp.get(i) instanceof PiercingCannon ) {
		    					   c++;  
		    					   
		    				   }}
		    				 
		    				  t13h.setText(Integer.toString(c));
		    			   
	    		   }
	    			   else if(rb5hrd.isSelected()) {
		    			   try {
								Battle2.purchaseWeapon(1, Battle2.getOriginalLanes().get(4));
								
							} catch (InsufficientResourcesException | InvalidLaneException e) {
								Alert alert=new Alert(Alert.AlertType.ERROR);
								alert.setHeaderText("ERROR");
								alert.setContentText(e.getMessage());
								alert.initOwner(primaryStage);
								alert.showAndWait();}
		    			   
		    			   
		    			   
		    			   tmp=Battle2.getOriginalLanes().get(4).getWeapons();
		    			   
		    			   for(int i=0;i<tmp.size();i++) {
		    				   if(tmp.get(i) instanceof PiercingCannon ) {
		    					   c++;  
		    					   
		    				   }}
		    				 
		    				  t17h.setText(Integer.toString(c));
		    			   
	    		   }
	    		   rsc2.setText("Resources: "+Battle2.getResourcesGathered()); 
	    		   trn2.setText("Turn: "+Battle2.getNumberOfTurns());
	    		   scr2.setText("Score: "+Battle2.getScore());
	    		   phs2.setText("Phase: "+Battle2.getBattlePhase());
	    		   dngr1hrd.setText("Danger: "+Battle2.getOriginalLanes().get(0).getDangerLevel());
	    		   dngr2hrd.setText("Danger: "+Battle2.getOriginalLanes().get(1).getDangerLevel());
	    		   dngr3hrd.setText("Danger: "+Battle2.getOriginalLanes().get(2).getDangerLevel());
	    		   addtoleast();
	    		   dngr4hrd.setText("Danger: "+Battle2.getOriginalLanes().get(3).getDangerLevel());
	    		   addtoleast();
	    		   dngr5hrd.setText("Danger: "+Battle2.getOriginalLanes().get(4).getDangerLevel());
	    		   addtoleasthrd();
	    		   Updatehbhard();
	    		   gameovercheckhard();
	    		   }
	       
	       });
	       
	       snphrd.setOnAction(new EventHandler<ActionEvent>(){
	    	   public void handle(ActionEvent event1) {
	    		   gameovercheckhard();
	    		   int c=0;
	    		   ArrayList<Weapon> tmp=new  ArrayList<Weapon>();
	    		   if(rb1hrd.isSelected()) {
	    			   try {
							Battle2.purchaseWeapon(4, Battle2.getOriginalLanes().get(0));
							
						} catch (InsufficientResourcesException | InvalidLaneException e) {
							Alert alert=new Alert(Alert.AlertType.ERROR);
							alert.setHeaderText("ERROR");
							alert.setContentText(e.getMessage());
							alert.initOwner(primaryStage);
							alert.showAndWait();}
	    			   tmp=Battle2.getOriginalLanes().get(0).getWeapons();
	    			   
	    			   for(int i=0;i<tmp.size();i++) {
	    				   if(tmp.get(i) instanceof PiercingCannon ) {
	    					   c++;  
	    					   
	    				   }}
	    				 
	    				  t2h.setText(Integer.toString(c));
	    			   }
	    			 
	    		   
	    		   else if(rb2hrd.isSelected()) {
	    			   try {
							Battle2.purchaseWeapon(4, Battle2.getOriginalLanes().get(1));
							
						} catch (InsufficientResourcesException | InvalidLaneException e) {
							Alert alert=new Alert(Alert.AlertType.ERROR);
							alert.setHeaderText("ERROR");
							alert.setContentText(e.getMessage());
							alert.initOwner(primaryStage);
							alert.showAndWait();}
	    			   
	    			   
	    			   
	    			   tmp=Battle2.getOriginalLanes().get(1).getWeapons();
	    			   
	    			   for(int i=0;i<tmp.size();i++) {
	    				   if(tmp.get(i) instanceof PiercingCannon ) {
	    					   c++;  
	    					   
	    				   }}
	    				 
	    				  t6h.setText(Integer.toString(c));
	    			   
	    		   }
	    		   else if(rb3hrd.isSelected()) {
	    			   try {
							Battle2.purchaseWeapon(4, Battle2.getOriginalLanes().get(2));
							
						} catch (InsufficientResourcesException | InvalidLaneException e) {
							Alert alert=new Alert(Alert.AlertType.ERROR);
							alert.setHeaderText("ERROR");
							alert.setContentText(e.getMessage());
							alert.initOwner(primaryStage);
							alert.showAndWait();}
	    			   
	    			   
	    			   
	    			   tmp=Battle2.getOriginalLanes().get(2).getWeapons();
	    			   
	    			   for(int i=0;i<tmp.size();i++) {
	    				   if(tmp.get(i) instanceof PiercingCannon ) {
	    					   c++;  
	    					   
	    				   }
	    			   }
	    				  t10h.setText(Integer.toString(c));
	    			   
	    		   }
	    			   else if(rb4hrd.isSelected()) {
		    			   try {
								Battle2.purchaseWeapon(4, Battle2.getOriginalLanes().get(3));
								
							} catch (InsufficientResourcesException | InvalidLaneException e) {
								Alert alert=new Alert(Alert.AlertType.ERROR);
								alert.setHeaderText("ERROR");
								alert.setContentText(e.getMessage());
								alert.initOwner(primaryStage);
								alert.showAndWait();}
		    			   
		    			   
		    			   
		    			   tmp=Battle2.getOriginalLanes().get(3).getWeapons();
		    			   
		    			   for(int i=0;i<tmp.size();i++) {
		    				   if(tmp.get(i) instanceof PiercingCannon ) {
		    					   c++;  
		    					   
		    				   }}
		    				 
		    				  t14h.setText(Integer.toString(c));
		    			   
	    		   }
	    			   else if(rb5hrd.isSelected()) {
		    			   try {
								Battle2.purchaseWeapon(4, Battle2.getOriginalLanes().get(4));
								
							} catch (InsufficientResourcesException | InvalidLaneException e) {
								Alert alert=new Alert(Alert.AlertType.ERROR);
								alert.setHeaderText("ERROR");
								alert.setContentText(e.getMessage());
								alert.initOwner(primaryStage);
								alert.showAndWait();}
		    			   
		    			   
		    			   
		    			   tmp=Battle2.getOriginalLanes().get(4).getWeapons();
		    			   
		    			   for(int i=0;i<tmp.size();i++) {
		    				   if(tmp.get(i) instanceof PiercingCannon ) {
		    					   c++;  
		    					   
		    				   }}
		    				 
		    				  t18h.setText(Integer.toString(c));
		    			   
	    		   }
	    		   rsc2.setText("Resources: "+Battle2.getResourcesGathered()); 
	    		   trn2.setText("Turn: "+Battle2.getNumberOfTurns());
	    		   scr2.setText("Score: "+Battle2.getScore());
	    		   phs2.setText("Phase: "+Battle2.getBattlePhase());
	    		   dngr1hrd.setText("Danger: "+Battle2.getOriginalLanes().get(0).getDangerLevel());
	    		   dngr2hrd.setText("Danger: "+Battle2.getOriginalLanes().get(1).getDangerLevel());
	    		   dngr3hrd.setText("Danger: "+Battle2.getOriginalLanes().get(2).getDangerLevel());
	    		   addtoleast();
	    		   dngr4hrd.setText("Danger: "+Battle2.getOriginalLanes().get(3).getDangerLevel());
	    		   addtoleast();
	    		   dngr5hrd.setText("Danger: "+Battle2.getOriginalLanes().get(4).getDangerLevel());
	    		   addtoleasthrd();
	    		   Updatehbhard();
	    		   gameovercheckhard();
	    		   
	    		   }
	       
	       });
	      trphrd.setOnAction(new EventHandler<ActionEvent>(){
	    	   public void handle(ActionEvent event1) {
	    		   int c=0;
	    		   ArrayList<Weapon> tmp=new  ArrayList<Weapon>();
	    		   if(rb1hrd.isSelected()) {
	    			   try {
							Battle2.purchaseWeapon(2, Battle2.getOriginalLanes().get(0));
							
						} catch (InsufficientResourcesException | InvalidLaneException e) {
							Alert alert=new Alert(Alert.AlertType.ERROR);
							alert.setHeaderText("ERROR");
							alert.setContentText(e.getMessage());
							alert.initOwner(primaryStage);
							alert.showAndWait();}
	    			   tmp=Battle2.getOriginalLanes().get(0).getWeapons();
	    			   
	    			   for(int i=0;i<tmp.size();i++) {
	    				   if(tmp.get(i) instanceof PiercingCannon ) {
	    					   c++;  
	    					   
	    				   }}
	    				 
	    				  t3h.setText(Integer.toString(c));
	    			   }
	    			 
	    		   
	    		   else if(rb2hrd.isSelected()) {
	    			   try {
							Battle2.purchaseWeapon(2, Battle2.getOriginalLanes().get(1));
							
						} catch (InsufficientResourcesException | InvalidLaneException e) {
							Alert alert=new Alert(Alert.AlertType.ERROR);
							alert.setHeaderText("ERROR");
							alert.setContentText(e.getMessage());
							alert.initOwner(primaryStage);
							alert.showAndWait();}
	    			   
	    			   
	    			   
	    			   tmp=Battle2.getOriginalLanes().get(1).getWeapons();
	    			   
	    			   for(int i=0;i<tmp.size();i++) {
	    				   if(tmp.get(i) instanceof PiercingCannon ) {
	    					   c++;  
	    					   
	    				   }}
	    				 
	    				  t7h.setText(Integer.toString(c));
	    			   
	    		   }
	    		   else if(rb3hrd.isSelected()) {
	    			   try {
							Battle2.purchaseWeapon(2, Battle2.getOriginalLanes().get(2));
							
						} catch (InsufficientResourcesException | InvalidLaneException e) {
							Alert alert=new Alert(Alert.AlertType.ERROR);
							alert.setHeaderText("ERROR");
							alert.setContentText(e.getMessage());
							alert.initOwner(primaryStage);
							alert.showAndWait();}
	    			   
	    			   
	    			   
	    			   tmp=Battle2.getOriginalLanes().get(2).getWeapons();
	    			   
	    			   for(int i=0;i<tmp.size();i++) {
	    				   if(tmp.get(i) instanceof PiercingCannon ) {
	    					   c++;  
	    					   
	    				   }}
	    				 
	    				  t11h.setText(Integer.toString(c));
	    			   
	    		   }
	    			   else if(rb4hrd.isSelected()) {
		    			   try {
								Battle2.purchaseWeapon(2, Battle2.getOriginalLanes().get(3));
								
							} catch (InsufficientResourcesException | InvalidLaneException e) {
								Alert alert=new Alert(Alert.AlertType.ERROR);
								alert.setHeaderText("ERROR");
								alert.setContentText(e.getMessage());
								alert.initOwner(primaryStage);
								alert.showAndWait();}
		    			   
		    			   
		    			   
		    			   tmp=Battle2.getOriginalLanes().get(3).getWeapons();
		    			   
		    			   for(int i=0;i<tmp.size();i++) {
		    				   if(tmp.get(i) instanceof PiercingCannon ) {
		    					   c++;  
		    					   
		    				   }}
		    				 
		    				  t15h.setText(Integer.toString(c));
		    			   
	    		   }
	    			   else if(rb5hrd.isSelected()) {
		    			   try {
								Battle2.purchaseWeapon(2, Battle2.getOriginalLanes().get(4));
								
							} catch (InsufficientResourcesException | InvalidLaneException e) {
								Alert alert=new Alert(Alert.AlertType.ERROR);
								alert.setHeaderText("ERROR");
								alert.setContentText(e.getMessage());
								alert.initOwner(primaryStage);
								alert.showAndWait();}
		    			   
		    			   
		    			   
		    			   tmp=Battle2.getOriginalLanes().get(4).getWeapons();
		    			   
		    			   for(int i=0;i<tmp.size();i++) {
		    				   if(tmp.get(i) instanceof PiercingCannon ) {
		    					   c++;  
		    					   
		    				   }}
		    				 
		    				  t19h.setText(Integer.toString(c));
		    			   
	    		   }
	    		   rsc2.setText("Resources: "+Battle2.getResourcesGathered()); 
	    		   trn2.setText("Turn: "+Battle2.getNumberOfTurns());
	    		   scr2.setText("Score: "+Battle2.getScore());
	    		   phs2.setText("Phase: "+Battle2.getBattlePhase());
	    		   dngr1hrd.setText("Danger: "+Battle2.getOriginalLanes().get(0).getDangerLevel());
	    		   dngr2hrd.setText("Danger: "+Battle2.getOriginalLanes().get(1).getDangerLevel());
	    		   dngr3hrd.setText("Danger: "+Battle2.getOriginalLanes().get(2).getDangerLevel());
	    		   addtoleast();
	    		   dngr4hrd.setText("Danger: "+Battle2.getOriginalLanes().get(3).getDangerLevel());
	    		   addtoleast();
	    		   dngr5hrd.setText("Danger: "+Battle2.getOriginalLanes().get(4).getDangerLevel());
	    		   addtoleasthrd();
	    		   Updatehbhard();
	    		   gameovercheckhard();
	    		   
	    		   }
	       
	       });
	      w4hrd.setOnAction(new EventHandler<ActionEvent>(){
	    	   public void handle(ActionEvent event1) {
	    		   int c=0;
	    		   gameovercheckhard();
	    		   ArrayList<Weapon> tmp=new  ArrayList<Weapon>();
	    		   if(rb1hrd.isSelected()) {
	    			   try {
							Battle2.purchaseWeapon(3, Battle2.getOriginalLanes().get(0));
							
						} catch (InsufficientResourcesException | InvalidLaneException e) {
							Alert alert=new Alert(Alert.AlertType.ERROR);
							alert.setHeaderText("ERROR");
							alert.setContentText(e.getMessage());
							alert.initOwner(primaryStage);
							alert.showAndWait();}
	    			   tmp=Battle2.getOriginalLanes().get(0).getWeapons();
	    			   
	    			   for(int i=0;i<tmp.size();i++) {
	    				   if(tmp.get(i) instanceof PiercingCannon ) {
	    					   c++;  
	    					   
	    				   }}
	    				 
	    				  t4h.setText(Integer.toString(c));
	    			   }
	    			 
	    		   
	    		   else if(rb2hrd.isSelected()) {
	    			   try {
							Battle2.purchaseWeapon(3, Battle2.getOriginalLanes().get(1));
							
						} catch (InsufficientResourcesException | InvalidLaneException e) {
							Alert alert=new Alert(Alert.AlertType.ERROR);
							alert.setHeaderText("ERROR");
							alert.setContentText(e.getMessage());
							alert.initOwner(primaryStage);
							alert.showAndWait();}
	    			   
	    			   
	    			   
	    			   tmp=Battle2.getOriginalLanes().get(1).getWeapons();
	    			   
	    			   for(int i=0;i<tmp.size();i++) {
	    				   if(tmp.get(i) instanceof PiercingCannon ) {
	    					   c++;  
	    					   
	    				   }}
	    				 
	    				  t8h.setText(Integer.toString(c));
	    			   
	    		   }
	    		   else if(rb3hrd.isSelected()) {
	    			   try {
							Battle2.purchaseWeapon(3, Battle2.getOriginalLanes().get(2));
							
						} catch (InsufficientResourcesException | InvalidLaneException e) {
							Alert alert=new Alert(Alert.AlertType.ERROR);
							alert.setHeaderText("ERROR");
							alert.setContentText(e.getMessage());
							alert.initOwner(primaryStage);
							alert.showAndWait();}
	    			   
	    			   
	    			   
	    			   tmp=Battle2.getOriginalLanes().get(2).getWeapons();
	    			   
	    			   for(int i=0;i<tmp.size();i++) {
	    				   if(tmp.get(i) instanceof PiercingCannon ) {
	    					   c++;  
	    					   
	    				   }}
	    				 
	    				  t12h.setText(Integer.toString(c));
	    			   
	    		   }
	    			   else if(rb4hrd.isSelected()) {
		    			   try {
								Battle2.purchaseWeapon(3, Battle2.getOriginalLanes().get(3));
								
							} catch (InsufficientResourcesException | InvalidLaneException e) {
								Alert alert=new Alert(Alert.AlertType.ERROR);
								alert.setHeaderText("ERROR");
								alert.setContentText(e.getMessage());
								alert.initOwner(primaryStage);
								alert.showAndWait();}
		    			   
		    			   
		    			   
		    			   tmp=Battle2.getOriginalLanes().get(3).getWeapons();
		    			   
		    			   for(int i=0;i<tmp.size();i++) {
		    				   if(tmp.get(i) instanceof PiercingCannon ) {
		    					   c++;  
		    					   
		    				   }}
		    				 
		    				  t16h.setText(Integer.toString(c));
		    			   
	    		   }
	    			   else if(rb5hrd.isSelected()) {
		    			   try {
								Battle2.purchaseWeapon(3, Battle2.getOriginalLanes().get(4));
								
							} catch (InsufficientResourcesException | InvalidLaneException e) {
								Alert alert=new Alert(Alert.AlertType.ERROR);
								alert.setHeaderText("ERROR");
								alert.setContentText(e.getMessage());
								alert.initOwner(primaryStage);
								alert.showAndWait();}
		    			   
		    			   
		    			   
		    			   tmp=Battle2.getOriginalLanes().get(4).getWeapons();
		    			   
		    			   for(int i=0;i<tmp.size();i++) {
		    				   if(tmp.get(i) instanceof PiercingCannon ) {
		    					   c++;  
		    					   
		    				   }}
		    				 
		    				  t20h.setText(Integer.toString(c));
		    			   
	    		   }
	    		   rsc2.setText("Resources: "+Battle2.getResourcesGathered()); 
	    		   trn2.setText("Turn: "+Battle2.getNumberOfTurns());
	    		   scr2.setText("Score: "+Battle2.getScore());
	    		   phs2.setText("Phase: "+Battle2.getBattlePhase());
	    		   dngr1hrd.setText("Danger: "+Battle2.getOriginalLanes().get(0).getDangerLevel());
	    		   dngr2hrd.setText("Danger: "+Battle2.getOriginalLanes().get(1).getDangerLevel());
	    		   dngr3hrd.setText("Danger: "+Battle2.getOriginalLanes().get(2).getDangerLevel());
	    		   addtoleast();
	    		   dngr4hrd.setText("Danger: "+Battle2.getOriginalLanes().get(3).getDangerLevel());
	    		   addtoleast();
	    		   dngr5hrd.setText("Danger: "+Battle2.getOriginalLanes().get(4).getDangerLevel());
	    		   addtoleasthrd();
	    		   Updatehbhard();
	    		   gameovercheckhard();
	    		   
	    		   }
	       
	       });
	      
	      
	       ig1h = new Image ("cannon.png");
	       ig2h = new Image ("wlltrp.jpg");
	       ig3h = new Image ("tb49.jpg");
	       ig4h = new Image ("yout.jpeg");
	       
	       
	       
	       im1h = new ImageView(ig1);
	       im2h = new ImageView(ig2);
	       im3h = new ImageView(ig3);
	       im4h = new ImageView(ig4);

	       im5h = new ImageView(ig1);
	       im6h = new ImageView(ig2);
	       im7h = new ImageView(ig3);
	       im8h = new ImageView(ig4);

	       im9h = new ImageView(ig1);
	       im10h = new ImageView(ig2);
	       im11h = new ImageView(ig3);
	       im12h = new ImageView(ig4);
	       
	       im13h = new ImageView(ig1);
	       im14h = new ImageView(ig2);
	       im15h = new ImageView(ig3);
	       im16h = new ImageView(ig4);
	       
	       im17h = new ImageView(ig1);
	       im18h = new ImageView(ig2);
	       im19h = new ImageView(ig3);
	       im20h = new ImageView(ig4);
	       
	       im1h.setFitHeight(40);
	       im1h.setFitWidth(40);
	  
	       
	       im2h.setFitHeight(40);
	       im2h.setFitWidth(40);
	       
	       im3h.setFitHeight(40);
	       im3h.setFitWidth(40);
	       
	       im4h.setFitHeight(40);
	       im4h.setFitWidth(40);
	       
	       im5h.setFitHeight(40);
	       im5h.setFitWidth(40);
	  
	       im6h.setFitHeight(40);
	       im6h.setFitWidth(40);
	  
	       im7h.setFitHeight(40);
	       im7h.setFitWidth(40);
	  
	       im8h.setFitHeight(40);
	       im8h.setFitWidth(40);
	  
	       im9h.setFitHeight(40);
	       im9h.setFitWidth(40);
	      
	       im10h.setFitHeight(40);
	       im10h.setFitWidth(40);
	  
	       im11h.setFitHeight(40);
	       im11h.setFitWidth(40);
	  
	       im12h.setFitHeight(40);
	       im12h.setFitWidth(40);
	       
	       im13h.setFitHeight(40);
	       im13h.setFitWidth(40);
	       
	       im14h.setFitHeight(40);
	       im14h.setFitWidth(40);
	       
	       im15h.setFitHeight(40);
	       im15h.setFitWidth(40);
	       
	       im16h.setFitHeight(40);
	       im16h.setFitWidth(40);
	       
	       im17h.setFitHeight(40);
	       im17h.setFitWidth(40);
	       
	       im18h.setFitHeight(40);
	       im18h.setFitWidth(40);
	       
	       im19h.setFitHeight(40);
	       im19h.setFitWidth(40);
	       
	       im20h.setFitHeight(40);
	       im20h.setFitWidth(40);
	       
	       
	       
	       
	       t1h = new Text("0");
	       t2h = new Text("0");
	       t3h = new Text("0");
	       t4h = new Text("0");
	       t5h = new Text("0");
	       t6h = new Text("0");
	       t7h = new Text("0");
	       t8h = new Text("0");
	       t9h= new Text("0");
	       t10h = new Text("0");
	       t11h= new Text("0");
	       t12h= new Text("0");
	       t13h = new Text("0");
	       t14h = new Text("0");
	       t15h = new Text("0");
	       t16h = new Text("0");
	       t17h = new Text("0");
	       t18h = new Text("0");
	       t19h= new Text("0");
	       t20h = new Text("0");
	       
	       im1h.setOpacity(0.4);
	       im2h.setOpacity(0.4);
	       im3h.setOpacity(0.4);
	       im4h.setOpacity(0.4);
	       im5h.setOpacity(0.4);
	       im6h.setOpacity(0.4);
	       im7h.setOpacity(0.4);
	       im8h.setOpacity(0.4);
	       im9h.setOpacity(0.4);
	       im10h.setOpacity(0.4);
	       im11h.setOpacity(0.4);
	       im12h.setOpacity(0.4);
	       im13h.setOpacity(0.4);
	       im14h.setOpacity(0.4);
	       im15h.setOpacity(0.4);
	       im16h.setOpacity(0.4);
	       im17h.setOpacity(0.4);
	       im18h.setOpacity(0.4);
	       im19h.setOpacity(0.4);
	       im20h.setOpacity(0.4);
	       
	       
	       sp1h=new StackPane(im1h,t1h);
	       sp2h=new StackPane(im2h,t2h);
	       sp3h=new StackPane(im3h,t3h);
	       sp4h=new StackPane(im4h,t4h);
	       sp5h=new StackPane(im5h,t5h);
	       sp6h=new StackPane(im6h,t6h);
	       sp7h=new StackPane(im7h,t7h);
	       sp8h=new StackPane(im8h,t8h);
	       sp9h=new StackPane(im9h,t9h);
	       sp10h=new StackPane(im10h,t10h);
	       sp11h=new StackPane(im11h,t11h);
	       sp12h=new StackPane(im12h,t12h);
	       sp13h=new StackPane(im13h,t13h);
	       sp14h=new StackPane(im14h,t14h);
	       sp15h=new StackPane(im15h,t15h);
	       sp16h=new StackPane(im16h,t16h);
	       sp17h=new StackPane(im17h,t17h);
	       sp18h=new StackPane(im18h,t18h);
	       sp19h=new StackPane(im19h,t19h);
	       sp20h=new StackPane(im20h,t20h);
	       
	       wall1h=new VBox();
	       wall2h=new VBox();
	       wall3h=new VBox();
	       wall4h=new VBox();
	       wall5h=new VBox();
	       
	       
	       
	       
	       wall1h.setLayoutX(300);
	       wall1h.setLayoutY(40);
	       
	       wall2h.setLayoutX(300);
	       wall2h.setLayoutY(200);
	       
	       wall3h.setLayoutX(300);
	       wall3h.setLayoutY(360);
	       
	       wall4h.setLayoutX(300);
	       wall4h.setLayoutY(550);
	       
	       wall5h.setLayoutX(300);
	       wall5h.setLayoutY(730);
	       
	       
	       
	       
	      wall1h.getChildren().addAll(sp1h,sp2h,sp3h,sp4h);
	      wall2h.getChildren().addAll(sp5h,sp6h,sp7h,sp8h);
	      wall3h.getChildren().addAll(sp9h,sp10h,sp11h,sp12h);
	      wall4h.getChildren().addAll(sp13h,sp14h,sp15h,sp16h);
	      wall5h.getChildren().addAll(sp17h,sp18h,sp19h,sp20h);
	     
	      
	       
	      root4.getChildren().add(wall1h);
	       root4.getChildren().add(wall2h);
	       root4.getChildren().add(wall3h);
	       root4.getChildren().add(wall4h);
	       root4.getChildren().add(wall5h);
	       
	       hb1h=new ProgressBar(1);
	        hb1h.setPrefHeight(140);
	        hb1h.setPrefWidth(10);
	        hb1h.setLayoutX(260);
	        hb1h.setLayoutY(50);
	        hb1h.setStyle("-fx-accent: red;");

	        
	        hb2h=new ProgressBar(1);
	        hb2h.setPrefHeight(140);
	        hb2h.setPrefWidth(10);
	        hb2h.setLayoutX(260);
	        hb2h.setLayoutY(200);
	        hb2h.setStyle("-fx-accent: red;");
	        
	        hb3h=new ProgressBar(1);
	        hb3h.setPrefHeight(140);
	        hb3h.setPrefWidth(10);
	        hb3h.setLayoutX(260);
	        hb3h.setLayoutY(380);
	        hb3h.setStyle("-fx-accent: red;");
	        
	        hb4h=new ProgressBar(1);
	        hb4h.setPrefHeight(140);
	        hb4h.setPrefWidth(10);
	        hb4h.setLayoutX(260);
	        hb4h.setLayoutY(580);
	        hb4h.setStyle("-fx-accent: red;");
	       
	        
	        hb5h=new ProgressBar(1);
	        hb5h.setPrefHeight(140);
	        hb5h.setPrefWidth(10);
	        hb5h.setLayoutX(260);
	        hb5h.setLayoutY(750);
	        hb5h.setStyle("-fx-accent: red;");
	       
	       
	        root4.getChildren().add(hb1h);
	        root4.getChildren().add(hb2h);
	        root4.getChildren().add(hb3h);
	        root4.getChildren().add(hb4h);
	        root4.getChildren().add(hb5h);
	        
	        
	        
	      
	        
	        
	        
	        ////instr////
	        
	    	Button next=new Button(">NEXT");
	    	next.setFont(new Font("Papyrus",60));
	    	next.setPrefHeight(300);
	    	next.setPrefWidth(500);
	    	next.setLayoutX(900);
	    	next.setLayoutY(500);
	    	
	    	
	    	

	    	imbrdya=new Image("bardya.png");
	    	 ivbrdya=new ImageView(imbrdya);
	    	
	    	
	    	imginst=new Image("instr.jpeg");
	    	 viwinst=new ImageView(imginst);
	    	 viwinst.setOpacity(0.7);
	    	 
	    	 
	    
	    	rootinst= new AnchorPane();
	    	txta=new TextArea("Attack on Titans Game Instructions\n"
	    			+ "Objective:\n"
	    			+ "Defend the walls of each lane from the relentless titan attacks. Survive as long as possible!\n"
	    			+ "\n"
	    			+ "Gameplay Overview:\n"
	    			+ "Lane Setup:\n"
	    			+ "There are multiple lanes, each with its own wall.\n"
	    			+ "Titans spawn at a distance from the wall and move toward it.\n"
	    			+ "The player’s goal is to prevent the titans from reaching the wall.\n"
	    			+ "Weapon Shop:\n"
	    			+ "Click on the “Weapon Shop” button to access the shop.\n"
	    			+ "In the shop, you can buy weapons to defend the lanes.\n"
	    			+ "Each lane has its own weapon selection.\n"
	    			+ "Lane Selection:\n"
	    			+ "Click on the radio button corresponding to the lane you want to defend.\n"
	    			+ "You can only select one lane at a time.\n"
	    			+ "Buying Weapons:\n"
	    			+ "Choose a weapon from the available options (PiercingCannon, SniperCannon, WallTrap, PiercingCannon).\n"
	    			+ "Click on the weapon to purchase it.\n"
	    			+ "Each weapon has a cost associated with it.\n"
	    			+ "Titan Attacks:\n"
	    			+ "Titans spawn periodically and move toward the wall.\n"
	    			+ "When a titan reaches the wall, it damages it.\n"
	    			+ "The wall has a health bar; if it reaches zero, the game ends.\n"
	    			+ "Attacking Titans:\n"
	    			+ "After buying a weapon, click on the “Attack” button to use it.\n"
	    			+ "The weapon will target the nearest titan in the selected lane.\n"
	    			+ "Titans have varying health points (HP).\n"
	    			+ "Passing the Turn:\n"
	    			+ "If you don’t want to attack, click on the “Pass” button.\n"
	    			+ "Passing the turn allows titans to advance closer to the wall.\n"
	    			
	    			+ "Earn resources for each titan defeated.\n"
	    			+ "Use resources to buy new weapons.\n"
	    			+ "Game Over:\n"
	    			+ "The game ends when all wall’s health reaches zero.\n"
	    			+ "Tips:\n"
	    			+ "Prioritize lanes with stronger titans.\n"
	    			+ "Upgrade weapons to deal more damage.\n"

	    			+ "Good luck, defender!");
	    	
	    	next.setOnAction(new EventHandler<ActionEvent>(){
		    	   public void handle(ActionEvent event1) {
		    		   primaryStage.setScene(scene2);
		    	   } });
	    	
	    	next.setOpacity(0.6);
	    	
	    	
	    	txta.setPrefHeight(800);
	    	txta.setPrefWidth(500);
	    	txta.setLayoutY(100);
	    	txta.setLayoutX(100);
	    	txta.setStyle("-fx-background-color:transparent;" +"-fx-text-fill: black;");
	    	
	    
	    	txta.setEditable(false);
	    	
	    	txta.setFont(new Font("Papyrus",10));
	    	rootinst.getChildren().add(viwinst);
	    	rootinst.getChildren().add(ivbrdya);
	    	rootinst.getChildren().add(txta);
	    	rootinst.getChildren().add(next);
	    	
	    	
	    	
	    	
	    	
	   
	 
	    
	       
	      
	       
	       
	       
	        
	    	primaryStage.addEventFilter(KeyEvent.KEY_PRESSED, event -> {
	            if (event.getCode() == KeyCode.X) {
	                
	                Platform.exit();
	            }
	        });
	    
			
	        
	
	        
	    	sceneinst=new Scene(rootinst,1000,1000);
	    
	      hardscene=new Scene(root4,1000,1000);
	      
	       easyscene=new Scene(root3,1000,1000);
	       
	       
	      
	        primaryStage.setFullScreen(true);
	        primaryStage.setMaximized(true);
	        primaryStage.setFullScreenExitHint("Just try to SURVIVE!");
	       primaryStage.setScene(scene1);
	     
	    
			primaryStage.show();
			
			
			
			
			
			
			
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
