package com.design.pattern.Behavioural.observer;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ObserverTest {
	public static void main(String[] args) throws IOException {
		
		Observer subscriber=new Subsciber("Naresh");
		Observer subscriber2=new Subsciber("Chotu");
		
		Subject channel=new YouTube();
		channel.subscribe(subscriber);
		channel.subscribe(subscriber2);
		
		channel.updates("Java Design Patterns");
		channel.updates("Java Spring boot profiles");
		
		System.out.println("........................");
		
		while(true) {
			System.out.println("Enter 1 for new updates");
			System.out.println("Enter 2 for add subscriber");
			System.out.println("Enter 3 for exit from application");
			System.out.println("Enter 4 for unsubscribe an user");
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			String readLine = br.readLine();
			int c = Integer.parseInt(readLine);
		
			if(c==1) {
				System.out.println("please Enter Updates Title");
				String update = br.readLine();
				channel.updates(update);
				
			}else if(c==2) {
				System.out.println("Enter Subscriber name");
				String name = br.readLine();
				Observer subscriber3=new Subsciber(name);
				channel.subscribe(subscriber3);
			}else if(c==3) {
				System.out.println("Thanks for using this application");
				
			}
			else if(c==4) {
				System.out.println("please enter subscriber name");
				String name = br.readLine();
				Observer sub4=new Subsciber(name);
			channel.unsubscribe(sub4);
			}
			
		}
		
		
		
		
		
		
		
		
	}

}
