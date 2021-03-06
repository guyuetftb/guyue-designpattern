package com.gy.designpattern.decorator.prize;

import com.gy.designpattern.decorator.TempDB;

/**
 * @ClassName Component
 * @Description TOOD
 * @Author lipeng
 * @Date 2020-02-23 17:39
 */
public class GroupPrizeDecorator extends PrizeDecorator {

	public GroupPrizeDecorator(PrizeComponent prizeComponent) {
		super(prizeComponent);
	}

	public double calcPrize(String user) {
		// 调用之前的奖金, 可以是原始对象, 也可以是已经被装饰的对象
		double money = super.calcPrize(user);

		// 累计奖金, 假定每个人的累计奖金都是 100000
		double group = 0.0;
		for (double d : TempDB.mapMonthSaleMoney.values()) {
			group += d;
		}

		double prize = group * 0.01;
		return money + prize;
	}
}
