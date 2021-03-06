package com.gy.designpattern.mediator.deft;

/**
 * @ClassName Colleague
 * @Description TOOD
 * @Author lipeng
 * @Date 2020-02-19 23:59
 */
public class ConcreteColleagueB extends Colleague {

	private Mediator mediator;

	public ConcreteColleagueB(Mediator mediator) {
		super(mediator);
	}

	public void someOperation() {
		mediator.changed(this);
	}
}
