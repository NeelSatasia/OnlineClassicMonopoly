package classicMonopoly;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class gameFrame {

	private JFrame monopolyFrame;
	private JPanel monopolyBoardPanel;
	private JPanel monopolyDataPanel;
	private JLabel monopolyBoard;
	private JLabel rollDice1Label;
	private JLabel rollDice2Label;
	private JLabel chanceLabel;
	private JLabel communityChestLabel;
	private JLabel player1Character;
	private JLabel player2Character;
	private JLabel player3Character;
	private JLabel player1CoinsLabel;
	private JLabel player2CoinsLabel;
	private JLabel player3CoinsLabel;
	private JLabel propertiesLabel;
	private JLabel glassLabel;
	private JLabel hexagonLabel;
	private JLabel starLabel;
	private JLabel playerTurnArrow;
	private JLabel houseLabel;
	private JLabel xLabel;
	private JLabel yLabel;
	private ArrayList<JLabel> player1CardsLabel;
	private ArrayList<JLabel> player2CardsLabel;
	private ArrayList<JLabel> player3CardsLabel;
	private ArrayList<JLabel> player1HousesLabel;
	private ArrayList<JLabel> player2HousesLabel;
	private ArrayList<JLabel> player3HousesLabel;
	private JButton player1Buy;
	private JButton player1Housing;
	private JButton player1NotBuy;
	private JButton player1Pay;
	private JButton player1Mortgage;
	private JButton player1Deal;
	private JButton player2Buy;
	private JButton player2Housing;
	private JButton player2NotBuy;
	private JButton player2Pay;
	private JButton player2Mortgage;
	private JButton player2Deal;
	private JButton player3Buy;
	private JButton player3Housing;
	private JButton player3NotBuy;
	private JButton player3Pay;
	private JButton player3Mortgage;
	private JButton player3Deal;
	private JScrollPane monopolyBoardSp;
	private KeyListener monopolyKeys;

	private int currentRollDice1;
	private int currentRollDice2;
	private String[] arr_places;
	private int[] places_PaymentPrices;
	private int[] places_PaymentPrices2;
	private int[] prices_places;
	private ArrayList<String> propertiesNotBought;
	private int[] mortgagePricesPlaces;

	private String player1;
	private int player1Location;
	private int player1x;
	private int player1y;
	private int player1Coins;
	private boolean isJailPlayer1;
	private boolean isPlayer1Turn;
	private boolean isPlayer1Buy;
	private boolean isPlayer1Pay;
	private boolean isPlayer1AtUtility;
	private boolean isPlayer1Pass;
	private boolean isPlayer1Out;
	private int player1JailCount;
	private ArrayList<String> player1Cards;
	private ArrayList<String> player1MortgageCards;
	private ArrayList<String> player1ColorPairCardsList;
	private ArrayList<String> player1CardColors;
	private ArrayList<Integer> player1ColorPairCardsHousesList;
	private int[] player1ColorPairCards;
	private int player1Cardsy;
	private int player1TotalHouses;
	private int player1TotalHotels;
	private int player1JailFree;
	private int player1Railroads;
	private int player1Utilities;
	private int player1SameDiceNumCount;

	private String player2;
	private int player2Location;
	private int player2x;
	private int player2y;
	private int player2Coins;
	private boolean isJailPlayer2;
	private boolean isPlayer2Turn;
	private boolean isPlayer2Buy;
	private boolean isPlayer2Pay;
	private boolean isPlayer2AtUtility;
	private boolean isPlayer2Pass;
	private boolean isPlayer2Out;
	private int player2JailCount;
	private ArrayList<String> player2Cards;
	private ArrayList<String> player2MortgageCards;
	private ArrayList<String> player2ColorPairCardsList;
	private ArrayList<String> player2CardColors;
	private ArrayList<Integer> player2ColorPairCardsHousesList;
	private int[] player2ColorPairCards;
	private int player2Cardsy;
	private int player2TotalHouses;
	private int player2TotalHotels;
	private int player2JailFree;
	private int player2Railroads;
	private int player2Utilities;
	private int player2SameDiceNumCount;

	private String player3;
	private int player3Location;
	private int player3x;
	private int player3y;
	private int player3Coins;
	private boolean isJailPlayer3;
	private boolean isPlayer3Turn;
	private boolean isPlayer3Buy;
	private boolean isPlayer3Pay;
	private boolean isPlayer3AtUtility;
	private boolean isPlayer3Pass;
	private boolean isPlayer3Out;
	private int player3JailCount;
	private ArrayList<String> player3Cards;
	private ArrayList<String> player3MortgageCards;
	private ArrayList<String> player3ColorPairCardsList;
	private ArrayList<String> player3CardColors;
	private ArrayList<Integer> player3ColorPairCardsHousesList;
	private int[] player3ColorPairCards;
	private int player3Cardsy;
	private int player3TotalHouses;
	private int player3TotalHotels;
	private int player3JailFree;
	private int player3Railroads;
	private int player3Utilities;
	private int player3SameDiceNumCount;

	private boolean isCommunityPay;
	private boolean isChancePay;
	private boolean isNearestToNonColors;
	private int cardDrawingPay;
	private ArrayList<String> chances;
	private ArrayList<String> communityChests;
	private int[] house1Payment;
	private int[] house2Payment;
	private int[] house3Payment;
	private int[] house4Payment;
	private int[] hotelPayment;
	private Dimension screenSize;
	private int screenMaxWidth;
	private int screenMaxHeight;
	private int x;
	private int y;
	private int bidPrice;
	private int previousRollDice1;
	private int previousRollDice2;
	private int houseCost;
	private int cardLocation;
	
	private String[] cardColors;

	public gameFrame() {
		
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		screenMaxWidth = (int) (screenSize.getWidth());
		screenMaxHeight = (int) (screenSize.getHeight());

		arr_places = new String[] { "Go", "Mediterranean Ave.", "Community Chest", "Baltic Ave.", "Income Tax",
				"Reading Railroad", "Oriental Ave.", "Chance", "Vermont Ave.", "Connecticut Ave.", "Just Visiting",
				"St. Charles Place", "Electric Company", "States Ave.", "Virginia Ave.", "Pennsylvania Railroad",
				"St. James Place", "Community Chest", "Tennessee Ave.", "New York Ave.", "Free Parking",
				"Kentucky Ave.", "Chance", "Indiana Ave.", "Illinois Ave.", "B. & O. Railroad", "Atlantic Ave.",
				"Ventnor Ave.", "Water Works", "Marvin Gardens", "Go To Jail", "Pacific Ave.", "North Carolina Ave.",
				"Community Chest", "Pennsylvania Ave.", "Short Line Railroad", "Chance", "Park Place", "Luxury Tax",
				"Boardwalk" };

		places_PaymentPrices = new int[] { 0, 2, 0, 4, 200, 25, 6, 0, 6, 8, 0, 10, 0, 10, 12, 25, 14, 0, 14, 16, 0, 18, 0,
				18, 20, 25, 22, 22, 0, 24, 0, 26, 26, 0, 28, 25, 0, 35, 75, 50 };
		
		places_PaymentPrices2 = new int[] { 0, 2, 0, 4, 200, 25, 6, 0, 6, 8, 0, 10, 0, 10, 12, 25, 14, 0, 14, 16, 0, 18, 0,
				18, 20, 25, 22, 22, 0, 24, 0, 26, 26, 0, 28, 25, 0, 35, 75, 50 };

		mortgagePricesPlaces = new int[] { 0, 30, 0, 30, 0, 100, 50, 0, 50, 60, 0, 70, 75, 70, 80, 100, 90, 0, 90, 100,
				0, 110, 0, 110, 120, 100, 130, 130, 75, 140, 0, 150, 150, 0, 160, 100, 0, 175, 0, 200 };

		propertiesNotBought = new ArrayList<String>(Arrays.asList("Mediterranean Ave.", "Baltic Ave.",
				"Reading Railroad", "Oriental Ave.", "Vermont Ave.", "Connecticut Ave.", "St. Charles Place",
				"Electric Company", "States Ave.", "Virginia Ave.", "Pennsylvania Railroad", "St. James Place",
				"Tennessee Ave.", "New York Ave.", "Kentucky Ave.", "Indiana Ave.", "Illinois Ave.", "B. & O. Railroad",
				"Atlantic Ave.", "Ventnor Ave.", "Water Works", "Marvin Gardens", "Pacific Ave.",
				"North Carolina Ave.", "Pennsylvania Ave.", "Short Line Railroad", "Park Place", "Boardwalk"));

		prices_places = new int[] { 0, 60, 0, 60, 0, 200, 100, 0, 100, 120, 0, 140, 150, 140, 160, 200, 180, 0, 180,
				200, 500, 220, 0, 220, 240, 200, 260, 260, 150, 280, 0, 300, 300, 0, 320, 200, 0, 350, 0, 400 };

		chances = new ArrayList<String>(Arrays.asList("Advance To Go", "Advance To St. Charles",
				"Advance To Illinois Ave.", "Advance To Boardwalk", "Advance To Nearest Utility",
				"Advance To Nearest Railroad", "Bank Pays You $50", "Get Out Of Jail", "Go Back 3 Spaces", "Go To Jail",
				"$25 Per House & $100 Per Hotel", "Pay Tax $15", "Go To Reading Railroad", "Pay Each Player $50",
				"Collect $100", "Collect $150"));

		communityChests = new ArrayList<String>(Arrays.asList("Advance To Go", "Collect $200", "Pay $50", "Get $50",
				"Get Out Of Jail", "Go To Jail", "Collect $50 From Every Player", "Receive $100", "Collect $20",
				"Collect $10", "Collect $10", "Collect $100", "Pay $100", "Pay $150", "Receive $25",
				"$40 Per House & $115 Per Hotel", "Inherit $100"));

		house1Payment = new int[] { 0, 10, 0, 20, 0, 0, 30, 0, 30, 40, 0, 50, 0, 50, 60, 0, 70, 0, 70, 80, 0, 90, 0, 90,
				100, 0, 110, 110, 0, 120, 0, 130, 0, 130, 150, 0, 0, 175, 75, 200 };

		house2Payment = new int[] { 0, 30, 0, 60, 0, 0, 90, 0, 90, 100, 0, 150, 0, 150, 180, 0, 200, 0, 200, 220, 0, 250,
				0, 250, 300, 0, 330, 330, 0, 360, 0, 390, 0, 390, 450, 0, 0, 500, 75, 600 };

		house3Payment = new int[] { 0, 90, 0, 180, 0, 0, 270, 0, 270, 300, 0, 450, 0, 450, 500, 0, 550, 0, 550, 600, 0,
				700, 0, 700, 750, 0, 800, 800, 0, 850, 0, 900, 0, 900, 1000, 0, 0, 1100, 75, 1400 };

		house4Payment = new int[] { 0, 160, 0, 320, 0, 0, 400, 0, 400, 450, 0, 625, 0, 625, 700, 0, 750, 0, 750, 800, 0,
				875, 0, 875, 925, 0, 975, 975, 0, 1025, 0, 1100, 0, 1100, 1200, 0, 0, 1300, 75, 1700 };

		hotelPayment = new int[] { 0, 250, 0, 450, 0, 0, 550, 0, 550, 600, 0, 750, 0, 750, 900, 0, 950, 0, 950, 1000, 0,
				1050, 0, 1050, 1100, 0, 1150, 1150, 0, 1200, 0, 1275, 0, 1275, 1400, 0, 0, 1500, 75, 2000 };
		
		cardColors = new String[] { "", "purple", "", "purple", "", "", "lightblue", "", "lightblue", "lightblue", "", "pink", "", "pink", "pink", "", "orange", "", "orange",
				"orange", "", "red", "", "red", "red", "", "yellow", "yellow", "", "yellow", "", "green", "green", "", "green", "", "", "darkblue", "", "darkblue" };

		for (int i = 0; i < chances.size(); i++) {
			int randChanceNum = (int) (Math.random() * chances.size());
			String randChance = chances.get(randChanceNum);
			chances.remove(randChanceNum);
			chances.add(0, randChance);
		}

		for (int i = 0; i < communityChests.size(); i++) {
			int randChestNum = (int) (Math.random() * communityChests.size());
			String randChest = communityChests.get(randChestNum);
			communityChests.remove(randChestNum);
			communityChests.add(0, randChest);
		}

		player1Cards = new ArrayList<String>();
		player2Cards = new ArrayList<String>();
		player3Cards = new ArrayList<String>();
		player1CardsLabel = new ArrayList<JLabel>();
		player2CardsLabel = new ArrayList<JLabel>();
		player3CardsLabel = new ArrayList<JLabel>();
		player1MortgageCards = new ArrayList<String>();
		player2MortgageCards = new ArrayList<String>();
		player3MortgageCards = new ArrayList<String>();
		player1ColorPairCardsList = new ArrayList<String>();
		player2ColorPairCardsList = new ArrayList<String>();
		player3ColorPairCardsList = new ArrayList<String>();
		player1CardColors = new ArrayList<String>();
		player2CardColors = new ArrayList<String>();
		player3CardColors = new ArrayList<String>();
		player1ColorPairCardsHousesList = new ArrayList<Integer>();
		player2ColorPairCardsHousesList = new ArrayList<Integer>();
		player3ColorPairCardsHousesList = new ArrayList<Integer>();
		player1HousesLabel = new ArrayList<JLabel>();
		player2HousesLabel = new ArrayList<JLabel>();
		player3HousesLabel = new ArrayList<JLabel>();
		
		player1ColorPairCards = new int[8];
		player2ColorPairCards = new int[8];
		player3ColorPairCards = new int[8];
		
		for(int i = 0; i < player1ColorPairCards.length; i++) {
			player1ColorPairCards[i] = 0;
			player2ColorPairCards[i] = 0;
			player3ColorPairCards[i] = 0;
		}

		player1Coins = 2000;
		player2Coins = 2000;
		player3Coins = 2000;
		isJailPlayer1 = false;
		isJailPlayer2 = false;
		isJailPlayer3 = false;
		player1JailCount = 0;
		player2JailCount = 0;
		player3JailCount = 0;
		player1JailFree = 0;
		player2JailFree = 0;
		player3JailFree = 0;
		player1Location = 0;
		player1x = 1122;
		player1y = 1150;
		player2Location = 0;
		player2x = 1122;
		player2y = 1125;
		player3Location = 0;
		player3x = 1122;
		player3y = 1175;
		isPlayer1Turn = true;
		isPlayer2Turn = false;
		isPlayer3Turn = false;
		isPlayer1Pay = false;
		isPlayer2Pay = false;
		isPlayer3Pay = false;
		player1Cardsy = 130;
		player2Cardsy = 330;
		player3Cardsy = 530;
		player1TotalHouses = 0;
		player1TotalHotels = 0;
		player2TotalHouses = 0;
		player2TotalHotels = 0;
		player3TotalHouses = 0;
		player3TotalHotels = 0;
		player1Railroads = 0;
		player2Railroads = 0;
		player3Railroads = 0;
		player1Utilities = 0;
		player2Utilities = 0;
		player3Utilities = 0;
		isPlayer1AtUtility = false;
		isPlayer2AtUtility = false;
		isPlayer3AtUtility = false;
		isCommunityPay = false;
		isChancePay = false;
		isNearestToNonColors = false;
		cardDrawingPay = 0;
		previousRollDice1 = 0;
		previousRollDice2 = 0;
		houseCost = 0;
		cardLocation = 0;

		monopolyFrame = new JFrame("Classic Monopoly");
		monopolyFrame.setVisible(true);
		monopolyFrame.setExtendedState(monopolyFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		monopolyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		monopolyBoardPanel = new JPanel();
		monopolyBoardPanel.setLayout(null);
		monopolyBoardPanel.setPreferredSize(new Dimension(1232, 1232));

		monopolyDataPanel = new JPanel();
		monopolyDataPanel.setLayout(null);
		monopolyFrame.add(monopolyDataPanel);
		monopolyDataPanel.setBounds(0, 0, 200, screenMaxHeight);

		ImageIcon glassImage = new ImageIcon("C:\\Users\\Vipul\\Documents\\glass_MonopolyCharacter.png");
		glassLabel = new JLabel(glassImage);
		monopolyBoardPanel.add(glassLabel);
		glassLabel.setBounds(player1x, player1y, 24, 22);

		ImageIcon hexagonImage = new ImageIcon("C:\\Users\\Vipul\\Documents\\hexagon_MonopolyCharacter.png");
		hexagonLabel = new JLabel(hexagonImage);
		monopolyBoardPanel.add(hexagonLabel);
		hexagonLabel.setBounds(player2x, player2y, 24, 22);
		
		ImageIcon starImage = new ImageIcon("C:\\Users\\Vipul\\Documents\\star_MonopolyCharacter.png");
		starLabel = new JLabel(starImage);
		monopolyBoardPanel.add(starLabel);
		starLabel.setBounds(player3x, player3y, 24, 22);
		
		ImageIcon houseImage = new ImageIcon("C:\\Users\\Vipul\\Documents\\monopoly_house.png");
		houseLabel = new JLabel(houseImage);
		monopolyBoardPanel.add(houseLabel);
		houseLabel.setBounds(120, 5, 100, 50);

		ImageIcon monopolyBoardImage = new ImageIcon("C:\\Users\\Vipul\\Documents\\Monopoly_GameBoard.png");
		monopolyBoard = new JLabel(monopolyBoardImage);
		monopolyBoardPanel.add(monopolyBoard);
		monopolyBoard.setBounds(0, 0, 1232, 1232);

		monopolyBoardSp = new JScrollPane();
		monopolyBoardSp.add(monopolyBoardPanel);
		monopolyDataPanel.add(monopolyBoardSp);
		monopolyBoardSp.setBounds(200, 50, 500, screenMaxHeight);
		monopolyBoardSp.setViewportView(monopolyBoardPanel);
		monopolyBoardSp.getVerticalScrollBar().setUnitIncrement(25);
		monopolyBoardSp.getHorizontalScrollBar().setUnitIncrement(30);
		monopolyBoardSp.getVerticalScrollBar().setBackground(Color.LIGHT_GRAY);
		monopolyBoardSp.getHorizontalScrollBar().setBackground(Color.LIGHT_GRAY);
		monopolyBoardSp.setBounds(screenMaxWidth / 4, 0, 1000, 700);
		monopolyBoardSp.validate();
		monopolyBoardSp.getVerticalScrollBar().setValue(600);
		monopolyBoardSp.getHorizontalScrollBar().setValue(500);

		xLabel = new JLabel("X: " + x);
		monopolyDataPanel.add(xLabel);
		xLabel.setBounds(170, 10, 100, 20);
		xLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));

		yLabel = new JLabel("Y: " + y);
		monopolyDataPanel.add(yLabel);
		yLabel.setBounds(170, 30, 100, 20);
		yLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));

		monopolyBoardPanel.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				xLabel.setText("X: " + x);
				yLabel.setText("Y: " + y);
				xLabel.repaint();
				yLabel.repaint();
			}
		});

		rollDice1Label = new JLabel("Dice One: " + 0);
		monopolyDataPanel.add(rollDice1Label);
		rollDice1Label.setBounds(10, 10, 150, 30);
		rollDice1Label.setFont(new Font("Times New Roman", Font.PLAIN, 18));

		rollDice2Label = new JLabel("Dice Two: " + 0);
		monopolyDataPanel.add(rollDice2Label);
		rollDice2Label.setBounds(10, 30, 150, 30);
		rollDice2Label.setFont(new Font("Times New Roman", Font.PLAIN, 18));

		chanceLabel = new JLabel("Chance: ");
		monopolyDataPanel.add(chanceLabel);
		chanceLabel.setBounds(10, 50, 300, 30);
		chanceLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		chanceLabel.setForeground(Color.RED);

		communityChestLabel = new JLabel("Community Chest: ");
		monopolyDataPanel.add(communityChestLabel);
		communityChestLabel.setBounds(10, 70, 330, 30);
		communityChestLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		communityChestLabel.setForeground(new Color(204, 122, 0));

		player1Character = new JLabel("Player 1");
		monopolyDataPanel.add(player1Character);
		player1Character.setBounds(178, 100, 100, 30);
		player1Character.setFont(new Font("Times New Roman", Font.BOLD, 18));

		player2Character = new JLabel("Player 2");
		monopolyDataPanel.add(player2Character);
		player2Character.setBounds(178, 300, 100, 30);
		player2Character.setFont(new Font("Times New Roman", Font.BOLD, 18));

		player3Character = new JLabel("Player 3");
		monopolyDataPanel.add(player3Character);
		player3Character.setBounds(178, 500, 100, 30);
		player3Character.setFont(new Font("Times New Roman", Font.BOLD, 18));

		player1CoinsLabel = new JLabel("$" + player1Coins);
		monopolyDataPanel.add(player1CoinsLabel);
		player1CoinsLabel.setBounds(188, 130, 100, 30);
		player1CoinsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		player2CoinsLabel = new JLabel("$" + player2Coins);
		monopolyDataPanel.add(player2CoinsLabel);
		player2CoinsLabel.setBounds(188, 330, 100, 30);
		player2CoinsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		player3CoinsLabel = new JLabel("$" + player3Coins);
		monopolyDataPanel.add(player3CoinsLabel);
		player3CoinsLabel.setBounds(188, 530, 100, 30);
		player3CoinsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		propertiesLabel = new JLabel("Properties");
		monopolyDataPanel.add(propertiesLabel);
		propertiesLabel.setBounds(20, 120, 100, 20);
		propertiesLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));

		propertiesLabel = new JLabel("Properties");
		monopolyDataPanel.add(propertiesLabel);
		propertiesLabel.setBounds(20, 320, 100, 20);
		propertiesLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));

		propertiesLabel = new JLabel("Properties");
		monopolyDataPanel.add(propertiesLabel);
		propertiesLabel.setBounds(20, 520, 100, 20);
		propertiesLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		ImageIcon arrowImage = new ImageIcon("C:\\Users\\Vipul\\Documents\\leftArrow.png");
		playerTurnArrow = new JLabel(arrowImage);
		monopolyDataPanel.add(playerTurnArrow);
		playerTurnArrow.setBounds(260, 95, 50, 50);
		
		player1Buy = new JButton("Buy");
		monopolyDataPanel.add(player1Buy);
		player1Buy.setBounds(145, 160, 60, 30);
		player1Buy.setFocusable(false);
		disableButton(player1Buy);
		
		player1Housing = new JButton("Housing");
		//monopolyDataPanel.add(player1BuyHouse);
		player1Housing.setBounds(143, 160, 65, 30);
		player1Housing.setFocusable(false);
		disableButton(player1Housing);

		player1NotBuy = new JButton("Not Buy");
		monopolyDataPanel.add(player1NotBuy);
		player1NotBuy.setBounds(215, 160, 60, 30);
		player1NotBuy.setFocusable(false);
		disableButton(player1NotBuy);

		player1Pay = new JButton("Pay");
		monopolyDataPanel.add(player1Pay);
		player1Pay.setBounds(145, 200, 60, 30);
		player1Pay.setFocusable(false);
		disableButton(player1Pay);

		player1Deal = new JButton("Set Deal");
		monopolyDataPanel.add(player1Deal);
		player1Deal.setBounds(145, 240, 60, 30);
		player1Deal.setFocusable(false);
		disableButton(player1Deal);

		player1Mortgage = new JButton("Mortgage");
		monopolyDataPanel.add(player1Mortgage);
		player1Mortgage.setBounds(215, 200, 60, 30);
		player1Mortgage.setFocusable(false);
		enableButton(player1Mortgage);

		player2Buy = new JButton("Buy");
		monopolyDataPanel.add(player2Buy);
		player2Buy.setBounds(145, 360, 60, 30);
		player2Buy.setFocusable(false);
		disableButton(player2Buy);
		
		player2Housing = new JButton("Housing");
		player2Housing.setBounds(143, 360, 60, 30);
		player2Housing.setFocusable(false);
		disableButton(player2Housing);

		player2NotBuy = new JButton("Not Buy");
		monopolyDataPanel.add(player2NotBuy);
		player2NotBuy.setBounds(215, 360, 60, 30);
		player2NotBuy.setFocusable(false);
		disableButton(player2NotBuy);

		player2Pay = new JButton("Pay");
		monopolyDataPanel.add(player2Pay);
		player2Pay.setBounds(145, 400, 60, 30);
		player2Pay.setFocusable(false);
		disableButton(player2Pay);

		player2Deal = new JButton("Set Deal");
		monopolyDataPanel.add(player2Deal);
		player2Deal.setBounds(145, 440, 60, 30);
		player2Deal.setFocusable(false);
		disableButton(player2Deal);

		player2Mortgage = new JButton("Mortgage");
		monopolyDataPanel.add(player2Mortgage);
		player2Mortgage.setBounds(215, 400, 60, 30);
		player2Mortgage.setFocusable(false);
		disableButton(player2Mortgage);

		player3Buy = new JButton("Buy");
		monopolyDataPanel.add(player3Buy);
		player3Buy.setBounds(145, 560, 60, 30);
		player3Buy.setFocusable(false);
		disableButton(player3Buy);
		
		player3Housing = new JButton("Housing");
		player3Housing.setBounds(143, 560, 60, 30);
		player3Housing.setFocusable(false);
		disableButton(player3Housing);

		player3NotBuy = new JButton("Not Buy");
		monopolyDataPanel.add(player3NotBuy);
		player3NotBuy.setBounds(215, 560, 60, 30);
		player3NotBuy.setFocusable(false);
		disableButton(player3NotBuy);

		player3Pay = new JButton("Pay");
		monopolyDataPanel.add(player3Pay);
		player3Pay.setBounds(145, 600, 60, 30);
		player3Pay.setFocusable(false);
		disableButton(player3Pay);

		player3Deal = new JButton("Set Deal");
		monopolyDataPanel.add(player3Deal);
		player3Deal.setBounds(145, 640, 60, 30);
		player3Deal.setFocusable(false);
		disableButton(player3Deal);

		player3Mortgage = new JButton("Mortgage");
		monopolyDataPanel.add(player3Mortgage);
		player3Mortgage.setBounds(215, 600, 60, 30);
		player3Mortgage.setFocusable(false);
		disableButton(player3Mortgage);

		monopolyKeys = new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_W) {
					monopolyBoardSp.getVerticalScrollBar().setValue(0); // move board up
				}
				if (e.getKeyCode() == KeyEvent.VK_S) {
					monopolyBoardSp.getVerticalScrollBar().setValue(600); // move board down
				}
				if (e.getKeyCode() == KeyEvent.VK_A) {
					monopolyBoardSp.getHorizontalScrollBar().setValue(0); // move board left
				}
				if (e.getKeyCode() == KeyEvent.VK_D) {
					monopolyBoardSp.getHorizontalScrollBar().setValue(500); // move board right
				}

				if (e.getKeyCode() == KeyEvent.VK_R) {
					if (isPlayer1Buy == false && isPlayer2Buy == false && isPlayer3Buy == false && isPlayer1Pay == false && isPlayer2Pay == false && isPlayer3Pay == false) {
						currentRollDice1 = (int) (Math.random() * 6) + 1;
						currentRollDice2 = (int) (Math.random() * 6) + 1;
						rollDice1Label.setText("Dice One: Rolling...");
						rollDice2Label.setText("Dice Two: Rolling...");
					}
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_R) {

					rollDice1Label.setText("Dice One: " + currentRollDice1);
					rollDice2Label.setText("Dice Two: " + currentRollDice2);

					if (isPlayer1Turn == true && isPlayer1Buy == false && isPlayer3Buy == false && isPlayer1Pay == false && isPlayer2Pay == false && isPlayer3Pay == false) {
						player3SameDiceNumCount = 0;
						chanceLabel.setText("Chance: ");
						communityChestLabel.setText("Community Chest: ");
						
						int player1PreviousLocation = player1Location;

						if (isJailPlayer1 == false && isPlayer1AtUtility == false) {
							//player1Location += currentRollDice1 + currentRollDice2;
							if (player1Location == 0) {
								player1Location += 16;
							} else if (player1Location == 16) {
								player1Location += 1;
							} else {
								player1Location += 1;
							}
							//player1Location += 2;
						} else if (isJailPlayer1 == true) {
							if (currentRollDice1 != currentRollDice2) {
								disableButton(player1Pay);
								player1JailCount--;
								if (player1JailCount == 0) {
									enableButton(player1Pay);
									isPlayer1Pay = true;
								}
							} else if (currentRollDice1 == currentRollDice2) {
								disableButton(player1Pay);
								isJailPlayer1 = false;
								player1JailCount = 3;
								player1Location += currentRollDice1 + currentRollDice2;
							}
						}

						if (isPlayer1AtUtility == true) {
							if (previousRollDice1 != previousRollDice2) {
								isPlayer1Turn = false;
								isPlayer2Turn = true;
								if (isJailPlayer2 == true && isPlayer1Pay == false && player2JailCount != 1) {
									enableButton(player2Pay);
								}
							}
							isPlayer1Pay = true;
							for (int i = 0; i < player2Cards.size(); i++) {
								if (player2Cards.get(i).equals(arr_places[player1Location])) {
									isPlayer2Pay = true;
								}
							}
							for (int i = 0; i < player3Cards.size(); i++) {
								if (player3Cards.get(i).equals(arr_places[player1Location])) {
									isPlayer3Pay = true;
								}
							}
							enableButton(player1Pay);
							if (player1Cards.size() > 0) {
								enableButton(player1Mortgage);
							}
						} /*else if (currentRollDice1 != currentRollDice2) {
							isPlayer1Turn = false;
							isPlayer2Turn = true;
							if (isJailPlayer2 == true && isPlayer1Pay == false && player2JailCount != 1) {
								enableButton(player2Pay);
							}
						}*/

						for (int i = player1PreviousLocation; i < player1Location; i++) {
							if (i >= 0 && i < 10) {
								if (i == 9) {
									player1x = 2;
								} else if (i == 4) {
									player1x -= 112;
								} else if (i == 5) {
									player1x -= 109;
								} else {
									player1x -= 102;
								}
							}
							if (i >= 10 && i < 20) {
								player1x = 70;
								if (i == 10) {
									player1y -= 130;
								} else if (i == 14 || i == 15) {
									player1y -= 115;
								} else if (i == 19) {
									player1x = 85;
									player1y = 65;
								} else {
									player1y -= 100;
								}
							}
							if (i >= 20 && i < 30) {
								if (i == 24) {
									player1x += 112;
								} else if (i == 25) {
									player1x += 109;
								} else {
									player1x += 102;
								}
							}
							if (i >= 30 && i < 39) {
								player1x = 1140;
								if (i == 30) {
									player1y = 190;
								} else if (i == 39) {
									player1x = 1122;
									player1y = 1150;
								} else if (i == 34) {
									player1y += 115;
								} else if (i == 35) {
									player1y += 113;
								} else {
									player1y += 100;
								}
							}
							if (i >= 39 && i < 50) {
								if (i == 39) {
									player1x = 1122;
									player1y = 1150;
								} else if (i == 49) {
									player1x = 2;
								} else if (i == 44) {
									player1x -= 112;
								} else if (i == 45) {
									player1x -= 109;
								} else if (i == 50) {
									player1y -= 130;
								} else {
									player1x -= 102;
								}
							}
						}
						
						if (currentRollDice1 == currentRollDice2 && isPlayer1AtUtility == false) {
							player1SameDiceNumCount++;
							if(player1SameDiceNumCount == 2) {
								player1SameDiceNumCount = 0;
								isJailPlayer1 = true;
								player1JailCount = 3;
								player1Location = 10;
								player1x = 75;
								player1y = 1150;
							}
						}

						if (player1Location > 39 && isJailPlayer1 == false) {
							moneyChangingAnimation(200, 1, 0);
							player1Location -= player1PreviousLocation;
							int num = 0;
							int num2 = player1PreviousLocation;
							while (num2 <= 39) {
								num++;
								num2++;
							}
							player1Location -= num;
						}

						if (player1Location == 7 || player1Location == 22 || player1Location == 36) {
							chanceLabel.setText("Chance: " + chances.get(0));
							switch (chances.get(0)) {
							case "Advance To Go":
								player1Location = 0;
								moneyChangingAnimation(200, 1, 0);
								player1x = 1122;
								player1y = 1150;
								break;
							case "Advance To St. Charles":
								if (player1Location > 11 && player1Location < 39) {
									moneyChangingAnimation(200, 1, 0);
								}
								player1Location = 11;
								player1x = 70;
								player1y = 1020;
								break;
							case "Advance To Illinois Ave.":
								if (player1Location > 24 && player1Location < 39) {
									moneyChangingAnimation(200, 1, 0);
								}
								player1Location = 24;
								player1x = 493;
								player1y = 65;
								break;
							case "Advance To Boardwalk":
								player1Location = 39;
								player1x = 1140;
								player1y = 1018;
								break;
							case "Advance To Nearest Utility":
								isNearestToNonColors = true;
								if (player1Location == 7 || player1Location == 36) {
									if (player1Location == 36) {
										moneyChangingAnimation(200, 1, 0);
									}
									player1Location = 12;
									player1x = 70;
									player1y = 920;
								} else {
									player1Location = 28;
									player1x = 918;
									player1y = 65;
								}
								break;
							case "Advance To Nearest Railroad":
								isNearestToNonColors = true;
								if (player1Location == 36) {
									player1Location = 5;
									player1x = 602;
									player1y = 1150;
									moneyChangingAnimation(200, 1, 0);
								} else if (player1Location == 7) {
									player1Location = 15;
									player1x = 70;
									player1y = 605;
								} else if (player1Location == 22) {
									player1Location = 25;
									player1x = 605;
									player1y = 65;
								}
								break;
							case "Go Back 3 Spaces":
								if (player1Location == 7) {
									player1x = 714;
								} else if (player1Location == 22) {
									player1x = 70;
									player1y = 190;
								} else {
									player1y = 390;
								}

								player1Location -= 3;
								break;
							case "Bank Pays You $50":
								moneyChangingAnimation(50, 1, 0);
								break;
							case "Get Out Of Jail":
								player1JailFree += 1;
								break;
							case "Go To Jail":
								player1Location = 10;
								isJailPlayer1 = true;
								player1JailCount = 3;
								player1x = 75;
								player1y = 1150;
								break;
							case "$25 Per House & $100 Per Hotel":
								if (player1TotalHouses > 0 || player1TotalHotels > 0) {
									isPlayer1Pay = true;
									isChancePay = true;
									cardDrawingPay = ((25 * player1TotalHouses) + (100 * player1TotalHotels));
									enableButton(player1Pay);
									if (player1Coins < cardDrawingPay) {
										if (player1Cards.size() > 0) {
											enableButton(player1Mortgage);
										}
									}
								}
								break;
							case "Pay Tax $15":
								isPlayer1Pay = true;
								isChancePay = true;
								cardDrawingPay = 15;
								enableButton(player1Pay);
								if (player1Coins < cardDrawingPay) {
									if (player1Cards.size() > 0) {
										enableButton(player1Mortgage);
									}
								}
								break;
							case "Collect $100":
								moneyChangingAnimation(100, 1, 0);
								break;
							case "Collect $150":
								moneyChangingAnimation(150, 1, 0);
								break;
							case "Pay Each Player $50":
								isPlayer1Pay = true;
								isPlayer2Pay = true;
								isPlayer3Pay = true;
								isChancePay = true;
								cardDrawingPay = 100;
								enableButton(player1Pay);
								if (player1Coins < cardDrawingPay) {
									if (player1Cards.size() > 0) {
										enableButton(player1Mortgage);
									}
								}
								break;
							case "Go To Reading Railroad":
								moneyChangingAnimation(200, 1, 0);
								player1Location = 5;
								player1x = 602;
								player1y = 1150;
								break;
							}

							String firstChance = chances.get(0);
							chances.remove(0);
							chances.add(firstChance);
						}

						if (player1Location == 2 || player1Location == 17 || player1Location == 33) {
							communityChestLabel.setText("Community Chest: " + communityChests.get(0));
							switch (communityChests.get(0)) {
							case "Advance To Go":
								player1Location = 0;
								moneyChangingAnimation(200, 1, 0);
								player1x = 1122;
								player1y = 1150;
								break;
							case "Go To Jail":
								isJailPlayer1 = true;
								player1JailCount = 3;
								player1Location = 10;
								player1x = 75;
								player1y = 1150;
								break;
							case "Bank Pays You $50":
								moneyChangingAnimation(50, 1, 0);
								break;
							case "Collect $10":
								moneyChangingAnimation(10, 1, 0);
								break;
							case "Collect $20":
								moneyChangingAnimation(20, 1, 0);
								break;
							case "Receive $25":
								moneyChangingAnimation(25, 1, 0);
								break;
							case "Collect $100":
								moneyChangingAnimation(100, 1, 0);
								break;
							case "Collect $150":
								moneyChangingAnimation(150, 1, 0);
								break;
							case "Collect $200":
								moneyChangingAnimation(200, 1, 0);
								break;
							case "Inherit $100":
								moneyChangingAnimation(100, 1, 0);
								break;
							case "Collect $50 From Every Player":
								isCommunityPay = true;
								isPlayer2Pay = true;
								isPlayer3Pay = true;
								enableButton(player2Pay);
								break;
							case "Get $50":
								moneyChangingAnimation(200, 1, 0);
								break;
							case "Pay $50":
								isCommunityPay = true;
								isPlayer1Pay = true;
								cardDrawingPay = 50;
								enableButton(player1Pay);
								if (player1Coins < cardDrawingPay) {
									if (player1Cards.size() > 0) {
										enableButton(player1Mortgage);
									}
								}
								break;
							case "Pay $100":
								isCommunityPay = true;
								isPlayer1Pay = true;
								cardDrawingPay = 100;
								enableButton(player1Pay);
								if (player1Coins < cardDrawingPay) {
									if (player1Cards.size() > 0) {
										enableButton(player1Mortgage);
									}
								}
								break;
							case "Pay $150":
								isCommunityPay = true;
								isPlayer1Pay = true;
								cardDrawingPay = 150;
								enableButton(player1Pay);
								if (player1Coins < cardDrawingPay) {
									if (player1Cards.size() > 0) {
										enableButton(player1Mortgage);
									}
								}
								break;
							case "$40 Per House & $115 Per Hotel":
								if (player1TotalHouses > 0 || player1TotalHotels > 0) {
									isPlayer1Pay = true;
									isCommunityPay = true;
									cardDrawingPay = ((40 * player1TotalHouses) + (115 * player1TotalHotels));
									enableButton(player1Pay);
									if (player1Coins < cardDrawingPay) {
										if (player1Cards.size() > 0) {
											enableButton(player1Mortgage);
										}
									}
								}
								break;
							case "Get Out Of Jail Free":
								player1JailFree += 1;
								break;
							}
							String firstChest = communityChests.get(0);
							communityChests.remove(0);
							communityChests.add(firstChest);
						}
						if (player1Location == 30) {
							isJailPlayer1 = true;
							player1JailCount = 3;
							player1Location = 10;
							player1x = 75;
							player1y = 1150;
						} else if (player1Location == 4) {
							isPlayer1Pay = true;
							enableButton(player1Pay);
						} else if (player1Location == 20) {
							moneyChangingAnimation(500, 1, 0);
							player1CoinsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
						}

						glassLabel.setLocation(player1x, player1y);

						for (int i = 0; i < propertiesNotBought.size(); i++) {
							if (arr_places[player1Location].equals(propertiesNotBought.get(i))) {
								if (player1Coins >= prices_places[player1Location]) {
									enableButton(player1Buy);
								}
								enableButton(player1NotBuy);
								isPlayer1Buy = true;
								if (isNearestToNonColors == true) {
									isNearestToNonColors = false;
								}
							}
						}
						for (int i = 0; i < player2Cards.size(); i++) {
							if (arr_places[player1Location].equals(player2Cards.get(i))) {
								if (player1Location != 12 && player1Location != 28) {
									enableButton(player1Pay);
									isPlayer1Pay = true;
									isPlayer2Pay = true;
									if (player1Coins < cardDrawingPay) {
										if (player1Cards.size() > 0) {
											enableButton(player1Mortgage);
										}
									}
								} else {
									if (isPlayer1AtUtility == false) {
										isPlayer1AtUtility = true;
										isPlayer1Turn = true;
										isPlayer2Turn = false;
										previousRollDice1 = currentRollDice1;
										previousRollDice2 = currentRollDice2;
									}
								}
							}
						}
						for (int i = 0; i < player3Cards.size(); i++) {
							if (arr_places[player1Location].equals(player3Cards.get(i))) {
								if (player1Location != 12 && player1Location != 28) {
									enableButton(player1Pay);
									isPlayer1Pay = true;
									isPlayer3Pay = true;
									if (player1Coins < cardDrawingPay) {
										if (player1Cards.size() > 0) {
											enableButton(player1Mortgage);
										}
									}
								} else {
									if (isPlayer1AtUtility == false) {
										isPlayer1AtUtility = true;
										isPlayer1Turn = true;
										isPlayer2Turn = false;
										previousRollDice1 = currentRollDice1;
										previousRollDice2 = currentRollDice2;
									}
								}
							}
						}

						player1CoinsLabel.setText("$" + player1Coins);
					}

					else if (isPlayer2Turn == true && isPlayer1Buy == false && isPlayer2Buy == false && isPlayer2Pay == false && isPlayer1Pay == false && isPlayer3Pay == false) {
						player1SameDiceNumCount = 0;
						chanceLabel.setText("Chance: ");
						communityChestLabel.setText("Community Chest: ");
						
						int player2PreviousLocation = player2Location;

						if (isJailPlayer2 == false && isPlayer2AtUtility == false) {
							//player2Location += currentRollDice1 + currentRollDice2;
							player2Location += 8;
						} else if (isJailPlayer2 == true) {
							if (currentRollDice1 != currentRollDice2) {
								disableButton(player2Pay);
								player2JailCount--;
								if (player2JailCount == 0) {
									enableButton(player2Pay);
									isPlayer2Pay = true;
								}
							} else if (currentRollDice1 == currentRollDice2) {
								disableButton(player2Pay);
								isJailPlayer2 = false;
								player2JailCount = 3;
								player2Location += currentRollDice1 + currentRollDice2;
							}
						}
						
						if (isPlayer2AtUtility == true) {
							if (previousRollDice1 != previousRollDice2) {
								isPlayer2Turn = false;
								isPlayer3Turn = true;
								if (isJailPlayer3 == true && isPlayer2Pay == false && player3JailCount != 1) {
									enableButton(player3Pay);
								}
							}
							isPlayer2Pay = true;
							for (int i = 0; i < player1Cards.size(); i++) {
								if (player1Cards.get(i).equals(arr_places[player2Location])) {
									isPlayer1Pay = true;
								}
							}
							for (int i = 0; i < player3Cards.size(); i++) {
								if (player3Cards.get(i).equals(arr_places[player2Location])) {
									isPlayer3Pay = true;
								}
							}
							enableButton(player2Pay);
							if(player2Cards.size() > 0) {
								enableButton(player2Mortgage);
							}
						} else if (currentRollDice1 != currentRollDice2) {
							isPlayer2Turn = false;
							isPlayer3Turn = true;
							if (isJailPlayer3 == true && isPlayer2Pay == false && player3JailCount != 1) {
								enableButton(player3Pay);
							}
						}

						for (int i = player2PreviousLocation; i < player2Location; i++) {
							if (i >= 0 && i < 10) {
								if (i == 9) {
									player2x = 2;
								} else if (i == 4) {
									player2x -= 112;
								} else if (i == 5) {
									player2x -= 109;
								} else {
									player2x -= 102;
								}
							}
							if (i >= 10 && i < 20) {
								player2x = 97;
								if (i == 10) {
									player2y -= 105;
								} else if (i == 14) {
									player2y -= 115;
								} else if (i == 15) {
									player2y -= 115;
								} else if (i == 19) {
									player2x = 85;
									player2y = 92;
								} else {
									player2y -= 100;
								}
							}
							if (i >= 20 && i < 30) {
								if (i == 24) {
									player2x += 112;
								} else if (i == 25) {
									player2x += 109;
								} else {
									player2x += 102;
								}
							}
							if (i >= 30 && i < 39) {
								player2x = 1110;
								if (i == 30) {
									player2y = 190;
								} else if (i == 39) {
									player2x = 1122;
									player2y = 1125;
								} else if (i == 34) {
									player2y += 115;
								} else if (i == 35) {
									player2y += 113;
								} else {
									player2y += 100;
								}
							}
							if (i >= 39 && i < 50) {
								if (i == 39) {
									player2x = 1122;
									player2y = 1125;
								} else if (i == 49) {
									player2x = 2;
								} else if (i == 44) {
									player2x -= 112;
								} else if (i == 45) {
									player2x -= 109;
								} else if (i == 50) {
									player2y -= 130;
								} else {
									player2x -= 102;
								}
							}
						}
						
						if(currentRollDice1 == currentRollDice2 && isPlayer2AtUtility == false) {
							player2SameDiceNumCount++;
							if(player2SameDiceNumCount == 2) {
								player2SameDiceNumCount = 0;
								isJailPlayer2 = true;
								player2Location = 10;
								player2x = 75;
								player2y = 1125;
							}
						}
						
						if (player2Location > 39 && isJailPlayer2 == false) {
							moneyChangingAnimation(200, 2, 0);
							player2Location -= player2PreviousLocation;
							int num = 0;
							while (player2PreviousLocation <= 39) {
								num++;
								player2PreviousLocation++;
							}
							player2Location -= num;
						}

						if (player2Location == 7 || player2Location == 22 || player2Location == 36) {
							chanceLabel.setText("Chance: " + chances.get(0));
							switch (chances.get(0)) {
							case "Advance To Go":
								player2Location = 0;
								moneyChangingAnimation(200, 2, 0);
								player2x = 1122;
								player2y = 1125;
								break;
							case "Advance To St. Charles":
								if (player2Location > 11 && player2Location < 39) {
									moneyChangingAnimation(200, 2, 0);
								}
								player2Location = 11;
								player2x = 97;
								player2y = 1020;
								break;
							case "Advance To Illinois Ave.":
								if (player2Location > 24 && player2Location < 39) {
									moneyChangingAnimation(200, 2, 0);
								}
								player2Location = 24;
								player2x = 493;
								player2y = 92;
								break;
							case "Advance To Boardwalk":
								player2Location = 39;
								player2x = 1110;
								player2y = 1018;
								break;
							case "Advance To Nearest Utility":
								isNearestToNonColors = true;
								if (player2Location == 7 || player2Location == 36) {
									if (player2Location == 36) {
										moneyChangingAnimation(200, 2, 0);
									}
									player2Location = 12;
									player2x = 97;
									player2y = 920;
								} else {
									player2Location = 28;
									player2x = 918;
									player2y = 92;
								}
								break;
							case "Advance To Nearest Railroad":
								isNearestToNonColors = true;
								if (player2Location == 36) {
									player2Location = 5;
									player2x = 602;
									player2y = 1125;
									moneyChangingAnimation(200, 2, 0);
								} else if (player2Location == 7) {
									player2Location = 15;
									player2x = 97;
									player2y = 605;
								} else if (player2Location == 22) {
									player2Location = 25;
									player2x = 605;
									player2y = 92;
								}
								break;
							case "Go Back 3 Spaces":
								if (player2Location == 7) {
									player2x = 714;
								} else if (player2Location == 22) {
									player2x = 97;
									player2y = 190;
								} else {
									player2y = 390;
								}

								player2Location -= 3;
								break;
							case "Bank Pays You $50":
								moneyChangingAnimation(50, 2, 0);
								break;
							case "Get Out Of Jail":
								player2JailFree += 1;
								break;
							case "Go To Jail":
								player2Location = 10;
								isJailPlayer2 = true;
								player2JailCount = 3;
								player2x = 75;
								player2y = 1125;
								break;
							case "$25 Per House & $100 Per Hotel":
								if (player2TotalHouses > 0 || player2TotalHotels > 0) {
									isPlayer2Pay = true;
									isChancePay = true;
									cardDrawingPay = ((25 * player2TotalHouses) + (100 * player2TotalHotels));
									enableButton(player2Pay);
									if (player2Coins < cardDrawingPay) {
										if (player2Cards.size() > 0) {
											enableButton(player2Mortgage);
										}
									}
								}
								break;
							case "Pay Tax $15":
								isPlayer2Pay = true;
								isChancePay = true;
								cardDrawingPay = 15;
								enableButton(player2Pay);
								if (player2Coins < cardDrawingPay) {
									if (player2Cards.size() > 0) {
										enableButton(player2Mortgage);
									}
								}
								break;
							case "Collect $100":
								moneyChangingAnimation(100, 2, 0);
								break;
							case "Collect $150":
								moneyChangingAnimation(150, 2, 0);
								break;
							case "Pay Each Player $50":
								isPlayer2Pay = true;
								isChancePay = true;
								cardDrawingPay = 100;
								enableButton(player2Pay);
								if (player2Coins < cardDrawingPay) {
									if (player2Cards.size() > 0) {
										enableButton(player2Mortgage);
									}
								}
								break;
							case "Go To Reading Railroad":
								moneyChangingAnimation(200, 2, 0);
								player2Location = 5;
								player2x = 602;
								player2y = 1125;
								break;
							}

							String firstChance = chances.get(0);
							chances.remove(0);
							chances.add(firstChance);
						}

						if (player2Location == 2 || player2Location == 17 || player2Location == 33) {
							communityChestLabel.setText("Community Chest: " + communityChests.get(0));
							switch (communityChests.get(0)) {
							case "Advance To Go":
								player2Location = 0;
								moneyChangingAnimation(200, 2, 0);
								player2x = 1122;
								player2y = 1125;
								break;
							case "Go To Jail":
								isJailPlayer2 = true;
								player2JailCount = 3;
								player2Location = 10;
								player2x = 75;
								player2y = 1125;
								break;
							case "Bank Pays You $50":
								moneyChangingAnimation(50, 2, 0);
								break;
							case "Collect $10":
								moneyChangingAnimation(10, 2, 0);
								break;
							case "Collect $20":
								moneyChangingAnimation(20, 2, 0);
								break;
							case "Receive $25":
								moneyChangingAnimation(25, 2, 0);
								break;
							case "Collect $100":
								moneyChangingAnimation(100, 2, 0);
								break;
							case "Collect $150":
								moneyChangingAnimation(150, 2, 0);
								break;
							case "Collect $200":
								moneyChangingAnimation(200, 2, 0);
								break;
							case "Inherit $100":
								moneyChangingAnimation(100, 2, 0);
								break;
							case "Collect $50 From Every Player":
								isCommunityPay = true;
								isPlayer1Pay = true;
								isPlayer3Pay = true;
								enableButton(player3Pay);
								break;
							case "Get $50":
								moneyChangingAnimation(50, 2, 0);
								break;
							case "Pay $50":
								isCommunityPay = true;
								isPlayer2Pay = true;
								cardDrawingPay = 50;
								enableButton(player2Pay);
								if (player2Coins < cardDrawingPay) {
									if (player2Cards.size() > 0) {
										enableButton(player2Mortgage);
									}
								}
								break;
							case "Pay $100":
								isCommunityPay = true;
								isPlayer2Pay = true;
								cardDrawingPay = 100;
								enableButton(player2Pay);
								if (player2Coins < cardDrawingPay) {
									if (player2Cards.size() > 0) {
										enableButton(player2Mortgage);
									}
								}
								break;
							case "Pay $150":
								isCommunityPay = true;
								isPlayer2Pay = true;
								cardDrawingPay = 150;
								enableButton(player2Pay);
								if (player2Coins < cardDrawingPay) {
									if (player2Cards.size() > 0) {
										enableButton(player2Mortgage);
									}
								}
								break;
							case "$40 Per House & $115 Per Hotel":
								if (player2TotalHouses > 0 || player2TotalHotels > 0) {
									isPlayer2Pay = true;
									isCommunityPay = true;
									cardDrawingPay = ((40 * player2TotalHouses) + (115 * player2TotalHotels));
									enableButton(player2Pay);
									if (player2Coins < cardDrawingPay) {
										if (player2Cards.size() > 0) {
											enableButton(player2Mortgage);
										}
									}
								}
								break;
							case "Get Out Of Jail Free":
								player2JailFree += 1;
								break;
							}
							String firstChest = communityChests.get(0);
							communityChests.remove(0);
							communityChests.add(firstChest);
						}
						if (player2Location == 30) {
							player2SameDiceNumCount = 0;
							isJailPlayer2 = true;
							player2Location = 10;
							player2x = 75;
							player2y = 1125;
						}
						if (player2Location == 4) {
							isPlayer2Pay = true;
							enableButton(player2Pay);
						} else if (player2Location == 20) {
							moneyChangingAnimation(500, 2, 0);
						}

						hexagonLabel.setLocation(player2x, player2y);

						for (int i = 0; i < propertiesNotBought.size(); i++) {
							if (arr_places[player2Location].equals(propertiesNotBought.get(i))) {
								if (player2Coins >= prices_places[player2Location]) {
									enableButton(player2Buy);
								}
								enableButton(player2NotBuy);
								isPlayer2Buy = true;
								if (isNearestToNonColors == true) {
									isNearestToNonColors = false;
								}
							}
						}
						for (int i = 0; i < player1Cards.size(); i++) {
							if (arr_places[player2Location].equals(player1Cards.get(i))) {
								if (player2Location != 12 && player2Location != 28) {
									enableButton(player2Pay);
									isPlayer2Pay = true;
									isPlayer1Pay = true;
									if (player2Coins < cardDrawingPay) {
										if (player2Cards.size() > 0) {
											enableButton(player2Mortgage);
										}
									}
								} else {
									if (isPlayer2AtUtility == false) {
										isPlayer2AtUtility = true;
										previousRollDice1 = currentRollDice1;
										previousRollDice2 = currentRollDice2;
										isPlayer2Turn = true;
										isPlayer3Turn = false;
									}
								}
							}
						}
						for (int i = 0; i < player3Cards.size(); i++) {
							if (arr_places[player2Location].equals(player3Cards.get(i))) {
								if (player2Location != 12 && player2Location != 28) {
									enableButton(player2Pay);
									isPlayer2Pay = true;
									isPlayer3Pay = true;
									if (player2Coins < cardDrawingPay) {
										if (player2Cards.size() > 0) {
											enableButton(player2Mortgage);
										}
									}
								} else {
									if (isPlayer2AtUtility == false) {
										isPlayer2AtUtility = true;
										previousRollDice1 = currentRollDice1;
										previousRollDice2 = currentRollDice2;
										isPlayer2Turn = true;
										isPlayer3Turn = false;
									}
								}
							}
						}
						
						player2CoinsLabel.setText("$" + player2Coins);
					}

					else if (isPlayer3Turn == true && isPlayer2Buy == false && isPlayer3Buy == false && isPlayer3Pay == false && isPlayer1Pay == false && isPlayer2Pay == false) {
						player2SameDiceNumCount = 0;
						chanceLabel.setText("Chance: ");
						communityChestLabel.setText("Community Chest: ");
						
						int player3PreviousLocation = player3Location;

						if (isJailPlayer3 == false && isPlayer3AtUtility == false) {
							//player3Location += currentRollDice1 + currentRollDice2;
							player3Location += 11;
						} else if (isJailPlayer3 == true) {
							if (currentRollDice1 != currentRollDice2) {
								disableButton(player3Pay);
								player3JailCount--;
								if (player3JailCount == 0) {
									enableButton(player3Pay);
									isPlayer3Pay = true;
								}
							} else if (currentRollDice1 == currentRollDice2) {
								disableButton(player3Pay);
								isJailPlayer3 = false;
								player3JailCount = 3;
								player3Location += currentRollDice1 + currentRollDice2;
							}
						}

						if (isPlayer3AtUtility == true) {
							if (previousRollDice1 != previousRollDice2) {
								isPlayer3Turn = false;
								isPlayer1Turn = true;
								if (isJailPlayer1 == true && isPlayer3Pay == false && player1JailCount != 1) {
									enableButton(player1Pay);
								}
							}
							isPlayer3Pay = true;
							for (int i = 0; i < player1Cards.size(); i++) {
								if (player1Cards.get(i).equals(arr_places[player3Location])) {
									isPlayer1Pay = true;
								}
							}
							for (int i = 0; i < player2Cards.size(); i++) {
								if (player2Cards.get(i).equals(arr_places[player3Location])) {
									isPlayer2Pay = true;
								}
							}
							enableButton(player3Pay);
							if(player3Cards.size() > 0) {
								enableButton(player3Mortgage);
							}
						} else if (currentRollDice1 != currentRollDice2) {
							isPlayer3Turn = false;
							isPlayer1Turn = true;
							if (isJailPlayer1 == true && isPlayer3Pay == false && player1JailCount != 1) {
								enableButton(player1Pay);
							}
						}

						for (int i = player3PreviousLocation; i < player3Location; i++) {
							if (i >= 0 && i < 10) {
								if (i == 9) {
									player3x = 2;
								} else if (i == 4) {
									player3x -= 112;
								} else if (i == 5) {
									player3x -= 109;
								} else {
									player3x -= 102;
								}
							}
							if (i >= 10 && i < 20) {
								player3x = 40;
								if (i == 10) {
									player3y -= 155;
								} else if (i == 14) {
									player3y -= 115;
								} else if (i == 15) {
									player3y -= 115;
								} else if (i == 19) {
									player3x = 85;
									player3y = 35;
								} else {
									player3y -= 100;
								}
							}
							if (i >= 20 && i < 30) {
								if (i == 24) {
									player3x += 112;
								} else if (i == 25) {
									player3x += 109;
								} else {
									player3x += 102;
								}
							}
							if (i >= 30 && i < 39) {
								player3x = 1170;
								if (i == 30) {
									player3y = 190;
								} else if (i == 39) {
									player3x = 1122;
									player3y = 1150;
								} else if (i == 34) {
									player3y += 115;
								} else if (i == 35) {
									player3y += 113;
								} else {
									player3y += 100;
								}
							}
							if (i >= 39 && i < 50) {
								if (i == 39) {
									player3x = 1122;
									player3y = 1175;
								} else if (i == 49) {
									player3x = 2;
								} else if (i == 44) {
									player3x -= 112;
								} else if (i == 45) {
									player3x -= 109;
								} else if (i == 50) {
									player3y -= 130;
								} else {
									player3x -= 102;
								}
							}
						}
						
						if(currentRollDice1 == currentRollDice2 && isPlayer3AtUtility == false) {
							player3SameDiceNumCount++;
							if(player3SameDiceNumCount == 2) {
								player3SameDiceNumCount = 0;
								isJailPlayer3 = true;
								player3Location = 10;
								player3x = 75;
								player3y = 1175;
							}
						}
						
						if (player3Location > 39 & isJailPlayer3 == false) {
							moneyChangingAnimation(200, 3, 0);
							player3Location -= player3PreviousLocation;
							int num = 0;
							while (player3PreviousLocation <= 39) {
								num++;
								player3PreviousLocation++;
							}
							player3Location -= num;
						}

						if (player3Location == 7 || player3Location == 22 || player3Location == 36) {
							chanceLabel.setText("Chance: " + chances.get(0));
							switch (chances.get(0)) {
							case "Advance To Go":
								player3Location = 0;
								moneyChangingAnimation(200, 3, 0);
								player3x = 1122;
								player3y = 1175;
								break;
							case "Advance To St. Charles":
								if (player3Location > 11 && player3Location < 39) {
									moneyChangingAnimation(200, 3, 0);
								}
								player3Location = 11;
								player3x = 40;
								player3y = 1020;
								break;
							case "Advance To Illinois Ave.":
								if (player3Location > 24 && player3Location < 39) {
									moneyChangingAnimation(200, 3, 0);
								}
								player3Location = 24;
								player3x = 493;
								player3y = 35;
								break;
							case "Advance To Boardwalk":
								player3Location = 39;
								player3x = 1170;
								player3y = 1018;
								break;
							case "Advance To Nearest Utility":
								isNearestToNonColors = true;
								if (player3Location == 7 || player3Location == 36) {
									if (player3Location == 36) {
										moneyChangingAnimation(200, 3, 0);
									}
									player3Location = 12;
									player3x = 40;
									player3y = 920;
								} else {
									player3Location = 28;
									player3x = 918;
									player3y = 35;
								}
								break;
							case "Advance To Nearest Railroad":
								isNearestToNonColors = true;
								if (player3Location == 36) {
									player3Location = 5;
									player3x = 602;
									player3y = 1175;
									moneyChangingAnimation(200, 3, 0);
								} else if (player3Location == 7) {
									player3Location = 15;
									player3x = 40;
									player3y = 605;
								} else if (player3Location == 22) {
									player3Location = 25;
									player3x = 605;
									player3y = 35;
								}
								break;
							case "Go Back 3 Spaces":
								if (player3Location == 7) {
									player3x = 714;
								} else if (player3Location == 22) {
									player3x = 40;
									player3y = 190;
								} else {
									player3y = 390;
								}

								player3Location -= 3;
								break;
							case "Bank Pays You $50":
								moneyChangingAnimation(50, 3, 0);
								break;
							case "Get Out Of Jail":
								player3JailFree += 1;
								break;
							case "Go To Jail":
								player3Location = 10;
								isJailPlayer3 = true;
								player3JailCount = 3;
								player3x = 75;
								player3y = 1175;
								break;
							case "$25 Per House & $100 Per Hotel":
								if (player3TotalHouses > 0 || player3TotalHotels > 0) {
									isPlayer3Pay = true;
									isChancePay = true;
									cardDrawingPay = ((25 * player3TotalHouses) + (100 * player3TotalHotels));
									enableButton(player3Pay);
									if (player3Coins < cardDrawingPay) {
										if (player3Cards.size() > 0) {
											enableButton(player3Mortgage);
										}
									}
								}
								break;
							case "Pay Tax $15":
								isPlayer3Pay = true;
								isChancePay = true;
								cardDrawingPay = 15;
								enableButton(player3Pay);
								if (player3Coins < cardDrawingPay) {
									if (player3Cards.size() > 0) {
										enableButton(player3Mortgage);
									}
								}
								break;
							case "Collect $100":
								moneyChangingAnimation(100, 3, 0);
								break;
							case "Collect $150":
								moneyChangingAnimation(150, 3, 0);
								break;
							case "Pay Each Player $50":
								isPlayer3Pay = true;
								isChancePay = true;
								cardDrawingPay = 100;
								enableButton(player3Pay);
								if (player3Coins < cardDrawingPay) {
									if (player3Cards.size() > 0) {
										enableButton(player3Mortgage);
									}
								}
								break;
							case "Go To Reading Railroad":
								moneyChangingAnimation(200, 3, 0);
								player3Location = 5;
								player3x = 602;
								player3y = 1175;
								break;
							}

							String firstChance = chances.get(0);
							chances.remove(0);
							chances.add(firstChance);
						}

						if (player3Location == 2 || player3Location == 17 || player3Location == 33) {
							communityChestLabel.setText("Community Chest: " + communityChests.get(0));
							switch (communityChests.get(0)) {
							case "Advance To Go":
								player3Location = 0;
								moneyChangingAnimation(200, 3, 0);
								player3x = 1122;
								player3y = 1175;
								break;
							case "Go To Jail":
								isJailPlayer3 = true;
								player3JailCount = 3;
								player3Location = 10;
								player3x = 75;
								player3y = 1175;
								break;
							case "Bank Pays You $50":
								moneyChangingAnimation(50, 3, 0);
								break;
							case "Collect $10":
								moneyChangingAnimation(10, 3, 0);
								break;
							case "Collect $20":
								moneyChangingAnimation(20, 3, 0);
								break;
							case "Receive $25":
								moneyChangingAnimation(25, 3, 0);
								break;
							case "Collect $100":
								moneyChangingAnimation(100, 3, 0);
								break;
							case "Collect $150":
								moneyChangingAnimation(150, 3, 0);
								break;
							case "Collect $200":
								moneyChangingAnimation(200, 3, 0);
								break;
							case "Inherit $100":
								moneyChangingAnimation(100, 3, 0);
								break;
							case "Collect $50 From Every Player":
								isCommunityPay = true;
								isPlayer1Pay = true;
								isPlayer2Pay = true;
								enableButton(player1Pay);
								break;
							case "Get $50":
								moneyChangingAnimation(50, 3, 0);
								break;
							case "Pay $50":
								isPlayer3Pay = true;
								isCommunityPay = true;
								cardDrawingPay = 50;
								enableButton(player3Pay);
								if (player3Coins < cardDrawingPay) {
									if (player3Cards.size() > 0) {
										enableButton(player3Mortgage);
									}
								}
								break;
							case "Pay $100":
								isPlayer3Pay = true;
								isCommunityPay = true;
								cardDrawingPay = 100;
								enableButton(player3Pay);
								if (player3Coins < cardDrawingPay) {
									if (player3Cards.size() > 0) {
										enableButton(player3Mortgage);
									}
								}
								break;
							case "Pay $150":
								isPlayer3Pay = true;
								isCommunityPay = true;
								cardDrawingPay = 150;
								enableButton(player3Pay);
								if (player3Coins < cardDrawingPay) {
									if (player3Cards.size() > 0) {
										enableButton(player3Mortgage);
									}
								}
								break;
							case "$40 Per House & $115 Per Hotel":
								if (player3TotalHouses > 0 || player3TotalHotels > 0) {
									isPlayer3Pay = true;
									isCommunityPay = true;
									cardDrawingPay = ((40 * player3TotalHouses) + (115 * player3TotalHotels));
									enableButton(player3Pay);
									if (player3Coins < cardDrawingPay) {
										if (player3Cards.size() > 0) {
											enableButton(player3Mortgage);
										}
									}
								}
								break;
							case "Get Out Of Jail Free":
								player3JailFree += 1;
								break;
							}
							String firstChest = communityChests.get(0);
							communityChests.remove(0);
							communityChests.add(firstChest);
						}
						if (player3Location == 30) {
							player3SameDiceNumCount = 0;
							isJailPlayer3 = true;
							player3Location = 10;
							player3x = 75;
							player3y = 1175;
						}
						if (player3Location == 4) {
							isPlayer3Pay = true;
							enableButton(player3Pay);
						} else if (player3Location == 20) {
							moneyChangingAnimation(500, 3, 0);
						}

						starLabel.setLocation(player3x, player3y);

						for (int i = 0; i < propertiesNotBought.size(); i++) {
							if (arr_places[player3Location].equals(propertiesNotBought.get(i))) {
								if (player3Coins >= prices_places[player3Location]) {
									enableButton(player3Buy);
								}
								enableButton(player3NotBuy);
								isPlayer3Buy = true;
								if (isNearestToNonColors == true) {
									isNearestToNonColors = false;
								}
							}
						}
						for (int i = 0; i < player1Cards.size(); i++) {
							if (arr_places[player3Location].equals(player1Cards.get(i))) {
								if (player3Location != 12 && player3Location != 28) {
									enableButton(player3Pay);
									isPlayer3Pay = true;
									isPlayer1Pay = true;
									if (player3Coins < cardDrawingPay) {
										if (player3Cards.size() > 0) {
											enableButton(player3Mortgage);
										}
									}
								} else {
									if (isPlayer3AtUtility == false) {
										isPlayer3AtUtility = true;
										isPlayer3Turn = true;
										isPlayer1Turn = false;
										previousRollDice1 = currentRollDice1;
										previousRollDice2 = currentRollDice2;
									}
								}
							}
						}
						for (int i = 0; i < player2Cards.size(); i++) {
							if (arr_places[player3Location].equals(player2Cards.get(i))) {
								if (player3Location != 12 && player3Location != 28) {
									enableButton(player3Pay);
									isPlayer3Pay = true;
									isPlayer2Pay = true;
									if (player3Coins < cardDrawingPay) {
										if (player3Cards.size() > 0) {
											enableButton(player3Mortgage);
										}
									}
								} else {
									if (isPlayer3AtUtility == false) {
										isPlayer3AtUtility = true;
										isPlayer3Turn = true;
										isPlayer1Turn = false;
										previousRollDice1 = currentRollDice1;
										previousRollDice2 = currentRollDice2;
									}
								}
							}
						}
						
						player3CoinsLabel.setText("$" + player3Coins);
					}
					
					if (isPlayer1Turn && isPlayer1Out == false) {
						playerTurnArrow.setLocation(260, 95);
					} else if (isPlayer2Turn && isPlayer2Out == false) {
						playerTurnArrow.setLocation(260, 295);
					} else if (isPlayer3Turn && isPlayer3Out == false) {
						playerTurnArrow.setLocation(260, 495);
					}
					
					/*if(propertiesNotBought.size() == 0) {
						player1Buy.hide();
						monopolyDataPanel.remove(player1Buy);
						player2Buy.hide();
						monopolyDataPanel.remove(player2Buy);
						player3Buy.hide();
						monopolyDataPanel.remove(player3Buy);
						player1NotBuy.hide();
						monopolyDataPanel.remove(player1NotBuy);
						player2NotBuy.hide();
						monopolyDataPanel.remove(player2NotBuy);
						player3NotBuy.hide();
						monopolyDataPanel.remove(player3NotBuy);
						
						monopolyDataPanel.add(player1Housing);
						monopolyDataPanel.add(player2Housing);
						monopolyDataPanel.add(player3Housing);
					}*/				
				}
			}
			
			@Override
			public void keyTyped(KeyEvent e) {

			}

		};
		monopolyFrame.addKeyListener(monopolyKeys);


		player1Buy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moneyChangingAnimation(prices_places[player1Location], 0, 1);
				player1CoinsLabel.setText("$" + player1Coins);
				player1Cards.add(arr_places[player1Location]);
				player1CardsLabel.add(new JLabel(arr_places[player1Location]));
				player1CardsLabel.get(player1Cards.size() - 1).setFont(new Font("Arial", Font.PLAIN, 12));
				monopolyDataPanel.add(player1CardsLabel.get(player1Cards.size() - 1));
				player1CardsLabel.get(player1Cards.size() - 1).setBounds(16, player1Cardsy + 15, 140, 15);
				player1Cardsy += 15;
				propertiesNotBought.remove(arr_places[player1Location]);
				disableButton(player1Buy);
				disableButton(player1NotBuy);
				if (arr_places[player1Location].indexOf("Railroad") > 0) {
					player1Railroads += 1;
				} else if (arr_places[player1Location].equals("Electric Company") || arr_places[player1Location].equals("Water Works")) {
					player1Utilities += 1;
				}
				switch(cardColors[player1Location]) {
					case "purple":
						player1ColorPairCards[0] += 1;
						if (player1ColorPairCards[0] == 2) {
							player1ColorPairCardsList.add("Baltic Ave.");
							player1ColorPairCardsList.add("Mediterranean Ave.");
							for (int i = 0; i < 2; i++) {
								player1ColorPairCardsHousesList.add(0);
								player1CardColors.add("purple");
								player1HousesLabel.add(new JLabel(""));
							}
							doubleRentPayment("purple");
						}
						break;
					case "lightblue":
						player1ColorPairCards[1] += 1;
						if (player1ColorPairCards[1] == 3) {
							player1ColorPairCardsList.add("Oriental Ave.");
							player1ColorPairCardsList.add("Vermont Ave.");
							player1ColorPairCardsList.add("Connecticut Ave.");
							for (int i = 0; i < 3; i++) {
								player1ColorPairCardsHousesList.add(0);
								player1CardColors.add("lightblue");
								player1HousesLabel.add(new JLabel(""));
							}
							doubleRentPayment("lightblue");
						}
						break;
					case "pink":
						player1ColorPairCards[2] += 1;
						if (player1ColorPairCards[2] == 3) {
							player1ColorPairCardsList.add("St. Charles Place");
							player1ColorPairCardsList.add("States Ave.");
							player1ColorPairCardsList.add("Virginia Ave.");
							for (int i = 0; i < 3; i++) {
								player1ColorPairCardsHousesList.add(0);
								player1CardColors.add("pink");
								player1HousesLabel.add(new JLabel(""));
							}
							doubleRentPayment("pink");
						}
						break;
					case "orange":
						player1ColorPairCards[3] += 1;
						if (player1ColorPairCards[3] == 3) {
							player1ColorPairCardsList.add("St. James Place");
							player1ColorPairCardsList.add("Tennessee Ave.");
							player1ColorPairCardsList.add("New York Ave.");
							for (int i = 0; i < 3; i++) {
								player1ColorPairCardsHousesList.add(0);
								player1CardColors.add("orange");
								player1HousesLabel.add(new JLabel(""));
							}
							doubleRentPayment("orange");
						}
						break;
					case "red":
						player1ColorPairCards[4] += 1;
						if (player1ColorPairCards[4] == 3) {
							player1ColorPairCardsList.add("Kentucky Ave.");
							player1ColorPairCardsList.add("Indiana Ave.");
							player1ColorPairCardsList.add("Illinois Ave.");
							for (int i = 0; i < 3; i++) {
								player1ColorPairCardsHousesList.add(0);
								player1CardColors.add("red");
								player1HousesLabel.add(new JLabel(""));
							}
							doubleRentPayment("red");
						}
						break;
					case "yellow":
						player1ColorPairCards[5] += 1;
						if (player1ColorPairCards[5] == 3) {
							player1ColorPairCardsList.add("Atlantic Ave.");
							player1ColorPairCardsList.add("Ventnor Ave.");
							player1ColorPairCardsList.add("Marvin Gardens");
							for (int i = 0; i < 3; i++) {
								player1ColorPairCardsHousesList.add(0);
								player1CardColors.add("yellow");
								player1HousesLabel.add(new JLabel(""));
							}
							doubleRentPayment("yellow");
						}
						break;
					case "green":
						player1ColorPairCards[6] += 1;
						if (player1ColorPairCards[6] == 3) {
							player1ColorPairCardsList.add("Pacific Ave.");
							player1ColorPairCardsList.add("North Carolina Ave.");
							player1ColorPairCardsList.add("Pennsylvania Ave.");
							for (int i = 0; i < 3; i++) {
								player1ColorPairCardsHousesList.add(0);
								player1CardColors.add("green");
								player1HousesLabel.add(new JLabel(""));
							}
							doubleRentPayment("green");
						}
						break;
					case "darkblue":
						player1ColorPairCards[7] += 1;
						if (player1ColorPairCards[7] == 2) {
							player1ColorPairCardsList.add("Park Place");
							player1ColorPairCardsList.add("Boardwalk");
							for (int i = 0; i < 2; i++) {
								player1ColorPairCardsHousesList.add(0);
								player1CardColors.add("darkblue");
								player1HousesLabel.add(new JLabel(""));
							}
							doubleRentPayment("darkblue");
						}
						break;
				}
				isPlayer1Buy = false;
				
				if (player1Location == 19) {
					player1Buy.hide();
					monopolyDataPanel.remove(player1Buy);
					monopolyDataPanel.add(player1Housing);
					enableButton(player1Housing);
				}
			}
		});

		player1Housing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//isPlayer1Turn = false;
				//isPlayer2Turn = true;
				
				JFrame housingFrame = new JFrame("Housing");
				JPanel housingPanel = new JPanel();
				housingPanel.setLayout(null);
				housingFrame.add(housingPanel);
				housingFrame.setSize(180, 400);
				housingFrame.setVisible(true);
				
				JButton[] colorPairCards = new JButton[player1ColorPairCardsList.size()];
				int y = 15;
				for (int i = 0; i < player1ColorPairCardsList.size(); i++) {
					colorPairCards[i] = new JButton(player1ColorPairCardsList.get(i));
					housingPanel.add(colorPairCards[i]);
					enableButton(colorPairCards[i]);
					colorPairCards[i].setForeground(Color.BLACK);
					coloredCardButtons(colorPairCards[i], player1CardColors.get(i));
					colorPairCards[i].setBounds(15, y, 120, 25);
					y += 30;
				}
				
				int i = 0;
				while (i < colorPairCards.length) {
					int j = i;
					colorPairCards[i].addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							for (int i = 0; i < colorPairCards.length; i++) {
								colorPairCards[i].hide();
								housingPanel.remove(colorPairCards[i]);
							}
							housingFrame.setSize(300, 170);
							
							JLabel coinsLabel = new JLabel("$" + player1Coins);
							housingPanel.add(coinsLabel);
							coinsLabel.show();
							coinsLabel.setBounds(125, 2, 100, 30);
							coinsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
							
							JLabel houseCountLabel = new JLabel("Houses: " + player1ColorPairCardsHousesList.get(j));
							housingPanel.add(houseCountLabel);
							houseCountLabel.show();
							houseCountLabel.setBounds(112, 15, 100, 30);
							houseCountLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
							
							JButton buyHouse = new JButton("Buy House");
							housingPanel.add(buyHouse);
							buyHouse.show();
							buyHouse.setBounds(60, 60, 80, 25);
							
							JButton sellHouse = new JButton("Sell House");
							housingPanel.add(sellHouse);
							enableButton(sellHouse);
							sellHouse.show();
							sellHouse.setBounds(145, 60, 80, 25);
							
							JButton back = new JButton("Back");
							housingPanel.add(back);
							enableButton(back);
							back.show();
							back.setBounds(105, 90, 70, 25);
							
							for (int i = 0; i < arr_places.length; i++) {
								if (arr_places[i].equals(player1ColorPairCardsList.get(j))) {
									cardLocation = i;
								}
							}
							
							JLabel cardPaymentPriceLabel = new JLabel("Payment Price: $" + places_PaymentPrices[cardLocation]);
							housingPanel.add(cardPaymentPriceLabel);
							cardPaymentPriceLabel.show();
							cardPaymentPriceLabel.setBounds(90, 30, 150, 30);
							cardPaymentPriceLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
							
							String cardColor = "";
							boolean canBuyHouse = true;
							boolean canSellHouse = false;
							
							for (int i = 0; i < arr_places.length; i++) {
								if(arr_places[i].equals(player1ColorPairCardsList.get(j))) {
									cardColor = cardColors[i];
								}
							}
							
							ArrayList<Integer> colorPairCardsHouses = new ArrayList<Integer>();
							for (int i = 0; i < player1ColorPairCardsList.size(); i++) {
								if (player1CardColors.get(i).equals(cardColor) && i != j) {
									colorPairCardsHouses.add(player1ColorPairCardsHousesList.get(i));
								}
							}
							
							for (int i = 0; i < colorPairCardsHouses.size(); i++) {
								if (player1ColorPairCardsHousesList.get(j) > colorPairCardsHouses.get(i)) {
									canBuyHouse = false;
								}
								if (player1ColorPairCardsHousesList.get(j) >= colorPairCardsHouses.get(i)) {
									canSellHouse = true;
								}
							}
							
							if (cardColors[cardLocation].equals("purple") || cardColors[cardLocation].equals("lightblue")) {
								houseCost = 50;
							} else if (cardColors[cardLocation].equals("pink") || cardColors[cardLocation].equals("orange")) {
								houseCost = 100;
							} else if (cardColors[cardLocation].equals("red") || cardColors[cardLocation].equals("yellow")) {
								houseCost = 150;
							} else if (cardColors[cardLocation].equals("green") || cardColors[cardLocation].equals("darkblue")) {
								houseCost = 200;
							}
							
							if (player1Coins >= houseCost && player1ColorPairCardsHousesList.get(j) < 5 && canBuyHouse == true) {
								enableButton(buyHouse);
							} else {
								disableButton(buyHouse);
							}
							
							if (player1ColorPairCardsHousesList.get(j) > 0 && canSellHouse == true) {
								enableButton(sellHouse);
							} else {
								disableButton(sellHouse);
							}
							
							buyHouse.addMouseListener(new MouseAdapter() {
								public void mouseEntered(MouseEvent e) {
									buyHouse.setText("-$" + houseCost);
								}
								public void mouseExited(MouseEvent e) {
									buyHouse.setText("Buy House");
								}
							});
							
							sellHouse.addMouseListener(new MouseAdapter() {
								public void mouseEntered(MouseEvent e) {
									sellHouse.setText("+$" + houseCost);
								}
								public void mouseExited(MouseEvent e) {
									sellHouse.setText("Sell House");
								}
							});
							
							buyHouse.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									monopolyBoard.hide();
									monopolyBoardPanel.remove(monopolyBoard);
									moneyChangingAnimation(houseCost, 0, 1);
									coinsLabel.setText("$" + (player1Coins - houseCost));
									int previousHouses = player1ColorPairCardsHousesList.get(j);
									player1ColorPairCardsHousesList.remove(j);
									player1ColorPairCardsHousesList.add(j, previousHouses + 1);
									houseCountLabel.setText("Houses: " + player1ColorPairCardsHousesList.get(j));
									housePositioning(arr_places[cardLocation], j);
									monopolyBoardPanel.add(monopolyBoard);
									monopolyBoard.show();
									
									switch (player1ColorPairCardsHousesList.get(j)) {
										case 1:
											places_PaymentPrices[cardLocation] = house1Payment[cardLocation];
											break;
										case 2:
											places_PaymentPrices[cardLocation] = house2Payment[cardLocation];
											break;
										case 3:
											places_PaymentPrices[cardLocation] = house3Payment[cardLocation];
											break;
										case 4:
											places_PaymentPrices[cardLocation] = house4Payment[cardLocation];
											break;
										case 5:
											places_PaymentPrices[cardLocation] = hotelPayment[cardLocation];
											break;
									}
									cardPaymentPriceLabel.setText("Payment Price: $" + places_PaymentPrices[cardLocation]);
									for (int i = 0; i < colorPairCardsHouses.size(); i++) {
										if (player1ColorPairCardsHousesList.get(j) > colorPairCardsHouses.get(i) || player1ColorPairCardsHousesList.get(j) == 5) {
											disableButton(buyHouse);
										} else if (player1Coins >= houseCost && player1ColorPairCardsHousesList.get(j) < colorPairCardsHouses.get(i)) {
											enableButton(buyHouse);
										}
										if (player1ColorPairCardsHousesList.get(j) < colorPairCardsHouses.get(i) || player1ColorPairCardsHousesList.get(j) == 0) {
											disableButton(sellHouse);
										} else if (player1ColorPairCardsHousesList.get(j) > 0 && player1ColorPairCardsHousesList.get(j) >= colorPairCardsHouses.get(i)) {
											enableButton(sellHouse);
										}
									}
								}
							});
							
							sellHouse.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									moneyChangingAnimation(houseCost, 1, 0);
									coinsLabel.setText("$" + (player1Coins + houseCost));
									int previousHouses = player1ColorPairCardsHousesList.get(j);
									player1ColorPairCardsHousesList.remove(j);
									player1ColorPairCardsHousesList.add(j, previousHouses - 1);
									houseCountLabel.setText("Houses: " + player1ColorPairCardsHousesList.get(j));
									
									switch (player1ColorPairCardsHousesList.get(j)) {
										case 0:
											places_PaymentPrices[cardLocation] = places_PaymentPrices2[cardLocation] * 2;
											break;
										case 1:
											places_PaymentPrices[cardLocation] = house1Payment[cardLocation];
											break;
										case 2:
											places_PaymentPrices[cardLocation] = house2Payment[cardLocation];
											break;
										case 3:
											places_PaymentPrices[cardLocation] = house3Payment[cardLocation];
											break;
										case 4:
											places_PaymentPrices[cardLocation] = house4Payment[cardLocation];
											break;
										case 5:
											places_PaymentPrices[cardLocation] = hotelPayment[cardLocation];
											break;
									}
									cardPaymentPriceLabel.setText("Payment Price: $" + places_PaymentPrices[cardLocation]);
									for (int i = 0; i < colorPairCardsHouses.size(); i++) {
										if (player1ColorPairCardsHousesList.get(j) < colorPairCardsHouses.get(i) || player1ColorPairCardsHousesList.get(j) == 0) {
											disableButton(sellHouse);
										} else if (player1ColorPairCardsHousesList.get(j) > 0 && player1ColorPairCardsHousesList.get(j) >= colorPairCardsHouses.get(i)) {
											enableButton(sellHouse);
										}
										if (player1ColorPairCardsHousesList.get(j) > colorPairCardsHouses.get(i) || player1ColorPairCardsHousesList.get(j) == 5) {
											disableButton(buyHouse);
										} else if (player1Coins >= houseCost && player1ColorPairCardsHousesList.get(j) <= colorPairCardsHouses.get(i)) {
											enableButton(buyHouse);
										}
									}
								}
							});
							
							back.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									housingPanel.remove(buyHouse);
									housingPanel.remove(sellHouse);
									housingPanel.remove(coinsLabel);
									housingPanel.remove(houseCountLabel);
									housingPanel.remove(cardPaymentPriceLabel);
									housingPanel.remove(back);
									buyHouse.hide();
									sellHouse.hide();
									coinsLabel.hide();
									houseCountLabel.hide();
									cardPaymentPriceLabel.hide();
									back.hide();
									
									housingFrame.setSize(165, 400);
									int y = 15;
									for (int i = 0; i < player1ColorPairCardsList.size(); i++) {
										housingPanel.add(colorPairCards[i]);
										colorPairCards[i].show();
										enableButton(colorPairCards[i]);
										colorPairCards[i].setForeground(Color.BLACK);
										coloredCardButtons(colorPairCards[i], player1CardColors.get(i));
										colorPairCards[i].setBounds(15, y, 120, 25);
										y += 30;
									}
								}
							});
						}
					});
					i++;
				}
			}
		});

		player1NotBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isPlayer2Pass = false;
				isPlayer3Pass = false;
				JFrame bidFrame = new JFrame("Bid Time");
				bidFrame.setSize(300, 200);
				bidFrame.setVisible(true);
				JPanel bidPanel = new JPanel();
				bidPanel.setLayout(null);
				bidFrame.add(bidPanel);
				JLabel player2Bidder = new JLabel("Player 2");
				bidPanel.add(player2Bidder);
				player2Bidder.setFont(new Font("Times New Roman", Font.PLAIN, 16));
				player2Bidder.setBounds(20, 10, 100, 30);
				JLabel player3Bidder = new JLabel("Player 3");
				bidPanel.add(player3Bidder);
				player3Bidder.setFont(new Font("Times New Roman", Font.PLAIN, 16));
				player3Bidder.setBounds(200, 10, 100, 30);
				
				bidPrice = prices_places[player1Location]/2;
				
				JButton player2Bid = new JButton("+10");
				bidPanel.add(player2Bid);
				player2Bid.setBounds(20, 40, 50, 20);
				player2Bid.setFocusable(false);
				
				JButton player3Bid = new JButton("+10");
				bidPanel.add(player3Bid);
				player3Bid.setBounds(200, 40, 50, 20);
				disableButton(player3Bid);
				player3Bid.setFocusable(false);
				
				JButton player2Pass = new JButton("Pass");
				bidPanel.add(player2Pass);
				player2Pass.setBounds(20, 90, 50, 20);
				enableButton(player2Pass);
				player2Pass.setFocusable(false);
				
				JButton player3Pass = new JButton("Pass");
				bidPanel.add(player3Pass);
				player3Pass.setBounds(200, 90, 50, 20);
				disableButton(player3Pass);
				player3Pass.setFocusable(false);
				
				JButton player2Ok = new JButton("Ok");
				bidPanel.add(player2Ok);
				player2Ok.setBounds(20, 65, 50, 20);
				player2Ok.setFocusable(false);
				
				JButton player3Ok = new JButton("Ok");
				bidPanel.add(player3Ok);
				player3Ok.setBounds(200, 65, 50, 20);
				disableButton(player3Ok);
				player3Ok.setFocusable(false);
				
				JButton allPass = new JButton("All Pass");
				bidPanel.add(allPass);
				enableButton(allPass);
				allPass.setBounds(105, 90, 60, 20);
				
				if(player2Coins >= bidPrice) {
					enableButton(player2Ok);
				}
				if (player2Coins >= bidPrice + 10) {
					if (player3Coins >= bidPrice || player3Coins >= bidPrice + 10) {
						enableButton(player2Bid);
					} else {
						disableButton(player2Bid);
					}
				} else {
					disableButton(player2Bid);
					disableButton(player2Ok);
				}
				
				JLabel bidPriceLabel = new JLabel("Bid Price: $" + bidPrice);
				bidPanel.add(bidPriceLabel);
				bidPriceLabel.setBounds(95, 50, 100, 30);
				bidPriceLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
				
				player2Bid.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						disableButton(player2Pass);
						bidPrice += 10;
						bidPriceLabel.setText("Bid Price: $" + bidPrice);
						enableButton(player2Ok);
						if (player2Coins >= bidPrice + 10) {
							enableButton(player2Bid);
						} else {
							disableButton(player2Bid);
						}
					}
				});
				
				player3Bid.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						disableButton(player3Pass);
						bidPrice += 10;
						bidPriceLabel.setText("Bid Price: $" + bidPrice);
						enableButton(player3Ok);
						if (player3Coins >= bidPrice + 10) {
							enableButton(player3Bid);
						} else {
							disableButton(player3Bid);
						}
					}
				});
				
				player2Pass.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						isPlayer2Pass = true;
						if (isPlayer2Pass == true && isPlayer3Pass == true) {
							for(int i = 0; i < propertiesNotBought.size(); i++) {
								if(propertiesNotBought.get(i).equals(arr_places[player1Location])) {
									propertiesNotBought.remove(i);
								}
							}
							bidFrame.dispose();
							isPlayer1Buy = false;
							disableButton(player1NotBuy);
							disableButton(player1Buy);
						} else if (isPlayer2Pass == true && isPlayer3Pass == false) {
							if (player3Coins < bidPrice || player3Coins < bidPrice + 10) {
								enableButton(player3Pass);
							} else {
								enableButton(player3Ok);
							}
						}
						disableButton(player2Bid);
						disableButton(player2Pass);
						disableButton(player2Ok);
					}
				});
				
				player3Pass.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						isPlayer3Pass = true;
						if (isPlayer2Pass == true && isPlayer3Pass == true) {
							for(int i = 0; i < propertiesNotBought.size(); i++) {
								if(propertiesNotBought.get(i).equals(arr_places[player1Location])) {
									propertiesNotBought.remove(i);
								}
							}
							bidFrame.dispose();
							isPlayer1Buy = false;
							disableButton(player1NotBuy);
							disableButton(player1Buy);
						} else if (isPlayer3Pass == true && isPlayer2Pass == false) {
							if (player2Coins < bidPrice || player2Coins < bidPrice + 10) {
								enableButton(player2Pass);
							} else {
								enableButton(player2Ok);
							}
						}
						disableButton(player3Bid);
						disableButton(player3Pass);
						disableButton(player3Ok);
					}
				});
				
				player2Ok.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (player3Coins < bidPrice || player3Coins < bidPrice + 10) {
							isPlayer3Pass = true;
						}
						if (isPlayer3Pass == true) {
							moneyChangingAnimation(bidPrice, 0, 2);
							player2CoinsLabel.setText("$" + player2Coins);
							player2Cards.add(arr_places[player1Location]);
							player2CardsLabel.add(new JLabel(arr_places[player1Location]));
							player2CardsLabel.get(player2Cards.size() - 1).setFont(new Font("Arial", Font.PLAIN, 12));
							monopolyDataPanel.add(player2CardsLabel.get(player2Cards.size() - 1));
							player2CardsLabel.get(player2Cards.size() - 1).setBounds(16, player2Cardsy + 15, 140, 15);
							player2Cardsy += 15;
							propertiesNotBought.remove(arr_places[player1Location]);
							disableButton(player1Buy);
							disableButton(player1NotBuy);
							if (arr_places[player1Location].indexOf("Railroad") > 0) {
								player2Railroads += 1;
							} else if (arr_places[player1Location].equals("Electric Company") || arr_places[player1Location].equals("Water Works")) {
								player2Utilities += 1;
							}
							switch(cardColors[player1Location]) {
								case "purple":
									player2ColorPairCards[0] += 1;
									break;
								case "lightblue":
									player2ColorPairCards[1] += 1;
									break;
								case "pink":
									player2ColorPairCards[2] += 1;
									break;
								case "orange":
									player2ColorPairCards[3] += 1;
									break;
								case "red":
									player2ColorPairCards[4] += 1;
									break;
								case "yellow":
									player2ColorPairCards[5] += 1;
									break;
								case "green":
									player2ColorPairCards[6] += 1;
									break;
								case "darkblue":
									player2ColorPairCards[7] += 1;
									break;
							}
							isPlayer1Buy = false;
							bidFrame.dispose();
						} else {
							disableButton(player2Bid);
							disableButton(player2Pass);
							disableButton(player2Ok);
							if (player3Coins >= bidPrice + 10) {
								enableButton(player3Bid);
							}
							enableButton(player3Pass);
						}
					}
				});
				
				player3Ok.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (player2Coins < bidPrice || player2Coins < bidPrice + 10) {
							isPlayer2Pass = true;
						}
						if (isPlayer2Pass == true) {
							moneyChangingAnimation(bidPrice, 0, 3);
							player3CoinsLabel.setText("$" + player3Coins);
							player3Cards.add(arr_places[player1Location]);
							player3CardsLabel.add(new JLabel(arr_places[player1Location]));
							player3CardsLabel.get(player3Cards.size() - 1).setFont(new Font("Arial", Font.PLAIN, 12));
							monopolyDataPanel.add(player3CardsLabel.get(player3Cards.size() - 1));
							player3CardsLabel.get(player3Cards.size() - 1).setBounds(16, player3Cardsy + 15, 140, 15);
							player3Cardsy += 15;
							propertiesNotBought.remove(arr_places[player1Location]);
							disableButton(player1Buy);
							disableButton(player1NotBuy);
							if (arr_places[player1Location].indexOf("Railroad") > 0) {
								player3Railroads += 1;
							} else if (arr_places[player1Location].equals("Electric Company") || arr_places[player1Location].equals("Water Works")) {
								player3Utilities += 1;
							}
							switch(cardColors[player1Location]) {
								case "purple":
									player3ColorPairCards[0] += 1;
									break;
								case "lightblue":
									player3ColorPairCards[1] += 1;
									break;
								case "pink":
									player3ColorPairCards[2] += 1;
									break;
								case "orange":
									player3ColorPairCards[3] += 1;
									break;
								case "red":
									player3ColorPairCards[4] += 1;
									break;
								case "yellow":
									player3ColorPairCards[5] += 1;
									break;
								case "green":
									player3ColorPairCards[6] += 1;
									break;
								case "darkblue":
									player3ColorPairCards[7] += 1;
									break;
							}
							isPlayer1Buy = false;
							bidFrame.dispose();
						} else {
							disableButton(player3Bid);
							disableButton(player3Pass);
							disableButton(player3Ok);
							if (player2Coins >= bidPrice + 10) {
								enableButton(player2Bid);
							}
							enableButton(player2Pass);
						}
					}
				});
				
				allPass.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						isPlayer2Pass = true;
						isPlayer3Pass = true;
						bidFrame.dispose();
						disableButton(player1Buy);
						disableButton(player1NotBuy);
						isPlayer1Buy = false;
					}
				});
			}
		});

		player1Pay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isChancePay == true) {
					if ((isPlayer2Pay == true || isPlayer2Pay == false) && isPlayer3Pay == true && player1Coins >= cardDrawingPay) {
						if (isPlayer2Pay == true) {
							moneyChangingAnimation(50, 2, 1);
							isPlayer2Pay = false;
						} else if (isPlayer3Pay == true) {
							moneyChangingAnimation(50, 3, 1);
							isPlayer3Pay = false;
							isPlayer1Pay = false;
							isChancePay = false;
							disableButton(player1Pay);
						}
					} else if(player1Coins >= cardDrawingPay) {
						moneyChangingAnimation(cardDrawingPay, 0, 1);
						isPlayer1Pay = false;
						isChancePay = false;
						disableButton(player1Pay);
					}
				} else if (isCommunityPay == true) {
					if (isPlayer2Pay == false && isPlayer3Pay == true && player1Coins >= 50) {
						moneyChangingAnimation(50, 2, 1);
						isCommunityPay = false;
						isPlayer1Pay = false;
						isPlayer3Pay = false;
						disableButton(player1Pay);
					} else if (isPlayer2Pay == true && isPlayer3Pay == false && player1Coins >= 50) {
						moneyChangingAnimation(50, 3, 1);
						disableButton(player1Pay);
						enableButton(player2Pay);
					} else if (player1Coins >= cardDrawingPay) {
						moneyChangingAnimation(cardDrawingPay, 0, 1);
						isPlayer1Pay = false;
						isCommunityPay = false;
						disableButton(player1Pay);
					}
				} else if (player1Location == 4) {
					if(player1Coins >= 200) {
						moneyChangingAnimation(200, 0, 1);
						isPlayer1Pay = false;
						disableButton(player1Pay);
					}
				} else if (player1Location == 38) {
					if(player1Coins >= 75) {
						moneyChangingAnimation(75, 0, 1);
						isPlayer1Pay = false;
						disableButton(player1Pay);
					}
				} else if (isJailPlayer1 == true) {
					if (player1Coins >= 50) {
						moneyChangingAnimation(50, 0, 1);
						isJailPlayer1 = false;
						player1JailCount = 3;
						disableButton(player1Pay);
						isPlayer1Pay = false;
					}
				} else if (isPlayer2Pay == true) {
					if (isJailPlayer2 == false) {
						if (arr_places[player1Location].indexOf("Railroad") > 0) {
							int totalRailroadPayment = railroadPayment(2);
							if (isNearestToNonColors == true) {
								totalRailroadPayment *= 2;
							}
							if (player1Coins >= totalRailroadPayment) {
								moneyChangingAnimation(totalRailroadPayment, 2, 1);
								disableButton(player1Pay);
								isPlayer1Pay = false;
								isPlayer2Pay = false;
								if (isNearestToNonColors == true) {
									isNearestToNonColors = false;
								}
							}
						} else if (isPlayer1AtUtility == true) {
							if (player2Utilities == 1 && isNearestToNonColors == false) {
								if (player1Coins >= 4 * (currentRollDice1 + currentRollDice2)) {
									moneyChangingAnimation(4 * (currentRollDice1 + currentRollDice2), 2, 1);
									disableButton(player1Pay);
									isPlayer1Pay = false;
									isPlayer2Pay = false;
									isPlayer1AtUtility = false;
								}
							} else if (player2Utilities > 1 || isNearestToNonColors == true) {
								if (player1Coins >= 10 * (currentRollDice1 + currentRollDice2)) {
									moneyChangingAnimation(10 * (currentRollDice1 + currentRollDice2), 2, 1);
									disableButton(player1Pay);
									isPlayer1Pay = false;
									isPlayer2Pay = false;
									isPlayer1AtUtility = false;
									if (isNearestToNonColors == true) {
										isNearestToNonColors = false;
									}
								}
							}
						} else {
							if (player1Coins >= places_PaymentPrices[player1Location]) {
								moneyChangingAnimation(places_PaymentPrices[player1Location], 2, 1);
								disableButton(player1Pay);
								isPlayer1Pay = false;
								isPlayer2Pay = false;
							}
						}
					} else if (isJailPlayer2 == true) {
						if (arr_places[player1Location].indexOf("Railroad") > 0) {
							int totalRailroadPayment = railroadPayment(2)/2;
							if (isNearestToNonColors == true) {
								totalRailroadPayment *= 2;
							}
							if (player1Coins >= totalRailroadPayment) {
								moneyChangingAnimation(totalRailroadPayment, 2, 1);
								disableButton(player1Pay);
								isPlayer1Pay = false;
								isPlayer2Pay = false;
								if (isNearestToNonColors == true) {
									isNearestToNonColors = false;
								}
							}
						} else if (isPlayer1AtUtility == true) {
							if (player2Utilities == 1 && isNearestToNonColors == false) {
								if (player1Coins >= (4 * (currentRollDice1 + currentRollDice2)) / 2) {
									moneyChangingAnimation((4 * (currentRollDice1 + currentRollDice2)) / 2, 2, 1);
									disableButton(player1Pay);
									isPlayer1Pay = false;
									isPlayer2Pay = false;
									isPlayer1AtUtility = false;
								}
							} else if (player2Utilities > 1 || isNearestToNonColors == true) {
								if (player1Coins >= (10 * (currentRollDice1 + currentRollDice2)) / 2) {
									moneyChangingAnimation((10 * (currentRollDice1 + currentRollDice2)) / 2, 2, 1);
									disableButton(player1Pay);
									isPlayer1Pay = false;
									isPlayer2Pay = false;
									isPlayer1AtUtility = false;
									if (isNearestToNonColors == true) {
										isNearestToNonColors = false;
									}
								}
							}
						} else {
							if (player1Coins >= places_PaymentPrices[player1Location] / 2) {
								moneyChangingAnimation(places_PaymentPrices[player1Location] / 2, 2, 1);
								isPlayer1Pay = false;
								isPlayer2Pay = false;
							}
						}
					}
				} else if (isPlayer3Pay == true) {
					if (isJailPlayer3 == false) {
						if (arr_places[player1Location].indexOf("Railroad") > 0) {
							int totalRailroadPayment = railroadPayment(3);
							if (isNearestToNonColors == true) {
								totalRailroadPayment *= 2;
							}
							if (player1Coins >= totalRailroadPayment) {
								moneyChangingAnimation(totalRailroadPayment, 3, 1);
								disableButton(player1Pay);
								isPlayer1Pay = false;
								isPlayer3Pay = false;
								if (isNearestToNonColors == true) {
									isNearestToNonColors = false;
								}
							}
						} else if (isPlayer1AtUtility == true) {
							if (player3Utilities == 1 && isNearestToNonColors == false) {
								if (player1Coins >= 4 * (currentRollDice1 + currentRollDice2)) {
									moneyChangingAnimation(4 * (currentRollDice1 + currentRollDice2), 3, 1);
									disableButton(player1Pay);
									isPlayer1Pay = false;
									isPlayer3Pay = false;
									isPlayer1AtUtility = false;
								}
							} else if (player3Utilities > 1 || isNearestToNonColors == true) {
								if (player1Coins >= 10 * (currentRollDice1 + currentRollDice2)) {
									moneyChangingAnimation(10 * (currentRollDice1 + currentRollDice2), 3, 1);
									disableButton(player1Pay);
									isPlayer1Pay = false;
									isPlayer3Pay = false;
									isPlayer1AtUtility = false;
									if (isNearestToNonColors == true) {
										isNearestToNonColors = false;
									}
								}
							}
						} else {
							if (player1Coins >= places_PaymentPrices[player1Location]) {
								player1Coins -= places_PaymentPrices[player1Location];
								player3Coins += places_PaymentPrices[player1Location];
								moneyChangingAnimation(places_PaymentPrices[player1Location], 3, 1);
								disableButton(player1Pay);
								isPlayer1Pay = false;
								isPlayer3Pay = false;
							}
						}
					} else if (isJailPlayer3 == true) {
						if (arr_places[player1Location].indexOf("Railroad") > 0) {
							int totalRailroadPayment = railroadPayment(3)/2;
							if (isNearestToNonColors == true) {
								totalRailroadPayment *= 2;
							}
							if (player1Coins >= totalRailroadPayment) {
								moneyChangingAnimation(totalRailroadPayment, 3, 1);
								disableButton(player1Pay);
								isPlayer1Pay = false;
								isPlayer3Pay = false;
								if (isNearestToNonColors == true) {
									isNearestToNonColors = false;
								}
							}
						} else if (isPlayer1AtUtility == true) {
							if (player3Utilities == 1 && isNearestToNonColors == false) {
								if (player1Coins >= (4 * (currentRollDice1 + currentRollDice2)) / 2) {
									moneyChangingAnimation((4 * (currentRollDice1 + currentRollDice2)) / 2, 3, 1);
									disableButton(player1Pay);
									isPlayer1Pay = false;
									isPlayer3Pay = false;
									isPlayer1AtUtility = false;
								}
							} else if (player3Utilities > 1 || isNearestToNonColors == true) {
								if (player1Coins >= (10 * (currentRollDice1 + currentRollDice2)) / 2) {
									moneyChangingAnimation((10 * (currentRollDice1 + currentRollDice2)) / 2, 3, 1);
									disableButton(player1Pay);
									isPlayer1Pay = false;
									isPlayer3Pay = false;
									isPlayer1AtUtility = false;
									if (isNearestToNonColors == true) {
										isNearestToNonColors = false;
									}
								}
							}
						} else {
							if (player1Coins >= places_PaymentPrices[player1Location] / 2) {
								moneyChangingAnimation(places_PaymentPrices[player1Location] / 2, 3, 1);
								disableButton(player1Pay);
								isPlayer1Pay = false;
								isPlayer3Pay = false;
							}
						}
					}
				}
				
				player1CoinsLabel.setText("$" + player1Coins);
				player2CoinsLabel.setText("$" + player2Coins);
				player3CoinsLabel.setText("$" + player3Coins);
			}
		});

		player1Mortgage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame mortgageFrame = new JFrame("Mortgage Cards");
				JPanel mortgagePanel = new JPanel();
				mortgagePanel.setLayout(null);
				mortgageFrame.add(mortgagePanel);
				mortgageFrame.setSize(165, 400);
				mortgageFrame.setVisible(true);
				JScrollPane mortgageSp = new JScrollPane(mortgagePanel);
				mortgageFrame.add(mortgageSp);
				mortgageSp.setSize(165, 400);
				int y = 15;
				JButton[] mortgageCardsButtons = new JButton[player1Cards.size()];
				for (int i = 0; i < mortgageCardsButtons.length; i++) {
					mortgageCardsButtons[i] = new JButton(player1Cards.get(i));
					mortgagePanel.add(mortgageCardsButtons[i]);
					enableButton(mortgageCardsButtons[i]);
					mortgageCardsButtons[i].setBounds(15, y, 120, 25);
					y += 30;
				}

				int i = 0;
				while (i < mortgageCardsButtons.length) {
					int j = i;
					mortgageCardsButtons[j].addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mortgageFrame.dispose();
							player1MortgageCards.add(player1Cards.get(j));
							int totalMoneyRecieved = 0;
							for (int i = 0; i < arr_places.length; i++) {
								if (player1Cards.get(j).equals(arr_places[i])) {
									totalMoneyRecieved += mortgagePricesPlaces[i];
								}
							}
							
							for (int i = 0; i < arr_places.length; i++) {
								if (arr_places[i].equals(player1Cards.get(j))) {
									cardLocation = i;
								}
							}
							
							if (cardColors[cardLocation].equals("purple") || cardColors[cardLocation].equals("lightblue")) {
								houseCost = 50;
							} else if (cardColors[cardLocation].equals("pink") || cardColors[cardLocation].equals("orange")) {
								houseCost = 100;
							} else if (cardColors[cardLocation].equals("red") || cardColors[cardLocation].equals("yellow")) {
								houseCost = 150;
							} else if (cardColors[cardLocation].equals("green") || cardColors[cardLocation].equals("darkblue")) {
								houseCost = 200;
							}
							
							String cardColor = cardColors[cardLocation];
							int k = 0;
							while (k < player1ColorPairCardsList.size()) {
								if (player1CardColors.get(k).equals(cardColor)) {
									totalMoneyRecieved += (player1ColorPairCardsHousesList.get(k) * houseCost);
									player1ColorPairCardsHousesList.remove(k);
									player1ColorPairCardsList.remove(k);
									player1CardColors.remove(k);
								} else {
									k++;
								}
							}
							
							places_PaymentPrices[cardLocation] = 0;
							
							if (cardColor.equals("") == false) {
								for (int i = 0; i < cardColors.length; i++) {
									if (player1Cards.get(j).equals(arr_places[i]) == false && cardColors[i].equals(cardColor)) {
										places_PaymentPrices[i] = places_PaymentPrices2[i];
									}
								}
							}
							
							if (player1Cards.get(j).indexOf("Railroad") >= 0) {
								player1Railroads--;
							} else if (player1Cards.get(j).equals("Water Works") || player1Cards.get(j).equals("Electric Company")) {
								player1Utilities--;
							}
							
							moneyChangingAnimation(totalMoneyRecieved, 1, 0);
							player1CoinsLabel.setText("$" + player1Coins);
							player1Cards.remove(j);
							player1CardsLabel.get(j).hide();
							monopolyDataPanel.remove(player1CardsLabel.get(j));
							player1CardsLabel.remove(j);
							player1Cardsy = 130;
							for (int i = 0; i < player1CardsLabel.size(); i++) {
								player1CardsLabel.get(i).setLocation(16, player1Cardsy + 15);
								player1Cardsy += 15;
							}
							if (player1Cards.size() == 0) {
								disableButton(player1Mortgage);
							}
							if (player1ColorPairCardsList.size() == 0) {
								disableButton(player1Housing);
							}
						}
					});
					i++;
				}
			}
		});

		player2Buy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moneyChangingAnimation(prices_places[player2Location], 0, 2);
				player2CoinsLabel.setText("$" + player2Coins);
				player2Cards.add(arr_places[player2Location]);
				player2CardsLabel.add(new JLabel(arr_places[player2Location]));
				player2CardsLabel.get(player2Cards.size() - 1).setFont(new Font("Arial", Font.PLAIN, 12));
				monopolyDataPanel.add(player2CardsLabel.get(player2Cards.size() - 1));
				player2CardsLabel.get(player2Cards.size() - 1).setBounds(16, player2Cardsy + 15, 140, 15);
				player2Cardsy += 15;
				propertiesNotBought.remove(arr_places[player2Location]);
				disableButton(player2Buy);
				disableButton(player2NotBuy);
				if (arr_places[player2Location].indexOf("Railroad") > 0) {
					player2Railroads += 1;
				} else if (arr_places[player2Location].equals("Electric Company") || arr_places[player2Location].equals("Water Works")) {
					player2Utilities += 1;
				}
				switch(cardColors[player2Location]) {
					case "purple":
						player2ColorPairCards[0] += 1;
						if (player2ColorPairCards[0] == 2) {
							player2ColorPairCardsList.add("Baltic Ave.");
							player2ColorPairCardsList.add("Mediterranean Ave.");
							for (int i = 0; i < 2; i++) {
								player2ColorPairCardsHousesList.add(0);
								player2CardColors.add("purple");
							}
							doubleRentPayment("purple");
						}
						break;
					case "lightblue":
						player2ColorPairCards[1] += 1;
						if (player2ColorPairCards[1] == 3) {
							player2ColorPairCardsList.add("Oriental Ave.");
							player2ColorPairCardsList.add("Vermont Ave.");
							player2ColorPairCardsList.add("Connecticut Ave.");
							for (int i = 0; i < 3; i++) {
								player2ColorPairCardsHousesList.add(0);
								player2CardColors.add("lightblue");
							}
							doubleRentPayment("lightblue");
						}
						break;
					case "pink":
						player2ColorPairCards[2] += 1;
						if (player2ColorPairCards[2] == 3) {
							player2ColorPairCardsList.add("St. Charles Place");
							player2ColorPairCardsList.add("States Ave.");
							player2ColorPairCardsList.add("Virginia Ave.");
							for (int i = 0; i < 3; i++) {
								player2ColorPairCardsHousesList.add(0);
								player2CardColors.add("pink");
							}
							doubleRentPayment("pink");
						}
						break;
					case "orange":
						player2ColorPairCards[3] += 1;
						if (player2ColorPairCards[3] == 3) {
							player2ColorPairCardsList.add("St. James Place");
							player2ColorPairCardsList.add("Tennessee Ave.");
							player2ColorPairCardsList.add("New York Ave.");
							for (int i = 0; i < 3; i++) {
								player2ColorPairCardsHousesList.add(0);
								player2CardColors.add("orange");
							}
							doubleRentPayment("orange");
						}
						break;
					case "red":
						player2ColorPairCards[4] += 1;
						if (player2ColorPairCards[4] == 3) {
							player2ColorPairCardsList.add("Kentucky Ave.");
							player2ColorPairCardsList.add("Indiana Ave.");
							player2ColorPairCardsList.add("Illinois Ave.");
							for (int i = 0; i < 3; i++) {
								player2ColorPairCardsHousesList.add(0);
								player2CardColors.add("red");
							}
							doubleRentPayment("red");
						}
						break;
					case "yellow":
						player2ColorPairCards[5] += 1;
						if (player2ColorPairCards[5] == 3) {
							player2ColorPairCardsList.add("Atlantic Ave.");
							player2ColorPairCardsList.add("Ventnor Ave.");
							player2ColorPairCardsList.add("Marvin Gardens");
							for (int i = 0; i < 3; i++) {
								player2ColorPairCardsHousesList.add(0);
								player2CardColors.add("yellow");
							}
							doubleRentPayment("yellow");
						}
						break;
					case "green":
						player2ColorPairCards[6] += 1;
						if (player2ColorPairCards[6] == 3) {
							player2ColorPairCardsList.add("Pacific Ave.");
							player2ColorPairCardsList.add("North Carolina Ave.");
							player2ColorPairCardsList.add("Pennsylvania Ave.");
							for (int i = 0; i < 3; i++) {
								player2ColorPairCardsHousesList.add(0);
								player2CardColors.add("green");
							}
							doubleRentPayment("green");
						}
						break;
					case "darkblue":
						player2ColorPairCards[7] += 1;
						if (player2ColorPairCards[7] == 2) {
							player2ColorPairCardsList.add("Park Place");
							player2ColorPairCardsList.add("Boardwalk");
							for (int i = 0; i < 2; i++) {
								player2ColorPairCardsHousesList.add(0);
								player2CardColors.add("darkblue");
							}
							doubleRentPayment("darkblue");
						}
						break;
				}
				isPlayer2Buy = false;
			}
		});

		player2Housing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame housingFrame = new JFrame("Housing");
				JPanel housingPanel = new JPanel();
				housingPanel.setLayout(null);
				housingFrame.add(housingPanel);
				housingFrame.setSize(180, 400);
				housingFrame.setVisible(true);
				
				JButton[] colorPairCards = new JButton[player2ColorPairCardsList.size()];
				int y = 15;
				for (int i = 0; i < player2ColorPairCardsList.size(); i++) {
					colorPairCards[i] = new JButton(player2ColorPairCardsList.get(i));
					housingPanel.add(colorPairCards[i]);
					enableButton(colorPairCards[i]);
					colorPairCards[i].setForeground(Color.BLACK);
					coloredCardButtons(colorPairCards[i], player2CardColors.get(i));
					colorPairCards[i].setBounds(15, y, 120, 25);
					y += 30;
				}
				
				int i = 0;
				while (i < colorPairCards.length) {
					int j = i;
					colorPairCards[i].addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							for (int i = 0; i < colorPairCards.length; i++) {
								colorPairCards[i].hide();
								housingPanel.remove(colorPairCards[i]);
							}
							housingFrame.setSize(300, 170);
							
							JLabel coinsLabel = new JLabel("$" + player2Coins);
							housingPanel.add(coinsLabel);
							coinsLabel.show();
							coinsLabel.setBounds(125, 2, 100, 30);
							coinsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
							
							JLabel houseCountLabel = new JLabel("Houses: " + player2ColorPairCardsHousesList.get(j));
							housingPanel.add(houseCountLabel);
							houseCountLabel.show();
							houseCountLabel.setBounds(112, 15, 100, 30);
							houseCountLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
							
							JButton buyHouse = new JButton("Buy House");
							housingPanel.add(buyHouse);
							buyHouse.show();
							buyHouse.setBounds(60, 60, 80, 25);
							
							JButton sellHouse = new JButton("Sell House");
							housingPanel.add(sellHouse);
							sellHouse.show();
							sellHouse.setBounds(145, 60, 80, 25);
							
							JButton back = new JButton("Back");
							housingPanel.add(back);
							enableButton(back);
							back.show();
							back.setBounds(105, 90, 70, 25);
							
							for (int i = 0; i < arr_places.length; i++) {
								if (arr_places[i].equals(player2ColorPairCardsList.get(j))) {
									cardLocation = i;
								}
							}
							
							JLabel cardPaymentPriceLabel = new JLabel("Payment Price: $" + places_PaymentPrices[cardLocation]);
							housingPanel.add(cardPaymentPriceLabel);
							cardPaymentPriceLabel.show();
							cardPaymentPriceLabel.setBounds(90, 30, 150, 30);
							cardPaymentPriceLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
							
							String cardColor = "";
							boolean canBuyHouse = true;
							boolean canSellHouse = false;
							
							for (int i = 0; i < arr_places.length; i++) {
								if(arr_places[i].equals(player2ColorPairCardsList.get(j))) {
									cardColor = cardColors[i];
								}
							}
							
							ArrayList<Integer> colorPairCardsHouses = new ArrayList<Integer>();
							for (int i = 0; i < player2ColorPairCardsList.size(); i++) {
								if (player2CardColors.get(i).equals(cardColor) && i != j) {
									colorPairCardsHouses.add(player2ColorPairCardsHousesList.get(i));
								}
							}
							
							for (int i = 0; i < colorPairCardsHouses.size(); i++) {
								if (player2ColorPairCardsHousesList.get(j) > colorPairCardsHouses.get(i)) {
									canBuyHouse = false;
								}
								if (player2ColorPairCardsHousesList.get(j) >= colorPairCardsHouses.get(i)) {
									canSellHouse = true;
								}
							}
							
							if (cardColors[cardLocation].equals("purple") || cardColors[cardLocation].equals("lightblue")) {
								houseCost = 50;
							} else if (cardColors[cardLocation].equals("pink") || cardColors[cardLocation].equals("orange")) {
								houseCost = 100;
							} else if (cardColors[cardLocation].equals("red") || cardColors[cardLocation].equals("yellow")) {
								houseCost = 150;
							} else if (cardColors[cardLocation].equals("green") || cardColors[cardLocation].equals("darkblue")) {
								houseCost = 200;
							}
							
							if (player2Coins >= houseCost && player2ColorPairCardsHousesList.get(j) < 5 && canBuyHouse == true) {
								enableButton(buyHouse);
							} else {
								disableButton(buyHouse);
							}
							
							if (player2ColorPairCardsHousesList.get(j) > 0 && canSellHouse == true) {
								enableButton(sellHouse);
							} else {
								disableButton(sellHouse);
							}
							
							buyHouse.addMouseListener(new MouseAdapter() {
								public void mouseEntered(MouseEvent e) {
									buyHouse.setText("-$" + houseCost);
								}
								public void mouseExited(MouseEvent e) {
									buyHouse.setText("Buy House");
								}
							});
							
							sellHouse.addMouseListener(new MouseAdapter() {
								public void mouseEntered(MouseEvent e) {
									sellHouse.setText("+$" + houseCost);
								}
								public void mouseExited(MouseEvent e) {
									sellHouse.setText("Sell House");
								}
							});
							
							buyHouse.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									moneyChangingAnimation(houseCost, 0, 2);
									coinsLabel.setText("$" + (player2Coins - houseCost));
									int previousHouses = player2ColorPairCardsHousesList.get(j);
									player2ColorPairCardsHousesList.remove(j);
									player2ColorPairCardsHousesList.add(j, previousHouses + 1);
									houseCountLabel.setText("Houses: " + player2ColorPairCardsHousesList.get(j));
									
									switch (player2ColorPairCardsHousesList.get(j)) {
										case 1:
											places_PaymentPrices[cardLocation] = house1Payment[cardLocation];
											break;
										case 2:
											places_PaymentPrices[cardLocation] = house2Payment[cardLocation];
											break;
										case 3:
											places_PaymentPrices[cardLocation] = house3Payment[cardLocation];
											break;
										case 4:
											places_PaymentPrices[cardLocation] = house4Payment[cardLocation];
											break;
										case 5:
											places_PaymentPrices[cardLocation] = hotelPayment[cardLocation];
											break;
									}
									cardPaymentPriceLabel.setText("Payment Price: $" + places_PaymentPrices[cardLocation]);
									for (int i = 0; i < colorPairCardsHouses.size(); i++) {
										if (player2ColorPairCardsHousesList.get(j) > colorPairCardsHouses.get(i) || player2ColorPairCardsHousesList.get(j) == 5) {
											disableButton(buyHouse);
										} else if (player2Coins >= houseCost && player2ColorPairCardsHousesList.get(j) < 5 && player2ColorPairCardsHousesList.get(j) < colorPairCardsHouses.get(i)) {
											enableButton(buyHouse);
										}
										if (player2ColorPairCardsHousesList.get(j) < colorPairCardsHouses.get(i) || player2ColorPairCardsHousesList.get(j) == 0) {
											disableButton(sellHouse);
										} else if (player2ColorPairCardsHousesList.get(j) > 0 && player2ColorPairCardsHousesList.get(j) >= colorPairCardsHouses.get(i)) {
											enableButton(sellHouse);
										}
									}
								}
							});
							
							sellHouse.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									moneyChangingAnimation(houseCost, 2, 0);
									coinsLabel.setText("$" + (player2Coins + houseCost));
									int previousHouses = player2ColorPairCardsHousesList.get(j);
									player2ColorPairCardsHousesList.remove(j);
									player2ColorPairCardsHousesList.add(j, previousHouses - 1);
									houseCountLabel.setText("Houses: " + player2ColorPairCardsHousesList.get(j));
									
									switch (player2ColorPairCardsHousesList.get(j)) {
										case 0:
											places_PaymentPrices[cardLocation] = places_PaymentPrices2[cardLocation] * 2;
											break;
										case 1:
											places_PaymentPrices[cardLocation] = house1Payment[cardLocation];
											break;
										case 2:
											places_PaymentPrices[cardLocation] = house2Payment[cardLocation];
											break;
										case 3:
											places_PaymentPrices[cardLocation] = house3Payment[cardLocation];
											break;
										case 4:
											places_PaymentPrices[cardLocation] = house4Payment[cardLocation];
											break;
										case 5:
											places_PaymentPrices[cardLocation] = hotelPayment[cardLocation];
											break;
									}
									cardPaymentPriceLabel.setText("Payment Price: $" + places_PaymentPrices[cardLocation]);
									for (int i = 0; i < colorPairCardsHouses.size(); i++) {
										if (player2ColorPairCardsHousesList.get(j) < colorPairCardsHouses.get(i) || player2ColorPairCardsHousesList.get(j) == 0) {
											disableButton(sellHouse);
										} else if (player2ColorPairCardsHousesList.get(j) > 0 && player2ColorPairCardsHousesList.get(j) >= colorPairCardsHouses.get(i)) {
											enableButton(sellHouse);
										}
										if (player2ColorPairCardsHousesList.get(j) > colorPairCardsHouses.get(i) || player2ColorPairCardsHousesList.get(j) == 5) {
											disableButton(buyHouse);
										} else if (player2Coins >= houseCost && player2ColorPairCardsHousesList.get(j) <= colorPairCardsHouses.get(i)) {
											enableButton(buyHouse);
										}
									}
								}
							});
							
							back.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									housingPanel.remove(buyHouse);
									housingPanel.remove(sellHouse);
									housingPanel.remove(coinsLabel);
									housingPanel.remove(houseCountLabel);
									housingPanel.remove(cardPaymentPriceLabel);
									housingPanel.remove(back);
									buyHouse.hide();
									sellHouse.hide();
									coinsLabel.hide();
									houseCountLabel.hide();
									cardPaymentPriceLabel.hide();
									back.hide();
									
									housingFrame.setSize(165, 400);
									int y = 15;
									for (int i = 0; i < player2ColorPairCardsList.size(); i++) {
										housingPanel.add(colorPairCards[i]);
										colorPairCards[i].show();
										enableButton(colorPairCards[i]);
										colorPairCards[i].setForeground(Color.BLACK);
										coloredCardButtons(colorPairCards[i], player2CardColors.get(i));
										colorPairCards[i].setBounds(15, y, 120, 25);
										y += 30;
									}
								}
							});
						}
					});
					i++;
				}
			}
		});
		
		player2NotBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isPlayer1Pass = false;
				isPlayer3Pass = false;
				JFrame bidFrame = new JFrame("Bid Time");
				bidFrame.setSize(300, 200);
				bidFrame.setVisible(true);
				JPanel bidPanel = new JPanel();
				bidPanel.setLayout(null);
				bidFrame.add(bidPanel);
				JLabel player1Bidder = new JLabel("Player 1");
				bidPanel.add(player1Bidder);
				player1Bidder.setFont(new Font("Times New Roman", Font.PLAIN, 16));
				player1Bidder.setBounds(20, 10, 100, 30);
				JLabel player3Bidder = new JLabel("Player 3");
				bidPanel.add(player3Bidder);
				player3Bidder.setFont(new Font("Times New Roman", Font.PLAIN, 16));
				player3Bidder.setBounds(200, 10, 100, 30);
				
				bidPrice = prices_places[player2Location]/2;
				
				JButton player1Bid = new JButton("+10");
				bidPanel.add(player1Bid);
				disableButton(player1Bid);
				player1Bid.setBounds(20, 40, 50, 20);
				player1Bid.setFocusable(false);
				
				JButton player3Bid = new JButton("+10");
				bidPanel.add(player3Bid);
				player3Bid.setBounds(200, 40, 50, 20);
				player3Bid.setFocusable(false);
				
				JButton player1Pass = new JButton("Pass");
				bidPanel.add(player1Pass);
				player1Pass.setBounds(20, 90, 50, 20);
				disableButton(player1Pass);
				player1Pass.setFocusable(false);
				
				JButton player3Pass = new JButton("Pass");
				bidPanel.add(player3Pass);
				player3Pass.setBounds(200, 90, 50, 20);
				enableButton(player3Pass);
				player3Pass.setFocusable(false);
				
				JButton player1Ok = new JButton("Ok");
				bidPanel.add(player1Ok);
				player1Ok.setBounds(20, 65, 50, 20);
				disableButton(player1Ok);
				player1Ok.setFocusable(false);
				
				JButton player3Ok = new JButton("Ok");
				bidPanel.add(player3Ok);
				player3Ok.setBounds(200, 65, 50, 20);
				player3Ok.setFocusable(false);
				
				JButton allPass = new JButton("All Pass");
				bidPanel.add(allPass);
				enableButton(allPass);
				allPass.setBounds(105, 90, 60, 20);
				
				if(player3Coins >= bidPrice) {
					enableButton(player3Ok);
				}
				if (player3Coins >= bidPrice + 10) {
					if (player1Coins >= bidPrice || player1Coins >= bidPrice + 10) {
						enableButton(player3Bid);
					} else {
						disableButton(player3Bid);
					}
				} else {
					disableButton(player3Bid);
					disableButton(player3Ok);
				}
				
				JLabel bidPriceLabel = new JLabel("Bid Price: $" + bidPrice);
				bidPanel.add(bidPriceLabel);
				bidPriceLabel.setBounds(95, 50, 100, 30);
				bidPriceLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
				
				player1Bid.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						disableButton(player1Pass);
						bidPrice += 10;
						bidPriceLabel.setText("Bid Price: $" + bidPrice);
						enableButton(player1Ok);
						if (player1Coins >= bidPrice + 10) {
							enableButton(player1Bid);
						} else {
							disableButton(player1Bid);
						}
					}
				});
				
				player3Bid.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						disableButton(player3Pass);
						bidPrice += 10;
						bidPriceLabel.setText("Bid Price: $" + bidPrice);
						enableButton(player3Ok);
						if (player3Coins >= bidPrice + 10) {
							enableButton(player3Bid);
						} else {
							disableButton(player3Bid);
						}
					}
				});
				
				player1Pass.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						isPlayer1Pass = true;
						if (isPlayer1Pass == true && isPlayer3Pass == true) {
							for(int i = 0; i < propertiesNotBought.size(); i++) {
								if(propertiesNotBought.get(i).equals(arr_places[player2Location])) {
									propertiesNotBought.remove(i);
								}
							}
							bidFrame.dispose();
							isPlayer2Buy = false;
							disableButton(player2NotBuy);
							disableButton(player2Buy);
						} else if (isPlayer1Pass == true && isPlayer3Pass == false) {
							if (player3Coins < bidPrice || player3Coins < bidPrice + 10) {
								enableButton(player3Pass);
							} else {
								enableButton(player3Ok);
							}
						}
						disableButton(player1Bid);
						disableButton(player1Pass);
						disableButton(player1Ok);
					}
				});
				
				player3Pass.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						isPlayer3Pass = true;
						if (isPlayer1Pass == true && isPlayer3Pass == true) {
							for(int i = 0; i < propertiesNotBought.size(); i++) {
								if(propertiesNotBought.get(i).equals(arr_places[player2Location])) {
									propertiesNotBought.remove(i);
								}
							}
							bidFrame.dispose();
							isPlayer2Buy = false;
							disableButton(player2NotBuy);
							disableButton(player2Buy);
						} else if (isPlayer3Pass == true && isPlayer1Pass == false) {
							if (player1Coins < bidPrice || player1Coins < bidPrice + 10) {
								enableButton(player1Pass);
							} else {
								enableButton(player1Ok);
							}
						}
						disableButton(player3Bid);
						disableButton(player3Pass);
						disableButton(player3Ok);
					}
				});
				
				player1Ok.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (player3Coins < bidPrice || player3Coins < bidPrice + 10) {
							isPlayer3Pass = true;
						}
						if (isPlayer3Pass == true) {
							moneyChangingAnimation(bidPrice, 0, 1);
							player1CoinsLabel.setText("$" + player1Coins);
							player1Cards.add(arr_places[player2Location]);
							player1CardsLabel.add(new JLabel(arr_places[player2Location]));
							player1CardsLabel.get(player1Cards.size() - 1).setFont(new Font("Arial", Font.PLAIN, 12));
							monopolyDataPanel.add(player1CardsLabel.get(player1Cards.size() - 1));
							player1CardsLabel.get(player1Cards.size() - 1).setBounds(16, player1Cardsy + 15, 140, 15);
							player1Cardsy += 15;
							propertiesNotBought.remove(arr_places[player2Location]);
							disableButton(player2Buy);
							disableButton(player2NotBuy);
							if (arr_places[player2Location].indexOf("Railroad") > 0) {
								player1Railroads += 1;
							} else if (arr_places[player2Location].equals("Electric Company") || arr_places[player2Location].equals("Water Works")) {
								player1Utilities += 1;
							}
							switch(cardColors[player2Location]) {
								case "purple":
									player1ColorPairCards[0] += 1;
									break;
								case "lightblue":
									player1ColorPairCards[1] += 1;
									break;
								case "pink":
									player1ColorPairCards[2] += 1;
									break;
								case "orange":
									player1ColorPairCards[3] += 1;
									break;
								case "red":
									player1ColorPairCards[4] += 1;
									break;
								case "yellow":
									player1ColorPairCards[5] += 1;
									break;
								case "green":
									player1ColorPairCards[6] += 1;
									break;
								case "darkblue":
									player1ColorPairCards[7] += 1;
									break;
							}
							isPlayer2Buy = false;
							bidFrame.dispose();
						} else {
							disableButton(player1Bid);
							disableButton(player1Pass);
							disableButton(player1Ok);
							if (player3Coins >= bidPrice + 10) {
								enableButton(player3Bid);
							}
							enableButton(player3Pass);
						}
					}
				});
				
				player3Ok.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (player1Coins < bidPrice || player1Coins < bidPrice + 10) {
							isPlayer1Pass = true;
						}
						if (isPlayer1Pass == true) {
							moneyChangingAnimation(bidPrice, 0, 3);
							player3CoinsLabel.setText("$" + player3Coins);
							player3Cards.add(arr_places[player2Location]);
							player3CardsLabel.add(new JLabel(arr_places[player2Location]));
							player3CardsLabel.get(player3Cards.size() - 1).setFont(new Font("Arial", Font.PLAIN, 12));
							monopolyDataPanel.add(player3CardsLabel.get(player3Cards.size() - 1));
							player3CardsLabel.get(player3Cards.size() - 1).setBounds(16, player3Cardsy + 15, 140, 15);
							player3Cardsy += 15;
							propertiesNotBought.remove(arr_places[player2Location]);
							disableButton(player2Buy);
							disableButton(player2NotBuy);
							if (arr_places[player2Location].indexOf("Railroad") > 0) {
								player3Railroads += 1;
							} else if (arr_places[player2Location].equals("Electric Company") || arr_places[player2Location].equals("Water Works")) {
								player3Utilities += 1;
							}
							switch(cardColors[player2Location]) {
								case "purple":
									player3ColorPairCards[0] += 1;
									break;
								case "lightblue":
									player3ColorPairCards[1] += 1;
									break;
								case "pink":
									player3ColorPairCards[2] += 1;
									break;
								case "orange":
									player3ColorPairCards[3] += 1;
									break;
								case "red":
									player3ColorPairCards[4] += 1;
									break;
								case "yellow":
									player3ColorPairCards[5] += 1;
									break;
								case "green":
									player3ColorPairCards[6] += 1;
									break;
								case "darkblue":
									player3ColorPairCards[7] += 1;
									break;
							}
							isPlayer2Buy = false;
							bidFrame.dispose();
						} else {
							disableButton(player3Bid);
							disableButton(player3Pass);
							disableButton(player3Ok);
							if (player1Coins >= bidPrice + 10) {
								enableButton(player1Bid);
							}
							enableButton(player1Pass);
						}
					}
				});
				
				allPass.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						isPlayer1Pass = true;
						isPlayer3Pass = true;
						bidFrame.dispose();
						disableButton(player2Buy);
						disableButton(player2NotBuy);
						isPlayer2Buy = false;
					}
				});
			}
		});

		player2Pay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isChancePay == true) {
					if (isPlayer1Pay == true && (isPlayer3Pay == true || isPlayer3Pay == false) && player2Coins >= cardDrawingPay) {
						if (isPlayer3Pay == true) {
							moneyChangingAnimation(50, 3, 2);
							isPlayer3Pay = false;
						} else if (isPlayer1Pay == true) {
							moneyChangingAnimation(50, 1, 2);
							isPlayer2Pay = false;
							isPlayer1Pay = false;
							isChancePay = false;
							disableButton(player2Pay);
						}
					} else if (player2Coins >= cardDrawingPay) {
						moneyChangingAnimation(cardDrawingPay, 0, 2);
						isPlayer2Pay = false;
						isChancePay = false;
						disableButton(player2Pay);
					}
				} else if (isCommunityPay == true) {
					if (isPlayer1Pay == false && isPlayer3Pay == true && player2Coins >= 50) {
						moneyChangingAnimation(50, 1, 2);
						disableButton(player2Pay);
						enableButton(player3Pay);
					} else if (isPlayer1Pay == true && isPlayer3Pay == false && player2Coins >= 50) {
						moneyChangingAnimation(50, 3, 2);
						isPlayer1Pay = false;
						isPlayer2Pay = false;
						isCommunityPay = false;
						disableButton(player2Pay);
					} else if (player2Coins >= cardDrawingPay) {
						moneyChangingAnimation(cardDrawingPay, 0, 2);
						isPlayer2Pay = false;
						isCommunityPay = false;
						disableButton(player2Pay);
					}
				} else if (player2Location == 4) {
					if(player2Coins >= 200) {
						moneyChangingAnimation(200, 0, 2);
						isPlayer2Pay = false;
						disableButton(player2Pay);
					}
				} else if (player2Location == 38) {
					if(player2Coins >= 75) {
						moneyChangingAnimation(75, 0, 2);
						isPlayer2Pay = false;
						disableButton(player2Pay);
					}
				} else if (isJailPlayer2 == true) {
					if (player2Coins >= 50) {
						moneyChangingAnimation(50, 0, 2);
						isJailPlayer2 = false;
						player2JailCount = 3;
						isPlayer2Pay = false;
					}
				} else if (isPlayer1Pay == true) {
					if (isJailPlayer1 == false) {
						if (arr_places[player2Location].indexOf("Railroad") > 0) {
							int totalRailroadPayment = railroadPayment(1);
							if (isNearestToNonColors == true) {
								totalRailroadPayment *= 2;
							}
							if (player2Coins >= totalRailroadPayment) {
								moneyChangingAnimation(totalRailroadPayment, 1, 2);
								disableButton(player2Pay);
								isPlayer2Pay = false;
								isPlayer1Pay = false;
								if (isNearestToNonColors == true) {
									isNearestToNonColors = false;
								}
							}
						} else if (isPlayer2AtUtility == true) {
							if (player1Utilities == 1 && isNearestToNonColors == false) {
								if (player2Coins >= 4 * (currentRollDice1 + currentRollDice2)) {
									moneyChangingAnimation(4 * (currentRollDice1 + currentRollDice2), 1, 2);
									disableButton(player2Pay);
									isPlayer2Pay = false;
									isPlayer1Pay = false;
									isPlayer2AtUtility = false;
								}
							} else if (player1Utilities > 1 || isNearestToNonColors == true) {
								if (player2Coins >= 10 * (currentRollDice1 + currentRollDice2)) {
									moneyChangingAnimation(10 * (currentRollDice1 + currentRollDice2), 1, 2);
									disableButton(player2Pay);
									isPlayer2Pay = false;
									isPlayer1Pay = false;
									isPlayer2AtUtility = false;
									if (isNearestToNonColors == true) {
										isNearestToNonColors = false;
									}
								}
							}
						} else {
							if (player2Coins >= places_PaymentPrices[player2Location]) {
								moneyChangingAnimation(places_PaymentPrices[player2Location], 1, 2);
								disableButton(player2Pay);
								isPlayer2Pay = false;
								isPlayer1Pay = false;
							}
						}
					} else if (isJailPlayer1 == true) {
						if (arr_places[player2Location].indexOf("Railroad") > 0) {
							int totalRailroadPayment = railroadPayment(1)/2;
							if (isNearestToNonColors == true) {
								totalRailroadPayment *= 2;
							}
							if (player2Coins >= totalRailroadPayment) {
								moneyChangingAnimation(totalRailroadPayment, 1, 2);
								disableButton(player2Pay);
								isPlayer2Pay = false;
								isPlayer1Pay = false;
								if (isNearestToNonColors == true) {
									isNearestToNonColors = false;
								}
							}
						} else if (isPlayer2AtUtility == true) {
							if (player1Utilities == 1 && isNearestToNonColors == false) {
								if (player2Coins >= (4 * (currentRollDice1 + currentRollDice2)) / 2) {
									moneyChangingAnimation((4 * (currentRollDice1 + currentRollDice2)) / 2, 1, 2);
									disableButton(player2Pay);
									isPlayer2Pay = false;
									isPlayer1Pay = false;
									isPlayer2AtUtility = false;
								}
							} else if (player1Utilities > 1 || isNearestToNonColors == true) {
								if (player2Coins >= (10 * (currentRollDice1 + currentRollDice2)) / 2) {
									moneyChangingAnimation((10 * (currentRollDice1 + currentRollDice2)) / 2, 1, 2);
									disableButton(player2Pay);
									isPlayer2Pay = false;
									isPlayer1Pay = false;
									isPlayer2AtUtility = false;
									if (isNearestToNonColors == true) {
										isNearestToNonColors = false;
									}
								}
							}
						} else {
							if (player2Coins >= places_PaymentPrices[player2Location] / 2) {
								moneyChangingAnimation(places_PaymentPrices[player2Location] / 2, 1, 2);
								disableButton(player2Pay);
								isPlayer2Pay = false;
								isPlayer1Pay = false;
							}
						}
					}
				} else if (isPlayer3Pay == true) {
					if (isJailPlayer3 == false) {
						if (arr_places[player2Location].indexOf("Railroad") > 0) {
							int totalRailroadPayment = railroadPayment(3);
							if (isNearestToNonColors == true) {
								totalRailroadPayment *= 2;
							}
							if (player2Coins >= totalRailroadPayment) {
								moneyChangingAnimation(totalRailroadPayment, 3, 2);
								disableButton(player2Pay);
								isPlayer2Pay = false;
								isPlayer3Pay = false;
								if (isNearestToNonColors == true) {
									isNearestToNonColors = false;
								}
							}
						} else if (isPlayer2AtUtility == true) {
							if (player3Utilities == 1 && isNearestToNonColors == false) {
								if (player2Coins >= 4 * (currentRollDice1 + currentRollDice2)) {
									moneyChangingAnimation(4 * (currentRollDice1 + currentRollDice2), 3, 2);
									disableButton(player2Pay);
									isPlayer2Pay = false;
									isPlayer3Pay = false;
									isPlayer2AtUtility = false;
								}
							} else if (player3Utilities > 1 || isNearestToNonColors == true) {
								if (player2Coins >= 10 * (currentRollDice1 + currentRollDice2)) {
									moneyChangingAnimation(10 * (currentRollDice1 + currentRollDice2), 3, 2);
									disableButton(player2Pay);
									isPlayer2Pay = false;
									isPlayer3Pay = false;
									isPlayer2AtUtility = false;
									if (isNearestToNonColors == true) {
										isNearestToNonColors = false;
									}
								}
							}
						} else {
							if (player2Coins >= places_PaymentPrices[player2Location]) {
								moneyChangingAnimation(places_PaymentPrices[player2Location], 3, 2);
								disableButton(player2Pay);
								isPlayer2Pay = false;
								isPlayer3Pay = false;
							}
						}
					} else if (isJailPlayer3 == true) {
						if (arr_places[player2Location].indexOf("Railroad") > 0) {
							int totalRailroadPayment = railroadPayment(3)/2;
							if (isNearestToNonColors == true) {
								totalRailroadPayment *= 2;
							}
							if (player2Coins >= totalRailroadPayment) {
								moneyChangingAnimation(totalRailroadPayment, 3, 2);
								disableButton(player2Pay);
								isPlayer2Pay = false;
								isPlayer3Pay = false;
								if (isNearestToNonColors == true) {
									isNearestToNonColors = false;
								}
							}
						} else if (isPlayer2AtUtility == true) {
							if (player3Utilities == 1 && isNearestToNonColors == false) {
								if (player2Coins >= (4 * (currentRollDice1 + currentRollDice2)) / 2) {
									moneyChangingAnimation((4 * (currentRollDice1 + currentRollDice2)) / 2, 3, 2);
									disableButton(player2Pay);
									isPlayer2Pay = false;
									isPlayer3Pay = false;
									isPlayer2AtUtility = false;
								}
							} else if (player3Utilities > 1 || isNearestToNonColors == true) {
								if (player2Coins >= (10 * (currentRollDice1 + currentRollDice2)) / 2) {
									moneyChangingAnimation((10 * (currentRollDice1 + currentRollDice2)) / 2, 3, 2);
									disableButton(player2Pay);
									isPlayer2Pay = false;
									isPlayer3Pay = false;
									isPlayer2AtUtility = false;
									if (isNearestToNonColors == true) {
										isNearestToNonColors = false;
									}
								}
							}
						} else {
							if (player2Coins >= places_PaymentPrices[player2Location] / 2) {
								moneyChangingAnimation(places_PaymentPrices[player2Location] / 2, 3, 2);
								disableButton(player2Pay);
								isPlayer2Pay = false;
								isPlayer3Pay = false;
							}
						}
					}
				}
				
				player1CoinsLabel.setText("$" + player1Coins);
				player2CoinsLabel.setText("$" + player2Coins);
				player3CoinsLabel.setText("$" + player3Coins);
			}
		});

		player2Mortgage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame mortgageFrame = new JFrame("Mortgage Cards");
				JPanel mortgagePanel = new JPanel();
				mortgagePanel.setLayout(null);
				mortgageFrame.add(mortgagePanel);
				mortgageFrame.setSize(165, 400);
				mortgageFrame.setVisible(true);
				JScrollPane mortgageSp = new JScrollPane(mortgagePanel);
				mortgageFrame.add(mortgageSp);
				mortgageSp.setSize(165, 400);
				int y = 15;
				JButton[] mortgageCardsButtons = new JButton[player2Cards.size()];
				for (int i = 0; i < mortgageCardsButtons.length; i++) {
					mortgageCardsButtons[i] = new JButton(player2Cards.get(i));
					mortgageCardsButtons[i].setBounds(15, y, 120, 25);
					mortgageCardsButtons[i].setBorder(null);
					mortgageCardsButtons[i].setBackground(Color.BLACK);
					mortgageCardsButtons[i].setForeground(Color.WHITE);
					mortgageCardsButtons[i].setFont(new Font("Times New Roman", Font.PLAIN, 12));
					mortgagePanel.add(mortgageCardsButtons[i]);
					y += 30;
				}

				int i = 0;
				while (i < mortgageCardsButtons.length) {
					int j = i;
					mortgageCardsButtons[j].addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mortgageFrame.dispose();
							player2MortgageCards.add(player2Cards.get(j));
							int totalMoneyRecieved = 0;
							for (int i = 0; i < arr_places.length; i++) {
								if (player2Cards.get(j).equals(arr_places[i])) {
									totalMoneyRecieved += mortgagePricesPlaces[i];
								}
							}
							
							for (int i = 0; i < arr_places.length; i++) {
								if (arr_places[i].equals(player2Cards.get(j))) {
									cardLocation = i;
								}
							}
							
							if (cardColors[cardLocation].equals("purple") || cardColors[cardLocation].equals("lightblue")) {
								houseCost = 50;
							} else if (cardColors[cardLocation].equals("pink") || cardColors[cardLocation].equals("orange")) {
								houseCost = 100;
							} else if (cardColors[cardLocation].equals("red") || cardColors[cardLocation].equals("yellow")) {
								houseCost = 150;
							} else if (cardColors[cardLocation].equals("green") || cardColors[cardLocation].equals("darkblue")) {
								houseCost = 200;
							}
							
							String cardColor = cardColors[cardLocation];
							int k = 0;
							while (k < player2ColorPairCardsList.size()) {
								if (player2CardColors.get(k).equals(cardColor)) {
									totalMoneyRecieved += (player2ColorPairCardsHousesList.get(k) * houseCost);
									player2ColorPairCardsHousesList.remove(k);
									player2ColorPairCardsList.remove(k);
									player2CardColors.remove(k);
								} else {
									k++;
								}
							}
							
							places_PaymentPrices[cardLocation] = 0;
							
							if (cardColor.equals("") == false) {
								for (int i = 0; i < cardColors.length; i++) {
									if (player2Cards.get(j).equals(arr_places[i]) == false && cardColors[i].equals(cardColor)) {
										places_PaymentPrices[i] = places_PaymentPrices2[i];
									}
								}
							}
							
							if (player2Cards.get(j).indexOf("Railroad") >= 0) {
								player2Railroads--;
							} else if (player2Cards.get(j).equals("Water Works") || player2Cards.get(j).equals("Electric Company")) {
								player2Utilities--;
							}
							
							moneyChangingAnimation(totalMoneyRecieved, 2, 0);
							player2CoinsLabel.setText("$" + player2Coins);
							player2Cards.remove(j);
							player2CardsLabel.get(j).hide();
							monopolyDataPanel.remove(player2CardsLabel.get(j));
							player2CardsLabel.remove(j);
							player2Cardsy = 330;
							for (int i = 0; i < player2CardsLabel.size(); i++) {
								player2CardsLabel.get(i).setLocation(16, player2Cardsy + 15);
								player2Cardsy += 15;
							}
							if (player2Cards.size() == 0) {
								disableButton(player2Mortgage);
							}
						}
					});
					i++;
				}
			}
		});

		player3Buy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moneyChangingAnimation(prices_places[player3Location], 0, 3);
				player3CoinsLabel.setText("$" + player3Coins);
				player3Cards.add(arr_places[player3Location]);
				player3CardsLabel.add(new JLabel(arr_places[player3Location]));
				player3CardsLabel.get(player3Cards.size() - 1).setFont(new Font("Arial", Font.PLAIN, 12));
				monopolyDataPanel.add(player3CardsLabel.get(player3Cards.size() - 1));
				player3CardsLabel.get(player3Cards.size() - 1).setBounds(16, player3Cardsy + 15, 140, 15);
				player3Cardsy += 15;
				propertiesNotBought.remove(arr_places[player3Location]);
				disableButton(player3Buy);
				disableButton(player3NotBuy);
				if (arr_places[player3Location].indexOf("Railroad") > 0) {
					player3Railroads += 1;
				} else if (arr_places[player3Location].equals("Electric Company") || arr_places[player3Location].equals("Water Works")) {
					player3Utilities += 1;
				}
				switch(cardColors[player3Location]) {
					case "purple":
						player3ColorPairCards[0] += 1;
						if (player3ColorPairCards[0] == 2) {
							player3ColorPairCardsList.add("Baltic Ave.");
							player3ColorPairCardsList.add("Mediterranean Ave.");
							for (int i = 0; i < 2; i++) {
								player3ColorPairCardsHousesList.add(0);
								player3CardColors.add("purple");
							}
							doubleRentPayment("purple");
						}
						break;
					case "lightblue":
						player3ColorPairCards[1] += 1;
						if (player3ColorPairCards[1] == 3) {
							player3ColorPairCardsList.add("Oriental Ave.");
							player3ColorPairCardsList.add("Vermont Ave.");
							player3ColorPairCardsList.add("Connecticut Ave.");
							for (int i = 0; i < 3; i++) {
								player3ColorPairCardsHousesList.add(0);
								player3CardColors.add("lightblue");
							}
							doubleRentPayment("lightblue");
						}
						break;
					case "pink":
						player3ColorPairCards[2] += 1;
						if (player3ColorPairCards[2] == 3) {
							player3ColorPairCardsList.add("St. Charles Place");
							player3ColorPairCardsList.add("States Ave.");
							player3ColorPairCardsList.add("Virginia Ave.");
							for (int i = 0; i < 3; i++) {
								player3ColorPairCardsHousesList.add(0);
								player3CardColors.add("pink");
							}
							doubleRentPayment("pink");
						}
						break;
					case "orange":
						player3ColorPairCards[3] += 1;
						if (player3ColorPairCards[3] == 3) {
							player3ColorPairCardsList.add("St. James Place");
							player3ColorPairCardsList.add("Tennessee Ave.");
							player3ColorPairCardsList.add("New York Ave.");
							for (int i = 0; i < 3; i++) {
								player3ColorPairCardsHousesList.add(0);
								player3CardColors.add("orange");
							}
							doubleRentPayment("orange");
						}
						break;
					case "red":
						player3ColorPairCards[4] += 1;
						if (player3ColorPairCards[4] == 3) {
							player3ColorPairCardsList.add("Kentucky Ave.");
							player3ColorPairCardsList.add("Indiana Ave.");
							player3ColorPairCardsList.add("Illinois Ave.");
							for (int i = 0; i < 3; i++) {
								player3ColorPairCardsHousesList.add(0);
								player3CardColors.add("red");
							}
							doubleRentPayment("red");
						}
						break;
					case "yellow":
						player3ColorPairCards[5] += 1;
						if (player3ColorPairCards[5] == 3) {
							player3ColorPairCardsList.add("Atlantic Ave.");
							player3ColorPairCardsList.add("Ventnor Ave.");
							player3ColorPairCardsList.add("Marvin Gardens");
							for (int i = 0; i < 3; i++) {
								player3ColorPairCardsHousesList.add(0);
								player3CardColors.add("yellow");
							}
							doubleRentPayment("yellow");
						}
						break;
					case "green":
						player3ColorPairCards[6] += 1;
						if (player3ColorPairCards[6] == 3) {
							player3ColorPairCardsList.add("Pacific Ave.");
							player3ColorPairCardsList.add("North Carolina Ave.");
							player3ColorPairCardsList.add("Pennsylvania Ave.");
							for (int i = 0; i < 3; i++) {
								player3ColorPairCardsHousesList.add(0);
								player3CardColors.add("green");
							}
							doubleRentPayment("green");
						}
						break;
					case "darkblue":
						player3ColorPairCards[7] += 1;
						if (player3ColorPairCards[7] == 2) {
							player3ColorPairCardsList.add("Park Place");
							player3ColorPairCardsList.add("Boardwalk");
							for (int i = 0; i < 2; i++) {
								player3ColorPairCardsHousesList.add(0);
								player3CardColors.add("darkblue");
							}
							doubleRentPayment("darkblue");
						}
						break;
				}
				isPlayer3Buy = false;
			}
		});

		player3Housing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame housingFrame = new JFrame("Housing");
				JPanel housingPanel = new JPanel();
				housingPanel.setLayout(null);
				housingFrame.add(housingPanel);
				housingFrame.setSize(180, 400);
				housingFrame.setVisible(true);
				
				JButton[] colorPairCards = new JButton[player3ColorPairCardsList.size()];
				int y = 15;
				for (int i = 0; i < player3ColorPairCardsList.size(); i++) {
					colorPairCards[i] = new JButton(player3ColorPairCardsList.get(i));
					housingPanel.add(colorPairCards[i]);
					enableButton(colorPairCards[i]);
					colorPairCards[i].setForeground(Color.BLACK);
					coloredCardButtons(colorPairCards[i], player3CardColors.get(i));
					colorPairCards[i].setBounds(15, y, 120, 25);
					y += 30;
				}
				
				int i = 0;
				while (i < colorPairCards.length) {
					int j = i;
					colorPairCards[i].addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							for (int i = 0; i < colorPairCards.length; i++) {
								colorPairCards[i].hide();
								housingPanel.remove(colorPairCards[i]);
							}
							housingFrame.setSize(300, 170);
							
							JLabel coinsLabel = new JLabel("$" + player3Coins);
							housingPanel.add(coinsLabel);
							coinsLabel.show();
							coinsLabel.setBounds(125, 2, 100, 30);
							coinsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
							
							JLabel houseCountLabel = new JLabel("Houses: " + player3ColorPairCardsHousesList.get(j));
							housingPanel.add(houseCountLabel);
							houseCountLabel.show();
							houseCountLabel.setBounds(112, 15, 100, 30);
							houseCountLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
							
							JButton buyHouse = new JButton("Buy House");
							housingPanel.add(buyHouse);
							buyHouse.show();
							buyHouse.setBounds(60, 60, 80, 25);
							
							JButton sellHouse = new JButton("Sell House");
							housingPanel.add(sellHouse);
							sellHouse.show();
							sellHouse.setBounds(145, 60, 80, 25);
							
							JButton back = new JButton("Back");
							housingPanel.add(back);
							enableButton(back);
							back.show();
							back.setBounds(105, 90, 70, 25);
							
							for (int i = 0; i < arr_places.length; i++) {
								if (arr_places[i].equals(player3ColorPairCardsList.get(j))) {
									cardLocation = i;
								}
							}
							
							JLabel cardPaymentPriceLabel = new JLabel("Payment Price: $" + places_PaymentPrices[cardLocation]);
							housingPanel.add(cardPaymentPriceLabel);
							cardPaymentPriceLabel.show();
							cardPaymentPriceLabel.setBounds(90, 30, 150, 30);
							cardPaymentPriceLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
							
							String cardColor = "";
							boolean canBuyHouse = true;
							boolean canSellHouse = false;
							
							for (int i = 0; i < arr_places.length; i++) {
								if(arr_places[i].equals(player3ColorPairCardsList.get(j))) {
									cardColor = cardColors[i];
								}
							}
							
							ArrayList<Integer> colorPairCardsHouses = new ArrayList<Integer>();
							for (int i = 0; i < player3ColorPairCardsList.size(); i++) {
								if (player3CardColors.get(i).equals(cardColor) && i != j) {
									colorPairCardsHouses.add(player3ColorPairCardsHousesList.get(i));
								}
							}
							
							for (int i = 0; i < colorPairCardsHouses.size(); i++) {
								if (player3ColorPairCardsHousesList.get(j) > colorPairCardsHouses.get(i)) {
									canBuyHouse = false;
								}
								if (player3ColorPairCardsHousesList.get(j) >= colorPairCardsHouses.get(i)) {
									canSellHouse = true;
								}
							}
							
							if (cardColors[cardLocation].equals("purple") || cardColors[cardLocation].equals("lightblue")) {
								houseCost = 50;
							} else if (cardColors[cardLocation].equals("pink") || cardColors[cardLocation].equals("orange")) {
								houseCost = 100;
							} else if (cardColors[cardLocation].equals("red") || cardColors[cardLocation].equals("yellow")) {
								houseCost = 150;
							} else if (cardColors[cardLocation].equals("green") || cardColors[cardLocation].equals("darkblue")) {
								houseCost = 200;
							}
							
							if (player3Coins >= houseCost && player3ColorPairCardsHousesList.get(j) < 5 && canBuyHouse == true) {
								enableButton(buyHouse);
							} else {
								disableButton(buyHouse);
							}
							if (player3ColorPairCardsHousesList.get(j) > 0 && canSellHouse == true) {
								enableButton(sellHouse);
							} else {
								disableButton(sellHouse);
							}
							
							buyHouse.addMouseListener(new MouseAdapter() {
								public void mouseEntered(MouseEvent e) {
									buyHouse.setText("-$" + houseCost);
								}
								public void mouseExited(MouseEvent e) {
									buyHouse.setText("Buy House");
								}
							});
							
							sellHouse.addMouseListener(new MouseAdapter() {
								public void mouseEntered(MouseEvent e) {
									sellHouse.setText("+$" + houseCost);
								}
								public void mouseExited(MouseEvent e) {
									sellHouse.setText("Sell House");
								}
							});
							
							buyHouse.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									moneyChangingAnimation(houseCost, 0, 3);
									coinsLabel.setText("$" + (player3Coins - houseCost));
									int previousHouses = player3ColorPairCardsHousesList.get(j);
									player3ColorPairCardsHousesList.remove(j);
									player3ColorPairCardsHousesList.add(j, previousHouses + 1);
									houseCountLabel.setText("Houses: " + player3ColorPairCardsHousesList.get(j));
									
									switch (player3ColorPairCardsHousesList.get(j)) {
										case 1:
											places_PaymentPrices[cardLocation] = house1Payment[cardLocation];
											break;
										case 2:
											places_PaymentPrices[cardLocation] = house2Payment[cardLocation];
											break;
										case 3:
											places_PaymentPrices[cardLocation] = house3Payment[cardLocation];
											break;
										case 4:
											places_PaymentPrices[cardLocation] = house4Payment[cardLocation];
											break;
										case 5:
											places_PaymentPrices[cardLocation] = hotelPayment[cardLocation];
											break;
									}
									cardPaymentPriceLabel.setText("Payment Price: $" + places_PaymentPrices[cardLocation]);
									for (int i = 0; i < colorPairCardsHouses.size(); i++) {
										if (player3ColorPairCardsHousesList.get(j) > colorPairCardsHouses.get(i) || player3ColorPairCardsHousesList.get(j) == 5) {
											disableButton(buyHouse);
										} else if (player3Coins >= houseCost && player3ColorPairCardsHousesList.get(j) < 5 && player3ColorPairCardsHousesList.get(j) < colorPairCardsHouses.get(i)) {
											enableButton(buyHouse);
										}
										if (player3ColorPairCardsHousesList.get(j) < colorPairCardsHouses.get(i) || player3ColorPairCardsHousesList.get(j) == 0) {
											disableButton(sellHouse);
										} else if (player3ColorPairCardsHousesList.get(j) > 0 && player3ColorPairCardsHousesList.get(j) >= colorPairCardsHouses.get(i)) {
											enableButton(sellHouse);
										}
									}
								}
							});
							
							sellHouse.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									moneyChangingAnimation(houseCost, 3, 0);
									coinsLabel.setText("$" + (player3Coins + houseCost));
									int previousHouses = player3ColorPairCardsHousesList.get(j);
									player3ColorPairCardsHousesList.remove(j);
									player3ColorPairCardsHousesList.add(j, previousHouses - 1);
									houseCountLabel.setText("Houses: " + player3ColorPairCardsHousesList.get(j));
									
									switch (player3ColorPairCardsHousesList.get(j)) {
										case 0:
											places_PaymentPrices[cardLocation] = places_PaymentPrices2[cardLocation] * 2;
											break;
										case 1:
											places_PaymentPrices[cardLocation] = house1Payment[cardLocation];
											break;
										case 2:
											places_PaymentPrices[cardLocation] = house2Payment[cardLocation];
											break;
										case 3:
											places_PaymentPrices[cardLocation] = house3Payment[cardLocation];
											break;
										case 4:
											places_PaymentPrices[cardLocation] = house4Payment[cardLocation];
											break;
										case 5:
											places_PaymentPrices[cardLocation] = hotelPayment[cardLocation];
											break;
									}
									cardPaymentPriceLabel.setText("Payment Price: $" + places_PaymentPrices[cardLocation]);
									for (int i = 0; i < colorPairCardsHouses.size(); i++) {
										if (player3ColorPairCardsHousesList.get(j) < colorPairCardsHouses.get(i) || player3ColorPairCardsHousesList.get(j) == 0) {
											disableButton(sellHouse);
										} else if (player3ColorPairCardsHousesList.get(j) > 0 && player3ColorPairCardsHousesList.get(j) >= colorPairCardsHouses.get(i)) {
											enableButton(sellHouse);
										}
										if (player3ColorPairCardsHousesList.get(j) > colorPairCardsHouses.get(i) || player3ColorPairCardsHousesList.get(j) == 5) {
											disableButton(buyHouse);
										} else if (player3Coins >= houseCost && player3ColorPairCardsHousesList.get(j) <= colorPairCardsHouses.get(i)) {
											enableButton(buyHouse);
										}
									}
								}
							});
							
							back.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									housingPanel.remove(buyHouse);
									housingPanel.remove(sellHouse);
									housingPanel.remove(coinsLabel);
									housingPanel.remove(houseCountLabel);
									housingPanel.remove(cardPaymentPriceLabel);
									housingPanel.remove(back);
									buyHouse.hide();
									sellHouse.hide();
									coinsLabel.hide();
									houseCountLabel.hide();
									cardPaymentPriceLabel.hide();
									back.hide();
									
									housingFrame.setSize(165, 400);
									int y = 15;
									for (int i = 0; i < player3ColorPairCardsList.size(); i++) {
										housingPanel.add(colorPairCards[i]);
										colorPairCards[i].show();
										enableButton(colorPairCards[i]);
										colorPairCards[i].setForeground(Color.BLACK);
										coloredCardButtons(colorPairCards[i], player3CardColors.get(i));
										colorPairCards[i].setBounds(15, y, 120, 25);
										y += 30;
									}
								}
							});
						}
					});
					i++;
				}
			}
		});

		player3NotBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isPlayer1Pass = false;
				isPlayer2Pass = false;
				JFrame bidFrame = new JFrame("Bid Time");
				bidFrame.setSize(300, 200);
				bidFrame.setVisible(true);
				JPanel bidPanel = new JPanel();
				bidPanel.setLayout(null);
				bidFrame.add(bidPanel);
				JLabel player1Bidder = new JLabel("Player 1");
				bidPanel.add(player1Bidder);
				player1Bidder.setFont(new Font("Times New Roman", Font.PLAIN, 16));
				player1Bidder.setBounds(20, 10, 100, 30);
				JLabel player2Bidder = new JLabel("Player 2");
				bidPanel.add(player2Bidder);
				player2Bidder.setFont(new Font("Times New Roman", Font.PLAIN, 16));
				player2Bidder.setBounds(200, 10, 100, 30);
				
				bidPrice = prices_places[player3Location]/2;
				
				JButton player1Bid = new JButton("+10");
				bidPanel.add(player1Bid);
				player1Bid.setBounds(20, 40, 50, 20);
				player1Bid.setFocusable(false);
				
				JButton player2Bid = new JButton("+10");
				bidPanel.add(player2Bid);
				player2Bid.setBounds(200, 40, 50, 20);
				disableButton(player2Bid);
				player2Bid.setFocusable(false);
				
				JButton player1Pass = new JButton("Pass");
				bidPanel.add(player1Pass);
				player1Pass.setBounds(20, 90, 50, 20);
				enableButton(player1Pass);
				player1Pass.setFocusable(false);
				
				JButton player2Pass = new JButton("Pass");
				bidPanel.add(player2Pass);
				player2Pass.setBounds(200, 90, 50, 20);
				disableButton(player2Pass);
				player2Pass.setFocusable(false);
				
				JButton player1Ok = new JButton("Ok");
				bidPanel.add(player1Ok);
				player1Ok.setBounds(20, 65, 50, 20);
				player1Ok.setFocusable(false);
				
				JButton player2Ok = new JButton("Ok");
				bidPanel.add(player2Ok);
				disableButton(player2Ok);
				player2Ok.setBounds(200, 65, 50, 20);
				player2Ok.setFocusable(false);
				
				JButton allPass = new JButton("All Pass");
				bidPanel.add(allPass);
				enableButton(allPass);
				allPass.setBounds(105, 90, 60, 20);
				
				if(player1Coins >= bidPrice) {
					enableButton(player1Ok);
				}
				if (player1Coins >= bidPrice + 10) {
					if (player2Coins >= bidPrice || player2Coins >= bidPrice + 10) {
						enableButton(player1Bid);
					} else {
						disableButton(player1Bid);
					}
				} else {
					disableButton(player1Bid);
					disableButton(player1Ok);
				}
				
				JLabel bidPriceLabel = new JLabel("Bid Price: $" + bidPrice);
				bidPanel.add(bidPriceLabel);
				bidPriceLabel.setBounds(95, 50, 100, 30);
				bidPriceLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
				
				player1Bid.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						disableButton(player1Pass);
						bidPrice += 10;
						bidPriceLabel.setText("Bid Price: $" + bidPrice);
						enableButton(player1Ok);
						if (player1Coins >= bidPrice + 10) {
							enableButton(player1Bid);
						} else {
							disableButton(player1Bid);
						}
					}
				});
				
				player2Bid.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						disableButton(player2Pass);
						bidPrice += 10;
						bidPriceLabel.setText("Bid Price: $" + bidPrice);
						enableButton(player2Ok);
						if (player2Coins >= bidPrice + 10) {
							enableButton(player2Bid);
						} else {
							disableButton(player2Bid);
						}
					}
				});
				
				player1Pass.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						isPlayer1Pass = true;
						if (isPlayer1Pass == true && isPlayer2Pass == true) {
							for(int i = 0; i < propertiesNotBought.size(); i++) {
								if(propertiesNotBought.get(i).equals(arr_places[player3Location])) {
									propertiesNotBought.remove(i);
								}
							}
							bidFrame.dispose();
							isPlayer3Buy = false;
							disableButton(player3NotBuy);
							disableButton(player3Buy);
						} else if (isPlayer1Pass == true && isPlayer2Pass == false) {
							if (player2Coins < bidPrice || player2Coins < bidPrice + 10) {
								enableButton(player2Pass);
							} else {
								enableButton(player2Ok);
							}
						}
						disableButton(player1Bid);
						disableButton(player1Pass);
						disableButton(player1Ok);
					}
				});
				
				player2Pass.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						isPlayer2Pass = true;
						if (isPlayer1Pass == true && isPlayer2Pass == true) {
							for(int i = 0; i < propertiesNotBought.size(); i++) {
								if(propertiesNotBought.get(i).equals(arr_places[player3Location])) {
									propertiesNotBought.remove(i);
								}
							}
							bidFrame.dispose();
							isPlayer3Buy = false;
							disableButton(player3NotBuy);
							disableButton(player3Buy);
						} else if (isPlayer2Pass == true && isPlayer1Pass == false) {
							if (player1Coins < bidPrice || player1Coins < bidPrice + 10) {
								enableButton(player1Pass);
							} else {
								enableButton(player1Ok);
							}
						}
						disableButton(player2Bid);
						disableButton(player2Pass);
						disableButton(player2Ok);
					}
				});
				
				player1Ok.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (player2Coins < bidPrice || player2Coins < bidPrice + 10) {
							isPlayer2Pass = true;
						}
						if (isPlayer2Pass == true) {
							moneyChangingAnimation(bidPrice, 0, 1);
							player1CoinsLabel.setText("$" + player1Coins);
							player1Cards.add(arr_places[player3Location]);
							player1CardsLabel.add(new JLabel(arr_places[player3Location]));
							player1CardsLabel.get(player1Cards.size() - 1).setFont(new Font("Arial", Font.PLAIN, 12));
							monopolyDataPanel.add(player1CardsLabel.get(player1Cards.size() - 1));
							player1CardsLabel.get(player1Cards.size() - 1).setBounds(16, player1Cardsy + 15, 140, 15);
							player1Cardsy += 15;
							propertiesNotBought.remove(arr_places[player3Location]);
							disableButton(player3Buy);
							disableButton(player3NotBuy);
							if (arr_places[player3Location].indexOf("Railroad") > 0) {
								player1Railroads += 1;
							} else if (arr_places[player3Location].equals("Electric Company") || arr_places[player3Location].equals("Water Works")) {
								player1Utilities += 1;
							}
							switch(cardColors[player3Location]) {
								case "purple":
									player1ColorPairCards[0] += 1;
									break;
								case "lightblue":
									player1ColorPairCards[1] += 1;
									break;
								case "pink":
									player1ColorPairCards[2] += 1;
									break;
								case "orange":
									player1ColorPairCards[3] += 1;
									break;
								case "red":
									player1ColorPairCards[4] += 1;
									break;
								case "yellow":
									player1ColorPairCards[5] += 1;
									break;
								case "green":
									player1ColorPairCards[6] += 1;
									break;
								case "darkblue":
									player1ColorPairCards[7] += 1;
									break;
							}
							isPlayer3Buy = false;
							bidFrame.dispose();
						} else {
							disableButton(player1Bid);
							disableButton(player1Pass);
							disableButton(player1Ok);
							if (player2Coins >= bidPrice + 10) {
								enableButton(player2Bid);
							}
							enableButton(player2Pass);
						}
					}
				});
				
				player2Ok.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (player1Coins < bidPrice || player1Coins < bidPrice + 10) {
							isPlayer1Pass = true;
						}
						if (isPlayer1Pass == true) {
							moneyChangingAnimation(bidPrice, 0, 2);
							player2CoinsLabel.setText("$" + player2Coins);
							player2Cards.add(arr_places[player3Location]);
							player2CardsLabel.add(new JLabel(arr_places[player3Location]));
							player2CardsLabel.get(player2Cards.size() - 1).setFont(new Font("Arial", Font.PLAIN, 12));
							monopolyDataPanel.add(player2CardsLabel.get(player2Cards.size() - 1));
							player2CardsLabel.get(player2Cards.size() - 1).setBounds(16, player2Cardsy + 15, 140, 15);
							player2Cardsy += 15;
							propertiesNotBought.remove(arr_places[player3Location]);
							disableButton(player3Buy);
							disableButton(player3NotBuy);
							if (arr_places[player3Location].indexOf("Railroad") > 0) {
								player2Railroads += 1;
							} else if (arr_places[player3Location].equals("Electric Company") || arr_places[player3Location].equals("Water Works")) {
								player2Utilities += 1;
							}
							switch(cardColors[player3Location]) {
								case "purple":
									player2ColorPairCards[0] += 1;
									break;
								case "lightblue":
									player2ColorPairCards[1] += 1;
									break;
								case "pink":
									player2ColorPairCards[2] += 1;
									break;
								case "orange":
									player2ColorPairCards[3] += 1;
									break;
								case "red":
									player2ColorPairCards[4] += 1;
									break;
								case "yellow":
									player2ColorPairCards[5] += 1;
									break;
								case "green":
									player2ColorPairCards[6] += 1;
									break;
								case "darkblue":
									player2ColorPairCards[7] += 1;
									break;
							}
							isPlayer3Buy = false;
							bidFrame.dispose();
						} else {
							disableButton(player2Bid);
							disableButton(player2Pass);
							disableButton(player2Ok);
							if (player1Coins >= bidPrice + 10) {
								enableButton(player1Bid);
							}
							enableButton(player1Pass);
						}
					}
				});
				
				allPass.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						isPlayer1Pass = true;
						isPlayer2Pass = true;
						bidFrame.dispose();
						disableButton(player3Buy);
						disableButton(player3NotBuy);
						isPlayer3Buy = false;
					}
				});
			}
		});

		player3Pay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isChancePay == true) {
					if ((isPlayer1Pay == true || isPlayer1Pay == false) && isPlayer2Pay == true && player3Coins >= cardDrawingPay) {
						if (isPlayer1Pay == true) {
							moneyChangingAnimation(50, 1, 3);
							isPlayer1Pay = false;
						} else if (isPlayer2Pay == true) {
							moneyChangingAnimation(50, 2, 3);
							isPlayer2Pay = false;
							isPlayer3Pay = false;
							isChancePay = false;
							disableButton(player3Pay);
						}
					} else if (player3Coins >= cardDrawingPay) {
						moneyChangingAnimation(cardDrawingPay, 0, 3);
						isPlayer3Pay = false;
						isChancePay = false;
						disableButton(player3Pay);
					}
				} else if (isCommunityPay == true) {
					if (isPlayer1Pay == false && isPlayer2Pay == true && player3Coins >= 50) {
						moneyChangingAnimation(50, 1, 3);
						isPlayer2Pay = false;
						isPlayer3Pay = false;
						isCommunityPay = false;
						disableButton(player3Pay);
					} else if (isPlayer1Pay == true && isPlayer2Pay == false && player3Coins >= 50) {
						moneyChangingAnimation(50, 2, 3);
						disableButton(player3Pay);
						enableButton(player1Pay);
					} else if (player3Coins >= cardDrawingPay) {
						moneyChangingAnimation(cardDrawingPay, 0, 3);
						isPlayer3Pay = false;
						isCommunityPay = false;
						disableButton(player3Pay);
					}
				} else if (player3Location == 4) {
					if(player3Coins >= 200) {
						moneyChangingAnimation(200, 0, 3);
						isPlayer3Pay = false;
						disableButton(player3Pay);
					}
				} else if (player3Location == 38) {
					if(player3Coins >= 75) {
						moneyChangingAnimation(75, 0, 3);
						isPlayer3Pay = false;
						disableButton(player3Pay);
					}
				} else if (isJailPlayer3 == true) {
					if (player3Coins >= 50) {
						moneyChangingAnimation(50, 0, 3);
						isJailPlayer3 = false;
						player3JailCount = 3;
						disableButton(player3Pay);
						isPlayer3Pay = false;
					}
				} else if (isPlayer1Pay == true) {
					if (isJailPlayer1 == false) {
						if (arr_places[player3Location].indexOf("Railroad") > 0) {
							int totalRailroadPayment = railroadPayment(1);
							if (isNearestToNonColors == true) {
								totalRailroadPayment *= 2;
							}
							if (player3Coins >= totalRailroadPayment) {
								moneyChangingAnimation(totalRailroadPayment, 1, 3);
								disableButton(player3Pay);
								isPlayer3Pay = false;
								isPlayer1Pay = false;
								if (isNearestToNonColors == true) {
									isNearestToNonColors = false;
								}
							}
						} else if (isPlayer3AtUtility == true) {
							if (player1Utilities == 1 && isNearestToNonColors == false) {
								if (player3Coins >= 4 * (currentRollDice1 + currentRollDice2)) {
									moneyChangingAnimation(4 * (currentRollDice1 + currentRollDice2), 1, 3);
									disableButton(player3Pay);
									isPlayer3Pay = false;
									isPlayer1Pay = false;
									isPlayer3AtUtility = false;
								}
							} else if (player1Utilities > 1 || isNearestToNonColors == true) {
								if (player3Coins >= 10 * (currentRollDice1 + currentRollDice2)) {
									moneyChangingAnimation(10 * (currentRollDice1 + currentRollDice2), 1, 3);
									disableButton(player3Pay);
									isPlayer3Pay = false;
									isPlayer1Pay = false;
									isPlayer3AtUtility = false;
									if (isNearestToNonColors == true) {
										isNearestToNonColors = false;
									}
								}
							}
						} else {
							if (player3Coins >= places_PaymentPrices[player3Location]) {
								moneyChangingAnimation(places_PaymentPrices[player3Location], 1, 3);
								disableButton(player3Pay);
								isPlayer3Pay = false;
								isPlayer1Pay = false;
							}
						}
					} else if (isJailPlayer1 == true) {
						if (arr_places[player3Location].indexOf("Railroad") > 0) {
							int totalRailroadPayment = railroadPayment(1)/2;
							if (isNearestToNonColors == true) {
								totalRailroadPayment *= 2;
							}
							if (player3Coins >= totalRailroadPayment) {
								moneyChangingAnimation(totalRailroadPayment, 1, 3);
								disableButton(player3Pay);
								isPlayer3Pay = false;
								isPlayer1Pay = false;
								if (isNearestToNonColors == true) {
									isNearestToNonColors = false;
								}
							}
						} else if (isPlayer3AtUtility == true) {
							if (player1Utilities == 1 && isNearestToNonColors == false) {
								if (player3Coins >= (4 * (currentRollDice1 + currentRollDice2)) / 2) {
									moneyChangingAnimation((4 * (currentRollDice1 + currentRollDice2)) / 2, 1, 3);
									disableButton(player3Pay);
									isPlayer3Pay = false;
									isPlayer1Pay = false;
									isPlayer3AtUtility = false;
								}
							} else if (player1Utilities > 1 || isNearestToNonColors == true) {
								if (player3Coins >= (10 * (currentRollDice1 + currentRollDice2)) / 2) {
									moneyChangingAnimation((10 * (currentRollDice1 + currentRollDice2)) / 2, 1, 3);
									disableButton(player3Pay);
									isPlayer3Pay = false;
									isPlayer1Pay = false;
									isPlayer3AtUtility = false;
									if (isNearestToNonColors == true) {
										isNearestToNonColors = false;
									}
								}
							}
						} else {
							if (player3Coins >= places_PaymentPrices[player3Location] / 2) {
								moneyChangingAnimation(places_PaymentPrices[player3Location] / 2, 1, 3);
								disableButton(player3Pay);
								isPlayer3Pay = false;
								isPlayer1Pay = false;
							}
						}
					}
				} else if (isPlayer2Pay == true) {
					if (isJailPlayer2 == false) {
						if (arr_places[player3Location].indexOf("Railroad") > 0) {
							int totalRailroadPayment = railroadPayment(2);
							if (isNearestToNonColors == true) {
								totalRailroadPayment *= 2;
							}
							if (player3Coins >= totalRailroadPayment) {
								moneyChangingAnimation(totalRailroadPayment, 2, 3);
								disableButton(player3Pay);
								isPlayer3Pay = false;
								isPlayer2Pay = false;
								if (isNearestToNonColors == true) {
									isNearestToNonColors = false;
								}
							}
						} else if (isPlayer3AtUtility == true) {
							if (player2Utilities == 1 && isNearestToNonColors == false) {
								if (player3Coins >= 4 * (currentRollDice1 + currentRollDice2)) {
									moneyChangingAnimation(4 * (currentRollDice1 + currentRollDice2), 2, 3);
									disableButton(player3Pay);
									isPlayer3Pay = false;
									isPlayer2Pay = false;
									isPlayer3AtUtility = false;
								}
							} else if (player2Utilities > 1 || isNearestToNonColors == true) {
								if (player3Coins >= 10 * (currentRollDice1 + currentRollDice2)) {
									moneyChangingAnimation(10 * (currentRollDice1 + currentRollDice2), 2, 3);
									disableButton(player3Pay);
									isPlayer3Pay = false;
									isPlayer2Pay = false;
									isPlayer3AtUtility = false;
									if (isNearestToNonColors == true) {
										isNearestToNonColors = false;
									}
								}
							}
						} else {
							if (player3Coins >= places_PaymentPrices[player3Location]) {
								moneyChangingAnimation(places_PaymentPrices[player3Location], 2, 3);
								disableButton(player3Pay);
								isPlayer3Pay = false;
								isPlayer2Pay = false;
							}
						}
					} else if (isJailPlayer2 == true) {
						if (arr_places[player3Location].indexOf("Railroad") > 0) {
							int totalRailroadPayment = railroadPayment(2)/2;
							if (isNearestToNonColors == true) {
								totalRailroadPayment *= 2;
							}
							if (player3Coins >= totalRailroadPayment) {
								moneyChangingAnimation(totalRailroadPayment, 2, 3);
								disableButton(player3Pay);
								isPlayer3Pay = false;
								isPlayer2Pay = false;
								if (isNearestToNonColors == true) {
									isNearestToNonColors = false;
								}
							}
						} else if (isPlayer3AtUtility == true) {
							if (player2Utilities == 1 && isNearestToNonColors == false) {
								if (player3Coins >= (4 * (currentRollDice1 + currentRollDice2)) / 2) {
									moneyChangingAnimation((4 * (currentRollDice1 + currentRollDice2)) / 2, 2, 3);
									disableButton(player3Pay);
									isPlayer3Pay = false;
									isPlayer2Pay = false;
									isPlayer3AtUtility = false;
								}
							} else if (player2Utilities > 1 || isNearestToNonColors == true) {
								if (player3Coins >= (10 * (currentRollDice1 + currentRollDice2)) / 2) {
									moneyChangingAnimation((10 * (currentRollDice1 + currentRollDice2)) / 2, 2, 3);
									disableButton(player3Pay);
									isPlayer3Pay = false;
									isPlayer2Pay = false;
									isPlayer3AtUtility = false;
									if (isNearestToNonColors == true) {
										isNearestToNonColors = false;
									}
								}
							}
						} else {
							if (player3Coins >= places_PaymentPrices[player3Location] / 2) {
								moneyChangingAnimation(places_PaymentPrices[player3Location] / 2, 2, 3);
								disableButton(player3Pay);
								isPlayer3Pay = false;
								isPlayer2Pay = false;
							}
						}
					}
				}
				player1CoinsLabel.setText("$" + player1Coins);
				player2CoinsLabel.setText("$" + player2Coins);
				player3CoinsLabel.setText("$" + player3Coins);
			}
		});

		player3Mortgage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame mortgageFrame = new JFrame("Mortgage Cards");
				JPanel mortgagePanel = new JPanel();
				mortgagePanel.setLayout(null);
				mortgageFrame.add(mortgagePanel);
				mortgageFrame.setSize(165, 400);
				mortgageFrame.setVisible(true);
				JScrollPane mortgageSp = new JScrollPane(mortgagePanel);
				mortgageFrame.add(mortgageSp);
				mortgageSp.setSize(165, 400);
				int y = 15;
				JButton[] mortgageCardsButtons = new JButton[player3Cards.size()];
				for (int i = 0; i < mortgageCardsButtons.length; i++) {
					mortgageCardsButtons[i] = new JButton(player3Cards.get(i));
					mortgageCardsButtons[i].setBounds(15, y, 120, 25);
					mortgageCardsButtons[i].setBorder(null);
					mortgageCardsButtons[i].setBackground(Color.BLACK);
					mortgageCardsButtons[i].setForeground(Color.WHITE);
					mortgageCardsButtons[i].setFont(new Font("Times New Roman", Font.PLAIN, 12));
					mortgagePanel.add(mortgageCardsButtons[i]);
					y += 30;
				}

				int i = 0;
				while (i < mortgageCardsButtons.length) {
					int j = i;
					mortgageCardsButtons[j].addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mortgageFrame.dispose();
							player3MortgageCards.add(player3Cards.get(j));
							int totalMoneyRecieved = 0;
							for (int i = 0; i < arr_places.length; i++) {
								if (player3Cards.get(j).equals(arr_places[i])) {
									totalMoneyRecieved += mortgagePricesPlaces[i];
								}
							}
							
							for (int i = 0; i < arr_places.length; i++) {
								if (arr_places[i].equals(player3Cards.get(j))) {
									cardLocation = i;
								}
							}
							
							if (cardColors[cardLocation].equals("purple") || cardColors[cardLocation].equals("lightblue")) {
								houseCost = 50;
							} else if (cardColors[cardLocation].equals("pink") || cardColors[cardLocation].equals("orange")) {
								houseCost = 100;
							} else if (cardColors[cardLocation].equals("red") || cardColors[cardLocation].equals("yellow")) {
								houseCost = 150;
							} else if (cardColors[cardLocation].equals("green") || cardColors[cardLocation].equals("darkblue")) {
								houseCost = 200;
							}
							
							String cardColor = cardColors[cardLocation];
							int k = 0;
							while (k < player3ColorPairCardsList.size()) {
								if (player3CardColors.get(k).equals(cardColor)) {
									totalMoneyRecieved += (player3ColorPairCardsHousesList.get(k) * houseCost);
									player3ColorPairCardsHousesList.remove(k);
									player3ColorPairCardsList.remove(k);
									player3CardColors.remove(k);
								} else {
									k++;
								}
							}
							
							places_PaymentPrices[cardLocation] = 0;
							
							if (cardColor.equals("") == false) {
								for (int i = 0; i < cardColors.length; i++) {
									if (player3Cards.get(j).equals(arr_places[i]) == false && cardColors[i].equals(cardColor)) {
										places_PaymentPrices[i] = places_PaymentPrices2[i];
									}
								}
							}
							
							if (player3Cards.get(j).indexOf("Railroad") >= 0) {
								player3Railroads--;
							} else if (player3Cards.get(j).equals("Water Works") || player3Cards.get(j).equals("Electric Company")) {
								player3Utilities--;
							}
							
							moneyChangingAnimation(totalMoneyRecieved, 3, 0);
							player3CoinsLabel.setText("$" + player3Coins);
							player3Cards.remove(j);
							player3CardsLabel.get(j).hide();
							monopolyDataPanel.remove(player3CardsLabel.get(j));
							player3CardsLabel.remove(j);
							player3Cardsy = 530;
							for (int i = 0; i < player3CardsLabel.size(); i++) {
								player3CardsLabel.get(i).setLocation(16, player3Cardsy + 15);
								player3Cardsy += 15;
							}
							if (player3Cards.size() == 0) {
								disableButton(player3Mortgage);
							}
						}
					});
					i++;
				}
			}
		});
	}
	
	public void startGame() {

	}
	
	public void enableButton(JButton enableThis) {
		enableThis.setEnabled(true);
		enableThis.setBackground(Color.DARK_GRAY);
		enableThis.setBorder(null);
		enableThis.setForeground(Color.WHITE);
	}

	public void disableButton(JButton disableThis) {
		disableThis.setEnabled(false);
		disableThis.setBackground(new Color(217, 217, 217));
		disableThis.setForeground(new Color(26, 26, 26));
		disableThis.setBorder(null);
	}

	public void moneyChangingAnimation(int nextPlayerCoins, int whichPlayerEarned, int whichPlayerPaid) {
		int player1CoinsEarned = player1Coins + nextPlayerCoins;
		int player2CoinsEarned = player2Coins + nextPlayerCoins;
		int player3CoinsEarned = player3Coins + nextPlayerCoins;
		
		int player1CoinsPaid = player1Coins - nextPlayerCoins;
		int player2CoinsPaid = player2Coins - nextPlayerCoins;
		int player3CoinsPaid = player3Coins - nextPlayerCoins;
		
		Timer coinTimer = new Timer();
		TimerTask coinTimerTask = new TimerTask() {

			@Override
			public void run() {
				switch (whichPlayerEarned) {
					case 1:
						if(player1Coins + 1 <= player1CoinsEarned) {
							player1Coins++;
							player1CoinsLabel.setText("+$" + player1Coins);
							player1CoinsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 19));
							player1CoinsLabel.setForeground(new Color(0, 128, 0));
							player1CoinsLabel.setBounds(183, 127, 100, 30);
						} else {
							coinTimer.cancel();
							player1CoinsLabel.setText("$" + player1Coins);
							player1CoinsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
							player1CoinsLabel.setForeground(Color.BLACK);
							player1CoinsLabel.setBounds(188, 130, 100, 30);
						}
						break;
					case 2:
						if(player2Coins + 1 <= player2CoinsEarned) {
							player2Coins++;
							player2CoinsLabel.setText("+$" + player2Coins);
							player2CoinsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 19));
							player2CoinsLabel.setForeground(new Color(0, 128, 0));
							player2CoinsLabel.setBounds(183, 327, 100, 30);
						} else {
							coinTimer.cancel();
							player2CoinsLabel.setText("$" + player2Coins);
							player2CoinsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
							player2CoinsLabel.setForeground(Color.BLACK);
							player2CoinsLabel.setBounds(188, 330, 100, 30);
						}
						break;
					case 3:
						if(player3Coins + 1 <= player3CoinsEarned) {
							player3Coins++;
							player3CoinsLabel.setText("+$" + player3Coins);
							player3CoinsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 19));
							player3CoinsLabel.setForeground(new Color(0, 128, 0));
							player3CoinsLabel.setBounds(183, 527, 100, 30);
						} else {
							coinTimer.cancel();
							player3CoinsLabel.setText("$" + player3Coins);
							player3CoinsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
							player3CoinsLabel.setForeground(Color.BLACK);
							player3CoinsLabel.setBounds(188, 530, 100, 30);
						}
						break;
				}
				
				switch (whichPlayerPaid) {
					case 1:
						if(player1Coins - 1 >= player1CoinsPaid) {
							player1Coins--;
							player1CoinsLabel.setText("-$" + player1Coins);
							player1CoinsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 19));
							player1CoinsLabel.setForeground(new Color(179, 0, 0));
							player1CoinsLabel.setBounds(183, 127, 100, 30);
						} else {
							coinTimer.cancel();
							player1CoinsLabel.setText("$" + player1Coins);
							player1CoinsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
							player1CoinsLabel.setForeground(Color.BLACK);
							player1CoinsLabel.setBounds(188, 130, 100, 30);
						}
						break;
					case 2:
						if(player2Coins - 1 >= player2CoinsPaid) {
							player2Coins--;
							player2CoinsLabel.setText("-$" + player2Coins);
							player2CoinsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 19));
							player2CoinsLabel.setForeground(new Color(179, 0, 0));
							player2CoinsLabel.setBounds(183, 327, 100, 30);
						} else {
							coinTimer.cancel();
							player2CoinsLabel.setText("$" + player2Coins);
							player2CoinsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
							player2CoinsLabel.setForeground(Color.BLACK);
							player2CoinsLabel.setBounds(188, 330, 100, 30);
						}
						break;
					case 3:
						if(player3Coins - 1 >= player3CoinsPaid) {
							player3Coins--;
							player3CoinsLabel.setText("-$" + player3Coins);
							player3CoinsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 19));
							player3CoinsLabel.setForeground(new Color(179, 0, 0));
							player3CoinsLabel.setBounds(183, 527, 100, 30);
						} else {
							coinTimer.cancel();
							player3CoinsLabel.setText("$" + player3Coins);
							player3CoinsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
							player3CoinsLabel.setForeground(Color.BLACK);
							player3CoinsLabel.setBounds(188, 530, 100, 30);
						}
						break;
				}
			}
			
		};
		
		if (nextPlayerCoins >= 500) {
			coinTimer.schedule(coinTimerTask, 0, 1);
		} else if (nextPlayerCoins <= 30) {
			coinTimer.schedule(coinTimerTask, 0, 50);
		} else if (nextPlayerCoins >= 50 && nextPlayerCoins < 500) {
			coinTimer.schedule(coinTimerTask, 0, 7);
		}
	}

	public int railroadPayment(int whoEarned) {
		int totalPayment = 0;
		switch(whoEarned) {
			case 1:
				switch(player1Railroads) {
					case 1:
						totalPayment = 25;
						break;
					case 2:
						totalPayment = 50;
						break;
					case 3:
						totalPayment = 100;
						break;
					case 4:
						totalPayment = 200;
						break;
				}
				break;
			case 2:
				switch(player2Railroads) {
					case 1:
						totalPayment = 25;
						break;
					case 2:
						totalPayment = 50;
						break;
					case 3:
						totalPayment = 100;
						break;
					case 4:
						totalPayment = 200;
						break;
				}
				break;
			case 3:
				switch(player3Railroads) {
					case 1:
						totalPayment = 25;
						break;
					case 2:
						totalPayment = 50;
						break;
					case 3:
						totalPayment = 100;
						break;
					case 4:
						totalPayment = 200;
						break;
				}
				break;
		}
		return totalPayment;
	}

	public void doubleRentPayment(String cardColor) {
		for (int i = 0; i < cardColors.length; i++) {
			if (cardColors[i].equals(cardColor)) {
				places_PaymentPrices[i] *= 2;
			}
		}
	}
	
	public void coloredCardButtons(JButton colorCardButton, String cardColor) {
		switch (cardColor) {
			case "purple":
				colorCardButton.setBackground(new Color(77, 0, 153));
				break;
			case "lightblue":
				colorCardButton.setBackground(new Color(128, 212, 255));
				break;
			case "pink":
				colorCardButton.setBackground(new Color(204, 0, 153));
				break;
			case "orange":
				colorCardButton.setBackground(new Color(255, 51, 0));
				break;
			case "red":
				colorCardButton.setBackground(new Color(255, 0, 0));
				break;
			case "yellow":
				colorCardButton.setBackground(new Color(255, 255, 0));
				break;
			case "green":
				colorCardButton.setBackground(new Color(0, 153, 0));
				break;
			case "darkblue":
				colorCardButton.setBackground(new Color(0, 51, 204));
				break;
		}
	}
	
	public void housePositioning(String cardName, int index) {
		
		player1HousesLabel.get(index).setText("Houses: " + player1ColorPairCardsHousesList.get(index));
		
		if (player1ColorPairCardsHousesList.get(index) == 1) {
			player1HousesLabel.get(index).setForeground(new Color(0, 128, 0));
			monopolyBoardPanel.add(player1HousesLabel.get(index));
		}
		
		int x = 1122;
		int y = 0;
		int j = 0;
		
		if (cardLocation < 10) {
			j = 0;
			y = 1107;
		} else if (cardLocation > 10 && cardLocation < 20) {
			j = 10;
			x = 50;
			y = 1150;
		} else if (cardLocation > 20 && cardLocation < 30) {
			j = 20;
		} else {
			j = 30;
		}
		
		for (int i = j; i < cardLocation; i++) {
			if (cardLocation < 10) {
				if (i == 4) {
					x -=  112;
				} else if (i == 5) {
					x -= 109;
				} else {
					x -= 102;
				}
			} else if (cardLocation >= 10 && cardLocation < 20) {
				if (i == 10) {
					y = 1055;
				} else if (i == 14 || i == 15) {
					y -= 110;
				} else {
					y -= 102;
				}
			} else if (cardLocation >= 20 && cardLocation < 30) {
				
			} else {}
		}
		if (cardLocation < 10) {
			x -= 16;
		}
		
		player1HousesLabel.get(index).setBounds(x, y, 100, 30);
	}
}
