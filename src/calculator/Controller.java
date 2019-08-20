package calculator;
import java.awt.event.*;
public class Controller implements ActionListener {
	private Model model;
	private View view;
	
	public Controller (Model model, View view) {
		this.model = model;
		this.view = view;
		initButtons();
	}
	
	public void actionPerformed (ActionEvent e) {
		if(e.getSource().equals(view.one))
			view.textLabel.setText("1");
			
	}
	
	public void initButtons () {
		view.one.addActionListener(this);
		view.two.addActionListener(this);
		view.three.addActionListener(this);
		view.four.addActionListener(this);
		view.five.addActionListener(this);
		view.six.addActionListener(this);
		view.seven.addActionListener(this);
		view.eight.addActionListener(this);
		view.nine.addActionListener(this);
		view.zero.addActionListener(this);
		view.plus.addActionListener(this);
		view.minus.addActionListener(this);
		view.multiply.addActionListener(this);
		view.divide.addActionListener(this);
		view.clear.addActionListener(this);
		view.equals.addActionListener(this);
	}
}
