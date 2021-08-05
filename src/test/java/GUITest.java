import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 * This class must be started as an application.
 * Open A Window that contains 1 text field and 1 button.
 * When clicking on the button, update the "ModelClass" class by updating its field using the content of the text field.
 * 
 */
public class GUITest {
	
	public static void main(String[] args) {
		GUITest guiTest = new GUITest();
		guiTest.new ModelClass();
	}
    
    public class ModelClass extends JFrame implements ActionListener {
        // Create 1 field as text;
    	
    	private String text;
    	
		private static final long serialVersionUID = 1L;
		private JTextField textField;
    	private JButton submitButton;
    	
    	public ModelClass() {
    		initGUI();
		}
    	
        /**
         * initializes the GUI with the required components
         */
        private void initGUI() {
        	// frame to contains GUI elements
    		this.setName("Test GUI");

    		// set the size of the frame
    		this.setSize(400, 200);

    		// set the frame's visibility
    		this.setVisible(true);

    		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    		// create the textField
    		textField = new JTextField(10);
    		JPanel panelTextField = new JPanel(new FlowLayout());
    		panelTextField.add(textField);
    		
    		// button to submit the textfield
    		submitButton = new JButton("submit");
    		submitButton.addActionListener(this);
    		JPanel panelButton = new JPanel(new FlowLayout());
    		panelButton.add(submitButton);
    		
    		// make a panel to add the buttons and labels
    		JPanel panel = new JPanel(new BorderLayout());
    		
    		panel.add(panelTextField, BorderLayout.NORTH);
    		panel.add(panelButton, BorderLayout.SOUTH);
    		
    		this.add(panel);
    		SwingUtilities.updateComponentTreeUI(this);
			
		}

		// test method
        public void testValidated() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
            System.out.println(getStringField());
        }

		public String getStringField() {
			return text;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			//in a more complex application we can apply here the command pattern
				text = textField.getText();
				try {
					testValidated();
				} catch (IllegalArgumentException e1) {
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					e1.printStackTrace();
				} catch (NoSuchFieldException e1) {
					e1.printStackTrace();
				} catch (SecurityException e1) {
					e1.printStackTrace();
				}
		}
        
    }
}
