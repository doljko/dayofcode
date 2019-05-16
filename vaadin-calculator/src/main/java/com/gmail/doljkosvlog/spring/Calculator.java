package com.gmail.doljkosvlog.spring;

import java.util.logging.Logger;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class Calculator extends VerticalLayout {
	TextField inputTF = new TextField("Үр дүн");
	TextField outputTF = new TextField("Нэрээ оруулна уу!");
	
	private String action;
	
	private double result;
	
	public Calculator() {
		Button plus = new Button("+");
		Button minus = new Button("-");
		Button mul = new Button("*");
		Button div = new Button("/");
		Button set = new Button("=");
		Button clr = new Button("clr");
		
		plus.addClickListener(e->doAction(e));
		minus.addClickListener(e->doAction(e));
		mul.addClickListener(e->doAction(e));
		div.addClickListener(e->doAction(e));
		set.addClickListener(e->doSet());
		clr.addClickListener(e->doClear());
		
		HorizontalLayout buttonline = new HorizontalLayout();
		buttonline.add(plus, minus, mul, div, set, clr);
		
		add(outputTF, inputTF, buttonline);
	}

	private void doAction(ClickEvent e) {
//		perfomAction(e.);
		System.out.println(e.toString());
	}

	private void doClear() {
		inputTF.setValue("");
		outputTF.setValue("0.0");
		result = 0;
		action = null;
	}

	private void doSet() {
		perfomAction(null);
	}
	
	private void perfomAction(String nextaction) {
		double value = Double.parseDouble(inputTF.getValue());
		if (action == null) {
			result = value;
		} else if ("+".equals(action)) {
			result += value;
		}else if ("-".equals(action)) {
			result -= value;
		}else if ("*".equals(action)) {
			result *= value;
		}else if ("/".equals(action)) {
			result /= value;
		}
		action = nextaction;
		outputTF.setValue(""+result);
		inputTF.setValue("");
	}

}
