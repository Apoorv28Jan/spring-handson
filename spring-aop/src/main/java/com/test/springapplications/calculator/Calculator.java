package com.test.springapplications.calculator;

public class Calculator {
	private int operand1;
	private int operand2;
	
	public int getOperand1() {
		return operand1;
	}
	public void setOperand1(int operand1) {
		this.operand1 = operand1;
	}
	public int getOperand2() {
		return operand2;
	}
	public void setOperand2(int operand2) {
		this.operand2 = operand2;
	}
	
	public int addition(int op1, int op2){
		System.out.println("In addition method");
	
		return op1+op2;
	}

}
