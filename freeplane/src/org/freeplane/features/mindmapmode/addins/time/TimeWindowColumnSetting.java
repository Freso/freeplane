package org.freeplane.features.mindmapmode.addins.time;

import org.freeplane.core.io.IXMLElement;
import org.freeplane.core.io.XMLElement;

class TimeWindowColumnSetting {
	static TimeWindowColumnSetting create(final IXMLElement xml) {
		final TimeWindowColumnSetting timeWindowColumnSetting = new TimeWindowColumnSetting();
		timeWindowColumnSetting.columnSorting = Integer.parseInt(xml.getAttribute("column_sorting",
		    null));
		timeWindowColumnSetting.columnWidth = Integer.parseInt(xml.getAttribute("column_width",
		    null));
		return timeWindowColumnSetting;
	}

	protected int columnSorting;
	protected int columnWidth;

	public int getColumnSorting() {
		return columnSorting;
	}

	public int getColumnWidth() {
		return columnWidth;
	}

	void marschall(final IXMLElement xml) {
		final IXMLElement child = new XMLElement("time_window_column_setting");
		child.setAttribute("column_sorting", Integer.toString(columnSorting));
		child.setAttribute("column_width", Integer.toString(columnWidth));
		xml.addChild(child);
	}

	public void setColumnSorting(final int columnSorting) {
		this.columnSorting = columnSorting;
	}

	public void setColumnWidth(final int columnWidth) {
		this.columnWidth = columnWidth;
	}
}
