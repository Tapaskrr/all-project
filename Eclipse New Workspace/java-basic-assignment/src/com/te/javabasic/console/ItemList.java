package com.te.javabasic.console;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ItemList {

    Map<String, String> foodList = Stream.of(new String[][]{
        {"IDLY", "20"}, {"DOSA", "40"}, {"RICE", "30"}
                    }).collect(Collectors.toMap(p -> p[0], p -> p[1]));
	

	
	  
	

}
