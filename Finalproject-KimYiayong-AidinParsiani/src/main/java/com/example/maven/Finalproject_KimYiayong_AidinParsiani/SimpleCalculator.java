package com.example.maven.Finalproject_KimYiayong_AidinParsiani;
import Interfaces.*;

public class SimpleCalculator implements CalculatorBasicOperationInterface {
	private double firstNumber = 0.0;
	private double secondNumber = 0.0;
	private double result = 0.0;

	public double getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public double getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public void addition(double firstNumber, double secondNumber) {
		setResult(firstNumber + secondNumber);
		
	}

	public void subtraction(double firstNumber, double secondNumber) {
		setResult(firstNumber - secondNumber);
	}

	public void multiplication(double firstNumber, double secondNumber) {
		setResult(firstNumber * secondNumber);
	}

	public void division(double firstNumber, double secondNumber) {
		setResult(firstNumber / secondNumber);
	}
	}
