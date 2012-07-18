package com.mangrove.core;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //Example 1
        Set<String> set = new TreeSet<String>();
        set.add("2");
  
        set.add("1");
        showTreeSet(set);
        
    
        
        //Example 2
        Queue<String>q = new LinkedList<String>();
        q.add("Veronica");
        q.add("Wallace");
        q.add("Duncan");
        
        
        showAll(q);
        
        //chap 6 question 1
        System.out.println("----------");
        String[] list =  {"\\d*", "ab3456e666f"};
        chap6Question1(list);
        
    }
    public static final String EXAMPLE_TEST = "This is my small example string which I'm going to use for pattern matching.";

    public static void chap6Question1(String [] args){
    	Pattern p = Pattern.compile(args[0]);
    	Matcher m = p.matcher(args[1]);
    	boolean b = false;
    	while(m.find()){
    		System.out.println("start: "+m.start() + " group: " +m.group()+ " end: "+m.end() );
    	}
    	
    	
    	Pattern pattern = Pattern.compile("\\w+");
		// In case you would like to ignore case sensitivity you could use this
		// statement
		// Pattern pattern = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(EXAMPLE_TEST);
		// Check all occurance
		while (matcher.find()) {
			System.out.print("Start index: " + matcher.start());
			System.out.print(" End index: " + matcher.end() + " ");
			System.out.println(matcher.group());
		}
		// Now create a new pattern and matcher to replace whitespace with tabs
		Pattern replace = Pattern.compile("\\s+");
		Matcher matcher2 = replace.matcher(EXAMPLE_TEST);
		System.out.println(matcher2.replaceAll("\t"));
    }
    
    public static void showAll(Queue q ){
    	q.add(new Integer(42));
    	while(!q.isEmpty())
    		System.out.print(q.remove() + " ");
    }
    public static void showTreeSet(Set set){
       // set.add(new Integer(3));
        Iterator it = set.iterator();
        while(it.hasNext()){
        	System.out.println(it.next() + " ");
        }
    }
}
