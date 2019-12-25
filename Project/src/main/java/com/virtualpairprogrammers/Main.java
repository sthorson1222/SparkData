package com.virtualpairprogrammers;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class Main {
	
	public static void main(String[] args) {
		
		
		List<Double> inputData = new ArrayList<>();
		inputData.add(35.2);
		inputData.add(234.344);
		inputData.add(232.434);
		inputData.add(2323.232);
		
		Logger.getLogger("org.apache").setLevel(Level.WARN);
		
	
	// RDD Resiliant distributed data 
	
	SparkConf conf = new SparkConf().setAppName("startingSpark").setMaster("local[*]");
	JavaSparkContext sc = new JavaSparkContext(conf);
	JavaRDD<Double> myRDD = sc.parallelize(inputData);
	
	sc.close();

	
	
	}

}
