package com.monsanto.mbt;

import java.util.Comparator;

public class DateComparator implements Comparator<Widget> {

	public int compare(Widget o1, Widget o2) {
		return o1.getProductionDate().compareTo(o2.getProductionDate());
	}

}
