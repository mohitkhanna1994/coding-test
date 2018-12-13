package com.monsanto.mbt;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ShipmentTest {

	@Test
	public void testShipment_Sorted_By_Color() {

		List<Widget> widgets = new ArrayList<Widget>();
		widgets.add(new Widget(1, "Blue", WidgetUtils.stringToDateConverter("02-03-2007")));
		widgets.add(new Widget(2, "Blue", WidgetUtils.stringToDateConverter("06-02-2016")));
		widgets.add(new Widget(3, "Blue", WidgetUtils.stringToDateConverter("08-02-2009")));
		widgets.add(new Widget(4, "Blue", WidgetUtils.stringToDateConverter("01-03-2013")));
		widgets.add(new Widget(5, "Blue", WidgetUtils.stringToDateConverter("01-05-2017")));
		widgets.add(new Widget(6, "Blue", WidgetUtils.stringToDateConverter("02-13-2007")));
		widgets.add(new Widget(7, "Blue", WidgetUtils.stringToDateConverter("04-01-2009")));
		widgets.add(new Widget(8, "Green", WidgetUtils.stringToDateConverter("05-07-2011")));
		widgets.add(new Widget(9, "Green", WidgetUtils.stringToDateConverter("07-01-2008")));
		widgets.add(new Widget(10, "Green", WidgetUtils.stringToDateConverter("02-01-2015")));
		assertEquals(widgets, Shipment.sortByColor(WidgetUtils.getSampleWidgets()));
	}

	@Test
	public void testShipment_Sorted_By_Date() {
		List<Widget> widgets = new ArrayList<Widget>();
		widgets.add(new Widget(9, "Red", WidgetUtils.stringToDateConverter("09-01-2005")));
		widgets.add(new Widget(19, "Red", WidgetUtils.stringToDateConverter("09-01-2005")));
		widgets.add(new Widget(1, "Red", WidgetUtils.stringToDateConverter("01-01-2006")));
		widgets.add(new Widget(21, "Red", WidgetUtils.stringToDateConverter("01-12-2006")));
		widgets.add(new Widget(3, "Red", WidgetUtils.stringToDateConverter("03-09-2006")));
		widgets.add(new Widget(23, "Red", WidgetUtils.stringToDateConverter("03-14-2006")));
		widgets.add(new Widget(2, "Blue", WidgetUtils.stringToDateConverter("02-03-2007")));
		widgets.add(new Widget(22, "Blue", WidgetUtils.stringToDateConverter("02-13-2007")));
		widgets.add(new Widget(7, "Green", WidgetUtils.stringToDateConverter("07-01-2008")));
		widgets.add(new Widget(17, "Red", WidgetUtils.stringToDateConverter("07-01-2008")));
		assertEquals(widgets, Shipment.sortByDate(WidgetUtils.getSampleWidgets()));
	}

}
