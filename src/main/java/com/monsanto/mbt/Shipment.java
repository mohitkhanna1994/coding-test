package com.monsanto.mbt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Shipment {

	public static void main(String args[]) throws Exception {

		List<Widget> widgets = new ArrayList<Widget>();
		System.out.println("Enetr 1 to sort by color or 2 to sort by date");
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(obj.readLine());
		switch (i) {
		case 1:
			sortByColor(widgets);

			break;
		case 2:
			sortByDate(widgets);

			break;
		default:
			System.out.println("invalid input");
		}
	}

	public static List<Widget> sortByDate(List<Widget> widgets) {
		Collections.sort(widgets, new DateComparator());
		if (widgets.size() > 10) {
			List<Widget> limitedwidgets = widgets.subList(0, 10);
			return limitedwidgets;
		} else {
			return widgets;
		}
	}

	public static List<Widget> sortByColor(List<Widget> widgets) {
		Collections.sort(widgets, new ColorComparator());
		if (widgets.size() > 10) {
			List<Widget> limitedwidgets = widgets.subList(0, 10);
			return limitedwidgets;
		} else {
			return widgets;
		}
	}
}
