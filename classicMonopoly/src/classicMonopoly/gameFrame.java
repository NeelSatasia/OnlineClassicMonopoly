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

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	private JLabel player1PropertiesLabel;
	private JLabel player2PropertiesLabel;
	private JLabel player3PropertiesLabel;
	private JLabel glassLabel;
	private JLabel hexagonLabel;
	private JLabel starLabel;
	private JLabel playerTurnArrow;
	private JLabel xLabel;
	private JLabel yLabel;
	private ArrayList<JLabel> player1CardsLabel;
	private ArrayList<JLabel> player2CardsLabel;
	private ArrayList<JLabel> player3CardsLabel;
	private ArrayList<JLabel> player1HousesLabel;
	private ArrayList<JLabel> player2HousesLabel;
	private ArrayList<JLabel> player3HousesLabel;
	private JScrollPane player1ButtonsSp;
	private JScrollPane player2ButtonsSp;
	private JScrollPane player3ButtonsSp;
	private JScrollPane player1PropertiesSp;
	private JScrollPane player2PropertiesSp;
	private JScrollPane player3PropertiesSp;
	private JPanel player1ButtonsPanel;
	private JPanel player2ButtonsPanel;
	private JPanel player3ButtonsPanel;
	private JPanel player1PropertiesPanel;
	private JPanel player2PropertiesPanel;
	private JPanel player3PropertiesPanel;
	private JButton player1Buy;
	private JButton player1Housing;
	private JButton player1NotBuy;
	private JButton player1Pay;
	private JButton player1Mortgaging;
	private JButton player1Deal;
	private JButton player1JailFreeCard;
	private JButton player1GiveUp;
	private JButton player2Buy;
	private JButton player2Housing;
	private JButton player2NotBuy;
	private JButton player2Pay;
	private JButton player2Mortgaging;
	private JButton player2Deal;
	private JButton player2JailFreeCard;
	private JButton player2GiveUp;
	private JButton player3Buy;
	private JButton player3Housing;
	private JButton player3NotBuy;
	private JButton player3Pay;
	private JButton player3Mortgaging;
	private JButton player3Deal;
	private JButton player3JailFreeCard;
	private JButton player3GiveUp;
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
	private String[] coloredCardsName;

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
	private ArrayList<String> player1DealList;
	private ArrayList<Integer> player1ColorPairCardsHousesList;
	private int[] player1ColorPairCards;
	private int player1TotalHouses;
	private int player1TotalHotels;
	private int player1JailFree;
	private int player1Railroads;
	private int player1Utilities;
	private int player1TotalDeals;
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
	private ArrayList<String> player2DealList;
	private ArrayList<Integer> player2ColorPairCardsHousesList;
	private int[] player2ColorPairCards;
	private int player2TotalHouses;
	private int player2TotalHotels;
	private int player2JailFree;
	private int player2Railroads;
	private int player2Utilities;
	private int player2TotalDeals;
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
	private ArrayList<String> player3DealList;
	private ArrayList<Integer> player3ColorPairCardsHousesList;
	private int[] player3ColorPairCards;
	private int player3TotalHouses;
	private int player3TotalHotels;
	private int player3JailFree;
	private int player3Railroads;
	private int player3Utilities;
	private int player3TotalDeals;
	private int player3SameDiceNumCount;

	private boolean isCommunityPay;
	private boolean isChancePay;
	private boolean isPayEachPlayer;
	private boolean isCollectFromPlayers;
	private boolean isNearestToNonColors;
	private boolean isDeal;
	private int cardDrawingPay;
	private ArrayList<String> chances;
	private ArrayList<String> communityChests;
	private String[] dealOptions;
	private String[] cardColors;
	private int[] house1Payment;
	private int[] house2Payment;
	private int[] house3Payment;
	private int[] house4Payment;
	private int[] hotelPayment;
	private int cardRegularPrice;
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
	private int playersPlaying;
	
	

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
				"Advance To Nearest Railroad", "Bank Pays You $50", "Get Out Of Jail Free", "Go Back 3 Spaces", "Go To Jail",
				"$25 Per House & $100 Per Hotel", "Pay Tax $15", "Go To Reading Railroad", "Pay Each Player $50",
				"Collect $100", "Collect $150"));

		communityChests = new ArrayList<String>(Arrays.asList("Advance To Go", "Collect $200", "Pay $50", "Get $50",
				"Get Out Of Jail Free", "Go To Jail", "Collect $50 From Every Player", "Receive $100", "Collect $20",
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
		
		coloredCardsName = new String[] {"purple", "lightblue", "pink", "orange", "red", "yellow", "green", "darkblue"};
		
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
		
		dealOptions = new String[] {"Forgive House Payments For Both", "50% Of House Payments For Both", "30% Of House Payments For Both",
				"75% Of House Payments For Both", "Exchange Cards"};

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
		player1DealList = new ArrayList<String>();
		player2DealList = new ArrayList<String>();
		player3DealList = new ArrayList<String>();
		
		player1ColorPairCards = new int[8];
		player2ColorPairCards = new int[8];
		player3ColorPairCards = new int[8];
		
		for(int i = 0; i < player1ColorPairCards.length; i++) {
			player1ColorPairCards[i] = 0;
			player2ColorPairCards[i] = 0;
			player3ColorPairCards[i] = 0;
		}
		
		player1 = "Player 1";
		player2 = "Player 2";
		player3 = "Player 3";
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
		player1TotalDeals = 0;
		player2TotalDeals = 0;
		player3TotalDeals = 0;
		isPlayer1AtUtility = false;
		isPlayer2AtUtility = false;
		isPlayer3AtUtility = false;
		isCommunityPay = false;
		isChancePay = false;
		isPayEachPlayer = false;
		isCollectFromPlayers = false;
		isNearestToNonColors = false;
		isDeal = false;
		cardDrawingPay = 0;
		previousRollDice1 = 0;
		previousRollDice2 = 0;
		houseCost = 0;
		cardLocation = 0;
		cardRegularPrice = 0;

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

		player1Character = new JLabel(player1);
		monopolyDataPanel.add(player1Character);
		player1Character.setBounds(178, 100, 100, 30);
		player1Character.setFont(new Font("Times New Roman", Font.BOLD, 18));

		player2Character = new JLabel(player2);
		monopolyDataPanel.add(player2Character);
		player2Character.setBounds(178, 300, 100, 30);
		player2Character.setFont(new Font("Times New Roman", Font.BOLD, 18));

		player3Character = new JLabel(player3);
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

		player1PropertiesLabel = new JLabel("Properties");
		monopolyDataPanel.add(player1PropertiesLabel);
		player1PropertiesLabel.setBounds(45, 135, 100, 20);
		player1PropertiesLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));

		player2PropertiesLabel = new JLabel("Properties");
		monopolyDataPanel.add(player2PropertiesLabel);
		player2PropertiesLabel.setBounds(45, 335, 100, 20);
		player2PropertiesLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));

		player3PropertiesLabel = new JLabel("Properties");
		monopolyDataPanel.add(player3PropertiesLabel);
		player3PropertiesLabel.setBounds(45, 535, 100, 20);
		player3PropertiesLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		ImageIcon arrowImage = new ImageIcon("C:\\Users\\Vipul\\Documents\\leftArrow.png");
		playerTurnArrow = new JLabel(arrowImage);
		monopolyDataPanel.add(playerTurnArrow);
		playerTurnArrow.setBounds(260, 95, 50, 50);
		
		player1ButtonsSp = new JScrollPane();
		player1ButtonsPanel = new JPanel();
		player1ButtonsPanel.setLayout(null);
		player1ButtonsSp.add(player1ButtonsPanel);
		player1ButtonsPanel.setPreferredSize(new Dimension(80, 245));
		monopolyDataPanel.add(player1ButtonsSp);
		player1ButtonsSp.setBounds(160, 160, 100, 100);
		player1ButtonsSp.setViewportView(player1ButtonsPanel);
		player1ButtonsSp.validate();
		player1ButtonsSp.getVerticalScrollBar().setUnitIncrement(10);
		
		player1PropertiesSp = new JScrollPane();
		player1PropertiesPanel = new JPanel();
		player1PropertiesPanel.setLayout(new BoxLayout(player1PropertiesPanel, BoxLayout.Y_AXIS));
		player1PropertiesSp.add(player1PropertiesPanel);
		player1PropertiesPanel.setPreferredSize(new Dimension(110, 420));
		monopolyDataPanel.add(player1PropertiesSp);
		player1PropertiesSp.setBounds(20, 160, 120, 100);
		player1PropertiesSp.setViewportView(player1PropertiesPanel);
		player1PropertiesSp.validate();
		player1PropertiesSp.getVerticalScrollBar().setUnitIncrement(10);
		
		player1Buy = new JButton("Buy");
		player1ButtonsPanel.add(player1Buy);
		player1Buy.setBounds(12, 5, 60, 25);
		player1Buy.setFocusable(false);
		disableButton(player1Buy);

		player1NotBuy = new JButton("Not Buy");
		player1ButtonsPanel.add(player1NotBuy);
		player1NotBuy.setBounds(12, 35, 60, 25);
		player1NotBuy.setFocusable(false);
		disableButton(player1NotBuy);

		player1Pay = new JButton("Pay");
		player1ButtonsPanel.add(player1Pay);
		player1Pay.setBounds(12, 65, 60, 25);
		player1Pay.setFocusable(false);
		disableButton(player1Pay);
		
		player1Housing = new JButton("Housing");
		player1ButtonsPanel.add(player1Housing);
		player1Housing.setBounds(12, 95, 60, 25);
		player1Housing.setFocusable(false);
		disableButton(player1Housing);

		player1Deal = new JButton("Dealing");
		player1ButtonsPanel.add(player1Deal);
		player1Deal.setBounds(12, 125, 60, 25);
		player1Deal.setFocusable(false);
		disableButton(player1Deal);
		
		player1JailFreeCard = new JButton("Jail Free");
		player1ButtonsPanel.add(player1JailFreeCard);
		player1JailFreeCard.setBounds(12, 155, 60, 25);
		player1JailFreeCard.setFocusable(false);
		disableButton(player1JailFreeCard);

		player1Mortgaging = new JButton("Mortgaging");
		player1ButtonsPanel.add(player1Mortgaging);
		player1Mortgaging.setBounds(7, 185, 70, 25);
		player1Mortgaging.setFocusable(false);
		disableButton(player1Mortgaging);
		
		player1GiveUp = new JButton("Give Up");
		player1ButtonsPanel.add(player1GiveUp);
		player1GiveUp.setBounds(12, 215, 60, 25);
		player1GiveUp.setFocusable(false);
		enableButton(player1GiveUp);
		player1GiveUp.setBackground(Color.RED);
		
		player2ButtonsSp = new JScrollPane();
		player2ButtonsPanel = new JPanel();
		player2ButtonsPanel.setLayout(null);
		player2ButtonsSp.add(player2ButtonsPanel);
		player2ButtonsPanel.setPreferredSize(new Dimension(80, 245));
		monopolyDataPanel.add(player2ButtonsSp);
		player2ButtonsSp.setBounds(160, 360, 100, 100);
		player2ButtonsSp.setViewportView(player2ButtonsPanel);
		player2ButtonsSp.validate();
		player2ButtonsSp.getVerticalScrollBar().setUnitIncrement(10);
		
		player2PropertiesSp = new JScrollPane();
		player2PropertiesPanel = new JPanel();
		player2PropertiesPanel.setLayout(new BoxLayout(player2PropertiesPanel, BoxLayout.Y_AXIS));
		player2PropertiesSp.add(player2PropertiesPanel);
		player2PropertiesPanel.setPreferredSize(new Dimension(110, 420));
		monopolyDataPanel.add(player2PropertiesSp);
		player2PropertiesSp.setBounds(20, 360, 120, 100);
		player2PropertiesSp.setViewportView(player2PropertiesPanel);
		player2PropertiesSp.validate();
		player2PropertiesSp.getVerticalScrollBar().setUnitIncrement(10);

		player2Buy = new JButton("Buy");
		player2ButtonsPanel.add(player2Buy);
		player2Buy.setBounds(12, 5, 60, 25);
		player2Buy.setFocusable(false);
		disableButton(player2Buy);

		player2NotBuy = new JButton("Not Buy");
		player2ButtonsPanel.add(player2NotBuy);
		player2NotBuy.setBounds(12, 35, 60, 25);
		player2NotBuy.setFocusable(false);
		disableButton(player2NotBuy);

		player2Pay = new JButton("Pay");
		player2ButtonsPanel.add(player2Pay);
		player2Pay.setBounds(12, 65, 60, 25);
		player2Pay.setFocusable(false);
		disableButton(player2Pay);
		
		player2Housing = new JButton("Housing");
		player2ButtonsPanel.add(player2Housing);
		player2Housing.setBounds(12, 95, 60, 25);
		player2Housing.setFocusable(false);
		disableButton(player2Housing);

		player2Deal = new JButton("Dealing");
		player2ButtonsPanel.add(player2Deal);
		player2Deal.setBounds(12, 125, 60, 25);
		player2Deal.setFocusable(false);
		disableButton(player2Deal);

		player2JailFreeCard = new JButton("Jail Free");
		player2ButtonsPanel.add(player2JailFreeCard);
		player2JailFreeCard.setBounds(12, 155, 60, 25);
		player2JailFreeCard.setFocusable(false);
		disableButton(player2JailFreeCard);
		
		player2Mortgaging = new JButton("Mortgaging");
		player2ButtonsPanel.add(player2Mortgaging);
		player2Mortgaging.setBounds(7, 185, 70, 25);
		player2Mortgaging.setFocusable(false);
		disableButton(player2Mortgaging);
		
		player2GiveUp = new JButton("Give Up");
		player2ButtonsPanel.add(player2GiveUp);
		player2GiveUp.setBounds(12, 215, 60, 25);
		player2GiveUp.setFocusable(false);
		enableButton(player2GiveUp);
		player2GiveUp.setBackground(Color.RED);
		
		player3ButtonsSp = new JScrollPane();
		player3ButtonsPanel = new JPanel();
		player3ButtonsPanel.setLayout(null);
		player3ButtonsSp.add(player3ButtonsPanel);
		player3ButtonsPanel.setPreferredSize(new Dimension(80, 245));
		monopolyDataPanel.add(player3ButtonsSp);
		player3ButtonsSp.setBounds(160, 560, 100, 100);
		player3ButtonsSp.setViewportView(player3ButtonsPanel);
		player3ButtonsSp.validate();
		player3ButtonsSp.getVerticalScrollBar().setUnitIncrement(10);
		
		player3PropertiesSp = new JScrollPane();
		player3PropertiesPanel = new JPanel();
		player3PropertiesPanel.setLayout(new BoxLayout(player3PropertiesPanel, BoxLayout.Y_AXIS));
		player3PropertiesSp.add(player3PropertiesPanel);
		player3PropertiesPanel.setPreferredSize(new Dimension(110, 420));
		monopolyDataPanel.add(player3PropertiesSp);
		player3PropertiesSp.setBounds(20, 560, 120, 100);
		player3PropertiesSp.setViewportView(player3PropertiesPanel);
		player3PropertiesSp.validate();
		player3PropertiesSp.getVerticalScrollBar().setUnitIncrement(10);

		player3Buy = new JButton("Buy");
		player3ButtonsPanel.add(player3Buy);
		player3Buy.setBounds(12, 5, 60, 25);
		player3Buy.setFocusable(false);
		disableButton(player3Buy);

		player3NotBuy = new JButton("Not Buy");
		player3ButtonsPanel.add(player3NotBuy);
		player3NotBuy.setBounds(12, 35, 60, 25);
		player3NotBuy.setFocusable(false);
		disableButton(player3NotBuy);

		player3Pay = new JButton("Pay");
		player3ButtonsPanel.add(player3Pay);
		player3Pay.setBounds(12, 65, 60, 25);
		player3Pay.setFocusable(false);
		disableButton(player3Pay);
		
		player3Housing = new JButton("Housing");
		player3ButtonsPanel.add(player3Housing);
		player3Housing.setBounds(12, 95, 60, 25);
		player3Housing.setFocusable(false);
		disableButton(player3Housing);

		player3Deal = new JButton("Dealing");
		player3ButtonsPanel.add(player3Deal);
		player3Deal.setBounds(12, 125, 60, 25);
		player3Deal.setFocusable(false);
		disableButton(player3Deal);
		
		player3JailFreeCard = new JButton("Jail Free");
		player3ButtonsPanel.add(player3JailFreeCard);
		player3JailFreeCard.setBounds(12, 155, 60, 25);
		player3JailFreeCard.setFocusable(false);
		disableButton(player3JailFreeCard);

		player3Mortgaging = new JButton("Mortgaging");
		player3ButtonsPanel.add(player3Mortgaging);
		player3Mortgaging.setBounds(7, 185, 70, 25);
		player3Mortgaging.setFocusable(false);
		disableButton(player3Mortgaging);
		
		player3GiveUp = new JButton("Give Up");
		player3ButtonsPanel.add(player3GiveUp);
		player3GiveUp.setBounds(12, 215, 60, 25);
		player3GiveUp.setFocusable(false);
		enableButton(player3GiveUp);
		player3GiveUp.setBackground(Color.RED);

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

					if (isPlayer1Out == false && isPlayer1Turn == true && isPlayer1Buy == false && isPlayer3Buy == false && isPlayer1Pay == false && isPlayer2Pay == false && isPlayer3Pay == false) {
						player3SameDiceNumCount = 0;
						chanceLabel.setText("Chance: ");
						communityChestLabel.setText("Community Chest: ");
						
						int player1PreviousLocation = player1Location;

						if (isJailPlayer1 == false && isPlayer1AtUtility == false) {
							//player1Location += currentRollDice1 + currentRollDice2;
							if (player1Location == 0) {
								player1Location += 6;
							} else if (player1Location == 6) {
								player1Location += 2;
							} else {
								player1Location += 1;
							}
						} else if (isJailPlayer1 == true) {
							if (currentRollDice1 != currentRollDice2) {
								disableButton(player1Pay);
								player1JailCount--;
								if (player1JailCount == 0) {
									enableButton(player1Pay);
									if (player1JailFree > 0) {
										enableButton(player1JailFreeCard);
									}
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
								disableButton(player1GiveUp);
								if (isPlayer2Out == false) {
									isPlayer2Turn = true;
									enableButton(player2GiveUp);
								} else {
									isPlayer3Turn = true;
									enableButton(player3GiveUp);
								}
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
								enableButton(player1Mortgaging);
							}
						} else if (currentRollDice1 != currentRollDice2) {
							isPlayer1Turn = false;
							disableButton(player1GiveUp);
							if (isPlayer2Out == false) {
								isPlayer2Turn = true;
								enableButton(player2GiveUp);
							} else {
								isPlayer3Turn = true;
								enableButton(player3GiveUp);
							}
							if (isJailPlayer2 == true && isPlayer1Pay == false && player2JailCount != 1) {
								enableButton(player2Pay);
							}
							if (isJailPlayer2 == true && isPlayer1Pay == false && player2JailFree > 0) {
								enableButton(player2JailFreeCard);
							}
						}

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
							moneyData(200, 1, 0);
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
								moneyData(200, 1, 0);
								player1x = 1122;
								player1y = 1150;
								break;
							case "Advance To St. Charles":
								if (player1Location > 11 && player1Location < 39) {
									moneyData(200, 1, 0);
								}
								player1Location = 11;
								player1x = 70;
								player1y = 1020;
								break;
							case "Advance To Illinois Ave.":
								if (player1Location > 24 && player1Location < 39) {
									moneyData(200, 1, 0);
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
										moneyData(200, 1, 0);
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
									moneyData(200, 1, 0);
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
								moneyData(50, 1, 0);
								break;
							case "Get Out Of Jail Free":
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
											enableButton(player1Mortgaging);
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
										enableButton(player1Mortgaging);
									}
								}
								break;
							case "Collect $100":
								moneyData(100, 1, 0);
								break;
							case "Collect $150":
								moneyData(150, 1, 0);
								break;
							case "Pay Each Player $50":
								isPlayer1Pay = true;
								isPayEachPlayer = true;
								isChancePay = true;
								cardDrawingPay = 50 * (playersPlaying - 1);
								enableButton(player1Pay);
								if (player1Coins < cardDrawingPay) {
									if (player1Cards.size() > 0) {
										enableButton(player1Mortgaging);
									}
								}
								break;
							case "Go To Reading Railroad":
								moneyData(200, 1, 0);
								player1Location = 5;
								player1x = 602;
								player1y = 1150;
								break;
							}

							String firstChance = chances.get(0);
							chances.remove(0);
							if (firstChance.equals("Get Out Of Jail Free") == false) {
								chances.add(firstChance);
							}
						}

						if (player1Location == 2 || player1Location == 17 || player1Location == 33) {
							communityChestLabel.setText("Community Chest: " + communityChests.get(0));
							switch (communityChests.get(0)) {
							case "Advance To Go":
								player1Location = 0;
								moneyData(200, 1, 0);
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
								moneyData(50, 1, 0);
								break;
							case "Collect $10":
								moneyData(10, 1, 0);
								break;
							case "Collect $20":
								moneyData(20, 1, 0);
								break;
							case "Receive $25":
								moneyData(25, 1, 0);
								break;
							case "Collect $100":
								moneyData(100, 1, 0);
								break;
							case "Collect $150":
								moneyData(150, 1, 0);
								break;
							case "Collect $200":
								moneyData(200, 1, 0);
								break;
							case "Inherit $100":
								moneyData(100, 1, 0);
								break;
							case "Collect $50 From Every Player":
								isCommunityPay = true;
								isCollectFromPlayers = true;
								if (isPlayer2Out == false) {
									isPlayer2Pay = true;
									enableButton(player2Pay);
								}
								if (isPlayer3Out == false) {
									isPlayer3Pay = true;
									enableButton(player3Pay);
								}
								enableButton(player2Pay);
								break;
							case "Get $50":
								moneyData(50, 1, 0);
								break;
							case "Pay $50":
								isCommunityPay = true;
								isPlayer1Pay = true;
								cardDrawingPay = 50;
								enableButton(player1Pay);
								if (player1Coins < cardDrawingPay) {
									if (player1Cards.size() > 0) {
										enableButton(player1Mortgaging);
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
										enableButton(player1Mortgaging);
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
										enableButton(player1Mortgaging);
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
											enableButton(player1Mortgaging);
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
							if (firstChest.equals("Get Out Of Jail Free") == false) {
								communityChests.add(firstChest);
							}
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
									if (player1Coins < places_PaymentPrices[player1Location]) {
										if (player1Cards.size() > 0) {
											enableButton(player1Mortgaging);
										}
										if (player1TotalHouses > 0 || player1TotalHotels > 0) {
											enableButton(player1Housing);
										}
									}
								} else {
									if (isPlayer1AtUtility == false) {
										isPlayer1AtUtility = true;
										isPlayer1Turn = true;
										if (isPlayer2Out == false) {
											isPlayer2Turn = false;
										} else {
											isPlayer3Turn = false;
										}
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
									if (player1Coins < places_PaymentPrices[player1Location]) {
										if (player1Cards.size() > 0) {
											enableButton(player1Mortgaging);
										}
										if (player1TotalHouses > 0 || player1TotalHotels > 0) {
											enableButton(player1Housing);
										}
									}
								} else {
									if (isPlayer1AtUtility == false) {
										isPlayer1AtUtility = true;
										isPlayer1Turn = true;
										if (isPlayer2Out == false) {
											isPlayer2Turn = false;
										} else {
											isPlayer3Turn = false;
										}
										previousRollDice1 = currentRollDice1;
										previousRollDice2 = currentRollDice2;
									}
								}
							}
						}

						player1CoinsLabel.setText("$" + player1Coins);
					}

					else if (isPlayer2Out == false && isPlayer2Turn == true && isPlayer1Buy == false && isPlayer2Buy == false && isPlayer2Pay == false && isPlayer1Pay == false && isPlayer3Pay == false) {
						player1SameDiceNumCount = 0;
						chanceLabel.setText("Chance: ");
						communityChestLabel.setText("Community Chest: ");
						
						int player2PreviousLocation = player2Location;

						if (isJailPlayer2 == false && isPlayer2AtUtility == false) {
							//player2Location += currentRollDice1 + currentRollDice2;
							if (player2Location == 0) {
								player2Location += 6;
							} else if (player2Location == 6) {
								player2Location += 2;
							} else {
								player2Location += 1;
							}
						} else if (isJailPlayer2 == true) {
							if (currentRollDice1 != currentRollDice2) {
								disableButton(player2Pay);
								player2JailCount--;
								if (player2JailCount == 0) {
									enableButton(player2Pay);
									if (player2JailFree > 0) {
										enableButton(player2JailFreeCard);
									}
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
								disableButton(player2GiveUp);
								if (isPlayer3Out == false ) {
									isPlayer3Turn = true;
									enableButton(player3GiveUp);
								} else {
									isPlayer1Turn = true;
									enableButton(player1GiveUp);
								}
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
								enableButton(player2Mortgaging);
							}
						} else if (currentRollDice1 != currentRollDice2) {
							isPlayer2Turn = false;
							disableButton(player2GiveUp);
							if (isPlayer3Out == false) {
								isPlayer3Turn = true;
								enableButton(player3GiveUp);
							} else {
								isPlayer1Turn = true;
								enableButton(player1GiveUp);
							}
							if (isJailPlayer3 == true && isPlayer2Pay == false && player3JailCount != 1) {
								enableButton(player3Pay);
							}
							if (isJailPlayer3 == true && isPlayer2Pay == false && player3JailFree > 0) {
								enableButton(player3JailFreeCard);
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
							moneyData(200, 2, 0);
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
								moneyData(200, 2, 0);
								player2x = 1122;
								player2y = 1125;
								break;
							case "Advance To St. Charles":
								if (player2Location > 11 && player2Location < 39) {
									moneyData(200, 2, 0);
								}
								player2Location = 11;
								player2x = 97;
								player2y = 1020;
								break;
							case "Advance To Illinois Ave.":
								if (player2Location > 24 && player2Location < 39) {
									moneyData(200, 2, 0);
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
										moneyData(200, 2, 0);
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
									moneyData(200, 2, 0);
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
								moneyData(50, 2, 0);
								break;
							case "Get Out Of Jail Free":
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
											enableButton(player2Mortgaging);
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
										enableButton(player2Mortgaging);
									}
								}
								break;
							case "Collect $100":
								moneyData(100, 2, 0);
								break;
							case "Collect $150":
								moneyData(150, 2, 0);
								break;
							case "Pay Each Player $50":
								isPlayer1Pay = true;
								isPayEachPlayer = true;
								isChancePay = true;
								cardDrawingPay = 50 * (playersPlaying - 1);
								enableButton(player2Pay);
								if (player2Coins < cardDrawingPay) {
									if (player2Cards.size() > 0) {
										enableButton(player2Mortgaging);
									}
								}
								break;
							case "Go To Reading Railroad":
								moneyData(200, 2, 0);
								player2Location = 5;
								player2x = 602;
								player2y = 1125;
								break;
							}

							String firstChance = chances.get(0);
							chances.remove(0);
							if (firstChance.equals("Get Out Of Jail Free") == false) {
								chances.add(firstChance);
							}
						}

						if (player2Location == 2 || player2Location == 17 || player2Location == 33) {
							communityChestLabel.setText("Community Chest: " + communityChests.get(0));
							switch (communityChests.get(0)) {
							case "Advance To Go":
								player2Location = 0;
								moneyData(200, 2, 0);
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
								moneyData(50, 2, 0);
								break;
							case "Collect $10":
								moneyData(10, 2, 0);
								break;
							case "Collect $20":
								moneyData(20, 2, 0);
								break;
							case "Receive $25":
								moneyData(25, 2, 0);
								break;
							case "Collect $100":
								moneyData(100, 2, 0);
								break;
							case "Collect $150":
								moneyData(150, 2, 0);
								break;
							case "Collect $200":
								moneyData(200, 2, 0);
								break;
							case "Inherit $100":
								moneyData(100, 2, 0);
								break;
							case "Collect $50 From Every Player":
								isCommunityPay = true;
								isCollectFromPlayers = true;
								if (isPlayer1Out == false) {
									isPlayer1Pay = true;
									enableButton(player1Pay);
								}
								if (isPlayer3Out == false) {
									isPlayer3Pay = true;
									enableButton(player3Pay);
								}
								enableButton(player3Pay);
								break;
							case "Get $50":
								moneyData(50, 2, 0);
								break;
							case "Pay $50":
								isCommunityPay = true;
								isPlayer2Pay = true;
								cardDrawingPay = 50;
								enableButton(player2Pay);
								if (player2Coins < cardDrawingPay) {
									if (player2Cards.size() > 0) {
										enableButton(player2Mortgaging);
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
										enableButton(player2Mortgaging);
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
										enableButton(player2Mortgaging);
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
											enableButton(player2Mortgaging);
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
							if (firstChest.equals("Get Out Of Jail Free") == false) {
								communityChests.add(firstChest);
							}
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
									if (player2Coins < places_PaymentPrices[player2Location]) {
										if (player2Cards.size() > 0) {
											enableButton(player2Mortgaging);
										}
										if (player2TotalHouses > 0 || player2TotalHotels > 0) {
											enableButton(player2Housing);
										}
									}
								} else {
									if (isPlayer2AtUtility == false) {
										isPlayer2AtUtility = true;
										previousRollDice1 = currentRollDice1;
										previousRollDice2 = currentRollDice2;
										isPlayer2Turn = true;
										if (isPlayer3Out == false ) {
											isPlayer3Turn = false;
										} else {
											isPlayer1Turn = false;
										}
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
									if (player2Coins < places_PaymentPrices[player2Location]) {
										if (player2Cards.size() > 0) {
											enableButton(player2Mortgaging);
										}
										if (player2TotalHouses > 0 || player2TotalHotels > 0) {
											enableButton(player2Housing);
										}
									}
								} else {
									if (isPlayer2AtUtility == false) {
										isPlayer2AtUtility = true;
										previousRollDice1 = currentRollDice1;
										previousRollDice2 = currentRollDice2;
										isPlayer2Turn = true;
										if (isPlayer3Out == false ) {
											isPlayer3Turn = false;
										} else {
											isPlayer1Turn = false;
										}
									}
								}
							}
						}
						
						player2CoinsLabel.setText("$" + player2Coins);
					}

					else if (isPlayer3Out == false && isPlayer3Turn == true && isPlayer2Buy == false && isPlayer3Buy == false && isPlayer3Pay == false && isPlayer1Pay == false && isPlayer2Pay == false) {
						player2SameDiceNumCount = 0;
						chanceLabel.setText("Chance: ");
						communityChestLabel.setText("Community Chest: ");
						
						int player3PreviousLocation = player3Location;

						if (isJailPlayer3 == false && isPlayer3AtUtility == false) {
							player3Location += currentRollDice1 + currentRollDice2;
						} else if (isJailPlayer3 == true) {
							if (currentRollDice1 != currentRollDice2) {
								disableButton(player3Pay);
								player3JailCount--;
								if (player3JailCount == 0) {
									enableButton(player3Pay);
									if (player3JailFree > 0) {
										enableButton(player3JailFreeCard);
									}
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
								disableButton(player3GiveUp);
								if (isPlayer1Out == false) {
									isPlayer1Turn = true;
									enableButton(player1GiveUp);
								} else {
									isPlayer2Turn = true;
									enableButton(player2GiveUp);
								}
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
								enableButton(player3Mortgaging);
							}
						} else if (currentRollDice1 != currentRollDice2) {
							isPlayer3Turn = false;
							disableButton(player3GiveUp);
							if (isPlayer1Out == false) {
								isPlayer1Turn = true;
								enableButton(player1GiveUp);
							} else {
								isPlayer2Turn = true;
								enableButton(player2GiveUp);
							}
							if (isJailPlayer1 == true && isPlayer3Pay == false && player1JailCount != 1) {
								enableButton(player1Pay);
							}
							if (isJailPlayer1 == true && isPlayer3Pay == false && player1JailFree > 0) {
								enableButton(player1JailFreeCard);
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
							moneyData(200, 3, 0);
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
								moneyData(200, 3, 0);
								player3x = 1122;
								player3y = 1175;
								break;
							case "Advance To St. Charles":
								if (player3Location > 11 && player3Location < 39) {
									moneyData(200, 3, 0);
								}
								player3Location = 11;
								player3x = 40;
								player3y = 1020;
								break;
							case "Advance To Illinois Ave.":
								if (player3Location > 24 && player3Location < 39) {
									moneyData(200, 3, 0);
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
										moneyData(200, 3, 0);
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
									moneyData(200, 3, 0);
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
								moneyData(50, 3, 0);
								break;
							case "Get Out Of Jail Free":
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
											enableButton(player3Mortgaging);
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
										enableButton(player3Mortgaging);
									}
								}
								break;
							case "Collect $100":
								moneyData(100, 3, 0);
								break;
							case "Collect $150":
								moneyData(150, 3, 0);
								break;
							case "Pay Each Player $50":
								isPlayer1Pay = true;
								isPayEachPlayer = true;
								isChancePay = true;
								cardDrawingPay = 50 * (playersPlaying);
								enableButton(player3Pay);
								if (player3Coins < cardDrawingPay) {
									if (player3Cards.size() > 0) {
										enableButton(player3Mortgaging);
									}
								}
								break;
							case "Go To Reading Railroad":
								moneyData(200, 3, 0);
								player3Location = 5;
								player3x = 602;
								player3y = 1175;
								break;
							}

							String firstChance = chances.get(0);
							chances.remove(0);
							if (firstChance.equals("Get Out Of Jail Free") == false) {
								chances.add(firstChance);
							}
						}

						if (player3Location == 2 || player3Location == 17 || player3Location == 33) {
							communityChestLabel.setText("Community Chest: " + communityChests.get(0));
							switch (communityChests.get(0)) {
							case "Advance To Go":
								player3Location = 0;
								moneyData(200, 3, 0);
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
								moneyData(50, 3, 0);
								break;
							case "Collect $10":
								moneyData(10, 3, 0);
								break;
							case "Collect $20":
								moneyData(20, 3, 0);
								break;
							case "Receive $25":
								moneyData(25, 3, 0);
								break;
							case "Collect $100":
								moneyData(100, 3, 0);
								break;
							case "Collect $150":
								moneyData(150, 3, 0);
								break;
							case "Collect $200":
								moneyData(200, 3, 0);
								break;
							case "Inherit $100":
								moneyData(100, 3, 0);
								break;
							case "Collect $50 From Every Player":
								isCommunityPay = true;
								isCollectFromPlayers = true;
								if (isPlayer1Out == false) {
									isPlayer1Pay = true;
									enableButton(player1Pay);
								}
								if (isPlayer2Out == false) {
									isPlayer2Pay = true;
									enableButton(player2Pay);
								}
								enableButton(player1Pay);
								break;
							case "Get $50":
								moneyData(50, 3, 0);
								break;
							case "Pay $50":
								isPlayer3Pay = true;
								isCommunityPay = true;
								cardDrawingPay = 50;
								enableButton(player3Pay);
								if (player3Coins < cardDrawingPay) {
									if (player3Cards.size() > 0) {
										enableButton(player3Mortgaging);
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
										enableButton(player3Mortgaging);
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
										enableButton(player3Mortgaging);
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
											enableButton(player3Mortgaging);
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
							if (firstChest.equals("Get Out Of Jail Free") == false) {
								communityChests.add(firstChest);
							}
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
									if (player3Coins < places_PaymentPrices[player3Location]) {
										if (player3Cards.size() > 0) {
											enableButton(player3Mortgaging);
										}
										if (player3TotalHouses > 0 || player3TotalHotels > 0) {
											enableButton(player3Housing);
										}
									}
								} else {
									if (isPlayer3AtUtility == false) {
										isPlayer3AtUtility = true;
										isPlayer3Turn = true;
										if (isPlayer1Out == false) {
											isPlayer1Turn = false;
										} else {
											isPlayer2Turn = false;
										}
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
									if (player3Coins < places_PaymentPrices[player3Location]) {
										if (player3Cards.size() > 0) {
											enableButton(player3Mortgaging);
										}
										if (player3TotalHouses > 0 || player3TotalHotels > 0) {
											enableButton(player3Housing);
										}
									}
								} else {
									if (isPlayer3AtUtility == false) {
										isPlayer3AtUtility = true;
										isPlayer3Turn = true;
										if (isPlayer1Out == false) {
											isPlayer1Turn = false;
										} else {
											isPlayer2Turn = false;
										}
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
						if (isPlayer1Out == true) {
							playerTurnArrow.setLocation(260, 95);
						} else {
							playerTurnArrow.setLocation(260, 295);
						}
					} else if (isPlayer3Turn && isPlayer3Out == false) {
						if (isPlayer1Out == true || isPlayer2Out == true) {
							playerTurnArrow.setLocation(260, 295);
						} else {
							playerTurnArrow.setLocation(260, 495);
						}
					}
				}
			}
			
			@Override
			public void keyTyped(KeyEvent e) {

			}

		};
		monopolyFrame.addKeyListener(monopolyKeys);

		player1Buy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moneyData(prices_places[player1Location], 0, 1);
				player1CoinsLabel.setText("$" + player1Coins);
				player1Cards.add(arr_places[player1Location]);
				player1CardsLabel.add(new JLabel(arr_places[player1Location]));
				player1CardsLabel.get(player1Cards.size() - 1).setFont(new Font("Arial", Font.PLAIN, 12));
				player1PropertiesPanel.add(player1CardsLabel.get(player1Cards.size() - 1));
				player1CardsLabel.get(player1Cards.size() - 1).show();
				player1CardsLabel.get(player1Cards.size() - 1).setSize(140, 15);
				player1CardsLabel.get(player1CardsLabel.size()-1).setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
				propertiesNotBought.remove(arr_places[player1Location]);
				disableButton(player1Buy);
				disableButton(player1NotBuy);
				if (arr_places[player1Location].indexOf("Railroad") > 0) {
					player1Railroads += 1;
				} else if (arr_places[player1Location].equals("Electric Company") || arr_places[player1Location].equals("Water Works")) {
					player1Utilities += 1;
				}
				pairCards(1, cardColors[player1Location]);
				isPlayer1Buy = false;
			}
		});

		player1Housing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				housing(player1ColorPairCardsList, player1ColorPairCardsHousesList, player1CardColors, 1, player1Coins);
			}
		});

		player1NotBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (playersPlaying == 3) {
					bidding(player1Location, 1, 2, 3, player2, player3, player2Coins, player3Coins, player2Cards, player3Cards, player2CardsLabel,
							player3CardsLabel, player1Buy, player1NotBuy, player2CoinsLabel, player3CoinsLabel, player2PropertiesPanel, player3PropertiesPanel);
				} else {
					isPlayer1Buy = false;
					disableButton(player1Buy);
					disableButton(player1NotBuy);
				}
			}
		});

		player1Pay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playerPay(player1Location, 1, 2, 3, player1Coins, player2Coins, player3Coins,
						isPlayer1AtUtility, isPlayer1Pay, isPlayer2Pay, isPlayer3Pay, player1Pay, player2Pay, player3Pay,
						player2Utilities, player3Utilities, isJailPlayer1, isJailPlayer2, isJailPlayer3, isPlayer1Out, isPlayer2Out, isPlayer3Out);
			}
		});

		player1Mortgaging.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mortgaging(player1MortgageCards, player1Cards, player1ColorPairCardsList, player1ColorPairCardsHousesList, player1CardColors, player1HousesLabel, 1,
						player1CardsLabel, player1Mortgaging, player1Housing, player1Coins, isPlayer1Pay, player1ColorPairCards, player1PropertiesPanel);
			}
		});

		player1Deal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame dealFrame = new JFrame("Dealing");
				JPanel dealPanel = new JPanel();
				dealPanel.setLayout(null);
				dealFrame.add(dealPanel);
				dealFrame.setSize(250, 300);
				dealFrame.setVisible(true);
				
				JLabel setDealWithLabel = new JLabel("Set Deal With:");
				dealPanel.add(setDealWithLabel);
				setDealWithLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
				setDealWithLabel.setBounds(60, 50, 200, 30);
				
				JLabel useDealLabel = new JLabel("Use Deal Of:");
				dealPanel.add(useDealLabel);
				useDealLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
				useDealLabel.setBounds(65, 150, 200, 30);
				
				JButton dealWithPlayer2 = new JButton(player2);
				dealPanel.add(dealWithPlayer2);
				if (isPlayer2Pay == false) {
					enableButton(dealWithPlayer2);
				} else {
					disableButton(dealWithPlayer2);
				}
				dealWithPlayer2.setBounds(30, 100, 80, 30);
				
				JButton dealWithPlayer3 = new JButton(player3);
				dealPanel.add(dealWithPlayer3);
				if (isPlayer3Pay == false) {
					enableButton(dealWithPlayer3);
				} else {
					disableButton(dealWithPlayer3);
				}
				dealWithPlayer3.setBounds(120, 100, 80, 30);
				
				JButton useDealOfPlayer2 = new JButton(player2);
				dealPanel.add(useDealOfPlayer2);
				if (player1TotalDeals > 0 && isPlayer2Pay == false) {
					enableButton(useDealOfPlayer2);
				} else {
					disableButton(useDealOfPlayer2);
				}
				useDealOfPlayer2.setBounds(30, 200, 80, 30);
				
				JButton useDealOfPlayer3 = new JButton(player3);
				dealPanel.add(useDealOfPlayer3);
				if (player1TotalDeals > 0 && isPlayer3Pay == false) {
					enableButton(useDealOfPlayer3);
				} else {
					disableButton(useDealOfPlayer3);
				}
				useDealOfPlayer3.setBounds(120, 200, 80, 30);
				
				dealWithPlayer2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						showOrHideDealButtons(false, dealPanel, setDealWithLabel, useDealLabel, dealWithPlayer2, dealWithPlayer3,
								useDealOfPlayer2, useDealOfPlayer3);
						
						settingDeal(dealFrame, dealPanel, setDealWithLabel, useDealLabel, player1CardsLabel, player2CardsLabel, dealWithPlayer2, dealWithPlayer3, useDealOfPlayer2,
								useDealOfPlayer3, player1Cards, player2Cards, player1, player2, 1, 2, player1DealList, player2DealList, player1Deal, player1Pay, player1Location,
								player1PropertiesPanel, player2PropertiesPanel);
										
					}
				});
				
				dealWithPlayer3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						showOrHideDealButtons(false, dealPanel, setDealWithLabel, useDealLabel, dealWithPlayer2, dealWithPlayer3,
								useDealOfPlayer2, useDealOfPlayer3);
						
						settingDeal(dealFrame, dealPanel, setDealWithLabel, useDealLabel, player1CardsLabel, player3CardsLabel, dealWithPlayer3, dealWithPlayer2, useDealOfPlayer3,
								useDealOfPlayer2, player1Cards, player3Cards, player1, player3, 1, 3, player1DealList, player3DealList, player1Deal, player1Pay, player1Location,
								player1PropertiesPanel, player3PropertiesPanel);
					}
				});
				
				useDealOfPlayer2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						showOrHideDealButtons(false, dealPanel, setDealWithLabel, useDealLabel, dealWithPlayer2, dealWithPlayer3,
								useDealOfPlayer2, useDealOfPlayer3);
						
						usingDeal(dealFrame, dealPanel, setDealWithLabel, useDealLabel, dealWithPlayer2, dealWithPlayer3,
								useDealOfPlayer2, useDealOfPlayer3, player1Location, 1, 2, player1DealList, player2, player1Pay, player1Deal);
					}
				});
				
				useDealOfPlayer3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						showOrHideDealButtons(false, dealPanel, setDealWithLabel, useDealLabel, dealWithPlayer2, dealWithPlayer3,
								useDealOfPlayer2, useDealOfPlayer3);
						
						usingDeal(dealFrame, dealPanel, setDealWithLabel, useDealLabel, dealWithPlayer2, dealWithPlayer3,
								useDealOfPlayer2, useDealOfPlayer3, player1Location, 1, 3, player1DealList, player3, player1Pay, player1Deal);
					}
				});
			}
		});
		
		player1JailFreeCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disableButton(player1JailFreeCard);
				player1JailFree -= 1;
				isJailPlayer1 = false;
				isPlayer1Pay = false;
				boolean isFromChance = true;
				for (int i = 0; i < chances.size(); i++) {
					if (chances.get(i).equals("Get Out Of Jail Free")) {
						isFromChance = false;
						break;
					}
				}
				if (isFromChance == true) {
					chances.add("Get Out Of Jail Free");
				} else {
					communityChests.add("Get Out Of Jail Free");
				}
			}
		});
		
		player1GiveUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int response = JOptionPane.showConfirmDialog(monopolyFrame, "Are you sure you want to give up?", "Give Up Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (response == JOptionPane.YES_OPTION) {
					playersPlaying--;
					if (playersPlaying == 1) {
						gameOver();
					}
					isPlayer1Out = true;
					isPlayer1Turn = false;
					isPlayer1Buy = false;
					if (isPlayer1Pay == true) {
						playerPay(player1Location, 1, 2, 3, player1Coins, player2Coins, player3Coins,
								isPlayer1AtUtility, isPlayer1Pay, isPlayer2Pay, isPlayer3Pay, player1Pay, player2Pay, player3Pay,
								player2Utilities, player3Utilities, isJailPlayer1, isJailPlayer2, isJailPlayer3, isPlayer1Out, isPlayer2Out, isPlayer3Out);
					}
					isPlayer1Pay = false;
					isPlayer1AtUtility = false;
					if (isPlayer2Out == false) {
						isPlayer2Turn = true;
					} else {
						isPlayer3Turn = true;
					}
					if (player1JailFree > 0) {
						boolean isFromChance = true;
						for (int i = 0; i < chances.size(); i++) {
							if (chances.get(i).equals("Get Out Of Jail Free")) {
								isFromChance = false;
								break;
							}
						}
						if (isFromChance == true) {
							chances.add("Get Out Of Jail Free");
						} else {
							communityChests.add("Get Out Of Jail Free");
						}
					}
					isJailPlayer1 = false;
					player1JailFree = 0;
					player1Railroads = 0;
					player1Utilities = 0;
					player1ButtonsSp.setVisible(false);
					player1PropertiesSp.setVisible(false);
					monopolyDataPanel.remove(player1ButtonsSp);
					monopolyDataPanel.remove(player1PropertiesSp);
					player1CoinsLabel.hide();
					monopolyDataPanel.remove(player1CoinsLabel);
					player1Character.hide();
					monopolyDataPanel.remove(player1Character);
					player1PropertiesLabel.hide();
					monopolyDataPanel.remove(player1PropertiesLabel);
					glassLabel.hide();
					monopolyBoardPanel.remove(glassLabel);
					
					while (player1Cards.size() > 0) {
						propertiesNotBought.add(player1Cards.get(0));
						int cardPaymentPriceIndex = Arrays.asList(arr_places).indexOf(player1Cards.get(0));
						places_PaymentPrices[cardPaymentPriceIndex] = places_PaymentPrices2[cardPaymentPriceIndex];
						player1CardsLabel.get(0).hide();
						monopolyDataPanel.remove(player1CardsLabel.get(0));
						player1CardsLabel.remove(0);
						player1Cards.remove(0);
					}
					
					for (int i = 0; i < 8; i++) {
						player1ColorPairCards[i] = 0;
					}
					
					for (int i = 0; i < player1ColorPairCardsHousesList.size(); i++) {
						int cardHouses = player1ColorPairCardsHousesList.get(i);
						if (cardHouses > 0) {
							player1ColorPairCardsHousesList.remove(i);
							player1ColorPairCardsHousesList.add(i, 0);
							housePositioning(i, 1);
						}
					}
				}
			}
		});
		
		player2Buy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moneyData(prices_places[player2Location], 0, 2);
				player2CoinsLabel.setText("$" + player2Coins);
				player2Cards.add(arr_places[player2Location]);
				player2CardsLabel.add(new JLabel(arr_places[player2Location]));
				player2CardsLabel.get(player2Cards.size() - 1).setFont(new Font("Arial", Font.PLAIN, 12));
				player2PropertiesPanel.add(player2CardsLabel.get(player2Cards.size() - 1));
				player2CardsLabel.get(player2Cards.size() - 1).show();
				player2CardsLabel.get(player2Cards.size() - 1).setSize(140, 15);
				player2CardsLabel.get(player2CardsLabel.size()-1).setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
				propertiesNotBought.remove(arr_places[player2Location]);
				disableButton(player2Buy);
				disableButton(player2NotBuy);
				if (arr_places[player2Location].indexOf("Railroad") > 0) {
					player2Railroads += 1;
				} else if (arr_places[player2Location].equals("Electric Company") || arr_places[player2Location].equals("Water Works")) {
					player2Utilities += 1;
				}
				pairCards(2, cardColors[player2Location]);
				isPlayer2Buy = false;
				
				enableButton(player2Deal);
			}
		});

		player2Housing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				housing(player2ColorPairCardsList, player2ColorPairCardsHousesList, player2CardColors, 2, player2Coins);
			}
		});
		
		player2NotBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (playersPlaying == 3) {
					bidding(player2Location, 2, 1, 3, player1, player3, player1Coins, player3Coins, player1Cards, player3Cards, player1CardsLabel,
							player3CardsLabel, player2Buy, player2NotBuy, player1CoinsLabel, player3CoinsLabel, player1PropertiesPanel, player3PropertiesPanel);
				} else {
					isPlayer2Buy = false;
					disableButton(player2Buy);
					disableButton(player2NotBuy);
				}
			}
		});

		player2Pay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playerPay(player2Location, 2, 3, 1, player2Coins, player3Coins, player1Coins,
						isPlayer2AtUtility, isPlayer2Pay, isPlayer3Pay, isPlayer1Pay, player2Pay, player3Pay, player1Pay,
						player3Utilities, player1Utilities, isJailPlayer2, isJailPlayer3, isJailPlayer1, isPlayer2Out, isPlayer3Out, isPlayer1Out);
			}
		});

		player2Mortgaging.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mortgaging(player2MortgageCards, player2Cards, player2ColorPairCardsList, player2ColorPairCardsHousesList, player2CardColors, player2HousesLabel, 2,
						player2CardsLabel, player2Mortgaging, player2Housing, player2Coins, isPlayer2Pay, player2ColorPairCards, player2PropertiesPanel);
			}
		});

		player2Deal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame dealFrame = new JFrame("Dealing");
				JPanel dealPanel = new JPanel();
				dealPanel.setLayout(null);
				dealFrame.add(dealPanel);
				dealFrame.setSize(250, 300);
				dealFrame.setVisible(true);
				
				JLabel setDealWithLabel = new JLabel("Set Deal With:");
				dealPanel.add(setDealWithLabel);
				setDealWithLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
				setDealWithLabel.setBounds(60, 50, 200, 30);
				
				JLabel useDealLabel = new JLabel("Use Deal Of:");
				dealPanel.add(useDealLabel);
				useDealLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
				useDealLabel.setBounds(65, 150, 200, 30);
				
				JButton dealWithPlayer1 = new JButton(player1);
				dealPanel.add(dealWithPlayer1);
				if (isPlayer1Pay == false) {
					enableButton(dealWithPlayer1);
				} else {
					disableButton(dealWithPlayer1);
				}
				dealWithPlayer1.setBounds(30, 100, 80, 30);
				
				JButton dealWithPlayer3 = new JButton(player3);
				dealPanel.add(dealWithPlayer3);
				if (isPlayer3Pay == false) {
					enableButton(dealWithPlayer3);
				} else {
					disableButton(dealWithPlayer3);
				}
				dealWithPlayer3.setBounds(120, 100, 80, 30);
				
				JButton useDealOfPlayer1 = new JButton(player1);
				dealPanel.add(useDealOfPlayer1);
				if (player2TotalDeals > 0 && isPlayer1Pay == true) {
					enableButton(useDealOfPlayer1);
				} else {
					disableButton(useDealOfPlayer1);
				}
				useDealOfPlayer1.setBounds(30, 200, 80, 30);
				
				JButton useDealOfPlayer3 = new JButton(player3);
				dealPanel.add(useDealOfPlayer3);
				if (player2TotalDeals > 0 && isPlayer3Pay == true) {
					enableButton(useDealOfPlayer3);
				} else {
					disableButton(useDealOfPlayer3);
				}
				useDealOfPlayer3.setBounds(120, 200, 80, 30);
				
				dealWithPlayer1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						showOrHideDealButtons(false, dealPanel, setDealWithLabel, useDealLabel, dealWithPlayer1, dealWithPlayer3,
								useDealOfPlayer1, useDealOfPlayer3);
						
						settingDeal(dealFrame, dealPanel, setDealWithLabel, useDealLabel, player2CardsLabel, player1CardsLabel, dealWithPlayer1, dealWithPlayer3, useDealOfPlayer1,
								useDealOfPlayer3, player2Cards, player1Cards, player2, player1, 2, 1, player2DealList, player1DealList, player2Deal, player2Pay, player2Location,
								player2PropertiesPanel, player1PropertiesPanel);
										
					}
				});
				
				dealWithPlayer3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						showOrHideDealButtons(false, dealPanel, setDealWithLabel, useDealLabel, dealWithPlayer1, dealWithPlayer3,
								useDealOfPlayer1, useDealOfPlayer3);
						
						settingDeal(dealFrame, dealPanel, setDealWithLabel, useDealLabel, player2CardsLabel, player3CardsLabel, dealWithPlayer3, dealWithPlayer1, useDealOfPlayer3,
								useDealOfPlayer1, player2Cards, player3Cards, player2, player3, 2, 3, player2DealList, player3DealList, player2Deal, player2Pay, player2Location,
								player2PropertiesPanel, player3PropertiesPanel);
					}
				});
				
				useDealOfPlayer1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						usingDeal(dealFrame, dealPanel, setDealWithLabel, useDealLabel, dealWithPlayer1, dealWithPlayer3,
								useDealOfPlayer1, useDealOfPlayer3, player2Location, 2, 1, player2DealList, player1, player2Pay, player2Deal);
					}
				});
				
				useDealOfPlayer3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						usingDeal(dealFrame, dealPanel, setDealWithLabel, useDealLabel, dealWithPlayer3, dealWithPlayer1,
								useDealOfPlayer3, useDealOfPlayer1, player2Location, 2, 3, player2DealList, player3, player2Pay, player2Deal);
					}
				});
			}
		});
		
		player2JailFreeCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disableButton(player2JailFreeCard);
				player2JailFree -= 1;
				isJailPlayer2 = false;
				isPlayer2Pay = false;
				boolean isFromChance = true;
				for (int i = 0; i < chances.size(); i++) {
					if (chances.get(i).equals("Get Out Of Jail Free")) {
						isFromChance = false;
						break;
					}
				}
				if (isFromChance == true) {
					chances.add("Get Out Of Jail Free");
				} else {
					communityChests.add("Get Out Of Jail Free");
				}
			}
		});
		
		player2GiveUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int response = JOptionPane.showConfirmDialog(monopolyFrame, "Are you sure you want to give up?", "Give Up Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (response == JOptionPane.YES_OPTION) {
					playersPlaying--;
					if (playersPlaying == 1) {
						gameOver();
					}
					isPlayer2Out = true;
					isPlayer2Turn = false;
					isPlayer2Buy = false;
					if (isPlayer2Pay == true) {
						playerPay(player2Location, 2, 3, 1, player2Coins, player3Coins, player1Coins,
								isPlayer2AtUtility, isPlayer2Pay, isPlayer3Pay, isPlayer1Pay, player2Pay, player3Pay, player1Pay,
								player3Utilities, player1Utilities, isJailPlayer2, isJailPlayer3, isJailPlayer1, isPlayer2Out, isPlayer3Out, isPlayer1Out);
					}
					isPlayer2Pay = false;
					isPlayer2AtUtility = false;
					if (isPlayer3Out == false) {
						isPlayer3Turn = true;
					} else {
						isPlayer1Turn = true;
					}
					if (player2JailFree > 0) {
						boolean isFromChance = true;
						for (int i = 0; i < chances.size(); i++) {
							if (chances.get(i).equals("Get Out Of Jail Free")) {
								isFromChance = false;
								break;
							}
						}
						if (isFromChance == true) {
							chances.add("Get Out Of Jail Free");
						} else {
							communityChests.add("Get Out Of Jail Free");
						}
					}
					isJailPlayer2 = false;
					player2JailFree = 0;
					player2Railroads = 0;
					player2Utilities = 0;
					player2ButtonsSp.setVisible(false);
					player2PropertiesSp.setVisible(false);
					monopolyDataPanel.remove(player2ButtonsSp);
					monopolyDataPanel.remove(player2PropertiesSp);
					player2CoinsLabel.hide();
					monopolyDataPanel.remove(player2CoinsLabel);
					player2Character.hide();
					monopolyDataPanel.remove(player2Character);
					player2PropertiesLabel.hide();
					monopolyDataPanel.remove(player2PropertiesLabel);
					hexagonLabel.hide();
					monopolyBoardPanel.remove(hexagonLabel);
					
					while (player2Cards.size() > 0) {
						propertiesNotBought.add(player1Cards.get(0));
						int cardPaymentPriceIndex = Arrays.asList(arr_places).indexOf(player2Cards.get(0));
						places_PaymentPrices[cardPaymentPriceIndex] = places_PaymentPrices2[cardPaymentPriceIndex];
						player2CardsLabel.get(0).hide();
						monopolyDataPanel.remove(player2CardsLabel.get(0));
						player2CardsLabel.remove(0);
						player2Cards.remove(0);
					}
					
					for (int i = 0; i < 8; i++) {
						player2ColorPairCards[i] = 0;
					}
					
					for (int i = 0; i < player2ColorPairCardsHousesList.size(); i++) {
						int cardHouses = player2ColorPairCardsHousesList.get(i);
						if (cardHouses > 0) {
							player2ColorPairCardsHousesList.remove(i);
							player2ColorPairCardsHousesList.add(i, 0);
							housePositioning(i, 2);
						}
					}
				}
			}
		});
		
		player3Buy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moneyData(prices_places[player3Location], 0, 3);
				player3CoinsLabel.setText("$" + player3Coins);
				player3Cards.add(arr_places[player3Location]);
				player3CardsLabel.add(new JLabel(arr_places[player3Location]));
				player3CardsLabel.get(player3Cards.size() - 1).setFont(new Font("Arial", Font.PLAIN, 12));
				player3PropertiesPanel.add(player3CardsLabel.get(player3Cards.size() - 1));
				player3CardsLabel.get(player3Cards.size() - 1).show();
				player3CardsLabel.get(player3Cards.size() - 1).setSize(140, 15);
				player3CardsLabel.get(player3CardsLabel.size()-1).setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
				propertiesNotBought.remove(arr_places[player3Location]);
				disableButton(player3Buy);
				disableButton(player3NotBuy);
				if (arr_places[player3Location].indexOf("Railroad") > 0) {
					player3Railroads += 1;
				} else if (arr_places[player3Location].equals("Electric Company") || arr_places[player3Location].equals("Water Works")) {
					player3Utilities += 1;
				}
				pairCards(3, cardColors[player3Location]);
				isPlayer3Buy = false;
			}
		});

		player3Housing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				housing(player3ColorPairCardsList, player3ColorPairCardsHousesList, player3CardColors, 3, player3Coins);
			}
		});

		player3NotBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (playersPlaying == 3) {
					bidding(player3Location, 3, 1, 2, player1, player2, player1Coins, player2Coins, player1Cards, player2Cards, player1CardsLabel,
							player2CardsLabel, player3Buy, player3NotBuy, player1CoinsLabel, player2CoinsLabel, player1PropertiesPanel, player2PropertiesPanel);
				} else {
					isPlayer3Buy = false;
					disableButton(player3Buy);
					disableButton(player3NotBuy);
				}
			}
		});

		player3Pay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playerPay(player3Location, 3, 1, 2, player3Coins, player1Coins, player2Coins,
						isPlayer3AtUtility, isPlayer3Pay, isPlayer1Pay, isPlayer2Pay, player3Pay, player1Pay, player2Pay,
						player1Utilities, player2Utilities, isJailPlayer3, isJailPlayer1, isJailPlayer2, isPlayer3Out, isPlayer1Out, isPlayer2Out);
			}
		});

		player3Mortgaging.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mortgaging(player3MortgageCards, player3Cards, player3ColorPairCardsList, player3ColorPairCardsHousesList, player3CardColors, player3HousesLabel, 3,
						player3CardsLabel, player3Mortgaging, player3Housing, player3Coins, isPlayer3Pay, player3ColorPairCards, player3PropertiesPanel);
			}
		});
	
		player3Deal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame dealFrame = new JFrame("Dealing");
				JPanel dealPanel = new JPanel();
				dealPanel.setLayout(null);
				dealFrame.add(dealPanel);
				dealFrame.setSize(250, 300);
				dealFrame.setVisible(true);
				
				JLabel setDealWithLabel = new JLabel("Set Deal With:");
				dealPanel.add(setDealWithLabel);
				setDealWithLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
				setDealWithLabel.setBounds(60, 50, 200, 30);
				
				JLabel useDealLabel = new JLabel("Use Deal Of:");
				dealPanel.add(useDealLabel);
				useDealLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
				useDealLabel.setBounds(65, 150, 200, 30);
				
				JButton dealWithPlayer1 = new JButton(player1);
				dealPanel.add(dealWithPlayer1);
				if (isPlayer1Pay == false) {
					enableButton(dealWithPlayer1);
				} else {
					disableButton(dealWithPlayer1);
				}
				dealWithPlayer1.setBounds(30, 100, 80, 30);
				
				JButton dealWithPlayer2 = new JButton(player2);
				dealPanel.add(dealWithPlayer2);
				if (isPlayer2Pay == false) {
					enableButton(dealWithPlayer2);
				} else {
					disableButton(dealWithPlayer2);
				}
				dealWithPlayer2.setBounds(120, 100, 80, 30);
				
				JButton useDealOfPlayer1 = new JButton(player1);
				dealPanel.add(useDealOfPlayer1);
				if (player3TotalDeals > 0 && isPlayer1Pay == true) {
					enableButton(useDealOfPlayer1);
				} else {
					disableButton(useDealOfPlayer1);
				}
				useDealOfPlayer1.setBounds(30, 200, 80, 30);
				
				JButton useDealOfPlayer2 = new JButton(player2);
				dealPanel.add(useDealOfPlayer2);
				if (player3TotalDeals > 0 && isPlayer2Pay == true) {
					enableButton(useDealOfPlayer2);
				} else {
					disableButton(useDealOfPlayer2);
				}
				useDealOfPlayer2.setBounds(120, 200, 80, 30);
				
				dealWithPlayer1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						showOrHideDealButtons(false, dealPanel, setDealWithLabel, useDealLabel, dealWithPlayer1, dealWithPlayer2,
								useDealOfPlayer1, useDealOfPlayer2);
						
						settingDeal(dealFrame, dealPanel, setDealWithLabel, useDealLabel, player3CardsLabel, player1CardsLabel, dealWithPlayer1, dealWithPlayer2, useDealOfPlayer1,
								useDealOfPlayer2, player3Cards, player1Cards, player3, player1, 3, 1, player3DealList, player1DealList, player3Deal, player3Pay, player3Location,
								player3PropertiesPanel, player1PropertiesPanel);
										
					}
				});
				
				dealWithPlayer2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						showOrHideDealButtons(false, dealPanel, setDealWithLabel, useDealLabel, dealWithPlayer1, dealWithPlayer2,
								useDealOfPlayer1, useDealOfPlayer2);
						
						settingDeal(dealFrame, dealPanel, setDealWithLabel, useDealLabel, player3CardsLabel, player2CardsLabel, dealWithPlayer2, dealWithPlayer1, useDealOfPlayer2,
								useDealOfPlayer1, player3Cards, player2Cards, player3, player2, 3, 2, player3DealList, player2DealList, player3Deal, player3Pay, player3Location,
								player3PropertiesPanel, player2PropertiesPanel);
					}
				});
				
				useDealOfPlayer1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						usingDeal(dealFrame, dealPanel, setDealWithLabel, useDealLabel, dealWithPlayer1, dealWithPlayer2,
								useDealOfPlayer1, useDealOfPlayer2, player3Location, 3, 1, player3DealList, player1, player3Pay, player3Deal);
					}
				});
				
				useDealOfPlayer2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						usingDeal(dealFrame, dealPanel, setDealWithLabel, useDealLabel, dealWithPlayer2, dealWithPlayer1,
								useDealOfPlayer2, useDealOfPlayer1, player3Location, 3, 2, player3DealList, player2, player3Pay, player3Deal);
					}
				});
			}
		});
		
		player3JailFreeCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disableButton(player3JailFreeCard);
				player3JailFree -= 1;
				isJailPlayer3 = false;
				isPlayer3Pay = false;
				boolean isFromChance = true;
				for (int i = 0; i < chances.size(); i++) {
					if (chances.get(i).equals("Get Out Of Jail Free")) {
						isFromChance = false;
						break;
					}
				}
				if (isFromChance == true) {
					chances.add("Get Out Of Jail Free");
				} else {
					communityChests.add("Get Out Of Jail Free");
				}
			}
		});
	
		player3GiveUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int response = JOptionPane.showConfirmDialog(monopolyFrame, "Are you sure you want to give up?", "Give Up Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (response == JOptionPane.YES_OPTION) {
					playersPlaying--;
					if (playersPlaying == 1) {
						gameOver();
					}
					isPlayer3Out = true;
					isPlayer3Turn = false;
					isPlayer3Buy = false;
					if (isPlayer3Pay == true) {
						playerPay(player3Location, 3, 1, 2, player3Coins, player1Coins, player2Coins,
								isPlayer3AtUtility, isPlayer3Pay, isPlayer1Pay, isPlayer2Pay, player3Pay, player1Pay, player2Pay,
								player1Utilities, player2Utilities, isJailPlayer3, isJailPlayer1, isJailPlayer2, isPlayer3Out, isPlayer1Out, isPlayer2Out);
					}
					isPlayer3Pay = false;
					isPlayer3AtUtility = false;
					if (isPlayer1Out == false) {
						isPlayer1Turn = true;
					} else {
						isPlayer2Turn = true;
					}
					if (player3JailFree > 0) {
						boolean isFromChance = true;
						for (int i = 0; i < chances.size(); i++) {
							if (chances.get(i).equals("Get Out Of Jail Free")) {
								isFromChance = false;
								break;
							}
						}
						if (isFromChance == true) {
							chances.add("Get Out Of Jail Free");
						} else {
							communityChests.add("Get Out Of Jail Free");
						}
					}
					isJailPlayer3 = false;
					player3JailFree = 0;
					player3Railroads = 0;
					player3Utilities = 0;
					player3ButtonsSp.setVisible(false);
					player3PropertiesSp.setVisible(false);
					monopolyDataPanel.remove(player3ButtonsSp);
					monopolyDataPanel.remove(player3PropertiesSp);
					player3CoinsLabel.hide();
					monopolyDataPanel.remove(player3CoinsLabel);
					player3Character.hide();
					monopolyDataPanel.remove(player3Character);
					player3PropertiesLabel.hide();
					monopolyDataPanel.remove(player3PropertiesLabel);
					starLabel.hide();
					monopolyBoardPanel.remove(starLabel);
					
					while (player3Cards.size() > 0) {
						propertiesNotBought.add(player3Cards.get(0));
						int cardPaymentPriceIndex = Arrays.asList(arr_places).indexOf(player3Cards.get(0));
						places_PaymentPrices[cardPaymentPriceIndex] = places_PaymentPrices2[cardPaymentPriceIndex];
						player3CardsLabel.get(0).hide();
						monopolyDataPanel.remove(player3CardsLabel.get(0));
						player3CardsLabel.remove(0);
						player3Cards.remove(0);
					}
					
					for (int i = 0; i < 8; i++) {
						player3ColorPairCards[i] = 0;
					}
					
					for (int i = 0; i < player3ColorPairCardsHousesList.size(); i++) {
						int cardHouses = player3ColorPairCardsHousesList.get(i);
						if (cardHouses > 0) {
							player3ColorPairCardsHousesList.remove(i);
							player3ColorPairCardsHousesList.add(i, 0);
							housePositioning(i, 3);
						}
					}
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

	public int getRailroadPayment(int whoEarned) {
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
	
	public void housePositioning(int index, int whichPlayer) {
		
		switch (whichPlayer) {
			case 1:
				player1HousesLabel.get(index).setText("Houses: " + player1ColorPairCardsHousesList.get(index));
				if (player1ColorPairCardsHousesList.get(index) == 1) {
					player1HousesLabel.get(index).setForeground(new Color(0, 77, 0));
					player1HousesLabel.get(index).setFont(new Font("Times New Roman", Font.BOLD, 14));
					monopolyBoardPanel.add(player1HousesLabel.get(index));
					player1HousesLabel.get(index).show();
				} else if (player1ColorPairCardsHousesList.get(index) == 0) {
					player1HousesLabel.get(index).hide();
					monopolyBoardPanel.remove(player1HousesLabel.get(index));
				} else if (player1ColorPairCardsHousesList.get(index) == 5) {
					player1HousesLabel.get(index).setText("Hotel");
					player1HousesLabel.get(index).setForeground(Color.RED);
				} else if (player1ColorPairCardsHousesList.get(index) == 4) {
					player1HousesLabel.get(index).setForeground(new Color(0, 128, 0));
				}
				break;
			case 2:
				player2HousesLabel.get(index).setText("Houses: " + player2ColorPairCardsHousesList.get(index));
				if (player2ColorPairCardsHousesList.get(index) == 1) {
					player2HousesLabel.get(index).setForeground(new Color(0, 77, 0));
					player2HousesLabel.get(index).setFont(new Font("Times New Roman", Font.BOLD, 14));
					monopolyBoardPanel.add(player2HousesLabel.get(index));
					player2HousesLabel.get(index).show();
				} else if (player2ColorPairCardsHousesList.get(index) == 0) {
					player2HousesLabel.get(index).hide();
					monopolyBoardPanel.remove(player2HousesLabel.get(index));
				} else if (player2ColorPairCardsHousesList.get(index) == 5) {
					player2HousesLabel.get(index).setText("Hotel");
					player2HousesLabel.get(index).setForeground(Color.RED);
				} else if (player2ColorPairCardsHousesList.get(index) == 4) {
					player2HousesLabel.get(index).setForeground(new Color(0, 128, 0));
				}
				break;
			case 3:
				player3HousesLabel.get(index).setText("Houses: " + player3ColorPairCardsHousesList.get(index));
				if (player3ColorPairCardsHousesList.get(index) == 1) {
					player3HousesLabel.get(index).setForeground(new Color(0, 77, 0));
					player3HousesLabel.get(index).setFont(new Font("Times New Roman", Font.BOLD, 14));
					monopolyBoardPanel.add(player3HousesLabel.get(index));
					player3HousesLabel.get(index).show();
				} else if (player3ColorPairCardsHousesList.get(index) == 0) {
					player3HousesLabel.get(index).hide();
					monopolyBoardPanel.remove(player3HousesLabel.get(index));
				} else if (player3ColorPairCardsHousesList.get(index) == 5) {
					player3HousesLabel.get(index).setText("Hotel");
					player3HousesLabel.get(index).setForeground(Color.RED);
				} else if (player3ColorPairCardsHousesList.get(index) == 4) {
					player3HousesLabel.get(index).setForeground(new Color(0, 128, 0));
				}
				break;
		}
		
		int x = 0;
		int y = 35;
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
			y = 25;
		} else {
			j = 30;
			x = 1125;
		}
		
		for (int i = j; i < cardLocation; i++) {
			if (cardLocation < 10) {
				if (i == 0) {
					x = 1004;
				} else if (i == 4) {
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
			} else if (i >= 20 && i < 30) {
				if (i == 20) {
					x = 171;
				} else if (i == 24) {
					x += 112;
				} else if (i == 25) {
					x += 109;
				} else {
					x += 102;
				}
			} else {
				if (i == 30) {
					y = 223;
				} else if (i == 34 || i == 35) {
					y += 110;
				} else {
					y += 102;
				}
			}
		}
		
		switch (whichPlayer) {
			case 1:
				if (player1ColorPairCardsHousesList.get(index) == 5) {
					player1HousesLabel.get(index).setBounds(x + 12, y, 100, 30);
				} else {
					player1HousesLabel.get(index).setBounds(x, y, 100, 30);
				}
				break;
			case 2:
				if (player2ColorPairCardsHousesList.get(index) == 5) { 
					player2HousesLabel.get(index).setBounds(x + 12, y, 100, 30);
				} else {
					player2HousesLabel.get(index).setBounds(x, y, 100, 30);
				}
				break;
			case 3:
				if (player2ColorPairCardsHousesList.get(index) == 5) { 
					player3HousesLabel.get(index).setBounds(x + 12, y, 100, 30);
				} else {
					player3HousesLabel.get(index).setBounds(x, y, 100, 30);
				}
				break;
		}
	}	
	
	public void moneyData(int howMuch, int playerEarned, int playerPaid) {
		switch (playerEarned) {
			case 1:
				player1Coins += howMuch;
				break;
			case 2:
				player2Coins += howMuch;
				break;
			case 3:
				player3Coins += howMuch;
				break;
		}
		
		switch (playerPaid) {
			case 1:
				if (isPlayer1Out == false) {
					player1Coins -= howMuch;
				}
				break;
			case 2:
				if (isPlayer2Out == false) {
					player2Coins -= howMuch;
				}
				break;
			case 3:
				if (isPlayer3Out == false) {
					player3Coins -= howMuch;
				}
				break;
		}
		
		if (isPlayer1Out == false) {
			player1CoinsLabel.setText("$" + player1Coins);
		}
		if (isPlayer2Out == false) {
			player2CoinsLabel.setText("$" + player2Coins);
		}
		if (isPlayer3Out == false) {
			player3CoinsLabel.setText("$" + player3Coins);
		}
	}

	public void pairCards(int whichPlayer, String cardColor) {
		switch (whichPlayer) {
			case 1:
				switch(cardColor) {
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
				break;
			case 2:
				switch(cardColor) {
					case "purple":
						player2ColorPairCards[0] += 1;
						if (player2ColorPairCards[0] == 2) {
							player2ColorPairCardsList.add("Baltic Ave.");
							player2ColorPairCardsList.add("Mediterranean Ave.");
							for (int i = 0; i < 2; i++) {
								player2ColorPairCardsHousesList.add(0);
								player2CardColors.add("purple");
								player2HousesLabel.add(new JLabel(""));
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
								player2HousesLabel.add(new JLabel(""));
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
								player2HousesLabel.add(new JLabel(""));
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
								player2HousesLabel.add(new JLabel(""));
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
								player2HousesLabel.add(new JLabel(""));
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
								player2HousesLabel.add(new JLabel(""));
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
								player2HousesLabel.add(new JLabel(""));
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
								player2HousesLabel.add(new JLabel(""));
							}
							doubleRentPayment("darkblue");
						}
						break;
				}
				break;
			case 3:
				switch(cardColor) {
					case "purple":
						player3ColorPairCards[0] += 1;
						if (player3ColorPairCards[0] == 2) {
							player3ColorPairCardsList.add("Baltic Ave.");
							player3ColorPairCardsList.add("Mediterranean Ave.");
							for (int i = 0; i < 2; i++) {
								player3ColorPairCardsHousesList.add(0);
								player3CardColors.add("purple");
								player3HousesLabel.add(new JLabel(""));
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
								player3HousesLabel.add(new JLabel(""));
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
								player3HousesLabel.add(new JLabel(""));
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
								player3HousesLabel.add(new JLabel(""));
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
								player3HousesLabel.add(new JLabel(""));
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
								player3HousesLabel.add(new JLabel(""));
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
								player3HousesLabel.add(new JLabel(""));
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
								player3HousesLabel.add(new JLabel(""));
							}
							doubleRentPayment("darkblue");
						}
						break;
				}
				break;
		}
	}	
	
	public void pairOrUnpairCards(int playerGaveCard, int playerRecievedCard, String cardColor) {
		int i = 0;
		switch (playerGaveCard) {
			case 1:
				while (i < player1ColorPairCardsList.size()) {
					if (player1CardColors.get(i).equals(cardColor)) {
						player1ColorPairCardsList.remove(i);
						player1CardColors.remove(i);
						int returnHouseCost = getHouseCost(cardColor) * player1ColorPairCardsHousesList.get(i);
						moneyData(returnHouseCost, 1, 0);
						player1ColorPairCardsHousesList.remove(i);
						player1HousesLabel.get(i).hide();
						monopolyBoardPanel.remove(player1HousesLabel.get(i));
						player1HousesLabel.remove(i);
					} else {
						i++;
					}
					for (int j = 0; j < coloredCardsName.length; j++) {
						if (coloredCardsName[j].equals(cardColor)) {
							player1ColorPairCards[j] -= 1;
						}
					}
				}
				break;
			case 2:
				while (i < player2ColorPairCardsList.size()) {
					if (player2CardColors.get(i).equals(cardColor)) {
						player2ColorPairCardsList.remove(i);
						player2CardColors.remove(i);
						int returnHouseCost = getHouseCost(cardColor) * player2ColorPairCardsHousesList.get(i);
						moneyData(returnHouseCost, 2, 0);
						player2ColorPairCardsHousesList.remove(i);
						player2HousesLabel.get(i).hide();
						monopolyBoardPanel.remove(player2HousesLabel.get(i));
						player2HousesLabel.remove(i);
					} else {
						i++;
					}
					for (int j = 0; j < coloredCardsName.length; j++) {
						if (coloredCardsName[j].equals(cardColor)) {
							player2ColorPairCards[j] -= 1;
						}
					}
				}
				break;
			case 3:
				while (i < player3ColorPairCardsList.size()) {
					if (player3CardColors.get(i).equals(cardColor)) {
						player3ColorPairCardsList.remove(i);
						player3CardColors.remove(i);
						player3HousesLabel.get(i).hide();
						int returnHouseCost = getHouseCost(cardColor) * player3ColorPairCardsHousesList.get(i);
						moneyData(returnHouseCost, 3, 0);
						player3ColorPairCardsHousesList.remove(i);
						monopolyBoardPanel.remove(player3HousesLabel.get(i));
						player3HousesLabel.remove(i);
					} else {
						i++;
					}
					for (int j = 0; j < coloredCardsName.length; j++) {
						if (coloredCardsName[j].equals(cardColor)) {
							player3ColorPairCards[j] -= 1;
						}
					}
				}
				break;
		}
		
		switch (playerRecievedCard) {
			case 1:
				pairCards(1, cardColor);
				break;
			case 2:
				pairCards(2, cardColor);
				break;
			case 3:
				pairCards(3, cardColor);
				break;
		}
	}

	public int getHouseCost(String cardColor) {
		int getTotalHouseCost = 0;
		if (cardColor.equals("purple") || cardColor.equals("lightblue")) {
			getTotalHouseCost = 50;
		} else if (cardColor.equals("pink") || cardColor.equals("orange")) {
			getTotalHouseCost = 100;
		} else if (cardColor.equals("red") || cardColor.equals("yellow")) {
			getTotalHouseCost = 150;
		} else if (cardColor.equals("green") || cardColor.equals("darkblue")) {
			getTotalHouseCost = 200;
		}
		return getTotalHouseCost;
	}

	public void usingDeals(int player) {
		switch (player) {
			case 1:
				places_PaymentPrices[player1Location] = cardRegularPrice;
				break;
			case 2:
				places_PaymentPrices[player2Location] = cardRegularPrice;
				break;
			case 3:
				places_PaymentPrices[player3Location] = cardRegularPrice;
				break;
		}
		isDeal = false;
		cardRegularPrice = 0;
	}

	public void settingDeal(JFrame dealFrame, JPanel dealPanel, JLabel setDealWithLabel, JLabel useDealLabel, ArrayList<JLabel> firstPlayerCardsLabel, ArrayList<JLabel> secondPlayerCardsLabel,
			JButton dealWithFirstPlayer, JButton dealWithSecondPlayer, JButton useDealWithFirstPlayer, JButton useDealWithSecondPlayer, ArrayList<String> firstPlayerCards,
			ArrayList<String> secondPlayerCards, String firstPlayerName, String secondPlayerName, int whichPlayer1, int whichPlayer2, ArrayList<String> firstPlayerDeals, 
			ArrayList<String> secondPlayerDeals, JButton playerUsingDeal, JButton playerPaying, int playerLocation, JPanel firstPlayerPropertiesPanel, JPanel secondPlayerPropertiesPanel) {
		
		JButton[] dealButtons = new JButton[dealOptions.length];
		int y = 45;
		for (int i = 0; i < dealOptions.length; i++) {
			dealButtons[i] = new JButton(dealOptions[i]);
			dealPanel.add(dealButtons[i]);
			enableButton(dealButtons[i]);
			dealButtons[i].setBackground(new Color(217, 217, 217));
			dealButtons[i].setForeground(Color.DARK_GRAY);
			dealButtons[i].setBounds(15, y, 200, 25);
			y += 30;
		}
		
		int i = 0;
		while (i < dealButtons.length) {
			int j = i;
			dealButtons[i].addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					dealButtons[j].setBackground(Color.DARK_GRAY);
					dealButtons[j].setForeground(Color.WHITE);
				}
				public void mouseExited(MouseEvent e) {
					dealButtons[j].setBackground(new Color(217, 217, 217));
					dealButtons[j].setForeground(Color.DARK_GRAY);
				}
			});
			i++;
		}
		
		int k = 0;
		while (k < dealButtons.length) {
			int j = k;
			dealButtons[k].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (dealOptions[j].equals("Exchange Cards")) {
						for (int i = 0; i < dealButtons.length; i++) {
							dealButtons[i].hide();
							dealPanel.remove(dealButtons[i]);
						}
						
						dealFrame.setSize(300, 500);
						
						JLabel player1ExchangedCardsLabel = new JLabel(firstPlayerName + " Cards");
						dealPanel.add(player1ExchangedCardsLabel);
						player1ExchangedCardsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
						player1ExchangedCardsLabel.setBounds(20, 10, 150, 30);
						
						JLabel player2ExchangedCardsLabel = new JLabel(secondPlayerName + " Cards");
						dealPanel.add(player2ExchangedCardsLabel);
						player2ExchangedCardsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
						player2ExchangedCardsLabel.setBounds(175, 10, 150, 30);
						
						JButton finalExchange = new JButton("Exchange");
						dealPanel.add(finalExchange);
						finalExchange.show();
						disableButton(finalExchange);
						finalExchange.setBounds(85, dealFrame.getHeight() - 75, 100, 30);
						
						JButton player1Confirm = new JButton("Confirm");
						dealPanel.add(player1Confirm);
						player1Confirm.show();
						disableButton(player1Confirm);
						player1Confirm.setBounds(20, dealFrame.getHeight() - 110, 80, 30);
						
						JButton player2Confirm = new JButton("Confirm");
						dealPanel.add(player2Confirm);
						player2Confirm.show();
						disableButton(player2Confirm);
						player2Confirm.setBounds(170, dealFrame.getHeight() - 110, 80, 30);
						
						JButton[] player1CardsButtons = new JButton[firstPlayerCards.size()];
						JButton[] player2CardsButtons = new JButton[secondPlayerCards.size()];
						ArrayList<Integer> player1Index_ExchangedCards = new ArrayList<Integer>();
						ArrayList<Integer> player2Index_ExchangedCards = new ArrayList<Integer>();
						
						int y = 40;
						
						for (int i = 0; i < firstPlayerCards.size(); i++) {
							player1CardsButtons[i] = new JButton(firstPlayerCards.get(i));
							dealPanel.add(player1CardsButtons[i]);
							player1CardsButtons[i].show();
							enableButton(player1CardsButtons[i]);
							player1CardsButtons[i].setBounds(10, y, 100, 25);
							y += 30;
						}
						y = 40;
						for (int i = 0; i < secondPlayerCards.size(); i++) {
							player2CardsButtons[i] = new JButton(secondPlayerCards.get(i));
							dealPanel.add(player2CardsButtons[i]);
							player2CardsButtons[i].show();
							disableButton(player2CardsButtons[i]);
							player2CardsButtons[i].setBounds(165, y, 100, 25);
							y += 30;
						}
						
						int i = 0;
						while (i < firstPlayerCards.size()) {
							int j = i;
							player1CardsButtons[i].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									player1Index_ExchangedCards.add(j);
									disableButton(player1CardsButtons[j]);
									enableButton(player1Confirm);
								}
							});
							i++;
						}
						
						int k = 0;
						while (k < secondPlayerCards.size()) {
							int j = k;
							player2CardsButtons[k].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									player2Index_ExchangedCards.add(j);
									disableButton(player2CardsButtons[j]);
									enableButton(player2Confirm);
								}
							});
							k++;
						}
						
						player1Confirm.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								for (int i = 0; i < player1CardsButtons.length; i++) {
									disableButton(player1CardsButtons[i]);
								}
								for (int i = 0; i < player2CardsButtons.length; i++) {
									enableButton(player2CardsButtons[i]);
								}
								disableButton(player1Confirm);
							}
						});
						
						player2Confirm.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								for (int i = 0; i < player2CardsButtons.length; i++) {
									disableButton(player2CardsButtons[i]);
								}
								disableButton(player2Confirm);
								enableButton(finalExchange);
							}
						});
						
						finalExchange.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								for (int k = player1Index_ExchangedCards.size() - 1; k >= 0; k--) {
									secondPlayerCards.add(firstPlayerCards.get(player1Index_ExchangedCards.get(k)));
									secondPlayerCardsLabel.add(new JLabel(secondPlayerCards.get(secondPlayerCards.size()-1)));
									secondPlayerPropertiesPanel.add(secondPlayerCardsLabel.get(secondPlayerCardsLabel.size()-1));
									secondPlayerCardsLabel.get(secondPlayerCardsLabel.size()-1).show();
									int exchangedCardLocation = 0;
									for (int i = 0; i < arr_places.length; i++) {
										if (arr_places[i].equals(firstPlayerCards.get(player1Index_ExchangedCards.get(k)))) {
											exchangedCardLocation = i;
										}
									}
									firstPlayerCards.remove(firstPlayerCards.get(player1Index_ExchangedCards.get(k)));
									firstPlayerCardsLabel.get(firstPlayerCardsLabel.size()-1).hide();
									firstPlayerPropertiesPanel.remove(firstPlayerCardsLabel.get(firstPlayerCardsLabel.size()-1));
									pairOrUnpairCards(whichPlayer1, whichPlayer2, cardColors[exchangedCardLocation]);
									player1Index_ExchangedCards.remove(k);
								}
								for (int k = player2Index_ExchangedCards.size() - 1; k >= 0; k--) {
									firstPlayerCards.add(secondPlayerCards.get(player2Index_ExchangedCards.get(k)));
									firstPlayerCardsLabel.add(new JLabel(firstPlayerCards.get(firstPlayerCards.size()-1)));
									firstPlayerPropertiesPanel.add(firstPlayerCardsLabel.get(firstPlayerCardsLabel.size()-1));
									firstPlayerCardsLabel.get(firstPlayerCardsLabel.size()-1).show();
									int exchangedCardLocation = 0;
									for (int i = 0; i < arr_places.length; i++) {
										if (arr_places[i].equals(secondPlayerCards.get(player2Index_ExchangedCards.get(k)))) {
											exchangedCardLocation = i;
										}
									}
									secondPlayerCards.remove(secondPlayerCards.get(player2Index_ExchangedCards.get(k)));
									secondPlayerCardsLabel.get(secondPlayerCardsLabel.size()-1).hide();
									secondPlayerPropertiesPanel.remove(secondPlayerCardsLabel.get(secondPlayerCardsLabel.size()-1));
									pairOrUnpairCards(whichPlayer2, whichPlayer1, cardColors[exchangedCardLocation]);
									player2Index_ExchangedCards.remove(k);
								}
								
								dealFrame.dispose();
							}
						});
						
					} else {
						firstPlayerDeals.add(secondPlayerName + " " + dealOptions[j]);
						secondPlayerDeals.add(firstPlayerName + " " + dealOptions[j]);
						switch (whichPlayer1) {
							case 1:
								player1TotalDeals += 1;
								break;
							case 2:
								player2TotalDeals += 1;
								break;
							case 3:
								player3TotalDeals += 1;
								break;
						}
						switch (whichPlayer2) {
							case 1:
								player1TotalDeals += 1;
								break;
							case 2:
								player2TotalDeals += 1;
								break;
							case 3:
								player3TotalDeals += 1;
								break;
						}
						for (int i = 0; i < dealButtons.length; i++) {
							dealButtons[i].hide();
							dealPanel.remove(dealButtons[i]);
						}
						showOrHideDealButtons(true, dealPanel, setDealWithLabel, useDealLabel, dealWithFirstPlayer, dealWithSecondPlayer,
								useDealWithFirstPlayer, useDealWithSecondPlayer);
					}
				}
			});
			k++;
		}
	}

	public void usingDeal(JFrame dealFrame, JPanel dealPanel, JLabel setDealWithLabel, JLabel useDealLabel, JButton dealWithFirstPlayer, JButton dealWithSecondPlayer,
			JButton useDealWithFirstPlayer, JButton useDealWithSecondPlayer, int playerLocation, int whichPlayer1, int whichPlayer2, ArrayList<String> firstPlayerDeals,
			String secondPlayerName, JButton playerPaying, JButton playerUsingDeal) {
		
		dealFrame.setSize(290, 500);
		int y = 50;
		ArrayList<String> partnerDeals = new ArrayList<String>();
		for (int i = 0; i < firstPlayerDeals.size(); i++) {
			if (firstPlayerDeals.get(i).indexOf(secondPlayerName) >= 0) {
				partnerDeals.add(firstPlayerDeals.get(i));
			}
		}
		JButton[] player1Deals = new JButton[partnerDeals.size()];
		for (int i = 0; i < partnerDeals.size(); i++) {
			String dealName = partnerDeals.get(i);
			String sub_DealName = dealName.substring(secondPlayerName.length() + 1);
			player1Deals[i] = new JButton(sub_DealName);
			dealPanel.add(player1Deals[i]);
			player1Deals[i].show();
			enableButton(player1Deals[i]);
			player1Deals[i].setBounds(30, y, 200, 25);
			y += 30;
		}
		
		int i = 0;
		while (i < player1Deals.length) {
			int j = i;
			player1Deals[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					isDeal = true;
					String dealName = secondPlayerName + firstPlayerDeals.get(j);
					if (dealName.indexOf("Forgive House Payments For Both") >= 0) {
						switch (whichPlayer1) {
							case 1:
								isPlayer1Pay = false;
								break;
							case 2:
								isPlayer2Pay = false;
								break;
							case 3:
								isPlayer3Pay = false;
								break;
						}
						switch (whichPlayer2) {
							case 1:
								isPlayer1Pay = false;
								break;
							case 2:
								isPlayer2Pay = false;
								break;
							case 3:
								isPlayer3Pay = false;
								break;
						}
						disableButton(playerPaying);
					} else if (dealName.indexOf("30% Of House Payments For Both") >= 0) {
						cardRegularPrice = places_PaymentPrices[playerLocation];
						places_PaymentPrices[playerLocation] *= (int) .30;
					} else if (dealName.indexOf("50% Of House Payments For Both") >= 0) {
						cardRegularPrice = places_PaymentPrices[playerLocation];
						places_PaymentPrices[playerLocation] /= 2;
					} else if (dealName.indexOf("75% Of House Payments For Both") >= 0) {
						cardRegularPrice = places_PaymentPrices[playerLocation];
						places_PaymentPrices[playerLocation] *= (int) .75;
					}
					
					firstPlayerDeals.remove(j);
					switch (whichPlayer1) {
						case 1:
							player1TotalDeals--;
							break;
						case 2:
							player2TotalDeals--;
							break;
						case 3:
							player3TotalDeals--;
							break;
					}
					dealFrame.dispose();
					disableButton(playerUsingDeal);
				}
			});
			i++;
		}
	}

	public void showOrHideDealButtons(boolean show, JPanel dealPanel, JLabel setDealWithLabel, JLabel useDealLabel, JButton dealWithPlayer1, JButton dealWithPlayer2,
			JButton useDealOfPlayer1, JButton useDealOfPlayer2) {
		if (show == true) {
			dealPanel.add(setDealWithLabel);
			dealPanel.add(useDealLabel);
			dealPanel.add(dealWithPlayer1);
			dealPanel.add(dealWithPlayer2);
			dealPanel.add(useDealOfPlayer1);
			dealPanel.add(useDealOfPlayer2);
			setDealWithLabel.show();
			useDealLabel.show();
			dealWithPlayer1.show();
			dealWithPlayer2.show();
			useDealOfPlayer1.show();
			useDealOfPlayer2.show();
		} else {
			dealWithPlayer1.hide();
			dealWithPlayer2.hide();
			useDealOfPlayer1.hide();
			useDealOfPlayer2.hide();
			setDealWithLabel.hide();
			dealPanel.remove(useDealLabel);
			dealPanel.remove(setDealWithLabel);
			dealPanel.remove(useDealLabel);
			dealPanel.remove(dealWithPlayer1);
			dealPanel.remove(dealWithPlayer2);
			dealPanel.remove(useDealOfPlayer1);
			dealPanel.remove(useDealOfPlayer2);
		}
	}

	public void housing(ArrayList<String> playerColorPairCardsList, ArrayList<Integer> playerColorPairCardsHousesList, ArrayList<String> playerCardColors,
			int playerHousing, int playerCoins) {
		JFrame housingFrame = new JFrame("Housing");
		JPanel housingPanel = new JPanel();
		housingPanel.setLayout(null);
		housingFrame.add(housingPanel);
		housingFrame.setSize(180, 400);
		housingFrame.setVisible(true);
		
		JButton[] colorPairCards = new JButton[playerColorPairCardsList.size()];
		int y = 15;
		for (int i = 0; i < playerColorPairCardsList.size(); i++) {
			colorPairCards[i] = new JButton(playerColorPairCardsList.get(i));
			housingPanel.add(colorPairCards[i]);
			enableButton(colorPairCards[i]);
			colorPairCards[i].setForeground(Color.BLACK);
			coloredCardButtons(colorPairCards[i], playerCardColors.get(i));
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
					
					JLabel coinsLabel = new JLabel("$" + playerCoins);
					housingPanel.add(coinsLabel);
					coinsLabel.show();
					coinsLabel.setBounds(125, 2, 100, 30);
					coinsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
					
					JLabel houseCountLabel = new JLabel("Houses: " + playerColorPairCardsHousesList.get(j));
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
					
					String cardColor = "";
					boolean canBuyHouse = true;
					boolean canSellHouse = false;
					
					for (int i = 0; i < arr_places.length; i++) {
						if (arr_places[i].equals(playerColorPairCardsList.get(j))) {
							cardLocation = i;
							cardColor = cardColors[i];
						}
					}
					
					JLabel cardPaymentPriceLabel = new JLabel("Current Payment Price: $" + places_PaymentPrices[cardLocation]);
					housingPanel.add(cardPaymentPriceLabel);
					cardPaymentPriceLabel.show();
					cardPaymentPriceLabel.setBounds(60, 30, 200, 30);
					cardPaymentPriceLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
					
					ArrayList<Integer> colorPairCardsHouses = new ArrayList<Integer>();
					for (int i = 0; i < playerColorPairCardsList.size(); i++) {
						if (playerCardColors.get(i).equals(cardColor) && i != j) {
							colorPairCardsHouses.add(playerColorPairCardsHousesList.get(i));
						}
					}
					
					for (int i = 0; i < colorPairCardsHouses.size(); i++) {
						if (playerColorPairCardsHousesList.get(j) > colorPairCardsHouses.get(i)) {
							canBuyHouse = false;
						}
						if (playerColorPairCardsHousesList.get(j) >= colorPairCardsHouses.get(i)) {
							canSellHouse = true;
						}
					}
					
					houseCost = getHouseCost(cardColor);
					
					if (playerCoins >= houseCost && playerColorPairCardsHousesList.get(j) < 5 && canBuyHouse == true) {
						enableButton(buyHouse);
					} else {
						disableButton(buyHouse);
					}
					
					if (playerColorPairCardsHousesList.get(j) > 0 && canSellHouse == true) {
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
							moneyData(houseCost, 0, playerHousing);
							int previousHouses = playerColorPairCardsHousesList.get(j);
							playerColorPairCardsHousesList.remove(j);
							playerColorPairCardsHousesList.add(j, previousHouses + 1);
							if (playerColorPairCardsHousesList.get(j) == 5) {
								switch (playerHousing) {
									case 1:
										player1TotalHouses -= 4;
										player1TotalHotels += 1;
										break;
									case 2:
										player2TotalHouses -= 4;
										player2TotalHotels += 1;
										break;
									case 3:
										player3TotalHouses -= 4;
										player3TotalHotels += 1;
										break;
								}
							} else {
								switch (playerHousing) {
									case 1:
										player1TotalHouses += 1;
										break;
									case 2:
										player2TotalHouses += 1;
										break;
									case 3:
										player3TotalHouses += 1;
										break;
								}
							}
							switch (playerHousing) {
								case 1:
									coinsLabel.setText("$" + player1Coins);
									break;
								case 2:
									coinsLabel.setText("$" + player2Coins);
									break;
								case 3:
									coinsLabel.setText("$" + player3Coins);
									break;
							}
							houseCountLabel.setText("Houses: " + playerColorPairCardsHousesList.get(j));
							housePositioning(j, playerHousing);
							monopolyBoardPanel.add(monopolyBoard);
							monopolyBoard.show();
							
							switch (playerColorPairCardsHousesList.get(j)) {
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
								if (playerColorPairCardsHousesList.get(j) > colorPairCardsHouses.get(i) || playerColorPairCardsHousesList.get(j) == 5 || playerCoins < houseCost) {
									disableButton(buyHouse);
								} else if (playerCoins >= houseCost && playerColorPairCardsHousesList.get(j) < colorPairCardsHouses.get(i)) {
									enableButton(buyHouse);
								}
								if (playerColorPairCardsHousesList.get(j) < colorPairCardsHouses.get(i) || playerColorPairCardsHousesList.get(j) == 0) {
									disableButton(sellHouse);
								} else if (playerColorPairCardsHousesList.get(j) > 0 && playerColorPairCardsHousesList.get(j) >= colorPairCardsHouses.get(i)) {
									enableButton(sellHouse);
								}
							}
						}
					});
					
					sellHouse.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							monopolyBoard.hide();
							monopolyBoardPanel.remove(monopolyBoard);
							moneyData(houseCost, playerHousing, 0);
							int previousHouses = playerColorPairCardsHousesList.get(j);
							playerColorPairCardsHousesList.remove(j);
							playerColorPairCardsHousesList.add(j, previousHouses - 1);
							if (playerColorPairCardsHousesList.get(j) == 4) {
								switch (playerHousing) {
									case 1:
										player1TotalHotels -= 1;
										player1TotalHouses += 4;
										break;
									case 2:
										player2TotalHotels -= 1;
										player2TotalHouses += 4;
										break;
									case 3:
										player3TotalHotels -= 1;
										player3TotalHouses += 4;
										break;
								}
							} else {
								switch (playerHousing) {
									case 1:
										player1TotalHouses -= 1;
										break;
									case 2:
										player2TotalHouses -= 1;
										break;
									case 3:
										player3TotalHouses -= 1;
										break;
								}
							}
							switch (playerHousing) {
								case 1:
									coinsLabel.setText("$" + player1Coins);
									break;
								case 2:
									coinsLabel.setText("$" + player2Coins);
									break;
								case 3:
									coinsLabel.setText("$" + player3Coins);
									break;
							}
							houseCountLabel.setText("Houses: " + playerColorPairCardsHousesList.get(j));
							housePositioning(j, playerHousing);
							monopolyBoardPanel.add(monopolyBoard);
							monopolyBoard.show();
							
							switch (playerColorPairCardsHousesList.get(j)) {
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
							cardPaymentPriceLabel.setText("Current Payment Price: $" + places_PaymentPrices[cardLocation]);
							for (int i = 0; i < colorPairCardsHouses.size(); i++) {
								if (playerColorPairCardsHousesList.get(j) < colorPairCardsHouses.get(i) || playerColorPairCardsHousesList.get(j) == 0) {
									disableButton(sellHouse);
								} else if (playerColorPairCardsHousesList.get(j) > 0 && playerColorPairCardsHousesList.get(j) >= colorPairCardsHouses.get(i)) {
									enableButton(sellHouse);
								}
								if (playerColorPairCardsHousesList.get(j) > colorPairCardsHouses.get(i) || playerColorPairCardsHousesList.get(j) == 5 || playerCoins < houseCost) {
									disableButton(buyHouse);
								} else if (playerCoins >= houseCost && playerColorPairCardsHousesList.get(j) <= colorPairCardsHouses.get(i)) {
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
							for (int i = 0; i < playerColorPairCardsList.size(); i++) {
								housingPanel.add(colorPairCards[i]);
								colorPairCards[i].show();
								enableButton(colorPairCards[i]);
								colorPairCards[i].setForeground(Color.BLACK);
								coloredCardButtons(colorPairCards[i], playerCardColors.get(i));
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

	public void mortgaging(ArrayList<String> playerMortgageCards, ArrayList<String> playerCards, ArrayList<String> playerColorPairCardsList,
			ArrayList<Integer> playerColorPairCardsHousesList, ArrayList<String> playerCardColors, ArrayList<JLabel> playerHousesLabel, int playerMortgaging,
			ArrayList<JLabel> playerCardsLabel, JButton playerMortgage, JButton playerHousing, int playerCoins, boolean isPlayerPay, int[] playerColorPairCards, JPanel playerPropertiesPanel) {
		JFrame mortgageFrame = new JFrame("Mortgage Cards");
		JPanel mortgagePanel = new JPanel();
		JPanel mortgagePanel2 = new JPanel();
		mortgagePanel.setLayout(null);
		mortgagePanel2.setLayout(null);
		mortgagePanel.setPreferredSize(new Dimension(290, 1000));
		mortgageFrame.add(mortgagePanel2);
		mortgageFrame.setSize(310, 350);
		mortgageFrame.setVisible(true);
		
		JLabel mortgageLabel = new JLabel("Mortgage");
		mortgagePanel.add(mortgageLabel);
		mortgageLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		mortgageLabel.setBounds(30, 15, 100, 30);
		
		JLabel unmortgageLabel = new JLabel("Unmortgage");
		mortgagePanel.add(unmortgageLabel);
		unmortgageLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		unmortgageLabel.setBounds(160, 15, 100, 30);
		
		int y = 60;
		JButton[] mortgageCardsButtons = new JButton[playerCards.size()];
		for (int i = 0; i < mortgageCardsButtons.length; i++) {
			mortgageCardsButtons[i] = new JButton(playerCards.get(i));
			mortgagePanel.add(mortgageCardsButtons[i]);
			enableButton(mortgageCardsButtons[i]);
			mortgageCardsButtons[i].setBounds(5, y, 120, 25);
			y += 30;
		}
		
		y = 60;
		JButton[] mortgagedCardsButtons = new JButton[playerMortgageCards.size()];
		for (int i = 0; i < mortgagedCardsButtons.length; i++) {
			mortgagedCardsButtons[i] = new JButton(playerMortgageCards.get(i));
			mortgagePanel.add(mortgagedCardsButtons[i]);
			int index = Arrays.asList(arr_places).indexOf(playerMortgageCards.get(i));
			if (playerCoins >= mortgagePricesPlaces[index] && isPlayerPay == false) {
				enableButton(mortgagedCardsButtons[i]);
			} else {
				disableButton(mortgagedCardsButtons[i]);
			}
			mortgagedCardsButtons[i].setBounds(140, y, 120, 25);
			y += 30;
		}

		int i = 0;
		while (i < mortgageCardsButtons.length) {
			int j = i;
			mortgageCardsButtons[j].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mortgageFrame.dispose();
					playerMortgageCards.add(playerCards.get(j));
					int totalMoneyRecieved = 0;
					for (int i = 0; i < arr_places.length; i++) {
						if (playerCards.get(j).equals(arr_places[i])) {
							totalMoneyRecieved += mortgagePricesPlaces[i];
						}
					}
					
					for (int i = 0; i < arr_places.length; i++) {
						if (arr_places[i].equals(playerCards.get(j))) {
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
					while (k < playerColorPairCardsList.size()) {
						if (playerCardColors.get(k).equals(cardColor)) {
							totalMoneyRecieved += (playerColorPairCardsHousesList.get(k) * houseCost);
							playerColorPairCardsHousesList.remove(k);
							playerColorPairCardsList.remove(k);
							playerCardColors.remove(k);
							playerHousesLabel.remove(k);
						} else {
							k++;
						}
					}
					for (int j = 0; j < coloredCardsName.length; j++) {
						if (coloredCardsName[j].equals(cardColor)) {
							playerColorPairCards[j] -= 1;
						}
					}
					if (cardColor.equals("") == false) {
						for (int i = 0; i < cardColors.length; i++) {
							if (playerCards.get(j).equals(arr_places[i]) == false && cardColors[i].equals(cardColor)) {
								places_PaymentPrices[i] = places_PaymentPrices2[i];
							}
						}
					}
					
					if (playerCards.get(j).indexOf("Railroad") >= 0) {
						switch (playerMortgaging) {
							case 1:
								player1Railroads--;
								break;
							case 2:
								player2Railroads--;
								break;
							case 3:
								player3Railroads--;
								break;
						}
					} else if (playerCards.get(j).equals("Water Works") || playerCards.get(j).equals("Electric Company")) {
						switch (playerMortgaging) {
							case 1:
								player1Utilities--;
								break;
							case 2:
								player2Utilities--;
								break;
							case 3:
								player3Utilities--;
								break;
						}
					}
					
					moneyData(totalMoneyRecieved, playerMortgaging, 0);
					playerCards.remove(j);
					playerCardsLabel.get(j).hide();
					playerPropertiesPanel.remove(playerCardsLabel.get(j));
					playerCardsLabel.remove(j);
					
					if (playerCards.size() == 0) {
						disableButton(playerMortgage);
					}
					if (playerColorPairCardsList.size() == 0) {
						disableButton(playerHousing);
					}
				}
			});
			i++;
		}
		
		int k = 0;
		while (k < mortgagedCardsButtons.length) {
			int j = k;
			mortgagedCardsButtons[k].addActionListener(new ActionListener () {
				public void actionPerformed(ActionEvent e) {
					mortgageFrame.dispose();
					int index = Arrays.asList(arr_places).indexOf(playerMortgageCards.get(j));
					moneyData(mortgagePricesPlaces[index], 0, playerMortgaging);
					playerCards.add(playerMortgageCards.get(j));
					playerCardsLabel.add(new JLabel(playerMortgageCards.get(j)));
					playerPropertiesPanel.add(playerCardsLabel.get(playerCardsLabel.size() - 1));
					playerCardsLabel.get(playerCardsLabel.size()-1).show();
					playerCardsLabel.get(playerCardsLabel.size() - 1).setFont(new Font("Arial", Font.PLAIN, 12));
					playerCardsLabel.get(playerCardsLabel.size() - 1).setSize(140, 15);
					playerCardsLabel.get(playerCardsLabel.size()-1).setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
					
					for (int i = 0; i < arr_places.length; i++) {
						if (arr_places[i].equals(playerMortgageCards.get(j))) {
							cardLocation = i;
						}
					}
					
					String cardColor = cardColors[cardLocation];
					
					places_PaymentPrices[cardLocation] = places_PaymentPrices2[cardLocation];
					pairCards(playerMortgaging, cardColor);
					
					if (playerMortgageCards.get(j).indexOf("Railroad") >= 0) {
						switch (playerMortgaging) {
							case 1:
								player1Railroads++;
								break;
							case 2:
								player2Railroads++;
								break;
							case 3:
								player3Railroads++;
								break;
						}
					} else if (playerMortgageCards.get(j).equals("Water Works") || playerMortgageCards.get(j).equals("Electric Company")) {
						switch (playerMortgaging) {
							case 1:
								player1Utilities++;
								break;
							case 2:
								player2Utilities++;
								break;
							case 3:
								player3Utilities++;
								break;
						}
					}
					playerMortgageCards.remove(j);
				}
			});
			k++;
		}
		JScrollPane mortgageSp = new JScrollPane();
		mortgageSp.add(mortgagePanel);
		mortgagePanel2.add(mortgageSp);
		mortgageSp.setBounds(0, 0, 290, 350);
		mortgageSp.getVerticalScrollBar().setUnitIncrement(25);
		mortgageSp.getHorizontalScrollBar().setUnitIncrement(30);
		mortgageSp.setViewportView(mortgagePanel);
		mortgageSp.validate();
	}

	public void bidding(int playerLocation, int notBuyer, int player1Bidder, int player2Bidder, String player1Name, String player2Name,
			int firstBidderCoins, int secondBidderCoins, ArrayList<String> firstPlayerCards, ArrayList<String> secondPlayerCards, ArrayList<JLabel> firstPlayerCardsLabel,
			ArrayList<JLabel> secondPlayerCardsLabel, JButton playerBuy, JButton playerNotBuy, JLabel firstPlayerCoinsLabel, JLabel secondPlayerCoinsLabel, JPanel firstPlayerPropertiesPanel,
			JPanel secondPlayerPropertiesPanel) {
		isPlayer1Pass = false;
		isPlayer2Pass = false;
		isPlayer3Pass = false;
		JFrame bidFrame = new JFrame("Bid Time");
		bidFrame.setSize(300, 200);
		bidFrame.setVisible(true);
		JPanel bidPanel = new JPanel();
		bidPanel.setLayout(null);
		bidFrame.add(bidPanel);
		JLabel player1BidderLabel = new JLabel(player1Name);
		bidPanel.add(player1BidderLabel);
		player1BidderLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		player1BidderLabel.setBounds(20, 10, 100, 30);
		JLabel player2BidderLabel = new JLabel(player2Name);
		bidPanel.add(player2BidderLabel);
		player2BidderLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		player2BidderLabel.setBounds(200, 10, 100, 30);
		
		bidPrice = prices_places[playerLocation]/2;
		
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
		
		if(firstBidderCoins >= bidPrice) {
			enableButton(player1Ok);
		}
		if (firstBidderCoins >= bidPrice + 10) {
			if (secondBidderCoins >= bidPrice || secondBidderCoins >= bidPrice + 10) {
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
				if (firstBidderCoins >= bidPrice + 10) {
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
				if (secondBidderCoins >= bidPrice + 10) {
					enableButton(player2Bid);
				} else {
					disableButton(player2Bid);
				}
			}
		});
		
		player1Pass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (player1Bidder) {
					case 1:
						isPlayer1Pass = true;
						break;
					case 2:
						isPlayer2Pass = true;
						break;
					case 3:
						isPlayer3Pass = true;
						break;
				}
				if (bidPass(player1Bidder) == true && bidPass(player2Bidder) == true) {
					bidFrame.dispose();
					isPlayerBuy(notBuyer);
					disableButton(playerNotBuy);
					disableButton(playerBuy);
				} else if (bidPass(player1Bidder) == true && bidPass(player2Bidder) == false) {
					if (secondBidderCoins < bidPrice || secondBidderCoins < bidPrice + 10) {
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
				switch (player2Bidder) {
					case 1:
						isPlayer1Pass = true;
						break;
					case 2:
						isPlayer2Pass = true;
						break;
					case 3:
						isPlayer3Pass = true;
						break;
				}
				if (bidPass(player1Bidder) == true && bidPass(player2Bidder) == true) {
					bidFrame.dispose();
					isPlayerBuy(notBuyer);
					disableButton(playerNotBuy);
					disableButton(playerBuy);
				} else if (bidPass(player2Bidder) == true && bidPass(player1Bidder) == false) {
					if (firstBidderCoins < bidPrice || firstBidderCoins < bidPrice + 10) {
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
				disableButton(allPass);
				if (secondBidderCoins < bidPrice || secondBidderCoins < bidPrice + 10) {
					switch (player2Bidder) {
						case 1:
							isPlayer1Pass = true;
							break;
						case 2:
							isPlayer2Pass = true;
							break;
						case 3:
							isPlayer3Pass = true;
							break;
					}
				}
				if (bidPass(player2Bidder) == true) {
					moneyData(bidPrice, 0, player1Bidder);
					firstPlayerCoinsLabel.setText("$" + firstBidderCoins);
					firstPlayerCards.add(arr_places[playerLocation]);
					firstPlayerCardsLabel.add(new JLabel(arr_places[playerLocation]));
					firstPlayerCardsLabel.get(firstPlayerCards.size() - 1).setFont(new Font("Arial", Font.PLAIN, 12));
					firstPlayerPropertiesPanel.add(firstPlayerCardsLabel.get(firstPlayerCards.size() - 1));
					firstPlayerCardsLabel.get(firstPlayerCards.size() - 1).show();
					firstPlayerCardsLabel.get(firstPlayerCards.size() - 1).setSize(140, 15);
					firstPlayerCardsLabel.get(firstPlayerCardsLabel.size()-1).setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
					propertiesNotBought.remove(arr_places[playerLocation]);
					disableButton(playerBuy);
					disableButton(playerNotBuy);
					if (arr_places[playerLocation].indexOf("Railroad") > 0) {
						switch (player1Bidder) {
							case 1:
								player1Railroads += 1;
								break;
							case 2:
								player2Railroads += 1;
								break;
							case 3:
								player3Railroads += 1;
								break;
						}
					} else if (arr_places[playerLocation].equals("Electric Company") || arr_places[playerLocation].equals("Water Works")) {
						switch (player1Bidder) {
							case 1:
								player1Utilities += 1;
								break;
							case 2:
								player2Utilities += 1;
								break;
							case 3:
								player3Utilities += 1;
								break;
						}
					}
					pairCards(player1Bidder, cardColors[playerLocation]);
					isPlayerBuy(notBuyer);
					bidFrame.dispose();
				} else {
					disableButton(player1Bid);
					disableButton(player1Pass);
					disableButton(player1Ok);
					if (secondBidderCoins >= bidPrice + 10) {
						enableButton(player2Bid);
					}
					enableButton(player2Pass);
				}
			}
		});
		
		player2Ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (firstBidderCoins < bidPrice || firstBidderCoins < bidPrice + 10) {
					switch (player1Bidder) {
						case 1:
							isPlayer1Pass = true;
							break;
						case 2:
							isPlayer2Pass = true;
							break;
						case 3:
							isPlayer3Pass = true;
							break;
					}
				}
				if (bidPass(player1Bidder) == true) {
					moneyData(bidPrice, 0, player2Bidder);
					secondPlayerCoinsLabel.setText("$" + secondBidderCoins);
					secondPlayerCards.add(arr_places[playerLocation]);
					secondPlayerCardsLabel.add(new JLabel(arr_places[playerLocation]));
					secondPlayerCardsLabel.get(secondPlayerCards.size() - 1).setFont(new Font("Arial", Font.PLAIN, 12));
					secondPlayerPropertiesPanel.add(secondPlayerCardsLabel.get(secondPlayerCards.size() - 1));
					secondPlayerCardsLabel.get(secondPlayerCards.size() - 1).show();
					secondPlayerCardsLabel.get(secondPlayerCards.size() - 1).setSize(140, 15);
					secondPlayerCardsLabel.get(secondPlayerCardsLabel.size()-1).setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
					propertiesNotBought.remove(arr_places[playerLocation]);
					disableButton(playerBuy);
					disableButton(playerNotBuy);
					if (arr_places[playerLocation].indexOf("Railroad") > 0) {
						switch (player2Bidder) {
							case 1:
								player1Railroads += 1;
								break;
							case 2:
								player2Railroads += 1;
								break;
							case 3:
								player3Railroads += 1;
								break;
						}
					} else if (arr_places[playerLocation].equals("Electric Company") || arr_places[playerLocation].equals("Water Works")) {
						switch (player2Bidder) {
							case 1:
								player1Utilities += 1;
								break;
							case 2:
								player2Utilities += 1;
								break;
							case 3:
								player3Utilities += 1;
								break;
						}
					}
					pairCards(player2Bidder, cardColors[playerLocation]);
					isPlayerBuy(notBuyer);
					bidFrame.dispose();
				} else {
					disableButton(player2Bid);
					disableButton(player2Pass);
					disableButton(player2Ok);
					if (firstBidderCoins >= bidPrice + 10) {
						enableButton(player1Bid);
					}
					enableButton(player1Pass);
				}
			}
		});
		
		allPass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bidFrame.dispose();
				disableButton(playerBuy);
				disableButton(playerNotBuy);
				isPlayerBuy(notBuyer);
			}
		});
	}

	public boolean bidPass(int player) {
		boolean isPlayerPass = false;
		switch (player) {
			case 1:
				isPlayerPass = isPlayer1Pass;
				break;
			case 2:
				isPlayerPass = isPlayer2Pass;
				break;
			case 3:
				isPlayerPass = isPlayer3Pass;
				break;
		}
		return isPlayerPass;
	}

	public void isPlayerBuy(int player) {
		switch (player) {
			case 1:
				isPlayer1Buy = false;
				break;
			case 2:
				isPlayer2Buy = false;
				break;
			case 3:
				isPlayer3Buy = false;
				break;
		}
	}

	public void playerPay(int playerLocation, int playerPaying, int firstPlayerEarn, int secondPlayerEarn, int playerPayingCoins, int firstPlayerCoins, int secondPlayerCoins,
			boolean isPlayerAtUtility, boolean isPlayerPay, boolean isFirstPlayerPay, boolean isSecondPlayerPay, JButton playerPay, JButton firstPlayerPay, JButton secondPlayerPay,
			int firstPlayerUtilities, int secondPlayerUtilities, boolean isJailPlayerPaying, boolean isJailFirstPlayer, boolean isJailSecondPlayer, boolean isPlayerOut,
			boolean isFirstPlayerOut, boolean isSecondPlayerOut) {
		if(isChancePay == true) {
			if (isPayEachPlayer == true && (playerPayingCoins >= cardDrawingPay || isPlayerOut == true)) {
				if (cardDrawingPay == 50) {
					if (isFirstPlayerOut == false) {
						moneyData(50, firstPlayerEarn, playerPaying);
					} else {
						moneyData(50, secondPlayerEarn, playerPaying);
					}
				} else {
					moneyData(50, firstPlayerEarn, playerPaying);
					moneyData(50, secondPlayerEarn, playerPaying);
				}
				isPay(playerPaying);
				isPayEachPlayer = false;
				isChancePay = false;
				disableButton(playerPay);
			} else if(playerPayingCoins >= cardDrawingPay || isPlayerOut == true) {
				playerPayingCoins -= cardDrawingPay;
				moneyData(cardDrawingPay, 0, playerPaying);
				isPay(playerPaying);
				isChancePay = false;
				disableButton(playerPay);
			}
		} else if (isCommunityPay == true) {
			if (isCollectFromPlayers == true) {
				if (isPlayerPay == true) {
					if (isFirstPlayerPay == false && isFirstPlayerOut == false && (playerPayingCoins >= 50 || isPlayerOut == true)) {
						moneyData(50, firstPlayerEarn, playerPaying);
						isPay(playerPaying);
						if (isPlayerPay == false && isFirstPlayerPay == false && isSecondPlayerPay == false) {
							isCollectFromPlayers = false;
							isCommunityPay = false;
							disableButton(playerPay);
						}
					} else if (isSecondPlayerPay == false && isSecondPlayerOut == false && (playerPayingCoins >= 50 || isPlayerOut == true)) {
						moneyData(50, secondPlayerEarn, playerPaying);
						isPay(playerPaying);
						if (isPlayerPay == false && isFirstPlayerPay == false && isSecondPlayerPay == false) {
							isCollectFromPlayers = false;
							isCommunityPay = false;
							disableButton(playerPay);
						}
					}
				}
			} else if (playerPayingCoins >= cardDrawingPay || isPlayerOut == true) {
				moneyData(cardDrawingPay, 0, playerPaying);
				isPay(playerPaying);
				isCommunityPay = false;
				disableButton(playerPay);
			}
		} else if (playerLocation == 4) {
			if(playerPayingCoins >= 200 || isPlayerOut == true) {
				moneyData(200, 0, playerPaying);
				isPay(playerPaying);
				disableButton(playerPay);
			}
		} else if (playerLocation == 38) {
			if(playerPayingCoins >= 75 || isPlayerOut == true) {
				moneyData(75, 0, playerPaying);
				isPay(playerPaying);
				disableButton(playerPay);
			}
		} else if (isJailPlayerPaying == true) {
			if (playerPayingCoins >= 50 || isPlayerOut == true) {
				moneyData(50, 0, playerPaying);
				isJailPlayerPaying = false;
				switch (playerPaying) {
					case 1:
						player1JailCount = 3;
						break;
					case 2:
						player2JailCount = 3;
						break;
					case 3:
						player3JailCount = 3;
						break;
				}
				disableButton(playerPay);
				isPay(playerPaying);
			}
		} else if (isFirstPlayerPay == true) {
			if (isJailFirstPlayer == false) {
				if (arr_places[playerLocation].indexOf("Railroad") > 0) {
					int totalRailroadPayment = getRailroadPayment(firstPlayerEarn);
					if (isNearestToNonColors == true) {
						totalRailroadPayment *= 2;
					}
					if (playerPayingCoins >= totalRailroadPayment || isPlayerOut == true) {
						moneyData(totalRailroadPayment, firstPlayerEarn, playerPaying);
						disableButton(playerPay);
						isPay(playerPaying);
						isPay(firstPlayerEarn);
						if (isNearestToNonColors == true) {
							isNearestToNonColors = false;
						}
					}
				} else if (isPlayerAtUtility == true) {
					if (firstPlayerUtilities == 1 && isNearestToNonColors == false) {
						if (playerPayingCoins >= 4 * (currentRollDice1 + currentRollDice2) || isPlayerOut == true) {
							moneyData(4 * (currentRollDice1 + currentRollDice2), firstPlayerEarn, playerPaying);
							disableButton(playerPay);
							isPay(playerPaying);
							isPay(firstPlayerEarn);
							isPlayerAtUtility = false;
						}
					} else if (firstPlayerUtilities > 1 || isNearestToNonColors == true) {
						if (playerPayingCoins >= 10 * (currentRollDice1 + currentRollDice2) || isPlayerOut == true) {
							moneyData(10 * (currentRollDice1 + currentRollDice2), firstPlayerEarn, playerPaying);
							disableButton(playerPay);
							isPay(playerPaying);
							isPay(firstPlayerEarn);
							isPlayerAtUtility = false;
							if (isNearestToNonColors == true) {
								isNearestToNonColors = false;
							}
						}
					}
				} else {
					if (playerPayingCoins >= places_PaymentPrices[playerLocation] || isPlayerOut == true) {
						moneyData(places_PaymentPrices[playerLocation], firstPlayerEarn, playerPaying);
						if (isDeal == true) {
							usingDeals(playerPaying);
						}
						disableButton(playerPay);
						isPay(playerPaying);
						isPay(firstPlayerEarn);
					}
				}
			} else if (isJailFirstPlayer == true) {
				if (arr_places[playerLocation].indexOf("Railroad") > 0) {
					int totalRailroadPayment = getRailroadPayment(firstPlayerEarn)/2;
					if (isNearestToNonColors == true) {
						totalRailroadPayment *= 2;
					}
					if (playerPayingCoins >= totalRailroadPayment || isPlayerOut == true) {
						moneyData(totalRailroadPayment, firstPlayerEarn, playerPaying);
						disableButton(playerPay);
						isPay(playerPaying);
						isPay(firstPlayerEarn);
						if (isNearestToNonColors == true) {
							isNearestToNonColors = false;
						}
					}
				} else if (isPlayerAtUtility == true) {
					if (firstPlayerUtilities == 1 && isNearestToNonColors == false) {
						if (playerPayingCoins >= (4 * (currentRollDice1 + currentRollDice2)) / 2 || isPlayerOut == true) {
							moneyData((4 * (currentRollDice1 + currentRollDice2)) / 2, firstPlayerEarn, playerPaying);
							disableButton(playerPay);
							isPay(playerPaying);
							isPay(firstPlayerEarn);
							isPlayerAtUtility = false;
						}
					} else if (firstPlayerUtilities > 1 || isNearestToNonColors == true) {
						if (playerPayingCoins >= (10 * (currentRollDice1 + currentRollDice2)) / 2 || isPlayerOut == true) {
							moneyData((10 * (currentRollDice1 + currentRollDice2)) / 2, firstPlayerEarn, playerPaying);
							disableButton(playerPay);
							isPay(playerPaying);
							isPay(firstPlayerEarn);
							isPlayerAtUtility = false;
							if (isNearestToNonColors == true) {
								isNearestToNonColors = false;
							}
						}
					}
				} else {
					if (playerPayingCoins >= places_PaymentPrices[playerLocation] / 2 || isPlayerOut == true) {
						moneyData(places_PaymentPrices[playerLocation] / 2, firstPlayerEarn, playerPaying);
						if (isDeal == true) {
							usingDeals(playerPaying);
						}
						disableButton(playerPay);
						isPay(playerPaying);
						isPay(firstPlayerEarn);
					}
				}
			}
		} else if (isSecondPlayerPay == true) {
			if (isJailSecondPlayer == false) {
				if (arr_places[playerLocation].indexOf("Railroad") > 0) {
					int totalRailroadPayment = getRailroadPayment(secondPlayerEarn);
					if (isNearestToNonColors == true) {
						totalRailroadPayment *= 2;
					}
					if (playerPayingCoins >= totalRailroadPayment || isPlayerOut == true) {
						moneyData(totalRailroadPayment, secondPlayerEarn, playerPaying);
						disableButton(playerPay);
						isPay(playerPaying);
						isPay(secondPlayerEarn);
						if (isNearestToNonColors == true) {
							isNearestToNonColors = false;
						}
					}
				} else if (isPlayerAtUtility == true) {
					if (secondPlayerUtilities == 1 && isNearestToNonColors == false) {
						if (playerPayingCoins >= 4 * (currentRollDice1 + currentRollDice2) || isPlayerOut == true) {
							moneyData(4 * (currentRollDice1 + currentRollDice2), secondPlayerEarn, playerPaying);
							disableButton(playerPay);
							isPay(playerPaying);
							isPay(secondPlayerEarn);
							isPlayerAtUtility = false;
						}
					} else if (secondPlayerUtilities > 1 || isNearestToNonColors == true) {
						if (playerPayingCoins >= 10 * (currentRollDice1 + currentRollDice2) || isPlayerOut == true) {
							moneyData(10 * (currentRollDice1 + currentRollDice2), secondPlayerEarn, playerPaying);
							disableButton(playerPay);
							isPay(playerPaying);
							isPay(secondPlayerEarn);
							isPlayerAtUtility = false;
							if (isNearestToNonColors == true) {
								isNearestToNonColors = false;
							}
						}
					}
				} else {
					if (playerPayingCoins >= places_PaymentPrices[playerLocation] || isPlayerOut == true) {
						moneyData(places_PaymentPrices[playerLocation], secondPlayerEarn, playerPaying);
						if (isDeal == true) {
							usingDeals(playerPaying);
						}
						disableButton(playerPay);
						isPay(playerPaying);
						isPay(secondPlayerEarn);
					}
				}
			} else if (isJailSecondPlayer == true) {
				if (arr_places[playerLocation].indexOf("Railroad") > 0) {
					int totalRailroadPayment = getRailroadPayment(secondPlayerEarn)/2;
					if (isNearestToNonColors == true) {
						totalRailroadPayment *= 2;
					}
					if (playerPayingCoins >= totalRailroadPayment || isPlayerOut == true) {
						moneyData(totalRailroadPayment, secondPlayerEarn, playerPaying);
						disableButton(playerPay);
						isPay(playerPaying);
						isPay(secondPlayerEarn);
						if (isNearestToNonColors == true) {
							isNearestToNonColors = false;
						}
					}
				} else if (isPlayerAtUtility == true) {
					if (secondPlayerUtilities == 1 && isNearestToNonColors == false) {
						if (playerPayingCoins >= (4 * (currentRollDice1 + currentRollDice2)) / 2 || isPlayerOut == true) {
							moneyData((4 * (currentRollDice1 + currentRollDice2)) / 2, secondPlayerEarn, playerPaying);
							disableButton(playerPay);
							isPay(playerPaying);
							isPay(secondPlayerEarn);
							isPlayerAtUtility = false;
						}
					} else if (secondPlayerUtilities > 1 || isNearestToNonColors == true) {
						if (playerPayingCoins >= (10 * (currentRollDice1 + currentRollDice2)) / 2 || isPlayerOut == true) {
							moneyData((10 * (currentRollDice1 + currentRollDice2)) / 2, secondPlayerEarn, playerPaying);
							disableButton(playerPay);
							isPay(playerPaying);
							isPay(secondPlayerEarn);
							isPlayerAtUtility = false;
							if (isNearestToNonColors == true) {
								isNearestToNonColors = false;
							}
						}
					}
				} else {
					if (playerPayingCoins >= places_PaymentPrices[playerLocation] / 2 || isPlayerOut == true) {
						moneyData(places_PaymentPrices[playerLocation] / 2, secondPlayerEarn, playerPaying);
						if (isDeal == true) {
							usingDeals(playerPaying);
						}
						disableButton(playerPay);
						isPay(playerPaying);
						isPay(secondPlayerEarn);
					}
				}
			}
		}
		
		player1CoinsLabel.setText("$" + player1Coins);
		player2CoinsLabel.setText("$" + player2Coins);
		player3CoinsLabel.setText("$" + player3Coins);
	}

	public void isPay(int playerPay) {
		switch (playerPay) {
			case 1:
				isPlayer1Pay = false;
				break;
			case 2:
				isPlayer2Pay = false;
				break;
			case 3:
				isPlayer3Pay = false;
				break;
		}
	}
	
	public void gameOver() {
		if (isPlayer1Out == false) {
			
		} else if (isPlayer2Out == false) {
			
		} else {
			
		}
	}
}