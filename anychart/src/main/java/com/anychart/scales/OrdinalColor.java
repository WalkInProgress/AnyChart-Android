package com.anychart.scales;

import com.anychart.APIlib;

import java.util.Locale;

// class
/**
 * The OrdinalColor class contains methods for configuring Ordinal color scale.<br/>
<b>Note:</b> To create instance use {@link anychart.scales#ordinalColor} method.
 */
public class OrdinalColor extends Base {

    protected OrdinalColor() {

    }

    public static OrdinalColor instantiate() {
        return new OrdinalColor("new anychart.scales.ordinalColor()");
    }

    

    public OrdinalColor(String jsChart) {
        jsBase = "ordinalColor" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Returns value for passed color. Value is a middle of its range.
     */
    public void colorToValue(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".colorToValue(%s);", wrapQuotes(value)));
    }
    /**
     * Getter for the linear gradient for linear color scale.
     */
    public void colors() {
        APIlib.getInstance().addJSLine(jsBase + ".colors();");
    }
    /**
     * Setter for the linear gradient for linear color scale.
     */
    public com.anychart.scales.OrdinalColor colors(String[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".colors(%s);", arrayToStringWrapQuotes(value)));

        return this;
    }
    /**
     * Informs the scale that an auto-range calculation started for the chart in past was ended.
     */
    public void finishAutoCalc(Boolean silently) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".finishAutoCalc(%s);", silently));
    }
    /**
     * Returns range index relative passed value.
     */
    public void getIndexByValue(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getIndexByValue(%s);", value));
    }
    /**
     * Returns processed ranges.
     */
    public void getProcessedRanges() {
        APIlib.getInstance().addJSLine(jsBase + ".getProcessedRanges();");
    }
    /**
     * Returns range for passed value.
     */
    public void getRangeByValue(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getRangeByValue(%s);", value));
    }
    /**
     * Returns scale type.
     */
    public void getType() {
        APIlib.getInstance().addJSLine(jsBase + ".getType();");
    }
    /**
     * Returns tick value by its ratio position.
     */
    public void inverseTransform(Number ratio) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".inverseTransform(%s);", ratio));
    }
    /**
     * Getter for the scale inversion.
     */
    public void inverted() {
        APIlib.getInstance().addJSLine(jsBase + ".inverted();");
    }
    /**
     * Setter for the scale inversion.
     */
    public com.anychart.scales.OrdinalColor inverted(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".inverted(%s);", value));

        return this;
    }
    /**
     * Getter for scale names for data set.
     */
    public void names() {
        APIlib.getInstance().addJSLine(jsBase + ".names();");
    }
    /**
     * Setter for scale names for data set.
     */
    public com.anychart.scales.OrdinalColor names(String[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".names(%s);", arrayToStringWrapQuotes(value)));

        return this;
    }
    /**
     * Setter for scale names for data set.
     */
    public com.anychart.scales.OrdinalColor names(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".names(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the scale ranges.
     */
    public void ranges() {
        APIlib.getInstance().addJSLine(jsBase + ".ranges();");
    }
    /**
     * Setter for the scale ranges.
     */
    public com.anychart.scales.OrdinalColor ranges(String[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".ranges(%s);", arrayToStringWrapQuotes(value)));

        return this;
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    /**
     * Informs scale that an auto-range calculation started for the chart, so it should reset its data range on the first
call of this method if needed.
     */
    public com.anychart.scales.OrdinalColor startAutoCalc() {
        APIlib.getInstance().addJSLine(jsBase + ".startAutoCalc();");

        return this;
    }
    /**
     * Getter for the set of scale ticks in terms of data values.
     */
    public com.anychart.scales.OrdinalTicks ticks() {
        return new com.anychart.scales.OrdinalTicks(jsBase + ".ticks()");
    }
    /**
     * Setter for the set of scale ticks in terms of data values.
     */
    public com.anychart.scales.OrdinalColor ticks(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".ticks(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the set of scale ticks in terms of data values.
     */
    public com.anychart.scales.OrdinalColor ticks(String[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".ticks(%s);", arrayToStringWrapQuotes(value)));

        return this;
    }
    /**
     * Returns tick position ratio by its value.
     */
    public void transform(String value, Number subRangeRatio) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".transform(%s, %s);", wrapQuotes(value), subRangeRatio));
    }
    public void setOnClickListener(com.anychart.chart.common.listener.ListenersInterface.OnClickListener listener) {
        StringBuilder js = new StringBuilder();

        js.append(jsBase).append(".listen('pointClick', function(e) {");

        if (listener.getFields() != null) {
            js.append("var result = ");
            for (String field : listener.getFields()) {
                js.append(String.format(Locale.US, "'%1$s' + ':' + e.point.get('%1$s') + ',' +", field));
            }
            js.setLength(js.length() - 8);
            js.append(";");

            js.append("android.onClick(result);");
        } else {
            js.append("android.onClick(null);");
        }
        js.append("});");

        com.anychart.chart.common.listener.ListenersInterface.getInstance().setOnClickListener(listener);

        APIlib.getInstance().addJSLine(js.toString());
    }
    /**
     * Removes an event listener which was added with listen() by the key returned by listen() or listenOnce().
     */
    public void unlistenByKey(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", wrapQuotes(key)));
    }
    /**
     * Converts value to color. Returns color relative to passed value.
     */
    public void valueToColor(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".valueToColor(%s);", value));
    }

}