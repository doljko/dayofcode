package com.gmail.doljkosvlog.spring;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import java.awt.Event;
import org.springframework.beans.factory.annotation.Autowired;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

@Route
@PWA(name = "Project Base for Vaadin Flow with Spring", shortName = "Project Base")
public class MainView extends VerticalLayout {

	private Button plus, minus, mul, div, equal, ac, one, two, three, four, five, six, seven, eight, nine, zero, dot;
	private TextField inputTF;
	private String ehniiUtga = ""; // эхний утга
	private String textFieldUtga = ""; // textField дээрх утга
	private String uildel; // үйлдэл

	public MainView(@Autowired MessageBean bean) {

		HorizontalLayout buttonOne = new HorizontalLayout();
		HorizontalLayout buttonTwo = new HorizontalLayout();
		HorizontalLayout buttonThree = new HorizontalLayout();
		HorizontalLayout buttonFour = new HorizontalLayout();

		inputTF = new TextField();
		plus = new Button("+");		
		minus = new Button("-");
		mul = new Button("*");
		div = new Button("/");
		equal = new Button("=");
		ac = new Button("AC");
		one = new Button("1");
		two = new Button("2");
		three = new Button("3");
		four = new Button("4");
		five = new Button("5");
		six = new Button("6");
		seven = new Button("7");
		eight = new Button("8");
		nine = new Button("9");
		zero = new Button("0");
		dot = new Button(".");

		buttonOne.add(seven, eight, nine, div);
		buttonTwo.add(four, five, six, minus);
		buttonThree.add(one, two, three, plus);
		buttonFour.add(ac, zero, dot, equal);

		add(inputTF, buttonOne, buttonTwo, buttonThree, buttonFour);

		one.addClickListener(e->setToo(e.getSource().getText()));
		two.addClickListener(e->setToo(e.getSource().getText()));
		three.addClickListener(e->setToo(e.getSource().getText()));
		four.addClickListener(e->setToo(e.getSource().getText()));
		five.addClickListener(e->setToo(e.getSource().getText()));
		six.addClickListener(e->setToo(e.getSource().getText()));
		seven.addClickListener(e->setToo(e.getSource().getText()));
		eight.addClickListener(e->setToo(e.getSource().getText()));
		nine.addClickListener(e->setToo(e.getSource().getText()));
		zero.addClickListener(e->setToo(e.getSource().getText()));
		dot.addClickListener(e->setToo(e.getSource().getText()));
		
		ac.addClickListener(e->setToo(e.getSource().getText()));
		plus.addClickListener(e->setUildel(e.getSource().getText()));
		equal.addClickListener(e->calculate(e.getSource().getText()));
		plus.addClickListener(e->setUildel(e.getSource().getText()));
		equal.addClickListener(e->calculate(e.getSource().getText()));
	}

	/*
	 * Нэмэх гэж буй тоогоо хадгална
	 * */
	private void setToo(String text) {
		
		// Эхний тоо юу эсвэл 2 дах тоо юу гэдгийг ямар нэг үйлдэл дарагдсан эсэхээр нь мэднэ
		// Үйлдэл дарагдаагүй байвал эхний утга
		if (uildel == null) {
			ehniiUtga += text;
		}
		
		textFieldUtga += text;
		inputTF.setValue(textFieldUtga);
	}
	/*
	 * Ямар үйлдэл дарагдсаныг хадгална
	 * */
	private void setUildel(String val) {
		uildel = val;
		textFieldUtga = ""; 
		clear();
	}
	/*
	 * Text field цэвэрлэнэ
	 * */
	private void clear() {
		inputTF.clear();
	}
	
	/*
	 * Тэнцүү юмуу язгуур олох, зэрэгт дэвшүүлэх гэх мэт шууд үйлдэл хийх үед дуудна
	 * */
	private void calculate(String val) {
		if (val.equals("=")) {
			switch (uildel) {
			case "+":
				multiple();
				break;

			default:
				break;
			}			
		} else if (val.equals("sqrt")){
			
		}

	}

	private void multiple() {
		Double result = Double.parseDouble(ehniiUtga) + (Double.parseDouble(inputTF.getValue()));
		inputTF.clear();
		inputTF.setValue(String.valueOf(result));
	}
	
	
}
