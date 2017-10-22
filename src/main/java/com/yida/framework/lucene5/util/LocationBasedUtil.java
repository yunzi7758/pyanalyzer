package com.yida.framework.lucene5.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 地理位置计算工具类
 * @author Lanxiaowei
 *
 */
public class LocationBasedUtil {
	public static double getDistance(double longitude1, double latitude1, double longitude2, double latitude2) {
        double radLatitude1 = rad(latitude1);
        double radLatitude2 = rad(latitude2);
        double a = radLatitude1 - radLatitude2;
        double b = rad(longitude1) - rad(longitude2);

        double distance = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2) + Math.cos(radLatitude1) * Math.cos(radLatitude2)
                * Math.pow(Math.sin(b / 2), 2)));

        return distance * 6378.137;
    }

    private static double rad(double value) {
        return value * Math.PI / 180.0;
    }

    public static int getRoundDistance(double distance) {
        int roundDistance = ((int) Math.round(distance * 10)) + 1;
        if (roundDistance > 10 && roundDistance % 10 != 0) {
            roundDistance = (roundDistance / 10) * 10;
        }
        return roundDistance > 50 ? 50 : roundDistance;
    }

    public static double getLowerLatitude(double latitude) {
        return latitude - METER_10000_LATITUDE;
    }

    public static double getUpperLatitude(double latitude) {
        return latitude + METER_10000_LATITUDE;
    }

    public static double getLowerLongitude(double longitude, double latitude) {
        latitude = latitude < 0.0 ? latitude * -1.0 : latitude;
        Double longitudeReference = LONGITUDE_REFER_10000.get(String.valueOf((int) latitude));
        return longitude - longitudeReference;
    }

    public static double getUpperLongitude(double longitude, double latitude) {
        latitude = latitude < 0.0 ? latitude * -1.0 : latitude;
        double longitudeReference = LONGITUDE_REFER_10000.get(String.valueOf((int) latitude));
        return longitude + longitudeReference;
    }

    private static final Map<String, Double> LONGITUDE_REFER_10000 = new HashMap<String, Double>();
    private static double METER_10000_LATITUDE = 0.0898316;

    private static double METER_10000_LATITUDE_0_LONGITUDE = 0.0898316;
    private static double METER_10000_LATITUDE_1_LONGITUDE = 0.0898453;
    private static double METER_10000_LATITUDE_2_LONGITUDE = 0.0898863;
    private static double METER_10000_LATITUDE_3_LONGITUDE = 0.0899549;
    private static double METER_10000_LATITUDE_4_LONGITUDE = 0.0900509;
    private static double METER_10000_LATITUDE_5_LONGITUDE = 0.0901747;
    private static double METER_10000_LATITUDE_6_LONGITUDE = 0.0903264;
    private static double METER_10000_LATITUDE_7_LONGITUDE = 0.0905062;
    private static double METER_10000_LATITUDE_8_LONGITUDE = 0.0907144;
    private static double METER_10000_LATITUDE_9_LONGITUDE = 0.0909513;
    private static double METER_10000_LATITUDE_10_LONGITUDE = 0.0912174;
    private static double METER_10000_LATITUDE_11_LONGITUDE = 0.0915129;
    private static double METER_10000_LATITUDE_12_LONGITUDE = 0.0918385;
    private static double METER_10000_LATITUDE_13_LONGITUDE = 0.0921945;
    private static double METER_10000_LATITUDE_14_LONGITUDE = 0.0925816;
    private static double METER_10000_LATITUDE_15_LONGITUDE = 0.0930005;
    private static double METER_10000_LATITUDE_16_LONGITUDE = 0.0934517;
    private static double METER_10000_LATITUDE_17_LONGITUDE = 0.0939361;
    private static double METER_10000_LATITUDE_18_LONGITUDE = 0.0944545;
    private static double METER_10000_LATITUDE_19_LONGITUDE = 0.0950077;
    private static double METER_10000_LATITUDE_20_LONGITUDE = 0.0955968;
    private static double METER_10000_LATITUDE_21_LONGITUDE = 0.0962226;
    private static double METER_10000_LATITUDE_22_LONGITUDE = 0.0968865;
    private static double METER_10000_LATITUDE_23_LONGITUDE = 0.0975895;
    private static double METER_10000_LATITUDE_24_LONGITUDE = 0.0983329;
    private static double METER_10000_LATITUDE_25_LONGITUDE = 0.0991182;
    private static double METER_10000_LATITUDE_26_LONGITUDE = 0.0999468;
    private static double METER_10000_LATITUDE_27_LONGITUDE = 0.1008203;
    private static double METER_10000_LATITUDE_28_LONGITUDE = 0.1017406;
    private static double METER_10000_LATITUDE_29_LONGITUDE = 0.1027093;
    private static double METER_10000_LATITUDE_30_LONGITUDE = 0.1037286;
    private static double METER_10000_LATITUDE_31_LONGITUDE = 0.1048005;
    private static double METER_10000_LATITUDE_32_LONGITUDE = 0.1059275;
    private static double METER_10000_LATITUDE_33_LONGITUDE = 0.1071119;
    private static double METER_10000_LATITUDE_34_LONGITUDE = 0.1083565;
    private static double METER_10000_LATITUDE_35_LONGITUDE = 0.1096641;
    private static double METER_10000_LATITUDE_36_LONGITUDE = 0.1110379;
    private static double METER_10000_LATITUDE_37_LONGITUDE = 0.1124813;
    private static double METER_10000_LATITUDE_38_LONGITUDE = 0.1139979;
    private static double METER_10000_LATITUDE_39_LONGITUDE = 0.1155916;
    private static double METER_10000_LATITUDE_40_LONGITUDE = 0.1172668;
    private static double METER_10000_LATITUDE_41_LONGITUDE = 0.1190280;
    private static double METER_10000_LATITUDE_42_LONGITUDE = 0.1208803;
    private static double METER_10000_LATITUDE_43_LONGITUDE = 0.1228292;
    private static double METER_10000_LATITUDE_44_LONGITUDE = 0.1248806;
    private static double METER_10000_LATITUDE_45_LONGITUDE = 0.1270410;
    private static double METER_10000_LATITUDE_46_LONGITUDE = 0.1293176;
    private static double METER_10000_LATITUDE_47_LONGITUDE = 0.1317182;
    private static double METER_10000_LATITUDE_48_LONGITUDE = 0.1342512;
    private static double METER_10000_LATITUDE_49_LONGITUDE = 0.1369261;
    private static double METER_10000_LATITUDE_50_LONGITUDE = 0.1397531;
    private static double METER_10000_LATITUDE_51_LONGITUDE = 0.1427438;
    private static double METER_10000_LATITUDE_52_LONGITUDE = 0.1459107;
    private static double METER_10000_LATITUDE_53_LONGITUDE = 0.1492678;
    private static double METER_10000_LATITUDE_54_LONGITUDE = 0.1528306;
    private static double METER_10000_LATITUDE_55_LONGITUDE = 0.1566166;
    private static double METER_10000_LATITUDE_56_LONGITUDE = 0.1606451;
    private static double METER_10000_LATITUDE_57_LONGITUDE = 0.1649378;
    private static double METER_10000_LATITUDE_58_LONGITUDE = 0.1695194;
    private static double METER_10000_LATITUDE_59_LONGITUDE = 0.1744174;
    private static double METER_10000_LATITUDE_60_LONGITUDE = 0.1796632;
    private static double METER_10000_LATITUDE_61_LONGITUDE = 0.1852925;
    private static double METER_10000_LATITUDE_62_LONGITUDE = 0.1913462;
    private static double METER_10000_LATITUDE_63_LONGITUDE = 0.1978711;
    private static double METER_10000_LATITUDE_64_LONGITUDE = 0.2049213;
    private static double METER_10000_LATITUDE_65_LONGITUDE = 0.2125597;
    private static double METER_10000_LATITUDE_66_LONGITUDE = 0.2208594;
    private static double METER_10000_LATITUDE_67_LONGITUDE = 0.2299064;
    private static double METER_10000_LATITUDE_68_LONGITUDE = 0.2398025;
    private static double METER_10000_LATITUDE_69_LONGITUDE = 0.2506686;
    private static double METER_10000_LATITUDE_70_LONGITUDE = 0.2626501;
    private static double METER_10000_LATITUDE_71_LONGITUDE = 0.2759226;
    private static double METER_10000_LATITUDE_72_LONGITUDE = 0.2907013;
    private static double METER_10000_LATITUDE_73_LONGITUDE = 0.3072515;
    private static double METER_10000_LATITUDE_74_LONGITUDE = 0.3259052;
    private static double METER_10000_LATITUDE_75_LONGITUDE = 0.3470829;
    private static double METER_10000_LATITUDE_76_LONGITUDE = 0.3713252;
    private static double METER_10000_LATITUDE_77_LONGITUDE = 0.3993389;
    private static double METER_10000_LATITUDE_78_LONGITUDE = 0.4320668;
    private static double METER_10000_LATITUDE_79_LONGITUDE = 0.4707943;
    private static double METER_10000_LATITUDE_80_LONGITUDE = 0.5173209;
    private static double METER_10000_LATITUDE_81_LONGITUDE = 0.5742462;
    private static double METER_10000_LATITUDE_82_LONGITUDE = 0.6454696;
    private static double METER_10000_LATITUDE_83_LONGITUDE = 0.7371185;
    private static double METER_10000_LATITUDE_84_LONGITUDE = 0.8594058;
    private static double METER_10000_LATITUDE_85_LONGITUDE = 1.0307150;
    private static double METER_10000_LATITUDE_86_LONGITUDE = 1.2878147;
    private static double METER_10000_LATITUDE_87_LONGITUDE = 1.7165041;
    private static double METER_10000_LATITUDE_88_LONGITUDE = 2.5742227;
    private static double METER_10000_LATITUDE_89_LONGITUDE = 5.1489607;

    static {
        LONGITUDE_REFER_10000.put("0", METER_10000_LATITUDE_0_LONGITUDE);
        LONGITUDE_REFER_10000.put("1", METER_10000_LATITUDE_1_LONGITUDE);
        LONGITUDE_REFER_10000.put("2", METER_10000_LATITUDE_2_LONGITUDE);
        LONGITUDE_REFER_10000.put("3", METER_10000_LATITUDE_3_LONGITUDE);
        LONGITUDE_REFER_10000.put("4", METER_10000_LATITUDE_4_LONGITUDE);
        LONGITUDE_REFER_10000.put("5", METER_10000_LATITUDE_5_LONGITUDE);
        LONGITUDE_REFER_10000.put("6", METER_10000_LATITUDE_6_LONGITUDE);
        LONGITUDE_REFER_10000.put("7", METER_10000_LATITUDE_7_LONGITUDE);
        LONGITUDE_REFER_10000.put("8", METER_10000_LATITUDE_8_LONGITUDE);
        LONGITUDE_REFER_10000.put("9", METER_10000_LATITUDE_9_LONGITUDE);
        LONGITUDE_REFER_10000.put("10", METER_10000_LATITUDE_10_LONGITUDE);
        LONGITUDE_REFER_10000.put("11", METER_10000_LATITUDE_11_LONGITUDE);
        LONGITUDE_REFER_10000.put("12", METER_10000_LATITUDE_12_LONGITUDE);
        LONGITUDE_REFER_10000.put("13", METER_10000_LATITUDE_13_LONGITUDE);
        LONGITUDE_REFER_10000.put("14", METER_10000_LATITUDE_14_LONGITUDE);
        LONGITUDE_REFER_10000.put("15", METER_10000_LATITUDE_15_LONGITUDE);
        LONGITUDE_REFER_10000.put("16", METER_10000_LATITUDE_16_LONGITUDE);
        LONGITUDE_REFER_10000.put("17", METER_10000_LATITUDE_17_LONGITUDE);
        LONGITUDE_REFER_10000.put("18", METER_10000_LATITUDE_18_LONGITUDE);
        LONGITUDE_REFER_10000.put("19", METER_10000_LATITUDE_19_LONGITUDE);
        LONGITUDE_REFER_10000.put("20", METER_10000_LATITUDE_20_LONGITUDE);
        LONGITUDE_REFER_10000.put("21", METER_10000_LATITUDE_21_LONGITUDE);
        LONGITUDE_REFER_10000.put("22", METER_10000_LATITUDE_22_LONGITUDE);
        LONGITUDE_REFER_10000.put("23", METER_10000_LATITUDE_23_LONGITUDE);
        LONGITUDE_REFER_10000.put("24", METER_10000_LATITUDE_24_LONGITUDE);
        LONGITUDE_REFER_10000.put("25", METER_10000_LATITUDE_25_LONGITUDE);
        LONGITUDE_REFER_10000.put("26", METER_10000_LATITUDE_26_LONGITUDE);
        LONGITUDE_REFER_10000.put("27", METER_10000_LATITUDE_27_LONGITUDE);
        LONGITUDE_REFER_10000.put("28", METER_10000_LATITUDE_28_LONGITUDE);
        LONGITUDE_REFER_10000.put("29", METER_10000_LATITUDE_29_LONGITUDE);
        LONGITUDE_REFER_10000.put("30", METER_10000_LATITUDE_30_LONGITUDE);
        LONGITUDE_REFER_10000.put("31", METER_10000_LATITUDE_31_LONGITUDE);
        LONGITUDE_REFER_10000.put("32", METER_10000_LATITUDE_32_LONGITUDE);
        LONGITUDE_REFER_10000.put("33", METER_10000_LATITUDE_33_LONGITUDE);
        LONGITUDE_REFER_10000.put("34", METER_10000_LATITUDE_34_LONGITUDE);
        LONGITUDE_REFER_10000.put("35", METER_10000_LATITUDE_35_LONGITUDE);
        LONGITUDE_REFER_10000.put("36", METER_10000_LATITUDE_36_LONGITUDE);
        LONGITUDE_REFER_10000.put("37", METER_10000_LATITUDE_37_LONGITUDE);
        LONGITUDE_REFER_10000.put("38", METER_10000_LATITUDE_38_LONGITUDE);
        LONGITUDE_REFER_10000.put("39", METER_10000_LATITUDE_39_LONGITUDE);
        LONGITUDE_REFER_10000.put("40", METER_10000_LATITUDE_40_LONGITUDE);
        LONGITUDE_REFER_10000.put("41", METER_10000_LATITUDE_41_LONGITUDE);
        LONGITUDE_REFER_10000.put("42", METER_10000_LATITUDE_42_LONGITUDE);
        LONGITUDE_REFER_10000.put("43", METER_10000_LATITUDE_43_LONGITUDE);
        LONGITUDE_REFER_10000.put("44", METER_10000_LATITUDE_44_LONGITUDE);
        LONGITUDE_REFER_10000.put("45", METER_10000_LATITUDE_45_LONGITUDE);
        LONGITUDE_REFER_10000.put("46", METER_10000_LATITUDE_46_LONGITUDE);
        LONGITUDE_REFER_10000.put("47", METER_10000_LATITUDE_47_LONGITUDE);
        LONGITUDE_REFER_10000.put("48", METER_10000_LATITUDE_48_LONGITUDE);
        LONGITUDE_REFER_10000.put("49", METER_10000_LATITUDE_49_LONGITUDE);
        LONGITUDE_REFER_10000.put("50", METER_10000_LATITUDE_50_LONGITUDE);
        LONGITUDE_REFER_10000.put("51", METER_10000_LATITUDE_51_LONGITUDE);
        LONGITUDE_REFER_10000.put("52", METER_10000_LATITUDE_52_LONGITUDE);
        LONGITUDE_REFER_10000.put("53", METER_10000_LATITUDE_53_LONGITUDE);
        LONGITUDE_REFER_10000.put("54", METER_10000_LATITUDE_54_LONGITUDE);
        LONGITUDE_REFER_10000.put("55", METER_10000_LATITUDE_55_LONGITUDE);
        LONGITUDE_REFER_10000.put("56", METER_10000_LATITUDE_56_LONGITUDE);
        LONGITUDE_REFER_10000.put("57", METER_10000_LATITUDE_57_LONGITUDE);
        LONGITUDE_REFER_10000.put("58", METER_10000_LATITUDE_58_LONGITUDE);
        LONGITUDE_REFER_10000.put("59", METER_10000_LATITUDE_59_LONGITUDE);
        LONGITUDE_REFER_10000.put("60", METER_10000_LATITUDE_60_LONGITUDE);
        LONGITUDE_REFER_10000.put("61", METER_10000_LATITUDE_61_LONGITUDE);
        LONGITUDE_REFER_10000.put("62", METER_10000_LATITUDE_62_LONGITUDE);
        LONGITUDE_REFER_10000.put("63", METER_10000_LATITUDE_63_LONGITUDE);
        LONGITUDE_REFER_10000.put("64", METER_10000_LATITUDE_64_LONGITUDE);
        LONGITUDE_REFER_10000.put("65", METER_10000_LATITUDE_65_LONGITUDE);
        LONGITUDE_REFER_10000.put("66", METER_10000_LATITUDE_66_LONGITUDE);
        LONGITUDE_REFER_10000.put("67", METER_10000_LATITUDE_67_LONGITUDE);
        LONGITUDE_REFER_10000.put("68", METER_10000_LATITUDE_68_LONGITUDE);
        LONGITUDE_REFER_10000.put("69", METER_10000_LATITUDE_69_LONGITUDE);
        LONGITUDE_REFER_10000.put("70", METER_10000_LATITUDE_70_LONGITUDE);
        LONGITUDE_REFER_10000.put("71", METER_10000_LATITUDE_71_LONGITUDE);
        LONGITUDE_REFER_10000.put("72", METER_10000_LATITUDE_72_LONGITUDE);
        LONGITUDE_REFER_10000.put("73", METER_10000_LATITUDE_73_LONGITUDE);
        LONGITUDE_REFER_10000.put("74", METER_10000_LATITUDE_74_LONGITUDE);
        LONGITUDE_REFER_10000.put("75", METER_10000_LATITUDE_75_LONGITUDE);
        LONGITUDE_REFER_10000.put("76", METER_10000_LATITUDE_76_LONGITUDE);
        LONGITUDE_REFER_10000.put("77", METER_10000_LATITUDE_77_LONGITUDE);
        LONGITUDE_REFER_10000.put("78", METER_10000_LATITUDE_78_LONGITUDE);
        LONGITUDE_REFER_10000.put("79", METER_10000_LATITUDE_79_LONGITUDE);
        LONGITUDE_REFER_10000.put("80", METER_10000_LATITUDE_80_LONGITUDE);
        LONGITUDE_REFER_10000.put("81", METER_10000_LATITUDE_81_LONGITUDE);
        LONGITUDE_REFER_10000.put("82", METER_10000_LATITUDE_82_LONGITUDE);
        LONGITUDE_REFER_10000.put("83", METER_10000_LATITUDE_83_LONGITUDE);
        LONGITUDE_REFER_10000.put("84", METER_10000_LATITUDE_84_LONGITUDE);
        LONGITUDE_REFER_10000.put("85", METER_10000_LATITUDE_85_LONGITUDE);
        LONGITUDE_REFER_10000.put("86", METER_10000_LATITUDE_86_LONGITUDE);
        LONGITUDE_REFER_10000.put("87", METER_10000_LATITUDE_87_LONGITUDE);
        LONGITUDE_REFER_10000.put("88", METER_10000_LATITUDE_88_LONGITUDE);
        LONGITUDE_REFER_10000.put("89", METER_10000_LATITUDE_89_LONGITUDE);
    }
}
