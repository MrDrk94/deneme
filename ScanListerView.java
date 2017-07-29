package Amazon;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Dimension;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScanListerView extends JFrame {

	private JPanel contentPane;
	private JTextField SKU_Prefix;
	private JTextField SKU_Number;
	private JTextField Default_Price;
	private JTextField Default_Quantity;
	private JTextField Cost_Per_Unit;
	private JTextField Barcode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScanListerView frame = new ScanListerView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ScanListerView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 440);
	
		setMinimumSize(new Dimension(670, 440));
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel Input_Panel = new JPanel();
		
		JPanel Barcode_Panel = new JPanel();
		
		JPanel List_Panel = new JPanel();
		
		JPanel Button_Panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(Barcode_Panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
						.addComponent(Input_Panel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 589, Short.MAX_VALUE)
						.addComponent(Button_Panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
						.addComponent(List_Panel, GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE))
					.addGap(1))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(Input_Panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Barcode_Panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(List_Panel, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Button_Panel, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
		);
		
		JButton ListOnAmazon = new JButton("LIST ON AMAZON");
		ListOnAmazon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("List on Amazon!!");
			}
		});
		
		JButton ListLabelShip = new JButton("LIST+LABEL+SHIP");
		ListLabelShip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("List + Label + Ship");
			}
		});
		
		JButton ClearList = new JButton("CLEAR LIST");
		ClearList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clear List!!");
			}
		});
		
		JButton btnExport = new JButton("EXPORT");
		btnExport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Export!!");
			}
		});
		GroupLayout gl_Button_Panel = new GroupLayout(Button_Panel);
		gl_Button_Panel.setHorizontalGroup(
			gl_Button_Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Button_Panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(ListOnAmazon)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(ListLabelShip)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(ClearList)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnExport)
					.addContainerGap(142, Short.MAX_VALUE))
		);
		gl_Button_Panel.setVerticalGroup(
			gl_Button_Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_Button_Panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_Button_Panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(ListOnAmazon)
						.addComponent(ListLabelShip)
						.addComponent(ClearList)
						.addComponent(btnExport))
					.addContainerGap())
		);
		Button_Panel.setLayout(gl_Button_Panel);
		
		JScrollPane scrollPane = new JScrollPane();
		List_Panel.add(scrollPane);
		
		JLabel lblBarcode = new JLabel("Barcode");
		
		Barcode = new JTextField();
		Barcode.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		
		JLabel lblCount = new JLabel("Count");
		
		JTextPane Count = new JTextPane();
		GroupLayout gl_Barcode_Panel = new GroupLayout(Barcode_Panel);
		gl_Barcode_Panel.setHorizontalGroup(
			gl_Barcode_Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Barcode_Panel.createSequentialGroup()
					.addGap(6)
					.addComponent(lblBarcode, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(Barcode, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblCount, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(Count, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(241, Short.MAX_VALUE))
		);
		gl_Barcode_Panel.setVerticalGroup(
			gl_Barcode_Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Barcode_Panel.createSequentialGroup()
					.addGroup(gl_Barcode_Panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Barcode_Panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblBarcode, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addComponent(Barcode, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblCount, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
						.addComponent(Count, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		Barcode_Panel.setLayout(gl_Barcode_Panel);
		
		JLabel lblSkuPrefix = new JLabel("SKU Prefix");
		
		SKU_Prefix = new JTextField();
		SKU_Prefix.setColumns(4);
		
		JLabel lblDefaultPrice = new JLabel("Default Price");
		
		Default_Price = new JTextField();
		Default_Price.setColumns(10);
		
		JComboBox Condition = new JComboBox();
		Condition.setSelectedIndex(-1);
		
		JButton btnManageConditions = new JButton("Manage Conditions");
		btnManageConditions.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblCondition = new JLabel("Condition");
		
		JLabel lblSkuNumber = new JLabel("SKU Number");
		
		SKU_Number = new JTextField();
		SKU_Number.setColumns(4);
		
		JLabel lblDefaultQuantity = new JLabel("Default Quantity");
		
		Default_Quantity = new JTextField();
		Default_Quantity.setColumns(10);
		
		JLabel lblCnditionNote = new JLabel("Condition Note");
		
		JComboBox Condition_Note = new JComboBox();
		Condition_Note.setSelectedIndex(-1);
		
		JLabel lblCostPerUnit = new JLabel("Cost Per Unit");
		
		Cost_Per_Unit = new JTextField();
		Cost_Per_Unit.setColumns(10);
		
		JLabel lblMarketplace = new JLabel("Marketplace");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setSelectedIndex(-1);
		GroupLayout gl_Input_Panel = new GroupLayout(Input_Panel);
		gl_Input_Panel.setHorizontalGroup(
			gl_Input_Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Input_Panel.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_Input_Panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblSkuNumber, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblSkuPrefix, GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_Input_Panel.createParallelGroup(Alignment.LEADING)
						.addComponent(SKU_Prefix, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						.addComponent(SKU_Number, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Input_Panel.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_Input_Panel.createSequentialGroup()
							.addComponent(lblCostPerUnit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Cost_Per_Unit, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Input_Panel.createSequentialGroup()
							.addComponent(lblDefaultPrice, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Default_Price, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Input_Panel.createSequentialGroup()
							.addComponent(lblDefaultQuantity)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(Default_Quantity, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Input_Panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCnditionNote)
						.addComponent(lblCondition, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMarketplace, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Input_Panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Input_Panel.createSequentialGroup()
							.addComponent(Condition, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
							.addComponent(btnManageConditions))
						.addComponent(Condition_Note, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_Input_Panel.setVerticalGroup(
			gl_Input_Panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Input_Panel.createSequentialGroup()
					.addGap(7)
					.addGroup(gl_Input_Panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Input_Panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblDefaultPrice, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addComponent(SKU_Prefix, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Input_Panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(Default_Price, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblCondition, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addComponent(Condition, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnManageConditions, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblSkuPrefix, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Input_Panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDefaultQuantity, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSkuNumber, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(SKU_Number, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(Default_Quantity, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCnditionNote, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(Condition_Note, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Input_Panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCostPerUnit, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(Cost_Per_Unit, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMarketplace, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		Input_Panel.setLayout(gl_Input_Panel);
		contentPane.setLayout(gl_contentPane);
	}
}
