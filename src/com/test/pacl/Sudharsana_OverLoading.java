package com.test.pacl;

public class Sudharsana_OverLoading {

	    private String formatNumber(int value) {
	        return String.format("%d", value);
	    }

	    private String formatNumber(double value) {
	        return String.format("%.3f", value);
	    }

	    private String formatNumber(String value) {
	        return String.format("%.2f", Double.parseDouble(value));
	    }

	    public static void main(String[] args) {
	        Sudharsana_OverLoading ol = new Sudharsana_OverLoading();
	        System.out.println(ol.formatNumber(500));
	        System.out.println(ol.formatNumber(90.123));
	        System.out.println(ol.formatNumber("750"));
	    }
	}

