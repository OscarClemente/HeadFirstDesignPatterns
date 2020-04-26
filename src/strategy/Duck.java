package strategy;

import strategy.fly.FlyBehavior;
import strategy.quack.QuackBehavior;

public class Duck {
	FlyBehavior mFlyBehavior;
	QuackBehavior mQuackBehavior;
	
	public Duck() {
		
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		mFlyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		mQuackBehavior = quackBehavior;
	}
	
	public void performFly() {
		mFlyBehavior.fly();
	}
	
	public void performQuack() {
		mQuackBehavior.quack();
	}
	
	public void display() {
		System.out.println("A duck is displayed.");
	}

}
