package com.helper.constants;

public final class FrameworkConstants {

    private FrameworkConstants(){}
    private static final String REPORTER_FILE_PATH="test-outputs/reporter.html";
    private static final String EXCEL_FILE_PATH=System.getProperty("user.dir")+"/src/main/resources/Book1.xlsx";

    public static String getReporterFilePath() {
        return REPORTER_FILE_PATH;
    }

    public static String getExcelFilePath() {
        return EXCEL_FILE_PATH;
    }
}
