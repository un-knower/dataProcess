package com.seven.spark;


import com.seven.spark.hbase.rowkey.RowKeyGenerator;
import com.seven.spark.hbase.rowkey.generator.HashRowKeyGenerator;
import org.apache.commons.lang.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class HelloJava {
    public static void main(String[] args) {
//        System.out.println(Double.parseDouble("6000.0"));
//
//        System.out.println(-5.2259676281485685E66 - Double.parseDouble("6000.0") > 0 ? false : true );
//
        System.out.println(StringUtils.isBlank(" "));
        System.out.println(StringUtils.isNotBlank(" "));
        System.out.println(StringUtils.isNotBlank(null));
        System.out.println(StringUtils.isNotEmpty(null));
//
//        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("d");
//        System.out.println(list.toString());

//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        SimpleDateFormat sdf1 = new SimpleDateFormat("D");
////        Date date = new Date();
//        try {
//
//            String aaa = sdf1.format(sdf.parse("2018-06-01"));
//            String aaa1 = sdf1.format(sdf.parse("2018-05-01"));
//            String aaa2 = sdf1.format(sdf.parse("2018-08-01"));
//            String aaa3 = sdf1.format(sdf.parse("2018-07-01"));
//            System.out.println(aaa);
//            System.out.println(aaa1);
//            System.out.println(aaa2);
//            System.out.println(aaa3);
//        }catch (Exception e){
//            System.out.println(e.getStackTrace());
//        }


//        System.out.println("2018-07".substring(0,4));
//        System.out.println(Double.parseDouble("1.081535E7"));
//
//        Calendar now = Calendar.getInstance();
//        System.out.println("年: " + now.get(Calendar.YEAR));
//        System.out.println("月: " + (now.get(Calendar.MONTH) + 1) + "");
//        System.out.println("日: " + now.get(Calendar.DAY_OF_MONTH));
//        System.out.println("时: " + now.get(Calendar.HOUR_OF_DAY));
//        System.out.println("分: " + now.get(Calendar.MINUTE));
//        System.out.println("秒: " + now.get(Calendar.SECOND));
//        System.out.println("当前时间毫秒数：" + now.getTimeInMillis());
//        System.out.println(now.getTime());
//
//
//        Date d = new Date();
//        System.out.println(d);
//        SimpleDateFormat sadf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String dateNowStr = sadf.format(d);
//        System.out.println(dateNowStr);
//
//        try {
//
//            System.out.println(getMouthDay("2018-06"));
//            System.out.println(getWeekDay("2018-07-18 00:00:00.0"));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//        Double[] doubles = {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
//        System.out.println(Arrays.asList(doubles).toString());
//
//        String sssss = "1#2,3,4";
//        System.out.println(sssss.replace("1,",""));
//        System.out.println(sssss.split("#").length);
//
//        System.out.println(Integer.parseInt("05"));
//        Date date=new Date();//取时间
//        System.out.println(getDay(date,-1));
//        System.out.println(getDay(date,0));
//        System.out.println(getDay(date,-2));
////        TreeMap<Integer,String> maptime = new TreeMap<Integer, String>();
////        maptime.put(11111,"ssss");
//////        maptime.put(null,"");
////        System.out.println(maptime.firstKey());
////        System.out.println("0".equals(null));
////
////        System.out.println("hello java");
//
////        Map<String,Double> orderMap = new HashMap<String, Double>();
////        orderMap.put("1",0.0.1);
////        orderMap.put("12",0.0.1);
////        orderMap.put("13",0.0.1);
////        orderMap.put("14",0.0.1);
////        orderMap.put("1",0.0.2);
////        orderMap.put("12",orderMap.get("12")+0.3);
////
////        Iterator iter = orderMap.entrySet().iterator();
////        while (iter.hasNext()) {
////            Map.Entry entry = (Map.Entry) iter.next();
////            Object key = entry.getKey();
////            Object val = entry.getValue();
////            System.out.println(key+":"+val);
////        }
//
//
////
////        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
////        Date starttime = new Date();
////        System.out.println(format2.format(starttime.getTime()));
//
//        SimpleDateFormat sdf2 = new SimpleDateFormat("D");
//
//        System.out.println(sdf2.format(new Date())+"---11111");
//
//
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//
//        System.out.println("2018-05-01".substring(5, 9));
//        try {
//            System.out.println(sdf2.format(sdf.parse("2018-05-01")));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("werty".contains("wer"));
//
//        String[] s = "3705,\"17栋D单元电梯出口旁 （龙岗可园）,940,7,1,500,500,5,5,3,bqlai,2018-03-20 09:24:18.0,bqlai,2018-03-20 09:24:18.0,,,0.0,DS_ZFJVEM_PRD,job_hsta_vem_point_community,point_community,20180613,2018-06-14 09:54:58.0".split(",");
//
//
//        System.out.println(s[16]);
////        System.out.println("2018-01-31".substring(0,7));
////        System.out.println("2018-01-31".length());
//////        long[] ls = new long[24];
//////
//////        ls[1] += 1;
//////        for(long l : ls){
//////            System.out.println(l);
//////        }
////
////
////        RowKeyGenerator rowKeyGenerator = new HashRowKeyGenerator();
////        byte[] bytes = rowKeyGenerator.generate("");
////        System.out.println(bytes.toString());
////        System.out.println(new String(bytes));
//
//        try {
//            System.out.println(getLastMouth("2018-01"));
//            System.out.println(getWeek("2018-01"));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }


    }

    private static String getLastMouth(String str) throws ParseException {
        SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM");
        Date sourceDate = sdf.parse(str);
        Calendar cal = Calendar.getInstance();
        cal.setTime(sourceDate);
        cal.add(Calendar.MONTH, -1);
        return sdf.format(cal.getTime());
    }

    private static String getWeek(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-w");
        Date sourceDate = sdf.parse(str);
        Calendar cal = Calendar.getInstance();
        cal.setTime(sourceDate);
        cal.add(Calendar.DAY_OF_WEEK, -7);
        return sdf.format(cal.getTime());
    }

    private static String getDay(Date date,int num){
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(calendar.MONTH,num);//把日期往后增加一天.整数往后推,负数往前移动
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        date=calendar.getTime(); //这个时间就是日期往后推一天的结果
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = formatter.format(date);
        return dateString;
    }

    private static int getWeekDay(String time) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
        Calendar cal = Calendar.getInstance();
        cal.setTime(sdf.parse(time));
        return cal.get(Calendar.DAY_OF_WEEK);
    }


    private static int getMouthDay(String time) throws ParseException {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, Integer.parseInt(time.split("-")[0]));
        cal.set(Calendar.MONTH,Integer.parseInt(time.split("-")[1]));
        return cal.getActualMaximum(Calendar.DATE);
    }


}
