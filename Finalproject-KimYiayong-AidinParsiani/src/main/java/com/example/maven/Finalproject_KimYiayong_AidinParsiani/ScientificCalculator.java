package com.example.maven.Finalproject_KimYiayong_AidinParsiani;
import Interfaces.*;

public class ScientificCalculator implements CalculatorAdvancedOperationsInterface   {
	private double firstNumber = 0.0;
	private double result = 0.0;

	public double getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public void sqrt(double firstNumber) {
		setResult(Math.sqrt(firstNumber));
		
	}

	public void pow2(double firstNumber) {
		setResult(Math.pow(firstNumber, 2));
		
	}

	public void pow3(double firstNumber) {
		setResult(Math.pow(firstNumber, 3));
		
	}

	public void TAN(double firstNumber) {
		setResult(Math.tan(firstNumber));
	}

	public void COS(double firstNumber) {
		setResult(Math.cos(firstNumber));
	}

	public void SIN(double firstNumber) {
		setResult(Math.sin(firstNumber));
	}
	

}
